package N4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class K6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f6332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Y6 f6333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f6334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f6335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f6336e;

    public final K6 a(Boolean bool) {
        this.f6335d = bool;
        return this;
    }

    public final K6 b(Boolean bool) {
        this.f6336e = bool;
        return this;
    }

    public final K6 c(Long l8) {
        this.f6332a = Long.valueOf(l8.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final K6 d(Y6 y8) {
        this.f6333b = y8;
        return this;
    }

    public final K6 e(Boolean bool) {
        this.f6334c = bool;
        return this;
    }

    public final M6 f() {
        return new M6(this, null);
    }
}
