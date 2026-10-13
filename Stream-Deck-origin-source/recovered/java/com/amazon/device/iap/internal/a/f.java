package com.amazon.device.iap.internal.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class f extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f17111a = 3715222306172636179L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f17113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f17114d;

    public f(String str, String str2, String str3) {
        this.f17112b = str;
        this.f17113c = str2;
        this.f17114d = str3;
    }

    public String a() {
        return this.f17112b;
    }

    public String b() {
        return this.f17113c;
    }

    public String c() {
        return this.f17114d;
    }

    public f(String str, String str2, String str3, Throwable th) {
        super(th);
        this.f17112b = str;
        this.f17113c = str2;
        this.f17114d = str3;
    }
}
