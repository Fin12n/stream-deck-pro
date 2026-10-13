package com.amazon.device.simplesignin.a;

import android.app.Application;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17226a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f17227b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile b f17228c;

    private a() {
    }

    public static a a() {
        return f17227b;
    }

    public boolean b(Context context) {
        return com.amazon.a.a.a((Application) context.getApplicationContext());
    }

    public b a(Context context) {
        if (f17228c == null) {
            synchronized (a.class) {
                try {
                    if (f17228c == null) {
                        if (b(context)) {
                            f17228c = new com.amazon.device.simplesignin.a.c.b();
                            com.amazon.device.simplesignin.a.d.a.a(f17226a, "SDK initialized in Sandbox mode.");
                        } else {
                            f17228c = new com.amazon.device.simplesignin.a.a.b();
                            com.amazon.device.simplesignin.a.d.a.a(f17226a, "SDK initialized in Production mode.");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17228c;
    }
}
