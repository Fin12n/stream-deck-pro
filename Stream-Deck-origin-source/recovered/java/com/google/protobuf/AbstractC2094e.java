package com.google.protobuf;

import com.elgato.streamdeck.vsd2.KnownHost;

/* JADX INFO: renamed from: com.google.protobuf.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2094e {

    /* JADX INFO: renamed from: com.google.protobuf.e$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19272a;

        static {
            int[] iArr = new int[C0.b.values().length];
            f19272a = iArr;
            try {
                iArr[C0.b.f19067c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19272a[C0.b.f19068d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19272a[C0.b.f19069e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19272a[C0.b.f19070f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19272a[C0.b.f19071g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19272a[C0.b.f19079o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19272a[C0.b.f19072h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19272a[C0.b.f19082r.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19272a[C0.b.f19073i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19272a[C0.b.f19081q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19272a[C0.b.f19074j.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19272a[C0.b.f19083s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19272a[C0.b.f19084t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19272a[C0.b.f19080p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19272a[C0.b.f19078n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19272a[C0.b.f19075k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19272a[C0.b.f19076l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f19272a[C0.b.f19077m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.e$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f19274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f19275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C2106q f19276d;

        public b(C2106q c2106q) {
            c2106q.getClass();
            this.f19276d = c2106q;
        }
    }

    public static int A(int i8, byte[] bArr, int i9, int i10, A.j jVar, b bVar) {
        C2114z c2114z = (C2114z) jVar;
        int I8 = I(bArr, i9, bVar);
        c2114z.l(AbstractC2098i.c(bVar.f19273a));
        while (I8 < i10) {
            int I9 = I(bArr, I8, bVar);
            if (i8 != bVar.f19273a) {
                break;
            }
            I8 = I(bArr, I9, bVar);
            c2114z.l(AbstractC2098i.c(bVar.f19273a));
        }
        return I8;
    }

    public static int B(int i8, byte[] bArr, int i9, int i10, A.j jVar, b bVar) {
        J j8 = (J) jVar;
        int iL = L(bArr, i9, bVar);
        j8.t(AbstractC2098i.d(bVar.f19274b));
        while (iL < i10) {
            int I8 = I(bArr, iL, bVar);
            if (i8 != bVar.f19273a) {
                break;
            }
            iL = L(bArr, I8, bVar);
            j8.t(AbstractC2098i.d(bVar.f19274b));
        }
        return iL;
    }

    public static int C(byte[] bArr, int i8, b bVar) throws B {
        int I8 = I(bArr, i8, bVar);
        int i9 = bVar.f19273a;
        if (i9 < 0) {
            throw B.g();
        }
        if (i9 == 0) {
            bVar.f19275c = "";
            return I8;
        }
        bVar.f19275c = new String(bArr, I8, i9, A.f19048b);
        return I8 + i9;
    }

    public static int D(int i8, byte[] bArr, int i9, int i10, A.j jVar, b bVar) throws B {
        int I8 = I(bArr, i9, bVar);
        int i11 = bVar.f19273a;
        if (i11 < 0) {
            throw B.g();
        }
        if (i11 == 0) {
            jVar.add("");
        } else {
            jVar.add(new String(bArr, I8, i11, A.f19048b));
            I8 += i11;
        }
        while (I8 < i10) {
            int I9 = I(bArr, I8, bVar);
            if (i8 != bVar.f19273a) {
                break;
            }
            I8 = I(bArr, I9, bVar);
            int i12 = bVar.f19273a;
            if (i12 < 0) {
                throw B.g();
            }
            if (i12 == 0) {
                jVar.add("");
            } else {
                jVar.add(new String(bArr, I8, i12, A.f19048b));
                I8 += i12;
            }
        }
        return I8;
    }

    public static int E(int i8, byte[] bArr, int i9, int i10, A.j jVar, b bVar) throws B {
        int I8 = I(bArr, i9, bVar);
        int i11 = bVar.f19273a;
        if (i11 < 0) {
            throw B.g();
        }
        if (i11 == 0) {
            jVar.add("");
        } else {
            int i12 = I8 + i11;
            if (!A0.t(bArr, I8, i12)) {
                throw B.d();
            }
            jVar.add(new String(bArr, I8, i11, A.f19048b));
            I8 = i12;
        }
        while (I8 < i10) {
            int I9 = I(bArr, I8, bVar);
            if (i8 != bVar.f19273a) {
                break;
            }
            I8 = I(bArr, I9, bVar);
            int i13 = bVar.f19273a;
            if (i13 < 0) {
                throw B.g();
            }
            if (i13 == 0) {
                jVar.add("");
            } else {
                int i14 = I8 + i13;
                if (!A0.t(bArr, I8, i14)) {
                    throw B.d();
                }
                jVar.add(new String(bArr, I8, i13, A.f19048b));
                I8 = i14;
            }
        }
        return I8;
    }

    public static int F(byte[] bArr, int i8, b bVar) throws B {
        int I8 = I(bArr, i8, bVar);
        int i9 = bVar.f19273a;
        if (i9 < 0) {
            throw B.g();
        }
        if (i9 == 0) {
            bVar.f19275c = "";
            return I8;
        }
        bVar.f19275c = A0.h(bArr, I8, i9);
        return I8 + i9;
    }

    public static int G(int i8, byte[] bArr, int i9, int i10, w0 w0Var, b bVar) throws B {
        if (C0.a(i8) == 0) {
            throw B.c();
        }
        int iB = C0.b(i8);
        if (iB == 0) {
            int iL = L(bArr, i9, bVar);
            w0Var.r(i8, Long.valueOf(bVar.f19274b));
            return iL;
        }
        if (iB == 1) {
            w0Var.r(i8, Long.valueOf(j(bArr, i9)));
            return i9 + 8;
        }
        if (iB == 2) {
            int I8 = I(bArr, i9, bVar);
            int i11 = bVar.f19273a;
            if (i11 < 0) {
                throw B.g();
            }
            if (i11 > bArr.length - I8) {
                throw B.n();
            }
            if (i11 == 0) {
                w0Var.r(i8, AbstractC2097h.f19285b);
            } else {
                w0Var.r(i8, AbstractC2097h.D(bArr, I8, i11));
            }
            return I8 + i11;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw B.c();
            }
            w0Var.r(i8, Integer.valueOf(h(bArr, i9)));
            return i9 + 4;
        }
        w0 w0VarO = w0.o();
        int i12 = (i8 & (-8)) | 4;
        int i13 = 0;
        while (i9 < i10) {
            int I9 = I(bArr, i9, bVar);
            i13 = bVar.f19273a;
            if (i13 == i12) {
                i9 = I9;
                break;
            }
            i9 = G(i13, bArr, I9, i10, w0VarO, bVar);
        }
        if (i9 > i10 || i13 != i12) {
            throw B.h();
        }
        w0Var.r(i8, w0VarO);
        return i9;
    }

    public static int H(int i8, byte[] bArr, int i9, b bVar) {
        int i10 = i8 & 127;
        int i11 = i9 + 1;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            bVar.f19273a = i10 | (b8 << 7);
            return i11;
        }
        int i12 = i10 | ((b8 & 127) << 7);
        int i13 = i9 + 2;
        byte b9 = bArr[i11];
        if (b9 >= 0) {
            bVar.f19273a = i12 | (b9 << 14);
            return i13;
        }
        int i14 = i12 | ((b9 & 127) << 14);
        int i15 = i9 + 3;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            bVar.f19273a = i14 | (b10 << 21);
            return i15;
        }
        int i16 = i14 | ((b10 & 127) << 21);
        int i17 = i9 + 4;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            bVar.f19273a = i16 | (b11 << 28);
            return i17;
        }
        int i18 = i16 | ((b11 & 127) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (bArr[i17] >= 0) {
                bVar.f19273a = i18;
                return i19;
            }
            i17 = i19;
        }
    }

    public static int I(byte[] bArr, int i8, b bVar) {
        int i9 = i8 + 1;
        byte b8 = bArr[i8];
        if (b8 < 0) {
            return H(b8, bArr, i9, bVar);
        }
        bVar.f19273a = b8;
        return i9;
    }

    public static int J(int i8, byte[] bArr, int i9, int i10, A.j jVar, b bVar) {
        C2114z c2114z = (C2114z) jVar;
        int I8 = I(bArr, i9, bVar);
        c2114z.l(bVar.f19273a);
        while (I8 < i10) {
            int I9 = I(bArr, I8, bVar);
            if (i8 != bVar.f19273a) {
                break;
            }
            I8 = I(bArr, I9, bVar);
            c2114z.l(bVar.f19273a);
        }
        return I8;
    }

    public static int K(long j8, byte[] bArr, int i8, b bVar) {
        int i9 = i8 + 1;
        byte b8 = bArr[i8];
        long j9 = (j8 & 127) | (((long) (b8 & 127)) << 7);
        int i10 = 7;
        while (b8 < 0) {
            int i11 = i9 + 1;
            byte b9 = bArr[i9];
            i10 += 7;
            j9 |= ((long) (b9 & 127)) << i10;
            i9 = i11;
            b8 = b9;
        }
        bVar.f19274b = j9;
        return i9;
    }

    public static int L(byte[] bArr, int i8, b bVar) {
        int i9 = i8 + 1;
        long j8 = bArr[i8];
        if (j8 < 0) {
            return K(j8, bArr, i9, bVar);
        }
        bVar.f19274b = j8;
        return i9;
    }

    public static int M(int i8, byte[] bArr, int i9, int i10, A.j jVar, b bVar) {
        J j8 = (J) jVar;
        int iL = L(bArr, i9, bVar);
        j8.t(bVar.f19274b);
        while (iL < i10) {
            int I8 = I(bArr, iL, bVar);
            if (i8 != bVar.f19273a) {
                break;
            }
            iL = L(bArr, I8, bVar);
            j8.t(bVar.f19274b);
        }
        return iL;
    }

    public static int N(Object obj, n0 n0Var, byte[] bArr, int i8, int i9, int i10, b bVar) {
        int iE0 = ((W) n0Var).e0(obj, bArr, i8, i9, i10, bVar);
        bVar.f19275c = obj;
        return iE0;
    }

    public static int O(Object obj, n0 n0Var, byte[] bArr, int i8, int i9, b bVar) throws B {
        int iH = i8 + 1;
        int i10 = bArr[i8];
        if (i10 < 0) {
            iH = H(i10, bArr, iH, bVar);
            i10 = bVar.f19273a;
        }
        int i11 = iH;
        if (i10 < 0 || i10 > i9 - i11) {
            throw B.n();
        }
        int i12 = i11 + i10;
        n0Var.f(obj, bArr, i11, i12, bVar);
        bVar.f19275c = obj;
        return i12;
    }

    public static int P(int i8, byte[] bArr, int i9, int i10, b bVar) throws B {
        if (C0.a(i8) == 0) {
            throw B.c();
        }
        int iB = C0.b(i8);
        if (iB == 0) {
            return L(bArr, i9, bVar);
        }
        if (iB == 1) {
            return i9 + 8;
        }
        if (iB == 2) {
            return I(bArr, i9, bVar) + bVar.f19273a;
        }
        if (iB != 3) {
            if (iB == 5) {
                return i9 + 4;
            }
            throw B.c();
        }
        int i11 = (i8 & (-8)) | 4;
        int i12 = 0;
        while (i9 < i10) {
            i9 = I(bArr, i9, bVar);
            i12 = bVar.f19273a;
            if (i12 == i11) {
                break;
            }
            i9 = P(i12, bArr, i9, i10, bVar);
        }
        if (i9 > i10 || i12 != i11) {
            throw B.h();
        }
        return i9;
    }

    public static int a(int i8, byte[] bArr, int i9, int i10, A.j jVar, b bVar) {
        C2095f c2095f = (C2095f) jVar;
        int iL = L(bArr, i9, bVar);
        c2095f.t(bVar.f19274b != 0);
        while (iL < i10) {
            int I8 = I(bArr, iL, bVar);
            if (i8 != bVar.f19273a) {
                break;
            }
            iL = L(bArr, I8, bVar);
            c2095f.t(bVar.f19274b != 0);
        }
        return iL;
    }

    public static int b(byte[] bArr, int i8, b bVar) throws B {
        int I8 = I(bArr, i8, bVar);
        int i9 = bVar.f19273a;
        if (i9 < 0) {
            throw B.g();
        }
        if (i9 > bArr.length - I8) {
            throw B.n();
        }
        if (i9 == 0) {
            bVar.f19275c = AbstractC2097h.f19285b;
            return I8;
        }
        bVar.f19275c = AbstractC2097h.D(bArr, I8, i9);
        return I8 + i9;
    }

    public static int c(int i8, byte[] bArr, int i9, int i10, A.j jVar, b bVar) throws B {
        int I8 = I(bArr, i9, bVar);
        int i11 = bVar.f19273a;
        if (i11 < 0) {
            throw B.g();
        }
        if (i11 > bArr.length - I8) {
            throw B.n();
        }
        if (i11 == 0) {
            jVar.add(AbstractC2097h.f19285b);
        } else {
            jVar.add(AbstractC2097h.D(bArr, I8, i11));
            I8 += i11;
        }
        while (I8 < i10) {
            int I9 = I(bArr, I8, bVar);
            if (i8 != bVar.f19273a) {
                break;
            }
            I8 = I(bArr, I9, bVar);
            int i12 = bVar.f19273a;
            if (i12 < 0) {
                throw B.g();
            }
            if (i12 > bArr.length - I8) {
                throw B.n();
            }
            if (i12 == 0) {
                jVar.add(AbstractC2097h.f19285b);
            } else {
                jVar.add(AbstractC2097h.D(bArr, I8, i12));
                I8 += i12;
            }
        }
        return I8;
    }

    public static double d(byte[] bArr, int i8) {
        return Double.longBitsToDouble(j(bArr, i8));
    }

    public static int e(int i8, byte[] bArr, int i9, int i10, A.j jVar, b bVar) {
        C2102m c2102m = (C2102m) jVar;
        c2102m.s(d(bArr, i9));
        int i11 = i9 + 8;
        while (i11 < i10) {
            int I8 = I(bArr, i11, bVar);
            if (i8 != bVar.f19273a) {
                break;
            }
            c2102m.s(d(bArr, I8));
            i11 = I8 + 8;
        }
        return i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int f(int i8, byte[] bArr, int i9, int i10, GeneratedMessageLite.ExtendableMessage extendableMessage, GeneratedMessageLite.e eVar, v0 v0Var, b bVar) throws B {
        int i11;
        int i12;
        C2110v c2110v = extendableMessage.extensions;
        int i13 = i8 >>> 3;
        if (eVar.f19184d.g() && eVar.f19184d.q()) {
            switch (a.f19272a[eVar.d().ordinal()]) {
                case 1:
                    C2102m c2102m = new C2102m();
                    int iS = s(bArr, i9, c2102m, bVar);
                    c2110v.C(eVar.f19184d, c2102m);
                    return iS;
                case 2:
                    C2112x c2112x = new C2112x();
                    int iV = v(bArr, i9, c2112x, bVar);
                    c2110v.C(eVar.f19184d, c2112x);
                    return iV;
                case 3:
                case 4:
                    J j8 = new J();
                    int iZ = z(bArr, i9, j8, bVar);
                    c2110v.C(eVar.f19184d, j8);
                    return iZ;
                case 5:
                case 6:
                    C2114z c2114z = new C2114z();
                    int iY = y(bArr, i9, c2114z, bVar);
                    c2110v.C(eVar.f19184d, c2114z);
                    return iY;
                case 7:
                case 8:
                    J j9 = new J();
                    int iU = u(bArr, i9, j9, bVar);
                    c2110v.C(eVar.f19184d, j9);
                    return iU;
                case 9:
                case 10:
                    C2114z c2114z2 = new C2114z();
                    int iT = t(bArr, i9, c2114z2, bVar);
                    c2110v.C(eVar.f19184d, c2114z2);
                    return iT;
                case 11:
                    C2095f c2095f = new C2095f();
                    int iR = r(bArr, i9, c2095f, bVar);
                    c2110v.C(eVar.f19184d, c2095f);
                    return iR;
                case 12:
                    C2114z c2114z3 = new C2114z();
                    int iW = w(bArr, i9, c2114z3, bVar);
                    c2110v.C(eVar.f19184d, c2114z3);
                    return iW;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    J j10 = new J();
                    int iX = x(bArr, i9, j10, bVar);
                    c2110v.C(eVar.f19184d, j10);
                    return iX;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    C2114z c2114z4 = new C2114z();
                    int iY2 = y(bArr, i9, c2114z4, bVar);
                    p0.z(extendableMessage, i13, c2114z4, eVar.f19184d.b(), null, v0Var);
                    c2110v.C(eVar.f19184d, c2114z4);
                    return iY2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f19184d.h());
            }
        }
        Object objValueOf = null;
        if (eVar.d() == C0.b.f19080p) {
            i9 = I(bArr, i9, bVar);
            if (eVar.f19184d.b().findValueByNumber(bVar.f19273a) == null) {
                p0.J(extendableMessage, i13, bVar.f19273a, null, v0Var);
                return i9;
            }
            objValueOf = Integer.valueOf(bVar.f19273a);
        } else {
            switch (a.f19272a[eVar.d().ordinal()]) {
                case 1:
                    i11 = i9;
                    objValueOf = Double.valueOf(d(bArr, i11));
                    i9 = i11 + 8;
                    break;
                case 2:
                    i12 = i9;
                    objValueOf = Float.valueOf(l(bArr, i12));
                    i9 = i12 + 4;
                    break;
                case 3:
                case 4:
                    i9 = L(bArr, i9, bVar);
                    objValueOf = Long.valueOf(bVar.f19274b);
                    break;
                case 5:
                case 6:
                    i9 = I(bArr, i9, bVar);
                    objValueOf = Integer.valueOf(bVar.f19273a);
                    break;
                case 7:
                case 8:
                    i11 = i9;
                    objValueOf = Long.valueOf(j(bArr, i11));
                    i9 = i11 + 8;
                    break;
                case 9:
                case 10:
                    i12 = i9;
                    objValueOf = Integer.valueOf(h(bArr, i12));
                    i9 = i12 + 4;
                    break;
                case 11:
                    i9 = L(bArr, i9, bVar);
                    objValueOf = Boolean.valueOf(bVar.f19274b != 0);
                    break;
                case 12:
                    i9 = I(bArr, i9, bVar);
                    objValueOf = Integer.valueOf(AbstractC2098i.c(bVar.f19273a));
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    i9 = L(bArr, i9, bVar);
                    objValueOf = Long.valueOf(AbstractC2098i.d(bVar.f19274b));
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    throw new IllegalStateException("Shouldn't reach here.");
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    i9 = b(bArr, i9, bVar);
                    objValueOf = bVar.f19275c;
                    break;
                case 16:
                    i9 = C(bArr, i9, bVar);
                    objValueOf = bVar.f19275c;
                    break;
                case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                    int i14 = (i13 << 3) | 4;
                    n0 n0VarC = j0.a().c(eVar.e().getClass());
                    if (eVar.g()) {
                        int iN = n(n0VarC, bArr, i9, i10, i14, bVar);
                        c2110v.a(eVar.f19184d, bVar.f19275c);
                        return iN;
                    }
                    Object objI = c2110v.i(eVar.f19184d);
                    if (objI == null) {
                        objI = n0VarC.i();
                        c2110v.C(eVar.f19184d, objI);
                    }
                    return N(objI, n0VarC, bArr, i9, i10, i14, bVar);
                case 18:
                    n0 n0VarC2 = j0.a().c(eVar.e().getClass());
                    if (eVar.g()) {
                        int iP = p(n0VarC2, bArr, i9, i10, bVar);
                        c2110v.a(eVar.f19184d, bVar.f19275c);
                        return iP;
                    }
                    Object objI2 = c2110v.i(eVar.f19184d);
                    if (objI2 == null) {
                        objI2 = n0VarC2.i();
                        c2110v.C(eVar.f19184d, objI2);
                    }
                    return O(objI2, n0VarC2, bArr, i9, i10, bVar);
            }
        }
        if (eVar.g()) {
            c2110v.a(eVar.f19184d, objValueOf);
            return i9;
        }
        c2110v.C(eVar.f19184d, objValueOf);
        return i9;
    }

    public static int g(int i8, byte[] bArr, int i9, int i10, Object obj, T t8, v0 v0Var, b bVar) {
        GeneratedMessageLite.e eVarA = bVar.f19276d.a(t8, i8 >>> 3);
        if (eVarA == null) {
            return G(i8, bArr, i9, i10, W.x(obj), bVar);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        return f(i8, bArr, i9, i10, extendableMessage, eVarA, v0Var, bVar);
    }

    public static int h(byte[] bArr, int i8) {
        return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
    }

    public static int i(int i8, byte[] bArr, int i9, int i10, A.j jVar, b bVar) {
        C2114z c2114z = (C2114z) jVar;
        c2114z.l(h(bArr, i9));
        int i11 = i9 + 4;
        while (i11 < i10) {
            int I8 = I(bArr, i11, bVar);
            if (i8 != bVar.f19273a) {
                break;
            }
            c2114z.l(h(bArr, I8));
            i11 = I8 + 4;
        }
        return i11;
    }

    public static long j(byte[] bArr, int i8) {
        return ((((long) bArr[i8 + 7]) & 255) << 56) | (((long) bArr[i8]) & 255) | ((((long) bArr[i8 + 1]) & 255) << 8) | ((((long) bArr[i8 + 2]) & 255) << 16) | ((((long) bArr[i8 + 3]) & 255) << 24) | ((((long) bArr[i8 + 4]) & 255) << 32) | ((((long) bArr[i8 + 5]) & 255) << 40) | ((((long) bArr[i8 + 6]) & 255) << 48);
    }

    public static int k(int i8, byte[] bArr, int i9, int i10, A.j jVar, b bVar) {
        J j8 = (J) jVar;
        j8.t(j(bArr, i9));
        int i11 = i9 + 8;
        while (i11 < i10) {
            int I8 = I(bArr, i11, bVar);
            if (i8 != bVar.f19273a) {
                break;
            }
            j8.t(j(bArr, I8));
            i11 = I8 + 8;
        }
        return i11;
    }

    public static float l(byte[] bArr, int i8) {
        return Float.intBitsToFloat(h(bArr, i8));
    }

    public static int m(int i8, byte[] bArr, int i9, int i10, A.j jVar, b bVar) {
        C2112x c2112x = (C2112x) jVar;
        c2112x.s(l(bArr, i9));
        int i11 = i9 + 4;
        while (i11 < i10) {
            int I8 = I(bArr, i11, bVar);
            if (i8 != bVar.f19273a) {
                break;
            }
            c2112x.s(l(bArr, I8));
            i11 = I8 + 4;
        }
        return i11;
    }

    public static int n(n0 n0Var, byte[] bArr, int i8, int i9, int i10, b bVar) {
        Object objI = n0Var.i();
        int iN = N(objI, n0Var, bArr, i8, i9, i10, bVar);
        n0Var.c(objI);
        bVar.f19275c = objI;
        return iN;
    }

    public static int o(n0 n0Var, int i8, byte[] bArr, int i9, int i10, A.j jVar, b bVar) {
        int i11 = (i8 & (-8)) | 4;
        int iN = n(n0Var, bArr, i9, i10, i11, bVar);
        jVar.add(bVar.f19275c);
        while (iN < i10) {
            int I8 = I(bArr, iN, bVar);
            if (i8 != bVar.f19273a) {
                break;
            }
            iN = n(n0Var, bArr, I8, i10, i11, bVar);
            jVar.add(bVar.f19275c);
        }
        return iN;
    }

    public static int p(n0 n0Var, byte[] bArr, int i8, int i9, b bVar) throws B {
        Object objI = n0Var.i();
        int iO = O(objI, n0Var, bArr, i8, i9, bVar);
        n0Var.c(objI);
        bVar.f19275c = objI;
        return iO;
    }

    public static int q(n0 n0Var, int i8, byte[] bArr, int i9, int i10, A.j jVar, b bVar) throws B {
        int iP = p(n0Var, bArr, i9, i10, bVar);
        jVar.add(bVar.f19275c);
        while (iP < i10) {
            int I8 = I(bArr, iP, bVar);
            if (i8 != bVar.f19273a) {
                break;
            }
            iP = p(n0Var, bArr, I8, i10, bVar);
            jVar.add(bVar.f19275c);
        }
        return iP;
    }

    public static int r(byte[] bArr, int i8, A.j jVar, b bVar) throws B {
        C2095f c2095f = (C2095f) jVar;
        int I8 = I(bArr, i8, bVar);
        int i9 = bVar.f19273a + I8;
        while (I8 < i9) {
            I8 = L(bArr, I8, bVar);
            c2095f.t(bVar.f19274b != 0);
        }
        if (I8 == i9) {
            return I8;
        }
        throw B.n();
    }

    public static int s(byte[] bArr, int i8, A.j jVar, b bVar) throws B {
        C2102m c2102m = (C2102m) jVar;
        int I8 = I(bArr, i8, bVar);
        int i9 = bVar.f19273a + I8;
        while (I8 < i9) {
            c2102m.s(d(bArr, I8));
            I8 += 8;
        }
        if (I8 == i9) {
            return I8;
        }
        throw B.n();
    }

    public static int t(byte[] bArr, int i8, A.j jVar, b bVar) throws B {
        C2114z c2114z = (C2114z) jVar;
        int I8 = I(bArr, i8, bVar);
        int i9 = bVar.f19273a + I8;
        while (I8 < i9) {
            c2114z.l(h(bArr, I8));
            I8 += 4;
        }
        if (I8 == i9) {
            return I8;
        }
        throw B.n();
    }

    public static int u(byte[] bArr, int i8, A.j jVar, b bVar) throws B {
        J j8 = (J) jVar;
        int I8 = I(bArr, i8, bVar);
        int i9 = bVar.f19273a + I8;
        while (I8 < i9) {
            j8.t(j(bArr, I8));
            I8 += 8;
        }
        if (I8 == i9) {
            return I8;
        }
        throw B.n();
    }

    public static int v(byte[] bArr, int i8, A.j jVar, b bVar) throws B {
        C2112x c2112x = (C2112x) jVar;
        int I8 = I(bArr, i8, bVar);
        int i9 = bVar.f19273a + I8;
        while (I8 < i9) {
            c2112x.s(l(bArr, I8));
            I8 += 4;
        }
        if (I8 == i9) {
            return I8;
        }
        throw B.n();
    }

    public static int w(byte[] bArr, int i8, A.j jVar, b bVar) throws B {
        C2114z c2114z = (C2114z) jVar;
        int I8 = I(bArr, i8, bVar);
        int i9 = bVar.f19273a + I8;
        while (I8 < i9) {
            I8 = I(bArr, I8, bVar);
            c2114z.l(AbstractC2098i.c(bVar.f19273a));
        }
        if (I8 == i9) {
            return I8;
        }
        throw B.n();
    }

    public static int x(byte[] bArr, int i8, A.j jVar, b bVar) throws B {
        J j8 = (J) jVar;
        int I8 = I(bArr, i8, bVar);
        int i9 = bVar.f19273a + I8;
        while (I8 < i9) {
            I8 = L(bArr, I8, bVar);
            j8.t(AbstractC2098i.d(bVar.f19274b));
        }
        if (I8 == i9) {
            return I8;
        }
        throw B.n();
    }

    public static int y(byte[] bArr, int i8, A.j jVar, b bVar) throws B {
        C2114z c2114z = (C2114z) jVar;
        int I8 = I(bArr, i8, bVar);
        int i9 = bVar.f19273a + I8;
        while (I8 < i9) {
            I8 = I(bArr, I8, bVar);
            c2114z.l(bVar.f19273a);
        }
        if (I8 == i9) {
            return I8;
        }
        throw B.n();
    }

    public static int z(byte[] bArr, int i8, A.j jVar, b bVar) throws B {
        J j8 = (J) jVar;
        int I8 = I(bArr, i8, bVar);
        int i9 = bVar.f19273a + I8;
        while (I8 < i9) {
            I8 = L(bArr, I8, bVar);
            j8.t(bVar.f19274b);
        }
        if (I8 == i9) {
            return I8;
        }
        throw B.n();
    }
}
