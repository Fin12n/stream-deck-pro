package I7;

import J7.A;
import J7.C1034e;
import J7.i;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1034e f3795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Deflater f3796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f3797d;

    public a(boolean z8) {
        this.f3794a = z8;
        C1034e c1034e = new C1034e();
        this.f3795b = c1034e;
        Deflater deflater = new Deflater(-1, true);
        this.f3796c = deflater;
        this.f3797d = new i((A) c1034e, deflater);
    }

    public final void b(C1034e buffer) throws IllegalAccessException, IOException, InvocationTargetException {
        t.g(buffer, "buffer");
        if (this.f3795b.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f3794a) {
            this.f3796c.reset();
        }
        this.f3797d.I1(buffer, buffer.size());
        this.f3797d.flush();
        if (c(this.f3795b, b.f3798a)) {
            long size = this.f3795b.size() - ((long) 4);
            C1034e.a aVarT0 = C1034e.T0(this.f3795b, null, 1, null);
            try {
                aVarT0.j(size);
                N6.a.a(aVarT0, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    N6.a.a(aVarT0, th);
                    throw th2;
                }
            }
        } else {
            this.f3795b.writeByte(0);
        }
        C1034e c1034e = this.f3795b;
        buffer.I1(c1034e, c1034e.size());
    }

    public final boolean c(C1034e c1034e, J7.h hVar) {
        return c1034e.L0(c1034e.size() - ((long) hVar.H()), hVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f3797d.close();
    }
}
