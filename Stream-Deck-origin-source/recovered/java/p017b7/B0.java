package p017b7;

import C6.G;
import G6.d;
import G6.g;
import H6.c;
import Q6.k;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C2639q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class B0 {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a extends C2639q implements k {
        public a(Object obj) {
            super(1, obj, InterfaceC1809s0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        public final void h(Throwable th) {
            ((InterfaceC1809s0) this.receiver).a(th);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            h((Throwable) obj);
            return G.f1419a;
        }
    }

    public static final InterfaceC1818x a(InterfaceC1815v0 interfaceC1815v0) {
        return new C1821y0(interfaceC1815v0);
    }

    public static /* synthetic */ InterfaceC1818x b(InterfaceC1815v0 interfaceC1815v0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC1815v0 = null;
        }
        return AbstractC1823z0.a(interfaceC1815v0);
    }

    public static final void c(g gVar, CancellationException cancellationException) {
        InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) gVar.A(InterfaceC1815v0.f15985O);
        if (interfaceC1815v0 != null) {
            interfaceC1815v0.z(cancellationException);
        }
    }

    public static final void d(InterfaceC1815v0 interfaceC1815v0, String str, Throwable th) {
        interfaceC1815v0.z(AbstractC1794k0.a(str, th));
    }

    public static /* synthetic */ void e(g gVar, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = null;
        }
        AbstractC1823z0.c(gVar, cancellationException);
    }

    public static /* synthetic */ void f(InterfaceC1815v0 interfaceC1815v0, String str, Throwable th, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            th = null;
        }
        AbstractC1823z0.d(interfaceC1815v0, str, th);
    }

    public static final Object g(InterfaceC1815v0 interfaceC1815v0, d dVar) {
        InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
        Object objI0 = interfaceC1815v0.i0(dVar);
        return objI0 == c.f() ? objI0 : G.f1419a;
    }

    public static final void h(InterfaceC1815v0 interfaceC1815v0, CancellationException cancellationException) {
        Iterator it = interfaceC1815v0.Y().iterator();
        while (it.hasNext()) {
            ((InterfaceC1815v0) it.next()).z(cancellationException);
        }
    }

    public static /* synthetic */ void i(InterfaceC1815v0 interfaceC1815v0, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = null;
        }
        AbstractC1823z0.h(interfaceC1815v0, cancellationException);
    }

    public static final InterfaceC1776b0 j(InterfaceC1815v0 interfaceC1815v0, InterfaceC1776b0 interfaceC1776b0) {
        return o(interfaceC1815v0, false, false, new C1780d0(interfaceC1776b0), 3, null);
    }

    public static final void k(g gVar) {
        InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) gVar.A(InterfaceC1815v0.f15985O);
        if (interfaceC1815v0 != null) {
            AbstractC1823z0.m(interfaceC1815v0);
        }
    }

    public static final void l(InterfaceC1815v0 interfaceC1815v0) {
        if (!interfaceC1815v0.b()) {
            throw interfaceC1815v0.r0();
        }
    }

    public static final InterfaceC1815v0 m(g gVar) {
        InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) gVar.A(InterfaceC1815v0.f15985O);
        if (interfaceC1815v0 != null) {
            return interfaceC1815v0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + gVar).toString());
    }

    public static final InterfaceC1776b0 n(InterfaceC1815v0 interfaceC1815v0, boolean z8, boolean z9, InterfaceC1809s0 interfaceC1809s0) {
        return interfaceC1815v0 instanceof D0 ? ((D0) interfaceC1815v0).l0(z8, z9, interfaceC1809s0) : interfaceC1815v0.K1(z8, z9, new a(interfaceC1809s0));
    }

    public static /* synthetic */ InterfaceC1776b0 o(InterfaceC1815v0 interfaceC1815v0, boolean z8, boolean z9, InterfaceC1809s0 interfaceC1809s0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        if ((i8 & 2) != 0) {
            z9 = true;
        }
        return AbstractC1823z0.o(interfaceC1815v0, z8, z9, interfaceC1809s0);
    }

    public static final boolean p(g gVar) {
        InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) gVar.A(InterfaceC1815v0.f15985O);
        if (interfaceC1815v0 != null) {
            return interfaceC1815v0.b();
        }
        return true;
    }
}
