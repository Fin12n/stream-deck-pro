package V4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class s implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f10705a;

    public /* synthetic */ s(t tVar, r rVar) {
        this.f10705a = tVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f10705a.f10708b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        t tVar = this.f10705a;
        tVar.c().post(new p(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f10705a.f10708b.d(RaiWHuj.KLDkqmNspDWitm, componentName);
        t tVar = this.f10705a;
        tVar.c().post(new q(this));
    }
}
