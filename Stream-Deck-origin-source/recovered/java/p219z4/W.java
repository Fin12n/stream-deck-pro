package p219z4;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class W extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC3194c f39115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39116b;

    public W(AbstractC3194c abstractC3194c, int i8) {
        this.f39115a = abstractC3194c;
        this.f39116b = i8;
    }

    @Override // p219z4.InterfaceC3202k
    public final void t(int i8, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // p219z4.InterfaceC3202k
    public final void x(int i8, IBinder iBinder, a0 a0Var) {
        AbstractC3194c abstractC3194c = this.f39115a;
        AbstractC3207p.l(abstractC3194c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AbstractC3207p.k(a0Var);
        AbstractC3194c.a0(abstractC3194c, a0Var);
        z(i8, iBinder, a0Var.f39122a);
    }

    @Override // p219z4.InterfaceC3202k
    public final void z(int i8, IBinder iBinder, Bundle bundle) {
        AbstractC3207p.l(this.f39115a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f39115a.M(i8, iBinder, bundle, this.f39116b);
        this.f39115a = null;
    }
}
