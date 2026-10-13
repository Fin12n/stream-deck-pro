package U4;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f10186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f10187b = new Handler(Looper.getMainLooper());

    public h(m mVar) {
        this.f10186a = mVar;
    }

    @Override // U4.c
    public final S4.k a(Activity activity, b bVar) {
        if (bVar.b()) {
            return S4.n.d(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", bVar.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        S4.l lVar = new S4.l();
        intent.putExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER, new g(this, this.f10187b, lVar));
        activity.startActivity(intent);
        return lVar.a();
    }

    @Override // U4.c
    public final S4.k b() {
        return this.f10186a.a();
    }
}
