package O4;

/* JADX INFO: renamed from: O4.x3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1537x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f8633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EnumC1544y3 f8634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EnumC1502s3 f8635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f8636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f8637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f8638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f8639g;

    public final C1537x3 b(Long l8) {
        this.f8633a = Long.valueOf(l8.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1537x3 c(Integer num) {
        this.f8636d = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C1537x3 d(EnumC1502s3 enumC1502s3) {
        this.f8635c = enumC1502s3;
        return this;
    }

    public final C1537x3 e(Integer num) {
        this.f8638f = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C1537x3 f(EnumC1544y3 enumC1544y3) {
        this.f8634b = enumC1544y3;
        return this;
    }

    public final C1537x3 g(Integer num) {
        this.f8637e = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C1537x3 h(Integer num) {
        this.f8639g = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final A3 j() {
        return new A3(this, null);
    }
}
