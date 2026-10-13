package I7;

import J7.C1034e;
import J7.InterfaceC1035f;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1035f f3869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Random f3870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1034e f3874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1034e f3875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3876i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f3877j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f3878k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1034e.a f3879l;

    public h(boolean z8, InterfaceC1035f sink, Random random, boolean z9, boolean z10, long j8) {
        t.g(sink, "sink");
        t.g(random, "random");
        this.f3868a = z8;
        this.f3869b = sink;
        this.f3870c = random;
        this.f3871d = z9;
        this.f3872e = z10;
        this.f3873f = j8;
        this.f3874g = new C1034e();
        this.f3875h = sink.l();
        this.f3878k = z8 ? new byte[4] : null;
        this.f3879l = z8 ? new C1034e.a() : null;
    }

    public final void b(int i8, J7.h hVar) {
        J7.h hVarA1 = J7.h.f4389e;
        if (i8 != 0 || hVar != null) {
            if (i8 != 0) {
                f.f3851a.c(i8);
            }
            C1034e c1034e = new C1034e();
            c1034e.writeShort(i8);
            if (hVar != null) {
                c1034e.R0(hVar);
            }
            hVarA1 = c1034e.a1();
        }
        try {
            c(8, hVarA1);
        } finally {
            this.f3876i = true;
        }
    }

    public final void c(int i8, J7.h hVar) throws IOException {
        if (this.f3876i) {
            throw new IOException("closed");
        }
        int iH = hVar.H();
        if (iH > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.f3875h.writeByte(i8 | 128);
        if (this.f3868a) {
            this.f3875h.writeByte(iH | 128);
            Random random = this.f3870c;
            byte[] bArr = this.f3878k;
            t.d(bArr);
            random.nextBytes(bArr);
            this.f3875h.write(this.f3878k);
            if (iH > 0) {
                long size = this.f3875h.size();
                this.f3875h.R0(hVar);
                C1034e c1034e = this.f3875h;
                C1034e.a aVar = this.f3879l;
                t.d(aVar);
                c1034e.Q0(aVar);
                this.f3879l.o(size);
                f.f3851a.b(this.f3879l, this.f3878k);
                this.f3879l.close();
            }
        } else {
            this.f3875h.writeByte(iH);
            this.f3875h.R0(hVar);
        }
        this.f3869b.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        a aVar = this.f3877j;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void j(int i8, J7.h data) throws IllegalAccessException, IOException, InvocationTargetException {
        t.g(data, "data");
        if (this.f3876i) {
            throw new IOException("closed");
        }
        this.f3874g.R0(data);
        int i9 = i8 | 128;
        if (this.f3871d && data.H() >= this.f3873f) {
            a aVar = this.f3877j;
            if (aVar == null) {
                aVar = new a(this.f3872e);
                this.f3877j = aVar;
            }
            aVar.b(this.f3874g);
            i9 = i8 | 192;
        }
        long size = this.f3874g.size();
        this.f3875h.writeByte(i9);
        int i10 = this.f3868a ? 128 : 0;
        if (size <= 125) {
            this.f3875h.writeByte(i10 | ((int) size));
        } else if (size <= 65535) {
            this.f3875h.writeByte(i10 | 126);
            this.f3875h.writeShort((int) size);
        } else {
            this.f3875h.writeByte(i10 | 127);
            this.f3875h.Z1(size);
        }
        if (this.f3868a) {
            Random random = this.f3870c;
            byte[] bArr = this.f3878k;
            t.d(bArr);
            random.nextBytes(bArr);
            this.f3875h.write(this.f3878k);
            if (size > 0) {
                C1034e c1034e = this.f3874g;
                C1034e.a aVar2 = this.f3879l;
                t.d(aVar2);
                c1034e.Q0(aVar2);
                this.f3879l.o(0L);
                f.f3851a.b(this.f3879l, this.f3878k);
                this.f3879l.close();
            }
        }
        this.f3875h.I1(this.f3874g, size);
        this.f3869b.Q();
    }

    public final void o(J7.h payload) {
        t.g(payload, "payload");
        c(9, payload);
    }

    public final void t(J7.h payload) throws IOException {
        t.g(payload, "payload");
        c(10, payload);
    }
}
