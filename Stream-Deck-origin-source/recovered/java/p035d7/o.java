package p035d7;

import java.util.concurrent.CancellationException;
import p017b7.AbstractC1794k0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class o {
    public static final void a(x xVar, Throwable th) {
        CancellationException cancellationExceptionA = null;
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = AbstractC1794k0.a("Channel was consumed, consumer had failed", th);
            }
        }
        xVar.z(cancellationExceptionA);
    }
}
