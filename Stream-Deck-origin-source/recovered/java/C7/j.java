package C7;

import J7.C1034e;
import J7.InterfaceC1035f;
import M6.eLZq.eGwOBWCdOTaKus;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p043e6.dT.GIGvBf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f1644g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f1645h = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1035f f1646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1034e f1648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d.b f1651f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public j(InterfaceC1035f sink, boolean z8) {
        t.g(sink, "sink");
        this.f1646a = sink;
        this.f1647b = z8;
        C1034e c1034e = new C1034e();
        this.f1648c = c1034e;
        this.f1649d = 16384;
        this.f1651f = new d.b(0, false, c1034e, 3, null);
    }

    public final synchronized void A(boolean z8, int i8, int i9) {
        if (this.f1650e) {
            throw new IOException("closed");
        }
        t(0, 8, 6, z8 ? 1 : 0);
        this.f1646a.writeInt(i8);
        this.f1646a.writeInt(i9);
        this.f1646a.flush();
    }

    public final synchronized void Y(int i8, int i9, List requestHeaders) {
        t.g(requestHeaders, "requestHeaders");
        if (this.f1650e) {
            throw new IOException(GIGvBf.DEXkkuFUKgz);
        }
        this.f1651f.g(requestHeaders);
        long size = this.f1648c.size();
        int iMin = (int) Math.min(((long) this.f1649d) - 4, size);
        long j8 = iMin;
        t(i8, iMin + 4, 5, size == j8 ? 4 : 0);
        this.f1646a.writeInt(i9 & Integer.MAX_VALUE);
        this.f1646a.I1(this.f1648c, j8);
        if (size > j8) {
            w0(i8, size - j8);
        }
    }

    public final synchronized void b(m peerSettings) {
        try {
            t.g(peerSettings, "peerSettings");
            if (this.f1650e) {
                throw new IOException("closed");
            }
            this.f1649d = peerSettings.e(this.f1649d);
            if (peerSettings.b() != -1) {
                this.f1651f.e(peerSettings.b());
            }
            t(0, 0, 4, 1);
            this.f1646a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f1650e) {
                throw new IOException("closed");
            }
            if (this.f1647b) {
                Logger logger = f1645h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(v7.d.t(">> CONNECTION " + e.f1514b.x(), new Object[0]));
                }
                this.f1646a.R0(e.f1514b);
                this.f1646a.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f1650e = true;
        this.f1646a.close();
    }

    public final synchronized void flush() {
        if (this.f1650e) {
            throw new IOException("closed");
        }
        this.f1646a.flush();
    }

    public final synchronized void i0(int i8, b errorCode) {
        t.g(errorCode, "errorCode");
        if (this.f1650e) {
            throw new IOException("closed");
        }
        if (errorCode.b() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        t(i8, 4, 3, 0);
        this.f1646a.writeInt(errorCode.b());
        this.f1646a.flush();
    }

    public final synchronized void j(boolean z8, int i8, C1034e c1034e, int i9) {
        if (this.f1650e) {
            throw new IOException("closed");
        }
        o(i8, z8 ? 1 : 0, c1034e, i9);
    }

    public final synchronized void j0(m settings) {
        int i8;
        try {
            t.g(settings, "settings");
            if (this.f1650e) {
                throw new IOException("closed");
            }
            int i9 = 0;
            t(0, settings.i() * 6, 4, 0);
            while (i9 < 10) {
                if (settings.f(i9)) {
                    if (i9 != 4) {
                        i8 = i9 != 7 ? i9 : 4;
                    } else {
                        i8 = 3;
                    }
                    this.f1646a.writeShort(i8);
                    this.f1646a.writeInt(settings.a(i9));
                }
                i9++;
            }
            this.f1646a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o(int i8, int i9, C1034e c1034e, int i10) {
        t(i8, i10, 0, i9);
        if (i10 > 0) {
            InterfaceC1035f interfaceC1035f = this.f1646a;
            t.d(c1034e);
            interfaceC1035f.I1(c1034e, i10);
        }
    }

    public final synchronized void r0(int i8, long j8) {
        if (this.f1650e) {
            throw new IOException("closed");
        }
        if (j8 == 0 || j8 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j8).toString());
        }
        t(i8, 4, 8, 0);
        this.f1646a.writeInt((int) j8);
        this.f1646a.flush();
    }

    public final void t(int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        Logger logger = f1645h;
        if (logger.isLoggable(Level.FINE)) {
            i12 = i8;
            i13 = i9;
            i14 = i10;
            i15 = i11;
            logger.fine(e.f1513a.c(false, i12, i13, i14, i15));
        } else {
            i12 = i8;
            i13 = i9;
            i14 = i10;
            i15 = i11;
        }
        if (i13 > this.f1649d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f1649d + ": " + i13).toString());
        }
        if ((Integer.MIN_VALUE & i12) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i12).toString());
        }
        v7.d.b0(this.f1646a, i13);
        this.f1646a.writeByte(i14 & 255);
        this.f1646a.writeByte(i15 & 255);
        this.f1646a.writeInt(Integer.MAX_VALUE & i12);
    }

    public final synchronized void v(int i8, b errorCode, byte[] debugData) {
        try {
            t.g(errorCode, "errorCode");
            t.g(debugData, "debugData");
            if (this.f1650e) {
                throw new IOException("closed");
            }
            if (errorCode.b() == -1) {
                throw new IllegalArgumentException(eGwOBWCdOTaKus.bnISnaQbXh);
            }
            t(0, debugData.length + 8, 7, 0);
            this.f1646a.writeInt(i8);
            this.f1646a.writeInt(errorCode.b());
            if (!(debugData.length == 0)) {
                this.f1646a.write(debugData);
            }
            this.f1646a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void w0(int i8, long j8) {
        while (j8 > 0) {
            long jMin = Math.min(this.f1649d, j8);
            j8 -= jMin;
            t(i8, (int) jMin, 9, j8 == 0 ? 4 : 0);
            this.f1646a.I1(this.f1648c, jMin);
        }
    }

    public final synchronized void y(boolean z8, int i8, List headerBlock) {
        t.g(headerBlock, "headerBlock");
        if (this.f1650e) {
            throw new IOException("closed");
        }
        this.f1651f.g(headerBlock);
        long size = this.f1648c.size();
        long jMin = Math.min(this.f1649d, size);
        int i9 = size == jMin ? 4 : 0;
        if (z8) {
            i9 |= 1;
        }
        t(i8, (int) jMin, 1, i9);
        this.f1646a.I1(this.f1648c, jMin);
        if (size > jMin) {
            w0(i8, size - jMin);
        }
    }

    public final int z() {
        return this.f1649d;
    }
}
