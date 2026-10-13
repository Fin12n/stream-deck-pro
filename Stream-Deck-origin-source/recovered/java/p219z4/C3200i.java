package p219z4;

import android.util.Log;

/* JADX INFO: renamed from: z4.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C3200i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39218b;

    public C3200i(String str) {
        this(str, null);
    }

    public boolean a(int i8) {
        return Log.isLoggable(this.f39217a, i8);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            Log.d(str, g(str2));
        }
    }

    public void c(String str, String str2) {
        if (a(6)) {
            Log.e(str, g(str2));
        }
    }

    public void d(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, g(str2), th);
        }
    }

    public void e(String str, String str2) {
        if (a(2)) {
            Log.v(str, g(str2));
        }
    }

    public void f(String str, String str2) {
        if (a(5)) {
            Log.w(str, g(str2));
        }
    }

    public final String g(String str) {
        String str2 = this.f39218b;
        return str2 == null ? str : str2.concat(str);
    }

    public C3200i(String str, String str2) {
        AbstractC3207p.l(str, "log tag cannot be null");
        AbstractC3207p.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f39217a = str;
        this.f39218b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
