package J7;

import D6.C0933m;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2633k;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class h implements Serializable, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f4388d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f4389e = new h(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f4391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient String f4392c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public static /* synthetic */ h f(a aVar, byte[] bArr, int i8, int i9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i8 = 0;
            }
            if ((i10 & 2) != 0) {
                i9 = AbstractC1031b.c();
            }
            return aVar.e(bArr, i8, i9);
        }

        public final h a(String str) {
            kotlin.jvm.internal.t.g(str, "<this>");
            byte[] bArrA = AbstractC1030a.a(str);
            if (bArrA != null) {
                return new h(bArrA);
            }
            return null;
        }

        public final h b(String str) {
            kotlin.jvm.internal.t.g(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i8 = 0; i8 < length; i8++) {
                int i9 = i8 * 2;
                bArr[i8] = (byte) ((K7.b.e(str.charAt(i9)) << 4) + K7.b.e(str.charAt(i9 + 1)));
            }
            return new h(bArr);
        }

        public final h c(String str, Charset charset) {
            kotlin.jvm.internal.t.g(str, "<this>");
            kotlin.jvm.internal.t.g(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.t.f(bytes, "getBytes(...)");
            return new h(bytes);
        }

        public final h d(String str) {
            kotlin.jvm.internal.t.g(str, "<this>");
            h hVar = new h(F.a(str));
            hVar.E(str);
            return hVar;
        }

        public final h e(byte[] bArr, int i8, int i9) {
            kotlin.jvm.internal.t.g(bArr, "<this>");
            int iF = AbstractC1031b.f(bArr, i9);
            AbstractC1031b.b(bArr.length, i8, iF);
            return new h(C0933m.n(bArr, i8, iF + i8));
        }

        public a() {
        }
    }

    public h(byte[] data) {
        kotlin.jvm.internal.t.g(data, "data");
        this.f4390a = data;
    }

    public static final h d(String str) {
        return f4388d.d(str);
    }

    public final h A() {
        return c("MD5");
    }

    public boolean B(int i8, h other, int i9, int i10) {
        kotlin.jvm.internal.t.g(other, "other");
        return other.C(i9, j(), i8, i10);
    }

    public boolean C(int i8, byte[] other, int i9, int i10) {
        kotlin.jvm.internal.t.g(other, "other");
        return i8 >= 0 && i8 <= j().length - i10 && i9 >= 0 && i9 <= other.length - i10 && AbstractC1031b.a(j(), i8, other, i9, i10);
    }

    public final void D(int i8) {
        this.f4391b = i8;
    }

    public final void E(String str) {
        this.f4392c = str;
    }

    public final h F() {
        return c("SHA-1");
    }

    public final h G() {
        return c("SHA-256");
    }

    public final int H() {
        return v();
    }

    public final boolean I(h prefix) {
        kotlin.jvm.internal.t.g(prefix, "prefix");
        return B(0, prefix, 0, prefix.H());
    }

    public h J() {
        for (int i8 = 0; i8 < j().length; i8++) {
            byte b8 = j()[i8];
            if (b8 >= 65 && b8 <= 90) {
                byte[] bArrJ = j();
                byte[] bArrCopyOf = Arrays.copyOf(bArrJ, bArrJ.length);
                kotlin.jvm.internal.t.f(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i8] = (byte) (b8 + 32);
                for (int i9 = i8 + 1; i9 < bArrCopyOf.length; i9++) {
                    byte b9 = bArrCopyOf[i9];
                    if (b9 >= 65 && b9 <= 90) {
                        bArrCopyOf[i9] = (byte) (b9 + 32);
                    }
                }
                return new h(bArrCopyOf);
            }
        }
        return this;
    }

    public String L() {
        String strW = w();
        if (strW != null) {
            return strW;
        }
        String strB = F.b(y());
        E(strB);
        return strB;
    }

    public void M(C1034e buffer, int i8, int i9) {
        kotlin.jvm.internal.t.g(buffer, "buffer");
        K7.b.d(this, buffer, i8, i9);
    }

    public String a() {
        return AbstractC1030a.c(j(), null, 1, null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(h other) {
        kotlin.jvm.internal.t.g(other, "other");
        int iH = H();
        int iH2 = other.H();
        int iMin = Math.min(iH, iH2);
        for (int i8 = 0; i8 < iMin; i8++) {
            int iE = e(i8) & 255;
            int iE2 = other.e(i8) & 255;
            if (iE != iE2) {
                return iE < iE2 ? -1 : 1;
            }
        }
        if (iH == iH2) {
            return 0;
        }
        return iH < iH2 ? -1 : 1;
    }

    public h c(String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.t.g(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f4390a, 0, H());
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.t.d(bArrDigest);
        return new h(bArrDigest);
    }

    public final byte e(int i8) {
        return z(i8);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.H() == j().length && hVar.C(0, j(), 0, j().length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iT = t();
        if (iT != 0) {
            return iT;
        }
        int iHashCode = Arrays.hashCode(j());
        D(iHashCode);
        return iHashCode;
    }

    public final byte[] j() {
        return this.f4390a;
    }

    public final int t() {
        return this.f4391b;
    }

    public String toString() {
        if (j().length == 0) {
            return "[size=0]";
        }
        int iC = K7.b.c(j(), 64);
        if (iC != -1) {
            String strL = L();
            String strSubstring = strL.substring(0, iC);
            kotlin.jvm.internal.t.f(strSubstring, "substring(...)");
            String strD = Z6.v.D(Z6.v.D(Z6.v.D(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iC >= strL.length()) {
                return "[text=" + strD + ']';
            }
            return "[size=" + j().length + " text=" + strD + "…]";
        }
        if (j().length <= 64) {
            return "[hex=" + x() + ']';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[size=");
        sb.append(j().length);
        sb.append(" hex=");
        int iE = AbstractC1031b.e(this, 64);
        if (iE <= j().length) {
            if (iE < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            sb.append((iE == j().length ? this : new h(C0933m.n(j(), 0, iE))).x());
            sb.append("…]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + j().length + ')').toString());
    }

    public int v() {
        return j().length;
    }

    public final String w() {
        return this.f4392c;
    }

    public String x() {
        char[] cArr = new char[j().length * 2];
        int i8 = 0;
        for (byte b8 : j()) {
            int i9 = i8 + 1;
            cArr[i8] = K7.b.f()[(b8 >> 4) & 15];
            i8 += 2;
            cArr[i9] = K7.b.f()[b8 & 15];
        }
        return Z6.v.q(cArr);
    }

    public byte[] y() {
        return j();
    }

    public byte z(int i8) {
        return j()[i8];
    }

    public byte[] K() {
        byte[] bArrJ = j();
        byte[] bArrCopyOf = Arrays.copyOf(bArrJ, bArrJ.length);
        kotlin.jvm.internal.t.f(bArrCopyOf, jULK.mnnw);
        return bArrCopyOf;
    }
}
