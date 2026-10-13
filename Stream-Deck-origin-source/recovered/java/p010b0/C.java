package p010b0;

import D6.C0933m;
import T0.Vl.PCRzgdeK;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p019c0.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f15569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f15570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15571c;

    public C() {
        this(0, 1, null);
    }

    public final int a(Object obj) {
        int i8 = this.f15571c * 2;
        Object[] objArr = this.f15570b;
        if (obj == null) {
            for (int i9 = 1; i9 < i8; i9 += 2) {
                if (objArr[i9] == null) {
                    return i9 >> 1;
                }
            }
            return -1;
        }
        for (int i10 = 1; i10 < i8; i10 += 2) {
            if (t.c(obj, objArr[i10])) {
                return i10 >> 1;
            }
        }
        return -1;
    }

    public void b(int i8) {
        int i9 = this.f15571c;
        int[] iArr = this.f15569a;
        if (iArr.length < i8) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i8);
            t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.f15569a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f15570b, i8 * 2);
            t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.f15570b = objArrCopyOf;
        }
        if (this.f15571c != i9) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(Object obj, int i8) {
        int i9 = this.f15571c;
        if (i9 == 0) {
            return -1;
        }
        int iA = a.a(this.f15569a, i9, i8);
        if (iA < 0 || t.c(obj, this.f15570b[iA << 1])) {
            return iA;
        }
        int i10 = iA + 1;
        while (i10 < i9 && this.f15569a[i10] == i8) {
            if (t.c(obj, this.f15570b[i10 << 1])) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iA - 1; i11 >= 0 && this.f15569a[i11] == i8; i11--) {
            if (t.c(obj, this.f15570b[i11 << 1])) {
                return i11;
            }
        }
        return ~i10;
    }

    public void clear() {
        if (this.f15571c > 0) {
            this.f15569a = a.f16026a;
            this.f15570b = a.f16028c;
            this.f15571c = 0;
        }
        if (this.f15571c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public int d(Object obj) {
        return obj == null ? e() : c(obj, obj.hashCode());
    }

    public final int e() {
        int i8 = this.f15571c;
        if (i8 == 0) {
            return -1;
        }
        int iA = a.a(this.f15569a, i8, 0);
        if (iA < 0 || this.f15570b[iA << 1] == null) {
            return iA;
        }
        int i9 = iA + 1;
        while (i9 < i8 && this.f15569a[i9] == 0) {
            if (this.f15570b[i9 << 1] == null) {
                return i9;
            }
            i9++;
        }
        for (int i10 = iA - 1; i10 >= 0 && this.f15569a[i10] == 0; i10--) {
            if (this.f15570b[i10 << 1] == null) {
                return i10;
            }
        }
        return ~i9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C) {
                if (size() != ((C) obj).size()) {
                    return false;
                }
                C c8 = (C) obj;
                int i8 = this.f15571c;
                for (int i9 = 0; i9 < i8; i9++) {
                    Object objF = f(i9);
                    Object objJ = j(i9);
                    Object obj2 = c8.get(objF);
                    if (objJ == null) {
                        if (obj2 != null || !c8.containsKey(objF)) {
                            return false;
                        }
                    } else if (!t.c(objJ, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i10 = this.f15571c;
            for (int i11 = 0; i11 < i10; i11++) {
                Object objF2 = f(i11);
                Object objJ2 = j(i11);
                Object obj3 = ((Map) obj).get(objF2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!t.c(objJ2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object f(int i8) {
        if (i8 >= 0 && i8 < this.f15571c) {
            return this.f15570b[i8 << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
    }

    public void g(C map) {
        t.g(map, "map");
        int i8 = map.f15571c;
        b(this.f15571c + i8);
        if (this.f15571c != 0) {
            for (int i9 = 0; i9 < i8; i9++) {
                put(map.f(i9), map.j(i9));
            }
        } else if (i8 > 0) {
            C0933m.g(map.f15569a, this.f15569a, 0, 0, i8);
            C0933m.i(map.f15570b, this.f15570b, 0, 0, i8 << 1);
            this.f15571c = i8;
        }
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f15570b[(iD << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f15570b[(iD << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.f15569a;
        Object[] objArr = this.f15570b;
        int i8 = this.f15571c;
        int i9 = 1;
        int i10 = 0;
        int iHashCode = 0;
        while (i10 < i8) {
            Object obj = objArr[i9];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i10];
            i10++;
            i9 += 2;
        }
        return iHashCode;
    }

    public Object i(int i8, Object obj) {
        if (i8 < 0 || i8 >= this.f15571c) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
        }
        int i9 = (i8 << 1) + 1;
        Object[] objArr = this.f15570b;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        return obj2;
    }

    public boolean isEmpty() {
        return this.f15571c <= 0;
    }

    public Object j(int i8) {
        if (i8 >= 0 && i8 < this.f15571c) {
            return this.f15570b[(i8 << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
    }

    public Object put(Object obj, Object obj2) {
        int i8 = this.f15571c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(obj, iHashCode) : e();
        if (iC >= 0) {
            int i9 = (iC << 1) + 1;
            Object[] objArr = this.f15570b;
            Object obj3 = objArr[i9];
            objArr[i9] = obj2;
            return obj3;
        }
        int i10 = ~iC;
        int[] iArr = this.f15569a;
        if (i8 >= iArr.length) {
            int i11 = 8;
            if (i8 >= 8) {
                i11 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i11 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i11);
            t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.f15569a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f15570b, i11 << 1);
            t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.f15570b = objArrCopyOf;
            if (i8 != this.f15571c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i10 < i8) {
            int[] iArr2 = this.f15569a;
            int i12 = i10 + 1;
            C0933m.g(iArr2, iArr2, i12, i10, i8);
            Object[] objArr2 = this.f15570b;
            C0933m.i(objArr2, objArr2, i12 << 1, i10 << 1, this.f15571c << 1);
        }
        int i13 = this.f15571c;
        if (i8 == i13) {
            int[] iArr3 = this.f15569a;
            if (i10 < iArr3.length) {
                iArr3[i10] = iHashCode;
                Object[] objArr3 = this.f15570b;
                int i14 = i10 << 1;
                objArr3[i14] = obj;
                objArr3[i14 + 1] = obj2;
                this.f15571c = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return i(iD, obj2);
        }
        return null;
    }

    public int size() {
        return this.f15571c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f15571c * 28);
        sb.append('{');
        int i8 = this.f15571c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object objF = f(i9);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objJ = j(i9);
            if (objJ != sb) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        t.f(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public C(int i8) {
        this.f15569a = i8 == 0 ? a.f16026a : new int[i8];
        this.f15570b = i8 == 0 ? a.f16028c : new Object[i8 << 1];
    }

    public Object h(int i8) {
        int i9;
        if (i8 < 0 || i8 >= (i9 = this.f15571c)) {
            throw new IllegalArgumentException((PCRzgdeK.PnMVolcda + i8).toString());
        }
        Object[] objArr = this.f15570b;
        int i10 = i8 << 1;
        Object obj = objArr[i10 + 1];
        if (i9 <= 1) {
            clear();
            return obj;
        }
        int i11 = i9 - 1;
        int[] iArr = this.f15569a;
        if (iArr.length <= 8 || i9 >= iArr.length / 3) {
            if (i8 < i11) {
                int i12 = i8 + 1;
                C0933m.g(iArr, iArr, i8, i12, i9);
                Object[] objArr2 = this.f15570b;
                C0933m.i(objArr2, objArr2, i10, i12 << 1, i9 << 1);
            }
            Object[] objArr3 = this.f15570b;
            int i13 = i11 << 1;
            objArr3[i13] = null;
            objArr3[i13 + 1] = null;
        } else {
            int i14 = i9 > 8 ? i9 + (i9 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i14);
            t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.f15569a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f15570b, i14 << 1);
            t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.f15570b = objArrCopyOf;
            if (i9 != this.f15571c) {
                throw new ConcurrentModificationException();
            }
            if (i8 > 0) {
                C0933m.g(iArr, this.f15569a, 0, 0, i8);
                C0933m.i(objArr, this.f15570b, 0, 0, i10);
            }
            if (i8 < i11) {
                int i15 = i8 + 1;
                C0933m.g(iArr, this.f15569a, i8, i15, i9);
                C0933m.i(objArr, this.f15570b, i10, i15 << 1, i9 << 1);
            }
        }
        if (i9 != this.f15571c) {
            throw new ConcurrentModificationException();
        }
        this.f15571c = i11;
        return obj;
    }

    public boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !t.c(obj2, j(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !t.c(obj2, j(iD))) {
            return false;
        }
        i(iD, obj3);
        return true;
    }

    public /* synthetic */ C(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 0 : i8);
    }

    public C(C c8) {
        this(0, 1, null);
        if (c8 != null) {
            g(c8);
        }
    }
}
