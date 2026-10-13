package I;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f3614e = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f3615f = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f3616g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f3617h = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f3621d;

    public g(int i8, int i9, byte[] bArr) {
        this(i8, i9, -1L, bArr);
    }

    public static g a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new g(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f3614e);
        return new g(1, bytes.length, bytes);
    }

    public static g b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f3616g[12] * dArr.length]);
        byteBufferWrap.order(byteOrder);
        for (double d8 : dArr) {
            byteBufferWrap.putDouble(d8);
        }
        return new g(12, dArr.length, byteBufferWrap.array());
    }

    public static g c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f3616g[9] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i8 : iArr) {
            byteBufferWrap.putInt(i8);
        }
        return new g(9, iArr.length, byteBufferWrap.array());
    }

    public static g d(l[] lVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f3616g[10] * lVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (l lVar : lVarArr) {
            byteBufferWrap.putInt((int) lVar.b());
            byteBufferWrap.putInt((int) lVar.a());
        }
        return new g(10, lVarArr.length, byteBufferWrap.array());
    }

    public static g e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f3614e);
        return new g(2, bytes.length, bytes);
    }

    public static g f(long j8, ByteOrder byteOrder) {
        return g(new long[]{j8}, byteOrder);
    }

    public static g g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f3616g[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j8 : jArr) {
            byteBufferWrap.putInt((int) j8);
        }
        return new g(4, jArr.length, byteBufferWrap.array());
    }

    public static g h(l[] lVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f3616g[5] * lVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (l lVar : lVarArr) {
            byteBufferWrap.putInt((int) lVar.b());
            byteBufferWrap.putInt((int) lVar.a());
        }
        return new g(5, lVarArr.length, byteBufferWrap.array());
    }

    public static g i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f3616g[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i8 : iArr) {
            byteBufferWrap.putShort((short) i8);
        }
        return new g(3, iArr.length, byteBufferWrap.array());
    }

    public int j() {
        return f3616g[this.f3618a] * this.f3619b;
    }

    public String toString() {
        return "(" + f3615f[this.f3618a] + ", data length:" + this.f3621d.length + ")";
    }

    public g(int i8, int i9, long j8, byte[] bArr) {
        this.f3618a = i8;
        this.f3619b = i9;
        this.f3620c = j8;
        this.f3621d = bArr;
    }
}
