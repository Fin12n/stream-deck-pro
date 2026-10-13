package com.amazon.device.drm.a;

import android.app.Application;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f17024a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile c f17025b;

    private a() {
    }

    public static a a() {
        return f17024a;
    }

    public c a(Context context) {
        if (f17025b == null) {
            synchronized (a.class) {
                try {
                    if (f17025b == null) {
                        if (com.amazon.a.a.a((Application) context.getApplicationContext())) {
                            f17025b = new com.amazon.device.drm.a.d.c();
                        } else {
                            f17025b = new com.amazon.device.drm.a.b.c();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17025b;
    }
}
