package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f18050a = new ArrayDeque();

    public /* synthetic */ Z1(Y1 y8) {
    }

    public static /* bridge */ /* synthetic */ J0 a(Z1 z8, J0 j8, J0 j9) {
        z8.b(j8);
        z8.b(j9);
        J0 c1885e2 = (J0) z8.f18050a.pop();
        while (!z8.f18050a.isEmpty()) {
            c1885e2 = new C1885e2((J0) z8.f18050a.pop(), c1885e2);
        }
        return c1885e2;
    }

    public static final int c(int i8) {
        int iBinarySearch = Arrays.binarySearch(C1885e2.f18118h, i8);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    public final void b(J0 j8) {
        AbstractC1880d2 abstractC1880d2;
        if (!j8.D()) {
            if (!(j8 instanceof C1885e2)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(j8.getClass())));
            }
            C1885e2 c1885e2 = (C1885e2) j8;
            b(c1885e2.f18120d);
            b(c1885e2.f18121e);
            return;
        }
        int iC = c(j8.y());
        ArrayDeque arrayDeque = this.f18050a;
        int iT = C1885e2.T(iC + 1);
        if (arrayDeque.isEmpty() || ((J0) this.f18050a.peek()).y() >= iT) {
            this.f18050a.push(j8);
            return;
        }
        int iT2 = C1885e2.T(iC);
        J0 c1885e3 = (J0) this.f18050a.pop();
        while (true) {
            abstractC1880d2 = null;
            if (this.f18050a.isEmpty() || ((J0) this.f18050a.peek()).y() >= iT2) {
                break;
            } else {
                c1885e3 = new C1885e2((J0) this.f18050a.pop(), c1885e3);
            }
        }
        C1885e2 c1885e4 = new C1885e2(c1885e3, j8);
        while (!this.f18050a.isEmpty()) {
            int iC2 = c(c1885e4.y()) + 1;
            ArrayDeque arrayDeque2 = this.f18050a;
            if (((J0) arrayDeque2.peek()).y() >= C1885e2.T(iC2)) {
                break;
            } else {
                c1885e4 = new C1885e2((J0) this.f18050a.pop(), c1885e4);
            }
        }
        this.f18050a.push(c1885e4);
    }
}
