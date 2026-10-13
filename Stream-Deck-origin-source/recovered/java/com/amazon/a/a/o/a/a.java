package com.amazon.a.a.o.a;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f16698a = true;

    public static void a() {
        a(Looper.getMainLooper().getThread().getId());
    }

    public static void b(Object obj, String str) {
        a(obj != null, str);
    }

    public static void c(Object obj, String str) {
        a(obj == null, str);
    }

    public static void b(boolean z8, String str) {
        if (z8) {
            a(str);
        }
    }

    public static void a(long j8) {
        if (Thread.currentThread().getId() != j8) {
            a("Executing thread must be thread: " + j8 + ", was: " + Thread.currentThread().getId());
        }
    }

    public static void a(String str) {
        throw new b(str);
    }

    public static void a(String str, Throwable th) {
        throw new b(str, th);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            a("Argument: " + str + " cannot be null");
        }
    }

    public static void a(Object obj, Object obj2, String str) {
        a(a(obj, obj2), str);
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void a(boolean z8, String str) {
        if (z8) {
            return;
        }
        a(str);
    }
}
