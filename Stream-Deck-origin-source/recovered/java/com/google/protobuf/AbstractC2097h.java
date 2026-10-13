package com.google.protobuf;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: renamed from: com.google.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2097h implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2097h f19285b = new j(A.f19050d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f19286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Comparator f19287d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19288a = 0;

    /* JADX INFO: renamed from: com.google.protobuf.h$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19289a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19290b;

        public a() {
            this.f19290b = AbstractC2097h.this.size();
        }

        @Override // com.google.protobuf.AbstractC2097h.g
        public byte a() {
            int i8 = this.f19289a;
            if (i8 >= this.f19290b) {
                throw new NoSuchElementException();
            }
            this.f19289a = i8 + 1;
            return AbstractC2097h.this.H(i8);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19289a < this.f19290b;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.h$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC2097h abstractC2097h, AbstractC2097h abstractC2097h2) {
            g gVarJ = abstractC2097h.J();
            g gVarJ2 = abstractC2097h2.J();
            while (gVarJ.hasNext() && gVarJ2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC2097h.Q(gVarJ.a())).compareTo(Integer.valueOf(AbstractC2097h.Q(gVarJ2.a())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC2097h.size()).compareTo(Integer.valueOf(abstractC2097h2.size()));
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.h$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class c implements g {
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(a());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.h$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements f {
        public d() {
        }

        @Override // com.google.protobuf.AbstractC2097h.f
        public byte[] a(byte[] bArr, int i8, int i9) {
            return Arrays.copyOfRange(bArr, i8, i9 + i8);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.h$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f19292f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f19293g;

        public e(byte[] bArr, int i8, int i9) {
            super(bArr);
            AbstractC2097h.z(i8, i8 + i9, bArr.length);
            this.f19292f = i8;
            this.f19293g = i9;
        }

        @Override // com.google.protobuf.AbstractC2097h.j, com.google.protobuf.AbstractC2097h
        public void G(byte[] bArr, int i8, int i9, int i10) {
            System.arraycopy(this.f19296e, a0() + i8, bArr, i9, i10);
        }

        @Override // com.google.protobuf.AbstractC2097h.j, com.google.protobuf.AbstractC2097h
        public byte H(int i8) {
            return this.f19296e[this.f19292f + i8];
        }

        @Override // com.google.protobuf.AbstractC2097h.j
        public int a0() {
            return this.f19292f;
        }

        @Override // com.google.protobuf.AbstractC2097h.j, com.google.protobuf.AbstractC2097h
        public int size() {
            return this.f19293g;
        }

        @Override // com.google.protobuf.AbstractC2097h.j, com.google.protobuf.AbstractC2097h
        public byte t(int i8) {
            AbstractC2097h.y(i8, size());
            return this.f19296e[this.f19292f + i8];
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.h$f */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface f {
        byte[] a(byte[] bArr, int i8, int i9);
    }

    /* JADX INFO: renamed from: com.google.protobuf.h$g */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface g extends Iterator {
        byte a();
    }

    /* JADX INFO: renamed from: com.google.protobuf.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0429h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC2100k f19294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f19295b;

        public /* synthetic */ C0429h(int i8, a aVar) {
            this(i8);
        }

        public AbstractC2097h a() {
            this.f19294a.d();
            return new j(this.f19295b);
        }

        public AbstractC2100k b() {
            return this.f19294a;
        }

        public C0429h(int i8) {
            byte[] bArr = new byte[i8];
            this.f19295b = bArr;
            this.f19294a = AbstractC2100k.g0(bArr);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.h$i */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class i extends AbstractC2097h {
        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.J();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.h$j */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class j extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f19296e;

        public j(byte[] bArr) {
            bArr.getClass();
            this.f19296e = bArr;
        }

        @Override // com.google.protobuf.AbstractC2097h
        public final void F(ByteBuffer byteBuffer) {
            byteBuffer.put(this.f19296e, a0(), size());
        }

        @Override // com.google.protobuf.AbstractC2097h
        public void G(byte[] bArr, int i8, int i9, int i10) {
            System.arraycopy(this.f19296e, i8, bArr, i9, i10);
        }

        @Override // com.google.protobuf.AbstractC2097h
        public byte H(int i8) {
            return this.f19296e[i8];
        }

        @Override // com.google.protobuf.AbstractC2097h
        public final boolean I() {
            int iA0 = a0();
            return A0.t(this.f19296e, iA0, size() + iA0);
        }

        @Override // com.google.protobuf.AbstractC2097h
        public final AbstractC2098i L() {
            return AbstractC2098i.n(this.f19296e, a0(), size(), true);
        }

        @Override // com.google.protobuf.AbstractC2097h
        public final int M(int i8, int i9, int i10) {
            return A.i(i8, this.f19296e, a0() + i9, i10);
        }

        @Override // com.google.protobuf.AbstractC2097h
        public final AbstractC2097h O(int i8, int i9) {
            int iZ = AbstractC2097h.z(i8, i9, size());
            return iZ == 0 ? AbstractC2097h.f19285b : new e(this.f19296e, a0() + i8, iZ);
        }

        @Override // com.google.protobuf.AbstractC2097h
        public final String S(Charset charset) {
            return new String(this.f19296e, a0(), size(), charset);
        }

        @Override // com.google.protobuf.AbstractC2097h
        public final void Y(AbstractC2096g abstractC2096g) {
            abstractC2096g.b(this.f19296e, a0(), size());
        }

        public final boolean Z(AbstractC2097h abstractC2097h, int i8, int i9) {
            if (i9 > abstractC2097h.size()) {
                throw new IllegalArgumentException("Length too large: " + i9 + size());
            }
            int i10 = i8 + i9;
            if (i10 > abstractC2097h.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i8 + ", " + i9 + ", " + abstractC2097h.size());
            }
            if (!(abstractC2097h instanceof j)) {
                return abstractC2097h.O(i8, i10).equals(O(0, i9));
            }
            j jVar = (j) abstractC2097h;
            byte[] bArr = this.f19296e;
            byte[] bArr2 = jVar.f19296e;
            int iA0 = a0() + i9;
            int iA1 = a0();
            int iA2 = jVar.a0() + i8;
            while (iA1 < iA0) {
                if (bArr[iA1] != bArr2[iA2]) {
                    return false;
                }
                iA1++;
                iA2++;
            }
            return true;
        }

        public int a0() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC2097h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC2097h) || size() != ((AbstractC2097h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iN = N();
            int iN2 = jVar.N();
            if (iN == 0 || iN2 == 0 || iN == iN2) {
                return Z(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC2097h
        public final ByteBuffer o() {
            return ByteBuffer.wrap(this.f19296e, a0(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.AbstractC2097h
        public int size() {
            return this.f19296e.length;
        }

        @Override // com.google.protobuf.AbstractC2097h
        public byte t(int i8) {
            return this.f19296e[i8];
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.h$k */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k implements f {
        public k() {
        }

        @Override // com.google.protobuf.AbstractC2097h.f
        public byte[] a(byte[] bArr, int i8, int i9) {
            byte[] bArr2 = new byte[i9];
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            return bArr2;
        }

        public /* synthetic */ k(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f19286c = AbstractC2092d.c() ? new k(aVar) : new d(aVar);
        f19287d = new b();
    }

    public static AbstractC2097h A(byte[] bArr) {
        return D(bArr, 0, bArr.length);
    }

    public static AbstractC2097h D(byte[] bArr, int i8, int i9) {
        z(i8, i8 + i9, bArr.length);
        return new j(f19286c.a(bArr, i8, i9));
    }

    public static AbstractC2097h E(String str) {
        return new j(str.getBytes(A.f19048b));
    }

    public static C0429h K(int i8) {
        return new C0429h(i8, null);
    }

    public static int Q(byte b8) {
        return b8 & 255;
    }

    public static AbstractC2097h V(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new C2093d0(byteBuffer);
        }
        return X(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public static AbstractC2097h W(byte[] bArr) {
        return new j(bArr);
    }

    public static AbstractC2097h X(byte[] bArr, int i8, int i9) {
        return new e(bArr, i8, i9);
    }

    public static void y(int i8, int i9) {
        if (((i9 - (i8 + 1)) | i8) < 0) {
            if (i8 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i8);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i8 + ", " + i9);
        }
    }

    public abstract void F(ByteBuffer byteBuffer);

    public abstract void G(byte[] bArr, int i8, int i9, int i10);

    public abstract byte H(int i8);

    public abstract boolean I();

    public g J() {
        return new a();
    }

    public abstract AbstractC2098i L();

    public abstract int M(int i8, int i9, int i10);

    public final int N() {
        return this.f19288a;
    }

    public abstract AbstractC2097h O(int i8, int i9);

    public final byte[] P() {
        int size = size();
        if (size == 0) {
            return A.f19050d;
        }
        byte[] bArr = new byte[size];
        G(bArr, 0, 0, size);
        return bArr;
    }

    public final String R(Charset charset) {
        return size() == 0 ? "" : S(charset);
    }

    public abstract String S(Charset charset);

    public final String T() {
        return R(A.f19048b);
    }

    public final String U() {
        if (size() <= 50) {
            return t0.a(this);
        }
        return t0.a(O(0, 47)) + "...";
    }

    public abstract void Y(AbstractC2096g abstractC2096g);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iM = this.f19288a;
        if (iM == 0) {
            int size = size();
            iM = M(size, 0, size);
            if (iM == 0) {
                iM = 1;
            }
            this.f19288a = iM;
        }
        return iM;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract ByteBuffer o();

    public abstract int size();

    public abstract byte t(int i8);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), U());
    }

    public static int z(int i8, int i9, int i10) {
        int i11 = i9 - i8;
        if ((i8 | i9 | i11 | (i10 - i9)) >= 0) {
            return i11;
        }
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i8 + hJroAgFztiMK.PneobbZEOlxnx);
        }
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i8 + ", " + i9);
        }
        throw new IndexOutOfBoundsException("End index: " + i9 + " >= " + i10);
    }
}
