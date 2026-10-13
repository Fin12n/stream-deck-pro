package com.amazon.device.iap.internal.a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.amazon.a.a.i.h;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import p027d.LrLN.vHKCAgr;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f17065b = "a";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f17066e = "http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f17067f = "Amazon Appstore required";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f17068g = "Amazon Appstore Update Required";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f17069j = 31536000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f17070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.amazon.a.a.i.c f17071i;

    public a(com.amazon.a.a.i.c cVar) {
        super(cVar);
        this.f17071i = cVar;
    }

    @Override // com.amazon.a.a.e.c
    public long h() {
        return 31536000L;
    }

    public String toString() {
        return f17065b;
    }

    @Override // com.amazon.a.a.i.h
    public void i() {
        com.amazon.device.iap.internal.util.b.a(f17065b, LYdqVGvOGMNr.mPihxEKdLooIq);
        if (vHKCAgr.MVobDBFfEtESKV.equalsIgnoreCase(this.f17071i.e()) || f17068g.equalsIgnoreCase(this.f17071i.e())) {
            try {
                Activity activityB = this.f17070h.b();
                if (activityB == null) {
                    activityB = this.f17070h.a();
                }
                activityB.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(f17066e)));
            } catch (Exception e8) {
                com.amazon.device.iap.internal.util.b.b(f17065b, "Exception in PurchaseItemCommandTask.OnSuccess: " + e8);
            }
        }
    }
}
