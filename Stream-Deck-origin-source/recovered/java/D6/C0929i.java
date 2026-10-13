package D6;

import M6.eLZq.eGwOBWCdOTaKus;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2625c;
import kotlin.jvm.internal.AbstractC2632j;
import p043e6.dT.GIGvBf;
import p135p0.Dyk.GOKsbdzhLhXAMt;

/* JADX INFO: renamed from: D6.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C0929i implements Collection, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f1947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1948b;

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int c() {
        return this.f1947a.length;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return C0934n.I(this.f1947a, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f1947a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC2625c.a(this.f1947a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.t.g(array, "array");
        return AbstractC2632j.b(this, array);
    }

    public C0929i(Object[] objArr, boolean z8) {
        kotlin.jvm.internal.t.g(objArr, GOKsbdzhLhXAMt.arjZwROunCvldPK);
        this.f1947a = objArr;
        this.f1948b = z8;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException(eGwOBWCdOTaKus.RaMXMVhIJMqO);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException(GIGvBf.ZGLAkAHOig);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C0937q.b(this.f1947a, this.f1948b);
    }
}
