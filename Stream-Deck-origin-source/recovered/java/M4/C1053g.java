package M4;

/* JADX INFO: renamed from: M4.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1053g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5562c;

    public C1053g(Object obj, Object obj2, Object obj3) {
        this.f5560a = obj;
        this.f5561b = obj2;
        this.f5562c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f5562c;
        Object obj2 = this.f5561b;
        Object obj3 = this.f5560a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + com.amazon.a.a.o.b.f.f16778b + String.valueOf(obj2) + " and " + String.valueOf(obj3) + com.amazon.a.a.o.b.f.f16778b + String.valueOf(obj));
    }
}
