package F0;

import C0.g;
import D6.AbstractC0928h;
import E0.d;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0928h implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f2324e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f2325f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f2326g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f2329d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final g a() {
            return b.f2326g;
        }

        public a() {
        }
    }

    static {
        G0.c cVar = G0.c.f2602a;
        f2326g = new b(cVar, cVar, d.f1991d.a());
    }

    public b(Object obj, Object obj2, d dVar) {
        this.f2327b = obj;
        this.f2328c = obj2;
        this.f2329d = dVar;
    }

    @Override // java.util.Collection, java.util.Set, C0.g
    public g add(Object obj) {
        if (this.f2329d.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new b(obj, obj, this.f2329d.r(obj, new F0.a()));
        }
        Object obj2 = this.f2328c;
        Object obj3 = this.f2329d.get(obj2);
        t.d(obj3);
        return new b(this.f2327b, obj, this.f2329d.r(obj2, ((F0.a) obj3).e(obj)).r(obj, new F0.a(obj2)));
    }

    @Override // D6.AbstractC0921a
    public int c() {
        return this.f2329d.size();
    }

    @Override // D6.AbstractC0921a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f2329d.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new c(this.f2327b, this.f2329d);
    }

    @Override // java.util.Collection, java.util.Set, C0.g
    public g remove(Object obj) {
        F0.a aVar = (F0.a) this.f2329d.get(obj);
        if (aVar == null) {
            return this;
        }
        d dVarS = this.f2329d.s(obj);
        if (aVar.b()) {
            Object obj2 = dVarS.get(aVar.d());
            t.d(obj2);
            dVarS = dVarS.r(aVar.d(), ((F0.a) obj2).e(aVar.c()));
        }
        if (aVar.a()) {
            Object obj3 = dVarS.get(aVar.c());
            t.d(obj3);
            dVarS = dVarS.r(aVar.c(), ((F0.a) obj3).f(aVar.d()));
        }
        return new b(!aVar.b() ? aVar.c() : this.f2327b, !aVar.a() ? aVar.d() : this.f2328c, dVarS);
    }
}
