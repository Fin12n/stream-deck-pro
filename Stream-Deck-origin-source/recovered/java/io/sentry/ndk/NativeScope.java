package io.sentry.ndk;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class NativeScope implements a {
    public static native void nativeAddBreadcrumb(String str, String str2, String str3, String str4, String str5, String str6);

    public static native void nativeRemoveUser();

    public static native void nativeSetExtra(String str, String str2);

    public static native void nativeSetTag(String str, String str2);

    public static native void nativeSetUser(String str, String str2, String str3, String str4);

    @Override // io.sentry.ndk.a
    public void a(String str, String str2) {
        nativeSetExtra(str, str2);
    }

    @Override // io.sentry.ndk.a
    public void b(String str, String str2, String str3, String str4) {
        nativeSetUser(str, str2, str3, str4);
    }

    @Override // io.sentry.ndk.a
    public void c(String str, String str2, String str3, String str4, String str5, String str6) {
        nativeAddBreadcrumb(str, str2, str3, str4, str5, str6);
    }

    @Override // io.sentry.ndk.a
    public void d(String str, String str2) {
        nativeSetTag(str, str2);
    }

    @Override // io.sentry.ndk.a
    public void e() {
        nativeRemoveUser();
    }
}
