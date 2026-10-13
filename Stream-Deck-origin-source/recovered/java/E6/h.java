package E6;

import D6.AbstractC0927g;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p143q0.nKy.bGZGhbtQmA;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends AbstractC0927g implements Set, Serializable, R6.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2278b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f2279c = new h(d.f2254n.e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f2280a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public h(d backing) {
        t.g(backing, "backing");
        this.f2280a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return this.f2280a.j(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        t.g(elements, "elements");
        this.f2280a.n();
        return super.addAll(elements);
    }

    @Override // D6.AbstractC0927g
    public int c() {
        return this.f2280a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f2280a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f2280a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f2280a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f2280a.I();
    }

    public final Set o() {
        this.f2280a.l();
        return size() > 0 ? this : f2279c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f2280a.R(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        t.g(elements, "elements");
        this.f2280a.n();
        return super.retainAll(elements);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        t.g(collection, bGZGhbtQmA.WqowGJb);
        this.f2280a.n();
        return super.removeAll(collection);
    }

    public h() {
        this(new d());
    }

    public h(int i8) {
        this(new d(i8));
    }
}
