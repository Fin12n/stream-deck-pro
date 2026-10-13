package p160s1;

import D6.C0933m;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f32873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f32874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32875c;

    public c() {
        this(0, 1, null);
    }

    public final boolean a(Object obj) {
        return e(obj) >= 0;
    }

    public final void b(int i8) {
        int i9 = this.f32875c;
        int[] iArr = this.f32873a;
        if (iArr.length < i8) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i8);
            t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.f32873a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f32874b, i8 << 1);
            t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.f32874b = objArrCopyOf;
        }
        if (this.f32875c != i9) {
            throw new ConcurrentModificationException();
        }
    }

    public final Object c(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return this.f32874b[(iE << 1) + 1];
        }
        return null;
    }

    public final int d(Object obj, int i8) {
        int i9 = this.f32875c;
        if (i9 == 0) {
            return -1;
        }
        int iA = a.a(this.f32873a, i9, i8);
        if (iA < 0 || t.c(obj, this.f32874b[iA << 1])) {
            return iA;
        }
        int i10 = iA + 1;
        while (i10 < i9 && this.f32873a[i10] == i8) {
            if (t.c(obj, this.f32874b[i10 << 1])) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iA - 1; i11 >= 0 && this.f32873a[i11] == i8; i11--) {
            if (t.c(obj, this.f32874b[i11 << 1])) {
                return i11;
            }
        }
        return ~i10;
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int i8 = this.f32875c;
                if (i8 != cVar.f32875c) {
                    return false;
                }
                for (int i9 = 0; i9 < i8; i9++) {
                    Object objH = h(i9);
                    Object objK = k(i9);
                    Object objC = cVar.c(objH);
                    if (objK == null) {
                        if (objC != null || !cVar.a(objH)) {
                            return false;
                        }
                    } else if (!t.c(objK, objC)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f32875c != ((Map) obj).size()) {
                return false;
            }
            int i10 = this.f32875c;
            for (int i11 = 0; i11 < i10; i11++) {
                Object objH2 = h(i11);
                Object objK2 = k(i11);
                Object obj2 = ((Map) obj).get(objH2);
                if (objK2 == null) {
                    if (obj2 != null || !((Map) obj).containsKey(objH2)) {
                        return false;
                    }
                } else if (!t.c(objK2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i8 = this.f32875c;
        if (i8 == 0) {
            return -1;
        }
        int iA = a.a(this.f32873a, i8, 0);
        if (iA < 0 || this.f32874b[iA << 1] == null) {
            return iA;
        }
        int i9 = iA + 1;
        while (i9 < i8 && this.f32873a[i9] == 0) {
            if (this.f32874b[i9 << 1] == null) {
                return i9;
            }
            i9++;
        }
        for (int i10 = iA - 1; i10 >= 0 && this.f32873a[i10] == 0; i10--) {
            if (this.f32874b[i10 << 1] == null) {
                return i10;
            }
        }
        return ~i9;
    }

    public final boolean g() {
        return this.f32875c <= 0;
    }

    public final Object h(int i8) {
        return this.f32874b[i8 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f32873a;
        Object[] objArr = this.f32874b;
        int i8 = this.f32875c;
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

    public final Object i(Object obj, Object obj2) {
        int iHashCode;
        int iD;
        int i8 = this.f32875c;
        if (obj == null) {
            iD = f();
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
            iD = d(obj, iHashCode);
        }
        if (iD >= 0) {
            int i9 = (iD << 1) + 1;
            Object[] objArr = this.f32874b;
            Object obj3 = objArr[i9];
            objArr[i9] = obj2;
            return obj3;
        }
        int i10 = ~iD;
        int[] iArr = this.f32873a;
        if (i8 >= iArr.length) {
            int i11 = 8;
            if (i8 >= 8) {
                i11 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i11 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i11);
            t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.f32873a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f32874b, i11 << 1);
            t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.f32874b = objArrCopyOf;
            if (i8 != this.f32875c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i10 < i8) {
            int[] iArr2 = this.f32873a;
            int i12 = i10 + 1;
            C0933m.g(iArr2, iArr2, i12, i10, i8);
            Object[] objArr2 = this.f32874b;
            C0933m.i(objArr2, objArr2, i12 << 1, i10 << 1, this.f32875c << 1);
        }
        int i13 = this.f32875c;
        if (i8 == i13) {
            int[] iArr3 = this.f32873a;
            if (i10 < iArr3.length) {
                iArr3[i10] = iHashCode;
                Object[] objArr3 = this.f32874b;
                int i14 = i10 << 1;
                objArr3[i14] = obj;
                objArr3[i14 + 1] = obj2;
                this.f32875c = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final void j(c cVar) {
        int i8 = cVar.f32875c;
        b(this.f32875c + i8);
        if (this.f32875c != 0) {
            for (int i9 = 0; i9 < i8; i9++) {
                i(cVar.h(i9), cVar.k(i9));
            }
        } else if (i8 > 0) {
            C0933m.g(cVar.f32873a, this.f32873a, 0, 0, i8);
            C0933m.i(cVar.f32874b, this.f32874b, 0, 0, i8 << 1);
            this.f32875c = i8;
        }
    }

    public final Object k(int i8) {
        return this.f32874b[(i8 << 1) + 1];
    }

    public String toString() {
        if (g()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f32875c * 28);
        sb.append('{');
        int i8 = this.f32875c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object objH = h(i9);
            if (objH != this) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objK = k(i9);
            if (objK != this) {
                sb.append(objK);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public c(int i8) {
        if (i8 == 0) {
            this.f32873a = a.f32861a;
            this.f32874b = a.f32862b;
        } else {
            this.f32873a = new int[i8];
            this.f32874b = new Object[i8 << 1];
        }
        this.f32875c = 0;
    }

    public /* synthetic */ c(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 0 : i8);
    }

    public c(c cVar) {
        this(0, 1, null);
        if (cVar != null) {
            j(cVar);
        }
    }
}
