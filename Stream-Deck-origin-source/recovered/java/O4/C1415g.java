package O4;

import java.io.OutputStream;

/* JADX INFO: renamed from: O4.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1415g extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8207a = 0;

    public final long b() {
        return this.f8207a;
    }

    @Override // java.io.OutputStream
    public final void write(int i8) {
        this.f8207a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f8207a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i8, int i9) {
        int length;
        int i10;
        if (i8 >= 0 && i8 <= (length = bArr.length) && i9 >= 0 && (i10 = i8 + i9) <= length && i10 >= 0) {
            this.f8207a += (long) i9;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
