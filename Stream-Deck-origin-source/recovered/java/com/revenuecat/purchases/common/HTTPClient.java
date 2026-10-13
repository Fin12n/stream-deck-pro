package com.revenuecat.purchases.common;

import C6.o;
import C6.v;
import D6.M;
import I0.mIk.efuWFSeiT;
import N6.g;
import Z6.w;
import android.os.Build;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPRequest;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.MapConverter;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.common.verification.SignatureVerificationException;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.interfaces.StorefrontProvider;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class HTTPClient {
    public static final Companion Companion = new Companion(null);
    public static final int NO_STATUS_CODE = -1;
    private final AppConfig appConfig;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final ETagManager eTagManager;
    private final MapConverter mapConverter;
    private final SigningManager signingManager;
    private final StorefrontProvider storefrontProvider;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.AMAZON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HTTPClient(AppConfig appConfig, ETagManager eTagManager, DiagnosticsTracker diagnosticsTracker, SigningManager signingManager, StorefrontProvider storefrontProvider, DateProvider dateProvider, MapConverter mapConverter) {
        t.g(appConfig, "appConfig");
        t.g(eTagManager, "eTagManager");
        t.g(signingManager, "signingManager");
        t.g(storefrontProvider, "storefrontProvider");
        t.g(dateProvider, "dateProvider");
        t.g(mapConverter, "mapConverter");
        this.appConfig = appConfig;
        this.eTagManager = eTagManager;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.signingManager = signingManager;
        this.storefrontProvider = storefrontProvider;
        this.dateProvider = dateProvider;
        this.mapConverter = mapConverter;
    }

    private final BufferedReader buffer(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    private final HttpURLConnection getConnection(HTTPRequest hTTPRequest) throws IOException {
        URLConnection uRLConnectionOpenConnection = hTTPRequest.getFullURL().openConnection();
        t.e(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        for (Map.Entry<String, String> entry : hTTPRequest.getHeaders().entrySet()) {
            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
        }
        JSONObject body = hTTPRequest.getBody();
        if (body != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            OutputStream os = httpURLConnection.getOutputStream();
            t.f(os, "os");
            BufferedWriter bufferedWriterBuffer = buffer(os);
            String string = body.toString();
            t.f(string, "body.toString()");
            writeFully(bufferedWriterBuffer, string);
        }
        return httpURLConnection;
    }

    private final String getETagHeader(URLConnection uRLConnection) {
        return uRLConnection.getHeaderField("X-RevenueCat-ETag");
    }

    private final InputStream getInputStream(HttpURLConnection httpURLConnection) throws Exception {
        try {
            return httpURLConnection.getInputStream();
        } catch (Exception e8) {
            if (!(e8 instanceof IllegalArgumentException ? true : e8 instanceof IOException)) {
                throw e8;
            }
            LogIntent logIntent = LogIntent.WARNING;
            String str = String.format(NetworkStrings.PROBLEM_CONNECTING, Arrays.copyOf(new Object[]{e8.getMessage()}, 1));
            t.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            return httpURLConnection.getErrorStream();
        }
    }

    private final Date getRequestDateHeader(URLConnection uRLConnection) {
        String requestTimeHeader = getRequestTimeHeader(uRLConnection);
        if (requestTimeHeader != null) {
            return new Date(Long.parseLong(requestTimeHeader));
        }
        return null;
    }

    private final String getRequestTimeHeader(URLConnection uRLConnection) {
        String headerField = uRLConnection.getHeaderField(HTTPResult.REQUEST_TIME_HEADER_NAME);
        if (headerField == null || w.b0(headerField)) {
            return null;
        }
        return headerField;
    }

    private final String getXPlatformHeader() {
        return WhenMappings.$EnumSwitchMapping$0[this.appConfig.getStore().ordinal()] == 1 ? "amazon" : "android";
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    private final HTTPResult performCall(URL url, Endpoint endpoint, Map<String, ? extends Object> map, List<o> list, Map<String, String> map2, boolean z8) throws Exception {
        String postParamsForSigningHeaderIfNeeded;
        JSONObject jSONObjectConvertToJSON$purchases_defaultsRelease = map != null ? this.mapConverter.convertToJSON$purchases_defaultsRelease(map) : null;
        String path = endpoint.getPath();
        String str = "/v1" + path;
        boolean zShouldVerifyEndpoint = this.signingManager.shouldVerifyEndpoint(endpoint);
        boolean z9 = zShouldVerifyEndpoint && endpoint.getNeedsNonceToPerformSigning();
        try {
            URL url2 = new URL(url, str);
            String strCreateRandomNonce = z9 ? this.signingManager.createRandomNonce() : null;
            if (list == null) {
                postParamsForSigningHeaderIfNeeded = null;
            } else {
                if ((zShouldVerifyEndpoint ? list : null) != null) {
                    postParamsForSigningHeaderIfNeeded = this.signingManager.getPostParamsForSigningHeaderIfNeeded(endpoint, list);
                } else {
                    postParamsForSigningHeaderIfNeeded = null;
                }
            }
            Map<String, String> headers = getHeaders(map2, str, z8, strCreateRandomNonce, zShouldVerifyEndpoint, postParamsForSigningHeaderIfNeeded);
            String str2 = postParamsForSigningHeaderIfNeeded;
            HttpURLConnection connection = getConnection(new HTTPRequest(url2, headers, jSONObjectConvertToJSON$purchases_defaultsRelease));
            InputStream inputStream = getInputStream(connection);
            try {
                String str3 = String.format(NetworkStrings.API_REQUEST_STARTED, Arrays.copyOf(new Object[]{connection.getRequestMethod(), path}, 2));
                t.f(str3, "format(this, *args)");
                LogUtilsKt.debugLog(str3);
                int responseCode = connection.getResponseCode();
                String fully = inputStream != null ? readFully(inputStream) : null;
                if (inputStream != null) {
                    inputStream.close();
                }
                connection.disconnect();
                String str4 = String.format(NetworkStrings.API_REQUEST_COMPLETED, Arrays.copyOf(new Object[]{connection.getRequestMethod(), path, Integer.valueOf(responseCode)}, 3));
                t.f(str4, "format(this, *args)");
                LogUtilsKt.debugLog(str4);
                if (fully == null) {
                    throw new IOException(NetworkStrings.HTTP_RESPONSE_PAYLOAD_NULL);
                }
                VerificationResult verificationResultVerifyResponse = (zShouldVerifyEndpoint && RCHTTPStatusCodes.INSTANCE.isSuccessful(responseCode)) ? verifyResponse(str, connection, fully, strCreateRandomNonce, str2) : VerificationResult.NOT_REQUESTED;
                if (verificationResultVerifyResponse == VerificationResult.FAILED && (this.signingManager.getSignatureVerificationMode() instanceof SignatureVerificationMode.Enforced)) {
                    throw new SignatureVerificationException(path);
                }
                return this.eTagManager.getHTTPResultFromCacheOrBackend$purchases_defaultsRelease(responseCode, fully, getETagHeader(connection), str, z8, getRequestDateHeader(connection), verificationResultVerifyResponse);
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                connection.disconnect();
                throw th;
            }
        } catch (MalformedURLException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static /* synthetic */ HTTPResult performRequest$default(HTTPClient hTTPClient, URL url, Endpoint endpoint, Map map, List list, Map map2, boolean z8, int i8, Object obj) {
        if ((i8 & 32) != 0) {
            z8 = false;
        }
        return hTTPClient.performRequest(url, endpoint, map, list, map2, z8);
    }

    private final String readFully(InputStream inputStream) {
        return g.d(buffer(inputStream));
    }

    private final void trackHttpRequestPerformedIfNeeded(Endpoint endpoint, Date date, boolean z8, HTTPResult hTTPResult) {
        int responseCode;
        VerificationResult verificationResult;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            long jBetween = DurationExtensionsKt.between(p008a7.a.f13446b, date, this.dateProvider.getNow());
            if (z8) {
                responseCode = hTTPResult != null ? hTTPResult.getResponseCode() : RCHTTPStatusCodes.NOT_MODIFIED;
            } else {
                responseCode = -1;
            }
            int i8 = responseCode;
            HTTPResult.Origin origin = hTTPResult != null ? hTTPResult.getOrigin() : null;
            if (hTTPResult == null || (verificationResult = hTTPResult.getVerificationResult()) == null) {
                verificationResult = VerificationResult.NOT_REQUESTED;
            }
            diagnosticsTracker.m166trackHttpRequestPerformedNcHsxvU(endpoint, jBetween, z8 && RCHTTPStatusCodes.INSTANCE.isSuccessful(i8), i8, origin, verificationResult);
        }
    }

    private final VerificationResult verifyResponse(String str, URLConnection uRLConnection, String str2, String str3, String str4) {
        return this.signingManager.verifyResponse(str, uRLConnection.getHeaderField(HTTPResult.SIGNATURE_HEADER_NAME), str3, str2, getRequestTimeHeader(uRLConnection), getETagHeader(uRLConnection), str4);
    }

    private final void writeFully(BufferedWriter bufferedWriter, String str) throws IOException {
        bufferedWriter.write(str);
        bufferedWriter.flush();
    }

    public final void clearCaches() {
        this.eTagManager.clearCaches$purchases_defaultsRelease();
    }

    public final SigningManager getSigningManager() {
        return this.signingManager;
    }

    public final HTTPResult performRequest(URL baseURL, Endpoint endpoint, Map<String, ? extends Object> map, List<o> list, Map<String, String> requestHeaders, boolean z8) {
        t.g(baseURL, "baseURL");
        t.g(endpoint, "endpoint");
        t.g(requestHeaders, "requestHeaders");
        if (this.appConfig.getForceServerErrors()) {
            LogUtilsKt.warnLog("Forcing server error for request to " + endpoint.getPath());
            return new HTTPResult(500, "", HTTPResult.Origin.BACKEND, null, VerificationResult.NOT_REQUESTED);
        }
        Date now = this.dateProvider.getNow();
        try {
            HTTPResult hTTPResultPerformCall = performCall(baseURL, endpoint, map, list, requestHeaders, z8);
            trackHttpRequestPerformedIfNeeded(endpoint, now, true, hTTPResultPerformCall);
            if (hTTPResultPerformCall != null) {
                return hTTPResultPerformCall;
            }
            LogWrapperKt.log(LogIntent.WARNING, NetworkStrings.ETAG_RETRYING_CALL);
            return performRequest(baseURL, endpoint, map, list, requestHeaders, true);
        } catch (Throwable th) {
            trackHttpRequestPerformedIfNeeded(endpoint, now, false, null);
            throw th;
        }
    }

    private final BufferedWriter buffer(OutputStream outputStream) {
        return new BufferedWriter(new OutputStreamWriter(outputStream));
    }

    private final Map<String, String> getHeaders(Map<String, String> map, String str, boolean z8, String str2, boolean z9, String str3) {
        o oVarA = v.a("Content-Type", efuWFSeiT.NzvryYKBL);
        o oVarA2 = v.a("X-Platform", getXPlatformHeader());
        o oVarA3 = v.a("X-Platform-Flavor", this.appConfig.getPlatformInfo().getFlavor());
        o oVarA4 = v.a("X-Platform-Flavor-Version", this.appConfig.getPlatformInfo().getVersion());
        o oVarA5 = v.a("X-Platform-Version", String.valueOf(Build.VERSION.SDK_INT));
        o oVarA6 = v.a("X-Version", "8.1.0");
        o oVarA7 = v.a("X-Client-Locale", this.appConfig.getLanguageTag());
        o oVarA8 = v.a("X-Client-Version", this.appConfig.getVersionName());
        o oVarA9 = v.a("X-Client-Bundle-ID", this.appConfig.getPackageName());
        boolean finishTransactions = this.appConfig.getFinishTransactions();
        String str4 = com.amazon.a.a.o.b.af;
        o oVarA10 = v.a("X-Observer-Mode-Enabled", finishTransactions ? com.amazon.a.a.o.b.ag : com.amazon.a.a.o.b.af);
        o oVarA11 = v.a("X-Nonce", str2);
        o oVarA12 = v.a(HTTPRequest.POST_PARAMS_HASH, str3);
        if (!this.appConfig.getCustomEntitlementComputation()) {
            str4 = null;
        }
        return MapExtensionsKt.filterNotNullValues(M.n(M.n(M.j(oVarA, oVarA2, oVarA3, oVarA4, oVarA5, oVarA6, oVarA7, oVarA8, oVarA9, oVarA10, oVarA11, oVarA12, v.a("X-Custom-Entitlements-Computation", str4), v.a("X-Storefront", this.storefrontProvider.getStorefront())), map), this.eTagManager.getETagHeaders$purchases_defaultsRelease(str, z9, z8)));
    }

    public /* synthetic */ HTTPClient(AppConfig appConfig, ETagManager eTagManager, DiagnosticsTracker diagnosticsTracker, SigningManager signingManager, StorefrontProvider storefrontProvider, DateProvider dateProvider, MapConverter mapConverter, int i8, AbstractC2633k abstractC2633k) {
        this(appConfig, eTagManager, diagnosticsTracker, signingManager, storefrontProvider, (i8 & 32) != 0 ? new DefaultDateProvider() : dateProvider, (i8 & 64) != 0 ? new MapConverter() : mapConverter);
    }
}
