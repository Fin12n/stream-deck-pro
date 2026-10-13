package C7;

import J7.C;
import J7.C1034e;
import J7.D;
import R0.pkXL.Oitvkwcwn;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1604e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f1605f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J7.g f1606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f1608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d.a f1609d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final Logger a() {
            return h.f1605f;
        }

        public final int b(int i8, int i9, int i10) throws IOException {
            if ((i9 & 8) != 0) {
                i8--;
            }
            if (i10 <= i8) {
                return i8 - i10;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i10 + " > remaining length " + i8);
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {
        void b();

        void c(boolean z8, m mVar);

        void d(boolean z8, int i8, J7.g gVar, int i9);

        void e(int i8, C7.b bVar);

        void f(boolean z8, int i8, int i9, List list);

        void g(int i8, C7.b bVar, J7.h hVar);

        void h(int i8, long j8);

        void k(boolean z8, int i8, int i9);

        void l(int i8, int i9, int i10, boolean z8);

        void m(int i8, int i9, List list);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        t.f(logger, "getLogger(Http2::class.java.name)");
        f1605f = logger;
    }

    public h(J7.g source, boolean z8) {
        t.g(source, "source");
        this.f1606a = source;
        this.f1607b = z8;
        b bVar = new b(source);
        this.f1608c = bVar;
        this.f1609d = new d.a(bVar, 4096, 0, 4, null);
    }

    public final void A(c cVar, int i8) {
        int i9 = this.f1606a.readInt();
        cVar.l(i8, i9 & Integer.MAX_VALUE, v7.d.d(this.f1606a.readByte(), 255) + 1, (Integer.MIN_VALUE & i9) != 0);
    }

    public final void Y(c cVar, int i8, int i9, int i10) throws IOException {
        if (i8 == 5) {
            if (i10 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            A(cVar, i10);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i8 + " != 5");
        }
    }

    public final boolean c(boolean z8, c handler) throws IOException {
        t.g(handler, "handler");
        try {
            this.f1606a.S1(9L);
            int iJ = v7.d.J(this.f1606a);
            if (iJ > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iJ);
            }
            int iD = v7.d.d(this.f1606a.readByte(), 255);
            int iD2 = v7.d.d(this.f1606a.readByte(), 255);
            int i8 = this.f1606a.readInt() & Integer.MAX_VALUE;
            Logger logger = f1605f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.f1513a.c(true, i8, iJ, iD, iD2));
            }
            if (z8 && iD != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + e.f1513a.b(iD));
            }
            switch (iD) {
                case 0:
                    o(handler, iJ, iD2, i8);
                    return true;
                case 1:
                    y(handler, iJ, iD2, i8);
                    return true;
                case 2:
                    Y(handler, iJ, iD2, i8);
                    return true;
                case 3:
                    j0(handler, iJ, iD2, i8);
                    return true;
                case 4:
                    r0(handler, iJ, iD2, i8);
                    return true;
                case 5:
                    i0(handler, iJ, iD2, i8);
                    return true;
                case 6:
                    z(handler, iJ, iD2, i8);
                    return true;
                case 7:
                    t(handler, iJ, iD2, i8);
                    return true;
                case 8:
                    w0(handler, iJ, iD2, i8);
                    return true;
                default:
                    this.f1606a.skip(iJ);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1606a.close();
    }

    public final void i0(c cVar, int i8, int i9, int i10) throws IOException {
        if (i10 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iD = (i9 & 8) != 0 ? v7.d.d(this.f1606a.readByte(), 255) : 0;
        cVar.m(i10, this.f1606a.readInt() & Integer.MAX_VALUE, v(f1604e.b(i8 - 4, i9, iD), iD, i9, i10));
    }

    public final void j(c handler) throws IOException {
        t.g(handler, "handler");
        if (this.f1607b) {
            if (!c(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        J7.g gVar = this.f1606a;
        J7.h hVar = e.f1514b;
        J7.h hVarI = gVar.I(hVar.H());
        Logger logger = f1605f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(v7.d.t("<< CONNECTION " + hVarI.x(), new Object[0]));
        }
        if (t.c(hVar, hVarI)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + hVarI.L());
    }

    public final void j0(c cVar, int i8, int i9, int i10) throws IOException {
        if (i8 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i8 + Oitvkwcwn.TjwQZ);
        }
        if (i10 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i11 = this.f1606a.readInt();
        C7.b bVarA = C7.b.f1465b.a(i11);
        if (bVarA != null) {
            cVar.e(i10, bVarA);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i11);
    }

    public final void o(c cVar, int i8, int i9, int i10) throws IOException {
        if (i10 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z8 = (i9 & 1) != 0;
        if ((i9 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iD = (i9 & 8) != 0 ? v7.d.d(this.f1606a.readByte(), 255) : 0;
        cVar.d(z8, i10, this.f1606a, f1604e.b(i8, i9, iD));
        this.f1606a.skip(iD);
    }

    public final void r0(c cVar, int i8, int i9, int i10) throws IOException {
        if (i10 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i9 & 1) != 0) {
            if (i8 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            cVar.b();
            return;
        }
        if (i8 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i8);
        }
        m mVar = new m();
        W6.g gVarT = W6.n.t(W6.n.v(0, i8), 6);
        int iS = gVarT.s();
        int iT = gVarT.t();
        int iU = gVarT.u();
        if ((iU > 0 && iS <= iT) || (iU < 0 && iT <= iS)) {
            while (true) {
                int iE = v7.d.e(this.f1606a.readShort(), 65535);
                int i11 = this.f1606a.readInt();
                if (iE != 2) {
                    if (iE == 3) {
                        iE = 4;
                    } else if (iE != 4) {
                        if (iE == 5 && (i11 < 16384 || i11 > 16777215)) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i11);
                        }
                    } else {
                        if (i11 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iE = 7;
                    }
                } else if (i11 != 0 && i11 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                mVar.h(iE, i11);
                if (iS != iT) {
                    iS += iU;
                }
            }
        }
        cVar.c(false, mVar);
    }

    public final void t(c cVar, int i8, int i9, int i10) throws IOException {
        if (i8 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i8);
        }
        if (i10 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i11 = this.f1606a.readInt();
        int i12 = this.f1606a.readInt();
        int i13 = i8 - 8;
        C7.b bVarA = C7.b.f1465b.a(i12);
        if (bVarA == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i12);
        }
        J7.h hVarI = J7.h.f4389e;
        if (i13 > 0) {
            hVarI = this.f1606a.I(i13);
        }
        cVar.g(i11, bVarA, hVarI);
    }

    public final List v(int i8, int i9, int i10, int i11) throws IOException {
        this.f1608c.o(i8);
        b bVar = this.f1608c;
        bVar.t(bVar.b());
        this.f1608c.v(i9);
        this.f1608c.j(i10);
        this.f1608c.y(i11);
        this.f1609d.k();
        return this.f1609d.e();
    }

    public final void w0(c cVar, int i8, int i9, int i10) throws IOException {
        if (i8 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i8);
        }
        long jF = v7.d.f(this.f1606a.readInt(), 2147483647L);
        if (jF == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        cVar.h(i10, jF);
    }

    public final void y(c cVar, int i8, int i9, int i10) throws IOException {
        if (i10 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z8 = (i9 & 1) != 0;
        int iD = (i9 & 8) != 0 ? v7.d.d(this.f1606a.readByte(), 255) : 0;
        if ((i9 & 32) != 0) {
            A(cVar, i10);
            i8 -= 5;
        }
        cVar.f(z8, i10, -1, v(f1604e.b(i8, i9, iD), iD, i9, i10));
    }

    public final void z(c cVar, int i8, int i9, int i10) throws IOException {
        if (i8 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i8);
        }
        if (i10 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.k((i9 & 1) != 0, this.f1606a.readInt(), this.f1606a.readInt());
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final J7.g f1610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1613d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1614e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1615f;

        public b(J7.g source) {
            t.g(source, "source");
            this.f1610a = source;
        }

        @Override // J7.C
        public long K0(C1034e sink, long j8) throws IOException {
            t.g(sink, "sink");
            while (true) {
                int i8 = this.f1614e;
                if (i8 != 0) {
                    long jK0 = this.f1610a.K0(sink, Math.min(j8, i8));
                    if (jK0 == -1) {
                        return -1L;
                    }
                    this.f1614e -= (int) jK0;
                    return jK0;
                }
                this.f1610a.skip(this.f1615f);
                this.f1615f = 0;
                if ((this.f1612c & 4) != 0) {
                    return -1L;
                }
                c();
            }
        }

        public final int b() {
            return this.f1614e;
        }

        public final void c() throws IOException {
            int i8 = this.f1613d;
            int iJ = v7.d.J(this.f1610a);
            this.f1614e = iJ;
            this.f1611b = iJ;
            int iD = v7.d.d(this.f1610a.readByte(), 255);
            this.f1612c = v7.d.d(this.f1610a.readByte(), 255);
            a aVar = h.f1604e;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(e.f1513a.c(true, this.f1613d, this.f1611b, iD, this.f1612c));
            }
            int i9 = this.f1610a.readInt() & Integer.MAX_VALUE;
            this.f1613d = i9;
            if (iD == 9) {
                if (i9 != i8) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iD + " != TYPE_CONTINUATION");
            }
        }

        public final void j(int i8) {
            this.f1612c = i8;
        }

        public final void o(int i8) {
            this.f1614e = i8;
        }

        @Override // J7.C
        public D r() {
            return this.f1610a.r();
        }

        public final void t(int i8) {
            this.f1611b = i8;
        }

        public final void v(int i8) {
            this.f1615f = i8;
        }

        public final void y(int i8) {
            this.f1613d = i8;
        }

        @Override // J7.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
