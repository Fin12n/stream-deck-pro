package x7;

import J7.A;
import J7.C1034e;
import J7.j;
import Q6.k;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class e extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f37529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37530c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(A delegate, k onException) {
        super(delegate);
        t.g(delegate, "delegate");
        t.g(onException, "onException");
        this.f37529b = onException;
    }

    @Override // J7.j, J7.A
    public void I1(C1034e source, long j8) throws EOFException {
        t.g(source, "source");
        if (this.f37530c) {
            source.skip(j8);
            return;
        }
        try {
            super.I1(source, j8);
        } catch (IOException e8) {
            this.f37530c = true;
            this.f37529b.invoke(e8);
        }
    }

    @Override // J7.j, J7.A, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f37530c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e8) {
            this.f37530c = true;
            this.f37529b.invoke(e8);
        }
    }

    @Override // J7.j, J7.A, java.io.Flushable
    public void flush() {
        if (this.f37530c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e8) {
            this.f37530c = true;
            this.f37529b.invoke(e8);
        }
    }
}
