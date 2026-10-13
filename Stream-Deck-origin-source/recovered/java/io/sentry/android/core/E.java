package io.sentry.android.core;

import io.sentry.J2;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class E implements io.sentry.transport.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2 f26186a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26187a;

        static {
            int[] iArr = new int[io.sentry.M.a.values().length];
            f26187a = iArr;
            try {
                iArr[io.sentry.M.a.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26187a[io.sentry.M.a.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26187a[io.sentry.M.a.NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public E(J2 j8) {
        this.f26186a = j8;
    }

    @Override // io.sentry.transport.r
    public boolean a() {
        return b(this.f26186a.getConnectionStatusProvider().b());
    }

    public boolean b(io.sentry.M.a aVar) {
        int i8 = a.f26187a[aVar.ordinal()];
        return i8 == 1 || i8 == 2 || i8 == 3;
    }
}
