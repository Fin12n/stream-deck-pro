package N4;

/* JADX INFO: renamed from: N4.c1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1100c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1136f1 f7063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f7064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1369z6 f7065c;

    public final C1100c1 a(Integer num) {
        this.f7064b = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C1100c1 b(C1369z6 c1369z6) {
        this.f7065c = c1369z6;
        return this;
    }

    public final C1100c1 c(C1136f1 c1136f1) {
        this.f7063a = c1136f1;
        return this;
    }

    public final C1160h1 e() {
        return new C1160h1(this, null);
    }
}
