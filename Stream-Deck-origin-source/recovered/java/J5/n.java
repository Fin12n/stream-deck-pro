package J5;

import C6.G;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.u;
import p017b7.InterfaceC1815v0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends u implements Q6.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1815v0 f4348a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(InterfaceC1815v0 interfaceC1815v0) {
        super(1);
        this.f4348a = interfaceC1815v0;
    }

    public final void b(Throwable th) {
        if (th == null) {
            return;
        }
        this.f4348a.z(new CancellationException(th.getMessage()));
    }

    @Override // Q6.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return G.f1419a;
    }
}
