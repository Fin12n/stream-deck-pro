package p076i3;

import java.util.Arrays;
import p121n3.b;
import p121n3.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f24592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f24593b;

    public d(float[] fArr, int[] iArr) {
        this.f24592a = fArr;
        this.f24593b = iArr;
    }

    public final void a(d dVar) {
        int i8 = 0;
        while (true) {
            int[] iArr = dVar.f24593b;
            if (i8 >= iArr.length) {
                return;
            }
            this.f24592a[i8] = dVar.f24592a[i8];
            this.f24593b[i8] = iArr[i8];
            i8++;
        }
    }

    public d b(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i8 = 0; i8 < fArr.length; i8++) {
            iArr[i8] = c(fArr[i8]);
        }
        return new d(fArr, iArr);
    }

    public final int c(float f8) {
        int iBinarySearch = Arrays.binarySearch(this.f24592a, f8);
        if (iBinarySearch >= 0) {
            return this.f24593b[iBinarySearch];
        }
        int i8 = -(iBinarySearch + 1);
        if (i8 == 0) {
            return this.f24593b[0];
        }
        int[] iArr = this.f24593b;
        if (i8 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f24592a;
        int i9 = i8 - 1;
        float f9 = fArr[i9];
        return b.c((f8 - f9) / (fArr[i8] - f9), iArr[i9], iArr[i8]);
    }

    public int[] d() {
        return this.f24593b;
    }

    public float[] e() {
        return this.f24592a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (Arrays.equals(this.f24592a, dVar.f24592a) && Arrays.equals(this.f24593b, dVar.f24593b)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f24593b.length;
    }

    public void g(d dVar, d dVar2, float f8) {
        int[] iArr;
        if (dVar.equals(dVar2)) {
            a(dVar);
            return;
        }
        if (f8 <= 0.0f) {
            a(dVar);
            return;
        }
        if (f8 >= 1.0f) {
            a(dVar2);
            return;
        }
        if (dVar.f24593b.length != dVar2.f24593b.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f24593b.length + " vs " + dVar2.f24593b.length + ")");
        }
        int i8 = 0;
        while (true) {
            iArr = dVar.f24593b;
            if (i8 >= iArr.length) {
                break;
            }
            this.f24592a[i8] = i.i(dVar.f24592a[i8], dVar2.f24592a[i8], f8);
            this.f24593b[i8] = b.c(f8, dVar.f24593b[i8], dVar2.f24593b[i8]);
            i8++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.f24592a;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = dVar.f24593b;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.f24593b;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f24592a) * 31) + Arrays.hashCode(this.f24593b);
    }
}
