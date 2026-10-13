package J7;

import D6.C0933m;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient byte[][] f4442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int[] f4443g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(byte[][] segments, int[] directory) {
        super(h.f4389e.j());
        kotlin.jvm.internal.t.g(segments, "segments");
        kotlin.jvm.internal.t.g(directory, "directory");
        this.f4442f = segments;
        this.f4443g = directory;
    }

    @Override // J7.h
    public boolean B(int i8, h other, int i9, int i10) {
        kotlin.jvm.internal.t.g(other, "other");
        if (i8 < 0 || i8 > H() - i10) {
            return false;
        }
        int i11 = i10 + i8;
        int iB = K7.c.b(this, i8);
        while (i8 < i11) {
            int i12 = iB == 0 ? 0 : N()[iB - 1];
            int i13 = N()[iB] - i12;
            int i14 = N()[O().length + iB];
            int iMin = Math.min(i11, i13 + i12) - i8;
            if (!other.C(i9, O()[iB], i14 + (i8 - i12), iMin)) {
                return false;
            }
            i9 += iMin;
            i8 += iMin;
            iB++;
        }
        return true;
    }

    @Override // J7.h
    public boolean C(int i8, byte[] other, int i9, int i10) {
        kotlin.jvm.internal.t.g(other, "other");
        if (i8 < 0 || i8 > H() - i10 || i9 < 0 || i9 > other.length - i10) {
            return false;
        }
        int i11 = i10 + i8;
        int iB = K7.c.b(this, i8);
        while (i8 < i11) {
            int i12 = iB == 0 ? 0 : N()[iB - 1];
            int i13 = N()[iB] - i12;
            int i14 = N()[O().length + iB];
            int iMin = Math.min(i11, i13 + i12) - i8;
            if (!AbstractC1031b.a(O()[iB], i14 + (i8 - i12), other, i9, iMin)) {
                return false;
            }
            i9 += iMin;
            i8 += iMin;
            iB++;
        }
        return true;
    }

    @Override // J7.h
    public h J() {
        return P().J();
    }

    @Override // J7.h
    public byte[] K() {
        byte[] bArr = new byte[H()];
        int length = O().length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < length) {
            int i11 = N()[length + i8];
            int i12 = N()[i8];
            int i13 = i12 - i9;
            C0933m.d(O()[i8], bArr, i10, i11, i11 + i13);
            i10 += i13;
            i8++;
            i9 = i12;
        }
        return bArr;
    }

    @Override // J7.h
    public void M(C1034e buffer, int i8, int i9) {
        kotlin.jvm.internal.t.g(buffer, "buffer");
        int i10 = i8 + i9;
        int iB = K7.c.b(this, i8);
        while (i8 < i10) {
            int i11 = iB == 0 ? 0 : N()[iB - 1];
            int i12 = N()[iB] - i11;
            int i13 = N()[O().length + iB];
            int iMin = Math.min(i10, i12 + i11) - i8;
            int i14 = i13 + (i8 - i11);
            x xVar = new x(O()[iB], i14, i14 + iMin, true, false);
            x xVar2 = buffer.f4378a;
            if (xVar2 == null) {
                xVar.f4436g = xVar;
                xVar.f4435f = xVar;
                buffer.f4378a = xVar;
            } else {
                kotlin.jvm.internal.t.d(xVar2);
                x xVar3 = xVar2.f4436g;
                kotlin.jvm.internal.t.d(xVar3);
                xVar3.c(xVar);
            }
            i8 += iMin;
            iB++;
        }
        buffer.q1(buffer.size() + ((long) i9));
    }

    public final int[] N() {
        return this.f4443g;
    }

    public final byte[][] O() {
        return this.f4442f;
    }

    public final h P() {
        return new h(K());
    }

    @Override // J7.h
    public String a() {
        return P().a();
    }

    @Override // J7.h
    public h c(String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.t.g(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = O().length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = N()[length + i8];
            int i11 = N()[i8];
            messageDigest.update(O()[i8], i10, i11 - i9);
            i8++;
            i9 = i11;
        }
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.t.d(bArrDigest);
        return new h(bArrDigest);
    }

    @Override // J7.h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.H() == H() && B(0, hVar, 0, H())) {
                return true;
            }
        }
        return false;
    }

    @Override // J7.h
    public int hashCode() {
        int iT = t();
        if (iT != 0) {
            return iT;
        }
        int length = O().length;
        int i8 = 0;
        int i9 = 1;
        int i10 = 0;
        while (i8 < length) {
            int i11 = N()[length + i8];
            int i12 = N()[i8];
            byte[] bArr = O()[i8];
            int i13 = (i12 - i10) + i11;
            while (i11 < i13) {
                i9 = (i9 * 31) + bArr[i11];
                i11++;
            }
            i8++;
            i10 = i12;
        }
        D(i9);
        return i9;
    }

    @Override // J7.h
    public String toString() {
        return P().toString();
    }

    @Override // J7.h
    public int v() {
        return N()[O().length - 1];
    }

    @Override // J7.h
    public String x() {
        return P().x();
    }

    @Override // J7.h
    public byte[] y() {
        return K();
    }

    @Override // J7.h
    public byte z(int i8) {
        AbstractC1031b.b(N()[O().length - 1], i8, 1L);
        int iB = K7.c.b(this, i8);
        return O()[iB][(i8 - (iB == 0 ? 0 : N()[iB - 1])) + N()[O().length + iB]];
    }
}
