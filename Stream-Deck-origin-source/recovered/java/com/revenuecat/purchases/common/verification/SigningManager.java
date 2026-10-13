package com.revenuecat.purchases.common.verification;

import C6.G;
import C6.m;
import C6.o;
import D6.C0933m;
import D6.C0938s;
import D6.r;
import D6.z;
import Z6.c;
import Z6.w;
import android.util.Base64;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.Result;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class SigningManager {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int NONCE_BYTES_SIZE = 12;

    @Deprecated
    public static final String POST_PARAMS_ALGORITHM = "sha256";

    @Deprecated
    public static final byte POST_PARAMS_SEPARATOR = 0;
    private final String apiKey;
    private final AppConfig appConfig;
    private final SignatureVerificationMode signatureVerificationMode;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Parameters {
        private final String apiKey;
        private final String body;
        private final String eTag;
        private final String nonce;
        private final String postParamsHashHeader;
        private final String requestTime;
        private final byte[] salt;
        private final String urlPath;

        public Parameters(byte[] salt, String apiKey, String str, String urlPath, String str2, String requestTime, String str3, String str4) {
            t.g(salt, "salt");
            t.g(apiKey, "apiKey");
            t.g(urlPath, "urlPath");
            t.g(requestTime, "requestTime");
            this.salt = salt;
            this.apiKey = apiKey;
            this.nonce = str;
            this.urlPath = urlPath;
            this.postParamsHashHeader = str2;
            this.requestTime = requestTime;
            this.eTag = str3;
            this.body = str4;
        }

        public static /* synthetic */ Parameters copy$default(Parameters parameters, byte[] bArr, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                bArr = parameters.salt;
            }
            if ((i8 & 2) != 0) {
                str = parameters.apiKey;
            }
            if ((i8 & 4) != 0) {
                str2 = parameters.nonce;
            }
            if ((i8 & 8) != 0) {
                str3 = parameters.urlPath;
            }
            if ((i8 & 16) != 0) {
                str4 = parameters.postParamsHashHeader;
            }
            if ((i8 & 32) != 0) {
                str5 = parameters.requestTime;
            }
            if ((i8 & 64) != 0) {
                str6 = parameters.eTag;
            }
            if ((i8 & 128) != 0) {
                str7 = parameters.body;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str4;
            String str11 = str5;
            return parameters.copy(bArr, str, str2, str3, str10, str11, str8, str9);
        }

        public final byte[] component1() {
            return this.salt;
        }

        public final String component2() {
            return this.apiKey;
        }

        public final String component3() {
            return this.nonce;
        }

        public final String component4() {
            return this.urlPath;
        }

        public final String component5() {
            return this.postParamsHashHeader;
        }

        public final String component6() {
            return this.requestTime;
        }

        public final String component7() {
            return this.eTag;
        }

        public final String component8() {
            return this.body;
        }

        public final Parameters copy(byte[] salt, String apiKey, String str, String urlPath, String str2, String requestTime, String str3, String str4) {
            t.g(salt, "salt");
            t.g(apiKey, "apiKey");
            t.g(urlPath, "urlPath");
            t.g(requestTime, "requestTime");
            return new Parameters(salt, apiKey, str, urlPath, str2, requestTime, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!t.c(Parameters.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            t.e(obj, "null cannot be cast to non-null type com.revenuecat.purchases.common.verification.SigningManager.Parameters");
            Parameters parameters = (Parameters) obj;
            return Arrays.equals(this.salt, parameters.salt) && t.c(this.apiKey, parameters.apiKey) && t.c(this.nonce, parameters.nonce) && t.c(this.urlPath, parameters.urlPath) && t.c(this.postParamsHashHeader, parameters.postParamsHashHeader) && t.c(this.requestTime, parameters.requestTime) && t.c(this.eTag, parameters.eTag) && t.c(this.body, parameters.body);
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final String getBody() {
            return this.body;
        }

        public final String getETag() {
            return this.eTag;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final String getPostParamsHashHeader() {
            return this.postParamsHashHeader;
        }

        public final String getRequestTime() {
            return this.requestTime;
        }

        public final byte[] getSalt() {
            return this.salt;
        }

        public final String getUrlPath() {
            return this.urlPath;
        }

        public int hashCode() {
            int iHashCode = ((Arrays.hashCode(this.salt) * 31) + this.apiKey.hashCode()) * 31;
            String str = this.nonce;
            int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.urlPath.hashCode()) * 31;
            String str2 = this.postParamsHashHeader;
            int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.requestTime.hashCode()) * 31;
            String str3 = this.eTag;
            int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.body;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0040  */
        /* JADX WARN: Code duplicated, block: B:17:0x0060  */
        /* JADX WARN: Code duplicated, block: B:22:0x0073  */
        public final byte[] toSignatureToVerify() {
            byte[] bytes;
            byte[] bytes2;
            byte[] bytes3;
            byte[] bArr = this.salt;
            String str = this.apiKey;
            Charset charset = c.f12941b;
            byte[] bytes4 = str.getBytes(charset);
            t.f(bytes4, "this as java.lang.String).getBytes(charset)");
            byte[] bArrX = C0933m.x(bArr, bytes4);
            String str2 = this.nonce;
            byte[] bArrDecode = str2 != null ? Base64.decode(str2, 0) : null;
            if (bArrDecode == null) {
                bArrDecode = new byte[0];
            }
            byte[] bArrX2 = C0933m.x(bArrX, bArrDecode);
            byte[] bytes5 = this.urlPath.getBytes(charset);
            t.f(bytes5, "this as java.lang.String).getBytes(charset)");
            byte[] bArrX3 = C0933m.x(bArrX2, bytes5);
            String str3 = this.postParamsHashHeader;
            if (str3 != null) {
                bytes = str3.getBytes(charset);
                t.f(bytes, "this as java.lang.String).getBytes(charset)");
                if (bytes == null) {
                    bytes = new byte[0];
                }
            } else {
                bytes = new byte[0];
            }
            byte[] bArrX4 = C0933m.x(bArrX3, bytes);
            byte[] bytes6 = this.requestTime.getBytes(charset);
            t.f(bytes6, "this as java.lang.String).getBytes(charset)");
            byte[] bArrX5 = C0933m.x(bArrX4, bytes6);
            String str4 = this.eTag;
            if (str4 != null) {
                bytes2 = str4.getBytes(charset);
                t.f(bytes2, "this as java.lang.String).getBytes(charset)");
                if (bytes2 == null) {
                    bytes2 = new byte[0];
                }
            } else {
                bytes2 = new byte[0];
            }
            byte[] bArrX6 = C0933m.x(bArrX5, bytes2);
            String str5 = this.body;
            if (str5 != null) {
                bytes3 = str5.getBytes(charset);
                t.f(bytes3, "this as java.lang.String).getBytes(charset)");
                if (bytes3 == null) {
                    bytes3 = new byte[0];
                }
            } else {
                bytes3 = new byte[0];
            }
            return C0933m.x(bArrX6, bytes3);
        }

        public String toString() {
            return "Parameters(salt=" + Arrays.toString(this.salt) + ", apiKey=" + this.apiKey + ", nonce=" + this.nonce + ", urlPath=" + this.urlPath + ", postParamsHashHeader=" + this.postParamsHashHeader + ", requestTime=" + this.requestTime + ", eTag=" + this.eTag + ", body=" + this.body + ')';
        }
    }

    public SigningManager(SignatureVerificationMode signatureVerificationMode, AppConfig appConfig, String apiKey) {
        t.g(signatureVerificationMode, "signatureVerificationMode");
        t.g(appConfig, "appConfig");
        t.g(apiKey, "apiKey");
        this.signatureVerificationMode = signatureVerificationMode;
        this.appConfig = appConfig;
        this.apiKey = apiKey;
    }

    public final String createRandomNonce() {
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        byte[] bArrEncode = Base64.encode(bArr, 0);
        t.f(bArrEncode, "encode(bytes, Base64.DEFAULT)");
        return w.W0(new String(bArrEncode, c.f12941b)).toString();
    }

    public final String getPostParamsForSigningHeaderIfNeeded(Endpoint endpoint, List<o> list) {
        t.g(endpoint, "endpoint");
        if (list == null || list.isEmpty() || !shouldVerifyEndpoint(endpoint)) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        ArrayList arrayList = new ArrayList(C0938s.y(list, 10));
        int i8 = 0;
        for (Object obj : list) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                r.x();
            }
            o oVar = (o) obj;
            if (i8 > 0) {
                messageDigest.update((byte) 0);
            }
            byte[] bytes = ((String) oVar.d()).getBytes(c.f12941b);
            t.f(bytes, "this as java.lang.String).getBytes(charset)");
            messageDigest.update(bytes);
            arrayList.add(G.f1419a);
            i8 = i9;
        }
        byte[] bArrDigest = messageDigest.digest();
        t.f(bArrDigest, "sha256Digest.digest()");
        String string = "";
        for (byte b8 : bArrDigest) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b8)}, 1));
            t.f(str, "format(this, *args)");
            sb.append(str);
            string = sb.toString();
        }
        return z.r0(r.q(z.r0(list, f.f16777a, null, null, 0, null, SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1.INSTANCE, 30, null), POST_PARAMS_ALGORITHM, string), Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, null, null, 0, null, null, 62, null);
    }

    public final SignatureVerificationMode getSignatureVerificationMode() {
        return this.signatureVerificationMode;
    }

    public final boolean shouldVerifyEndpoint(Endpoint endpoint) {
        t.g(endpoint, "endpoint");
        return endpoint.getSupportsSignatureVerification() && this.signatureVerificationMode.getShouldVerify();
    }

    public final VerificationResult verifyResponse(String urlPath, String str, String str2, String str3, String str4, String str5, String str6) {
        t.g(urlPath, "urlPath");
        if (this.appConfig.getForceSigningErrors()) {
            LogUtilsKt.warnLog("Forcing signing error for request with path: " + urlPath);
            return VerificationResult.FAILED;
        }
        IntermediateSignatureHelper intermediateSignatureHelper = this.signatureVerificationMode.getIntermediateSignatureHelper();
        if (intermediateSignatureHelper == null) {
            return VerificationResult.NOT_REQUESTED;
        }
        if (str == null) {
            String str7 = String.format(NetworkStrings.VERIFICATION_MISSING_SIGNATURE, Arrays.copyOf(new Object[]{urlPath}, 1));
            t.f(str7, "format(this, *args)");
            LogUtilsKt.errorLog$default(str7, null, 2, null);
            return VerificationResult.FAILED;
        }
        if (str4 == null) {
            String str8 = String.format(NetworkStrings.VERIFICATION_MISSING_REQUEST_TIME, Arrays.copyOf(new Object[]{urlPath}, 1));
            t.f(str8, "format(this, *args)");
            LogUtilsKt.errorLog$default(str8, null, 2, null);
            return VerificationResult.FAILED;
        }
        if (str3 == null && str5 == null) {
            String str9 = String.format(NetworkStrings.VERIFICATION_MISSING_BODY_OR_ETAG, Arrays.copyOf(new Object[]{urlPath}, 1));
            t.f(str9, "format(this, *args)");
            LogUtilsKt.errorLog$default(str9, null, 2, null);
            return VerificationResult.FAILED;
        }
        try {
            Signature signatureFromString$purchases_defaultsRelease = Signature.Companion.fromString$purchases_defaultsRelease(str);
            Result<SignatureVerifier, PurchasesError> resultCreateIntermediateKeyVerifierIfVerified = intermediateSignatureHelper.createIntermediateKeyVerifierIfVerified(signatureFromString$purchases_defaultsRelease);
            if (resultCreateIntermediateKeyVerifierIfVerified instanceof Result.Error) {
                String str10 = String.format(NetworkStrings.VERIFICATION_INTERMEDIATE_KEY_FAILED, Arrays.copyOf(new Object[]{urlPath, ((PurchasesError) ((Result.Error) resultCreateIntermediateKeyVerifierIfVerified).getValue()).getUnderlyingErrorMessage()}, 2));
                t.f(str10, "format(this, *args)");
                LogUtilsKt.errorLog$default(str10, null, 2, null);
                return VerificationResult.FAILED;
            }
            if (!(resultCreateIntermediateKeyVerifierIfVerified instanceof Result.Success)) {
                throw new m();
            }
            if (((SignatureVerifier) ((Result.Success) resultCreateIntermediateKeyVerifierIfVerified).getValue()).verify(signatureFromString$purchases_defaultsRelease.getPayload(), new Parameters(signatureFromString$purchases_defaultsRelease.getSalt(), this.apiKey, str2, urlPath, str6, str4, str5, str3).toSignatureToVerify())) {
                String str11 = String.format(NetworkStrings.VERIFICATION_SUCCESS, Arrays.copyOf(new Object[]{urlPath}, 1));
                t.f(str11, "format(this, *args)");
                LogUtilsKt.verboseLog(str11);
                return VerificationResult.VERIFIED;
            }
            String str12 = String.format(NetworkStrings.VERIFICATION_ERROR, Arrays.copyOf(new Object[]{urlPath}, 1));
            t.f(str12, "format(this, *args)");
            LogUtilsKt.errorLog$default(str12, null, 2, null);
            return VerificationResult.FAILED;
        } catch (InvalidSignatureSizeException e8) {
            String str13 = String.format(NetworkStrings.VERIFICATION_INVALID_SIZE, Arrays.copyOf(new Object[]{urlPath, e8.getMessage()}, 2));
            t.f(str13, "format(this, *args)");
            LogUtilsKt.errorLog$default(str13, null, 2, null);
            return VerificationResult.FAILED;
        }
    }
}
