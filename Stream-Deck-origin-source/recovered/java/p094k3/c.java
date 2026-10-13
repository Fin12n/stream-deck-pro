package p094k3;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public enum c {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28688a;

    c(String str) {
        this.f28688a = str;
    }

    public String b() {
        return ".temp" + this.f28688a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f28688a;
    }
}
