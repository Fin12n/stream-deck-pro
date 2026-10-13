package p191w0;

import E1.p;

/* JADX INFO: renamed from: w0.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3061g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3061g0 f35892a = new C3061g0();

    public static /* synthetic */ C3063h0 b(C3061g0 c3061g0, p pVar, boolean z8, boolean z9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            pVar = p.f2155a;
        }
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        if ((i8 & 4) != 0) {
            z9 = true;
        }
        return c3061g0.a(pVar, z8, z9);
    }

    public final C3063h0 a(p pVar, boolean z8, boolean z9) {
        return new C3063h0(pVar, z8, z9);
    }
}
