package p010b0;

import D6.C0933m;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p019c0.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class D implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f15572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f15573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f15574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f15575d;

    public D() {
        this(0, 1, null);
    }

    public void a(int i8, Object obj) {
        int i9 = this.f15575d;
        if (i9 != 0 && i8 <= this.f15573b[i9 - 1]) {
            i(i8, obj);
            return;
        }
        if (this.f15572a && i9 >= this.f15573b.length) {
            E.d(this);
        }
        int i10 = this.f15575d;
        if (i10 >= this.f15573b.length) {
            int iE = a.e(i10 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f15573b, iE);
            t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.f15573b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f15574c, iE);
            t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.f15574c = objArrCopyOf;
        }
        this.f15573b[i10] = i8;
        this.f15574c[i10] = obj;
        this.f15575d = i10 + 1;
    }

    public void b() {
        int i8 = this.f15575d;
        Object[] objArr = this.f15574c;
        for (int i9 = 0; i9 < i8; i9++) {
            objArr[i9] = null;
        }
        this.f15575d = 0;
        this.f15572a = false;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public D clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        t.e(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        D d8 = (D) objClone;
        d8.f15573b = (int[]) this.f15573b.clone();
        d8.f15574c = (Object[]) this.f15574c.clone();
        return d8;
    }

    public boolean e(int i8) {
        return g(i8) >= 0;
    }

    public Object f(int i8) {
        return E.c(this, i8);
    }

    public int g(int i8) {
        if (this.f15572a) {
            E.d(this);
        }
        return a.a(this.f15573b, this.f15575d, i8);
    }

    public int h(int i8) {
        if (this.f15572a) {
            E.d(this);
        }
        return this.f15573b[i8];
    }

    public void i(int i8, Object obj) {
        int iA = a.a(this.f15573b, this.f15575d, i8);
        if (iA >= 0) {
            this.f15574c[iA] = obj;
            return;
        }
        int i9 = ~iA;
        if (i9 < this.f15575d && this.f15574c[i9] == E.f15576a) {
            this.f15573b[i9] = i8;
            this.f15574c[i9] = obj;
            return;
        }
        if (this.f15572a && this.f15575d >= this.f15573b.length) {
            E.d(this);
            i9 = ~a.a(this.f15573b, this.f15575d, i8);
        }
        int i10 = this.f15575d;
        if (i10 >= this.f15573b.length) {
            int iE = a.e(i10 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f15573b, iE);
            t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.f15573b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f15574c, iE);
            t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.f15574c = objArrCopyOf;
        }
        int i11 = this.f15575d;
        if (i11 - i9 != 0) {
            int[] iArr = this.f15573b;
            int i12 = i9 + 1;
            C0933m.g(iArr, iArr, i12, i9, i11);
            Object[] objArr = this.f15574c;
            C0933m.i(objArr, objArr, i12, i9, this.f15575d);
        }
        this.f15573b[i9] = i8;
        this.f15574c[i9] = obj;
        this.f15575d++;
    }

    public int k() {
        if (this.f15572a) {
            E.d(this);
        }
        return this.f15575d;
    }

    public Object l(int i8) {
        if (this.f15572a) {
            E.d(this);
        }
        return this.f15574c[i8];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f15575d * 28);
        sb.append('{');
        int i8 = this.f15575d;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            sb.append(h(i9));
            sb.append('=');
            Object objL = l(i9);
            if (objL != this) {
                sb.append(objL);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        t.f(string, "buffer.toString()");
        return string;
    }

    public D(int i8) {
        if (i8 == 0) {
            this.f15573b = a.f16026a;
            this.f15574c = a.f16028c;
        } else {
            int iE = a.e(i8);
            this.f15573b = new int[iE];
            this.f15574c = new Object[iE];
        }
    }

    public /* synthetic */ D(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 10 : i8);
    }
}
