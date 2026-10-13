package p205x6;

import C6.C0920i;
import D6.iIQ.BmWxZhjGfw;
import T0.Vl.PCRzgdeK;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p213y6.d;
import p213y6.f;
import p221z6.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f37432h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f37433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p213y6.a f37434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer f37435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f37438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f37439g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public n() {
        this(null, 0L, null, 7, null);
    }

    public static /* synthetic */ String X1(n nVar, int i8, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readText");
        }
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = Integer.MAX_VALUE;
        }
        return nVar.U1(i8, i9);
    }

    public final int A(int i8, int i9) {
        while (i8 != 0) {
            p213y6.a aVarD1 = D1(1);
            if (aVarD1 == null) {
                break;
            }
            int iMin = Math.min(aVarD1.k() - aVarD1.i(), i8);
            aVarD1.c(iMin);
            this.f37436d += iMin;
            b(aVarD1);
            i8 -= iMin;
            i9 += iMin;
        }
        return i9;
    }

    public final p213y6.a A0(p213y6.a current) {
        t.g(current, "current");
        return r0(current);
    }

    public final Void B1(int i8) {
        throw new IllegalStateException("minSize of " + i8 + " is too big (should be less than 8)");
    }

    public final p213y6.a D1(int i8) {
        p213y6.a aVarV0 = V0();
        return this.f37437e - this.f37436d >= i8 ? aVarV0 : M1(i8, aVarV0);
    }

    public p213y6.a H0() {
        p213y6.a aVar = (p213y6.a) this.f37433a.b0();
        try {
            aVar.p(8);
            int iJ0 = J0(aVar.h(), aVar.k(), aVar.g() - aVar.k());
            if (iJ0 == 0) {
                this.f37439g = true;
                if (aVar.k() <= aVar.i()) {
                    aVar.F(this.f37433a);
                    return null;
                }
            }
            aVar.a(iJ0);
            return aVar;
        } catch (Throwable th) {
            aVar.F(this.f37433a);
            throw th;
        }
    }

    public abstract int J0(ByteBuffer byteBuffer, int i8, int i9);

    public final p213y6.a K1(int i8) {
        return M1(i8, V0());
    }

    public final void L0(p213y6.a current) {
        t.g(current, "current");
        p213y6.a aVarC = current.C();
        if (aVarC == null) {
            O0(current);
            return;
        }
        int iK = current.k() - current.i();
        int iMin = Math.min(iK, 8 - (current.f() - current.g()));
        if (aVarC.j() < iMin) {
            O0(current);
            return;
        }
        d.f(aVarC, iMin);
        if (iK > iMin) {
            current.m();
            this.f37437e = current.k();
            d2(this.f37438f + ((long) iMin));
        } else {
            e2(aVarC);
            d2(this.f37438f - ((long) ((aVarC.k() - aVarC.i()) - iMin)));
            current.A();
            current.F(this.f37433a);
        }
    }

    public final p213y6.a M1(int i8, p213y6.a aVar) {
        while (true) {
            int iA1 = a1() - i1();
            if (iA1 >= i8) {
                return aVar;
            }
            p213y6.a aVarC = aVar.C();
            if (aVarC == null && (aVarC = j0()) == null) {
                return null;
            }
            if (iA1 == 0) {
                if (aVar != p213y6.a.f38436j.a()) {
                    b2(aVar);
                }
                aVar = aVarC;
            } else {
                int iA = b.a(aVar, aVarC, i8 - iA1);
                this.f37437e = aVar.k();
                d2(this.f37438f - ((long) iA));
                if (aVarC.k() > aVarC.i()) {
                    aVarC.q(iA);
                } else {
                    aVar.H(null);
                    aVar.H(aVarC.A());
                    aVarC.F(this.f37433a);
                }
                if (aVar.k() - aVar.i() >= i8) {
                    return aVar;
                }
                if (i8 > 8) {
                    B1(i8);
                    throw new C0920i();
                }
            }
        }
    }

    public final void O0(p213y6.a aVar) {
        if (this.f37439g && aVar.C() == null) {
            this.f37436d = aVar.i();
            this.f37437e = aVar.k();
            d2(0L);
            return;
        }
        int iK = aVar.k() - aVar.i();
        int iMin = Math.min(iK, 8 - (aVar.f() - aVar.g()));
        if (iK > iMin) {
            Q0(aVar, iK, iMin);
        } else {
            p213y6.a aVar2 = (p213y6.a) this.f37433a.b0();
            aVar2.p(8);
            aVar2.H(aVar.A());
            b.a(aVar2, aVar, iK);
            e2(aVar2);
        }
        aVar.F(this.f37433a);
    }

    public final int P1(Appendable appendable, int i8, int i9) throws Throwable {
        int i10;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11 = false;
        if (i9 == 0 && i8 == 0) {
            return 0;
        }
        if (T0()) {
            if (i8 == 0) {
                return 0;
            }
            o(i8);
            throw new C0920i();
        }
        if (i9 < i8) {
            r1(i8, i9);
            throw new C0920i();
        }
        p213y6.a aVarB = p213y6.g.b(this, 1);
        if (aVarB == null) {
            i10 = 0;
        } else {
            i10 = 0;
            boolean z12 = false;
            do {
                try {
                    ByteBuffer byteBufferH = aVarB.h();
                    int i11 = aVarB.i();
                    int iK = aVarB.k();
                    int i12 = i11;
                    while (true) {
                        if (i12 >= iK) {
                            aVarB.c(iK - i11);
                            z8 = true;
                            break;
                        }
                        byte b8 = byteBufferH.get(i12);
                        int i13 = b8 & 255;
                        if ((b8 & 128) != 128) {
                            char c8 = (char) i13;
                            if (i10 == i9) {
                                z10 = false;
                            } else {
                                appendable.append(c8);
                                i10++;
                                z10 = true;
                            }
                            if (z10) {
                                i12++;
                            }
                        }
                        aVarB.c(i12 - i11);
                        z8 = false;
                        break;
                    }
                    if (z8) {
                        z9 = true;
                    } else if (i10 == i9) {
                        z9 = false;
                    } else {
                        z9 = false;
                        z12 = true;
                    }
                    if (!z9) {
                        p213y6.g.a(this, aVarB);
                        break;
                    }
                    try {
                        aVarB = p213y6.g.c(this, aVarB);
                    } catch (Throwable th) {
                        th = th;
                        if (z11) {
                            p213y6.g.a(this, aVarB);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z11 = true;
                }
            } while (aVarB != null);
            z11 = z12;
        }
        if (z11) {
            return i10 + Z1(appendable, i8 - i10, i9 - i10);
        }
        if (i10 >= i8) {
            return i10;
        }
        C1(i8, i10);
        throw new C0920i();
    }

    public final void Q0(p213y6.a aVar, int i8, int i9) {
        p213y6.a aVar2 = (p213y6.a) this.f37433a.b0();
        p213y6.a aVar3 = (p213y6.a) this.f37433a.b0();
        aVar2.p(8);
        aVar3.p(8);
        aVar2.H(aVar3);
        aVar3.H(aVar.A());
        b.a(aVar2, aVar, i8 - i9);
        b.a(aVar3, aVar, i9);
        e2(aVar2);
        d2(h.e(aVar3));
    }

    public final byte R1() throws EOFException {
        int i8 = this.f37436d;
        if (i8 < this.f37437e) {
            byte b8 = this.f37435c.get(i8);
            this.f37436d = i8;
            p213y6.a aVar = this.f37434b;
            aVar.d(i8);
            r0(aVar);
            return b8;
        }
        p213y6.a aVarD1 = D1(1);
        if (aVarD1 == null) {
            y.a(1);
            throw new C0920i();
        }
        byte bL = aVarD1.l();
        p213y6.g.a(this, aVarD1);
        return bL;
    }

    public final boolean T0() {
        if (a1() - i1() == 0 && this.f37438f == 0) {
            return this.f37439g || j0() == null;
        }
        return false;
    }

    public final String U1(int i8, int i9) throws Throwable {
        if (i8 == 0 && (i9 == 0 || T0())) {
            return "";
        }
        long jO1 = o1();
        if (jO1 > 0 && i9 >= jO1) {
            return y.g(this, (int) jO1, null, 2, null);
        }
        StringBuilder sb = new StringBuilder(W6.n.g(W6.n.d(i8, 16), i9));
        P1(sb, i8, i9);
        String string = sb.toString();
        t.f(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final p213y6.a V0() {
        p213y6.a aVar = this.f37434b;
        aVar.d(this.f37436d);
        return aVar;
    }

    public final long Y(long j8, long j9) {
        p213y6.a aVarD1;
        while (j8 != 0 && (aVarD1 = D1(1)) != null) {
            int iMin = (int) Math.min(aVarD1.k() - aVarD1.i(), j8);
            aVarD1.c(iMin);
            this.f37436d += iMin;
            b(aVarD1);
            long j10 = iMin;
            j8 -= j10;
            j9 += j10;
        }
        return j9;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0166  */
    public final int Z1(Appendable appendable, int i8, int i9) throws Throwable {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        p213y6.a aVarC;
        int i16;
        int i17 = 1;
        p213y6.a aVarB = p213y6.g.b(this, 1);
        if (aVarB == null) {
            i16 = 0;
        } else {
            int i18 = 1;
            int i19 = 0;
            do {
                try {
                    int iK = aVarB.k() - aVarB.i();
                    if (iK >= i18) {
                        try {
                            ByteBuffer byteBufferH = aVarB.h();
                            int i20 = aVarB.i();
                            int iK2 = aVarB.k();
                            int i21 = i20;
                            int i22 = 0;
                            int i23 = 0;
                            int i24 = 0;
                            while (true) {
                                if (i21 >= iK2) {
                                    i10 = i17;
                                    aVarB.c(iK2 - i20);
                                    i11 = 0;
                                    break;
                                }
                                byte b8 = byteBufferH.get(i21);
                                i10 = i17;
                                int i25 = b8 & 255;
                                i11 = -1;
                                if ((b8 & 128) == 0) {
                                    if (i22 != 0) {
                                        f.j(i22);
                                        throw new C0920i();
                                    }
                                    char c8 = (char) i25;
                                    if (i19 == i9) {
                                        i15 = 0;
                                    } else {
                                        appendable.append(c8);
                                        i19++;
                                        i15 = i10;
                                    }
                                    if (i15 == 0) {
                                        try {
                                            aVarB.c(i21 - i20);
                                            break;
                                        } catch (Throwable th) {
                                            th = th;
                                            aVarB.k();
                                            aVarB.i();
                                            throw th;
                                        }
                                    }
                                    i21++;
                                    i17 = i10;
                                } else if (i22 == 0) {
                                    int i26 = 128;
                                    i23 = i25;
                                    for (int i27 = i10; i27 < 7 && (i23 & i26) != 0; i27++) {
                                        i23 &= ~i26;
                                        i26 >>= 1;
                                        i22++;
                                    }
                                    int i28 = i22 - 1;
                                    if (i22 > iK2 - i21) {
                                        aVarB.c(i21 - i20);
                                        i11 = i22;
                                        break;
                                    }
                                    i24 = i22;
                                    i22 = i28;
                                    i21++;
                                    i17 = i10;
                                } else {
                                    i23 = (i23 << 6) | (b8 & 127);
                                    i22--;
                                    if (i22 != 0) {
                                        continue;
                                    } else {
                                        if (!f.g(i23)) {
                                            if (!f.h(i23)) {
                                                f.k(i23);
                                                throw new C0920i();
                                            }
                                            char cF = (char) f.f(i23);
                                            if (i19 == i9) {
                                                i12 = 0;
                                            } else {
                                                appendable.append(cF);
                                                i19++;
                                                i12 = i10;
                                            }
                                            if (i12 != 0) {
                                                char cI = (char) f.i(i23);
                                                if (i19 == i9) {
                                                    i13 = 0;
                                                } else {
                                                    appendable.append(cI);
                                                    i19++;
                                                    i13 = i10;
                                                }
                                                if (i13 == 0) {
                                                }
                                                i23 = 0;
                                            }
                                            aVarB.c(((i21 - i20) - i24) + 1);
                                            break;
                                        }
                                        char c9 = (char) i23;
                                        if (i19 == i9) {
                                            i14 = 0;
                                        } else {
                                            appendable.append(c9);
                                            i19++;
                                            i14 = i10;
                                        }
                                        if (i14 == 0) {
                                            aVarB.c(((i21 - i20) - i24) + 1);
                                            break;
                                        }
                                        i23 = 0;
                                    }
                                    i21++;
                                    i17 = i10;
                                }
                            }
                            i18 = i11 == 0 ? i10 : i11 > 0 ? i11 : 0;
                            try {
                                iK = aVarB.k() - aVarB.i();
                            } catch (Throwable th2) {
                                th = th2;
                                i17 = i10;
                                if (i17 != 0) {
                                    p213y6.g.a(this, aVarB);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            i10 = i17;
                        }
                    } else {
                        i10 = i17;
                    }
                    if (iK == 0) {
                        try {
                            aVarC = p213y6.g.c(this, aVarB);
                        } catch (Throwable th4) {
                            th = th4;
                            i17 = 0;
                            if (i17 != 0) {
                                p213y6.g.a(this, aVarB);
                            }
                            throw th;
                        }
                    } else if (iK < i18 || aVarB.f() - aVarB.g() < 8) {
                        p213y6.g.a(this, aVarB);
                        aVarC = p213y6.g.b(this, i18);
                    } else {
                        aVarC = aVarB;
                    }
                    if (aVarC == null) {
                        i17 = 0;
                        break;
                    }
                    aVarB = aVarC;
                    i17 = i10;
                } catch (Throwable th5) {
                    th = th5;
                }
            } while (i18 > 0);
            if (i17 != 0) {
                p213y6.g.a(this, aVarB);
            }
            i16 = i19;
        }
        if (i16 >= i8) {
            return i16;
        }
        C1(i8, i16);
        throw new C0920i();
    }

    public final int a1() {
        return this.f37437e;
    }

    public final void a2() {
        p213y6.a aVarV0 = V0();
        p213y6.a aVarA = p213y6.a.f38436j.a();
        if (aVarV0 != aVarA) {
            e2(aVarA);
            d2(0L);
            h.d(aVarV0, this.f37433a);
        }
    }

    public final void b(p213y6.a aVar) {
        if (aVar.k() - aVar.i() == 0) {
            b2(aVar);
        }
    }

    public final p213y6.a b2(p213y6.a head) {
        t.g(head, "head");
        p213y6.a aVarA = head.A();
        if (aVarA == null) {
            aVarA = p213y6.a.f38436j.a();
        }
        e2(aVarA);
        d2(this.f37438f - ((long) (aVarA.k() - aVarA.i())));
        head.F(this.f37433a);
        return aVarA;
    }

    public final void c(p213y6.a chain) {
        t.g(chain, "chain");
        y6.a.d dVar = p213y6.a.f38436j;
        if (chain == dVar.a()) {
            return;
        }
        long jE = h.e(chain);
        if (this.f37434b == dVar.a()) {
            e2(chain);
            d2(jE - ((long) (a1() - i1())));
        } else {
            h.c(this.f37434b).H(chain);
            d2(this.f37438f + jE);
        }
    }

    public final void c2(int i8) {
        this.f37436d = i8;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a2();
        if (!this.f37439g) {
            this.f37439g = true;
        }
        v();
    }

    public final void d2(long j8) {
        if (j8 >= 0) {
            this.f37438f = j8;
            return;
        }
        throw new IllegalArgumentException(("tailRemaining shouldn't be negative: " + j8).toString());
    }

    public final void e2(p213y6.a aVar) {
        this.f37434b = aVar;
        this.f37435c = aVar.h();
        this.f37436d = aVar.i();
        this.f37437e = aVar.k();
    }

    public final p213y6.a f2() {
        p213y6.a aVarV0 = V0();
        p213y6.a aVarC = aVarV0.C();
        p213y6.a aVarA = p213y6.a.f38436j.a();
        if (aVarV0 == aVarA) {
            return null;
        }
        if (aVarC == null) {
            e2(aVarA);
            d2(0L);
        } else {
            e2(aVarC);
            d2(this.f37438f - ((long) (aVarC.k() - aVarC.i())));
        }
        aVarV0.H(null);
        return aVarV0;
    }

    public final ByteBuffer g1() {
        return this.f37435c;
    }

    public final p213y6.a g2() {
        p213y6.a aVarV0 = V0();
        p213y6.a aVarA = p213y6.a.f38436j.a();
        if (aVarV0 == aVarA) {
            return null;
        }
        e2(aVarA);
        d2(0L);
        return aVarV0;
    }

    public final boolean h2(p213y6.a chain) {
        t.g(chain, "chain");
        p213y6.a aVarC = h.c(V0());
        int iK = chain.k() - chain.i();
        if (iK == 0 || aVarC.g() - aVarC.k() < iK) {
            return false;
        }
        b.a(aVarC, chain, iK);
        if (V0() == aVarC) {
            this.f37437e = aVarC.k();
            return true;
        }
        d2(this.f37438f + ((long) iK));
        return true;
    }

    public final void i0(int i8) throws EOFException {
        if (y(i8) == i8) {
            return;
        }
        throw new EOFException("Unable to discard " + i8 + " bytes due to end of packet");
    }

    public final int i1() {
        return this.f37436d;
    }

    public final p213y6.a j0() {
        if (this.f37439g) {
            return null;
        }
        p213y6.a aVarH0 = H0();
        if (aVarH0 == null) {
            this.f37439g = true;
            return null;
        }
        j(aVarH0);
        return aVarH0;
    }

    public final g k1() {
        return this.f37433a;
    }

    public final Void o(int i8) throws EOFException {
        throw new EOFException("at least " + i8 + " characters required but no bytes available");
    }

    public final long o1() {
        return ((long) (a1() - i1())) + this.f37438f;
    }

    public final boolean p1(int i8) {
        return ((long) (a1() - i1())) + this.f37438f >= ((long) i8);
    }

    public final void q1() {
        if (this.f37439g) {
            return;
        }
        this.f37439g = true;
    }

    public final p213y6.a r0(p213y6.a current) {
        t.g(current, "current");
        return w0(current, p213y6.a.f38436j.a());
    }

    public final Void r1(int i8, int i9) {
        throw new IllegalArgumentException("min should be less or equal to max but min = " + i8 + ", max = " + i9);
    }

    public final byte readByte() {
        int i8 = this.f37436d;
        int i9 = i8 + 1;
        if (i9 >= this.f37437e) {
            return R1();
        }
        this.f37436d = i9;
        return this.f37435c.get(i8);
    }

    public final boolean t() {
        return (this.f37436d == this.f37437e && this.f37438f == 0) ? false : true;
    }

    public abstract void v();

    public final p213y6.a w0(p213y6.a aVar, p213y6.a aVar2) {
        while (aVar != aVar2) {
            p213y6.a aVarA = aVar.A();
            aVar.F(this.f37433a);
            if (aVarA == null) {
                e2(aVar2);
                d2(0L);
                aVar = aVar2;
            } else {
                if (aVarA.k() > aVarA.i()) {
                    e2(aVarA);
                    d2(this.f37438f - ((long) (aVarA.k() - aVarA.i())));
                    return aVarA;
                }
                aVar = aVarA;
            }
        }
        return j0();
    }

    public final int y(int i8) {
        if (i8 >= 0) {
            return A(i8, 0);
        }
        throw new IllegalArgumentException(("Negative discard is not allowed: " + i8).toString());
    }

    public final long z(long j8) {
        if (j8 <= 0) {
            return 0L;
        }
        return Y(j8, 0L);
    }

    public n(p213y6.a head, long j8, g pool) {
        t.g(head, "head");
        t.g(pool, "pool");
        this.f37433a = pool;
        this.f37434b = head;
        this.f37435c = head.h();
        this.f37436d = head.i();
        int iK = head.k();
        this.f37437e = iK;
        this.f37438f = j8 - ((long) (iK - this.f37436d));
    }

    public final Void C1(int i8, int i9) throws d {
        throw new d(BmWxZhjGfw.EEQncULqlfTtM + i8 + " chars but had only " + i9);
    }

    public final void j(p213y6.a aVar) {
        p213y6.a aVarC = h.c(this.f37434b);
        if (aVarC != p213y6.a.f38436j.a()) {
            aVarC.H(aVar);
            d2(this.f37438f + h.e(aVar));
            return;
        }
        e2(aVar);
        if (this.f37438f != 0) {
            throw new IllegalStateException(PCRzgdeK.HjLt);
        }
        p213y6.a aVarC2 = aVar.C();
        d2(aVarC2 != null ? h.e(aVarC2) : 0L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n(p213y6.a aVar, long j8, g gVar, int i8, AbstractC2633k abstractC2633k) {
        aVar = (i8 & 1) != 0 ? p213y6.a.f38436j.a() : aVar;
        this(aVar, (i8 & 2) != 0 ? h.e(aVar) : j8, (i8 & 4) != 0 ? p213y6.a.f38436j.c() : gVar);
    }
}
