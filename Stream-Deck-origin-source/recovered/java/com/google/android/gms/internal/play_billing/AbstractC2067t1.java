package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2067t1 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f19016b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f19017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile C2060r1 f19019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f19020f;

    public /* synthetic */ AbstractC2067t1(int i8, AbstractC2064s1 abstractC2064s1) {
        this.f19015a = i8;
        Map map = Collections.EMPTY_MAP;
        this.f19017c = map;
        this.f19020f = map;
    }

    public void a() {
        if (this.f19018d) {
            return;
        }
        this.f19017c = this.f19017c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f19017c);
        this.f19020f = this.f19020f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f19020f);
        this.f19018d = true;
    }

    public final int b() {
        return this.f19016b.size();
    }

    public final Iterable c() {
        return this.f19017c.isEmpty() ? AbstractC2041m1.a() : this.f19017c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        n();
        if (!this.f19016b.isEmpty()) {
            this.f19016b.clear();
        }
        if (this.f19017c.isEmpty()) {
            return;
        }
        this.f19017c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return k(comparable) >= 0 || this.f19017c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        n();
        int iK = k(comparable);
        if (iK >= 0) {
            return ((C2045n1) this.f19016b.get(iK)).setValue(obj);
        }
        n();
        if (this.f19016b.isEmpty() && !(this.f19016b instanceof ArrayList)) {
            this.f19016b = new ArrayList(this.f19015a);
        }
        int i8 = -(iK + 1);
        if (i8 >= this.f19015a) {
            return m().put(comparable, obj);
        }
        int size = this.f19016b.size();
        int i9 = this.f19015a;
        if (size == i9) {
            C2045n1 c2045n1 = (C2045n1) this.f19016b.remove(i9 - 1);
            m().put(c2045n1.a(), c2045n1.getValue());
        }
        this.f19016b.add(i8, new C2045n1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f19019e == null) {
            this.f19019e = new C2060r1(this, null);
        }
        return this.f19019e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2067t1)) {
            return super.equals(obj);
        }
        AbstractC2067t1 abstractC2067t1 = (AbstractC2067t1) obj;
        int size = size();
        if (size != abstractC2067t1.size()) {
            return false;
        }
        int iB = b();
        if (iB != abstractC2067t1.b()) {
            return entrySet().equals(abstractC2067t1.entrySet());
        }
        for (int i8 = 0; i8 < iB; i8++) {
            if (!g(i8).equals(abstractC2067t1.g(i8))) {
                return false;
            }
        }
        if (iB != size) {
            return this.f19017c.equals(abstractC2067t1.f19017c);
        }
        return true;
    }

    public final Map.Entry g(int i8) {
        return (Map.Entry) this.f19016b.get(i8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iK = k(comparable);
        return iK >= 0 ? ((C2045n1) this.f19016b.get(iK)).getValue() : this.f19017c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iB = b();
        int iHashCode = 0;
        for (int i8 = 0; i8 < iB; i8++) {
            iHashCode += ((C2045n1) this.f19016b.get(i8)).hashCode();
        }
        return this.f19017c.size() > 0 ? iHashCode + this.f19017c.hashCode() : iHashCode;
    }

    public final boolean j() {
        return this.f19018d;
    }

    public final int k(Comparable comparable) {
        int size = this.f19016b.size();
        int i8 = size - 1;
        int i9 = 0;
        if (i8 >= 0) {
            int iCompareTo = comparable.compareTo(((C2045n1) this.f19016b.get(i8)).a());
            if (iCompareTo > 0) {
                return -(size + 1);
            }
            if (iCompareTo == 0) {
                return i8;
            }
        }
        while (i9 <= i8) {
            int i10 = (i9 + i8) / 2;
            int iCompareTo2 = comparable.compareTo(((C2045n1) this.f19016b.get(i10)).a());
            if (iCompareTo2 < 0) {
                i8 = i10 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i10;
                }
                i9 = i10 + 1;
            }
        }
        return -(i9 + 1);
    }

    public final Object l(int i8) {
        n();
        Object value = ((C2045n1) this.f19016b.remove(i8)).getValue();
        if (!this.f19017c.isEmpty()) {
            Iterator it = m().entrySet().iterator();
            List list = this.f19016b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C2045n1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    public final SortedMap m() {
        n();
        if (this.f19017c.isEmpty() && !(this.f19017c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f19017c = treeMap;
            this.f19020f = treeMap.descendingMap();
        }
        return (SortedMap) this.f19017c;
    }

    public final void n() {
        if (this.f19018d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        n();
        Comparable comparable = (Comparable) obj;
        int iK = k(comparable);
        if (iK >= 0) {
            return l(iK);
        }
        if (this.f19017c.isEmpty()) {
            return null;
        }
        return this.f19017c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f19016b.size() + this.f19017c.size();
    }
}
