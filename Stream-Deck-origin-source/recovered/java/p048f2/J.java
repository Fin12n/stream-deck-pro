package p048f2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class J extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f21571a;

    public J(FileOutputStream fileOutputStream) {
        t.g(fileOutputStream, "fileOutputStream");
        this.f21571a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f21571a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i8) throws IOException {
        this.f21571a.write(i8);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b8) throws IOException {
        t.g(b8, "b");
        this.f21571a.write(b8);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bytes, int i8, int i9) throws IOException {
        t.g(bytes, "bytes");
        this.f21571a.write(bytes, i8, i9);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
