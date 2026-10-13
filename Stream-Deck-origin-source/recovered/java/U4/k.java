package U4;

import V4.t;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k extends V4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V4.i f10191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S4.l f10192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f10193c;

    public k(m mVar, V4.i iVar, S4.l lVar) {
        this.f10193c = mVar;
        this.f10191a = iVar;
        this.f10192b = lVar;
    }

    @Override // V4.h
    public void D(Bundle bundle) {
        t tVar = this.f10193c.f10196a;
        if (tVar != null) {
            tVar.r(this.f10192b);
        }
        this.f10191a.d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
