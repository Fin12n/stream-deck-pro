package J7;

/* JADX INFO: renamed from: J7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1031b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1034e.a f4363a = new C1034e.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4364b = -1234567890;

    public static final boolean a(byte[] a8, int i8, byte[] b8, int i9, int i10) {
        kotlin.jvm.internal.t.g(a8, "a");
        kotlin.jvm.internal.t.g(b8, "b");
        for (int i11 = 0; i11 < i10; i11++) {
            if (a8[i11 + i8] != b8[i11 + i9]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j8, long j9, long j10) {
        if ((j9 | j10) < 0 || j9 > j8 || j8 - j9 < j10) {
            throw new ArrayIndexOutOfBoundsException("size=" + j8 + " offset=" + j9 + " byteCount=" + j10);
        }
    }

    public static final int c() {
        return f4364b;
    }

    public static final C1034e.a d() {
        return f4363a;
    }

    public static final int e(h hVar, int i8) {
        kotlin.jvm.internal.t.g(hVar, "<this>");
        return i8 == f4364b ? hVar.H() : i8;
    }

    public static final int f(byte[] bArr, int i8) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        return i8 == f4364b ? bArr.length : i8;
    }

    public static final C1034e.a g(C1034e.a unsafeCursor) {
        kotlin.jvm.internal.t.g(unsafeCursor, "unsafeCursor");
        return unsafeCursor == f4363a ? new C1034e.a() : unsafeCursor;
    }

    public static final int h(int i8) {
        return ((i8 & 255) << 24) | (((-16777216) & i8) >>> 24) | ((16711680 & i8) >>> 8) | ((65280 & i8) << 8);
    }

    public static final short i(short s8) {
        return (short) (((s8 & 255) << 8) | ((65280 & s8) >>> 8));
    }

    public static final String j(byte b8) {
        return Z6.v.q(new char[]{K7.b.f()[(b8 >> 4) & 15], K7.b.f()[b8 & 15]});
    }

    public static final String k(int i8) {
        if (i8 == 0) {
            return "0";
        }
        int i9 = 0;
        char[] cArr = {K7.b.f()[(i8 >> 28) & 15], K7.b.f()[(i8 >> 24) & 15], K7.b.f()[(i8 >> 20) & 15], K7.b.f()[(i8 >> 16) & 15], K7.b.f()[(i8 >> 12) & 15], K7.b.f()[(i8 >> 8) & 15], K7.b.f()[(i8 >> 4) & 15], K7.b.f()[i8 & 15]};
        while (i9 < 8 && cArr[i9] == '0') {
            i9++;
        }
        return Z6.v.r(cArr, i9, 8);
    }
}
