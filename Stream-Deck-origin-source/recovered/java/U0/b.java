package U0;

import A1.t;
import C6.G;
import Q0.h;
import Q0.i;
import Q0.l;
import Q0.m;
import Q6.k;
import R0.C1600m0;
import R0.F0;
import R0.InterfaceC1586f0;
import R0.M;
import T0.f;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public F0 f10002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1600m0 f10004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f10005d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t f10006e = t.Ltr;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f10007f = new a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {
        public a() {
            super(1);
        }

        public final void b(f fVar) {
            b.this.j(fVar);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((f) obj);
            return G.f1419a;
        }
    }

    public boolean a(float f8) {
        return false;
    }

    public boolean b(C1600m0 c1600m0) {
        return false;
    }

    public boolean c(t tVar) {
        return false;
    }

    public final void d(float f8) {
        if (this.f10005d == f8) {
            return;
        }
        if (!a(f8)) {
            if (f8 == 1.0f) {
                F0 f9 = this.f10002a;
                if (f9 != null) {
                    f9.b(f8);
                }
                this.f10003b = false;
            } else {
                i().b(f8);
                this.f10003b = true;
            }
        }
        this.f10005d = f8;
    }

    public final void e(C1600m0 c1600m0) {
        if (kotlin.jvm.internal.t.c(this.f10004c, c1600m0)) {
            return;
        }
        if (!b(c1600m0)) {
            if (c1600m0 == null) {
                F0 f8 = this.f10002a;
                if (f8 != null) {
                    f8.v(null);
                }
                this.f10003b = false;
            } else {
                i().v(c1600m0);
                this.f10003b = true;
            }
        }
        this.f10004c = c1600m0;
    }

    public final void f(t tVar) {
        if (this.f10006e != tVar) {
            c(tVar);
            this.f10006e = tVar;
        }
    }

    public final void g(f fVar, long j8, float f8, C1600m0 c1600m0) {
        d(f8);
        e(c1600m0);
        f(fVar.getLayoutDirection());
        float fI = l.i(fVar.d()) - l.i(j8);
        float fG = l.g(fVar.d()) - l.g(j8);
        fVar.K0().a().g(0.0f, 0.0f, fI, fG);
        if (f8 > 0.0f && l.i(j8) > 0.0f && l.g(j8) > 0.0f) {
            if (this.f10003b) {
                h hVarB = i.b(Q0.f.f9082b.c(), m.a(l.i(j8), l.g(j8)));
                InterfaceC1586f0 interfaceC1586f0C = fVar.K0().c();
                try {
                    interfaceC1586f0C.f(hVarB, i());
                    j(fVar);
                    interfaceC1586f0C.x();
                } catch (Throwable th) {
                    interfaceC1586f0C.x();
                    throw th;
                }
            } else {
                j(fVar);
            }
        }
        fVar.K0().a().g(-0.0f, -0.0f, -fI, -fG);
    }

    public abstract long h();

    public final F0 i() {
        F0 f8 = this.f10002a;
        if (f8 != null) {
            return f8;
        }
        F0 f0A = M.a();
        this.f10002a = f0A;
        return f0A;
    }

    public abstract void j(f fVar);
}
