package p038e1;

import Q0.h;

/* JADX INFO: renamed from: e1.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2247s {
    static /* synthetic */ h t(InterfaceC2247s interfaceC2247s, InterfaceC2247s interfaceC2247s2, boolean z8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        return interfaceC2247s.O(interfaceC2247s2, z8);
    }

    void C(InterfaceC2247s interfaceC2247s, float[] fArr);

    long K(long j8);

    InterfaceC2247s N();

    h O(InterfaceC2247s interfaceC2247s, boolean z8);

    long S(long j8);

    long a();

    long n(long j8);

    long o(InterfaceC2247s interfaceC2247s, long j8);

    boolean y();
}
