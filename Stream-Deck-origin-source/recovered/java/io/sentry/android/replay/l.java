package io.sentry.android.replay;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile m f26834a = m.INITIAL;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26835a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m.STOPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f26835a = iArr;
        }
    }

    public final m a() {
        return this.f26834a;
    }

    public final boolean b(m newState) {
        kotlin.jvm.internal.t.g(newState, "newState");
        switch (a.f26835a[this.f26834a.ordinal()]) {
            case 1:
                return newState == m.STARTED || newState == m.CLOSED;
            case 2:
                return newState == m.PAUSED || newState == m.STOPPED || newState == m.CLOSED;
            case 3:
                return newState == m.PAUSED || newState == m.STOPPED || newState == m.CLOSED;
            case 4:
                return newState == m.RESUMED || newState == m.STOPPED || newState == m.CLOSED;
            case 5:
                return newState == m.STARTED || newState == m.CLOSED;
            case 6:
                return false;
            default:
                throw new C6.m();
        }
    }

    public final boolean c() {
        return this.f26834a == m.STARTED || this.f26834a == m.RESUMED;
    }

    public final void d(m mVar) {
        kotlin.jvm.internal.t.g(mVar, "<set-?>");
        this.f26834a = mVar;
    }
}
