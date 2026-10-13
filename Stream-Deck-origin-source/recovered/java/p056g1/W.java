package p056g1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class W {
    public static final void b(C2358w c2358w, InterfaceC2351o interfaceC2351o) {
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < c2358w.c()) {
            int i11 = i8 + 2;
            int iB = c2358w.b(i8) - c2358w.b(i11);
            int iB2 = c2358w.b(i8 + 1) - c2358w.b(i11);
            int iB3 = c2358w.b(i11);
            i8 += 3;
            while (i9 < iB) {
                interfaceC2351o.a(i10, i9);
                i9++;
            }
            while (i10 < iB2) {
                interfaceC2351o.d(i10);
                i10++;
            }
            while (true) {
                int i12 = iB3 - 1;
                if (iB3 > 0) {
                    interfaceC2351o.c(i9, i10);
                    i9++;
                    i10++;
                    iB3 = i12;
                }
            }
        }
    }

    public static final boolean c(int i8, int i9, int i10, int i11, InterfaceC2351o interfaceC2351o, int[] iArr, int[] iArr2, int i12, int[] iArr3) {
        int iB;
        int i13;
        int i14;
        int i15 = (i9 - i8) - (i11 - i10);
        boolean z8 = i15 % 2 == 0;
        int i16 = -i12;
        for (int i17 = i16; i17 <= i12; i17 += 2) {
            if (i17 == i16 || (i17 != i12 && AbstractC2342f.b(iArr2, i17 + 1) < AbstractC2342f.b(iArr2, i17 - 1))) {
                iB = AbstractC2342f.b(iArr2, i17 + 1);
                i13 = iB;
            } else {
                iB = AbstractC2342f.b(iArr2, i17 - 1);
                i13 = iB - 1;
            }
            int i18 = i11 - ((i9 - i13) - i17);
            int i19 = (i12 == 0 || i13 != iB) ? i18 : i18 + 1;
            while (true) {
                if (i13 <= i8 || i18 <= i10) {
                    break;
                }
                if (!interfaceC2351o.b(i13 - 1, i18 - 1)) {
                    break;
                }
                i13--;
                i18--;
            }
            AbstractC2342f.d(iArr2, i17, i13);
            if (z8 && (i14 = i15 - i17) >= i16 && i14 <= i12) {
                if (AbstractC2342f.b(iArr, i14) >= i13) {
                    f(i13, i18, iB, i19, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    public static final C2358w d(int i8, int i9, InterfaceC2351o interfaceC2351o) {
        int i10 = ((i8 + i9) + 1) / 2;
        C2358w c2358w = new C2358w(i10 * 3);
        C2358w c2358w2 = new C2358w(i10 * 4);
        c2358w2.h(0, i8, 0, i9);
        int i11 = (i10 * 2) + 1;
        int[] iArrA = AbstractC2342f.a(new int[i11]);
        int[] iArrA2 = AbstractC2342f.a(new int[i11]);
        int[] iArrB = r0.b(new int[5]);
        while (c2358w2.d()) {
            int iF = c2358w2.f();
            int iF2 = c2358w2.f();
            int iF3 = c2358w2.f();
            int iF4 = c2358w2.f();
            InterfaceC2351o interfaceC2351o2 = interfaceC2351o;
            if (h(iF4, iF3, iF2, iF, interfaceC2351o2, iArrA, iArrA2, iArrB)) {
                if (r0.c(iArrB) > 0) {
                    r0.a(iArrB, c2358w);
                }
                c2358w2.h(iF4, r0.h(iArrB), iF2, r0.i(iArrB));
                c2358w2.h(r0.d(iArrB), iF3, r0.e(iArrB), iF);
            }
            interfaceC2351o = interfaceC2351o2;
        }
        c2358w.j();
        c2358w.g(i8, i9, 0);
        return c2358w;
    }

    public static final void e(int i8, int i9, InterfaceC2351o interfaceC2351o) {
        b(d(i8, i9, interfaceC2351o), interfaceC2351o);
    }

    public static final void f(int i8, int i9, int i10, int i11, boolean z8, int[] iArr) {
        iArr[0] = i8;
        iArr[1] = i9;
        iArr[2] = i10;
        iArr[3] = i11;
        iArr[4] = z8 ? 1 : 0;
    }

    public static final boolean g(int i8, int i9, int i10, int i11, InterfaceC2351o interfaceC2351o, int[] iArr, int[] iArr2, int i12, int[] iArr3) {
        int iB;
        int i13;
        int i14 = (i9 - i8) - (i11 - i10);
        boolean z8 = Math.abs(i14) % 2 == 1;
        int i15 = -i12;
        for (int i16 = i15; i16 <= i12; i16 += 2) {
            if (i16 == i15 || (i16 != i12 && AbstractC2342f.b(iArr, i16 + 1) > AbstractC2342f.b(iArr, i16 - 1))) {
                iB = AbstractC2342f.b(iArr, i16 + 1);
                i13 = iB;
            } else {
                iB = AbstractC2342f.b(iArr, i16 - 1);
                i13 = iB + 1;
            }
            int i17 = (i10 + (i13 - i8)) - i16;
            int i18 = (i12 == 0 || i13 != iB) ? i17 : i17 - 1;
            while (true) {
                if (i13 >= i9 || i17 >= i11) {
                    break;
                }
                if (!interfaceC2351o.b(i13, i17)) {
                    break;
                }
                i13++;
                i17++;
            }
            AbstractC2342f.d(iArr, i16, i13);
            if (z8) {
                int i19 = i14 - i16;
                if (i19 >= i15 + 1 && i19 <= i12 - 1) {
                    if (AbstractC2342f.b(iArr2, i19) <= i13) {
                        f(iB, i18, i13, i17, false, iArr3);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean h(int i8, int i9, int i10, int i11, InterfaceC2351o interfaceC2351o, int[] iArr, int[] iArr2, int[] iArr3) {
        int i12 = i9 - i8;
        int i13 = i11 - i10;
        if (i12 >= 1 && i13 >= 1) {
            int i14 = ((i12 + i13) + 1) / 2;
            int[] iArr4 = iArr;
            AbstractC2342f.d(iArr4, 1, i8);
            int[] iArr5 = iArr2;
            AbstractC2342f.d(iArr5, 1, i9);
            int i15 = 0;
            while (i15 < i14) {
                if (g(i8, i9, i10, i11, interfaceC2351o, iArr4, iArr5, i15, iArr3) || c(i8, i9, i10, i11, interfaceC2351o, iArr, iArr2, i15, iArr3)) {
                    return true;
                }
                i15++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    public static final void i(int[] iArr, int i8, int i9) {
        int i10 = iArr[i8];
        iArr[i8] = iArr[i9];
        iArr[i9] = i10;
    }
}
