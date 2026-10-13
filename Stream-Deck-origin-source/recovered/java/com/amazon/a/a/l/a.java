package com.amazon.a.a.l;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f16529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Intent f16532d;

    public a(Activity activity, int i8, int i9, Intent intent) {
        this.f16529a = activity;
        this.f16530b = i8;
        this.f16531c = i9;
        this.f16532d = intent;
    }

    public Activity a() {
        return this.f16529a;
    }

    public int b() {
        return this.f16530b;
    }

    public Intent c() {
        return this.f16532d;
    }

    public int d() {
        return this.f16531c;
    }

    public String toString() {
        return "ActivtyResult: [ requestCode: " + this.f16530b + ", resultCode: " + this.f16531c + ", activity: " + this.f16529a + ", intent: " + this.f16532d + "]";
    }
}
