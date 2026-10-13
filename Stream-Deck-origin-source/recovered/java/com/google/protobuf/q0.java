package com.google.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q0 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f19378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f19379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile g f19381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f19382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile c f19383g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends q0 {
        public a(int i8) {
            super(i8, null);
        }

        @Override // com.google.protobuf.q0
        public void p() {
            if (!o()) {
                for (int i8 = 0; i8 < k(); i8++) {
                    Map.Entry entryJ = j(i8);
                    if (((C2110v.b) entryJ.getKey()).g()) {
                        entryJ.setValue(Collections.unmodifiableList((List) entryJ.getValue()));
                    }
                }
                for (Map.Entry entry : m()) {
                    if (((C2110v.b) entry.getKey()).g()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.p();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.r((Comparable) obj, obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c extends g {
        public c() {
            super(q0.this, null);
        }

        @Override // com.google.protobuf.q0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(q0.this, null);
        }

        public /* synthetic */ c(q0 q0Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Iterator f19388a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Iterable f19389b = new b();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a implements Iterator {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class b implements Iterable {
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.f19388a;
            }
        }

        public static Iterable b() {
            return f19389b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class e implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Comparable f19390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f19391b;

        public e(q0 q0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        public final boolean b(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f19390a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f19390a, entry.getKey()) && b(this.f19391b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f19391b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f19390a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f19391b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            q0.this.g();
            Object obj2 = this.f19391b;
            this.f19391b = obj;
            return obj2;
        }

        public String toString() {
            return this.f19390a + com.amazon.a.a.o.b.f.f16778b + this.f19391b;
        }

        public e(Comparable comparable, Object obj) {
            this.f19390a = comparable;
            this.f19391b = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class g extends AbstractSet {
        public g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            q0.this.r((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            q0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = q0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(q0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            q0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return q0.this.size();
        }

        public /* synthetic */ g(q0 q0Var, a aVar) {
            this();
        }
    }

    public /* synthetic */ q0(int i8, a aVar) {
        this(i8);
    }

    public static q0 q(int i8) {
        return new a(i8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f19378b.isEmpty()) {
            this.f19378b.clear();
        }
        if (this.f19379c.isEmpty()) {
            return;
        }
        this.f19379c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f19379c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f19381e == null) {
            this.f19381e = new g(this, null);
        }
        return this.f19381e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return super.equals(obj);
        }
        q0 q0Var = (q0) obj;
        int size = size();
        if (size != q0Var.size()) {
            return false;
        }
        int iK = k();
        if (iK != q0Var.k()) {
            return entrySet().equals(q0Var.entrySet());
        }
        for (int i8 = 0; i8 < iK; i8++) {
            if (!j(i8).equals(q0Var.j(i8))) {
                return false;
            }
        }
        if (iK != size) {
            return this.f19379c.equals(q0Var.f19379c);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    public final int f(Comparable comparable) {
        int i8;
        int i9;
        int i10;
        int iCompareTo;
        int size = this.f19378b.size();
        int i11 = size - 1;
        if (i11 < 0) {
            i8 = 0;
            while (i8 <= i11) {
                i10 = (i8 + i11) / 2;
                iCompareTo = comparable.compareTo(((e) this.f19378b.get(i10)).getKey());
                if (iCompareTo < 0) {
                    i11 = i10 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i10;
                    }
                    i8 = i10 + 1;
                }
            }
            i9 = i8 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((e) this.f19378b.get(i11)).getKey());
            if (iCompareTo2 > 0) {
                i9 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i11;
                }
                i8 = 0;
                while (i8 <= i11) {
                    i10 = (i8 + i11) / 2;
                    iCompareTo = comparable.compareTo(((e) this.f19378b.get(i10)).getKey());
                    if (iCompareTo < 0) {
                        i11 = i10 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i10;
                        }
                        i8 = i10 + 1;
                    }
                }
                i9 = i8 + 1;
            }
        }
        return -i9;
    }

    public final void g() {
        if (this.f19380d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? ((e) this.f19378b.get(iF)).getValue() : this.f19379c.get(comparable);
    }

    public Set h() {
        if (this.f19383g == null) {
            this.f19383g = new c(this, null);
        }
        return this.f19383g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iK = k();
        int iHashCode = 0;
        for (int i8 = 0; i8 < iK; i8++) {
            iHashCode += ((e) this.f19378b.get(i8)).hashCode();
        }
        return l() > 0 ? iHashCode + this.f19379c.hashCode() : iHashCode;
    }

    public final void i() {
        g();
        if (!this.f19378b.isEmpty() || (this.f19378b instanceof ArrayList)) {
            return;
        }
        this.f19378b = new ArrayList(this.f19377a);
    }

    public Map.Entry j(int i8) {
        return (Map.Entry) this.f19378b.get(i8);
    }

    public int k() {
        return this.f19378b.size();
    }

    public int l() {
        return this.f19379c.size();
    }

    public Iterable m() {
        return this.f19379c.isEmpty() ? d.b() : this.f19379c.entrySet();
    }

    public final SortedMap n() {
        g();
        if (this.f19379c.isEmpty() && !(this.f19379c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f19379c = treeMap;
            this.f19382f = treeMap.descendingMap();
        }
        return (SortedMap) this.f19379c;
    }

    public boolean o() {
        return this.f19380d;
    }

    public void p() {
        if (this.f19380d) {
            return;
        }
        this.f19379c = this.f19379c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f19379c);
        this.f19382f = this.f19382f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f19382f);
        this.f19380d = true;
    }

    public Object r(Comparable comparable, Object obj) {
        g();
        int iF = f(comparable);
        if (iF >= 0) {
            return ((e) this.f19378b.get(iF)).setValue(obj);
        }
        i();
        int i8 = -(iF + 1);
        if (i8 >= this.f19377a) {
            return n().put(comparable, obj);
        }
        int size = this.f19378b.size();
        int i9 = this.f19377a;
        if (size == i9) {
            e eVar = (e) this.f19378b.remove(i9 - 1);
            n().put(eVar.getKey(), eVar.getValue());
        }
        this.f19378b.add(i8, new e(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return s(iF);
        }
        if (this.f19379c.isEmpty()) {
            return null;
        }
        return this.f19379c.remove(comparable);
    }

    public final Object s(int i8) {
        g();
        Object value = ((e) this.f19378b.remove(i8)).getValue();
        if (!this.f19379c.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            this.f19378b.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f19378b.size() + this.f19379c.size();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator f19385b;

        public b() {
            this.f19384a = q0.this.f19378b.size();
        }

        public final Iterator b() {
            if (this.f19385b == null) {
                this.f19385b = q0.this.f19382f.entrySet().iterator();
            }
            return this.f19385b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (b().hasNext()) {
                return (Map.Entry) b().next();
            }
            List list = q0.this.f19378b;
            int i8 = this.f19384a - 1;
            this.f19384a = i8;
            return (Map.Entry) list.get(i8);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i8 = this.f19384a;
            return (i8 > 0 && i8 <= q0.this.f19378b.size()) || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(q0 q0Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f19394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator f19395c;

        public f() {
            this.f19393a = -1;
        }

        public final Iterator b() {
            if (this.f19395c == null) {
                this.f19395c = q0.this.f19379c.entrySet().iterator();
            }
            return this.f19395c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f19394b = true;
            int i8 = this.f19393a + 1;
            this.f19393a = i8;
            return i8 < q0.this.f19378b.size() ? (Map.Entry) q0.this.f19378b.get(this.f19393a) : (Map.Entry) b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19393a + 1 < q0.this.f19378b.size() || (!q0.this.f19379c.isEmpty() && b().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f19394b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f19394b = false;
            q0.this.g();
            if (this.f19393a >= q0.this.f19378b.size()) {
                b().remove();
                return;
            }
            q0 q0Var = q0.this;
            int i8 = this.f19393a;
            this.f19393a = i8 - 1;
            q0Var.s(i8);
        }

        public /* synthetic */ f(q0 q0Var, a aVar) {
            this();
        }
    }

    public q0(int i8) {
        this.f19377a = i8;
        this.f19378b = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f19379c = map;
        this.f19382f = map;
    }
}
