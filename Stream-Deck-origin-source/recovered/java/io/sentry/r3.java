package io.sentry;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f27549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f27550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f27551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f27552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f27553e;

    public r3(Boolean bool) {
        this(bool, null);
    }

    public Double a() {
        return this.f27553e;
    }

    public Boolean b() {
        return this.f27552d;
    }

    public Double c() {
        return this.f27551c;
    }

    public Double d() {
        return this.f27550b;
    }

    public Boolean e() {
        return this.f27549a;
    }

    public r3(Boolean bool, Double d8) {
        this(bool, d8, null, Boolean.FALSE, null);
    }

    public r3(Boolean bool, Double d8, Double d9) {
        this(bool, d8, d9, Boolean.FALSE, null);
    }

    public r3(Boolean bool, Double d8, Boolean bool2, Double d9) {
        this(bool, d8, null, bool2, d9);
    }

    public r3(Boolean bool, Double d8, Double d9, Boolean bool2, Double d10) {
        this.f27549a = bool;
        this.f27550b = d8;
        this.f27551c = d9;
        this.f27552d = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f27553e = d10;
    }
}
