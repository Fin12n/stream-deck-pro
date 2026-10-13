package com.amazon.device.iap.internal;

import android.app.Application;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f17122a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f17123b = b.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile e f17124c;

    private b() {
    }

    public static b a() {
        return f17122a;
    }

    public e a(Context context) {
        if (f17124c == null) {
            synchronized (b.class) {
                try {
                    if (f17124c == null) {
                        if (com.amazon.a.a.a((Application) context.getApplicationContext())) {
                            f17124c = new com.amazon.device.iap.internal.c.e();
                        } else {
                            f17124c = new com.amazon.device.iap.internal.a.d();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17124c;
    }
}
