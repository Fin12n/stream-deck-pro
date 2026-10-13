package io.sentry.android.core;

import android.util.Log;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;

/* JADX INFO: renamed from: io.sentry.android.core.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2472u implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26560a;

    /* JADX INFO: renamed from: io.sentry.android.core.u$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26561a;

        static {
            int[] iArr = new int[EnumC2596z2.values().length];
            f26561a = iArr;
            try {
                iArr[EnumC2596z2.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26561a[EnumC2596z2.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26561a[EnumC2596z2.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26561a[EnumC2596z2.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26561a[EnumC2596z2.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C2472u() {
        this("Sentry");
    }

    @Override // io.sentry.ILogger
    public void a(EnumC2596z2 enumC2596z2, Throwable th, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            b(enumC2596z2, str, th);
        } else {
            b(enumC2596z2, String.format(str, objArr), th);
        }
    }

    @Override // io.sentry.ILogger
    public void b(EnumC2596z2 enumC2596z2, String str, Throwable th) {
        int i8 = a.f26561a[enumC2596z2.ordinal()];
        if (i8 == 1) {
            Log.i(this.f26560a, str, th);
            return;
        }
        if (i8 == 2) {
            Log.w(this.f26560a, str, th);
            return;
        }
        if (i8 == 3) {
            Log.e(this.f26560a, str, th);
        } else if (i8 != 4) {
            Log.d(this.f26560a, str, th);
        } else {
            Log.wtf(this.f26560a, str, th);
        }
    }

    @Override // io.sentry.ILogger
    public void c(EnumC2596z2 enumC2596z2, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            Log.println(e(enumC2596z2), this.f26560a, str);
        } else {
            Log.println(e(enumC2596z2), this.f26560a, String.format(str, objArr));
        }
    }

    @Override // io.sentry.ILogger
    public boolean d(EnumC2596z2 enumC2596z2) {
        return true;
    }

    public final int e(EnumC2596z2 enumC2596z2) {
        int i8 = a.f26561a[enumC2596z2.ordinal()];
        if (i8 == 1) {
            return 4;
        }
        if (i8 != 2) {
            return i8 != 4 ? 3 : 7;
        }
        return 5;
    }

    public C2472u(String str) {
        this.f26560a = str;
    }
}
