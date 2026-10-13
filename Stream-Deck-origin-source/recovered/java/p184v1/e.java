package p184v1;

import D6.C0934n;
import Z6.w;
import com.amazon.a.a.o.b.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.AbstractC2632j;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Collection, R6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f35061c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35063b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final e a() {
            return h.a().b();
        }

        public a() {
        }
    }

    public e(List<d> list) {
        this.f35062a = list;
        this.f35063b = list.size();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean c(d dVar) {
        return this.f35062a.contains(dVar);
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof d) {
            return c((d) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f35062a.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && t.c(this.f35062a, ((e) obj).f35062a);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f35062a.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f35062a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f35062a.iterator();
    }

    public final d m(int i8) {
        return (d) this.f35062a.get(i8);
    }

    public final List o() {
        return this.f35062a;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int s() {
        return this.f35063b;
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return s();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC2632j.a(this);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.f35062a + ')';
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC2632j.b(this, objArr);
    }

    public e(String str) {
        List listA0 = w.A0(str, new String[]{f.f16777a}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(listA0.size());
        int size = listA0.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(w.W0((String) listA0.get(i8)).toString());
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = 0; i9 < size2; i9++) {
            arrayList2.add(new d((String) arrayList.get(i9)));
        }
        this(arrayList2);
    }

    public e(d... dVarArr) {
        this((List<d>) C0934n.r0(dVarArr));
    }
}
