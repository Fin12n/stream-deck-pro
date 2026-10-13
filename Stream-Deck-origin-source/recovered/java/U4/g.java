package U4;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S4.l f10185a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Handler handler, S4.l lVar) {
        super(handler);
        this.f10185a = lVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i8, Bundle bundle) {
        this.f10185a.e(null);
    }
}
