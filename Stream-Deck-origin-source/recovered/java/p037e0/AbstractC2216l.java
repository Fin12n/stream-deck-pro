package p037e0;

import kotlin.jvm.internal.C2635m;

/* JADX INFO: renamed from: e0.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2216l {
    public static final C2215k a(float f8, float f9, long j8, long j9, boolean z8) {
        return new C2215k(l0.i(C2635m.f28814a), Float.valueOf(f8), r.a(f9), j8, j9, z8);
    }

    public static final C2215k b(j0 j0Var, Object obj, Object obj2, long j8, long j9, boolean z8) {
        return new C2215k(j0Var, obj, (AbstractC2221q) j0Var.a().invoke(obj2), j8, j9, z8);
    }

    public static /* synthetic */ C2215k c(float f8, float f9, long j8, long j9, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f9 = 0.0f;
        }
        if ((i8 & 4) != 0) {
            j8 = Long.MIN_VALUE;
        }
        if ((i8 & 8) != 0) {
            j9 = Long.MIN_VALUE;
        }
        if ((i8 & 16) != 0) {
            z8 = false;
        }
        return a(f8, f9, j8, j9, z8);
    }

    public static /* synthetic */ C2215k d(j0 j0Var, Object obj, Object obj2, long j8, long j9, boolean z8, int i8, Object obj3) {
        if ((i8 & 8) != 0) {
            j8 = Long.MIN_VALUE;
        }
        if ((i8 & 16) != 0) {
            j9 = Long.MIN_VALUE;
        }
        if ((i8 & 32) != 0) {
            z8 = false;
        }
        return b(j0Var, obj, obj2, j8, j9, z8);
    }

    public static final C2215k e(C2215k c2215k, float f8, float f9, long j8, long j9, boolean z8) {
        return new C2215k(c2215k.o(), Float.valueOf(f8), r.a(f9), j8, j9, z8);
    }

    public static final C2215k f(C2215k c2215k, Object obj, AbstractC2221q abstractC2221q, long j8, long j9, boolean z8) {
        return new C2215k(c2215k.o(), obj, abstractC2221q, j8, j9, z8);
    }

    public static /* synthetic */ C2215k g(C2215k c2215k, float f8, float f9, long j8, long j9, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = ((Number) c2215k.getValue()).floatValue();
        }
        if ((i8 & 2) != 0) {
            f9 = ((C2217m) c2215k.s()).f();
        }
        if ((i8 & 4) != 0) {
            j8 = c2215k.e();
        }
        if ((i8 & 8) != 0) {
            j9 = c2215k.c();
        }
        if ((i8 & 16) != 0) {
            z8 = c2215k.A();
        }
        boolean z9 = z8;
        long j10 = j9;
        return e(c2215k, f8, f9, j8, j10, z9);
    }

    public static /* synthetic */ C2215k h(C2215k c2215k, Object obj, AbstractC2221q abstractC2221q, long j8, long j9, boolean z8, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            obj = c2215k.getValue();
        }
        if ((i8 & 2) != 0) {
            abstractC2221q = r.e(c2215k.s());
        }
        if ((i8 & 4) != 0) {
            j8 = c2215k.e();
        }
        if ((i8 & 8) != 0) {
            j9 = c2215k.c();
        }
        if ((i8 & 16) != 0) {
            z8 = c2215k.A();
        }
        boolean z9 = z8;
        long j10 = j9;
        return f(c2215k, obj, abstractC2221q, j8, j10, z9);
    }

    public static final AbstractC2221q i(j0 j0Var, Object obj) {
        AbstractC2221q abstractC2221q = (AbstractC2221q) j0Var.a().invoke(obj);
        abstractC2221q.d();
        return abstractC2221q;
    }
}
