package p037e0;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final C2217m a(float f8) {
        return new C2217m(f8);
    }

    public static final C2218n b(float f8, float f9) {
        return new C2218n(f8, f9);
    }

    public static final C2219o c(float f8, float f9, float f10) {
        return new C2219o(f8, f9, f10);
    }

    public static final C2220p d(float f8, float f9, float f10, float f11) {
        return new C2220p(f8, f9, f10, f11);
    }

    public static final AbstractC2221q e(AbstractC2221q abstractC2221q) {
        AbstractC2221q abstractC2221qG = g(abstractC2221q);
        int iB = abstractC2221qG.b();
        for (int i8 = 0; i8 < iB; i8++) {
            abstractC2221qG.e(i8, abstractC2221q.a(i8));
        }
        return abstractC2221qG;
    }

    public static final void f(AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2) {
        int iB = abstractC2221q.b();
        for (int i8 = 0; i8 < iB; i8++) {
            abstractC2221q.e(i8, abstractC2221q2.a(i8));
        }
    }

    public static final AbstractC2221q g(AbstractC2221q abstractC2221q) {
        AbstractC2221q abstractC2221qC = abstractC2221q.c();
        t.e(abstractC2221qC, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return abstractC2221qC;
    }
}
