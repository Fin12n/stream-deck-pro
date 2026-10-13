package p111m2;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class L extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StringBuilder f29719b = new StringBuilder(128);

    public L(String str) {
        this.f29718a = str;
    }

    public final void b() {
        if (this.f29719b.length() > 0) {
            Log.d(this.f29718a, this.f29719b.toString());
            StringBuilder sb = this.f29719b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        b();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i8, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            char c8 = cArr[i8 + i10];
            if (c8 == '\n') {
                b();
            } else {
                this.f29719b.append(c8);
            }
        }
    }
}
