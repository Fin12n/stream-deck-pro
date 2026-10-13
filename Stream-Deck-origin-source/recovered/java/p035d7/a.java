package p035d7;

import G6.g;
import java.util.concurrent.CancellationException;
import p017b7.AbstractC1794k0;
import p017b7.H;
import p017b7.InterfaceC1815v0;
import p017b7.N;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a extends h implements c {
    public a(g gVar, g gVar2, boolean z8) {
        super(gVar, gVar2, false, z8);
        k0((InterfaceC1815v0) gVar.A(InterfaceC1815v0.f15985O));
    }

    @Override // p017b7.D0
    public boolean f0(Throwable th) {
        H.a(getContext(), th);
        return true;
    }

    @Override // p017b7.D0
    public void z0(Throwable th) {
        g gVarD1 = d1();
        CancellationException cancellationExceptionA = null;
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = AbstractC1794k0.a(N.a(this) + " was cancelled", th);
            }
        }
        gVarD1.z(cancellationExceptionA);
    }
}
