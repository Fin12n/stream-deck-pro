package p100l0;

import java.util.Arrays;
import kotlin.jvm.internal.t;
import p017b7.J;
import p109m0.C2668f;
import p109m0.C2670h;

/* JADX INFO: renamed from: l0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2643d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2668f[] f28973c = m.f29018a;

    public C2643d(int i8, int i9) {
        this.f28971a = i8;
        this.f28972b = i9;
    }

    public final C2668f[] a() {
        return this.f28973c;
    }

    public final int b() {
        return this.f28972b;
    }

    public final int c() {
        return this.f28971a;
    }

    public final void d(int i8) {
        this.f28972b = i8;
    }

    public final void e(int i8) {
        this.f28971a = i8;
    }

    public final void f(w wVar, J j8) {
        int length = this.f28973c.length;
        for (int iN = wVar.n(); iN < length; iN++) {
            C2668f c2668f = this.f28973c[iN];
            if (c2668f != null) {
                c2668f.z();
            }
        }
        if (this.f28973c.length != wVar.n()) {
            Object[] objArrCopyOf = Arrays.copyOf(this.f28973c, wVar.n());
            t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.f28973c = (C2668f[]) objArrCopyOf;
        }
        int iN2 = wVar.n();
        for (int i8 = 0; i8 < iN2; i8++) {
            C2670h c2670hC = m.c(wVar.m(i8));
            if (c2670hC == null) {
                C2668f c2668f2 = this.f28973c[i8];
                if (c2668f2 != null) {
                    c2668f2.z();
                }
                this.f28973c[i8] = null;
            } else {
                C2668f c2668f3 = this.f28973c[i8];
                if (c2668f3 == null) {
                    c2668f3 = new C2668f(j8);
                    this.f28973c[i8] = c2668f3;
                }
                c2668f3.s(c2670hC.d2());
                c2668f3.w(c2670hC.e2());
            }
        }
    }
}
