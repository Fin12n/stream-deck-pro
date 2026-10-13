package N4;

/* JADX INFO: renamed from: N4.x6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1347x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f7374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f7375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f7376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f7377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f7378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f7379f;

    public final C1347x6 a(Long l8) {
        this.f7376c = Long.valueOf(l8.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1347x6 b(Long l8) {
        this.f7377d = Long.valueOf(l8.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1347x6 c(Long l8) {
        this.f7374a = Long.valueOf(l8.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1347x6 d(Long l8) {
        this.f7378e = Long.valueOf(l8.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1347x6 e(Long l8) {
        this.f7375b = Long.valueOf(l8.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1347x6 f(Long l8) {
        this.f7379f = Long.valueOf(l8.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1369z6 g() {
        return new C1369z6(this, null);
    }
}
