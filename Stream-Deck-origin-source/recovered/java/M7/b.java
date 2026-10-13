package M7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum b {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5788b;

    b(int i8, String str) {
        this.f5787a = i8;
        this.f5788b = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f5788b;
    }
}
