package p138p3;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivity;
import com.google.android.gms.internal.play_billing.B;
import com.google.android.gms.internal.play_billing.L2;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class L extends L2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f31177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResultReceiver f31178b;

    public /* synthetic */ L(WeakReference weakReference, ResultReceiver resultReceiver, K k8) {
        this.f31177a = weakReference;
        this.f31178b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.M2
    public final void b(Bundle bundle) {
        ResultReceiver resultReceiver = this.f31178b;
        if (resultReceiver == null) {
            B.j("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.f31177a.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || pendingIntent == null) {
            this.f31178b.send(0, null);
            B.j("BillingClient", "Unable to launch intent for in-app messaging");
            return;
        }
        try {
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra("in_app_message_result_receiver", this.f31178b);
            intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (CancellationException e8) {
            this.f31178b.send(0, null);
            B.k("BillingClient", "Exception caught while launching intent for in-app messaging.", e8);
        }
    }
}
