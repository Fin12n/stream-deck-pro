package io.sentry.android.core;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f26572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f26573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f26574e;

    public x0() {
    }

    public void a(long j8, long j9, boolean z8, boolean z9) {
        this.f26574e += j8;
        if (z9) {
            this.f26573d += j9;
            this.f26571b++;
        } else if (z8) {
            this.f26572c += j9;
            this.f26570a++;
        }
    }

    public int b() {
        return this.f26571b;
    }

    public long c() {
        return this.f26573d;
    }

    public int d() {
        return this.f26570a;
    }

    public long e() {
        return this.f26572c;
    }

    public int f() {
        return this.f26570a + this.f26571b;
    }

    public long g() {
        return this.f26574e;
    }

    public x0(int i8, long j8, int i9, long j9, long j10) {
        this.f26570a = i8;
        this.f26572c = j8;
        this.f26571b = i9;
        this.f26573d = j9;
        this.f26574e = j10;
    }
}
