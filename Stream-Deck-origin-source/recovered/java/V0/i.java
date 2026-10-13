package V0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final void a(char c8, ArrayList arrayList, float[] fArr, int i8) {
        if (c8 == 'z' || c8 == 'Z') {
            arrayList.add(h.b.f10354c);
            return;
        }
        int i9 = 0;
        if (c8 == 'm') {
            int i10 = i8 - 2;
            while (i9 <= i10) {
                int i11 = i9 + 1;
                h nVar = new h.n(fArr[i9], fArr[i11]);
                if (i9 > 0) {
                    nVar = new h.m(fArr[i9], fArr[i11]);
                }
                arrayList.add(nVar);
                i9 += 2;
            }
            return;
        }
        if (c8 == 'M') {
            int i12 = i8 - 2;
            while (i9 <= i12) {
                int i13 = i9 + 1;
                h fVar = new h.f(fArr[i9], fArr[i13]);
                if (i9 > 0) {
                    fVar = new h.e(fArr[i9], fArr[i13]);
                }
                arrayList.add(fVar);
                i9 += 2;
            }
            return;
        }
        if (c8 == 'l') {
            int i14 = i8 - 2;
            while (i9 <= i14) {
                arrayList.add(new h.m(fArr[i9], fArr[i9 + 1]));
                i9 += 2;
            }
            return;
        }
        if (c8 == 'L') {
            int i15 = i8 - 2;
            while (i9 <= i15) {
                arrayList.add(new h.e(fArr[i9], fArr[i9 + 1]));
                i9 += 2;
            }
            return;
        }
        if (c8 == 'h') {
            int i16 = i8 - 1;
            while (i9 <= i16) {
                arrayList.add(new h.l(fArr[i9]));
                i9++;
            }
            return;
        }
        if (c8 == 'H') {
            int i17 = i8 - 1;
            while (i9 <= i17) {
                arrayList.add(new h.d(fArr[i9]));
                i9++;
            }
            return;
        }
        if (c8 == 'v') {
            int i18 = i8 - 1;
            while (i9 <= i18) {
                arrayList.add(new h.r(fArr[i9]));
                i9++;
            }
            return;
        }
        if (c8 == 'V') {
            int i19 = i8 - 1;
            while (i9 <= i19) {
                arrayList.add(new h.s(fArr[i9]));
                i9++;
            }
            return;
        }
        if (c8 == 'c') {
            int i20 = i8 - 6;
            while (i9 <= i20) {
                arrayList.add(new h.k(fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3], fArr[i9 + 4], fArr[i9 + 5]));
                i9 += 6;
            }
            return;
        }
        if (c8 == 'C') {
            int i21 = i8 - 6;
            while (i9 <= i21) {
                arrayList.add(new h.c(fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3], fArr[i9 + 4], fArr[i9 + 5]));
                i9 += 6;
            }
            return;
        }
        if (c8 == 's') {
            int i22 = i8 - 4;
            while (i9 <= i22) {
                arrayList.add(new h.p(fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3]));
                i9 += 4;
            }
            return;
        }
        if (c8 == 'S') {
            int i23 = i8 - 4;
            while (i9 <= i23) {
                arrayList.add(new h.C0287h(fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3]));
                i9 += 4;
            }
            return;
        }
        if (c8 == 'q') {
            int i24 = i8 - 4;
            while (i9 <= i24) {
                arrayList.add(new h.o(fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3]));
                i9 += 4;
            }
            return;
        }
        if (c8 == 'Q') {
            int i25 = i8 - 4;
            while (i9 <= i25) {
                arrayList.add(new h.g(fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3]));
                i9 += 4;
            }
            return;
        }
        if (c8 == 't') {
            int i26 = i8 - 2;
            while (i9 <= i26) {
                arrayList.add(new h.q(fArr[i9], fArr[i9 + 1]));
                i9 += 2;
            }
            return;
        }
        if (c8 == 'T') {
            int i27 = i8 - 2;
            while (i9 <= i27) {
                arrayList.add(new h.i(fArr[i9], fArr[i9 + 1]));
                i9 += 2;
            }
            return;
        }
        if (c8 == 'a') {
            int i28 = i8 - 7;
            for (int i29 = 0; i29 <= i28; i29 += 7) {
                arrayList.add(new h.j(fArr[i29], fArr[i29 + 1], fArr[i29 + 2], Float.compare(fArr[i29 + 3], 0.0f) != 0, Float.compare(fArr[i29 + 4], 0.0f) != 0, fArr[i29 + 5], fArr[i29 + 6]));
            }
            return;
        }
        if (c8 != 'A') {
            throw new IllegalArgumentException("Unknown command for: " + c8);
        }
        int i30 = i8 - 7;
        for (int i31 = 0; i31 <= i30; i31 += 7) {
            arrayList.add(new h.a(fArr[i31], fArr[i31 + 1], fArr[i31 + 2], Float.compare(fArr[i31 + 3], 0.0f) != 0, Float.compare(fArr[i31 + 4], 0.0f) != 0, fArr[i31 + 5], fArr[i31 + 6]));
        }
    }
}
