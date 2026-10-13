package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class J0 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J0 f17985b = new I0(AbstractC1953s1.f18651b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17986a = 0;

    static {
        int i8 = AbstractC1977x0.f18689a;
    }

    public static int K(int i8, int i9, int i10) {
        int i11 = i9 - i8;
        if ((i8 | i9 | i11 | (i10 - i9)) >= 0) {
            return i11;
        }
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i8 + " < 0");
        }
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i8 + ", " + i9);
        }
        throw new IndexOutOfBoundsException("End index: " + i9 + " >= " + i10);
    }

    public static J0 N(byte[] bArr, int i8, int i9) {
        K(i8, i8 + i9, bArr.length);
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i8, bArr2, 0, i9);
        return new I0(bArr2);
    }

    public static J0 O(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i8 = 0;
            while (i8 < iMin) {
                int i9 = inputStream.read(bArr, i8, iMin - i8);
                if (i9 == -1) {
                    break;
                }
                i8 += i9;
            }
            J0 j0N = i8 == 0 ? null : N(bArr, 0, i8);
            if (j0N == null) {
                break;
            }
            arrayList.add(j0N);
            iMin = Math.min(iMin + iMin, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? f17985b : t(arrayList.iterator(), size);
    }

    public static void Q(int i8, int i9) {
        if (((i9 - (i8 + 1)) | i8) < 0) {
            if (i8 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i8);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i8 + ", " + i9);
        }
    }

    public static J0 t(Iterator it, int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i8)));
        }
        if (i8 == 1) {
            return (J0) it.next();
        }
        int i9 = i8 >>> 1;
        J0 j0T = t(it, i9);
        J0 j0T2 = t(it, i8 - i9);
        if (Integer.MAX_VALUE - j0T.y() >= j0T2.y()) {
            return C1885e2.W(j0T, j0T2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + j0T.y() + "+" + j0T2.y());
    }

    public abstract int A();

    public abstract boolean D();

    public abstract int E(int i8, int i9, int i10);

    public abstract int F(int i8, int i9, int i10);

    public abstract J0 G(int i8, int i9);

    public abstract String H(Charset charset);

    public abstract void I(A0 a8);

    public abstract boolean J();

    public final int L() {
        return this.f17986a;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public F0 iterator() {
        return new B0(this);
    }

    public final String P() {
        return y() == 0 ? "" : H(AbstractC1953s1.f18650a);
    }

    public final void R(byte[] bArr, int i8, int i9, int i10) {
        K(0, i10, y());
        K(i9, i9 + i10, bArr.length);
        if (i10 > 0) {
            z(bArr, 0, i9, i10);
        }
    }

    public final byte[] S() {
        int iY = y();
        if (iY == 0) {
            return AbstractC1953s1.f18651b;
        }
        byte[] bArr = new byte[iY];
        z(bArr, 0, 0, iY);
        return bArr;
    }

    public abstract byte c(int i8);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iE = this.f17986a;
        if (iE == 0) {
            int iY = y();
            iE = E(iY, 0, iY);
            if (iE == 0) {
                iE = 1;
            }
            this.f17986a = iE;
        }
        return iE;
    }

    public abstract byte o(int i8);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(y()), y() <= 50 ? AbstractC1945q2.a(this) : AbstractC1945q2.a(G(0, 47)).concat("..."));
    }

    public abstract int y();

    public abstract void z(byte[] bArr, int i8, int i9, int i10);
}
