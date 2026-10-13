package G;

import A.AbstractC0885n;
import H.AbstractC0994n0;
import H.C0980g0;
import H.C1013x0;
import H.InterfaceC0978f0;
import H.InterfaceC0982h0;
import H.InterfaceC1015y0;
import H.c1;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: G.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C0965y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f2594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final O.b f2595g = new O.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1013x0 f2596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0980g0 f2597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0960t f2598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P f2599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0960t.c f2600e;

    public C0965y(C1013x0 c1013x0, Size size, CameraCharacteristics cameraCharacteristics) {
        this(c1013x0, size, cameraCharacteristics, null, false, null);
    }

    public void a() {
        I.w.b();
        this.f2598c.n();
        this.f2599d.n();
    }

    public final C0951j b(int i8, InterfaceC0978f0 interfaceC0978f0, h0 h0Var, W w8) {
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(interfaceC0978f0.hashCode());
        List<InterfaceC0982h0> listA = interfaceC0978f0.a();
        Objects.requireNonNull(listA);
        for (InterfaceC0982h0 interfaceC0982h0 : listA) {
            C0980g0.a aVar = new C0980g0.a();
            aVar.t(this.f2597b.k());
            aVar.e(this.f2597b.g());
            aVar.a(h0Var.p());
            aVar.f(this.f2600e.l());
            if (this.f2600e.e().size() > 1 && this.f2600e.j() != null) {
                aVar.f(this.f2600e.j());
            }
            boolean zL = l();
            if (zL) {
                AbstractC0994n0 abstractC0994n0G = this.f2600e.g();
                Objects.requireNonNull(abstractC0994n0G);
                aVar.f(abstractC0994n0G);
            }
            aVar.r(zL);
            if (P.b.g(this.f2600e.d()) || P.b.h(this.f2600e.d())) {
                if (f2595g.a()) {
                    aVar.d(C0980g0.f3014i, Integer.valueOf(h0Var.m()));
                }
                aVar.d(C0980g0.f3015j, Integer.valueOf(g(h0Var)));
            }
            aVar.e(interfaceC0982h0.a().g());
            aVar.g(strValueOf, Integer.valueOf(interfaceC0982h0.getId()));
            aVar.p(i8);
            aVar.c(this.f2600e.a());
            if (this.f2600e.e().size() > 1 && this.f2600e.i() != null) {
                aVar.c(this.f2600e.i());
            }
            arrayList.add(aVar.h());
        }
        return new C0951j(arrayList, w8);
    }

    public final InterfaceC0978f0 c() {
        InterfaceC0978f0 interfaceC0978f0F0 = this.f2596a.f0(A.H.b());
        Objects.requireNonNull(interfaceC0978f0F0);
        return interfaceC0978f0F0;
    }

    public final Q d(int i8, InterfaceC0978f0 interfaceC0978f0, h0 h0Var, W w8, Y4.a aVar) {
        return new Q(interfaceC0978f0, h0Var, w8, aVar, i8);
    }

    public T1.e e(h0 h0Var, W w8, Y4.a aVar) {
        I.w.b();
        InterfaceC0978f0 interfaceC0978f0C = c();
        int i8 = f2594f;
        f2594f = i8 + 1;
        return new T1.e(b(i8, interfaceC0978f0C, h0Var, w8), d(i8, interfaceC0978f0C, h0Var, w8, aVar));
    }

    public c1.b f(Size size) {
        c1.b bVarQ = c1.b.q(this.f2596a, size);
        bVarQ.h(this.f2600e.l());
        if (this.f2600e.e().size() > 1 && this.f2600e.j() != null) {
            bVarQ.h(this.f2600e.j());
        }
        if (this.f2600e.g() != null) {
            bVarQ.v(this.f2600e.g());
        }
        return bVarQ;
    }

    public int g(h0 h0Var) {
        h0Var.k();
        I.x.h(h0Var.h(), this.f2600e.k());
        return h0Var.j();
    }

    public int h() {
        I.w.b();
        return this.f2598c.i();
    }

    public final int i() {
        Integer num = (Integer) this.f2596a.f(C1013x0.f3272T, null);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = (Integer) this.f2596a.f(InterfaceC1015y0.f3283j, null);
        if (num2 == null || num2.intValue() != 4101) {
            return (num2 == null || num2.intValue() != 32) ? 256 : 32;
        }
        return 4101;
    }

    public void j(X.a aVar) {
        I.w.b();
        this.f2600e.b().accept(aVar);
    }

    public void k(androidx.camera.core.b.a aVar) {
        I.w.b();
        this.f2598c.r(aVar);
    }

    public final boolean l() {
        return this.f2600e.g() != null;
    }

    public void m(Q q8) {
        I.w.b();
        this.f2600e.h().accept(q8);
    }

    public C0965y(C1013x0 c1013x0, Size size, CameraCharacteristics cameraCharacteristics, AbstractC0885n abstractC0885n, boolean z8) {
        this(c1013x0, size, cameraCharacteristics, abstractC0885n, z8, null);
    }

    public C0965y(C1013x0 c1013x0, Size size, CameraCharacteristics cameraCharacteristics, AbstractC0885n abstractC0885n, boolean z8, F f8) {
        I.w.b();
        this.f2596a = c1013x0;
        this.f2597b = C0980g0.a.i(c1013x0).h();
        C0960t c0960t = new C0960t();
        this.f2598c = c0960t;
        Executor executorK0 = c1013x0.k0(J.a.c());
        Objects.requireNonNull(executorK0);
        P p8 = new P(executorK0, cameraCharacteristics, null);
        this.f2599d = p8;
        ArrayList arrayList = new ArrayList();
        if (c1013x0.Q() != 0) {
            arrayList.add(32);
            arrayList.add(256);
        } else {
            arrayList.add(Integer.valueOf(i()));
        }
        int iU = c1013x0.u();
        c1013x0.j0();
        C0960t.c cVarN = C0960t.c.n(size, iU, arrayList, z8, null, f8);
        this.f2600e = cVarN;
        p8.p(c0960t.s(cVarN));
    }
}
