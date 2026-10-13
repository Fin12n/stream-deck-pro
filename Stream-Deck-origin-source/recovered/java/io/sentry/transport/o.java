package io.sentry.transport;

import R0.pkXL.Oitvkwcwn;
import io.sentry.C2521l1;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.J2;
import io.sentry.W1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import p043e6.dT.GIGvBf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f27685e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Proxy f27686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2521l1 f27687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J2 f27688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f27689d;

    public o(J2 j8, C2521l1 c2521l1, A a8) {
        this(j8, c2521l1, m.a(), a8);
    }

    public final void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final String c(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f27685e));
                try {
                    StringBuilder sb = new StringBuilder();
                    boolean z8 = true;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!z8) {
                            sb.append("\n");
                        }
                        sb.append(line);
                        z8 = false;
                        if (errorStream != null) {
                            try {
                                errorStream.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                        throw th;
                    }
                    String string = sb.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return string;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (errorStream != null) {
                    errorStream.close();
                }
                throw th4;
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    public final boolean d(int i8) {
        return i8 == 200;
    }

    public HttpURLConnection e() {
        return (HttpURLConnection) (this.f27686a == null ? this.f27687b.b().openConnection() : this.f27687b.b().openConnection(this.f27686a));
    }

    public final C f(HttpURLConnection httpURLConnection) {
        try {
            int responseCode = httpURLConnection.getResponseCode();
            i(httpURLConnection, responseCode);
            if (d(responseCode)) {
                this.f27688c.getLogger().c(EnumC2596z2.DEBUG, "Envelope sent successfully.", new Object[0]);
                return C.e();
            }
            ILogger logger = this.f27688c.getLogger();
            EnumC2596z2 enumC2596z2 = EnumC2596z2.ERROR;
            logger.c(enumC2596z2, "Request failed, API returned %s", Integer.valueOf(responseCode));
            if (this.f27688c.isDebug()) {
                this.f27688c.getLogger().c(enumC2596z2, "%s", c(httpURLConnection));
            }
            return C.b(responseCode);
        } catch (IOException e8) {
            this.f27688c.getLogger().a(EnumC2596z2.ERROR, e8, "Error reading and logging the response stream", new Object[0]);
            return C.a();
        } finally {
            a(httpURLConnection);
        }
    }

    public final Proxy g(J2.h hVar) {
        if (hVar == null) {
            return null;
        }
        String strC = hVar.c();
        String strA = hVar.a();
        if (strC == null || strA == null) {
            return null;
        }
        try {
            return new Proxy(hVar.d() != null ? hVar.d() : Proxy.Type.HTTP, new InetSocketAddress(strA, Integer.parseInt(strC)));
        } catch (NumberFormatException e8) {
            this.f27688c.getLogger().a(EnumC2596z2.ERROR, e8, "Failed to parse Sentry Proxy port: " + hVar.c() + ". Proxy is ignored", new Object[0]);
            return null;
        }
    }

    public C h(W1 w8) throws IOException {
        HttpURLConnection httpURLConnectionB = b();
        try {
            OutputStream outputStream = httpURLConnectionB.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f27688c.getSerializer().b(w8, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    return f(httpURLConnectionB);
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                this.f27688c.getLogger().a(EnumC2596z2.ERROR, th5, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);
                return f(httpURLConnectionB);
            } catch (Throwable th6) {
                f(httpURLConnectionB);
                throw th6;
            }
        }
    }

    public void i(HttpURLConnection httpURLConnection, int i8) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        this.f27689d.H0(httpURLConnection.getHeaderField("X-Sentry-Rate-Limits"), headerField, i8);
    }

    public o(J2 j8, C2521l1 c2521l1, m mVar, A a8) {
        this.f27687b = c2521l1;
        this.f27688c = j8;
        this.f27689d = a8;
        Proxy proxyG = g(j8.getProxy());
        this.f27686a = proxyG;
        if (proxyG == null || j8.getProxy() == null) {
            return;
        }
        String strE = j8.getProxy().e();
        String strB = j8.getProxy().b();
        if (strE == null || strB == null) {
            return;
        }
        mVar.b(new v(strE, strB));
    }

    public final HttpURLConnection b() throws IOException {
        HttpURLConnection httpURLConnectionE = e();
        for (Map.Entry entry : this.f27687b.a().entrySet()) {
            httpURLConnectionE.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnectionE.setRequestMethod(Oitvkwcwn.UsHeV);
        httpURLConnectionE.setDoOutput(true);
        httpURLConnectionE.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnectionE.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnectionE.setRequestProperty("Accept", "application/json");
        httpURLConnectionE.setRequestProperty(GIGvBf.AJOoRXixzS, "close");
        httpURLConnectionE.setConnectTimeout(this.f27688c.getConnectionTimeoutMillis());
        httpURLConnectionE.setReadTimeout(this.f27688c.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = this.f27688c.getSslSocketFactory();
        if ((httpURLConnectionE instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnectionE).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnectionE.connect();
        return httpURLConnectionE;
    }
}
