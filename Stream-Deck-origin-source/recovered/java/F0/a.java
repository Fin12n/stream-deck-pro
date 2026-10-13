package F0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2323b;

    public a(Object obj, Object obj2) {
        this.f2322a = obj;
        this.f2323b = obj2;
    }

    public final boolean a() {
        return this.f2323b != G0.c.f2602a;
    }

    public final boolean b() {
        return this.f2322a != G0.c.f2602a;
    }

    public final Object c() {
        return this.f2323b;
    }

    public final Object d() {
        return this.f2322a;
    }

    public final a e(Object obj) {
        return new a(this.f2322a, obj);
    }

    public final a f(Object obj) {
        return new a(obj, this.f2323b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        G0.c cVar = G0.c.f2602a;
        this(cVar, cVar);
    }

    public a(Object obj) {
        this(obj, G0.c.f2602a);
    }
}
