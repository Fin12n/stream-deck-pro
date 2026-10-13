package p103l3;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p076i3.d;
import p112m3.c;
import p121n3.b;
import p121n3.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class o implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29189a;

    public o(int i8) {
        this.f29189a = i8;
    }

    public static float[] e(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            float f8 = i9 < fArr.length ? fArr[i9] : Float.NaN;
            float f9 = i10 < fArr2.length ? fArr2[i10] : Float.NaN;
            if (Float.isNaN(f9) || f8 < f9) {
                fArr3[i11] = f8;
                i9++;
            } else if (Float.isNaN(f8) || f9 < f8) {
                fArr3[i11] = f9;
                i10++;
            } else {
                fArr3[i11] = f8;
                i9++;
                i10++;
                i8++;
            }
        }
        return i8 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i8);
    }

    public final d b(d dVar, List list) {
        int i8 = this.f29189a * 4;
        if (list.size() <= i8) {
            return dVar;
        }
        float[] fArrE = dVar.e();
        int[] iArrD = dVar.d();
        int size = (list.size() - i8) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i9 = 0;
        while (i8 < list.size()) {
            if (i8 % 2 == 0) {
                fArr[i9] = ((Float) list.get(i8)).floatValue();
            } else {
                fArr2[i9] = ((Float) list.get(i8)).floatValue();
                i9++;
            }
            i8++;
        }
        float[] fArrE2 = e(dVar.e(), fArr);
        int length = fArrE2.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            float f8 = fArrE2[i10];
            int iBinarySearch = Arrays.binarySearch(fArrE, f8);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f8);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i10] = c(f8, fArr2[iBinarySearch2], fArrE, iArrD);
            } else {
                iArr[i10] = d(f8, iArrD[iBinarySearch], fArr, fArr2);
            }
        }
        return new d(fArrE2, iArr);
    }

    public int c(float f8, float f9, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f8 == fArr[0]) {
            return iArr[0];
        }
        for (int i8 = 1; i8 < fArr.length; i8++) {
            float f10 = fArr[i8];
            if (f10 >= f8 || i8 == fArr.length - 1) {
                if (i8 == fArr.length - 1 && f8 >= f10) {
                    return Color.argb((int) (f9 * 255.0f), Color.red(iArr[i8]), Color.green(iArr[i8]), Color.blue(iArr[i8]));
                }
                int i9 = i8 - 1;
                float f11 = fArr[i9];
                int iC = b.c((f8 - f11) / (f10 - f11), iArr[i9], iArr[i8]);
                return Color.argb((int) (f9 * 255.0f), Color.red(iC), Color.green(iC), Color.blue(iC));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    public final int d(float f8, int i8, float[] fArr, float[] fArr2) {
        float fI;
        if (fArr2.length < 2 || f8 <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i8), Color.green(i8), Color.blue(i8));
        }
        for (int i9 = 1; i9 < fArr.length; i9++) {
            float f9 = fArr[i9];
            if (f9 >= f8 || i9 == fArr.length - 1) {
                if (f9 <= f8) {
                    fI = fArr2[i9];
                } else {
                    int i10 = i9 - 1;
                    float f10 = fArr[i10];
                    fI = i.i(fArr2[i10], fArr2[i9], (f8 - f10) / (f9 - f10));
                }
                return Color.argb((int) (fI * 255.0f), Color.red(i8), Color.green(i8), Color.blue(i8));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    @Override // p103l3.N
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d a(c cVar, float f8) {
        ArrayList arrayList = new ArrayList();
        boolean z8 = cVar.y() == c.b.BEGIN_ARRAY;
        if (z8) {
            cVar.c();
        }
        while (cVar.o()) {
            arrayList.add(Float.valueOf((float) cVar.nextDouble()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f29189a = 2;
        }
        if (z8) {
            cVar.j();
        }
        if (this.f29189a == -1) {
            this.f29189a = arrayList.size() / 4;
        }
        int i8 = this.f29189a;
        float[] fArr = new float[i8];
        int[] iArr = new int[i8];
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f29189a * 4; i11++) {
            int i12 = i11 / 4;
            double dFloatValue = ((Float) arrayList.get(i11)).floatValue();
            int i13 = i11 % 4;
            if (i13 != 0) {
                if (i13 == 1) {
                    i9 = (int) (dFloatValue * 255.0d);
                } else if (i13 == 2) {
                    i10 = (int) (dFloatValue * 255.0d);
                } else if (i13 == 3) {
                    iArr[i12] = Color.argb(255, i9, i10, (int) (dFloatValue * 255.0d));
                }
            } else if (i12 > 0) {
                float f9 = (float) dFloatValue;
                if (fArr[i12 - 1] >= f9) {
                    fArr[i12] = f9 + 0.01f;
                } else {
                    fArr[i12] = (float) dFloatValue;
                }
            } else {
                fArr[i12] = (float) dFloatValue;
            }
        }
        return b(new d(fArr, iArr), arrayList);
    }
}
