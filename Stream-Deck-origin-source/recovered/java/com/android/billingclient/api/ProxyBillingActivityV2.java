package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.B;
import p009b.ActivityC1747j;
import p036e.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivityV2 extends ActivityC1747j {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p036e.c f17335w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p036e.c f17336x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ResultReceiver f17337y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ResultReceiver f17338z;

    public final void a0(p036e.a aVar) {
        Intent intentA = aVar.a();
        int iB = B.d(intentA, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.f17337y;
        if (resultReceiver != null) {
            resultReceiver.send(iB, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.b() != -1 || iB != 0) {
            B.j("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + aVar.b() + " and billing's responseCode: " + iB);
        }
        finish();
    }

    public final void b0(p036e.a aVar) {
        Intent intentA = aVar.a();
        int iB = B.d(intentA, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.f17338z;
        if (resultReceiver != null) {
            resultReceiver.send(iB, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.b() != -1 || iB != 0) {
            B.j("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(aVar.b()), Integer.valueOf(iB)));
        }
        finish();
    }

    @Override // p009b.ActivityC1747j, H1.f, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f17335w = Y(new p045f.g(), new p036e.b() { // from class: p3.j0
            @Override // p036e.b
            public final void a(Object obj) {
                this.f31196a.a0((a) obj);
            }
        });
        this.f17336x = Y(new p045f.g(), new p036e.b() { // from class: p3.k0
            @Override // p036e.b
            public final void a(Object obj) {
                this.f31199a.b0((a) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f17337y = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f17338z = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        B.i("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f17337y = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f17335w.a(new e.g.a(pendingIntent).a());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f17338z = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f17336x.a(new e.g.a(pendingIntent2).a());
        }
    }

    @Override // p009b.ActivityC1747j, H1.f, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f17337y;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f17338z;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
