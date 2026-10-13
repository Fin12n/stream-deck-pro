package p052f6;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum p {
    ECDHE("ECDHE_ECDSA"),
    RSA("RSA");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22121a;

    p(String str) {
        this.f22121a = str;
    }

    public final String b() {
        return this.f22121a;
    }
}
