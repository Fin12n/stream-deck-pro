package p010b0;

import D6.C0933m;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p019c0.a;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class m implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f15619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f15620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f15621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f15622d;

    public m() {
        this(0, 1, null);
    }

    public void a() {
        int i8 = this.f15622d;
        Object[] objArr = this.f15621c;
        for (int i9 = 0; i9 < i8; i9++) {
            objArr[i9] = null;
        }
        this.f15622d = 0;
        this.f15619a = false;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        t.e(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        m mVar = (m) objClone;
        mVar.f15620b = (long[]) this.f15620b.clone();
        mVar.f15621c = (Object[]) this.f15621c.clone();
        return mVar;
    }

    public boolean d(long j8) {
        return f(j8) >= 0;
    }

    public Object e(long j8) {
        int iB = a.b(this.f15620b, this.f15622d, j8);
        if (iB < 0 || this.f15621c[iB] == n.f15623a) {
            return null;
        }
        return this.f15621c[iB];
    }

    public int f(long j8) {
        if (this.f15619a) {
            int i8 = this.f15622d;
            long[] jArr = this.f15620b;
            Object[] objArr = this.f15621c;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != n.f15623a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f15619a = false;
            this.f15622d = i9;
        }
        return a.b(this.f15620b, this.f15622d, j8);
    }

    public boolean g() {
        return l() == 0;
    }

    public long h(int i8) {
        int i9;
        if (i8 < 0 || i8 >= (i9 = this.f15622d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
        }
        if (this.f15619a) {
            long[] jArr = this.f15620b;
            Object[] objArr = this.f15621c;
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                Object obj = objArr[i11];
                if (obj != n.f15623a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f15619a = false;
            this.f15622d = i10;
        }
        return this.f15620b[i8];
    }

    public void i(long j8, Object obj) {
        int iB = a.b(this.f15620b, this.f15622d, j8);
        if (iB >= 0) {
            this.f15621c[iB] = obj;
            return;
        }
        int i8 = ~iB;
        if (i8 < this.f15622d && this.f15621c[i8] == n.f15623a) {
            this.f15620b[i8] = j8;
            this.f15621c[i8] = obj;
            return;
        }
        if (this.f15619a) {
            int i9 = this.f15622d;
            long[] jArr = this.f15620b;
            if (i9 >= jArr.length) {
                Object[] objArr = this.f15621c;
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    Object obj2 = objArr[i11];
                    if (obj2 != n.f15623a) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj2;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                this.f15619a = false;
                this.f15622d = i10;
                i8 = ~a.b(this.f15620b, i10, j8);
            }
        }
        int i12 = this.f15622d;
        if (i12 >= this.f15620b.length) {
            int iF = a.f(i12 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f15620b, iF);
            t.f(jArrCopyOf, "copyOf(this, newSize)");
            this.f15620b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f15621c, iF);
            t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.f15621c = objArrCopyOf;
        }
        int i13 = this.f15622d;
        if (i13 - i8 != 0) {
            long[] jArr2 = this.f15620b;
            int i14 = i8 + 1;
            C0933m.h(jArr2, jArr2, i14, i8, i13);
            Object[] objArr2 = this.f15621c;
            C0933m.i(objArr2, objArr2, i14, i8, this.f15622d);
        }
        this.f15620b[i8] = j8;
        this.f15621c[i8] = obj;
        this.f15622d++;
    }

    public void k(long j8) {
        int iB = a.b(this.f15620b, this.f15622d, j8);
        if (iB < 0 || this.f15621c[iB] == n.f15623a) {
            return;
        }
        this.f15621c[iB] = n.f15623a;
        this.f15619a = true;
    }

    public int l() {
        if (this.f15619a) {
            int i8 = this.f15622d;
            long[] jArr = this.f15620b;
            Object[] objArr = this.f15621c;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != n.f15623a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f15619a = false;
            this.f15622d = i9;
        }
        return this.f15622d;
    }

    public Object m(int i8) {
        int i9;
        if (i8 < 0 || i8 >= (i9 = this.f15622d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
        }
        if (this.f15619a) {
            long[] jArr = this.f15620b;
            Object[] objArr = this.f15621c;
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                Object obj = objArr[i11];
                if (obj != n.f15623a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f15619a = false;
            this.f15622d = i10;
        }
        return this.f15621c[i8];
    }

    public m(int i8) {
        if (i8 == 0) {
            this.f15620b = a.f16027b;
            this.f15621c = a.f16028c;
        } else {
            int iF = a.f(i8);
            this.f15620b = new long[iF];
            this.f15621c = new Object[iF];
        }
    }

    public String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f15622d * 28);
        sb.append('{');
        int i8 = this.f15622d;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            sb.append(h(i9));
            sb.append('=');
            Object objM = m(i9);
            if (objM != sb) {
                sb.append(objM);
            } else {
                sb.append(hJroAgFztiMK.sXIaiLijWlyB);
            }
        }
        sb.append('}');
        String string = sb.toString();
        t.f(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public /* synthetic */ m(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 10 : i8);
    }
}
