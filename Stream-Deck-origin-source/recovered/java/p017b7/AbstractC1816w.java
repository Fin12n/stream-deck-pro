package p017b7;

import C6.q;

/* JADX INFO: renamed from: b7.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1816w {
    public static final InterfaceC1812u a(InterfaceC1815v0 interfaceC1815v0) {
        return new C1814v(interfaceC1815v0);
    }

    public static /* synthetic */ InterfaceC1812u b(InterfaceC1815v0 interfaceC1815v0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC1815v0 = null;
        }
        return a(interfaceC1815v0);
    }

    public static final boolean c(InterfaceC1812u interfaceC1812u, Object obj) {
        Throwable thE = q.e(obj);
        return thE == null ? interfaceC1812u.r1(obj) : interfaceC1812u.v(thE);
    }
}
