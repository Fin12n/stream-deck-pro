package K7;

import J7.AbstractC1031b;
import J7.C1034e;
import J7.F;
import J7.s;
import J7.x;
import java.io.EOFException;
import kotlin.jvm.internal.t;
import p043e6.dT.GIGvBf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f4728a = F.a("0123456789abcdef");

    public static final C1034e.a a(C1034e c1034e, C1034e.a unsafeCursor) {
        t.g(c1034e, "<this>");
        t.g(unsafeCursor, "unsafeCursor");
        C1034e.a aVarG = AbstractC1031b.g(unsafeCursor);
        if (aVarG.f4380a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVarG.f4380a = c1034e;
        aVarG.f4381b = true;
        return aVarG;
    }

    public static final byte[] b() {
        return f4728a;
    }

    public static final String d(C1034e c1034e, long j8) throws EOFException {
        t.g(c1034e, "<this>");
        if (j8 > 0) {
            long j9 = j8 - 1;
            if (c1034e.w0(j9) == 13) {
                String strP1 = c1034e.p1(j9);
                c1034e.skip(2L);
                return strP1;
            }
        }
        String strP2 = c1034e.p1(j8);
        c1034e.skip(1L);
        return strP2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a5 A[LOOP:0: B:8:0x0026->B:46:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4 A[SYNTHETIC] */
    public static final int e(C1034e c1034e, s options, boolean z8) {
        int i8;
        int i9;
        x xVar;
        int i10;
        int i11;
        t.g(c1034e, "<this>");
        t.g(options, "options");
        x xVar2 = c1034e.f4378a;
        if (xVar2 == null) {
            return z8 ? -2 : -1;
        }
        byte[] bArr = xVar2.f4430a;
        int i12 = xVar2.f4431b;
        int i13 = xVar2.f4432c;
        int[] iArrA = options.A();
        x xVar3 = xVar2;
        int i14 = -1;
        int i15 = 0;
        loop0: while (true) {
            int i16 = i15 + 1;
            int i17 = iArrA[i15];
            int i18 = i15 + 2;
            int i19 = iArrA[i16];
            if (i19 != -1) {
                i14 = i19;
            }
            if (xVar3 == null) {
                break;
            }
            if (i17 >= 0) {
                i8 = i12 + 1;
                int i20 = bArr[i12] & 255;
                int i21 = i18 + i17;
                while (i18 != i21) {
                    if (i20 == iArrA[i18]) {
                        i9 = iArrA[i18 + i17];
                        if (i8 == i13) {
                            xVar3 = xVar3.f4435f;
                            t.d(xVar3);
                            i8 = xVar3.f4431b;
                            bArr = xVar3.f4430a;
                            i13 = xVar3.f4432c;
                            if (xVar3 == xVar2) {
                                xVar3 = null;
                            }
                        }
                        if (i9 >= 0) {
                            return i9;
                        }
                        i15 = -i9;
                        i12 = i8;
                    } else {
                        i18++;
                    }
                }
                return i14;
            }
            int i22 = i18 + (i17 * (-1));
            while (true) {
                int i23 = i12 + 1;
                int i24 = i18 + 1;
                if ((bArr[i12] & 255) == iArrA[i18]) {
                    boolean z9 = i24 == i22;
                    if (i23 == i13) {
                        t.d(xVar3);
                        x xVar4 = xVar3.f4435f;
                        t.d(xVar4);
                        i11 = xVar4.f4431b;
                        byte[] bArr2 = xVar4.f4430a;
                        i10 = xVar4.f4432c;
                        if (xVar4 != xVar2) {
                            xVar = xVar4;
                            bArr = bArr2;
                        } else {
                            if (!z9) {
                                break loop0;
                            }
                            bArr = bArr2;
                            xVar = null;
                        }
                    } else {
                        xVar = xVar3;
                        i10 = i13;
                        i11 = i23;
                    }
                    if (z9) {
                        i9 = iArrA[i24];
                        i8 = i11;
                        i13 = i10;
                        xVar3 = xVar;
                        break;
                    }
                    i12 = i11;
                    i13 = i10;
                    xVar3 = xVar;
                    i18 = i24;
                }
                return i14;
            }
            if (i9 >= 0) {
                return i9;
            }
            i15 = -i9;
            i12 = i8;
        }
        if (z8) {
            return -2;
        }
        return i14;
    }

    public static /* synthetic */ int f(C1034e c1034e, s sVar, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return e(c1034e, sVar, z8);
    }

    public static final boolean c(x segment, int i8, byte[] bArr, int i9, int i10) {
        t.g(segment, "segment");
        t.g(bArr, GIGvBf.KbgVOXYOXV);
        int i11 = segment.f4432c;
        byte[] bArr2 = segment.f4430a;
        while (i9 < i10) {
            if (i8 == i11) {
                segment = segment.f4435f;
                t.d(segment);
                byte[] bArr3 = segment.f4430a;
                bArr2 = bArr3;
                i8 = segment.f4431b;
                i11 = segment.f4432c;
            }
            if (bArr2[i8] != bArr[i9]) {
                return false;
            }
            i8++;
            i9++;
        }
        return true;
    }
}
