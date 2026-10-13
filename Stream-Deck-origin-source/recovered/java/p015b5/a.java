package p015b5;

import java.util.Arrays;
import p006a5.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f15849a;

    public a(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[i9];
        this.f15849a = bArr2;
        System.arraycopy(bArr, i8, bArr2, 0, i9);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static a b(byte[] bArr, int i8, int i9) {
        if (bArr != null) {
            return new a(bArr, i8, i9);
        }
        throw new NullPointerException("data must be non-null");
    }

    public byte[] c() {
        byte[] bArr = this.f15849a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).f15849a, this.f15849a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f15849a);
    }

    public String toString() {
        return "Bytes(" + g.a(this.f15849a) + ")";
    }
}
