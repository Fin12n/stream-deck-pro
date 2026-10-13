package p093k2;

import D6.iIQ.BmWxZhjGfw;
import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import p135p0.Dyk.GOKsbdzhLhXAMt;
import p143q0.nKy.bGZGhbtQmA;
import p179u4.eubL.OjEsfyJYzbPn;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final SimpleDateFormat f28611U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final SimpleDateFormat f28612V;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final d[] f28616Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final d[] f28617a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final d[] f28618b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final d[] f28619c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final d[] f28620d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final d f28621e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final d[] f28622f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final d[] f28623g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final d[] f28624h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final d[] f28625i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final d[][] f28626j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final d[] f28627k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final HashMap[] f28628l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final HashMap[] f28629m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final Set f28630n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final HashMap f28631o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Charset f28632p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final byte[] f28633q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final byte[] f28634r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Pattern f28635s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Pattern f28636t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Pattern f28637u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final Pattern f28639v0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileDescriptor f28645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AssetManager.AssetInputStream f28646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap[] f28649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Set f28650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteOrder f28651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f28652i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f28653j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f28654k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f28655l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f28656m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f28657n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f28658o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f28659p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f28660q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f28661r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f28662s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c f28663t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f28664u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f28638v = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final List f28640w = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final List f28641x = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f28642y = {8, 8, 8};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f28643z = {4};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f28591A = {8};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final byte[] f28592B = {-1, -40, -1};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final byte[] f28593C = {102, 116, 121, 112};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final byte[] f28594D = {109, 105, 102, 49};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final byte[] f28595E = {104, 101, 105, 99};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final byte[] f28596F = {97, 118, 105, 102};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final byte[] f28597G = {97, 118, 105, 115};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final byte[] f28598H = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final byte[] f28599I = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final byte[] f28600J = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final byte[] f28601K = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final byte[] f28602L = {82, 73, 70, 70};

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final byte[] f28603M = {87, 69, 66, 80};

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final byte[] f28604N = {69, 88, 73, 70};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final byte[] f28605O = {-99, 1, 42};

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final byte[] f28606P = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final byte[] f28607Q = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final byte[] f28608R = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final byte[] f28609S = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final byte[] f28610T = "ANMF".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final String[] f28613W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final int[] f28614X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final byte[] f28615Y = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f28673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f28674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f28675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f28676d;

        public c(int i8, int i9, byte[] bArr) {
            this(i8, i9, -1L, bArr);
        }

        public static c a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new c(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.f28632p0);
            return new c(1, bytes.length, bytes);
        }

        public static c b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f28614X[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d8 : dArr) {
                byteBufferWrap.putDouble(d8);
            }
            return new c(12, dArr.length, byteBufferWrap.array());
        }

        public static c c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f28614X[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i8 : iArr) {
                byteBufferWrap.putInt(i8);
            }
            return new c(9, iArr.length, byteBufferWrap.array());
        }

        public static c d(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f28614X[10] * eVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (e eVar : eVarArr) {
                byteBufferWrap.putInt((int) eVar.f28681a);
                byteBufferWrap.putInt((int) eVar.f28682b);
            }
            return new c(10, eVarArr.length, byteBufferWrap.array());
        }

        public static c e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f28632p0);
            return new c(2, bytes.length, bytes);
        }

        public static c f(long j8, ByteOrder byteOrder) {
            return g(new long[]{j8}, byteOrder);
        }

        public static c g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f28614X[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j8 : jArr) {
                byteBufferWrap.putInt((int) j8);
            }
            return new c(4, jArr.length, byteBufferWrap.array());
        }

        public static c h(e eVar, ByteOrder byteOrder) {
            return i(new e[]{eVar}, byteOrder);
        }

        public static c i(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f28614X[5] * eVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (e eVar : eVarArr) {
                byteBufferWrap.putInt((int) eVar.f28681a);
                byteBufferWrap.putInt((int) eVar.f28682b);
            }
            return new c(5, eVarArr.length, byteBufferWrap.array());
        }

        public static c j(int i8, ByteOrder byteOrder) {
            return k(new int[]{i8}, byteOrder);
        }

        public static c k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f28614X[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i8 : iArr) {
                byteBufferWrap.putShort((short) i8);
            }
            return new c(3, iArr.length, byteBufferWrap.array());
        }

        public double l(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objO instanceof String) {
                return Double.parseDouble((String) objO);
            }
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof int[]) {
                int[] iArr = (int[]) objO;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof e[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            e[] eVarArr = (e[]) objO;
            if (eVarArr.length == 1) {
                return eVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int m(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objO instanceof String) {
                return Integer.parseInt((String) objO);
            }
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objO;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String n(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                return null;
            }
            if (objO instanceof String) {
                return (String) objO;
            }
            StringBuilder sb = new StringBuilder();
            int i8 = 0;
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                while (i8 < jArr.length) {
                    sb.append(jArr[i8]);
                    i8++;
                    if (i8 != jArr.length) {
                        sb.append(com.amazon.a.a.o.b.f.f16777a);
                    }
                }
                return sb.toString();
            }
            if (objO instanceof int[]) {
                int[] iArr = (int[]) objO;
                while (i8 < iArr.length) {
                    sb.append(iArr[i8]);
                    i8++;
                    if (i8 != iArr.length) {
                        sb.append(com.amazon.a.a.o.b.f.f16777a);
                    }
                }
                return sb.toString();
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                while (i8 < dArr.length) {
                    sb.append(dArr[i8]);
                    i8++;
                    if (i8 != dArr.length) {
                        sb.append(com.amazon.a.a.o.b.f.f16777a);
                    }
                }
                return sb.toString();
            }
            if (!(objO instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) objO;
            while (i8 < eVarArr.length) {
                sb.append(eVarArr[i8].f28681a);
                sb.append('/');
                sb.append(eVarArr[i8].f28682b);
                i8++;
                if (i8 != eVarArr.length) {
                    sb.append(com.amazon.a.a.o.b.f.f16777a);
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Code duplicated, block: B:108:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:124:? A[SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:18:0x0031 */
        public Object o(ByteOrder byteOrder) throws Throwable {
            Throwable th;
            IOException iOException;
            b bVar;
            InputStream inputStream;
            byte b8;
            byte b9;
            Object str;
            InputStream inputStream2 = null;
            try {
                try {
                    bVar = new b(this.f28676d);
                    try {
                        bVar.t(byteOrder);
                        int length = 0;
                        switch (this.f28673a) {
                            case 1:
                            case 6:
                                byte[] bArr = this.f28676d;
                                if (bArr.length == 1 && (b8 = bArr[0]) >= 0 && b8 <= 1) {
                                    str = new String(new char[]{(char) (b8 + 48)});
                                    break;
                                } else {
                                    String str2 = new String(bArr, a.f28632p0);
                                    try {
                                        bVar.close();
                                        return str2;
                                    } catch (IOException e8) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                                        return str2;
                                    }
                                }
                                break;
                            case 2:
                            case 7:
                                if (this.f28674b >= a.f28615Y.length) {
                                    int i8 = 0;
                                    while (true) {
                                        if (i8 >= a.f28615Y.length) {
                                            length = a.f28615Y.length;
                                        } else if (this.f28676d[i8] == a.f28615Y[i8]) {
                                            i8++;
                                        }
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                while (length < this.f28674b && (b9 = this.f28676d[length]) != 0) {
                                    if (b9 >= 32) {
                                        sb.append((char) b9);
                                    } else {
                                        sb.append('?');
                                    }
                                    length++;
                                }
                                str = sb.toString();
                                break;
                            case 3:
                                int[] iArr = new int[this.f28674b];
                                while (true) {
                                    str = iArr;
                                    if (length < this.f28674b) {
                                        iArr[length] = bVar.readUnsignedShort();
                                        length++;
                                    }
                                }
                                break;
                            case 4:
                                long[] jArr = new long[this.f28674b];
                                while (true) {
                                    str = jArr;
                                    if (length < this.f28674b) {
                                        jArr[length] = bVar.o();
                                        length++;
                                    }
                                }
                                break;
                            case 5:
                                e[] eVarArr = new e[this.f28674b];
                                while (true) {
                                    str = eVarArr;
                                    if (length < this.f28674b) {
                                        eVarArr[length] = new e(bVar.o(), bVar.o(), null);
                                        length++;
                                    }
                                }
                                break;
                            case 8:
                                int[] iArr2 = new int[this.f28674b];
                                while (true) {
                                    str = iArr2;
                                    if (length < this.f28674b) {
                                        iArr2[length] = bVar.readShort();
                                        length++;
                                    }
                                }
                                break;
                            case 9:
                                int[] iArr3 = new int[this.f28674b];
                                while (true) {
                                    str = iArr3;
                                    if (length < this.f28674b) {
                                        iArr3[length] = bVar.readInt();
                                        length++;
                                    }
                                }
                                break;
                            case 10:
                                e[] eVarArr2 = new e[this.f28674b];
                                while (true) {
                                    str = eVarArr2;
                                    if (length < this.f28674b) {
                                        eVarArr2[length] = new e(bVar.readInt(), bVar.readInt(), null);
                                        length++;
                                    }
                                }
                                break;
                            case 11:
                                double[] dArr = new double[this.f28674b];
                                while (true) {
                                    str = dArr;
                                    if (length < this.f28674b) {
                                        dArr[length] = bVar.readFloat();
                                        length++;
                                    }
                                }
                                break;
                            case 12:
                                double[] dArr2 = new double[this.f28674b];
                                while (true) {
                                    str = dArr2;
                                    if (length < this.f28674b) {
                                        dArr2[length] = bVar.readDouble();
                                        length++;
                                    }
                                }
                                break;
                            default:
                                try {
                                    bVar.close();
                                    return null;
                                } catch (IOException e9) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                                    return null;
                                }
                        }
                        try {
                            bVar.close();
                            return str;
                        } catch (IOException e10) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                            return str;
                        }
                    } catch (IOException e11) {
                        iOException = e11;
                        Log.w("ExifInterface", "IOException occurred during reading a value", iOException);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e12) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        throw th;
                    }
                    try {
                        inputStream2.close();
                        throw th;
                    } catch (IOException e13) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                        throw th;
                    }
                }
            } catch (IOException e14) {
                iOException = e14;
                bVar = null;
            } catch (Throwable th3) {
                th = th3;
                if (inputStream2 != null) {
                    throw th;
                }
                inputStream2.close();
                throw th;
            }
        }

        public String toString() {
            return "(" + a.f28613W[this.f28673a] + ", data length:" + this.f28676d.length + ")";
        }

        public c(int i8, int i9, long j8, byte[] bArr) {
            this.f28673a = i8;
            this.f28674b = i9;
            this.f28675c = j8;
            this.f28676d = bArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f28681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f28682b;

        public /* synthetic */ e(long j8, long j9, C0623a c0623a) {
            this(j8, j9);
        }

        public static e b(double d8) {
            long j8;
            long j9;
            long j10 = 1;
            if (d8 >= 9.223372036854776E18d || d8 <= -9.223372036854776E18d) {
                return new e(d8 > 0.0d ? Long.MAX_VALUE : Long.MIN_VALUE, 1L);
            }
            double dAbs = Math.abs(d8);
            long j11 = 0;
            long j12 = 1;
            double d9 = dAbs;
            long j13 = 0;
            while (true) {
                double d10 = d9 % 1.0d;
                long j14 = (long) (d9 - d10);
                j8 = j13 + (j14 * j10);
                j9 = (j14 * j11) + j12;
                d9 = 1.0d / d10;
                long j15 = j10;
                if (Math.abs(dAbs - (j8 / j9)) <= 1.0E-8d * dAbs) {
                    break;
                }
                j12 = j11;
                j10 = j8;
                j13 = j15;
                j11 = j9;
            }
            if (d8 < 0.0d) {
                j8 = -j8;
            }
            return new e(j8, j9);
        }

        public double a() {
            return this.f28681a / this.f28682b;
        }

        public String toString() {
            return this.f28681a + "/" + this.f28682b;
        }

        public e(long j8, long j9) {
            if (j9 == 0) {
                this.f28681a = 0L;
                this.f28682b = 1L;
            } else {
                this.f28681a = j8;
                this.f28682b = j9;
            }
        }
    }

    static {
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d(OjEsfyJYzbPn.maYrD, 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        f28616Z = dVarArr;
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d(SZCvugJaXc.LStcbymyWq, 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d(bGZGhbtQmA.EwPFKXVOoJmtarg, 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f28617a0 = dVarArr2;
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f28618b0 = dVarArr3;
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        f28619c0 = dVarArr4;
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d(GOKsbdzhLhXAMt.KQEs, 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d(GOKsbdzhLhXAMt.eVCpRAO, 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d(BmWxZhjGfw.RiS, 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f28620d0 = dVarArr5;
        f28621e0 = new d("StripOffsets", 273, 3);
        d[] dVarArr6 = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f28622f0 = dVarArr6;
        d[] dVarArr7 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f28623g0 = dVarArr7;
        d[] dVarArr8 = {new d("AspectFrame", 4371, 3)};
        f28624h0 = dVarArr8;
        d[] dVarArr9 = {new d("ColorSpace", 55, 3)};
        f28625i0 = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f28626j0 = dVarArr10;
        f28627k0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f28628l0 = new HashMap[dVarArr10.length];
        f28629m0 = new HashMap[dVarArr10.length];
        f28630n0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f28631o0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f28632p0 = charsetForName;
        f28633q0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f28634r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f28611U = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f28612V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i8 = 0;
        while (true) {
            d[][] dVarArr11 = f28626j0;
            if (i8 >= dVarArr11.length) {
                HashMap map = f28631o0;
                d[] dVarArr12 = f28627k0;
                map.put(Integer.valueOf(dVarArr12[0].f28677a), 5);
                map.put(Integer.valueOf(dVarArr12[1].f28677a), 1);
                map.put(Integer.valueOf(dVarArr12[2].f28677a), 2);
                map.put(Integer.valueOf(dVarArr12[3].f28677a), 3);
                map.put(Integer.valueOf(dVarArr12[4].f28677a), 7);
                map.put(Integer.valueOf(dVarArr12[5].f28677a), 8);
                f28635s0 = Pattern.compile(".*[1-9].*");
                f28636t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f28637u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f28639v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f28628l0[i8] = new HashMap();
            f28629m0[i8] = new HashMap();
            for (d dVar : dVarArr11[i8]) {
                f28628l0[i8].put(Integer.valueOf(dVar.f28677a), dVar);
                f28629m0[i8].put(dVar.f28678b, dVar);
            }
            i8++;
        }
    }

    public a(File file) throws Throwable {
        d[][] dVarArr = f28626j0;
        this.f28649f = new HashMap[dVarArr.length];
        this.f28650g = new HashSet(dVarArr.length);
        this.f28651h = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        A(file.getAbsolutePath());
    }

    public static boolean C(byte[] bArr) {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = f28592B;
            if (i8 >= bArr2.length) {
                return true;
            }
            if (bArr[i8] != bArr2[i8]) {
                return false;
            }
            i8++;
        }
    }

    public static boolean H(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f28638v) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    public static boolean V(int i8) {
        return (i8 == 4 || i8 == 9 || i8 == 13 || i8 == 14) ? false : true;
    }

    public static void X(CRC32 crc32, int i8) {
        crc32.update(i8 >>> 24);
        crc32.update(i8 >>> 16);
        crc32.update(i8 >>> 8);
        crc32.update(i8);
    }

    public static double f(String str, String str2) {
        try {
            String[] strArrSplit = str.split(com.amazon.a.a.o.b.f.f16777a, -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d8 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d9 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d10 = d8 + (d9 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d10;
            }
            return -d10;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static int w(int i8) {
        if (i8 != 4) {
            return (i8 == 9 || i8 == 15 || i8 == 12 || i8 == 13) ? 2 : 1;
        }
        return 3;
    }

    public static Pair x(String str) {
        if (str.contains(com.amazon.a.a.o.b.f.f16777a)) {
            String[] strArrSplit = str.split(com.amazon.a.a.o.b.f.f16777a, -1);
            Pair pairX = x(strArrSplit[0]);
            if (((Integer) pairX.first).intValue() == 2) {
                return pairX;
            }
            for (int i8 = 1; i8 < strArrSplit.length; i8++) {
                Pair pairX2 = x(strArrSplit[i8]);
                int iIntValue = (((Integer) pairX2.first).equals(pairX.first) || ((Integer) pairX2.second).equals(pairX.first)) ? ((Integer) pairX.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairX.second).intValue() == -1 || !(((Integer) pairX2.first).equals(pairX.second) || ((Integer) pairX2.second).equals(pairX.second))) ? -1 : ((Integer) pairX.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairX = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairX = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairX;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j8 = Long.parseLong(str);
                    if (j8 < 0 || j8 > 65535) {
                        return j8 < 0 ? new Pair(9, -1) : new Pair(4, -1);
                    }
                    return new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j9 = (long) Double.parseDouble(strArrSplit2[0]);
                long j10 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j9 >= 0 && j10 >= 0) {
                    if (j9 <= 2147483647L && j10 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public final void A(String str) throws Throwable {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f28646c = null;
        this.f28644a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (H(fileInputStream2.getFD())) {
                    this.f28645b = fileInputStream2.getFD();
                } else {
                    this.f28645b = null;
                }
                L(fileInputStream2);
                p093k2.b.b(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                p093k2.b.b(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final int B(byte[] bArr) throws Throwable {
        long j8;
        b bVar = null;
        try {
            try {
                b bVar2 = new b(bArr);
                try {
                    long length = bVar2.readInt();
                    byte[] bArr2 = new byte[4];
                    bVar2.readFully(bArr2);
                    if (!Arrays.equals(bArr2, f28593C)) {
                        bVar2.close();
                        return 0;
                    }
                    if (length == 1) {
                        length = bVar2.readLong();
                        j8 = 16;
                        if (length < 16) {
                            bVar2.close();
                            return 0;
                        }
                    } else {
                        j8 = 8;
                    }
                    if (length > bArr.length) {
                        length = bArr.length;
                    }
                    long j9 = length - j8;
                    if (j9 < 8) {
                        bVar2.close();
                        return 0;
                    }
                    byte[] bArr3 = new byte[4];
                    boolean z8 = false;
                    boolean z9 = false;
                    boolean z10 = false;
                    for (long j10 = 0; j10 < j9 / 4; j10++) {
                        try {
                            bVar2.readFully(bArr3);
                            if (j10 != 1) {
                                if (Arrays.equals(bArr3, f28594D)) {
                                    z8 = true;
                                } else if (Arrays.equals(bArr3, f28595E)) {
                                    z9 = true;
                                } else if (Arrays.equals(bArr3, f28596F) || Arrays.equals(bArr3, f28597G)) {
                                    z10 = true;
                                }
                                if (!z8) {
                                    continue;
                                } else {
                                    if (z9) {
                                        bVar2.close();
                                        return 12;
                                    }
                                    if (z10) {
                                        bVar2.close();
                                        return 15;
                                    }
                                }
                            }
                        } catch (EOFException unused) {
                            bVar2.close();
                            return 0;
                        }
                    }
                    bVar2.close();
                } catch (Exception e8) {
                    e = e8;
                    bVar = bVar2;
                    if (f28638v) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar != null) {
                        bVar.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar2;
                    if (bVar != null) {
                        bVar.close();
                    }
                    throw th;
                }
            } catch (Exception e9) {
                e = e9;
            }
            return 0;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean D(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderO = O(bVar2);
                this.f28651h = byteOrderO;
                bVar2.t(byteOrderO);
                short s8 = bVar2.readShort();
                boolean z8 = s8 == 20306 || s8 == 21330;
                bVar2.close();
                return z8;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean E(byte[] bArr) {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = f28600J;
            if (i8 >= bArr2.length) {
                return true;
            }
            if (bArr[i8] != bArr2[i8]) {
                return false;
            }
            i8++;
        }
    }

    public final boolean F(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i8 = 0; i8 < bytes.length; i8++) {
            if (bArr[i8] != bytes[i8]) {
                return false;
            }
        }
        return true;
    }

    public final boolean G(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderO = O(bVar2);
                this.f28651h = byteOrderO;
                bVar2.t(byteOrderO);
                boolean z8 = bVar2.readShort() == 85;
                bVar2.close();
                return z8;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean I(HashMap map) {
        c cVar;
        int iM;
        c cVar2 = (c) map.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.o(this.f28651h);
            int[] iArr2 = f28642y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f28647d == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((iM = cVar.m(this.f28651h)) == 1 && Arrays.equals(iArr, f28591A)) || (iM == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f28638v) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    public final boolean J(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.m(this.f28651h) <= 512 && cVar2.m(this.f28651h) <= 512;
    }

    public final boolean K(byte[] bArr) {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = f28602L;
            if (i8 >= bArr2.length) {
                int i9 = 0;
                while (true) {
                    byte[] bArr3 = f28603M;
                    if (i9 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f28602L.length + i9 + 4] != bArr3[i9]) {
                        return false;
                    }
                    i9++;
                }
            } else {
                if (bArr[i8] != bArr2[i8]) {
                    return false;
                }
                i8++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00af A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #2 {all -> 0x0013, blocks: (B:3:0x0002, B:5:0x0007, B:12:0x001c, B:14:0x0020, B:15:0x002e, B:17:0x0036, B:19:0x003f, B:38:0x0071, B:25:0x0050, B:32:0x005e, B:35:0x0066, B:36:0x006a, B:37:0x006e, B:39:0x007b, B:41:0x0085, B:44:0x008d, B:47:0x0095, B:50:0x009d, B:55:0x00ab, B:57:0x00af), top: B:66:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public final void L(InputStream inputStream) {
        boolean z8;
        for (int i8 = 0; i8 < f28626j0.length; i8++) {
            try {
                try {
                    this.f28649f[i8] = new HashMap();
                } catch (Throwable th) {
                    e();
                    if (f28638v) {
                        N();
                    }
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
                z8 = f28638v;
                if (z8) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                e();
                if (z8) {
                    N();
                    return;
                }
                return;
            } catch (UnsupportedOperationException e9) {
                e = e9;
                z8 = f28638v;
                if (z8) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                e();
                if (z8) {
                    N();
                    return;
                }
                return;
            }
        }
        if (!this.f28648e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f28647d = o(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (V(this.f28647d)) {
            f fVar = new f(inputStream);
            if (!this.f28648e) {
                int i9 = this.f28647d;
                if (i9 == 12 || i9 == 15) {
                    l(fVar, i9);
                } else if (i9 == 7) {
                    p(fVar);
                } else if (i9 == 10) {
                    t(fVar);
                } else {
                    s(fVar);
                }
            } else if (!u(fVar)) {
                e();
                if (f28638v) {
                    N();
                    return;
                }
                return;
            }
            fVar.y(this.f28659p);
            U(fVar);
        } else {
            b bVar = new b(inputStream);
            int i10 = this.f28647d;
            if (i10 == 4) {
                m(bVar, 0, 0);
            } else if (i10 == 13) {
                q(bVar);
            } else if (i10 == 9) {
                r(bVar);
            } else if (i10 == 14) {
                v(bVar);
            }
        }
        e();
        if (f28638v) {
            N();
        }
    }

    public final void M(b bVar) throws IOException {
        ByteOrder byteOrderO = O(bVar);
        this.f28651h = byteOrderO;
        bVar.t(byteOrderO);
        int unsignedShort = bVar.readUnsignedShort();
        int i8 = this.f28647d;
        if (i8 != 7 && i8 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i9 = bVar.readInt();
        if (i9 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i9);
        }
        int i10 = i9 - 8;
        if (i10 > 0) {
            bVar.v(i10);
        }
    }

    public final void N() {
        for (int i8 = 0; i8 < this.f28649f.length; i8++) {
            Log.d("ExifInterface", "The size of tag group[" + i8 + "]: " + this.f28649f[i8].size());
            for (Map.Entry entry : this.f28649f[i8].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.n(this.f28651h) + "'");
            }
        }
    }

    public final ByteOrder O(b bVar) throws IOException {
        short s8 = bVar.readShort();
        if (s8 == 18761) {
            if (f28638v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s8 == 19789) {
            if (f28638v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s8));
    }

    public final void P(byte[] bArr, int i8) throws IOException {
        f fVar = new f(bArr);
        M(fVar);
        Q(fVar, i8);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0287  */
    /* JADX WARN: Code duplicated, block: B:102:0x029e  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:107:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:110:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:112:0x0307  */
    /* JADX WARN: Code duplicated, block: B:121:0x0333  */
    /* JADX WARN: Code duplicated, block: B:148:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0133  */
    /* JADX WARN: Code duplicated, block: B:47:0x0138  */
    /* JADX WARN: Code duplicated, block: B:49:0x013e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0144  */
    /* JADX WARN: Code duplicated, block: B:54:0x015d  */
    /* JADX WARN: Code duplicated, block: B:56:0x016b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0170  */
    /* JADX WARN: Code duplicated, block: B:60:0x0173  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:77:0x0202  */
    /* JADX WARN: Code duplicated, block: B:82:0x020f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0214  */
    /* JADX WARN: Code duplicated, block: B:84:0x0219  */
    /* JADX WARN: Code duplicated, block: B:86:0x0220  */
    /* JADX WARN: Code duplicated, block: B:89:0x023a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0285 A[DONT_INVERT] */
    /* JADX WARN: Instruction removed from duplicated block: B:100:0x0287, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x029e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0144, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x01d5, please report this as an issue */
    public final void Q(f fVar, int i8) throws IOException {
        int i9;
        d dVar;
        long j8;
        boolean z8;
        boolean z9;
        d dVar2;
        Integer num;
        d dVar3;
        long j9;
        int unsignedShort;
        long jO;
        String str;
        int i10;
        this.f28650g.add(Integer.valueOf(fVar.c()));
        short s8 = fVar.readShort();
        if (f28638v) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s8));
        }
        if (s8 <= 0) {
            return;
        }
        short s9 = 0;
        while (s9 < s8) {
            int unsignedShort2 = fVar.readUnsignedShort();
            int unsignedShort3 = fVar.readUnsignedShort();
            int i11 = fVar.readInt();
            long jC = ((long) fVar.c()) + 4;
            d dVar4 = (d) f28628l0[i8].get(Integer.valueOf(unsignedShort2));
            boolean z10 = f28638v;
            if (z10) {
                i9 = 4;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i8), Integer.valueOf(unsignedShort2), dVar4 != null ? dVar4.f28678b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i11)));
            } else {
                i9 = 4;
            }
            if (dVar4 != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f28614X;
                    if (unsignedShort3 < iArr.length) {
                        if (dVar4.a(unsignedShort3)) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = dVar4.f28679c;
                            }
                            dVar = dVar4;
                            j8 = ((long) i11) * ((long) iArr[unsignedShort3]);
                            if (j8 < 0 || j8 > 2147483647L) {
                                if (z10) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i11);
                                }
                                z8 = false;
                            } else {
                                z8 = true;
                            }
                        } else if (z10) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f28613W[unsignedShort3] + ") is unexpected for tag: " + dVar4.f28678b);
                        }
                    }
                    if (z8) {
                        if (j8 > 4) {
                            i10 = fVar.readInt();
                            if (z10) {
                                Log.d("ExifInterface", "seek to data offset: " + i10);
                            }
                            if (this.f28647d == 7) {
                                z9 = z10;
                                dVar2 = dVar;
                                if ("MakerNote".equals(dVar2.f28678b)) {
                                    this.f28660q = i10;
                                } else if (i8 != 6 && "ThumbnailImage".equals(dVar2.f28678b)) {
                                    this.f28661r = i10;
                                    this.f28662s = i11;
                                    c cVarJ = c.j(6, this.f28651h);
                                    c cVarF = c.f(this.f28661r, this.f28651h);
                                    c cVarF2 = c.f(this.f28662s, this.f28651h);
                                    this.f28649f[i9].put("Compression", cVarJ);
                                    this.f28649f[i9].put("JPEGInterchangeFormat", cVarF);
                                    this.f28649f[i9].put("JPEGInterchangeFormatLength", cVarF2);
                                }
                            } else {
                                z9 = z10;
                                dVar2 = dVar;
                            }
                            fVar.y(i10);
                        } else {
                            z9 = z10;
                            jC = jC;
                            dVar2 = dVar;
                        }
                        num = (Integer) f28631o0.get(Integer.valueOf(unsignedShort2));
                        if (z9) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j8);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == i9) {
                                    jO = fVar.o();
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = fVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = fVar.readInt();
                                } else {
                                    jO = -1;
                                }
                                if (z9) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jO), dVar2.f28678b));
                                }
                                if (jO > 0 || (fVar.b() != -1 && jO >= fVar.b())) {
                                    if (z9) {
                                        str = "Skip jump into the IFD since its offset is invalid: " + jO;
                                        if (fVar.b() != -1) {
                                            str = str + " (total length: " + fVar.b() + ")";
                                        }
                                        Log.d("ExifInterface", str);
                                    }
                                } else if (!this.f28650g.contains(Integer.valueOf((int) jO))) {
                                    fVar.y(jO);
                                    Q(fVar, num.intValue());
                                } else if (z9) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jO + ")");
                                }
                                fVar.y(jC);
                            } else {
                                unsignedShort = fVar.readUnsignedShort();
                            }
                            jO = unsignedShort;
                            if (z9) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jO), dVar2.f28678b));
                            }
                            if (jO > 0) {
                                if (z9) {
                                    str = "Skip jump into the IFD since its offset is invalid: " + jO;
                                    if (fVar.b() != -1) {
                                        str = str + " (total length: " + fVar.b() + ")";
                                    }
                                    Log.d("ExifInterface", str);
                                }
                            } else if (z9) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jO;
                                if (fVar.b() != -1) {
                                    str = str + " (total length: " + fVar.b() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                            fVar.y(jC);
                        } else {
                            int iC = fVar.c() + this.f28659p;
                            byte[] bArr = new byte[(int) j8];
                            fVar.readFully(bArr);
                            long j10 = iC;
                            dVar3 = dVar2;
                            j9 = jC;
                            c cVar = new c(unsignedShort3, i11, j10, bArr);
                            this.f28649f[i8].put(dVar3.f28678b, cVar);
                            if ("DNGVersion".equals(dVar3.f28678b)) {
                                this.f28647d = 3;
                            }
                            if (((!"Make".equals(dVar3.f28678b) || "Model".equals(dVar3.f28678b)) && cVar.n(this.f28651h).contains("PENTAX")) || ("Compression".equals(dVar3.f28678b) && cVar.m(this.f28651h) == 65535)) {
                                this.f28647d = 8;
                            }
                            if (fVar.c() != j9) {
                                fVar.y(j9);
                            }
                        }
                    } else {
                        fVar.y(jC);
                    }
                    s9 = (short) (s9 + 1);
                    s8 = s8;
                }
                dVar = dVar4;
                if (z10) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j8 = 0;
                z8 = false;
                if (z8) {
                    fVar.y(jC);
                } else {
                    if (j8 > 4) {
                        i10 = fVar.readInt();
                        if (z10) {
                            Log.d("ExifInterface", "seek to data offset: " + i10);
                        }
                        if (this.f28647d == 7) {
                            z9 = z10;
                            dVar2 = dVar;
                            if ("MakerNote".equals(dVar2.f28678b)) {
                                this.f28660q = i10;
                            } else if (i8 != 6) {
                            }
                        } else {
                            z9 = z10;
                            dVar2 = dVar;
                        }
                        fVar.y(i10);
                    } else {
                        z9 = z10;
                        jC = jC;
                        dVar2 = dVar;
                    }
                    num = (Integer) f28631o0.get(Integer.valueOf(unsignedShort2));
                    if (z9) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j8);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == i9) {
                                jO = fVar.o();
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = fVar.readInt();
                            } else {
                                unsignedShort = fVar.readShort();
                            }
                            if (z9) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jO), dVar2.f28678b));
                            }
                            if (jO > 0) {
                                if (z9) {
                                    str = "Skip jump into the IFD since its offset is invalid: " + jO;
                                    if (fVar.b() != -1) {
                                        str = str + " (total length: " + fVar.b() + ")";
                                    }
                                    Log.d("ExifInterface", str);
                                }
                            } else if (z9) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jO;
                                if (fVar.b() != -1) {
                                    str = str + " (total length: " + fVar.b() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                            fVar.y(jC);
                        } else {
                            unsignedShort = fVar.readUnsignedShort();
                        }
                        jO = unsignedShort;
                        if (z9) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jO), dVar2.f28678b));
                        }
                        if (jO > 0) {
                            if (z9) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jO;
                                if (fVar.b() != -1) {
                                    str = str + " (total length: " + fVar.b() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                        } else if (z9) {
                            str = "Skip jump into the IFD since its offset is invalid: " + jO;
                            if (fVar.b() != -1) {
                                str = str + " (total length: " + fVar.b() + ")";
                            }
                            Log.d("ExifInterface", str);
                        }
                        fVar.y(jC);
                    } else {
                        int iC2 = fVar.c() + this.f28659p;
                        byte[] bArr2 = new byte[(int) j8];
                        fVar.readFully(bArr2);
                        long j11 = iC2;
                        dVar3 = dVar2;
                        j9 = jC;
                        c cVar2 = new c(unsignedShort3, i11, j11, bArr2);
                        this.f28649f[i8].put(dVar3.f28678b, cVar2);
                        if ("DNGVersion".equals(dVar3.f28678b)) {
                            this.f28647d = 3;
                        }
                        if (!"Make".equals(dVar3.f28678b)) {
                        }
                        this.f28647d = 8;
                        if (fVar.c() != j9) {
                            fVar.y(j9);
                        }
                    }
                }
                s9 = (short) (s9 + 1);
                s8 = s8;
            } else if (z10) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            dVar = dVar4;
            j8 = 0;
            z8 = false;
            if (z8) {
                fVar.y(jC);
            } else {
                if (j8 > 4) {
                    i10 = fVar.readInt();
                    if (z10) {
                        Log.d("ExifInterface", "seek to data offset: " + i10);
                    }
                    if (this.f28647d == 7) {
                        z9 = z10;
                        dVar2 = dVar;
                        if ("MakerNote".equals(dVar2.f28678b)) {
                            this.f28660q = i10;
                        } else if (i8 != 6) {
                        }
                    } else {
                        z9 = z10;
                        dVar2 = dVar;
                    }
                    fVar.y(i10);
                } else {
                    z9 = z10;
                    jC = jC;
                    dVar2 = dVar;
                }
                num = (Integer) f28631o0.get(Integer.valueOf(unsignedShort2));
                if (z9) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j8);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == i9) {
                            jO = fVar.o();
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = fVar.readInt();
                        } else {
                            unsignedShort = fVar.readShort();
                        }
                        if (z9) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jO), dVar2.f28678b));
                        }
                        if (jO > 0) {
                            if (z9) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jO;
                                if (fVar.b() != -1) {
                                    str = str + " (total length: " + fVar.b() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                        } else if (z9) {
                            str = "Skip jump into the IFD since its offset is invalid: " + jO;
                            if (fVar.b() != -1) {
                                str = str + " (total length: " + fVar.b() + ")";
                            }
                            Log.d("ExifInterface", str);
                        }
                        fVar.y(jC);
                    } else {
                        unsignedShort = fVar.readUnsignedShort();
                    }
                    jO = unsignedShort;
                    if (z9) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jO), dVar2.f28678b));
                    }
                    if (jO > 0) {
                        if (z9) {
                            str = "Skip jump into the IFD since its offset is invalid: " + jO;
                            if (fVar.b() != -1) {
                                str = str + " (total length: " + fVar.b() + ")";
                            }
                            Log.d("ExifInterface", str);
                        }
                    } else if (z9) {
                        str = "Skip jump into the IFD since its offset is invalid: " + jO;
                        if (fVar.b() != -1) {
                            str = str + " (total length: " + fVar.b() + ")";
                        }
                        Log.d("ExifInterface", str);
                    }
                    fVar.y(jC);
                } else {
                    int iC3 = fVar.c() + this.f28659p;
                    byte[] bArr3 = new byte[(int) j8];
                    fVar.readFully(bArr3);
                    long j12 = iC3;
                    dVar3 = dVar2;
                    j9 = jC;
                    c cVar3 = new c(unsignedShort3, i11, j12, bArr3);
                    this.f28649f[i8].put(dVar3.f28678b, cVar3);
                    if ("DNGVersion".equals(dVar3.f28678b)) {
                        this.f28647d = 3;
                    }
                    if (!"Make".equals(dVar3.f28678b)) {
                    }
                    this.f28647d = 8;
                    if (fVar.c() != j9) {
                        fVar.y(j9);
                    }
                }
            }
            s9 = (short) (s9 + 1);
            s8 = s8;
        }
        int i12 = fVar.readInt();
        boolean z11 = f28638v;
        if (z11) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i12)));
        }
        long j13 = i12;
        if (j13 <= 0) {
            if (z11) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i12);
                return;
            }
            return;
        }
        if (this.f28650g.contains(Integer.valueOf(i12))) {
            if (z11) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i12);
                return;
            }
            return;
        }
        fVar.y(j13);
        if (this.f28649f[4].isEmpty()) {
            Q(fVar, 4);
        } else if (this.f28649f[5].isEmpty()) {
            Q(fVar, 5);
        }
    }

    public final void R(int i8, String str, String str2) {
        if (this.f28649f[i8].isEmpty() || this.f28649f[i8].get(str) == null) {
            return;
        }
        HashMap map = this.f28649f[i8];
        map.put(str2, (c) map.get(str));
        this.f28649f[i8].remove(str);
    }

    public final void S(f fVar, int i8) throws Throwable {
        c cVar = (c) this.f28649f[i8].get("ImageLength");
        c cVar2 = (c) this.f28649f[i8].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            c cVar3 = (c) this.f28649f[i8].get("JPEGInterchangeFormat");
            c cVar4 = (c) this.f28649f[i8].get("JPEGInterchangeFormatLength");
            if (cVar3 == null || cVar4 == null) {
                return;
            }
            int iM = cVar3.m(this.f28651h);
            int iM2 = cVar3.m(this.f28651h);
            fVar.y(iM);
            byte[] bArr = new byte[iM2];
            fVar.readFully(bArr);
            m(new b(bArr), iM, i8);
        }
    }

    public void T(String str, String str2) {
        d dVar;
        int i8;
        String str3;
        int i9;
        int i10;
        String str4 = str;
        String strReplaceAll = str2;
        if (str4 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str4)) {
            if (f28638v) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str4 = "PhotographicSensitivity";
        }
        int i11 = 2;
        String str5 = "/";
        int i12 = 1;
        if (strReplaceAll != null) {
            if (f28630n0.contains(str4) && !strReplaceAll.contains("/")) {
                try {
                    strReplaceAll = e.b(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
            } else if (str4.equals("GPSTimeStamp")) {
                Matcher matcher = f28636t0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else if ("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) {
                boolean zFind = f28637u0.matcher(strReplaceAll).find();
                boolean zFind2 = f28639v0.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                }
            }
        }
        int i13 = 0;
        if ("Xmp".equals(str4)) {
            boolean z8 = this.f28649f[0].containsKey("Xmp") || this.f28649f[5].containsKey("Xmp");
            int iW = w(this.f28647d);
            if ((iW == 2 && (this.f28663t != null || !z8)) || (iW == 3 && !z8)) {
                this.f28663t = strReplaceAll != null ? c.a(strReplaceAll) : null;
                return;
            }
        }
        int i14 = 0;
        while (i14 < f28626j0.length) {
            if ((i14 != 4 || this.f28652i) && (dVar = (d) f28629m0[i14].get(str4)) != null) {
                if (strReplaceAll != null) {
                    Pair pairX = x(strReplaceAll);
                    if (dVar.f28679c == ((Integer) pairX.first).intValue() || dVar.f28679c == ((Integer) pairX.second).intValue()) {
                        i8 = dVar.f28679c;
                    } else {
                        int i15 = dVar.f28680d;
                        if (i15 == -1 || !(i15 == ((Integer) pairX.first).intValue() || dVar.f28680d == ((Integer) pairX.second).intValue())) {
                            int i16 = dVar.f28679c;
                            if (i16 == i12 || i16 == 7 || i16 == i11) {
                                i8 = i16;
                            } else if (f28638v) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Given tag (");
                                sb.append(str4);
                                sb.append(") value didn't match with one of expected formats: ");
                                String[] strArr = f28613W;
                                sb.append(strArr[dVar.f28679c]);
                                sb.append(dVar.f28680d == -1 ? "" : ", " + strArr[dVar.f28680d]);
                                sb.append(" (guess: ");
                                sb.append(strArr[((Integer) pairX.first).intValue()]);
                                sb.append(((Integer) pairX.second).intValue() != -1 ? ", " + strArr[((Integer) pairX.second).intValue()] : "");
                                sb.append(")");
                                Log.d("ExifInterface", sb.toString());
                            }
                        } else {
                            i8 = dVar.f28680d;
                        }
                    }
                    switch (i8) {
                        case 1:
                            str3 = str5;
                            i9 = i12;
                            i10 = i13;
                            this.f28649f[i14].put(str4, c.a(strReplaceAll));
                            break;
                        case 2:
                        case 7:
                            str3 = str5;
                            i9 = i12;
                            i10 = i13;
                            this.f28649f[i14].put(str4, c.e(strReplaceAll));
                            break;
                        case 3:
                            str3 = str5;
                            i9 = i12;
                            i10 = i13;
                            String[] strArrSplit = strReplaceAll.split(com.amazon.a.a.o.b.f.f16777a, -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i17 = i10; i17 < strArrSplit.length; i17++) {
                                iArr[i17] = Integer.parseInt(strArrSplit[i17]);
                            }
                            this.f28649f[i14].put(str4, c.k(iArr, this.f28651h));
                            break;
                        case 4:
                            str3 = str5;
                            i9 = i12;
                            i10 = i13;
                            String[] strArrSplit2 = strReplaceAll.split(com.amazon.a.a.o.b.f.f16777a, -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i18 = i10; i18 < strArrSplit2.length; i18++) {
                                jArr[i18] = Long.parseLong(strArrSplit2[i18]);
                            }
                            this.f28649f[i14].put(str4, c.g(jArr, this.f28651h));
                            break;
                        case 5:
                            i9 = i12;
                            i10 = i13;
                            String[] strArrSplit3 = strReplaceAll.split(com.amazon.a.a.o.b.f.f16777a, -1);
                            e[] eVarArr = new e[strArrSplit3.length];
                            int i19 = i10;
                            while (i19 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i19].split(str5, -1);
                                eVarArr[i19] = new e((long) Double.parseDouble(strArrSplit4[i10]), (long) Double.parseDouble(strArrSplit4[i9]), null);
                                i19++;
                                str5 = str5;
                            }
                            str3 = str5;
                            this.f28649f[i14].put(str4, c.i(eVarArr, this.f28651h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f28638v) {
                                Log.d("ExifInterface", "Data format isn't one of expected formats: " + i8);
                            }
                            break;
                        case 9:
                            i9 = i12;
                            i10 = i13;
                            String[] strArrSplit5 = strReplaceAll.split(com.amazon.a.a.o.b.f.f16777a, -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i20 = i10; i20 < strArrSplit5.length; i20++) {
                                iArr2[i20] = Integer.parseInt(strArrSplit5[i20]);
                            }
                            this.f28649f[i14].put(str4, c.c(iArr2, this.f28651h));
                            str3 = str5;
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(com.amazon.a.a.o.b.f.f16777a, -1);
                            e[] eVarArr2 = new e[strArrSplit6.length];
                            int i21 = i13;
                            while (i21 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i21].split(str5, -1);
                                int i22 = i12;
                                int i23 = i21;
                                eVarArr2[i23] = new e((long) Double.parseDouble(strArrSplit7[i13]), (long) Double.parseDouble(strArrSplit7[i22]), null);
                                i21 = i23 + 1;
                                i12 = i22;
                                strArrSplit6 = strArrSplit6;
                                i13 = i13;
                            }
                            i9 = i12;
                            i10 = i13;
                            this.f28649f[i14].put(str4, c.d(eVarArr2, this.f28651h));
                            str3 = str5;
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(com.amazon.a.a.o.b.f.f16777a, -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i24 = i13; i24 < strArrSplit8.length; i24++) {
                                dArr[i24] = Double.parseDouble(strArrSplit8[i24]);
                            }
                            this.f28649f[i14].put(str4, c.b(dArr, this.f28651h));
                            break;
                    }
                } else {
                    this.f28649f[i14].remove(str4);
                }
                str3 = str5;
                i9 = i12;
                i10 = i13;
            } else {
                str3 = str5;
                i9 = i12;
                i10 = i13;
            }
            i14++;
            i12 = i9;
            i13 = i10;
            str5 = str3;
            i11 = 2;
        }
    }

    public final void U(b bVar) throws Throwable {
        HashMap map = this.f28649f[4];
        c cVar = (c) map.get("Compression");
        if (cVar == null) {
            this.f28658o = 6;
            y(bVar, map);
            return;
        }
        int iM = cVar.m(this.f28651h);
        this.f28658o = iM;
        if (iM != 1) {
            if (iM == 6) {
                y(bVar, map);
                return;
            } else if (iM != 7) {
                return;
            }
        }
        if (I(map)) {
            z(bVar, map);
        }
    }

    public final void W(int i8, int i9) throws Throwable {
        if (this.f28649f[i8].isEmpty() || this.f28649f[i9].isEmpty()) {
            if (f28638v) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) this.f28649f[i8].get("ImageLength");
        c cVar2 = (c) this.f28649f[i8].get("ImageWidth");
        c cVar3 = (c) this.f28649f[i9].get("ImageLength");
        c cVar4 = (c) this.f28649f[i9].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (f28638v) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (f28638v) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM = cVar.m(this.f28651h);
        int iM2 = cVar2.m(this.f28651h);
        int iM3 = cVar3.m(this.f28651h);
        int iM4 = cVar4.m(this.f28651h);
        if (iM >= iM3 || iM2 >= iM4) {
            return;
        }
        HashMap[] mapArr = this.f28649f;
        HashMap map = mapArr[i8];
        mapArr[i8] = mapArr[i9];
        mapArr[i9] = map;
    }

    public final void Y(f fVar, int i8) throws Throwable {
        c cVarJ;
        c cVarJ2;
        c cVar = (c) this.f28649f[i8].get("DefaultCropSize");
        c cVar2 = (c) this.f28649f[i8].get("SensorTopBorder");
        c cVar3 = (c) this.f28649f[i8].get("SensorLeftBorder");
        c cVar4 = (c) this.f28649f[i8].get("SensorBottomBorder");
        c cVar5 = (c) this.f28649f[i8].get("SensorRightBorder");
        if (cVar == null) {
            if (cVar2 == null || cVar3 == null || cVar4 == null || cVar5 == null) {
                S(fVar, i8);
                return;
            }
            int iM = cVar2.m(this.f28651h);
            int iM2 = cVar4.m(this.f28651h);
            int iM3 = cVar5.m(this.f28651h);
            int iM4 = cVar3.m(this.f28651h);
            if (iM2 <= iM || iM3 <= iM4) {
                return;
            }
            c cVarJ3 = c.j(iM2 - iM, this.f28651h);
            c cVarJ4 = c.j(iM3 - iM4, this.f28651h);
            this.f28649f[i8].put("ImageLength", cVarJ3);
            this.f28649f[i8].put("ImageWidth", cVarJ4);
            return;
        }
        if (cVar.f28673a == 5) {
            e[] eVarArr = (e[]) cVar.o(this.f28651h);
            if (eVarArr == null || eVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                return;
            }
            cVarJ = c.h(eVarArr[0], this.f28651h);
            cVarJ2 = c.h(eVarArr[1], this.f28651h);
        } else {
            int[] iArr = (int[]) cVar.o(this.f28651h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            cVarJ = c.j(iArr[0], this.f28651h);
            cVarJ2 = c.j(iArr[1], this.f28651h);
        }
        this.f28649f[i8].put("ImageWidth", cVarJ);
        this.f28649f[i8].put("ImageLength", cVarJ2);
    }

    public final void Z() throws Throwable {
        W(0, 5);
        W(0, 4);
        W(5, 4);
        c cVar = (c) this.f28649f[1].get("PixelXDimension");
        c cVar2 = (c) this.f28649f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f28649f[0].put("ImageWidth", cVar);
            this.f28649f[0].put("ImageLength", cVar2);
        }
        if (this.f28649f[4].isEmpty() && J(this.f28649f[5])) {
            HashMap[] mapArr = this.f28649f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!J(this.f28649f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        R(0, "ThumbnailOrientation", "Orientation");
        R(0, "ThumbnailImageLength", "ImageLength");
        R(0, "ThumbnailImageWidth", "ImageWidth");
        R(5, "ThumbnailOrientation", "Orientation");
        R(5, "ThumbnailImageLength", "ImageLength");
        R(5, "ThumbnailImageWidth", "ImageWidth");
        R(4, "Orientation", "ThumbnailOrientation");
        R(4, "ImageLength", "ThumbnailImageLength");
        R(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public double g(double d8) {
        double dI = i("GPSAltitude", -1.0d);
        int iJ = j("GPSAltitudeRef", -1);
        if (dI < 0.0d || iJ < 0) {
            return d8;
        }
        return dI * ((double) (iJ != 1 ? 1 : -1));
    }

    public String h(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarK = k(str);
        if (cVarK == null) {
            return null;
        }
        if (!str.equals("GPSTimeStamp")) {
            if (!f28630n0.contains(str)) {
                return cVarK.n(this.f28651h);
            }
            try {
                return Double.toString(cVarK.l(this.f28651h));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i8 = cVarK.f28673a;
        if (i8 != 5 && i8 != 10) {
            Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + cVarK.f28673a);
            return null;
        }
        e[] eVarArr = (e[]) cVarK.o(this.f28651h);
        if (eVarArr == null || eVarArr.length != 3) {
            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
            return null;
        }
        e eVar = eVarArr[0];
        Integer numValueOf = Integer.valueOf((int) (eVar.f28681a / eVar.f28682b));
        e eVar2 = eVarArr[1];
        Integer numValueOf2 = Integer.valueOf((int) (eVar2.f28681a / eVar2.f28682b));
        e eVar3 = eVarArr[2];
        return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f28681a / eVar3.f28682b)));
    }

    public double i(String str, double d8) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarK = k(str);
        if (cVarK != null) {
            try {
                return cVarK.l(this.f28651h);
            } catch (NumberFormatException unused) {
            }
        }
        return d8;
    }

    public int j(String str, int i8) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarK = k(str);
        if (cVarK != null) {
            try {
                return cVarK.m(this.f28651h);
            } catch (NumberFormatException unused) {
            }
        }
        return i8;
    }

    public final c k(String str) {
        c cVar;
        c cVar2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f28638v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && w(this.f28647d) == 2 && (cVar2 = this.f28663t) != null) {
            return cVar2;
        }
        for (int i8 = 0; i8 < f28626j0.length; i8++) {
            c cVar3 = (c) this.f28649f[i8].get(str);
            if (cVar3 != null) {
                return cVar3;
            }
        }
        if (!"Xmp".equals(str) || (cVar = this.f28663t) == null) {
            return null;
        }
        return cVar;
    }

    public final void l(f fVar, int i8) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i9;
        int i10 = Build.VERSION.SDK_INT;
        if (i8 == 15 && i10 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                k2.b.a.a(mediaMetadataRetriever, new C0623a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f28649f[0].put("ImageWidth", c.j(Integer.parseInt(strExtractMetadata), this.f28651h));
                }
                if (strExtractMetadata3 != null) {
                    this.f28649f[0].put("ImageLength", c.j(Integer.parseInt(strExtractMetadata3), this.f28651h));
                }
                if (strExtractMetadata2 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata2);
                    if (i11 == 90) {
                        i9 = 6;
                    } else if (i11 != 180) {
                        i9 = i11 != 270 ? 1 : 8;
                    } else {
                        i9 = 3;
                    }
                    this.f28649f[0].put("Orientation", c.j(i9, this.f28651h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata4);
                    int i13 = Integer.parseInt(strExtractMetadata5);
                    if (i13 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.y(i12);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i14 = i12 + 6;
                    int i15 = i13 - 6;
                    if (!Arrays.equals(bArr, f28633q0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i15];
                    fVar.readFully(bArr2);
                    this.f28659p = i14;
                    P(bArr2, 0);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i16 = Integer.parseInt(strExtractMetadata8);
                    int i17 = Integer.parseInt(strExtractMetadata9);
                    long j8 = i16;
                    fVar.y(j8);
                    byte[] bArr3 = new byte[i17];
                    fVar.readFully(bArr3);
                    this.f28663t = new c(1, i17, j8, bArr3);
                    this.f28664u = true;
                }
                if (f28638v) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e8) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e8);
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
                throw th;
            } catch (IOException unused2) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b9 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00df  */
    /* JADX WARN: Code duplicated, block: B:57:0x015c A[LOOP:0: B:10:0x0037->B:57:0x015c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00ab. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00ae. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x00b1. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void m(k2.a.b r20, int r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p093k2.a.m(k2.a$b, int, int):void");
    }

    public double[] n() {
        String strH = h("GPSLatitude");
        String strH2 = h("GPSLatitudeRef");
        String strH3 = h("GPSLongitude");
        String strH4 = h("GPSLongitudeRef");
        if (strH == null || strH2 == null || strH3 == null || strH4 == null) {
            return null;
        }
        try {
            return new double[]{f(strH, strH2), f(strH3, strH4)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", strH, strH2, strH3, strH4));
            return null;
        }
    }

    public final int o(BufferedInputStream bufferedInputStream) throws Throwable {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (C(bArr)) {
            return 4;
        }
        if (F(bArr)) {
            return 9;
        }
        int iB = B(bArr);
        if (iB != 0) {
            return iB;
        }
        if (D(bArr)) {
            return 7;
        }
        if (G(bArr)) {
            return 10;
        }
        if (E(bArr)) {
            return 13;
        }
        return K(bArr) ? 14 : 0;
    }

    public final void p(f fVar) throws Throwable {
        int i8;
        int i9;
        s(fVar);
        c cVar = (c) this.f28649f[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f28676d);
            fVar2.t(this.f28651h);
            byte[] bArr = f28598H;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.y(0L);
            byte[] bArr3 = f28599I;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.y(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.y(12L);
            }
            Q(fVar2, 6);
            c cVar2 = (c) this.f28649f[7].get("PreviewImageStart");
            c cVar3 = (c) this.f28649f[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f28649f[5].put("JPEGInterchangeFormat", cVar2);
                this.f28649f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) this.f28649f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.o(this.f28651h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i10 = iArr[2];
                int i11 = iArr[0];
                if (i10 <= i11 || (i8 = iArr[3]) <= (i9 = iArr[1])) {
                    return;
                }
                int i12 = (i10 - i11) + 1;
                int i13 = (i8 - i9) + 1;
                if (i12 < i13) {
                    int i14 = i12 + i13;
                    i13 = i14 - i13;
                    i12 = i14 - i13;
                }
                c cVarJ = c.j(i12, this.f28651h);
                c cVarJ2 = c.j(i13, this.f28651h);
                this.f28649f[0].put("ImageWidth", cVarJ);
                this.f28649f[0].put("ImageLength", cVarJ2);
            }
        }
    }

    public final void q(b bVar) throws Throwable {
        if (f28638v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.t(ByteOrder.BIG_ENDIAN);
        int iC = bVar.c();
        bVar.v(f28600J.length);
        boolean z8 = false;
        boolean z9 = false;
        while (true) {
            if (z8 && z9) {
                break;
            }
            try {
                int i8 = bVar.readInt();
                int i9 = bVar.readInt();
                int iC2 = bVar.c() + i8 + 4;
                if (bVar.c() - iC == 16 && i9 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i9 == 1229278788) {
                    break;
                }
                if (i9 == 1700284774 && !z8) {
                    this.f28659p = bVar.c() - iC;
                    byte[] bArr = new byte[i8];
                    bVar.readFully(bArr);
                    int i10 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    X(crc32, i9);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i10) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i10 + ", calculated CRC value: " + crc32.getValue());
                    }
                    P(bArr, 0);
                    Z();
                    U(new b(bArr));
                    z8 = true;
                } else if (i9 == 1767135348 && !z9) {
                    byte[] bArr2 = f28601K;
                    if (i8 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int iC3 = bVar.c() - iC;
                            int i11 = i8 - length;
                            byte[] bArr4 = new byte[i11];
                            bVar.readFully(bArr4);
                            this.f28663t = new c(1, i11, iC3, bArr4);
                            z9 = true;
                        }
                    }
                }
                bVar.v(iC2 - bVar.c());
            } catch (EOFException e8) {
                throw new IOException("Encountered corrupt PNG file.", e8);
            }
        }
        this.f28664u = z9;
    }

    public final void r(b bVar) throws Throwable {
        boolean z8 = f28638v;
        if (z8) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.v(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i8 = ByteBuffer.wrap(bArr).getInt();
        int i9 = ByteBuffer.wrap(bArr2).getInt();
        int i10 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i9];
        bVar.v(i8 - bVar.c());
        bVar.readFully(bArr4);
        m(new b(bArr4), i8, 5);
        bVar.v(i10 - bVar.c());
        bVar.t(ByteOrder.BIG_ENDIAN);
        int i11 = bVar.readInt();
        if (z8) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i11);
        }
        for (int i12 = 0; i12 < i11; i12++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f28621e0.f28677a) {
                short s8 = bVar.readShort();
                short s9 = bVar.readShort();
                c cVarJ = c.j(s8, this.f28651h);
                c cVarJ2 = c.j(s9, this.f28651h);
                this.f28649f[0].put("ImageLength", cVarJ);
                this.f28649f[0].put("ImageWidth", cVarJ2);
                if (f28638v) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s8) + ", width: " + ((int) s9));
                    return;
                }
                return;
            }
            bVar.v(unsignedShort2);
        }
    }

    public final void s(f fVar) throws Throwable {
        c cVar;
        M(fVar);
        Q(fVar, 0);
        Y(fVar, 0);
        Y(fVar, 5);
        Y(fVar, 4);
        Z();
        if (this.f28647d != 8 || (cVar = (c) this.f28649f[1].get("MakerNote")) == null) {
            return;
        }
        f fVar2 = new f(cVar.f28676d);
        fVar2.t(this.f28651h);
        fVar2.v(6);
        Q(fVar2, 9);
        c cVar2 = (c) this.f28649f[9].get("ColorSpace");
        if (cVar2 != null) {
            this.f28649f[1].put("ColorSpace", cVar2);
        }
    }

    public final void t(f fVar) throws Throwable {
        if (f28638v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        s(fVar);
        c cVar = (c) this.f28649f[0].get("JpgFromRaw");
        if (cVar != null) {
            m(new b(cVar.f28676d), (int) cVar.f28675c, 5);
        }
        c cVar2 = (c) this.f28649f[0].get("ISO");
        c cVar3 = (c) this.f28649f[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        this.f28649f[1].put("PhotographicSensitivity", cVar2);
    }

    public final boolean u(f fVar) throws IOException {
        byte[] bArr = f28633q0;
        byte[] bArr2 = new byte[bArr.length];
        fVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrJ = fVar.j();
        this.f28659p = bArr.length;
        P(bArrJ, 0);
        return true;
    }

    public final void v(b bVar) throws Throwable {
        if (f28638v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.t(ByteOrder.LITTLE_ENDIAN);
        bVar.v(f28602L.length);
        int i8 = bVar.readInt() + 8;
        byte[] bArr = f28603M;
        bVar.v(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i9 = bVar.readInt();
                int i10 = length + 8;
                if (Arrays.equals(f28604N, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i9];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f28633q0;
                    if (p093k2.b.d(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i9);
                    }
                    this.f28659p = i10;
                    P(bArrCopyOfRange, 0);
                    U(new b(bArrCopyOfRange));
                    return;
                }
                if (i9 % 2 == 1) {
                    i9++;
                }
                length = i10 + i9;
                if (length == i8) {
                    return;
                }
                if (length > i8) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.v(i9);
            } catch (EOFException e8) {
                throw new IOException("Encountered corrupt WebP file.", e8);
            }
        }
    }

    public final void z(b bVar, HashMap map) throws IOException {
        int i8;
        c cVar = (c) map.get("StripOffsets");
        c cVar2 = (c) map.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] jArrC = p093k2.b.c(cVar.o(this.f28651h));
        long[] jArrC2 = p093k2.b.c(cVar2.o(this.f28651h));
        if (jArrC == null || jArrC.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrC2 == null || jArrC2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrC.length != jArrC2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j8 = 0;
        for (long j9 : jArrC2) {
            j8 += j9;
        }
        int i9 = (int) j8;
        byte[] bArr = new byte[i9];
        int i10 = 1;
        this.f28654k = true;
        this.f28653j = true;
        this.f28652i = true;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < jArrC.length) {
            int i14 = (int) jArrC[i11];
            int i15 = (int) jArrC2[i11];
            if (i11 < jArrC.length - i10) {
                i8 = i11;
                if (i14 + i15 != jArrC[i8 + 1]) {
                    this.f28654k = false;
                }
            } else {
                i8 = i11;
            }
            int i16 = i14 - i12;
            if (i16 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                bVar.v(i16);
                int i17 = i12 + i16;
                byte[] bArr2 = new byte[i15];
                try {
                    bVar.readFully(bArr2);
                    i12 = i17 + i15;
                    System.arraycopy(bArr2, 0, bArr, i13, i15);
                    i13 += i15;
                    i11 = i8 + 1;
                    i10 = 1;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", "Failed to read " + i15 + " bytes.");
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", "Failed to skip " + i16 + " bytes.");
                return;
            }
        }
        this.f28657n = bArr;
        if (this.f28654k) {
            this.f28655l = (int) jArrC[0];
            this.f28656m = i9;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataInputStream f28668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f28669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ByteOrder f28670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f28671d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f28672e;

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f28672e = bArr.length;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f28668a.available();
        }

        public int b() {
            return this.f28672e;
        }

        public int c() {
            return this.f28669b;
        }

        public byte[] j() throws IOException {
            byte[] bArrCopyOf = new byte[1024];
            int i8 = 0;
            while (true) {
                if (i8 == bArrCopyOf.length) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                }
                int i9 = this.f28668a.read(bArrCopyOf, i8, bArrCopyOf.length - i8);
                if (i9 == -1) {
                    return Arrays.copyOf(bArrCopyOf, i8);
                }
                i8 += i9;
                this.f28669b += i9;
            }
        }

        @Override // java.io.InputStream
        public void mark(int i8) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public long o() {
            return ((long) readInt()) & 4294967295L;
        }

        @Override // java.io.InputStream
        public int read() {
            this.f28669b++;
            return this.f28668a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f28669b++;
            return this.f28668a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f28669b++;
            int i8 = this.f28668a.read();
            if (i8 >= 0) {
                return (byte) i8;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f28669b += 2;
            return this.f28668a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i8, int i9) throws IOException {
            this.f28669b += i9;
            this.f28668a.readFully(bArr, i8, i9);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f28669b += 4;
            int i8 = this.f28668a.read();
            int i9 = this.f28668a.read();
            int i10 = this.f28668a.read();
            int i11 = this.f28668a.read();
            if ((i8 | i9 | i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f28670c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i11 << 24) + (i10 << 16) + (i9 << 8) + i8;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i8 << 24) + (i9 << 16) + (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f28670c);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f28669b += 8;
            int i8 = this.f28668a.read();
            int i9 = this.f28668a.read();
            int i10 = this.f28668a.read();
            int i11 = this.f28668a.read();
            int i12 = this.f28668a.read();
            int i13 = this.f28668a.read();
            int i14 = this.f28668a.read();
            int i15 = this.f28668a.read();
            if ((i8 | i9 | i10 | i11 | i12 | i13 | i14 | i15) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f28670c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) i15) << 56) + (((long) i14) << 48) + (((long) i13) << 40) + (((long) i12) << 32) + (((long) i11) << 24) + (((long) i10) << 16) + (((long) i9) << 8) + ((long) i8);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i8) << 56) + (((long) i9) << 48) + (((long) i10) << 40) + (((long) i11) << 32) + (((long) i12) << 24) + (((long) i13) << 16) + (((long) i14) << 8) + ((long) i15);
            }
            throw new IOException("Invalid byte order: " + this.f28670c);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f28669b += 2;
            int i8 = this.f28668a.read();
            int i9 = this.f28668a.read();
            if ((i8 | i9) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f28670c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i9 << 8) + i8);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i8 << 8) + i9);
            }
            throw new IOException("Invalid byte order: " + this.f28670c);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f28669b += 2;
            return this.f28668a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f28669b++;
            return this.f28668a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f28669b += 2;
            int i8 = this.f28668a.read();
            int i9 = this.f28668a.read();
            if ((i8 | i9) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f28670c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i9 << 8) + i8;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i8 << 8) + i9;
            }
            throw new IOException("Invalid byte order: " + this.f28670c);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i8) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public void t(ByteOrder byteOrder) {
            this.f28670c = byteOrder;
        }

        public void v(int i8) throws IOException {
            int i9 = 0;
            while (i9 < i8) {
                int i10 = i8 - i9;
                int iSkip = (int) this.f28668a.skip(i10);
                if (iSkip <= 0) {
                    if (this.f28671d == null) {
                        this.f28671d = new byte[8192];
                    }
                    iSkip = this.f28668a.read(this.f28671d, 0, Math.min(8192, i10));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i8 + " bytes.");
                    }
                }
                i9 += iSkip;
            }
            this.f28669b += i9;
        }

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) throws IOException {
            int i10 = this.f28668a.read(bArr, i8, i9);
            this.f28669b += i10;
            return i10;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f28669b += bArr.length;
            this.f28668a.readFully(bArr);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f28668a = dataInputStream;
            dataInputStream.mark(0);
            this.f28669b = 0;
            this.f28670c = byteOrder;
            this.f28672e = inputStream instanceof b ? ((b) inputStream).b() : -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class f extends b {
        public f(byte[] bArr) {
            super(bArr);
            this.f28668a.mark(Integer.MAX_VALUE);
        }

        public void y(long j8) throws IOException {
            int i8 = this.f28669b;
            if (i8 > j8) {
                this.f28669b = 0;
                this.f28668a.reset();
            } else {
                j8 -= (long) i8;
            }
            v((int) j8);
        }

        public f(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f28668a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public final void e() {
        String strH = h("DateTimeOriginal");
        if (strH != null && h("DateTime") == null) {
            this.f28649f[0].put("DateTime", c.e(strH));
        }
        if (h("ImageWidth") == null) {
            this.f28649f[0].put("ImageWidth", c.f(0L, this.f28651h));
        }
        String str = kDsnNkYbBsI.DWbaPAC;
        if (h(str) == null) {
            this.f28649f[0].put(str, c.f(0L, this.f28651h));
        }
        if (h("Orientation") == null) {
            this.f28649f[0].put("Orientation", c.f(0L, this.f28651h));
        }
        if (h("LightSource") == null) {
            this.f28649f[1].put("LightSource", c.f(0L, this.f28651h));
        }
    }

    public final void y(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get(ajyWhveMDgQ.KGVeUPOC);
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int iM = cVar.m(this.f28651h);
        int iM2 = cVar2.m(this.f28651h);
        if (this.f28647d == 7) {
            iM += this.f28660q;
        }
        if (iM > 0 && iM2 > 0) {
            this.f28652i = true;
            if (this.f28644a == null && this.f28646c == null && this.f28645b == null) {
                byte[] bArr = new byte[iM2];
                bVar.v(iM);
                bVar.readFully(bArr);
                this.f28657n = bArr;
            }
            this.f28655l = iM;
            this.f28656m = iM2;
        }
        if (f28638v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM + ", length: " + iM2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f28677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f28678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f28679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f28680d;

        public d(String str, int i8, int i9) {
            this.f28678b = str;
            this.f28677a = i8;
            this.f28679c = i9;
            this.f28680d = -1;
        }

        public boolean a(int i8) {
            int i9;
            int i10 = this.f28679c;
            if (i10 == 7 || i8 == 7 || i10 == i8 || (i9 = this.f28680d) == i8) {
                return true;
            }
            if ((i10 == 4 || i9 == 4) && i8 == 3) {
                return true;
            }
            if ((i10 == 9 || i9 == 9) && i8 == 8) {
                return true;
            }
            return (i10 == 12 || i9 == 12) && i8 == 11;
        }

        public d(String str, int i8, int i9, int i10) {
            this.f28678b = str;
            this.f28677a = i8;
            this.f28679c = i9;
            this.f28680d = i10;
        }
    }

    public a(String str) throws Throwable {
        d[][] dVarArr = f28626j0;
        this.f28649f = new HashMap[dVarArr.length];
        this.f28650g = new HashSet(dVarArr.length);
        this.f28651h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            A(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public a(FileDescriptor fileDescriptor) throws Throwable {
        boolean z8;
        FileInputStream fileInputStream;
        Throwable th;
        d[][] dVarArr = f28626j0;
        this.f28649f = new HashMap[dVarArr.length];
        this.f28650g = new HashSet(dVarArr.length);
        this.f28651h = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f28646c = null;
            this.f28644a = null;
            if (H(fileDescriptor)) {
                this.f28645b = fileDescriptor;
                try {
                    fileDescriptor = Os.dup(fileDescriptor);
                    z8 = true;
                } catch (Exception e8) {
                    throw new IOException("Failed to duplicate file descriptor", e8);
                }
            } else {
                this.f28645b = null;
                z8 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    L(fileInputStream);
                    p093k2.b.b(fileInputStream);
                    if (z8) {
                        p093k2.b.a(fileDescriptor);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    p093k2.b.b(fileInputStream);
                    if (z8) {
                        p093k2.b.a(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                fileInputStream = null;
                th = th3;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    /* JADX INFO: renamed from: k2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class C0623a extends MediaDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f28665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f28666b;

        public C0623a(f fVar) {
            this.f28666b = fVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j8, byte[] bArr, int i8, int i9) {
            if (i9 == 0) {
                return 0;
            }
            if (j8 < 0) {
                return -1;
            }
            try {
                long j9 = this.f28665a;
                if (j9 != j8) {
                    if (j9 >= 0 && j8 >= j9 + ((long) this.f28666b.available())) {
                        return -1;
                    }
                    this.f28666b.y(j8);
                    this.f28665a = j8;
                }
                if (i9 > this.f28666b.available()) {
                    i9 = this.f28666b.available();
                }
                int i10 = this.f28666b.read(bArr, i8, i9);
                if (i10 >= 0) {
                    this.f28665a += (long) i10;
                    return i10;
                }
            } catch (IOException unused) {
            }
            this.f28665a = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    public a(InputStream inputStream, int i8) {
        d[][] dVarArr = f28626j0;
        this.f28649f = new HashMap[dVarArr.length];
        this.f28650g = new HashSet(dVarArr.length);
        this.f28651h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f28644a = null;
            boolean z8 = i8 == 1;
            this.f28648e = z8;
            if (z8) {
                this.f28646c = null;
                this.f28645b = null;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f28646c = (AssetManager.AssetInputStream) inputStream;
                this.f28645b = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (H(fileInputStream.getFD())) {
                    this.f28646c = null;
                    this.f28645b = fileInputStream.getFD();
                } else {
                    this.f28646c = null;
                    this.f28645b = null;
                }
            } else {
                this.f28646c = null;
                this.f28645b = null;
            }
            L(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
