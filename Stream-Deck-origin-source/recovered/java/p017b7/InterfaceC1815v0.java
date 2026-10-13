package p017b7;

import G6.d;
import G6.g;
import Q6.k;
import Q6.o;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: b7.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1815v0 extends g.b {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final b f15985O = b.f15986a;

    /* JADX INFO: renamed from: b7.v0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC1815v0 interfaceC1815v0, CancellationException cancellationException, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i8 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC1815v0.z(cancellationException);
        }

        public static Object b(InterfaceC1815v0 interfaceC1815v0, Object obj, o oVar) {
            return g.b.a.a(interfaceC1815v0, obj, oVar);
        }

        public static g.b c(InterfaceC1815v0 interfaceC1815v0, g.c cVar) {
            return g.b.a.b(interfaceC1815v0, cVar);
        }

        public static /* synthetic */ InterfaceC1776b0 d(InterfaceC1815v0 interfaceC1815v0, boolean z8, boolean z9, k kVar, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i8 & 1) != 0) {
                z8 = false;
            }
            if ((i8 & 2) != 0) {
                z9 = true;
            }
            return interfaceC1815v0.K1(z8, z9, kVar);
        }

        public static g e(InterfaceC1815v0 interfaceC1815v0, g.c cVar) {
            return g.b.a.c(interfaceC1815v0, cVar);
        }

        public static g f(InterfaceC1815v0 interfaceC1815v0, g gVar) {
            return g.b.a.d(interfaceC1815v0, gVar);
        }
    }

    /* JADX INFO: renamed from: b7.v0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f15986a = new b();
    }

    InterfaceC1776b0 H0(k kVar);

    InterfaceC1776b0 K1(boolean z8, boolean z9, k kVar);

    Y6.g Y();

    boolean b();

    InterfaceC1815v0 getParent();

    Object i0(d dVar);

    boolean isCancelled();

    r j0(InterfaceC1810t interfaceC1810t);

    CancellationException r0();

    boolean start();

    boolean y();

    void z(CancellationException cancellationException);
}
