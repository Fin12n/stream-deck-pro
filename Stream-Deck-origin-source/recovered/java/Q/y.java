package Q;

import A.AbstractC0885n;
import A.C0868e0;
import A.InterfaceC0876i0;
import A.InterfaceC0878j0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f9062a;

    public y(AbstractC0885n abstractC0885n) {
        throw null;
    }

    public static /* synthetic */ Object a(final y yVar, final InterfaceC0876i0 interfaceC0876i0, final F1.c.a aVar) {
        yVar.f9062a.execute(new Runnable() { // from class: Q.x
            @Override // java.lang.Runnable
            public final void run() {
                y.b(this.f9059a, interfaceC0876i0, aVar);
            }
        });
        return "InternalImageProcessor#process " + interfaceC0876i0.hashCode();
    }

    public static /* synthetic */ void b(y yVar, InterfaceC0876i0 interfaceC0876i0, F1.c.a aVar) {
        yVar.getClass();
        throw null;
    }

    public InterfaceC0878j0 c(final InterfaceC0876i0 interfaceC0876i0) throws C0868e0 {
        try {
            p063h.s.a(F1.c.a(new F1.c.InterfaceC0112c() { // from class: Q.w
                @Override // F1.c.InterfaceC0112c
                public final Object a(F1.c.a aVar) {
                    return y.a(this.f9057a, interfaceC0876i0, aVar);
                }
            }).get());
            return null;
        } catch (Exception e8) {
            e = e8;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new C0868e0(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
