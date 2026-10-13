package p017b7;

import G6.d;
import Q6.k;

/* JADX INFO: renamed from: b7.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1795l extends d {

    /* JADX INFO: renamed from: b7.l$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC1795l interfaceC1795l, Throwable th, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i8 & 1) != 0) {
                th = null;
            }
            return interfaceC1795l.f(th);
        }
    }

    void C(F f8, Object obj);

    Object F(Object obj, Object obj2, k kVar);

    void G(Object obj, k kVar);

    void J(k kVar);

    void K(Object obj);

    boolean f(Throwable th);

    boolean isCancelled();

    boolean y();
}
