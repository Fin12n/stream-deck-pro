package p069h5;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f24450a = 0;

    public long b() {
        return this.f24450a;
    }

    @Override // java.io.OutputStream
    public void write(int i8) {
        this.f24450a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f24450a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i8, int i9) {
        int i10;
        if (i8 >= 0 && i8 <= bArr.length && i9 >= 0 && (i10 = i8 + i9) <= bArr.length && i10 >= 0) {
            this.f24450a += (long) i9;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
