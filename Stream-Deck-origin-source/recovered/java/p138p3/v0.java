package p138p3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.d;
import com.google.android.gms.internal.play_billing.B;
import com.google.android.gms.internal.play_billing.C2008e0;
import com.google.android.gms.internal.play_billing.R1;
import com.pairip.VMRunner;
import p027d.LrLN.vHKCAgr;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f31216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f31218c;

    public v0(w0 w0Var, boolean z8) {
        this.f31218c = w0Var;
        this.f31217b = z8;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f31216a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f31217b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f31216a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter, String str) {
        v0 v0Var;
        try {
            try {
                if (this.f31216a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    v0Var = this;
                    context.registerReceiver(v0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f31217b ? 4 : 2);
                } else {
                    v0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                v0Var.f31216a = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void c(Context context) {
        if (!this.f31216a) {
            B.j("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f31216a = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("4SjRgOdxfWWhzuqu", new Object[]{this, context, intent});
    }

    public final void d(Bundle bundle, d dVar, int i8) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
            this.f31218c.f31223c.e(V.a(23, i8, dVar));
            return;
        }
        try {
            this.f31218c.f31223c.e(R1.B(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), C2008e0.a()));
        } catch (Throwable unused) {
            B.j("BillingBroadcastManager", vHKCAgr.iOHGnSkEhhocDb);
        }
    }
}
