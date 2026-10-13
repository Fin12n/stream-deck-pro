package p205x6;

import C6.C0920i;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.t;
import p189v6.c;
import p213y6.a;
import p213y6.b;
import p213y6.e;
import p213y6.f;
import p221z6.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s implements Appendable, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f37440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f37441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f37442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f37443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f37447h;

    public s(g pool) {
        t.g(pool, "pool");
        this.f37440a = pool;
        this.f37443d = c.f35174a.a();
    }

    public final a A() {
        a aVar = (a) this.f37440a.b0();
        aVar.p(8);
        Y(aVar);
        return aVar;
    }

    public final g A0() {
        return this.f37440a;
    }

    public final void B1(a aVar, a aVar2) {
        b.c(aVar, aVar2);
        a aVar3 = this.f37441b;
        if (aVar3 == null) {
            throw new IllegalStateException("head should't be null since it is already handled in the fast-path");
        }
        if (aVar3 == aVar2) {
            this.f37441b = aVar;
        } else {
            while (true) {
                a aVarC = aVar3.C();
                t.d(aVarC);
                if (aVarC == aVar2) {
                    break;
                } else {
                    aVar3 = aVarC;
                }
            }
            aVar3.H(aVar);
        }
        aVar2.F(this.f37440a);
        this.f37442c = h.c(aVar);
    }

    public final int H0() {
        return this.f37445f;
    }

    public final ByteBuffer J0() {
        return this.f37443d;
    }

    public final int L0() {
        return this.f37444e;
    }

    public final int O0() {
        return this.f37447h + (this.f37444e - this.f37446g);
    }

    public final a Q0(int i8) {
        a aVar;
        if (H0() - L0() < i8 || (aVar = this.f37442c) == null) {
            return A();
        }
        aVar.b(this.f37444e);
        return aVar;
    }

    public final void T0() {
        close();
    }

    public final void V0(int i8) {
        this.f37444e = i8;
    }

    public final void Y(a buffer) {
        t.g(buffer, "buffer");
        if (buffer.C() != null) {
            throw new IllegalStateException("It should be a single buffer chunk.");
        }
        y(buffer, buffer, 0);
    }

    public final a a1() {
        a aVar = this.f37441b;
        if (aVar == null) {
            return null;
        }
        a aVar2 = this.f37442c;
        if (aVar2 != null) {
            aVar2.b(this.f37444e);
        }
        this.f37441b = null;
        this.f37442c = null;
        this.f37444e = 0;
        this.f37445f = 0;
        this.f37446g = 0;
        this.f37447h = 0;
        this.f37443d = c.f35174a.a();
        return aVar;
    }

    public final void b() {
        a aVarW0 = w0();
        if (aVarW0 != a.f38436j.a()) {
            if (aVarW0.C() != null) {
                throw new IllegalStateException("Check failed.");
            }
            aVarW0.t();
            aVarW0.p(8);
            int iK = aVarW0.k();
            this.f37444e = iK;
            this.f37446g = iK;
            this.f37445f = aVarW0.g();
        }
    }

    public final void c() {
        a aVar = this.f37442c;
        if (aVar != null) {
            this.f37444e = aVar.k();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            flush();
        } finally {
            i0();
        }
    }

    public final void flush() {
        r0();
    }

    public final void g1(byte b8) throws r {
        int i8 = this.f37444e;
        if (i8 >= this.f37445f) {
            i1(b8);
        } else {
            this.f37444e = i8 + 1;
            this.f37443d.put(i8, b8);
        }
    }

    public abstract void i0();

    public final void i1(byte b8) throws r {
        A().v(b8);
        this.f37444e++;
    }

    @Override // java.lang.Appendable
    public s j(char c8) {
        int i8 = this.f37444e;
        int i9 = 3;
        if (this.f37445f - i8 < 3) {
            z(c8);
            return this;
        }
        ByteBuffer byteBuffer = this.f37443d;
        if (c8 >= 0 && c8 < 128) {
            byteBuffer.put(i8, (byte) c8);
            i9 = 1;
        } else if (128 <= c8 && c8 < 2048) {
            byteBuffer.put(i8, (byte) (((c8 >> 6) & 31) | 192));
            byteBuffer.put(i8 + 1, (byte) ((c8 & '?') | 128));
            i9 = 2;
        } else if (2048 <= c8 && c8 < 0) {
            byteBuffer.put(i8, (byte) (((c8 >> '\f') & 15) | 224));
            byteBuffer.put(i8 + 1, (byte) (((c8 >> 6) & 63) | 128));
            byteBuffer.put(i8 + 2, (byte) ((c8 & '?') | 128));
        } else {
            if (0 > c8 || c8 >= 0) {
                f.k(c8);
                throw new C0920i();
            }
            byteBuffer.put(i8, (byte) (((c8 >> 18) & 7) | 240));
            byteBuffer.put(i8 + 1, (byte) (((c8 >> '\f') & 63) | 128));
            byteBuffer.put(i8 + 2, (byte) (((c8 >> 6) & 63) | 128));
            byteBuffer.put(i8 + 3, (byte) ((c8 & '?') | 128));
            i9 = 4;
        }
        this.f37444e = i8 + i9;
        return this;
    }

    public abstract void j0(ByteBuffer byteBuffer, int i8, int i9);

    public final void k1(a chunkBuffer) {
        t.g(chunkBuffer, "chunkBuffer");
        a aVar = this.f37442c;
        if (aVar == null) {
            v(chunkBuffer);
        } else {
            r1(aVar, chunkBuffer, this.f37440a);
        }
    }

    @Override // java.lang.Appendable
    public s o(CharSequence charSequence) {
        if (charSequence == null) {
            t("null", 0, 4);
            return this;
        }
        t(charSequence, 0, charSequence.length());
        return this;
    }

    public final void o1(k packet) {
        t.g(packet, "packet");
        a aVarG2 = packet.g2();
        if (aVarG2 == null) {
            packet.a2();
            return;
        }
        a aVar = this.f37442c;
        if (aVar == null) {
            v(aVarG2);
        } else {
            r1(aVar, aVarG2, packet.k1());
        }
    }

    public final void p1(k p8, int i8) throws EOFException {
        t.g(p8, "p");
        while (i8 > 0) {
            int iA1 = p8.a1() - p8.i1();
            if (iA1 > i8) {
                a aVarD1 = p8.D1(1);
                if (aVarD1 == null) {
                    y.a(1);
                    throw new C0920i();
                }
                int i9 = aVarD1.i();
                try {
                    u.a(this, aVarD1, i8);
                    int i10 = aVarD1.i();
                    if (i10 < i9) {
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                    if (i10 == aVarD1.k()) {
                        p8.r0(aVarD1);
                        return;
                    } else {
                        p8.c2(i10);
                        return;
                    }
                } catch (Throwable th) {
                    int i11 = aVarD1.i();
                    if (i11 < i9) {
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                    if (i11 == aVarD1.k()) {
                        p8.r0(aVarD1);
                    } else {
                        p8.c2(i11);
                    }
                    throw th;
                }
            }
            i8 -= iA1;
            a aVarF2 = p8.f2();
            if (aVarF2 == null) {
                throw new EOFException("Unexpected end of packet");
            }
            Y(aVarF2);
        }
    }

    public final void q1(k p8, long j8) throws EOFException {
        t.g(p8, "p");
        while (j8 > 0) {
            long jA1 = p8.a1() - p8.i1();
            if (jA1 > j8) {
                a aVarD1 = p8.D1(1);
                if (aVarD1 == null) {
                    y.a(1);
                    throw new C0920i();
                }
                int i8 = aVarD1.i();
                try {
                    u.a(this, aVarD1, (int) j8);
                    int i9 = aVarD1.i();
                    if (i9 < i8) {
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                    if (i9 == aVarD1.k()) {
                        p8.r0(aVarD1);
                        return;
                    } else {
                        p8.c2(i9);
                        return;
                    }
                } catch (Throwable th) {
                    int i10 = aVarD1.i();
                    if (i10 < i8) {
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                    if (i10 == aVarD1.k()) {
                        p8.r0(aVarD1);
                    } else {
                        p8.c2(i10);
                    }
                    throw th;
                }
            }
            j8 -= jA1;
            a aVarF2 = p8.f2();
            if (aVarF2 == null) {
                throw new EOFException("Unexpected end of packet");
            }
            Y(aVarF2);
        }
    }

    public final void r0() {
        a aVarA1 = a1();
        if (aVarA1 == null) {
            return;
        }
        a aVarC = aVarA1;
        do {
            try {
                j0(aVarC.h(), aVarC.i(), aVarC.k() - aVarC.i());
                aVarC = aVarC.C();
            } finally {
                h.d(aVarA1, this.f37440a);
            }
        } while (aVarC != null);
    }

    public final void r1(a aVar, a aVar2, g gVar) {
        aVar.b(this.f37444e);
        int iK = aVar.k() - aVar.i();
        int iK2 = aVar2.k() - aVar2.i();
        int iA = w.a();
        if (iK2 >= iA || iK2 > (aVar.f() - aVar.g()) + (aVar.g() - aVar.k())) {
            iK2 = -1;
        }
        if (iK >= iA || iK > aVar2.j() || !b.a(aVar2)) {
            iK = -1;
        }
        if (iK2 == -1 && iK == -1) {
            v(aVar2);
            return;
        }
        if (iK == -1 || iK2 <= iK) {
            b.a(aVar, aVar2, (aVar.g() - aVar.k()) + (aVar.f() - aVar.g()));
            c();
            a aVarA = aVar2.A();
            if (aVarA != null) {
                v(aVarA);
            }
            aVar2.F(gVar);
            return;
        }
        if (iK2 == -1 || iK < iK2) {
            B1(aVar2, aVar);
            return;
        }
        throw new IllegalStateException("prep = " + iK + ", app = " + iK2);
    }

    @Override // java.lang.Appendable
    public s t(CharSequence charSequence, int i8, int i9) {
        if (charSequence == null) {
            return t("null", i8, i9);
        }
        y.h(this, charSequence, i8, i9, Z6.c.f12941b);
        return this;
    }

    public final void v(a head) {
        t.g(head, "head");
        a aVarC = h.c(head);
        long jE = h.e(head) - ((long) (aVarC.k() - aVarC.i()));
        if (jE < 2147483647L) {
            y(head, aVarC, (int) jE);
        } else {
            e.a(jE, "total size increase");
            throw new C0920i();
        }
    }

    public final a w0() {
        a aVar = this.f37441b;
        return aVar == null ? a.f38436j.a() : aVar;
    }

    public final void y(a aVar, a aVar2, int i8) {
        a aVar3 = this.f37442c;
        if (aVar3 == null) {
            this.f37441b = aVar;
            this.f37447h = 0;
        } else {
            aVar3.H(aVar);
            int i9 = this.f37444e;
            aVar3.b(i9);
            this.f37447h += i9 - this.f37446g;
        }
        this.f37442c = aVar2;
        this.f37447h += i8;
        this.f37443d = aVar2.h();
        this.f37444e = aVar2.k();
        this.f37446g = aVar2.i();
        this.f37445f = aVar2.g();
    }

    public final void z(char c8) {
        int i8 = 3;
        a aVarQ0 = Q0(3);
        try {
            ByteBuffer byteBufferH = aVarQ0.h();
            int iK = aVarQ0.k();
            if (c8 >= 0 && c8 < 128) {
                byteBufferH.put(iK, (byte) c8);
                i8 = 1;
            } else if (128 <= c8 && c8 < 2048) {
                byteBufferH.put(iK, (byte) (((c8 >> 6) & 31) | 192));
                byteBufferH.put(iK + 1, (byte) ((c8 & '?') | 128));
                i8 = 2;
            } else if (2048 <= c8 && c8 < 0) {
                byteBufferH.put(iK, (byte) (((c8 >> '\f') & 15) | 224));
                byteBufferH.put(iK + 1, (byte) (((c8 >> 6) & 63) | 128));
                byteBufferH.put(iK + 2, (byte) ((c8 & '?') | 128));
            } else {
                if (0 > c8 || c8 >= 0) {
                    f.k(c8);
                    throw new C0920i();
                }
                byteBufferH.put(iK, (byte) (((c8 >> 18) & 7) | 240));
                byteBufferH.put(iK + 1, (byte) (((c8 >> '\f') & 63) | 128));
                byteBufferH.put(iK + 2, (byte) (((c8 >> 6) & 63) | 128));
                byteBufferH.put(iK + 3, (byte) ((c8 & '?') | 128));
                i8 = 4;
            }
            aVarQ0.a(i8);
            c();
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public s() {
        this(a.f38436j.c());
    }
}
