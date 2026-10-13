package p017b7;

import G6.d;
import p062g7.C2372k;

/* JADX INFO: renamed from: b7.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1801o {
    public static final void a(InterfaceC1795l interfaceC1795l, InterfaceC1776b0 interfaceC1776b0) {
        c(interfaceC1795l, new C1778c0(interfaceC1776b0));
    }

    public static final C1797m b(d dVar) {
        if (!(dVar instanceof C2372k)) {
            return new C1797m(dVar, 1);
        }
        C1797m c1797mJ = ((C2372k) dVar).j();
        if (c1797mJ != null) {
            if (!c1797mJ.N()) {
                c1797mJ = null;
            }
            if (c1797mJ != null) {
                return c1797mJ;
            }
        }
        return new C1797m(dVar, 2);
    }

    public static final void c(InterfaceC1795l interfaceC1795l, InterfaceC1793k interfaceC1793k) {
        if (!(interfaceC1795l instanceof C1797m)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C1797m) interfaceC1795l).D(interfaceC1793k);
    }
}
