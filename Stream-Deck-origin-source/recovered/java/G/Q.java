package G;

import A.C0864c0;
import A.C0868e0;
import H.InterfaceC0978f0;
import H.InterfaceC0982h0;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h0 f2489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f2490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Matrix f2493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final W f2494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f2496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Y4.a f2497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2498k = -1;

    public Q(InterfaceC0978f0 interfaceC0978f0, h0 h0Var, W w8, Y4.a aVar, int i8) {
        this.f2488a = i8;
        this.f2489b = h0Var;
        h0Var.l();
        h0Var.n();
        this.f2492e = h0Var.j();
        this.f2491d = h0Var.m();
        this.f2490c = h0Var.h();
        this.f2493f = h0Var.o();
        this.f2494g = w8;
        this.f2495h = String.valueOf(interfaceC0978f0.hashCode());
        this.f2496i = new ArrayList();
        List listA = interfaceC0978f0.a();
        Objects.requireNonNull(listA);
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            this.f2496i.add(Integer.valueOf(((InterfaceC0982h0) it.next()).getId()));
        }
        this.f2497j = aVar;
    }

    public Y4.a a() {
        return this.f2497j;
    }

    public Rect b() {
        return this.f2490c;
    }

    public int c() {
        return this.f2492e;
    }

    public C0864c0.g d() {
        return null;
    }

    public int e() {
        return this.f2488a;
    }

    public int f() {
        return this.f2491d;
    }

    public C0864c0.g g() {
        return null;
    }

    public Matrix h() {
        return this.f2493f;
    }

    public List i() {
        return this.f2496i;
    }

    public String j() {
        return this.f2495h;
    }

    public h0 k() {
        return this.f2489b;
    }

    public boolean l() {
        return this.f2494g.a();
    }

    public boolean m() {
        d();
        g();
        return true;
    }

    public void n(C0868e0 c0868e0) {
        this.f2494g.g(c0868e0);
    }

    public void o(int i8) {
        if (this.f2498k != i8) {
            this.f2498k = i8;
            this.f2494g.b(i8);
        }
    }

    public void p() {
        this.f2494g.f();
    }

    public void q(C0864c0.h hVar) {
        this.f2494g.i(hVar);
    }

    public void r(androidx.camera.core.d dVar) {
        this.f2494g.h(dVar);
    }

    public void s() {
        if (this.f2498k != -1) {
            o(100);
        }
        this.f2494g.c();
    }

    public void t(Bitmap bitmap) {
        this.f2494g.e(bitmap);
    }

    public void u(C0868e0 c0868e0) {
        this.f2494g.d(c0868e0);
    }
}
