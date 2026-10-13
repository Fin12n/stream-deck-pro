package com.amazon.a.a.i;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f16446b = "a";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f16447e = "http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f16448f = "Amazon Appstore required";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f16449g = "Amazon Appstore Update Required";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f16450j = 31536000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f16451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f16452i;

    public a(c cVar) {
        super(cVar);
        this.f16452i = cVar;
    }

    @Override // com.amazon.a.a.e.c
    public long h() {
        return 31536000L;
    }

    @Override // com.amazon.a.a.i.h
    public void i() {
        if (f16448f.equalsIgnoreCase(this.f16452i.e()) || f16449g.equalsIgnoreCase(this.f16452i.e())) {
            try {
                Activity activityB = this.f16451h.b();
                if (activityB == null) {
                    activityB = this.f16451h.a();
                }
                activityB.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(f16447e)));
            } catch (Exception unused) {
            }
        }
    }

    public String toString() {
        return f16446b;
    }
}
