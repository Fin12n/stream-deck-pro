package p138p3;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.b;
import com.google.android.gms.internal.play_billing.B;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class E extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2775j f31172a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(b bVar, Handler handler, InterfaceC2775j interfaceC2775j) {
        super(handler);
        this.f31172a = interfaceC2775j;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i8, Bundle bundle) {
        this.f31172a.a(B.e(bundle, "BillingClient"));
    }
}
