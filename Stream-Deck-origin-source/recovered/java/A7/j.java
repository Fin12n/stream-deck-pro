package A7;

import D6.r;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import u7.A;
import u7.B;
import u7.C;
import u7.D;
import u7.u;
import u7.v;
import u7.x;
import u7.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f881b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f882a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public j(x client) {
        t.g(client, "client");
        this.f882a = client;
    }

    @Override // u7.v
    public B a(v.a chain) {
        B bA;
        t.g(chain, "chain");
        g gVar = (g) chain;
        z zVarI = gVar.i();
        z7.e eVarE = gVar.e();
        List listN = r.n();
        int i8 = 0;
        B b8 = null;
        while (true) {
            boolean z8 = true;
            while (true) {
                eVarE.i(zVarI, z8);
                try {
                    if (eVarE.c()) {
                        throw new IOException("Canceled");
                    }
                    try {
                        bA = gVar.a(zVarI);
                    } catch (IOException e8) {
                        if (!e(e8, eVarE, zVarI, !(e8 instanceof C7.a))) {
                            throw v7.d.a0(e8, listN);
                        }
                        listN = D6.z.C0(listN, e8);
                        eVarE.k(true);
                        z8 = false;
                    } catch (z7.i e9) {
                        if (!e(e9.c(), eVarE, zVarI, false)) {
                            throw v7.d.a0(e9.b(), listN);
                        }
                        listN = D6.z.C0(listN, e9.b());
                        eVarE.k(true);
                        z8 = false;
                    }
                    eVarE.k(true);
                    z8 = false;
                } catch (Throwable th) {
                    eVarE.k(true);
                    throw th;
                }
            }
            if (b8 != null) {
                bA = bA.r0().o(b8.r0().b(null).c()).c();
            }
            b8 = bA;
            z7.c cVarQ = eVarE.q();
            z zVarC = c(b8, cVarQ);
            if (zVarC == null) {
                if (cVarQ != null && cVarQ.m()) {
                    eVarE.D();
                }
                eVarE.k(false);
                return b8;
            }
            A a8 = zVarC.a();
            if (a8 != null && a8.d()) {
                eVarE.k(false);
                return b8;
            }
            C cB = b8.b();
            if (cB != null) {
                v7.d.m(cB);
            }
            i8++;
            if (i8 > 20) {
                throw new ProtocolException("Too many follow-up requests: " + i8);
            }
            eVarE.k(true);
            zVarI = zVarC;
        }
    }

    public final z b(B b8, String str) {
        String strA;
        u uVarO;
        if (!this.f882a.u() || (strA = B.A(b8, "Location", null, 2, null)) == null || (uVarO = b8.J0().j().o(strA)) == null) {
            return null;
        }
        if (!t.c(uVarO.p(), b8.J0().j().p()) && !this.f882a.v()) {
            return null;
        }
        z.a aVarI = b8.J0().i();
        if (f.b(str)) {
            int iT = b8.t();
            f fVar = f.f867a;
            boolean z8 = fVar.d(str) || iT == 308 || iT == 307;
            if (!fVar.c(str) || iT == 308 || iT == 307) {
                aVarI.e(str, z8 ? b8.J0().a() : null);
            } else {
                aVarI.e("GET", null);
            }
            if (!z8) {
                aVarI.f("Transfer-Encoding");
                aVarI.f("Content-Length");
                aVarI.f("Content-Type");
            }
        }
        if (!v7.d.j(b8.J0().j(), uVarO)) {
            aVarI.f("Authorization");
        }
        return aVarI.h(uVarO).b();
    }

    public final z c(B b8, z7.c cVar) throws ProtocolException {
        z7.f fVarH;
        D dA = (cVar == null || (fVarH = cVar.h()) == null) ? null : fVarH.A();
        int iT = b8.t();
        String strH = b8.J0().h();
        if (iT != 307 && iT != 308) {
            if (iT == 401) {
                return this.f882a.f().a(dA, b8);
            }
            if (iT == 421) {
                A a8 = b8.J0().a();
                if ((a8 != null && a8.d()) || cVar == null || !cVar.l()) {
                    return null;
                }
                cVar.h().y();
                return b8.J0();
            }
            if (iT == 503) {
                B bW0 = b8.w0();
                if ((bW0 == null || bW0.t() != 503) && g(b8, Integer.MAX_VALUE) == 0) {
                    return b8.J0();
                }
                return null;
            }
            if (iT == 407) {
                t.d(dA);
                if (dA.b().type() == Proxy.Type.HTTP) {
                    return this.f882a.I().a(dA, b8);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iT == 408) {
                if (!this.f882a.L()) {
                    return null;
                }
                A a9 = b8.J0().a();
                if (a9 != null && a9.d()) {
                    return null;
                }
                B bW1 = b8.w0();
                if ((bW1 == null || bW1.t() != 408) && g(b8, 0) <= 0) {
                    return b8.J0();
                }
                return null;
            }
            switch (iT) {
                case RCHTTPStatusCodes.UNSUCCESSFUL /* 300 */:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return b(b8, strH);
    }

    public final boolean d(IOException iOException, boolean z8) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return (iOException instanceof SocketTimeoutException) && !z8;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    public final boolean e(IOException iOException, z7.e eVar, z zVar, boolean z8) {
        if (this.f882a.L()) {
            return !(z8 && f(iOException, zVar)) && d(iOException, z8) && eVar.B();
        }
        return false;
    }

    public final boolean f(IOException iOException, z zVar) {
        A a8 = zVar.a();
        return (a8 != null && a8.d()) || (iOException instanceof FileNotFoundException);
    }

    public final int g(B b8, int i8) {
        String strA = B.A(b8, "Retry-After", null, 2, null);
        if (strA == null) {
            return i8;
        }
        if (!new Z6.j("\\d+").d(strA)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strA);
        t.f(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }
}
