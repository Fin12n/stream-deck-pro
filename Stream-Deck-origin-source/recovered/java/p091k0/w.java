package p091k0;

import kotlin.jvm.internal.AbstractC2633k;
import p109m0.r;
import p109m0.x;
import p215z0.InterfaceC3160j0;
import p215z0.X0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3160j0 f28528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3160j0 f28529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f28531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f28532e;

    /* JADX WARN: Illegal instructions before constructor call */
    public w() {
        int i8 = 0;
        this(i8, i8, 3, null);
    }

    public final int a() {
        return this.f28528a.f();
    }

    public final x b() {
        return this.f28532e;
    }

    public final int c() {
        return this.f28529b.f();
    }

    public final void d(int i8, int i9) {
        g(i8, i9);
        this.f28531d = null;
    }

    public final void e(int i8) {
        this.f28528a.p(i8);
    }

    public final void f(int i8) {
        this.f28529b.p(i8);
    }

    public final void g(int i8, int i9) {
        if (i8 >= 0.0f) {
            e(i8);
            this.f28532e.o(i8);
            f(i9);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i8 + ')').toString());
        }
    }

    public final void h(s sVar) {
        t tVarK = sVar.k();
        this.f28531d = tVarK != null ? tVarK.c() : null;
        if (this.f28530c || sVar.a() > 0) {
            this.f28530c = true;
            int iL = sVar.l();
            if (iL >= 0.0f) {
                t tVarK2 = sVar.k();
                g(tVarK2 != null ? tVarK2.getIndex() : 0, iL);
            } else {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + iL + ')').toString());
            }
        }
    }

    public final void i(int i8) {
        if (i8 >= 0.0f) {
            f(i8);
            return;
        }
        throw new IllegalStateException(("scrollOffset should be non-negative (" + i8 + ')').toString());
    }

    public final int j(m mVar, int i8) {
        int iA = r.a(mVar, this.f28531d, i8);
        if (i8 != iA) {
            e(iA);
            this.f28532e.o(i8);
        }
        return iA;
    }

    public w(int i8, int i9) {
        this.f28528a = X0.a(i8);
        this.f28529b = X0.a(i9);
        this.f28532e = new x(i8, 30, 100);
    }

    public /* synthetic */ w(int i8, int i9, int i10, AbstractC2633k abstractC2633k) {
        this((i10 & 1) != 0 ? 0 : i8, (i10 & 2) != 0 ? 0 : i9);
    }
}
