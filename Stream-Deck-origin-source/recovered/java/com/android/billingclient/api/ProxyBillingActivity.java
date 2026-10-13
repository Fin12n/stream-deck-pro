package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.B;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import p138p3.V;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ResultReceiver f17331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ResultReceiver f17332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17334d;

    public final Intent a(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    public final Intent b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i8, int i9, Intent intent) {
        Intent intentB;
        super.onActivityResult(i8, i9, intent);
        if (i8 == 100 || i8 == 110) {
            int iB = B.d(intent, "ProxyBillingActivity").b();
            if (i9 != -1) {
                B.j("ProxyBillingActivity", "Activity finished with resultCode " + i9 + " and billing's responseCode: " + iB);
            } else if (iB != 0) {
                i9 = -1;
                B.j("ProxyBillingActivity", "Activity finished with resultCode " + i9 + " and billing's responseCode: " + iB);
            } else {
                iB = 0;
            }
            ResultReceiver resultReceiver = this.f17331a;
            if (resultReceiver != null) {
                resultReceiver.send(iB, intent != null ? intent.getExtras() : null);
            } else {
                if (intent == null) {
                    intentB = b();
                } else if (intent.getExtras() != null) {
                    String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                    if (string != null) {
                        intentB = a(string);
                        intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    } else {
                        intentB = b();
                        intentB.putExtras(intent.getExtras());
                        intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    }
                } else {
                    intentB = b();
                    B.j("ProxyBillingActivity", "Got null bundle!");
                    intentB.putExtra("RESPONSE_CODE", 6);
                    intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    d.a aVarC = d.c();
                    aVarC.c(6);
                    aVarC.b("An internal error occurred.");
                    intentB.putExtra("FAILURE_LOGGING_PAYLOAD", V.a(22, 2, aVarC.a()).e());
                    intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                if (i8 == 110) {
                    intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentB);
            }
        } else if (i8 == 101) {
            int iA = B.a(intent, "ProxyBillingActivity");
            ResultReceiver resultReceiver2 = this.f17332b;
            if (resultReceiver2 != null) {
                resultReceiver2.send(iA, intent != null ? intent.getExtras() : null);
            }
        } else {
            B.j("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i8 + "; skipping...");
        }
        this.f17333c = false;
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int i8;
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            B.i("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f17333c = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER)) {
                this.f17331a = (ResultReceiver) bundle.getParcelable(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER);
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f17332b = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f17334d = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            return;
        }
        B.i("ProxyBillingActivity", "Launching Play Store billing flow");
        int i9 = 100;
        try {
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.f17334d = true;
                    i9 = 110;
                }
            } else {
                if (!getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                    if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                        pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                        this.f17332b = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                        i9 = 101;
                    } else {
                        i8 = 100;
                        pendingIntent = null;
                    }
                    this.f17333c = true;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), i8, new Intent(), 0, 0, 0);
                    return;
                }
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.f17331a = (ResultReceiver) getIntent().getParcelableExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER);
            }
            this.f17333c = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), i8, new Intent(), 0, 0, 0);
            return;
        } catch (IntentSender.SendIntentException e8) {
            B.k("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e8);
            ResultReceiver resultReceiver = this.f17331a;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f17332b;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentB = b();
                    if (this.f17334d) {
                        intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    intentB.putExtra("RESPONSE_CODE", 6);
                    intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentB);
                }
            }
            this.f17333c = false;
            finish();
            return;
        }
        i8 = i9;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f17333c) {
            Intent intentB = b();
            intentB.putExtra("RESPONSE_CODE", 1);
            intentB.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(intentB);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f17331a;
        if (resultReceiver != null) {
            bundle.putParcelable(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER, resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f17332b;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f17333c);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f17334d);
    }
}
