package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.p2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1940p2 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f18617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f18619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile C1930n2 f18621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f18622f;

    public /* synthetic */ AbstractC1940p2(AbstractC1935o2 abstractC1935o2) {
        Map map = Collections.EMPTY_MAP;
        this.f18619c = map;
        this.f18622f = map;
    }

    public void a() {
        if (this.f18620d) {
            return;
        }
        this.f18619c = this.f18619c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f18619c);
        this.f18622f = this.f18622f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f18622f);
        this.f18620d = true;
    }

    public final int c() {
        return this.f18618b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        o();
        if (this.f18618b != 0) {
            this.f18617a = null;
            this.f18618b = 0;
        }
        if (this.f18619c.isEmpty()) {
            return;
        }
        this.f18619c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return l(comparable) >= 0 || this.f18619c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f18619c.isEmpty() ? Collections.EMPTY_SET : this.f18619c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f18621e == null) {
            this.f18621e = new C1930n2(this, null);
        }
        return this.f18621e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1940p2)) {
            return super.equals(obj);
        }
        AbstractC1940p2 abstractC1940p2 = (AbstractC1940p2) obj;
        int size = size();
        if (size != abstractC1940p2.size()) {
            return false;
        }
        int i8 = this.f18618b;
        if (i8 != abstractC1940p2.f18618b) {
            return entrySet().equals(abstractC1940p2.entrySet());
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (!g(i9).equals(abstractC1940p2.g(i9))) {
                return false;
            }
        }
        if (i8 != size) {
            return this.f18619c.equals(abstractC1940p2.f18619c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        o();
        int iL = l(comparable);
        if (iL >= 0) {
            return ((C1910j2) this.f18617a[iL]).setValue(obj);
        }
        o();
        if (this.f18617a == null) {
            this.f18617a = new Object[16];
        }
        int i8 = -(iL + 1);
        if (i8 >= 16) {
            return n().put(comparable, obj);
        }
        if (this.f18618b == 16) {
            C1910j2 c1910j2 = (C1910j2) this.f18617a[15];
            this.f18618b = 15;
            n().put(c1910j2.a(), c1910j2.getValue());
        }
        Object[] objArr = this.f18617a;
        int length = objArr.length;
        System.arraycopy(objArr, i8, objArr, i8 + 1, 15 - i8);
        this.f18617a[i8] = new C1910j2(this, comparable, obj);
        this.f18618b++;
        return null;
    }

    public final Map.Entry g(int i8) {
        if (i8 < this.f18618b) {
            return (C1910j2) this.f18617a[i8];
        }
        throw new ArrayIndexOutOfBoundsException(i8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        return iL >= 0 ? ((C1910j2) this.f18617a[iL]).getValue() : this.f18619c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i8 = this.f18618b;
        int iHashCode = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            iHashCode += this.f18617a[i9].hashCode();
        }
        return this.f18619c.size() > 0 ? iHashCode + this.f18619c.hashCode() : iHashCode;
    }

    public final boolean j() {
        return this.f18620d;
    }

    public final int l(Comparable comparable) {
        int i8 = this.f18618b;
        int i9 = i8 - 1;
        int i10 = 0;
        if (i9 >= 0) {
            int iCompareTo = comparable.compareTo(((C1910j2) this.f18617a[i9]).a());
            if (iCompareTo > 0) {
                return -(i8 + 1);
            }
            if (iCompareTo == 0) {
                return i9;
            }
        }
        while (i10 <= i9) {
            int i11 = (i10 + i9) / 2;
            int iCompareTo2 = comparable.compareTo(((C1910j2) this.f18617a[i11]).a());
            if (iCompareTo2 < 0) {
                i9 = i11 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i11;
                }
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    public final Object m(int i8) {
        o();
        Object value = ((C1910j2) this.f18617a[i8]).getValue();
        Object[] objArr = this.f18617a;
        System.arraycopy(objArr, i8 + 1, objArr, i8, (this.f18618b - i8) - 1);
        this.f18618b--;
        if (!this.f18619c.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            Object[] objArr2 = this.f18617a;
            int i9 = this.f18618b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i9] = new C1910j2(this, (Comparable) entry.getKey(), entry.getValue());
            this.f18618b++;
            it.remove();
        }
        return value;
    }

    public final SortedMap n() {
        o();
        if (this.f18619c.isEmpty() && !(this.f18619c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f18619c = treeMap;
            this.f18622f = treeMap.descendingMap();
        }
        return (SortedMap) this.f18619c;
    }

    public final void o() {
        if (this.f18620d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        o();
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        if (iL >= 0) {
            return m(iL);
        }
        if (this.f18619c.isEmpty()) {
            return null;
        }
        return this.f18619c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f18618b + this.f18619c.size();
    }
}
