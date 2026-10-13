package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.B;
import com.google.android.gms.internal.play_billing.G2;
import com.google.mlkit.common.internal.ckI.WqXA;
import org.json.JSONException;
import p138p3.C2767d;
import p138p3.InterfaceC2769e;
import p138p3.J;
import p138p3.V;
import p138p3.W;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i extends G2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2769e f17464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f17465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17466c;

    public /* synthetic */ i(InterfaceC2769e interfaceC2769e, W w8, int i8, J j8) {
        this.f17464a = interfaceC2769e;
        this.f17465b = w8;
        this.f17466c = i8;
    }

    @Override // com.google.android.gms.internal.play_billing.H2
    public final void b(Bundle bundle) {
        if (bundle == null) {
            W w8 = this.f17465b;
            d dVar = j.f17482j;
            w8.d(V.a(63, 13, dVar), this.f17466c);
            this.f17464a.a(dVar, null);
            return;
        }
        int iB = B.b(bundle, "BillingClient");
        String strF = B.f(bundle, "BillingClient");
        d.a aVarC = d.c();
        aVarC.c(iB);
        aVarC.b(strF);
        if (iB != 0) {
            B.j("BillingClient", hJroAgFztiMK.oqiCDmbZgrTX + iB);
            d dVarA = aVarC.a();
            this.f17465b.d(V.a(23, 13, dVarA), this.f17466c);
            this.f17464a.a(dVarA, null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            B.j("BillingClient", WqXA.NfOlnciMmgUAEk);
            aVarC.c(6);
            d dVarA2 = aVarC.a();
            this.f17465b.d(V.a(64, 13, dVarA2), this.f17466c);
            this.f17464a.a(dVarA2, null);
            return;
        }
        try {
            this.f17464a.a(aVarC.a(), new C2767d(bundle.getString("BILLING_CONFIG")));
        } catch (JSONException e8) {
            B.k("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e8);
            W w9 = this.f17465b;
            d dVar2 = j.f17482j;
            w9.d(V.a(65, 13, dVar2), this.f17466c);
            this.f17464a.a(dVar2, null);
        }
    }
}
