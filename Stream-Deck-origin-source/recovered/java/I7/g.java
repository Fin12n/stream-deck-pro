package I7;

import J7.C1034e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J7.g f3853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f3854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f3859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3860i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3861j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3862k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1034e f3863l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1034e f3864m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f3865n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f3866o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1034e.a f3867p;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void b(String str);

        void c(J7.h hVar);

        void f(J7.h hVar);

        void g(J7.h hVar);

        void h(int i8, String str);
    }

    public g(boolean z8, J7.g source, a frameCallback, boolean z9, boolean z10) {
        t.g(source, "source");
        t.g(frameCallback, "frameCallback");
        this.f3852a = z8;
        this.f3853b = source;
        this.f3854c = frameCallback;
        this.f3855d = z9;
        this.f3856e = z10;
        this.f3863l = new C1034e();
        this.f3864m = new C1034e();
        this.f3866o = z8 ? null : new byte[4];
        this.f3867p = z8 ? null : new C1034e.a();
    }

    public final void b() {
        j();
        if (this.f3861j) {
            c();
        } else {
            t();
        }
    }

    public final void c() throws ProtocolException, EOFException {
        short s8;
        String strO1;
        long j8 = this.f3859h;
        if (j8 > 0) {
            this.f3853b.Y0(this.f3863l, j8);
            if (!this.f3852a) {
                C1034e c1034e = this.f3863l;
                C1034e.a aVar = this.f3867p;
                t.d(aVar);
                c1034e.Q0(aVar);
                this.f3867p.o(0L);
                f fVar = f.f3851a;
                C1034e.a aVar2 = this.f3867p;
                byte[] bArr = this.f3866o;
                t.d(bArr);
                fVar.b(aVar2, bArr);
                this.f3867p.close();
            }
        }
        switch (this.f3858g) {
            case 8:
                long size = this.f3863l.size();
                if (size == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (size != 0) {
                    s8 = this.f3863l.readShort();
                    strO1 = this.f3863l.o1();
                    String strA = f.f3851a.a(s8);
                    if (strA != null) {
                        throw new ProtocolException(strA);
                    }
                } else {
                    s8 = 1005;
                    strO1 = "";
                }
                this.f3854c.h(s8, strO1);
                this.f3857f = true;
                return;
            case 9:
                this.f3854c.f(this.f3863l.a1());
                return;
            case 10:
                this.f3854c.c(this.f3863l.a1());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + v7.d.Q(this.f3858g));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c cVar = this.f3865n;
        if (cVar != null) {
            cVar.close();
        }
    }

    public final void j() throws IOException {
        boolean z8;
        if (this.f3857f) {
            throw new IOException("closed");
        }
        long jH = this.f3853b.r().h();
        this.f3853b.r().b();
        try {
            int iD = v7.d.d(this.f3853b.readByte(), 255);
            this.f3853b.r().g(jH, TimeUnit.NANOSECONDS);
            int i8 = iD & 15;
            this.f3858g = i8;
            boolean z9 = (iD & 128) != 0;
            this.f3860i = z9;
            boolean z10 = (iD & 8) != 0;
            this.f3861j = z10;
            if (z10 && !z9) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z11 = (iD & 64) != 0;
            if (i8 == 1 || i8 == 2) {
                if (!z11) {
                    z8 = false;
                } else {
                    if (!this.f3855d) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z8 = true;
                }
                this.f3862k = z8;
            } else if (z11) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iD & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iD & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iD2 = v7.d.d(this.f3853b.readByte(), 255);
            boolean z12 = (iD2 & 128) != 0;
            if (z12 == this.f3852a) {
                throw new ProtocolException(this.f3852a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j8 = iD2 & 127;
            this.f3859h = j8;
            if (j8 == 126) {
                this.f3859h = v7.d.e(this.f3853b.readShort(), 65535);
            } else if (j8 == 127) {
                long j9 = this.f3853b.readLong();
                this.f3859h = j9;
                if (j9 < 0) {
                    throw new ProtocolException("Frame length 0x" + v7.d.R(this.f3859h) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f3861j && this.f3859h > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z12) {
                J7.g gVar = this.f3853b;
                byte[] bArr = this.f3866o;
                t.d(bArr);
                gVar.readFully(bArr);
            }
        } catch (Throwable th) {
            this.f3853b.r().g(jH, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    public final void o() throws IOException {
        while (!this.f3857f) {
            long j8 = this.f3859h;
            if (j8 > 0) {
                this.f3853b.Y0(this.f3864m, j8);
                if (!this.f3852a) {
                    C1034e c1034e = this.f3864m;
                    C1034e.a aVar = this.f3867p;
                    t.d(aVar);
                    c1034e.Q0(aVar);
                    this.f3867p.o(this.f3864m.size() - this.f3859h);
                    f fVar = f.f3851a;
                    C1034e.a aVar2 = this.f3867p;
                    byte[] bArr = this.f3866o;
                    t.d(bArr);
                    fVar.b(aVar2, bArr);
                    this.f3867p.close();
                }
            }
            if (this.f3860i) {
                return;
            }
            v();
            if (this.f3858g != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + v7.d.Q(this.f3858g));
            }
        }
        throw new IOException("closed");
    }

    public final void t() throws IOException {
        int i8 = this.f3858g;
        if (i8 != 1 && i8 != 2) {
            throw new ProtocolException("Unknown opcode: " + v7.d.Q(i8));
        }
        o();
        if (this.f3862k) {
            c cVar = this.f3865n;
            if (cVar == null) {
                cVar = new c(this.f3856e);
                this.f3865n = cVar;
            }
            cVar.b(this.f3864m);
        }
        if (i8 == 1) {
            this.f3854c.b(this.f3864m.o1());
        } else {
            this.f3854c.g(this.f3864m.a1());
        }
    }

    public final void v() throws IOException {
        while (!this.f3857f) {
            j();
            if (!this.f3861j) {
                return;
            } else {
                c();
            }
        }
    }
}
