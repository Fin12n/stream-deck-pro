package p006a5;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f13409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f13410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long[] f13411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p006a5.a.C0333a[][] f13412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p006a5.a.C0333a[] f13413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final BigInteger f13414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f13415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final BigInteger f13416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final BigInteger f13417i;

    /* JADX INFO: renamed from: a5.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class C0334b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BigInteger f13418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public BigInteger f13419b;

        public C0334b() {
        }
    }

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f13414f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        f13415g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f13416h = bigIntegerMod2;
        BigInteger bigIntegerModPow = BigInteger.valueOf(2L).modPow(bigIntegerSubtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        f13417i = bigIntegerModPow;
        C0334b c0334b = new C0334b();
        c0334b.f13419b = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        c0334b.f13418a = c(c0334b.f13419b);
        f13409a = f.c(d(bigIntegerMod));
        f13410b = f.c(d(bigIntegerMod2));
        f13411c = f.c(d(bigIntegerModPow));
        f13412d = (p006a5.a.C0333a[][]) Array.newInstance((Class<?>) p006a5.a.C0333a.class, 32, 8);
        C0334b c0334bA = c0334b;
        for (int i8 = 0; i8 < 32; i8++) {
            C0334b c0334bA2 = c0334bA;
            for (int i9 = 0; i9 < 8; i9++) {
                f13412d[i8][i9] = b(c0334bA2);
                c0334bA2 = a(c0334bA2, c0334bA);
            }
            for (int i10 = 0; i10 < 8; i10++) {
                c0334bA = a(c0334bA, c0334bA);
            }
        }
        C0334b c0334bA3 = a(c0334b, c0334b);
        f13413e = new p006a5.a.C0333a[8];
        for (int i11 = 0; i11 < 8; i11++) {
            f13413e[i11] = b(c0334b);
            c0334b = a(c0334b, c0334bA3);
        }
    }

    public static C0334b a(C0334b c0334b, C0334b c0334b2) {
        C0334b c0334b3 = new C0334b();
        BigInteger bigIntegerMultiply = f13415g.multiply(c0334b.f13418a.multiply(c0334b2.f13418a).multiply(c0334b.f13419b).multiply(c0334b2.f13419b));
        BigInteger bigInteger = f13414f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = c0334b.f13418a.multiply(c0334b2.f13419b).add(c0334b2.f13418a.multiply(c0334b.f13419b));
        BigInteger bigInteger2 = BigInteger.ONE;
        c0334b3.f13418a = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        c0334b3.f13419b = c0334b.f13419b.multiply(c0334b2.f13419b).add(c0334b.f13418a.multiply(c0334b2.f13418a)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return c0334b3;
    }

    public static p006a5.a.C0333a b(C0334b c0334b) {
        BigInteger bigIntegerAdd = c0334b.f13419b.add(c0334b.f13418a);
        BigInteger bigInteger = f13414f;
        return new p006a5.a.C0333a(f.c(d(bigIntegerAdd.mod(bigInteger))), f.c(d(c0334b.f13419b.subtract(c0334b.f13418a).mod(bigInteger))), f.c(d(f13416h.multiply(c0334b.f13418a).multiply(c0334b.f13419b).mod(bigInteger))));
    }

    public static BigInteger c(BigInteger bigInteger) {
        BigInteger bigIntegerPow = bigInteger.pow(2);
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigIntegerPow.subtract(bigInteger2);
        BigInteger bigIntegerAdd = f13415g.multiply(bigInteger.pow(2)).add(bigInteger2);
        BigInteger bigInteger3 = f13414f;
        BigInteger bigIntegerMultiply = bigIntegerSubtract.multiply(bigIntegerAdd.modInverse(bigInteger3));
        BigInteger bigIntegerModPow = bigIntegerMultiply.modPow(bigInteger3.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigInteger3);
        if (!bigIntegerModPow.pow(2).subtract(bigIntegerMultiply).mod(bigInteger3).equals(BigInteger.ZERO)) {
            bigIntegerModPow = bigIntegerModPow.multiply(f13417i).mod(bigInteger3);
        }
        return bigIntegerModPow.testBit(0) ? bigInteger3.subtract(bigIntegerModPow) : bigIntegerModPow;
    }

    public static byte[] d(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i8 = 0; i8 < 16; i8++) {
            byte b8 = bArr[i8];
            int i9 = 31 - i8;
            bArr[i8] = bArr[i9];
            bArr[i9] = b8;
        }
        return bArr;
    }
}
