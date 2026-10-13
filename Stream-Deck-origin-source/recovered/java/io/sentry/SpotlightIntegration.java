package io.sentry;

import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.concurrent.RejectedExecutionException;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class SpotlightIntegration implements InterfaceC2516k0, J2.b, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public J2 f26000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ILogger f26001b = E0.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC2447a0 f26002c = O0.e();

    @Override // io.sentry.J2.b
    public void b(final W1 w8, H h8) {
        try {
            this.f26002c.submit(new Runnable() { // from class: io.sentry.l3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27221a.y(w8);
                }
            });
        } catch (RejectedExecutionException e8) {
            this.f26001b.b(EnumC2596z2.WARNING, "Spotlight envelope submission rejected.", e8);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26002c.a(0L);
        J2 j8 = this.f26000a;
        if (j8 == null || j8.getBeforeEnvelopeCallback() != this) {
            return;
        }
        this.f26000a.setBeforeEnvelopeCallback(null);
    }

    public final void j(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    @Override // io.sentry.InterfaceC2516k0
    public void o(X x8, J2 j8) {
        this.f26000a = j8;
        this.f26001b = j8.getLogger();
        if (j8.getBeforeEnvelopeCallback() != null || !j8.isEnableSpotlight()) {
            this.f26001b.c(EnumC2596z2.DEBUG, "SpotlightIntegration is not enabled. BeforeEnvelopeCallback is already set or spotlight is not enabled.", new Object[0]);
            return;
        }
        this.f26002c = new C2568u2();
        j8.setBeforeEnvelopeCallback(this);
        this.f26001b.c(EnumC2596z2.DEBUG, "SpotlightIntegration enabled.", new Object[0]);
    }

    public String v() {
        J2 j8 = this.f26000a;
        if (j8 == null || j8.getSpotlightConnectionUrl() == null) {
            return io.sentry.util.w.a() ? "http://10.0.2.2:8969/stream" : "http://localhost:8969/stream";
        }
        return this.f26000a.getSpotlightConnectionUrl();
    }

    public final void y(W1 w8) {
        try {
            if (this.f26000a == null) {
                throw new IllegalArgumentException("SentryOptions are required to send envelopes.");
            }
            HttpURLConnection httpURLConnectionT = t(v());
            try {
                OutputStream outputStream = httpURLConnectionT.getOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                    try {
                        this.f26000a.getSerializer().b(w8, gZIPOutputStream);
                        gZIPOutputStream.close();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        this.f26001b.c(EnumC2596z2.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionT.getResponseCode()));
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
                    this.f26001b.b(EnumC2596z2.ERROR, "An exception occurred while submitting the envelope to the Sentry server.", th5);
                    this.f26001b.c(EnumC2596z2.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionT.getResponseCode()));
                } finally {
                    this.f26001b.c(EnumC2596z2.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionT.getResponseCode()));
                    j(httpURLConnectionT);
                }
            }
        } catch (Exception e8) {
            this.f26001b.b(EnumC2596z2.ERROR, "An exception occurred while creating the connection to spotlight.", e8);
        }
    }

    public final HttpURLConnection t(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
        httpURLConnection.setReadTimeout(1000);
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty(WaYxBuDSBD.dzFtLLcevYNWHL, "close");
        httpURLConnection.connect();
        return httpURLConnection;
    }
}
