package N4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class D6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public E6 f6247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f6248b;

    public final D6 a(E6 e8) {
        this.f6247a = e8;
        return this;
    }

    public final D6 b(Integer num) {
        this.f6248b = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final G6 d() {
        return new G6(this, null);
    }
}
