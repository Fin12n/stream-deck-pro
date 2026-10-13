package p006a5;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0333a f13395a = new C0333a(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f13396b = new c(new d(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f13397c = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    /* JADX INFO: renamed from: a5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class C0333a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f13398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f13399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long[] f13400c;

        public C0333a(long[] jArr, long[] jArr2, long[] jArr3) {
            this.f13398a = jArr;
            this.f13399b = jArr2;
            this.f13400c = jArr3;
        }

        public void a(long[] jArr, long[] jArr2) {
            System.arraycopy(jArr2, 0, jArr, 0, 10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b extends C0333a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f13401d;

        public b() {
            this(new long[10], new long[10], new long[10], new long[10]);
        }

        @Override // p006a5.a.C0333a
        public void a(long[] jArr, long[] jArr2) {
            f.f(jArr, jArr2, this.f13401d);
        }

        public b(e eVar) {
            this();
            long[] jArr = this.f13398a;
            d dVar = eVar.f13407a;
            f.n(jArr, dVar.f13405b, dVar.f13404a);
            long[] jArr2 = this.f13399b;
            d dVar2 = eVar.f13407a;
            f.m(jArr2, dVar2.f13405b, dVar2.f13404a);
            System.arraycopy(eVar.f13407a.f13406c, 0, this.f13401d, 0, 10);
            f.f(this.f13400c, eVar.f13408b, p006a5.b.f13410b);
        }

        public b(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4) {
            super(jArr, jArr2, jArr4);
            this.f13401d = jArr3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f13402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f13403b;

        public c() {
            this(new d(), new long[10]);
        }

        public c(d dVar, long[] jArr) {
            this.f13402a = dVar;
            this.f13403b = jArr;
        }

        public c(c cVar) {
            this.f13402a = new d(cVar.f13402a);
            this.f13403b = Arrays.copyOf(cVar.f13403b, 10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f13404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f13405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long[] f13406c;

        public d() {
            this(new long[10], new long[10], new long[10]);
        }

        public static d a(d dVar, c cVar) {
            f.f(dVar.f13404a, cVar.f13402a.f13404a, cVar.f13403b);
            long[] jArr = dVar.f13405b;
            d dVar2 = cVar.f13402a;
            f.f(jArr, dVar2.f13405b, dVar2.f13406c);
            f.f(dVar.f13406c, cVar.f13402a.f13406c, cVar.f13403b);
            return dVar;
        }

        public byte[] b() {
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            long[] jArr3 = new long[10];
            f.e(jArr, this.f13406c);
            f.f(jArr2, this.f13404a, jArr);
            f.f(jArr3, this.f13405b, jArr);
            byte[] bArrA = f.a(jArr3);
            bArrA[31] = (byte) ((a.i(jArr2) << 7) ^ bArrA[31]);
            return bArrA;
        }

        public d(long[] jArr, long[] jArr2, long[] jArr3) {
            this.f13404a = jArr;
            this.f13405b = jArr2;
            this.f13406c = jArr3;
        }

        public d(d dVar) {
            this.f13404a = Arrays.copyOf(dVar.f13404a, 10);
            this.f13405b = Arrays.copyOf(dVar.f13405b, 10);
            this.f13406c = Arrays.copyOf(dVar.f13406c, 10);
        }

        public d(c cVar) {
            this();
            a(this, cVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f13407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f13408b;

        public e() {
            this(new d(), new long[10]);
        }

        public static e c(byte[] bArr) throws GeneralSecurityException {
            long[] jArr = new long[10];
            long[] jArrC = f.c(bArr);
            long[] jArr2 = new long[10];
            jArr2[0] = 1;
            long[] jArr3 = new long[10];
            long[] jArr4 = new long[10];
            long[] jArr5 = new long[10];
            long[] jArr6 = new long[10];
            long[] jArr7 = new long[10];
            f.k(jArr4, jArrC);
            f.f(jArr5, jArr4, p006a5.b.f13409a);
            f.m(jArr4, jArr4, jArr2);
            f.n(jArr5, jArr5, jArr2);
            long[] jArr8 = new long[10];
            f.k(jArr8, jArr5);
            f.f(jArr8, jArr8, jArr5);
            f.k(jArr, jArr8);
            f.f(jArr, jArr, jArr5);
            f.f(jArr, jArr, jArr4);
            a.o(jArr, jArr);
            f.f(jArr, jArr, jArr8);
            f.f(jArr, jArr, jArr4);
            f.k(jArr6, jArr);
            f.f(jArr6, jArr6, jArr5);
            f.m(jArr7, jArr6, jArr4);
            if (a.j(jArr7)) {
                f.n(jArr7, jArr6, jArr4);
                if (a.j(jArr7)) {
                    throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                }
                f.f(jArr, jArr, p006a5.b.f13411c);
            }
            if (!a.j(jArr) && ((bArr[31] & 255) >> 7) != 0) {
                throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
            }
            if (a.i(jArr) == ((bArr[31] & 255) >> 7)) {
                a.n(jArr, jArr);
            }
            f.f(jArr3, jArr, jArrC);
            return new e(new d(jArr, jArrC, jArr2), jArr3);
        }

        public static e d(e eVar, c cVar) {
            f.f(eVar.f13407a.f13404a, cVar.f13402a.f13404a, cVar.f13403b);
            long[] jArr = eVar.f13407a.f13405b;
            d dVar = cVar.f13402a;
            f.f(jArr, dVar.f13405b, dVar.f13406c);
            f.f(eVar.f13407a.f13406c, cVar.f13402a.f13406c, cVar.f13403b);
            long[] jArr2 = eVar.f13408b;
            d dVar2 = cVar.f13402a;
            f.f(jArr2, dVar2.f13404a, dVar2.f13405b);
            return eVar;
        }

        public e(d dVar, long[] jArr) {
            this.f13407a = dVar;
            this.f13408b = jArr;
        }

        public e(c cVar) {
            this();
            d(this, cVar);
        }
    }

    public static void e(c cVar, e eVar, C0333a c0333a) {
        long[] jArr = new long[10];
        long[] jArr2 = cVar.f13402a.f13404a;
        d dVar = eVar.f13407a;
        f.n(jArr2, dVar.f13405b, dVar.f13404a);
        long[] jArr3 = cVar.f13402a.f13405b;
        d dVar2 = eVar.f13407a;
        f.m(jArr3, dVar2.f13405b, dVar2.f13404a);
        long[] jArr4 = cVar.f13402a.f13405b;
        f.f(jArr4, jArr4, c0333a.f13399b);
        d dVar3 = cVar.f13402a;
        f.f(dVar3.f13406c, dVar3.f13404a, c0333a.f13398a);
        f.f(cVar.f13403b, eVar.f13408b, c0333a.f13400c);
        c0333a.a(cVar.f13402a.f13404a, eVar.f13407a.f13406c);
        long[] jArr5 = cVar.f13402a.f13404a;
        f.n(jArr, jArr5, jArr5);
        d dVar4 = cVar.f13402a;
        f.m(dVar4.f13404a, dVar4.f13406c, dVar4.f13405b);
        d dVar5 = cVar.f13402a;
        long[] jArr6 = dVar5.f13405b;
        f.n(jArr6, dVar5.f13406c, jArr6);
        f.n(cVar.f13402a.f13406c, jArr, cVar.f13403b);
        long[] jArr7 = cVar.f13403b;
        f.m(jArr7, jArr, jArr7);
    }

    public static d f(byte[] bArr, e eVar, byte[] bArr2) {
        b[] bVarArr = new b[8];
        bVarArr[0] = new b(eVar);
        c cVar = new c();
        h(cVar, eVar);
        e eVar2 = new e(cVar);
        for (int i8 = 1; i8 < 8; i8++) {
            e(cVar, eVar2, bVarArr[i8 - 1]);
            bVarArr[i8] = new b(new e(cVar));
        }
        byte[] bArrQ = q(bArr);
        byte[] bArrQ2 = q(bArr2);
        c cVar2 = new c(f13396b);
        e eVar3 = new e();
        int i9 = 255;
        while (i9 >= 0 && bArrQ[i9] == 0 && bArrQ2[i9] == 0) {
            i9--;
        }
        while (i9 >= 0) {
            g(cVar2, new d(cVar2));
            byte b8 = bArrQ[i9];
            if (b8 > 0) {
                e(cVar2, e.d(eVar3, cVar2), bVarArr[bArrQ[i9] / 2]);
            } else if (b8 < 0) {
                r(cVar2, e.d(eVar3, cVar2), bVarArr[(-bArrQ[i9]) / 2]);
            }
            byte b9 = bArrQ2[i9];
            if (b9 > 0) {
                e(cVar2, e.d(eVar3, cVar2), p006a5.b.f13413e[bArrQ2[i9] / 2]);
            } else if (b9 < 0) {
                r(cVar2, e.d(eVar3, cVar2), p006a5.b.f13413e[(-bArrQ2[i9]) / 2]);
            }
            i9--;
        }
        return new d(cVar2);
    }

    public static void g(c cVar, d dVar) {
        long[] jArr = new long[10];
        f.k(cVar.f13402a.f13404a, dVar.f13404a);
        f.k(cVar.f13402a.f13406c, dVar.f13405b);
        f.k(cVar.f13403b, dVar.f13406c);
        long[] jArr2 = cVar.f13403b;
        f.n(jArr2, jArr2, jArr2);
        f.n(cVar.f13402a.f13405b, dVar.f13404a, dVar.f13405b);
        f.k(jArr, cVar.f13402a.f13405b);
        d dVar2 = cVar.f13402a;
        f.n(dVar2.f13405b, dVar2.f13406c, dVar2.f13404a);
        d dVar3 = cVar.f13402a;
        long[] jArr3 = dVar3.f13406c;
        f.m(jArr3, jArr3, dVar3.f13404a);
        d dVar4 = cVar.f13402a;
        f.m(dVar4.f13404a, jArr, dVar4.f13405b);
        long[] jArr4 = cVar.f13403b;
        f.m(jArr4, jArr4, cVar.f13402a.f13406c);
    }

    public static void h(c cVar, e eVar) {
        g(cVar, eVar.f13407a);
    }

    public static int i(long[] jArr) {
        return f.a(jArr)[0] & 1;
    }

    public static boolean j(long[] jArr) {
        long[] jArr2 = new long[jArr.length + 1];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        f.i(jArr2);
        for (byte b8 : f.a(jArr2)) {
            if (b8 != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(byte[] bArr) {
        for (int i8 = 31; i8 >= 0; i8--) {
            int i9 = bArr[i8] & 255;
            int i10 = f13397c[i8] & 255;
            if (i9 != i10) {
                return i9 < i10;
            }
        }
        return false;
    }

    public static long l(byte[] bArr, int i8) {
        return (((long) (bArr[i8 + 2] & 255)) << 16) | (((long) bArr[i8]) & 255) | (((long) (bArr[i8 + 1] & 255)) << 8);
    }

    public static long m(byte[] bArr, int i8) {
        return (((long) (bArr[i8 + 3] & 255)) << 24) | l(bArr, i8);
    }

    public static void n(long[] jArr, long[] jArr2) {
        for (int i8 = 0; i8 < jArr2.length; i8++) {
            jArr[i8] = -jArr2[i8];
        }
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        f.k(jArr3, jArr2);
        f.k(jArr4, jArr3);
        f.k(jArr4, jArr4);
        f.f(jArr4, jArr2, jArr4);
        f.f(jArr3, jArr3, jArr4);
        f.k(jArr3, jArr3);
        f.f(jArr3, jArr4, jArr3);
        f.k(jArr4, jArr3);
        for (int i8 = 1; i8 < 5; i8++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr3, jArr4, jArr3);
        f.k(jArr4, jArr3);
        for (int i9 = 1; i9 < 10; i9++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr4, jArr4, jArr3);
        f.k(jArr5, jArr4);
        for (int i10 = 1; i10 < 20; i10++) {
            f.k(jArr5, jArr5);
        }
        f.f(jArr4, jArr5, jArr4);
        f.k(jArr4, jArr4);
        for (int i11 = 1; i11 < 10; i11++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr3, jArr4, jArr3);
        f.k(jArr4, jArr3);
        for (int i12 = 1; i12 < 50; i12++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr4, jArr4, jArr3);
        f.k(jArr5, jArr4);
        for (int i13 = 1; i13 < 100; i13++) {
            f.k(jArr5, jArr5);
        }
        f.f(jArr4, jArr5, jArr4);
        f.k(jArr4, jArr4);
        for (int i14 = 1; i14 < 50; i14++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr3, jArr4, jArr3);
        f.k(jArr3, jArr3);
        f.k(jArr3, jArr3);
        f.f(jArr, jArr3, jArr2);
    }

    public static void p(byte[] bArr) {
        long jL = l(bArr, 0) & 2097151;
        long jM = (m(bArr, 2) >> 5) & 2097151;
        long jL2 = (l(bArr, 5) >> 2) & 2097151;
        long jM2 = (m(bArr, 7) >> 7) & 2097151;
        long jM3 = (m(bArr, 10) >> 4) & 2097151;
        long jL3 = (l(bArr, 13) >> 1) & 2097151;
        long jM4 = (m(bArr, 15) >> 6) & 2097151;
        long jL4 = (l(bArr, 18) >> 3) & 2097151;
        long jL5 = l(bArr, 21) & 2097151;
        long jM5 = (m(bArr, 23) >> 5) & 2097151;
        long jL6 = (l(bArr, 26) >> 2) & 2097151;
        long jM6 = (m(bArr, 28) >> 7) & 2097151;
        long jM7 = (m(bArr, 31) >> 4) & 2097151;
        long jL7 = (l(bArr, 34) >> 1) & 2097151;
        long jM8 = (m(bArr, 36) >> 6) & 2097151;
        long jL8 = (l(bArr, 39) >> 3) & 2097151;
        long jL9 = l(bArr, 42) & 2097151;
        long jM9 = (m(bArr, 44) >> 5) & 2097151;
        long jL10 = (l(bArr, 47) >> 2) & 2097151;
        long jM10 = (m(bArr, 49) >> 7) & 2097151;
        long jM11 = (m(bArr, 52) >> 4) & 2097151;
        long jL11 = (l(bArr, 55) >> 1) & 2097151;
        long jM12 = (m(bArr, 57) >> 6) & 2097151;
        long jM13 = m(bArr, 60) >> 3;
        long j8 = jL9 - (jM13 * 683901);
        long j9 = ((jM8 - (jM13 * 997805)) + (jM12 * 136657)) - (jL11 * 683901);
        long j10 = ((((jM7 + (jM13 * 470296)) + (jM12 * 654183)) - (jL11 * 997805)) + (jM11 * 136657)) - (jM10 * 683901);
        long j11 = jM4 + (jL10 * 666643);
        long j12 = jL4 + (jM10 * 666643) + (jL10 * 470296);
        long j13 = jL5 + (jM11 * 666643) + (jM10 * 470296) + (jL10 * 654183);
        long j14 = (((jM5 + (jL11 * 666643)) + (jM11 * 470296)) + (jM10 * 654183)) - (jL10 * 997805);
        long j15 = ((((jL6 + (jM12 * 666643)) + (jL11 * 470296)) + (jM11 * 654183)) - (jM10 * 997805)) + (jL10 * 136657);
        long j16 = (((((jM6 + (jM13 * 666643)) + (jM12 * 470296)) + (jL11 * 654183)) - (jM11 * 997805)) + (jM10 * 136657)) - (jL10 * 683901);
        long j17 = (j11 + 1048576) >> 21;
        long j18 = j12 + j17;
        long j19 = j11 - (j17 << 21);
        long j20 = (j13 + 1048576) >> 21;
        long j21 = j14 + j20;
        long j22 = j13 - (j20 << 21);
        long j23 = (j15 + 1048576) >> 21;
        long j24 = j16 + j23;
        long j25 = j15 - (j23 << 21);
        long j26 = (j10 + 1048576) >> 21;
        long j27 = ((((jL7 + (jM13 * 654183)) - (jM12 * 997805)) + (jL11 * 136657)) - (jM11 * 683901)) + j26;
        long j28 = j10 - (j26 << 21);
        long j29 = (j9 + 1048576) >> 21;
        long j30 = ((jL8 + (jM13 * 136657)) - (jM12 * 683901)) + j29;
        long j31 = j9 - (j29 << 21);
        long j32 = (j8 + 1048576) >> 21;
        long j33 = jM9 + j32;
        long j34 = j8 - (j32 << 21);
        long j35 = (j18 + 1048576) >> 21;
        long j36 = j22 + j35;
        long j37 = j18 - (j35 << 21);
        long j38 = (j21 + 1048576) >> 21;
        long j39 = j25 + j38;
        long j40 = j21 - (j38 << 21);
        long j41 = (j24 + 1048576) >> 21;
        long j42 = j28 + j41;
        long j43 = j24 - (j41 << 21);
        long j44 = (j27 + 1048576) >> 21;
        long j45 = j31 + j44;
        long j46 = j27 - (j44 << 21);
        long j47 = (j30 + 1048576) >> 21;
        long j48 = j34 + j47;
        long j49 = j30 - (j47 << 21);
        long j50 = j39 - (j33 * 683901);
        long j51 = ((j36 - (j33 * 997805)) + (j48 * 136657)) - (j49 * 683901);
        long j52 = ((((j19 + (j33 * 470296)) + (j48 * 654183)) - (j49 * 997805)) + (j45 * 136657)) - (j46 * 683901);
        long j53 = jL + (j42 * 666643);
        long j54 = jM + (j46 * 666643) + (j42 * 470296);
        long j55 = jL2 + (j45 * 666643) + (j46 * 470296) + (j42 * 654183);
        long j56 = (((jM2 + (j49 * 666643)) + (j45 * 470296)) + (j46 * 654183)) - (j42 * 997805);
        long j57 = ((((jM3 + (j48 * 666643)) + (j49 * 470296)) + (j45 * 654183)) - (j46 * 997805)) + (j42 * 136657);
        long j58 = (((((jL3 + (j33 * 666643)) + (j48 * 470296)) + (j49 * 654183)) - (j45 * 997805)) + (j46 * 136657)) - (j42 * 683901);
        long j59 = (j53 + 1048576) >> 21;
        long j60 = j54 + j59;
        long j61 = j53 - (j59 << 21);
        long j62 = (j55 + 1048576) >> 21;
        long j63 = j56 + j62;
        long j64 = j55 - (j62 << 21);
        long j65 = (j57 + 1048576) >> 21;
        long j66 = j58 + j65;
        long j67 = j57 - (j65 << 21);
        long j68 = (j52 + 1048576) >> 21;
        long j69 = ((((j37 + (j33 * 654183)) - (j48 * 997805)) + (j49 * 136657)) - (j45 * 683901)) + j68;
        long j70 = j52 - (j68 << 21);
        long j71 = (j51 + 1048576) >> 21;
        long j72 = ((j40 + (j33 * 136657)) - (j48 * 683901)) + j71;
        long j73 = j51 - (j71 << 21);
        long j74 = (j50 + 1048576) >> 21;
        long j75 = j43 + j74;
        long j76 = j50 - (j74 << 21);
        long j77 = (j60 + 1048576) >> 21;
        long j78 = j64 + j77;
        long j79 = j60 - (j77 << 21);
        long j80 = (j63 + 1048576) >> 21;
        long j81 = j67 + j80;
        long j82 = j63 - (j80 << 21);
        long j83 = (j66 + 1048576) >> 21;
        long j84 = j70 + j83;
        long j85 = j66 - (j83 << 21);
        long j86 = (j69 + 1048576) >> 21;
        long j87 = j73 + j86;
        long j88 = j69 - (j86 << 21);
        long j89 = (j72 + 1048576) >> 21;
        long j90 = (j75 + 1048576) >> 21;
        long j91 = j75 - (j90 << 21);
        long j92 = j61 + (j90 * 666643);
        long j93 = j79 + (j90 * 470296);
        long j94 = j78 + (j90 * 654183);
        long j95 = j82 - (j90 * 997805);
        long j96 = j81 + (j90 * 136657);
        long j97 = j85 - (j90 * 683901);
        long j98 = j92 >> 21;
        long j99 = j93 + j98;
        long j100 = j92 - (j98 << 21);
        long j101 = j99 >> 21;
        long j102 = j94 + j101;
        long j103 = j99 - (j101 << 21);
        long j104 = j102 >> 21;
        long j105 = j95 + j104;
        long j106 = j102 - (j104 << 21);
        long j107 = j105 >> 21;
        long j108 = j96 + j107;
        long j109 = j105 - (j107 << 21);
        long j110 = j108 >> 21;
        long j111 = j97 + j110;
        long j112 = j108 - (j110 << 21);
        long j113 = j111 >> 21;
        long j114 = j84 + j113;
        long j115 = j111 - (j113 << 21);
        long j116 = j114 >> 21;
        long j117 = j88 + j116;
        long j118 = j114 - (j116 << 21);
        long j119 = j117 >> 21;
        long j120 = j87 + j119;
        long j121 = j117 - (j119 << 21);
        long j122 = j120 >> 21;
        long j123 = (j72 - (j89 << 21)) + j122;
        long j124 = j120 - (j122 << 21);
        long j125 = j123 >> 21;
        long j126 = j76 + j89 + j125;
        long j127 = j123 - (j125 << 21);
        long j128 = j126 >> 21;
        long j129 = j91 + j128;
        long j130 = j126 - (j128 << 21);
        long j131 = j129 >> 21;
        long j132 = j129 - (j131 << 21);
        long j133 = j100 + (666643 * j131);
        long j134 = j103 + (470296 * j131);
        long j135 = j106 + (654183 * j131);
        long j136 = j109 - (997805 * j131);
        long j137 = j112 + (136657 * j131);
        long j138 = j115 - (j131 * 683901);
        long j139 = j133 >> 21;
        long j140 = j134 + j139;
        long j141 = j133 - (j139 << 21);
        long j142 = j140 >> 21;
        long j143 = j135 + j142;
        long j144 = j140 - (j142 << 21);
        long j145 = j143 >> 21;
        long j146 = j136 + j145;
        long j147 = j143 - (j145 << 21);
        long j148 = j146 >> 21;
        long j149 = j137 + j148;
        long j150 = j146 - (j148 << 21);
        long j151 = j149 >> 21;
        long j152 = j138 + j151;
        long j153 = j149 - (j151 << 21);
        long j154 = j152 >> 21;
        long j155 = j118 + j154;
        long j156 = j152 - (j154 << 21);
        long j157 = j155 >> 21;
        long j158 = j121 + j157;
        long j159 = j155 - (j157 << 21);
        long j160 = j158 >> 21;
        long j161 = j124 + j160;
        long j162 = j158 - (j160 << 21);
        long j163 = j161 >> 21;
        long j164 = j127 + j163;
        long j165 = j161 - (j163 << 21);
        long j166 = j164 >> 21;
        long j167 = j130 + j166;
        long j168 = j164 - (j166 << 21);
        long j169 = j167 >> 21;
        long j170 = j132 + j169;
        long j171 = j167 - (j169 << 21);
        bArr[0] = (byte) j141;
        bArr[1] = (byte) (j141 >> 8);
        bArr[2] = (byte) ((j141 >> 16) | (j144 << 5));
        bArr[3] = (byte) (j144 >> 3);
        bArr[4] = (byte) (j144 >> 11);
        bArr[5] = (byte) ((j144 >> 19) | (j147 << 2));
        bArr[6] = (byte) (j147 >> 6);
        bArr[7] = (byte) ((j147 >> 14) | (j150 << 7));
        bArr[8] = (byte) (j150 >> 1);
        bArr[9] = (byte) (j150 >> 9);
        bArr[10] = (byte) ((j150 >> 17) | (j153 << 4));
        bArr[11] = (byte) (j153 >> 4);
        bArr[12] = (byte) (j153 >> 12);
        bArr[13] = (byte) ((j153 >> 20) | (j156 << 1));
        bArr[14] = (byte) (j156 >> 7);
        bArr[15] = (byte) ((j156 >> 15) | (j159 << 6));
        bArr[16] = (byte) (j159 >> 2);
        bArr[17] = (byte) (j159 >> 10);
        bArr[18] = (byte) ((j159 >> 18) | (j162 << 3));
        bArr[19] = (byte) (j162 >> 5);
        bArr[20] = (byte) (j162 >> 13);
        bArr[21] = (byte) j165;
        bArr[22] = (byte) (j165 >> 8);
        bArr[23] = (byte) ((j165 >> 16) | (j168 << 5));
        bArr[24] = (byte) (j168 >> 3);
        bArr[25] = (byte) (j168 >> 11);
        bArr[26] = (byte) ((j168 >> 19) | (j171 << 2));
        bArr[27] = (byte) (j171 >> 6);
        bArr[28] = (byte) ((j171 >> 14) | (j170 << 7));
        bArr[29] = (byte) (j170 >> 1);
        bArr[30] = (byte) (j170 >> 9);
        bArr[31] = (byte) (j170 >> 17);
    }

    public static byte[] q(byte[] bArr) {
        int i8;
        byte[] bArr2 = new byte[256];
        for (int i9 = 0; i9 < 256; i9++) {
            bArr2[i9] = (byte) (1 & ((bArr[i9 >> 3] & 255) >> (i9 & 7)));
        }
        for (int i10 = 0; i10 < 256; i10++) {
            if (bArr2[i10] != 0) {
                for (int i11 = 1; i11 <= 6 && (i8 = i10 + i11) < 256; i11++) {
                    byte b8 = bArr2[i8];
                    if (b8 != 0) {
                        byte b9 = bArr2[i10];
                        if ((b8 << i11) + b9 > 15) {
                            if (b9 - (b8 << i11) < -15) {
                                break;
                            }
                            bArr2[i10] = (byte) (b9 - (b8 << i11));
                            while (i8 < 256) {
                                if (bArr2[i8] == 0) {
                                    bArr2[i8] = 1;
                                    break;
                                }
                                bArr2[i8] = 0;
                                i8++;
                            }
                        } else {
                            bArr2[i10] = (byte) (b9 + (b8 << i11));
                            bArr2[i8] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static void r(c cVar, e eVar, C0333a c0333a) {
        long[] jArr = new long[10];
        long[] jArr2 = cVar.f13402a.f13404a;
        d dVar = eVar.f13407a;
        f.n(jArr2, dVar.f13405b, dVar.f13404a);
        long[] jArr3 = cVar.f13402a.f13405b;
        d dVar2 = eVar.f13407a;
        f.m(jArr3, dVar2.f13405b, dVar2.f13404a);
        long[] jArr4 = cVar.f13402a.f13405b;
        f.f(jArr4, jArr4, c0333a.f13398a);
        d dVar3 = cVar.f13402a;
        f.f(dVar3.f13406c, dVar3.f13404a, c0333a.f13399b);
        f.f(cVar.f13403b, eVar.f13408b, c0333a.f13400c);
        c0333a.a(cVar.f13402a.f13404a, eVar.f13407a.f13406c);
        long[] jArr5 = cVar.f13402a.f13404a;
        f.n(jArr, jArr5, jArr5);
        d dVar4 = cVar.f13402a;
        f.m(dVar4.f13404a, dVar4.f13406c, dVar4.f13405b);
        d dVar5 = cVar.f13402a;
        long[] jArr6 = dVar5.f13405b;
        f.n(jArr6, dVar5.f13406c, jArr6);
        f.m(cVar.f13402a.f13406c, jArr, cVar.f13403b);
        long[] jArr7 = cVar.f13403b;
        f.n(jArr7, jArr, jArr7);
    }

    public static boolean s(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr2.length != 64) {
            return false;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 32, 64);
        if (!k(bArrCopyOfRange)) {
            return false;
        }
        MessageDigest messageDigest = (MessageDigest) p006a5.d.f13425e.a("SHA-512");
        messageDigest.update(bArr2, 0, 32);
        messageDigest.update(bArr3);
        messageDigest.update(bArr);
        byte[] bArrDigest = messageDigest.digest();
        p(bArrDigest);
        byte[] bArrB = f(bArrDigest, e.c(bArr3), bArrCopyOfRange).b();
        for (int i8 = 0; i8 < 32; i8++) {
            if (bArrB[i8] != bArr2[i8]) {
                return false;
            }
        }
        return true;
    }
}
