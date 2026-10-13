package I;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f3602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteOrder f3603b;

    public b(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f3602a = outputStream;
        this.f3603b = byteOrder;
    }

    public void b(ByteOrder byteOrder) {
        this.f3603b = byteOrder;
    }

    public void c(int i8) throws IOException {
        this.f3602a.write(i8);
    }

    public void j(int i8) throws IOException {
        ByteOrder byteOrder = this.f3603b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f3602a.write(i8 & 255);
            this.f3602a.write((i8 >>> 8) & 255);
            this.f3602a.write((i8 >>> 16) & 255);
            this.f3602a.write((i8 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f3602a.write((i8 >>> 24) & 255);
            this.f3602a.write((i8 >>> 16) & 255);
            this.f3602a.write((i8 >>> 8) & 255);
            this.f3602a.write(i8 & 255);
        }
    }

    public void o(short s8) throws IOException {
        ByteOrder byteOrder = this.f3603b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f3602a.write(s8 & 255);
            this.f3602a.write((s8 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f3602a.write((s8 >>> 8) & 255);
            this.f3602a.write(s8 & 255);
        }
    }

    public void t(long j8) throws IOException {
        j((int) j8);
    }

    public void v(int i8) throws IOException {
        o((short) i8);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f3602a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i8, int i9) throws IOException {
        this.f3602a.write(bArr, i8, i9);
    }
}
