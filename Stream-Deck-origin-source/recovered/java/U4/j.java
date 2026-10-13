package U4;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends V4.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S4.l f10189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f10190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, S4.l lVar, S4.l lVar2) {
        super(lVar);
        this.f10190c = mVar;
        this.f10189b = lVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [V4.f, android.os.IInterface] */
    @Override // V4.j
    public final void a() {
        try {
            ?? E8 = this.f10190c.f10196a.e();
            String str = this.f10190c.f10197b;
            Bundle bundleA = n.a();
            m mVar = this.f10190c;
            E8.E(str, bundleA, new l(mVar, this.f10189b, mVar.f10197b));
        } catch (RemoteException e8) {
            m.f10195c.c(e8, "error requesting in-app review for %s", this.f10190c.f10197b);
            this.f10189b.d(new RuntimeException(e8));
        }
    }
}
