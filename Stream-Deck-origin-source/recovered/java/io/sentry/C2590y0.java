package io.sentry;

import io.sentry.protocol.C2542d;
import io.sentry.protocol.DebugImage;
import io.sentry.util.C2569a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2590y0 implements C, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2 f27811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O2 f27812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2561t2 f27813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile K f27814d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2569a f27815e = new C2569a();

    public C2590y0(J2 j8) {
        J2 j9 = (J2) io.sentry.util.u.c(j8, "The SentryOptions is required.");
        this.f27811a = j9;
        N2 n8 = new N2(j9);
        this.f27813c = new C2561t2(n8);
        this.f27812b = new O2(n8, j9);
    }

    private void A(P1 p8) {
        ArrayList arrayList = new ArrayList();
        if (this.f27811a.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(this.f27811a.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : this.f27811a.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C2542d c2542dD = p8.D();
        if (c2542dD == null) {
            c2542dD = new C2542d();
        }
        if (c2542dD.c() == null) {
            c2542dD.d(arrayList);
        } else {
            c2542dD.c().addAll(arrayList);
        }
        p8.S(c2542dD);
    }

    private void A0(P1 p8) {
        if (p8.J() == null) {
            p8.Y(this.f27811a.getRelease());
        }
    }

    private void H0(P1 p8) {
        if (p8.L() == null) {
            p8.a0(this.f27811a.getSdkVersion());
        }
    }

    private void Y(P1 p8) {
        if (p8.E() == null) {
            p8.T(this.f27811a.getDist());
        }
    }

    private void i0(P1 p8) {
        if (p8.F() == null) {
            p8.U(this.f27811a.getEnvironment());
        }
    }

    private void v(P1 p8) {
        io.sentry.protocol.F fQ = p8.Q();
        if (fQ == null) {
            fQ = new io.sentry.protocol.F();
            p8.e0(fQ);
        }
        if (fQ.j() == null && this.f27811a.isSendDefaultPii()) {
            fQ.m("{{auto}}");
        }
    }

    private void w0(P1 p8) {
        if (p8.I() == null) {
            p8.X("java");
        }
    }

    public final void J0(P1 p8) {
        if (p8.M() == null) {
            p8.b0(this.f27811a.getServerName());
        }
        if (this.f27811a.isAttachServerName() && p8.M() == null) {
            o();
            if (this.f27814d != null) {
                p8.b0(this.f27814d.d());
            }
        }
    }

    public final void L0(P1 p8) {
        if (p8.N() == null) {
            p8.d0(new HashMap(this.f27811a.getTags()));
            return;
        }
        for (Map.Entry<String, String> entry : this.f27811a.getTags().entrySet()) {
            if (!p8.N().containsKey(entry.getKey())) {
                p8.c0(entry.getKey(), entry.getValue());
            }
        }
    }

    public final void O0(C2557s2 c2557s2, H h8) {
        if (c2557s2.t0() == null) {
            List<io.sentry.protocol.p> listO0 = c2557s2.o0();
            ArrayList arrayList = null;
            if (listO0 != null && !listO0.isEmpty()) {
                for (io.sentry.protocol.p pVar : listO0) {
                    if (pVar.g() != null && pVar.j() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(pVar.j());
                    }
                }
            }
            if (this.f27811a.isAttachThreads() || io.sentry.util.m.h(h8, io.sentry.hints.a.class)) {
                Object objG = io.sentry.util.m.g(h8);
                c2557s2.E0(this.f27812b.b(arrayList, objG instanceof io.sentry.hints.a ? ((io.sentry.hints.a) objG).d() : false));
            } else if (this.f27811a.isAttachStacktrace()) {
                if ((listO0 == null || listO0.isEmpty()) && !t(h8)) {
                    c2557s2.E0(this.f27812b.a());
                }
            }
        }
    }

    public final boolean Q0(P1 p8, H h8) {
        if (io.sentry.util.m.q(h8)) {
            return true;
        }
        this.f27811a.getLogger().c(EnumC2596z2.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", p8.G());
        return false;
    }

    @Override // io.sentry.C
    public K2 b(K2 k8, H h8) {
        z(k8);
        if (Q0(k8, h8)) {
            y(k8);
            io.sentry.protocol.o oVarI = this.f27811a.getSessionReplay().i();
            if (oVarI != null) {
                k8.a0(oVarI);
            }
        }
        return k8;
    }

    @Override // io.sentry.C
    public C2557s2 c(C2557s2 c2557s2, H h8) {
        z(c2557s2);
        j0(c2557s2);
        A(c2557s2);
        r0(c2557s2);
        if (Q0(c2557s2, h8)) {
            y(c2557s2);
            O0(c2557s2, h8);
        }
        return c2557s2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f27814d != null) {
            this.f27814d.c();
        }
    }

    @Override // io.sentry.C
    public io.sentry.protocol.B j(io.sentry.protocol.B b8, H h8) {
        z(b8);
        A(b8);
        if (Q0(b8, h8)) {
            y(b8);
        }
        return b8;
    }

    public final void j0(C2557s2 c2557s2) {
        Throwable thP = c2557s2.P();
        if (thP != null) {
            c2557s2.z0(this.f27813c.d(thP));
        }
    }

    public final void o() {
        if (this.f27814d == null) {
            InterfaceC2480b0 interfaceC2480b0A = this.f27815e.a();
            try {
                if (this.f27814d == null) {
                    this.f27814d = K.e();
                }
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
            } catch (Throwable th) {
                if (interfaceC2480b0A != null) {
                    try {
                        interfaceC2480b0A.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    public final void r0(C2557s2 c2557s2) {
        Map mapA = this.f27811a.getModulesLoader().a();
        if (mapA == null) {
            return;
        }
        Map mapS0 = c2557s2.s0();
        if (mapS0 == null) {
            c2557s2.D0(mapA);
        } else {
            mapS0.putAll(mapA);
        }
    }

    public final boolean t(H h8) {
        return io.sentry.util.m.h(h8, io.sentry.hints.e.class);
    }

    public final void y(P1 p8) {
        A0(p8);
        i0(p8);
        J0(p8);
        Y(p8);
        H0(p8);
        L0(p8);
        v(p8);
    }

    public final void z(P1 p8) {
        w0(p8);
    }
}
