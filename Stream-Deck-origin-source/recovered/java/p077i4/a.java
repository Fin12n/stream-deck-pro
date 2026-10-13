package p077i4;

import p043e6.dT.GIGvBf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements B6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f24730c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile B6.a f24731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f24732b = f24730c;

    public a(B6.a aVar) {
        this.f24731a = aVar;
    }

    public static B6.a a(B6.a aVar) {
        e.b(aVar);
        return aVar instanceof a ? aVar : new a(aVar);
    }

    @Override // B6.a
    public Object get() {
        Object obj;
        Object obj2 = this.f24732b;
        Object obj3 = f24730c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f24732b;
                if (obj == obj3) {
                    obj = this.f24731a.get();
                    this.f24732b = b(this.f24732b, obj);
                    this.f24731a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f24730c || (obj instanceof d) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + GIGvBf.ofBIKKQYe + obj2 + ". This is likely due to a circular dependency.");
    }
}
