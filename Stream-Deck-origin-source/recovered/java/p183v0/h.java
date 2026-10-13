package p183v0;

import A1.d;
import Q0.f;
import Q0.g;
import Q0.l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f35010a = A1.h.m(10);

    public static final float a(d dVar, boolean z8, long j8) {
        float fM = f.m(g.a(l.i(j8), l.g(j8))) / 2.0f;
        return z8 ? fM + dVar.E0(f35010a) : fM;
    }

    public static final float b(long j8) {
        return Math.max(l.i(j8), l.g(j8)) * 0.3f;
    }
}
