package p056g1;

import java.util.Arrays;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: g1.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2358w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f23665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23666b;

    public C2358w(int i8) {
        this.f23665a = new int[i8];
    }

    public final boolean a(int i8, int i9) {
        int[] iArr = this.f23665a;
        int i10 = iArr[i8];
        int i11 = iArr[i9];
        return i10 < i11 || (i10 == i11 && iArr[i8 + 1] <= iArr[i9 + 1]);
    }

    public final int b(int i8) {
        return this.f23665a[i8];
    }

    public final int c() {
        return this.f23666b;
    }

    public final boolean d() {
        return this.f23666b != 0;
    }

    public final int e(int i8, int i9, int i10) {
        int i11 = i8 - i10;
        while (i8 < i9) {
            if (a(i8, i9)) {
                i11 += i10;
                k(i11, i8);
            }
            i8 += i10;
        }
        int i12 = i11 + i10;
        k(i12, i9);
        return i12;
    }

    public final int f() {
        int[] iArr = this.f23665a;
        int i8 = this.f23666b - 1;
        this.f23666b = i8;
        return iArr[i8];
    }

    public final void g(int i8, int i9, int i10) {
        int i11 = this.f23666b;
        int i12 = i11 + 3;
        int[] iArr = this.f23665a;
        if (i12 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.f23665a = iArrCopyOf;
        }
        int[] iArr2 = this.f23665a;
        iArr2[i11] = i8 + i10;
        iArr2[i11 + 1] = i9 + i10;
        iArr2[i11 + 2] = i10;
        this.f23666b = i12;
    }

    public final void h(int i8, int i9, int i10, int i11) {
        int i12 = this.f23666b;
        int i13 = i12 + 4;
        int[] iArr = this.f23665a;
        if (i13 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.f23665a = iArrCopyOf;
        }
        int[] iArr2 = this.f23665a;
        iArr2[i12] = i8;
        iArr2[i12 + 1] = i9;
        iArr2[i12 + 2] = i10;
        iArr2[i12 + 3] = i11;
        this.f23666b = i13;
    }

    public final void i(int i8, int i9, int i10) {
        if (i8 < i9) {
            int iE = e(i8, i9, i10);
            i(i8, iE - i10, i10);
            i(iE + i10, i9, i10);
        }
    }

    public final void j() {
        int i8 = this.f23666b;
        if (i8 % 3 != 0) {
            throw new IllegalStateException("Array size not a multiple of 3");
        }
        if (i8 > 3) {
            i(0, i8 - 3, 3);
        }
    }

    public final void k(int i8, int i9) {
        int[] iArr = this.f23665a;
        W.i(iArr, i8, i9);
        W.i(iArr, i8 + 1, i9 + 1);
        W.i(iArr, i8 + 2, i9 + 2);
    }
}
