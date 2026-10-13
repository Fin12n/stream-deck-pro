package com.amazon.device.iap.internal.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class e extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f17101a = 7955687159702952249L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f17103c;

    public e(String str, String str2) {
        this.f17102b = str;
        this.f17103c = str2;
    }

    public String a() {
        return this.f17102b;
    }

    public String b() {
        return this.f17103c;
    }

    public e(String str, String str2, Throwable th) {
        super(th);
        this.f17102b = str;
        this.f17103c = str2;
    }
}
