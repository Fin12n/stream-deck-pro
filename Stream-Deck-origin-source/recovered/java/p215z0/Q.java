package p215z0;

import java.util.Arrays;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f38643a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38644b;

    public final void a() {
        this.f38644b = 0;
    }

    public final int b() {
        return this.f38644b;
    }

    public final int c(int i8) {
        int i9 = this.f38644b;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.f38643a[i10] == i8) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean d() {
        return this.f38644b == 0;
    }

    public final int e() {
        return this.f38643a[this.f38644b - 1];
    }

    public final int f(int i8) {
        return this.f38643a[i8];
    }

    public final int g(int i8) {
        return this.f38644b > 0 ? e() : i8;
    }

    public final int h() {
        int[] iArr = this.f38643a;
        int i8 = this.f38644b - 1;
        this.f38644b = i8;
        return iArr[i8];
    }

    public final void i(int i8) {
        int i9 = this.f38644b;
        int[] iArr = this.f38643a;
        if (i9 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.f38643a = iArrCopyOf;
        }
        int[] iArr2 = this.f38643a;
        int i10 = this.f38644b;
        this.f38644b = i10 + 1;
        iArr2[i10] = i8;
    }
}
