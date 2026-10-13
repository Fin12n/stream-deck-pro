package com.amazon.a.a.o;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f16782a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f16783b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f16784c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f16785d = "Kiwi";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f16786e;

    public c(String str) {
        this.f16786e = str;
    }

    private String d(String str) {
        return this.f16786e + ": " + str;
    }

    public void a(String str) {
        if (f16782a) {
            Log.d(f16785d, d(str));
        }
    }

    public void b(String str) {
        if (f16783b) {
            Log.e(f16785d, d(str));
        }
    }

    public void c(String str) {
        if (f16784c) {
            Log.e(f16785d, "TEST-" + d(str));
        }
    }

    public void a(String str, Throwable th) {
        if (f16782a) {
            Log.d(f16785d, d(str), th);
        }
    }

    public void b(String str, Throwable th) {
        if (f16783b) {
            Log.e(f16785d, d(str), th);
        }
    }

    public static void a() {
        f16784c = true;
    }

    public static boolean b() {
        return f16784c;
    }
}
