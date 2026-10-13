package U4;

import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10194d;

    public l(m mVar, S4.l lVar, String str) {
        super(mVar, new V4.i("OnRequestInstallCallback"), lVar);
        this.f10194d = str;
    }

    @Override // U4.k, V4.h
    public final void D(Bundle bundle) {
        super.D(bundle);
        this.f10192b.e(new e((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
