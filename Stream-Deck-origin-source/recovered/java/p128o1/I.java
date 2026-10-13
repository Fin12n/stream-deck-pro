package p128o1;

import A1.v;
import C6.InterfaceC0916e;
import R0.AbstractC1582d0;
import R0.C1598l0;
import R0.R0;
import T0.g;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p116m7.kKPq.toqHM;
import p168t1.AbstractC3009n;
import p168t1.C;
import p168t1.y;
import p168t1.z;
import p184v1.e;
import p216z1.f;
import p216z1.h;
import p216z1.j;
import p216z1.k;
import p216z1.l;
import p216z1.n;
import p216z1.o;
import p216z1.q;
import p216z1.s;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f30761d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final I f30762e = new I(0, 0, (C) null, (y) null, (z) null, (AbstractC3009n) null, (String) null, 0, (p216z1.a) null, (o) null, (e) null, 0, (k) null, (R0) null, (g) null, 0, 0, 0, (q) null, (z) null, (h) null, 0, 0, (s) null, 16777215, (AbstractC2633k) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f30763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f30764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f30765c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final I a() {
            return I.f30762e;
        }

        public a() {
        }
    }

    public /* synthetic */ I(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, p216z1.a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, g gVar, int i8, int i9, long j12, q qVar, z zVar2, h hVar, int i10, int i11, s sVar, AbstractC2633k abstractC2633k) {
        this(j8, j9, c8, yVar, zVar, abstractC3009n, str, j10, aVar, oVar, eVar, j11, kVar, r8, gVar, i8, i9, j12, qVar, zVar2, hVar, i10, i11, sVar);
    }

    public static /* synthetic */ I c(I i8, long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, p216z1.a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, g gVar, int i9, int i10, long j12, q qVar, z zVar2, h hVar, int i11, int i12, s sVar, int i13, Object obj) {
        s sVarK;
        int i14;
        long jG = (i13 & 1) != 0 ? i8.f30763a.g() : j8;
        long jK = (i13 & 2) != 0 ? i8.f30763a.k() : j9;
        C cN = (i13 & 4) != 0 ? i8.f30763a.n() : c8;
        y yVarL = (i13 & 8) != 0 ? i8.f30763a.l() : yVar;
        z zVarM = (i13 & 16) != 0 ? i8.f30763a.m() : zVar;
        AbstractC3009n abstractC3009nI = (i13 & 32) != 0 ? i8.f30763a.i() : abstractC3009n;
        String strJ = (i13 & 64) != 0 ? i8.f30763a.j() : str;
        long jO = (i13 & 128) != 0 ? i8.f30763a.o() : j10;
        p216z1.a aVarE = (i13 & 256) != 0 ? i8.f30763a.e() : aVar;
        o oVarU = (i13 & 512) != 0 ? i8.f30763a.u() : oVar;
        e eVarP = (i13 & 1024) != 0 ? i8.f30763a.p() : eVar;
        long j13 = jG;
        long jD = (i13 & 2048) != 0 ? i8.f30763a.d() : j11;
        k kVarS = (i13 & 4096) != 0 ? i8.f30763a.s() : kVar;
        R0 r0R = (i13 & 8192) != 0 ? i8.f30763a.r() : r8;
        k kVar2 = kVarS;
        g gVarH = (i13 & 16384) != 0 ? i8.f30763a.h() : gVar;
        int iH = (i13 & 32768) != 0 ? i8.f30764b.h() : i9;
        int i15 = (i13 & 65536) != 0 ? i8.f30764b.i() : i10;
        long jE = (i13 & 131072) != 0 ? i8.f30764b.e() : j12;
        q qVarJ = (i13 & 262144) != 0 ? i8.f30764b.j() : qVar;
        z zVar3 = (i13 & 524288) != 0 ? i8.f30765c : zVar2;
        h hVarF = (i13 & 1048576) != 0 ? i8.f30764b.f() : hVar;
        int iD = (i13 & 2097152) != 0 ? i8.f30764b.d() : i11;
        int iC = (i13 & 4194304) != 0 ? i8.f30764b.c() : i12;
        if ((i13 & 8388608) != 0) {
            i14 = iC;
            sVarK = i8.f30764b.k();
        } else {
            sVarK = sVar;
            i14 = iC;
        }
        return i8.b(j13, jK, cN, yVarL, zVarM, abstractC3009nI, strJ, jO, aVarE, oVarU, eVarP, jD, kVar2, r0R, gVarH, iH, i15, jE, qVarJ, zVar3, hVarF, iD, i14, sVarK);
    }

    public final k A() {
        return this.f30763a.s();
    }

    public final int B() {
        return this.f30764b.i();
    }

    public final o C() {
        return this.f30763a.u();
    }

    public final q D() {
        return this.f30764b.j();
    }

    public final s E() {
        return this.f30764b.k();
    }

    public final boolean F(I i8) {
        return this == i8 || this.f30763a.w(i8.f30763a);
    }

    public final boolean G(I i8) {
        if (this != i8) {
            return t.c(this.f30764b, i8.f30764b) && this.f30763a.v(i8.f30763a);
        }
        return true;
    }

    public final I H(t tVar) {
        return new I(M(), L().l(tVar));
    }

    public final I I(I i8) {
        return (i8 == null || t.c(i8, f30762e)) ? this : new I(M().x(i8.M()), L().l(i8.L()));
    }

    public final I J(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, p216z1.a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, g gVar, int i8, int i9, long j12, q qVar, h hVar, int i10, int i11, z zVar2, s sVar) {
        B b8 = C.b(this.f30763a, j8, null, Float.NaN, j9, c8, yVar, zVar, abstractC3009n, str, j10, aVar, oVar, eVar, j11, kVar, r8, zVar2 != null ? zVar2.b() : null, gVar);
        t tVarA = u.a(this.f30764b, i8, i9, j12, qVar, zVar2 != null ? zVar2.a() : null, hVar, i10, i11, sVar);
        return (this.f30763a == b8 && this.f30764b == tVarA) ? this : new I(b8, tVarA);
    }

    public final t L() {
        return this.f30764b;
    }

    public final B M() {
        return this.f30763a;
    }

    public final I b(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, p216z1.a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, g gVar, int i8, int i9, long j12, q qVar, z zVar2, h hVar, int i10, int i11, s sVar) {
        return new I(new B(C1598l0.q(j8, this.f30763a.g()) ? this.f30763a.t() : n.f39032a.b(j8), j9, c8, yVar, zVar, abstractC3009n, str, j10, aVar, oVar, eVar, j11, kVar, r8, zVar2 != null ? zVar2.b() : null, gVar, (AbstractC2633k) null), new t(i8, i9, j12, qVar, zVar2 != null ? zVar2.a() : null, hVar, i10, i11, sVar, (AbstractC2633k) null), zVar2);
    }

    public final float d() {
        return this.f30763a.c();
    }

    public final long e() {
        return this.f30763a.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i8 = (I) obj;
        return t.c(this.f30763a, i8.f30763a) && t.c(this.f30764b, i8.f30764b) && t.c(this.f30765c, i8.f30765c);
    }

    public final p216z1.a f() {
        return this.f30763a.e();
    }

    public final AbstractC1582d0 g() {
        return this.f30763a.f();
    }

    public final long h() {
        return this.f30763a.g();
    }

    public int hashCode() {
        int iHashCode = ((this.f30763a.hashCode() * 31) + this.f30764b.hashCode()) * 31;
        z zVar = this.f30765c;
        return iHashCode + (zVar != null ? zVar.hashCode() : 0);
    }

    public final g i() {
        return this.f30763a.h();
    }

    public final AbstractC3009n j() {
        return this.f30763a.i();
    }

    public final String k() {
        return this.f30763a.j();
    }

    public final long l() {
        return this.f30763a.k();
    }

    public final y m() {
        return this.f30763a.l();
    }

    public final z n() {
        return this.f30763a.m();
    }

    public final C o() {
        return this.f30763a.n();
    }

    public final int p() {
        return this.f30764b.c();
    }

    public final long q() {
        return this.f30763a.o();
    }

    public final int r() {
        return this.f30764b.d();
    }

    public final long s() {
        return this.f30764b.e();
    }

    public final h t() {
        return this.f30764b.f();
    }

    public final e u() {
        return this.f30763a.p();
    }

    public final t v() {
        return this.f30764b;
    }

    public final z w() {
        return this.f30765c;
    }

    public final R0 x() {
        return this.f30763a.r();
    }

    public final B y() {
        return this.f30763a;
    }

    public final int z() {
        return this.f30764b.h();
    }

    @InterfaceC0916e
    public /* synthetic */ I(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, p216z1.a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, g gVar, j jVar, l lVar, long j12, q qVar, z zVar2, h hVar, f fVar, p216z1.e eVar2, s sVar, AbstractC2633k abstractC2633k) {
        this(j8, j9, c8, yVar, zVar, abstractC3009n, str, j10, aVar, oVar, eVar, j11, kVar, r8, gVar, jVar, lVar, j12, qVar, zVar2, hVar, fVar, eVar2, sVar);
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) C1598l0.x(h())) + ", brush=" + g() + ", alpha=" + d() + ", fontSize=" + ((Object) v.j(l())) + ", fontWeight=" + o() + ", fontStyle=" + m() + toqHM.sgOTJExZU + n() + ", fontFamily=" + j() + ", fontFeatureSettings=" + k() + ", letterSpacing=" + ((Object) v.j(q())) + ", baselineShift=" + f() + ", textGeometricTransform=" + C() + ", localeList=" + u() + ", background=" + ((Object) C1598l0.x(e())) + ", textDecoration=" + A() + ", shadow=" + x() + ", drawStyle=" + i() + ", textAlign=" + ((Object) j.m(z())) + ", textDirection=" + ((Object) l.l(B())) + ", lineHeight=" + ((Object) v.j(s())) + ", textIndent=" + D() + ", platformStyle=" + this.f30765c + ", lineHeightStyle=" + t() + ", lineBreak=" + ((Object) f.k(r())) + ", hyphens=" + ((Object) p216z1.e.i(p())) + ", textMotion=" + E() + ')';
    }

    @InterfaceC0916e
    public /* synthetic */ I(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, p216z1.a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, j jVar, l lVar, long j12, q qVar, AbstractC2633k abstractC2633k) {
        this(j8, j9, c8, yVar, zVar, abstractC3009n, str, j10, aVar, oVar, eVar, j11, kVar, r8, jVar, lVar, j12, qVar);
    }

    @InterfaceC0916e
    public /* synthetic */ I(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, p216z1.a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, j jVar, l lVar, long j12, q qVar, z zVar2, h hVar, AbstractC2633k abstractC2633k) {
        this(j8, j9, c8, yVar, zVar, abstractC3009n, str, j10, aVar, oVar, eVar, j11, kVar, r8, jVar, lVar, j12, qVar, zVar2, hVar);
    }

    @InterfaceC0916e
    public /* synthetic */ I(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, p216z1.a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, j jVar, l lVar, long j12, q qVar, z zVar2, h hVar, f fVar, p216z1.e eVar2, AbstractC2633k abstractC2633k) {
        this(j8, j9, c8, yVar, zVar, abstractC3009n, str, j10, aVar, oVar, eVar, j11, kVar, r8, jVar, lVar, j12, qVar, zVar2, hVar, fVar, eVar2);
    }

    public /* synthetic */ I(AbstractC1582d0 abstractC1582d0, float f8, long j8, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j9, p216z1.a aVar, o oVar, e eVar, long j10, k kVar, R0 r8, g gVar, int i8, int i9, long j11, q qVar, z zVar2, h hVar, int i10, int i11, s sVar, AbstractC2633k abstractC2633k) {
        this(abstractC1582d0, f8, j8, c8, yVar, zVar, abstractC3009n, str, j9, aVar, oVar, eVar, j10, kVar, r8, gVar, i8, i9, j11, qVar, zVar2, hVar, i10, i11, sVar);
    }

    @InterfaceC0916e
    public /* synthetic */ I(AbstractC1582d0 abstractC1582d0, float f8, long j8, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j9, p216z1.a aVar, o oVar, e eVar, long j10, k kVar, R0 r8, g gVar, j jVar, l lVar, long j11, q qVar, z zVar2, h hVar, f fVar, p216z1.e eVar2, s sVar, AbstractC2633k abstractC2633k) {
        this(abstractC1582d0, f8, j8, c8, yVar, zVar, abstractC3009n, str, j9, aVar, oVar, eVar, j10, kVar, r8, gVar, jVar, lVar, j11, qVar, zVar2, hVar, fVar, eVar2, sVar);
    }

    public I(B b8, t tVar, z zVar) {
        this.f30763a = b8;
        this.f30764b = tVar;
        this.f30765c = zVar;
    }

    public /* synthetic */ I(B b8, t tVar, z zVar, int i8, AbstractC2633k abstractC2633k) {
        this(b8, tVar, (i8 & 4) != 0 ? null : zVar);
    }

    public I(B b8, t tVar) {
        this(b8, tVar, J.b(b8.q(), tVar.g()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ I(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, p216z1.a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, j jVar, l lVar, long j12, q qVar, int i8, AbstractC2633k abstractC2633k) {
        long jE = (i8 & 1) != 0 ? C1598l0.f9405b.e() : j8;
        long jA = (i8 & 2) != 0 ? v.f462b.a() : j9;
        C c9 = (i8 & 4) != 0 ? null : c8;
        y yVar2 = (i8 & 8) != 0 ? null : yVar;
        z zVar2 = (i8 & 16) != 0 ? null : zVar;
        AbstractC3009n abstractC3009n2 = (i8 & 32) != 0 ? null : abstractC3009n;
        String str2 = (i8 & 64) != 0 ? null : str;
        long jA2 = (i8 & 128) != 0 ? v.f462b.a() : j10;
        p216z1.a aVar2 = (i8 & 256) != 0 ? null : aVar;
        o oVar2 = (i8 & 512) != 0 ? null : oVar;
        e eVar2 = (i8 & 1024) != 0 ? null : eVar;
        long jE2 = (i8 & 2048) != 0 ? C1598l0.f9405b.e() : j11;
        k kVar2 = (i8 & 4096) != 0 ? null : kVar;
        long j13 = jE;
        R0 r9 = (i8 & 8192) != 0 ? null : r8;
        j jVar2 = (i8 & 16384) != 0 ? null : jVar;
        l lVar2 = (i8 & 32768) != 0 ? null : lVar;
        long jA3 = (i8 & 65536) != 0 ? v.f462b.a() : j12;
        long j14 = jA;
        C c10 = c9;
        k kVar3 = kVar2;
        y yVar3 = yVar2;
        z zVar3 = zVar2;
        AbstractC3009n abstractC3009n3 = abstractC3009n2;
        String str3 = str2;
        long j15 = jA2;
        p216z1.a aVar3 = aVar2;
        o oVar3 = oVar2;
        e eVar3 = eVar2;
        long j16 = jE2;
        this(j13, j14, c10, yVar3, zVar3, abstractC3009n3, str3, j15, aVar3, oVar3, eVar3, j16, kVar3, r9, jVar2, lVar2, jA3, (i8 & 131072) != 0 ? null : qVar, null);
    }

    public I(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, p216z1.a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, j jVar, l lVar, long j12, q qVar) {
        this(new B(j8, j9, c8, yVar, zVar, abstractC3009n, str, j10, aVar, oVar, eVar, j11, kVar, r8, (y) null, (g) null, (AbstractC2633k) null), new t(jVar != null ? jVar.n() : j.f39010b.g(), lVar != null ? lVar.m() : l.f39024b.f(), j12, qVar, (x) null, (h) null, f.f38972b.b(), p216z1.e.f38967b.c(), (s) null, (AbstractC2633k) null), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ I(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, p216z1.a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, j jVar, l lVar, long j12, q qVar, z zVar2, h hVar, int i8, AbstractC2633k abstractC2633k) {
        long jE = (i8 & 1) != 0 ? C1598l0.f9405b.e() : j8;
        long jA = (i8 & 2) != 0 ? v.f462b.a() : j9;
        C c9 = (i8 & 4) != 0 ? null : c8;
        y yVar2 = (i8 & 8) != 0 ? null : yVar;
        z zVar3 = (i8 & 16) != 0 ? null : zVar;
        AbstractC3009n abstractC3009n2 = (i8 & 32) != 0 ? null : abstractC3009n;
        String str2 = (i8 & 64) != 0 ? null : str;
        long jA2 = (i8 & 128) != 0 ? v.f462b.a() : j10;
        p216z1.a aVar2 = (i8 & 256) != 0 ? null : aVar;
        o oVar2 = (i8 & 512) != 0 ? null : oVar;
        e eVar2 = (i8 & 1024) != 0 ? null : eVar;
        long jE2 = (i8 & 2048) != 0 ? C1598l0.f9405b.e() : j11;
        k kVar2 = (i8 & 4096) != 0 ? null : kVar;
        long j13 = jE;
        R0 r9 = (i8 & 8192) != 0 ? null : r8;
        j jVar2 = (i8 & 16384) != 0 ? null : jVar;
        l lVar2 = (i8 & 32768) != 0 ? null : lVar;
        long jA3 = (i8 & 65536) != 0 ? v.f462b.a() : j12;
        q qVar2 = (i8 & 131072) != 0 ? null : qVar;
        z zVar4 = (i8 & 262144) != 0 ? null : zVar2;
        long j14 = jA;
        C c10 = c9;
        k kVar3 = kVar2;
        y yVar3 = yVar2;
        z zVar5 = zVar3;
        AbstractC3009n abstractC3009n3 = abstractC3009n2;
        String str3 = str2;
        long j15 = jA2;
        p216z1.a aVar3 = aVar2;
        o oVar3 = oVar2;
        e eVar3 = eVar2;
        long j16 = jE2;
        this(j13, j14, c10, yVar3, zVar5, abstractC3009n3, str3, j15, aVar3, oVar3, eVar3, j16, kVar3, r9, jVar2, lVar2, jA3, qVar2, zVar4, (i8 & 524288) != 0 ? null : hVar, null);
    }

    public I(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, p216z1.a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, j jVar, l lVar, long j12, q qVar, z zVar2, h hVar) {
        this(new B(j8, j9, c8, yVar, zVar, abstractC3009n, str, j10, aVar, oVar, eVar, j11, kVar, r8, zVar2 != null ? zVar2.b() : null, (g) null, (AbstractC2633k) null), new t(jVar != null ? jVar.n() : j.f39010b.g(), lVar != null ? lVar.m() : l.f39024b.f(), j12, qVar, zVar2 != null ? zVar2.a() : null, hVar, f.f38972b.b(), p216z1.e.f38967b.c(), (s) null, (AbstractC2633k) null), zVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ I(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, p216z1.a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, j jVar, l lVar, long j12, q qVar, z zVar2, h hVar, f fVar, p216z1.e eVar2, int i8, AbstractC2633k abstractC2633k) {
        long jE = (i8 & 1) != 0 ? C1598l0.f9405b.e() : j8;
        long jA = (i8 & 2) != 0 ? v.f462b.a() : j9;
        C c9 = (i8 & 4) != 0 ? null : c8;
        y yVar2 = (i8 & 8) != 0 ? null : yVar;
        z zVar3 = (i8 & 16) != 0 ? null : zVar;
        AbstractC3009n abstractC3009n2 = (i8 & 32) != 0 ? null : abstractC3009n;
        String str2 = (i8 & 64) != 0 ? null : str;
        long jA2 = (i8 & 128) != 0 ? v.f462b.a() : j10;
        p216z1.a aVar2 = (i8 & 256) != 0 ? null : aVar;
        o oVar2 = (i8 & 512) != 0 ? null : oVar;
        e eVar3 = (i8 & 1024) != 0 ? null : eVar;
        long jE2 = (i8 & 2048) != 0 ? C1598l0.f9405b.e() : j11;
        k kVar2 = (i8 & 4096) != 0 ? null : kVar;
        long j13 = jE;
        R0 r9 = (i8 & 8192) != 0 ? null : r8;
        j jVar2 = (i8 & 16384) != 0 ? null : jVar;
        l lVar2 = (i8 & 32768) != 0 ? null : lVar;
        long jA3 = (i8 & 65536) != 0 ? v.f462b.a() : j12;
        q qVar2 = (i8 & 131072) != 0 ? null : qVar;
        z zVar4 = (i8 & 262144) != 0 ? null : zVar2;
        h hVar2 = (i8 & 524288) != 0 ? null : hVar;
        f fVar2 = (i8 & 1048576) != 0 ? null : fVar;
        long j14 = jA;
        C c10 = c9;
        k kVar3 = kVar2;
        y yVar3 = yVar2;
        z zVar5 = zVar3;
        AbstractC3009n abstractC3009n3 = abstractC3009n2;
        String str3 = str2;
        long j15 = jA2;
        p216z1.a aVar3 = aVar2;
        o oVar3 = oVar2;
        e eVar4 = eVar3;
        long j16 = jE2;
        this(j13, j14, c10, yVar3, zVar5, abstractC3009n3, str3, j15, aVar3, oVar3, eVar4, j16, kVar3, r9, jVar2, lVar2, jA3, qVar2, zVar4, hVar2, fVar2, (i8 & 2097152) != 0 ? null : eVar2, null);
    }

    public I(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, p216z1.a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, j jVar, l lVar, long j12, q qVar, z zVar2, h hVar, f fVar, p216z1.e eVar2) {
        this(new B(j8, j9, c8, yVar, zVar, abstractC3009n, str, j10, aVar, oVar, eVar, j11, kVar, r8, zVar2 != null ? zVar2.b() : null, (g) null, 32768, (AbstractC2633k) null), new t(jVar != null ? jVar.n() : j.f39010b.g(), lVar != null ? lVar.m() : l.f39024b.f(), j12, qVar, zVar2 != null ? zVar2.a() : null, hVar, fVar != null ? fVar.l() : f.f38972b.b(), eVar2 != null ? eVar2.j() : p216z1.e.f38967b.c(), (s) null, 256, (AbstractC2633k) null), zVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ I(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, p216z1.a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, g gVar, j jVar, l lVar, long j12, q qVar, z zVar2, h hVar, f fVar, p216z1.e eVar2, s sVar, int i8, AbstractC2633k abstractC2633k) {
        long jE = (i8 & 1) != 0 ? C1598l0.f9405b.e() : j8;
        long jA = (i8 & 2) != 0 ? v.f462b.a() : j9;
        C c9 = (i8 & 4) != 0 ? null : c8;
        y yVar2 = (i8 & 8) != 0 ? null : yVar;
        z zVar3 = (i8 & 16) != 0 ? null : zVar;
        AbstractC3009n abstractC3009n2 = (i8 & 32) != 0 ? null : abstractC3009n;
        String str2 = (i8 & 64) != 0 ? null : str;
        long jA2 = (i8 & 128) != 0 ? v.f462b.a() : j10;
        p216z1.a aVar2 = (i8 & 256) != 0 ? null : aVar;
        o oVar2 = (i8 & 512) != 0 ? null : oVar;
        e eVar3 = (i8 & 1024) != 0 ? null : eVar;
        long jE2 = (i8 & 2048) != 0 ? C1598l0.f9405b.e() : j11;
        k kVar2 = (i8 & 4096) != 0 ? null : kVar;
        long j13 = jE;
        R0 r9 = (i8 & 8192) != 0 ? null : r8;
        g gVar2 = (i8 & 16384) != 0 ? null : gVar;
        j jVar2 = (i8 & 32768) != 0 ? null : jVar;
        l lVar2 = (i8 & 65536) != 0 ? null : lVar;
        long jA3 = (i8 & 131072) != 0 ? v.f462b.a() : j12;
        q qVar2 = (i8 & 262144) != 0 ? null : qVar;
        z zVar4 = (i8 & 524288) != 0 ? null : zVar2;
        h hVar2 = (i8 & 1048576) != 0 ? null : hVar;
        f fVar2 = (i8 & 2097152) != 0 ? null : fVar;
        p216z1.e eVar4 = (i8 & 4194304) != 0 ? null : eVar2;
        long j14 = jA;
        C c10 = c9;
        k kVar3 = kVar2;
        y yVar3 = yVar2;
        z zVar5 = zVar3;
        AbstractC3009n abstractC3009n3 = abstractC3009n2;
        String str3 = str2;
        long j15 = jA2;
        p216z1.a aVar3 = aVar2;
        o oVar3 = oVar2;
        e eVar5 = eVar3;
        long j16 = jE2;
        this(j13, j14, c10, yVar3, zVar5, abstractC3009n3, str3, j15, aVar3, oVar3, eVar5, j16, kVar3, r9, gVar2, jVar2, lVar2, jA3, qVar2, zVar4, hVar2, fVar2, eVar4, (i8 & 8388608) != 0 ? null : sVar, (AbstractC2633k) null);
    }

    public I(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, p216z1.a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, g gVar, j jVar, l lVar, long j12, q qVar, z zVar2, h hVar, f fVar, p216z1.e eVar2, s sVar) {
        this(new B(j8, j9, c8, yVar, zVar, abstractC3009n, str, j10, aVar, oVar, eVar, j11, kVar, r8, zVar2 != null ? zVar2.b() : null, gVar, (AbstractC2633k) null), new t(jVar != null ? jVar.n() : j.f39010b.g(), lVar != null ? lVar.m() : l.f39024b.f(), j12, qVar, zVar2 != null ? zVar2.a() : null, hVar, fVar != null ? fVar.l() : f.f38972b.b(), eVar2 != null ? eVar2.j() : p216z1.e.f38967b.c(), sVar, (AbstractC2633k) null), zVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ I(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, p216z1.a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, g gVar, int i8, int i9, long j12, q qVar, z zVar2, h hVar, int i10, int i11, s sVar, int i12, AbstractC2633k abstractC2633k) {
        long jE = (i12 & 1) != 0 ? C1598l0.f9405b.e() : j8;
        long jA = (i12 & 2) != 0 ? v.f462b.a() : j9;
        C c9 = (i12 & 4) != 0 ? null : c8;
        y yVar2 = (i12 & 8) != 0 ? null : yVar;
        z zVar3 = (i12 & 16) != 0 ? null : zVar;
        AbstractC3009n abstractC3009n2 = (i12 & 32) != 0 ? null : abstractC3009n;
        String str2 = (i12 & 64) != 0 ? null : str;
        long jA2 = (i12 & 128) != 0 ? v.f462b.a() : j10;
        p216z1.a aVar2 = (i12 & 256) != 0 ? null : aVar;
        o oVar2 = (i12 & 512) != 0 ? null : oVar;
        e eVar2 = (i12 & 1024) != 0 ? null : eVar;
        long jE2 = (i12 & 2048) != 0 ? C1598l0.f9405b.e() : j11;
        k kVar2 = (i12 & 4096) != 0 ? null : kVar;
        long j13 = jE;
        R0 r9 = (i12 & 8192) != 0 ? null : r8;
        g gVar2 = (i12 & 16384) != 0 ? null : gVar;
        int iG = (i12 & 32768) != 0 ? j.f39010b.g() : i8;
        int iF = (i12 & 65536) != 0 ? l.f39024b.f() : i9;
        long jA3 = (i12 & 131072) != 0 ? v.f462b.a() : j12;
        q qVar2 = (i12 & 262144) != 0 ? null : qVar;
        z zVar4 = (i12 & 524288) != 0 ? null : zVar2;
        h hVar2 = (i12 & 1048576) != 0 ? null : hVar;
        int iB = (i12 & 2097152) != 0 ? f.f38972b.b() : i10;
        int iC = (i12 & 4194304) != 0 ? p216z1.e.f38967b.c() : i11;
        long j14 = jA;
        C c10 = c9;
        k kVar3 = kVar2;
        y yVar3 = yVar2;
        z zVar5 = zVar3;
        AbstractC3009n abstractC3009n3 = abstractC3009n2;
        String str3 = str2;
        long j15 = jA2;
        p216z1.a aVar3 = aVar2;
        o oVar3 = oVar2;
        e eVar3 = eVar2;
        long j16 = jE2;
        this(j13, j14, c10, yVar3, zVar5, abstractC3009n3, str3, j15, aVar3, oVar3, eVar3, j16, kVar3, r9, gVar2, iG, iF, jA3, qVar2, zVar4, hVar2, iB, iC, (i12 & 8388608) != 0 ? null : sVar, (AbstractC2633k) null);
    }

    public I(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, p216z1.a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, g gVar, int i8, int i9, long j12, q qVar, z zVar2, h hVar, int i10, int i11, s sVar) {
        this(new B(j8, j9, c8, yVar, zVar, abstractC3009n, str, j10, aVar, oVar, eVar, j11, kVar, r8, zVar2 != null ? zVar2.b() : null, gVar, (AbstractC2633k) null), new t(i8, i9, j12, qVar, zVar2 != null ? zVar2.a() : null, hVar, i10, i11, sVar, (AbstractC2633k) null), zVar2);
    }

    public /* synthetic */ I(AbstractC1582d0 abstractC1582d0, float f8, long j8, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j9, p216z1.a aVar, o oVar, e eVar, long j10, k kVar, R0 r8, g gVar, int i8, int i9, long j11, q qVar, z zVar2, h hVar, int i10, int i11, s sVar, int i12, AbstractC2633k abstractC2633k) {
        this(abstractC1582d0, (i12 & 2) != 0 ? Float.NaN : f8, (i12 & 4) != 0 ? v.f462b.a() : j8, (i12 & 8) != 0 ? null : c8, (i12 & 16) != 0 ? null : yVar, (i12 & 32) != 0 ? null : zVar, (i12 & 64) != 0 ? null : abstractC3009n, (i12 & 128) != 0 ? null : str, (i12 & 256) != 0 ? v.f462b.a() : j9, (i12 & 512) != 0 ? null : aVar, (i12 & 1024) != 0 ? null : oVar, (i12 & 2048) != 0 ? null : eVar, (i12 & 4096) != 0 ? C1598l0.f9405b.e() : j10, (i12 & 8192) != 0 ? null : kVar, (i12 & 16384) != 0 ? null : r8, (32768 & i12) != 0 ? null : gVar, (65536 & i12) != 0 ? j.f39010b.g() : i8, (131072 & i12) != 0 ? l.f39024b.f() : i9, (262144 & i12) != 0 ? v.f462b.a() : j11, (524288 & i12) != 0 ? null : qVar, (1048576 & i12) != 0 ? null : zVar2, (2097152 & i12) != 0 ? null : hVar, (4194304 & i12) != 0 ? f.f38972b.b() : i10, (8388608 & i12) != 0 ? p216z1.e.f38967b.c() : i11, (i12 & 16777216) != 0 ? null : sVar, (AbstractC2633k) null);
    }

    public I(AbstractC1582d0 abstractC1582d0, float f8, long j8, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j9, p216z1.a aVar, o oVar, e eVar, long j10, k kVar, R0 r8, g gVar, int i8, int i9, long j11, q qVar, z zVar2, h hVar, int i10, int i11, s sVar) {
        this(new B(abstractC1582d0, f8, j8, c8, yVar, zVar, abstractC3009n, str, j9, aVar, oVar, eVar, j10, kVar, r8, zVar2 != null ? zVar2.b() : null, gVar, (AbstractC2633k) null), new t(i8, i9, j11, qVar, zVar2 != null ? zVar2.a() : null, hVar, i10, i11, sVar, (AbstractC2633k) null), zVar2);
    }

    public /* synthetic */ I(AbstractC1582d0 abstractC1582d0, float f8, long j8, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j9, p216z1.a aVar, o oVar, e eVar, long j10, k kVar, R0 r8, g gVar, j jVar, l lVar, long j11, q qVar, z zVar2, h hVar, f fVar, p216z1.e eVar2, s sVar, int i8, AbstractC2633k abstractC2633k) {
        this(abstractC1582d0, (i8 & 2) != 0 ? Float.NaN : f8, (i8 & 4) != 0 ? v.f462b.a() : j8, (i8 & 8) != 0 ? null : c8, (i8 & 16) != 0 ? null : yVar, (i8 & 32) != 0 ? null : zVar, (i8 & 64) != 0 ? null : abstractC3009n, (i8 & 128) != 0 ? null : str, (i8 & 256) != 0 ? v.f462b.a() : j9, (i8 & 512) != 0 ? null : aVar, (i8 & 1024) != 0 ? null : oVar, (i8 & 2048) != 0 ? null : eVar, (i8 & 4096) != 0 ? C1598l0.f9405b.e() : j10, (i8 & 8192) != 0 ? null : kVar, (i8 & 16384) != 0 ? null : r8, (32768 & i8) != 0 ? null : gVar, (65536 & i8) != 0 ? null : jVar, (131072 & i8) != 0 ? null : lVar, (262144 & i8) != 0 ? v.f462b.a() : j11, (524288 & i8) != 0 ? null : qVar, (1048576 & i8) != 0 ? null : zVar2, (2097152 & i8) != 0 ? null : hVar, (4194304 & i8) != 0 ? null : fVar, (8388608 & i8) != 0 ? null : eVar2, (i8 & 16777216) != 0 ? null : sVar, (AbstractC2633k) null);
    }

    public I(AbstractC1582d0 abstractC1582d0, float f8, long j8, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j9, p216z1.a aVar, o oVar, e eVar, long j10, k kVar, R0 r8, g gVar, j jVar, l lVar, long j11, q qVar, z zVar2, h hVar, f fVar, p216z1.e eVar2, s sVar) {
        this(new B(abstractC1582d0, f8, j8, c8, yVar, zVar, abstractC3009n, str, j9, aVar, oVar, eVar, j10, kVar, r8, zVar2 != null ? zVar2.b() : null, gVar, (AbstractC2633k) null), new t(jVar != null ? jVar.n() : j.f39010b.g(), lVar != null ? lVar.m() : l.f39024b.f(), j11, qVar, zVar2 != null ? zVar2.a() : null, hVar, fVar != null ? fVar.l() : f.f38972b.b(), eVar2 != null ? eVar2.j() : p216z1.e.f38967b.c(), sVar, (AbstractC2633k) null), zVar2);
    }
}
