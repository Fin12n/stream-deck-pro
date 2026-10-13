package N4;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Z extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f6720j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f6721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int[] f6722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Object[] f6723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object[] f6724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f6725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f6726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient Set f6727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient Set f6728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient Collection f6729i;

    public Z(int i8) {
        v(12);
    }

    public static /* synthetic */ Object j(Z z8, int i8) {
        return z8.b()[i8];
    }

    public static /* synthetic */ Object l(Z z8) {
        Object obj = z8.f6721a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static /* synthetic */ Object n(Z z8, int i8) {
        return z8.c()[i8];
    }

    public static /* synthetic */ void r(Z z8, int i8, Object obj) {
        z8.c()[i8] = obj;
    }

    public final int C() {
        return (1 << (this.f6725e & 31)) - 1;
    }

    public final int D(Object obj) {
        if (x()) {
            return -1;
        }
        int iA = AbstractC1087b0.a(obj);
        int iC = C();
        Object obj2 = this.f6721a;
        Objects.requireNonNull(obj2);
        int iC2 = AbstractC1075a0.c(obj2, iA & iC);
        if (iC2 != 0) {
            int i8 = ~iC;
            int i9 = iA & i8;
            do {
                int i10 = iC2 - 1;
                int i11 = a()[i10];
                if ((i11 & i8) == i9 && r.a(obj, b()[i10])) {
                    return i10;
                }
                iC2 = i11 & iC;
            } while (iC2 != 0);
        }
        return -1;
    }

    public final int E(int i8, int i9, int i10, int i11) {
        int i12 = i9 - 1;
        Object objD = AbstractC1075a0.d(i9);
        if (i11 != 0) {
            AbstractC1075a0.e(objD, i10 & i12, i11 + 1);
        }
        Object obj = this.f6721a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        for (int i13 = 0; i13 <= i8; i13++) {
            int iC = AbstractC1075a0.c(obj, i13);
            while (iC != 0) {
                int i14 = iC - 1;
                int i15 = iArrA[i14];
                int i16 = ((~i8) & i15) | i13;
                int i17 = i16 & i12;
                int iC2 = AbstractC1075a0.c(objD, i17);
                AbstractC1075a0.e(objD, i17, iC);
                iArrA[i14] = ((~i12) & i16) | (iC2 & i12);
                iC = i15 & i8;
            }
        }
        this.f6721a = objD;
        G(i12);
        return i12;
    }

    public final Object F(Object obj) {
        if (!x()) {
            int iC = C();
            Object obj2 = this.f6721a;
            Objects.requireNonNull(obj2);
            int iB = AbstractC1075a0.b(obj, null, iC, obj2, a(), b(), null);
            if (iB != -1) {
                Object obj3 = c()[iB];
                w(iB, iC);
                this.f6726f--;
                t();
                return obj3;
            }
        }
        return f6720j;
    }

    public final void G(int i8) {
        this.f6725e = ((32 - Integer.numberOfLeadingZeros(i8)) & 31) | (this.f6725e & (-32));
    }

    public final int[] a() {
        int[] iArr = this.f6722b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] b() {
        Object[] objArr = this.f6723c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] c() {
        Object[] objArr = this.f6724d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (x()) {
            return;
        }
        t();
        Map mapP = p();
        if (mapP != null) {
            this.f6725e = J0.a(size(), 3, 1073741823);
            mapP.clear();
            this.f6721a = null;
            this.f6726f = 0;
            return;
        }
        Arrays.fill(b(), 0, this.f6726f, (Object) null);
        Arrays.fill(c(), 0, this.f6726f, (Object) null);
        Object obj = this.f6721a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f6726f, 0);
        this.f6726f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapP = p();
        if (mapP != null) {
            return mapP.containsKey(obj);
        }
        return D(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapP = p();
        if (mapP != null) {
            return mapP.containsValue(obj);
        }
        for (int i8 = 0; i8 < this.f6726f; i8++) {
            if (r.a(obj, c()[i8])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f6728h;
        if (set != null) {
            return set;
        }
        T t8 = new T(this);
        this.f6728h = t8;
        return t8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapP = p();
        if (mapP != null) {
            return mapP.get(obj);
        }
        int iD = D(obj);
        if (iD == -1) {
            return null;
        }
        return c()[iD];
    }

    public final int h() {
        return isEmpty() ? -1 : 0;
    }

    public final int i(int i8) {
        int i9 = i8 + 1;
        if (i9 < this.f6726f) {
            return i9;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f6727g;
        if (set != null) {
            return set;
        }
        W w8 = new W(this);
        this.f6727g = w8;
        return w8;
    }

    public final Map p() {
        Object obj = this.f6721a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i8;
        if (x()) {
            AbstractC1296t.e(x(), "Arrays already allocated");
            int i9 = this.f6725e;
            int iMax = Math.max(i9 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f6721a = AbstractC1075a0.d(iMax2);
            G(iMax2 - 1);
            this.f6722b = new int[i9];
            this.f6723c = new Object[i9];
            this.f6724d = new Object[i9];
        }
        Map mapP = p();
        if (mapP != null) {
            return mapP.put(obj, obj2);
        }
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int i10 = this.f6726f;
        int i11 = i10 + 1;
        int iA = AbstractC1087b0.a(obj);
        int iC = C();
        int i12 = iA & iC;
        Object obj3 = this.f6721a;
        Objects.requireNonNull(obj3);
        int iC2 = AbstractC1075a0.c(obj3, i12);
        if (iC2 == 0) {
            if (i11 > iC) {
                iC = E(iC, AbstractC1075a0.a(iC), iA, i10);
            } else {
                Object obj4 = this.f6721a;
                Objects.requireNonNull(obj4);
                AbstractC1075a0.e(obj4, i12, i11);
            }
            i8 = 1;
        } else {
            int i13 = ~iC;
            int i14 = iA & i13;
            int i15 = 0;
            while (true) {
                int i16 = iC2 - 1;
                int i17 = iArrA[i16];
                i8 = 1;
                int i18 = i17 & i13;
                if (i18 == i14 && r.a(obj, objArrB[i16])) {
                    Object obj5 = objArrC[i16];
                    objArrC[i16] = obj2;
                    return obj5;
                }
                int i19 = i17 & iC;
                i15++;
                if (i19 == 0) {
                    if (i15 < 9) {
                        if (i11 <= iC) {
                            iArrA[i16] = (i11 & iC) | i18;
                            break;
                        }
                        iC = E(iC, AbstractC1075a0.a(iC), iA, i10);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C() + 1, 1.0f);
                    int iH = h();
                    while (iH >= 0) {
                        linkedHashMap.put(b()[iH], c()[iH]);
                        iH = i(iH);
                    }
                    this.f6721a = linkedHashMap;
                    this.f6722b = null;
                    this.f6723c = null;
                    this.f6724d = null;
                    t();
                    return linkedHashMap.put(obj, obj2);
                }
                iC2 = i19;
            }
        }
        int length = a().length;
        if (i11 > length) {
            int i20 = i8;
            int iMin = Math.min(1073741823, (Math.max(i20, length >>> 1) + length) | i20);
            if (iMin != length) {
                this.f6722b = Arrays.copyOf(a(), iMin);
                this.f6723c = Arrays.copyOf(b(), iMin);
                this.f6724d = Arrays.copyOf(c(), iMin);
            }
        }
        a()[i10] = (~iC) & iA;
        b()[i10] = obj;
        c()[i10] = obj2;
        this.f6726f = i11;
        t();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapP = p();
        if (mapP != null) {
            return mapP.remove(obj);
        }
        Object objF = F(obj);
        if (objF == f6720j) {
            return null;
        }
        return objF;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapP = p();
        return mapP != null ? mapP.size() : this.f6726f;
    }

    public final void t() {
        this.f6725e += 32;
    }

    public final void v(int i8) {
        this.f6725e = J0.a(i8, 1, 1073741823);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f6729i;
        if (collection != null) {
            return collection;
        }
        Y y8 = new Y(this);
        this.f6729i = y8;
        return y8;
    }

    public final void w(int i8, int i9) {
        Object obj = this.f6721a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int size = size();
        int i10 = size - 1;
        if (i8 >= i10) {
            objArrB[i8] = null;
            objArrC[i8] = null;
            iArrA[i8] = 0;
            return;
        }
        int i11 = i8 + 1;
        Object obj2 = objArrB[i10];
        objArrB[i8] = obj2;
        objArrC[i8] = objArrC[i10];
        objArrB[i10] = null;
        objArrC[i10] = null;
        iArrA[i8] = iArrA[i10];
        iArrA[i10] = 0;
        int iA = AbstractC1087b0.a(obj2) & i9;
        int iC = AbstractC1075a0.c(obj, iA);
        if (iC == size) {
            AbstractC1075a0.e(obj, iA, i11);
            return;
        }
        while (true) {
            int i12 = iC - 1;
            int i13 = iArrA[i12];
            int i14 = i13 & i9;
            if (i14 == size) {
                iArrA[i12] = (i13 & (~i9)) | (i9 & i11);
                return;
            }
            iC = i14;
        }
    }

    public final boolean x() {
        return this.f6721a == null;
    }
}
