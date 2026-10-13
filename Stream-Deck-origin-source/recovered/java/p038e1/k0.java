package p038e1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.AbstractC2632j;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface k0 {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Collection, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f20505a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final boolean add(Object obj) {
            return this.f20505a.add(obj);
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f20505a.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return this.f20505a.contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            return this.f20505a.containsAll(collection);
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.f20505a.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.f20505a.iterator();
        }

        public int m() {
            return this.f20505a.size();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.f20505a.remove(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection collection) {
            return this.f20505a.remove(collection);
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            return this.f20505a.retainAll(collection);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return m();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC2632j.a(this);
        }

        public a(Set<Object> set) {
            this.f20505a = set;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC2632j.b(this, objArr);
        }

        public /* synthetic */ a(Set set, int i8, AbstractC2633k abstractC2633k) {
            this((i8 & 1) != 0 ? new LinkedHashSet() : set);
        }
    }

    void a(a aVar);

    boolean b(Object obj, Object obj2);
}
