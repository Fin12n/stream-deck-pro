package E6;

import D6.AbstractC0922b;
import W6.n;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Map, Serializable, R6.e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f2254n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f2255o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f2256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f2257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f2258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f2259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public E6.f f2265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f2266k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public E6.e f2267l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2268m;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int c(int i8) {
            return Integer.highestOneBit(n.d(i8, 1) * 3);
        }

        public final int d(int i8) {
            return Integer.numberOfLeadingZeros(i8) + 1;
        }

        public final d e() {
            return d.f2255o;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends C0105d implements Iterator, R6.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d map) {
            super(map);
            t.g(map, "map");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public c next() {
            b();
            if (c() >= e().f2261f) {
                throw new NoSuchElementException();
            }
            int iC = c();
            g(iC + 1);
            h(iC);
            c cVar = new c(e(), d());
            f();
            return cVar;
        }

        public final void k(StringBuilder sb) {
            t.g(sb, "sb");
            if (c() >= e().f2261f) {
                throw new NoSuchElementException();
            }
            int iC = c();
            g(iC + 1);
            h(iC);
            Object obj = e().f2256a[d()];
            if (obj == e()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = e().f2257b;
            t.d(objArr);
            Object obj2 = objArr[d()];
            if (obj2 == e()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            f();
        }

        public final int l() {
            if (c() >= e().f2261f) {
                throw new NoSuchElementException();
            }
            int iC = c();
            g(iC + 1);
            h(iC);
            Object obj = e().f2256a[d()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = e().f2257b;
            t.d(objArr);
            Object obj2 = objArr[d()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            f();
            return iHashCode2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements Map.Entry, R6.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f2269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2270b;

        public c(d map, int i8) {
            t.g(map, "map");
            this.f2269a = map;
            this.f2270b = i8;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return t.c(entry.getKey(), getKey()) && t.c(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f2269a.f2256a[this.f2270b];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            Object[] objArr = this.f2269a.f2257b;
            t.d(objArr);
            return objArr[this.f2270b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            this.f2269a.n();
            Object[] objArrK = this.f2269a.k();
            int i8 = this.f2270b;
            Object obj2 = objArrK[i8];
            objArrK[i8] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: E6.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class C0105d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f2271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2274d;

        public C0105d(d map) {
            t.g(map, "map");
            this.f2271a = map;
            this.f2273c = -1;
            this.f2274d = map.f2263h;
            f();
        }

        public final void b() {
            if (this.f2271a.f2263h != this.f2274d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int c() {
            return this.f2272b;
        }

        public final int d() {
            return this.f2273c;
        }

        public final d e() {
            return this.f2271a;
        }

        public final void f() {
            while (this.f2272b < this.f2271a.f2261f) {
                int[] iArr = this.f2271a.f2258c;
                int i8 = this.f2272b;
                if (iArr[i8] >= 0) {
                    return;
                } else {
                    this.f2272b = i8 + 1;
                }
            }
        }

        public final void g(int i8) {
            this.f2272b = i8;
        }

        public final void h(int i8) {
            this.f2273c = i8;
        }

        public final boolean hasNext() {
            return this.f2272b < this.f2271a.f2261f;
        }

        public final void remove() {
            b();
            if (this.f2273c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f2271a.n();
            this.f2271a.P(this.f2273c);
            this.f2273c = -1;
            this.f2274d = this.f2271a.f2263h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends C0105d implements Iterator, R6.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d map) {
            super(map);
            t.g(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            b();
            if (c() >= e().f2261f) {
                throw new NoSuchElementException();
            }
            int iC = c();
            g(iC + 1);
            h(iC);
            Object obj = e().f2256a[d()];
            f();
            return obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends C0105d implements Iterator, R6.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d map) {
            super(map);
            t.g(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            b();
            if (c() >= e().f2261f) {
                throw new NoSuchElementException();
            }
            int iC = c();
            g(iC + 1);
            h(iC);
            Object[] objArr = e().f2257b;
            t.d(objArr);
            Object obj = objArr[d()];
            f();
            return obj;
        }
    }

    static {
        d dVar = new d(0);
        dVar.f2268m = true;
        f2255o = dVar;
    }

    public d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i8, int i9) {
        this.f2256a = objArr;
        this.f2257b = objArr2;
        this.f2258c = iArr;
        this.f2259d = iArr2;
        this.f2260e = i8;
        this.f2261f = i9;
        this.f2262g = f2254n.d(D());
    }

    private final void M() {
        this.f2263h++;
    }

    private final void v(int i8) {
        if (i8 < 0) {
            throw new OutOfMemoryError();
        }
        if (i8 > B()) {
            int iE = AbstractC0922b.f1937a.e(B(), i8);
            this.f2256a = E6.c.e(this.f2256a, iE);
            Object[] objArr = this.f2257b;
            this.f2257b = objArr != null ? E6.c.e(objArr, iE) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f2258c, iE);
            t.f(iArrCopyOf, "copyOf(...)");
            this.f2258c = iArrCopyOf;
            int iC = f2254n.c(iE);
            if (iC > D()) {
                N(iC);
            }
        }
    }

    private final void w(int i8) {
        if (T(i8)) {
            o(true);
        } else {
            v(this.f2261f + i8);
        }
    }

    public final int A(Object obj) {
        int i8 = this.f2261f;
        while (true) {
            i8--;
            if (i8 < 0) {
                return -1;
            }
            if (this.f2258c[i8] >= 0) {
                Object[] objArr = this.f2257b;
                t.d(objArr);
                if (t.c(objArr[i8], obj)) {
                    return i8;
                }
            }
        }
    }

    public final int B() {
        return this.f2256a.length;
    }

    public Set C() {
        E6.e eVar = this.f2267l;
        if (eVar != null) {
            return eVar;
        }
        E6.e eVar2 = new E6.e(this);
        this.f2267l = eVar2;
        return eVar2;
    }

    public final int D() {
        return this.f2259d.length;
    }

    public Set E() {
        E6.f fVar = this.f2265j;
        if (fVar != null) {
            return fVar;
        }
        E6.f fVar2 = new E6.f(this);
        this.f2265j = fVar2;
        return fVar2;
    }

    public int F() {
        return this.f2264i;
    }

    public Collection G() {
        g gVar = this.f2266k;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        this.f2266k = gVar2;
        return gVar2;
    }

    public final int H(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f2262g;
    }

    public final e I() {
        return new e(this);
    }

    public final boolean J(Collection collection) {
        boolean z8 = false;
        if (collection.isEmpty()) {
            return false;
        }
        w(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (K((Map.Entry) it.next())) {
                z8 = true;
            }
        }
        return z8;
    }

    public final boolean K(Map.Entry entry) {
        int iJ = j(entry.getKey());
        Object[] objArrK = k();
        if (iJ >= 0) {
            objArrK[iJ] = entry.getValue();
            return true;
        }
        int i8 = (-iJ) - 1;
        if (t.c(entry.getValue(), objArrK[i8])) {
            return false;
        }
        objArrK[i8] = entry.getValue();
        return true;
    }

    public final boolean L(int i8) {
        int iH = H(this.f2256a[i8]);
        int i9 = this.f2260e;
        while (true) {
            int[] iArr = this.f2259d;
            if (iArr[iH] == 0) {
                iArr[iH] = i8 + 1;
                this.f2258c[i8] = iH;
                return true;
            }
            i9--;
            if (i9 < 0) {
                return false;
            }
            iH = iH == 0 ? D() - 1 : iH - 1;
        }
    }

    public final void N(int i8) {
        M();
        int i9 = 0;
        if (this.f2261f > size()) {
            o(false);
        }
        this.f2259d = new int[i8];
        this.f2262g = f2254n.d(i8);
        while (i9 < this.f2261f) {
            int i10 = i9 + 1;
            if (!L(i9)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i9 = i10;
        }
    }

    public final boolean O(Map.Entry entry) {
        t.g(entry, "entry");
        n();
        int iY = y(entry.getKey());
        if (iY < 0) {
            return false;
        }
        Object[] objArr = this.f2257b;
        t.d(objArr);
        if (!t.c(objArr[iY], entry.getValue())) {
            return false;
        }
        P(iY);
        return true;
    }

    public final void P(int i8) {
        E6.c.f(this.f2256a, i8);
        Object[] objArr = this.f2257b;
        if (objArr != null) {
            E6.c.f(objArr, i8);
        }
        Q(this.f2258c[i8]);
        this.f2258c[i8] = -1;
        this.f2264i = size() - 1;
        M();
    }

    public final void Q(int i8) {
        int iG = n.g(this.f2260e * 2, D() / 2);
        int i9 = 0;
        int i10 = i8;
        do {
            i8 = i8 == 0 ? D() - 1 : i8 - 1;
            i9++;
            if (i9 > this.f2260e) {
                this.f2259d[i10] = 0;
                return;
            }
            int[] iArr = this.f2259d;
            int i11 = iArr[i8];
            if (i11 == 0) {
                iArr[i10] = 0;
                return;
            }
            if (i11 < 0) {
                iArr[i10] = -1;
            } else {
                int i12 = i11 - 1;
                if (((H(this.f2256a[i12]) - i8) & (D() - 1)) >= i9) {
                    this.f2259d[i10] = i11;
                    this.f2258c[i12] = i10;
                }
                iG--;
            }
            i10 = i8;
            i9 = 0;
            iG--;
        } while (iG >= 0);
        this.f2259d[i10] = -1;
    }

    public final boolean R(Object obj) {
        n();
        int iY = y(obj);
        if (iY < 0) {
            return false;
        }
        P(iY);
        return true;
    }

    public final boolean S(Object obj) {
        n();
        int iA = A(obj);
        if (iA < 0) {
            return false;
        }
        P(iA);
        return true;
    }

    public final boolean T(int i8) {
        int iB = B();
        int i9 = this.f2261f;
        int i10 = iB - i9;
        int size = i9 - size();
        return i10 < i8 && i10 + size >= i8 && size >= B() / 4;
    }

    public final f U() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        n();
        int i8 = this.f2261f - 1;
        if (i8 >= 0) {
            int i9 = 0;
            while (true) {
                int[] iArr = this.f2258c;
                int i10 = iArr[i9];
                if (i10 >= 0) {
                    this.f2259d[i10] = 0;
                    iArr[i9] = -1;
                }
                if (i9 == i8) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        E6.c.g(this.f2256a, 0, this.f2261f);
        Object[] objArr = this.f2257b;
        if (objArr != null) {
            E6.c.g(objArr, 0, this.f2261f);
        }
        this.f2264i = 0;
        this.f2261f = 0;
        M();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return y(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return A(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return C();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && t((Map) obj);
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iY = y(obj);
        if (iY < 0) {
            return null;
        }
        Object[] objArr = this.f2257b;
        t.d(objArr);
        return objArr[iY];
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVarX = x();
        int iL = 0;
        while (bVarX.hasNext()) {
            iL += bVarX.l();
        }
        return iL;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final int j(Object obj) {
        n();
        while (true) {
            int iH = H(obj);
            int iG = n.g(this.f2260e * 2, D() / 2);
            int i8 = 0;
            while (true) {
                int i9 = this.f2259d[iH];
                if (i9 <= 0) {
                    if (this.f2261f >= B()) {
                        w(1);
                        break;
                    }
                    int i10 = this.f2261f;
                    int i11 = i10 + 1;
                    this.f2261f = i11;
                    this.f2256a[i10] = obj;
                    this.f2258c[i10] = iH;
                    this.f2259d[iH] = i11;
                    this.f2264i = size() + 1;
                    M();
                    if (i8 > this.f2260e) {
                        this.f2260e = i8;
                    }
                    return i10;
                }
                if (t.c(this.f2256a[i9 - 1], obj)) {
                    return -i9;
                }
                i8++;
                if (i8 > iG) {
                    N(D() * 2);
                    break;
                }
                iH = iH == 0 ? D() - 1 : iH - 1;
            }
        }
    }

    public final Object[] k() {
        Object[] objArr = this.f2257b;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrD = E6.c.d(B());
        this.f2257b = objArrD;
        return objArrD;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return E();
    }

    public final Map l() {
        n();
        this.f2268m = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f2255o;
        t.e(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void n() {
        if (this.f2268m) {
            throw new UnsupportedOperationException();
        }
    }

    public final void o(boolean z8) {
        int i8;
        Object[] objArr = this.f2257b;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i8 = this.f2261f;
            if (i9 >= i8) {
                break;
            }
            int[] iArr = this.f2258c;
            int i11 = iArr[i9];
            if (i11 >= 0) {
                Object[] objArr2 = this.f2256a;
                objArr2[i10] = objArr2[i9];
                if (objArr != null) {
                    objArr[i10] = objArr[i9];
                }
                if (z8) {
                    iArr[i10] = i11;
                    this.f2259d[i11] = i10 + 1;
                }
                i10++;
            }
            i9++;
        }
        E6.c.g(this.f2256a, i10, i8);
        if (objArr != null) {
            E6.c.g(objArr, i10, this.f2261f);
        }
        this.f2261f = i10;
    }

    public final boolean p(Collection m8) {
        t.g(m8, "m");
        for (Object obj : m8) {
            if (obj != null) {
                try {
                    if (!r((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        n();
        int iJ = j(obj);
        Object[] objArrK = k();
        if (iJ >= 0) {
            objArrK[iJ] = obj2;
            return null;
        }
        int i8 = (-iJ) - 1;
        Object obj3 = objArrK[i8];
        objArrK[i8] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        t.g(from, "from");
        n();
        J(from.entrySet());
    }

    public final boolean r(Map.Entry entry) {
        t.g(entry, "entry");
        int iY = y(entry.getKey());
        if (iY < 0) {
            return false;
        }
        Object[] objArr = this.f2257b;
        t.d(objArr);
        return t.c(objArr[iY], entry.getValue());
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        n();
        int iY = y(obj);
        if (iY < 0) {
            return null;
        }
        Object[] objArr = this.f2257b;
        t.d(objArr);
        Object obj2 = objArr[iY];
        P(iY);
        return obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return F();
    }

    public final boolean t(Map map) {
        return size() == map.size() && p(map.entrySet());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b bVarX = x();
        int i8 = 0;
        while (bVarX.hasNext()) {
            if (i8 > 0) {
                sb.append(", ");
            }
            bVarX.k(sb);
            i8++;
        }
        sb.append("}");
        String string = sb.toString();
        t.f(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return G();
    }

    public final b x() {
        return new b(this);
    }

    public final int y(Object obj) {
        int iH = H(obj);
        int i8 = this.f2260e;
        while (true) {
            int i9 = this.f2259d[iH];
            if (i9 == 0) {
                return -1;
            }
            if (i9 > 0) {
                int i10 = i9 - 1;
                if (t.c(this.f2256a[i10], obj)) {
                    return i10;
                }
            }
            i8--;
            if (i8 < 0) {
                return -1;
            }
            iH = iH == 0 ? D() - 1 : iH - 1;
        }
    }

    public d() {
        this(8);
    }

    public d(int i8) {
        this(E6.c.d(i8), null, new int[i8], new int[f2254n.c(i8)], 2, 0);
    }
}
