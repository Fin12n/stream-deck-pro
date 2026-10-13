package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import p027d.LrLN.vHKCAgr;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class S implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S f18819b = new O(AbstractC2081y0.f19034d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator f18820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Q f18821d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18822a = 0;

    static {
        int i8 = D.f18749a;
        f18821d = new Q(null);
        f18820c = new I();
    }

    public static S H(byte[] bArr, int i8, int i9) {
        F(i8, i8 + i9, bArr.length);
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i8, bArr2, 0, i9);
        return new O(bArr2);
    }

    public abstract String A(Charset charset);

    public abstract void D(G g8);

    public abstract boolean E();

    public final int G() {
        return this.f18822a;
    }

    public final String I(Charset charset) {
        return t() == 0 ? "" : A(charset);
    }

    public abstract byte c(int i8);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iY = this.f18822a;
        if (iY == 0) {
            int iT = t();
            iY = y(iT, 0, iT);
            if (iY == 0) {
                iY = 1;
            }
            this.f18822a = iY;
        }
        return iY;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new H(this);
    }

    public abstract byte o(int i8);

    public abstract int t();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(t()), t() <= 50 ? AbstractC2070u1.a(this) : AbstractC2070u1.a(z(0, 47)).concat("..."));
    }

    public abstract int y(int i8, int i9, int i10);

    public abstract S z(int i8, int i9);

    public static int F(int i8, int i9, int i10) {
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
        throw new IndexOutOfBoundsException(vHKCAgr.CPnOhXbV + i9 + " >= " + i10);
    }
}
