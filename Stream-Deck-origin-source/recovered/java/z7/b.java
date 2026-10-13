package z7;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.t;
import u7.l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39276d;

    public b(List<l> connectionSpecs) {
        t.g(connectionSpecs, "connectionSpecs");
        this.f39273a = connectionSpecs;
    }

    public final l a(SSLSocket sslSocket) throws UnknownServiceException {
        l lVar;
        t.g(sslSocket, "sslSocket");
        int i8 = this.f39274b;
        int size = this.f39273a.size();
        while (true) {
            if (i8 >= size) {
                lVar = null;
                break;
            }
            lVar = (l) this.f39273a.get(i8);
            if (lVar.e(sslSocket)) {
                this.f39274b = i8 + 1;
                break;
            }
            i8++;
        }
        if (lVar != null) {
            this.f39275c = c(sslSocket);
            lVar.c(sslSocket, this.f39276d);
            return lVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f39276d);
        sb.append(", modes=");
        sb.append(this.f39273a);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        t.d(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        t.f(string, "toString(this)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean b(IOException e8) {
        t.g(e8, "e");
        this.f39276d = true;
        if (!this.f39275c || (e8 instanceof ProtocolException) || (e8 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e8 instanceof SSLHandshakeException) && (e8.getCause() instanceof CertificateException)) || (e8 instanceof SSLPeerUnverifiedException) || !(e8 instanceof SSLException)) ? false : true;
    }

    public final boolean c(SSLSocket sSLSocket) {
        int size = this.f39273a.size();
        for (int i8 = this.f39274b; i8 < size; i8++) {
            if (((l) this.f39273a.get(i8)).e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
