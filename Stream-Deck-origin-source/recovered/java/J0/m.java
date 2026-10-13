package J0;

import D6.C0933m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f3983b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f3984c = new int[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f3985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3986e;

    public m() {
        int[] iArr = new int[16];
        int i8 = 0;
        while (i8 < 16) {
            int i9 = i8 + 1;
            iArr[i8] = i9;
            i8 = i9;
        }
        this.f3985d = iArr;
    }

    public final int a(int i8) {
        c(this.f3982a + 1);
        int i9 = this.f3982a;
        this.f3982a = i9 + 1;
        int iB = b();
        this.f3983b[i9] = i8;
        this.f3984c[i9] = iB;
        this.f3985d[iB] = i9;
        h(i9);
        return iB;
    }

    public final int b() {
        int length = this.f3985d.length;
        if (this.f3986e >= length) {
            int i8 = length * 2;
            int[] iArr = new int[i8];
            int i9 = 0;
            while (i9 < i8) {
                int i10 = i9 + 1;
                iArr[i9] = i10;
                i9 = i10;
            }
            C0933m.l(this.f3985d, iArr, 0, 0, 0, 14, null);
            this.f3985d = iArr;
        }
        int i11 = this.f3986e;
        this.f3986e = this.f3985d[i11];
        return i11;
    }

    public final void c(int i8) {
        int[] iArr = this.f3983b;
        int length = iArr.length;
        if (i8 <= length) {
            return;
        }
        int i9 = length * 2;
        int[] iArr2 = new int[i9];
        int[] iArr3 = new int[i9];
        C0933m.l(iArr, iArr2, 0, 0, 0, 14, null);
        C0933m.l(this.f3984c, iArr3, 0, 0, 0, 14, null);
        this.f3983b = iArr2;
        this.f3984c = iArr3;
    }

    public final void d(int i8) {
        this.f3985d[i8] = this.f3986e;
        this.f3986e = i8;
    }

    public final int e(int i8) {
        return this.f3982a > 0 ? this.f3983b[0] : i8;
    }

    public final void f(int i8) {
        int i9 = this.f3985d[i8];
        i(i9, this.f3982a - 1);
        this.f3982a--;
        h(i9);
        g(i9);
        d(i8);
    }

    public final void g(int i8) {
        int i9;
        int[] iArr = this.f3983b;
        int i10 = this.f3982a >> 1;
        while (i8 < i10) {
            int i11 = (i8 + 1) << 1;
            int i12 = i11 - 1;
            if (i11 >= this.f3982a || (i9 = iArr[i11]) >= iArr[i12]) {
                if (iArr[i12] >= iArr[i8]) {
                    return;
                }
                i(i12, i8);
                i8 = i12;
            } else {
                if (i9 >= iArr[i8]) {
                    return;
                }
                i(i11, i8);
                i8 = i11;
            }
        }
    }

    public final void h(int i8) {
        int[] iArr = this.f3983b;
        int i9 = iArr[i8];
        while (i8 > 0) {
            int i10 = ((i8 + 1) >> 1) - 1;
            if (iArr[i10] <= i9) {
                return;
            }
            i(i10, i8);
            i8 = i10;
        }
    }

    public final void i(int i8, int i9) {
        int[] iArr = this.f3983b;
        int[] iArr2 = this.f3984c;
        int[] iArr3 = this.f3985d;
        int i10 = iArr[i8];
        iArr[i8] = iArr[i9];
        iArr[i9] = i10;
        int i11 = iArr2[i8];
        iArr2[i8] = iArr2[i9];
        iArr2[i9] = i11;
        iArr3[iArr2[i8]] = i8;
        iArr3[iArr2[i9]] = i9;
    }
}
