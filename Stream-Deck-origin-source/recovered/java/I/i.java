package I;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i extends FilterOutputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f3648g = "Exif\u0000\u0000".getBytes(g.f3614e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f3649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f3650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f3651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3654f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static boolean a(short s8) {
            return (s8 < -64 || s8 > -49 || s8 == -60 || s8 == -56 || s8 == -52) ? false : true;
        }
    }

    public i(OutputStream outputStream, h hVar) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f3650b = new byte[1];
        this.f3651c = ByteBuffer.allocate(4);
        this.f3652d = 0;
        this.f3649a = hVar;
    }

    public final int b(int i8, byte[] bArr, int i9, int i10) {
        int iMin = Math.min(i10, i8 - this.f3651c.position());
        this.f3651c.put(bArr, i9, iMin);
        return iMin;
    }

    public final void c(b bVar) throws IOException {
        j[][] jVarArr = h.f3628i;
        int[] iArr = new int[jVarArr.length];
        int[] iArr2 = new int[jVarArr.length];
        for (j jVar : h.f3626g) {
            for (int i8 = 0; i8 < h.f3628i.length; i8++) {
                this.f3649a.d(i8).remove(jVar.f3656b);
            }
        }
        if (!this.f3649a.d(1).isEmpty()) {
            this.f3649a.d(0).put(h.f3626g[1].f3656b, g.f(0L, this.f3649a.e()));
        }
        if (!this.f3649a.d(2).isEmpty()) {
            this.f3649a.d(0).put(h.f3626g[2].f3656b, g.f(0L, this.f3649a.e()));
        }
        if (!this.f3649a.d(3).isEmpty()) {
            this.f3649a.d(1).put(h.f3626g[3].f3656b, g.f(0L, this.f3649a.e()));
        }
        for (int i9 = 0; i9 < h.f3628i.length; i9++) {
            Iterator it = this.f3649a.d(i9).entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int iJ = ((g) ((Map.Entry) it.next()).getValue()).j();
                if (iJ > 4) {
                    i10 += iJ;
                }
            }
            iArr2[i9] = iArr2[i9] + i10;
        }
        int size = 8;
        for (int i11 = 0; i11 < h.f3628i.length; i11++) {
            if (!this.f3649a.d(i11).isEmpty()) {
                iArr[i11] = size;
                size += (this.f3649a.d(i11).size() * 12) + 6 + iArr2[i11];
            }
        }
        int i12 = size + 8;
        if (!this.f3649a.d(1).isEmpty()) {
            this.f3649a.d(0).put(h.f3626g[1].f3656b, g.f(iArr[1], this.f3649a.e()));
        }
        if (!this.f3649a.d(2).isEmpty()) {
            this.f3649a.d(0).put(h.f3626g[2].f3656b, g.f(iArr[2], this.f3649a.e()));
        }
        if (!this.f3649a.d(3).isEmpty()) {
            this.f3649a.d(1).put(h.f3626g[3].f3656b, g.f(iArr[3], this.f3649a.e()));
        }
        bVar.v(i12);
        bVar.write(f3648g);
        bVar.o(this.f3649a.e() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        bVar.b(this.f3649a.e());
        bVar.v(42);
        bVar.t(8L);
        for (int i13 = 0; i13 < h.f3628i.length; i13++) {
            if (!this.f3649a.d(i13).isEmpty()) {
                bVar.v(this.f3649a.d(i13).size());
                int size2 = iArr[i13] + 2 + (this.f3649a.d(i13).size() * 12) + 4;
                for (Map.Entry entry : this.f3649a.d(i13).entrySet()) {
                    int i14 = ((j) T1.f.h((j) ((HashMap) h.b.f3637f.get(i13)).get(entry.getKey()), "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.")).f3655a;
                    g gVar = (g) entry.getValue();
                    int iJ2 = gVar.j();
                    bVar.v(i14);
                    bVar.v(gVar.f3618a);
                    bVar.j(gVar.f3619b);
                    if (iJ2 > 4) {
                        bVar.t(size2);
                        size2 += iJ2;
                    } else {
                        bVar.write(gVar.f3621d);
                        if (iJ2 < 4) {
                            while (iJ2 < 4) {
                                bVar.c(0);
                                iJ2++;
                            }
                        }
                    }
                }
                bVar.t(0L);
                Iterator it2 = this.f3649a.d(i13).entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((g) ((Map.Entry) it2.next()).getValue()).f3621d;
                    if (bArr.length > 4) {
                        bVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        bVar.b(ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i8, int i9) throws IOException {
        while (true) {
            int i10 = this.f3653e;
            if ((i10 <= 0 && this.f3654f <= 0 && this.f3652d == 2) || i9 <= 0) {
                break;
            }
            if (i10 > 0) {
                int iMin = Math.min(i9, i10);
                i9 -= iMin;
                this.f3653e -= iMin;
                i8 += iMin;
            }
            int i11 = this.f3654f;
            if (i11 > 0) {
                int iMin2 = Math.min(i9, i11);
                ((FilterOutputStream) this).out.write(bArr, i8, iMin2);
                i9 -= iMin2;
                this.f3654f -= iMin2;
                i8 += iMin2;
            }
            if (i9 == 0) {
                return;
            }
            int i12 = this.f3652d;
            if (i12 == 0) {
                int iB = b(2, bArr, i8, i9);
                i8 += iB;
                i9 -= iB;
                if (this.f3651c.position() < 2) {
                    return;
                }
                this.f3651c.rewind();
                if (this.f3651c.getShort() != -40) {
                    throw new IOException("Not a valid jpeg image, cannot write exif");
                }
                ((FilterOutputStream) this).out.write(this.f3651c.array(), 0, 2);
                this.f3652d = 1;
                this.f3651c.rewind();
                b bVar = new b(((FilterOutputStream) this).out, ByteOrder.BIG_ENDIAN);
                bVar.o((short) -31);
                c(bVar);
            } else if (i12 != 1) {
                continue;
            } else {
                int iB2 = b(4, bArr, i8, i9);
                i8 += iB2;
                i9 -= iB2;
                if (this.f3651c.position() == 2 && this.f3651c.getShort() == -39) {
                    ((FilterOutputStream) this).out.write(this.f3651c.array(), 0, 2);
                    this.f3651c.rewind();
                }
                if (this.f3651c.position() < 4) {
                    return;
                }
                this.f3651c.rewind();
                short s8 = this.f3651c.getShort();
                if (s8 == -31) {
                    this.f3653e = (this.f3651c.getShort() & 65535) - 2;
                    this.f3652d = 2;
                } else if (a.a(s8)) {
                    ((FilterOutputStream) this).out.write(this.f3651c.array(), 0, 4);
                    this.f3652d = 2;
                } else {
                    ((FilterOutputStream) this).out.write(this.f3651c.array(), 0, 4);
                    this.f3654f = (this.f3651c.getShort() & 65535) - 2;
                }
                this.f3651c.rewind();
            }
        }
        if (i9 > 0) {
            ((FilterOutputStream) this).out.write(bArr, i8, i9);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i8) throws IOException {
        byte[] bArr = this.f3650b;
        bArr[0] = (byte) (i8 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
