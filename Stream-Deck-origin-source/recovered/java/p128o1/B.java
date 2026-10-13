package p128o1;

import A1.v;
import C6.InterfaceC0916e;
import R0.AbstractC1582d0;
import R0.C1598l0;
import R0.R0;
import T0.g;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p168t1.AbstractC3009n;
import p168t1.C;
import p168t1.y;
import p168t1.z;
import p184v1.e;
import p216z1.a;
import p216z1.k;
import p216z1.n;
import p216z1.o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f30718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f30719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f30720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f30721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f30722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC3009n f30723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f30724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f30725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f30726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o f30727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f30728k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f30729l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k f30730m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final R0 f30731n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y f30732o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f30733p;

    @InterfaceC0916e
    public /* synthetic */ B(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, AbstractC2633k abstractC2633k) {
        this(j8, j9, c8, yVar, zVar, abstractC3009n, str, j10, aVar, oVar, eVar, j11, kVar, r8);
    }

    public static /* synthetic */ B b(B b8, long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, y yVar2, g gVar, int i8, Object obj) {
        long jG = (i8 & 1) != 0 ? b8.g() : j8;
        return b8.a(jG, (i8 & 2) != 0 ? b8.f30719b : j9, (i8 & 4) != 0 ? b8.f30720c : c8, (i8 & 8) != 0 ? b8.f30721d : yVar, (i8 & 16) != 0 ? b8.f30722e : zVar, (i8 & 32) != 0 ? b8.f30723f : abstractC3009n, (i8 & 64) != 0 ? b8.f30724g : str, (i8 & 128) != 0 ? b8.f30725h : j10, (i8 & 256) != 0 ? b8.f30726i : aVar, (i8 & 512) != 0 ? b8.f30727j : oVar, (i8 & 1024) != 0 ? b8.f30728k : eVar, (i8 & 2048) != 0 ? b8.f30729l : j11, (i8 & 4096) != 0 ? b8.f30730m : kVar, (i8 & 8192) != 0 ? b8.f30731n : r8, (i8 & 16384) != 0 ? b8.f30732o : yVar2, (i8 & 32768) != 0 ? b8.f30733p : gVar);
    }

    public final B a(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, y yVar2, g gVar) {
        return new B(C1598l0.q(j8, g()) ? this.f30718a : n.f39032a.b(j8), j9, c8, yVar, zVar, abstractC3009n, str, j10, aVar, oVar, eVar, j11, kVar, r8, yVar2, gVar, (AbstractC2633k) null);
    }

    public final float c() {
        return this.f30718a.c();
    }

    public final long d() {
        return this.f30729l;
    }

    public final a e() {
        return this.f30726i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b8 = (B) obj;
        return v(b8) && w(b8);
    }

    public final AbstractC1582d0 f() {
        return this.f30718a.e();
    }

    public final long g() {
        return this.f30718a.d();
    }

    public final g h() {
        return this.f30733p;
    }

    public int hashCode() {
        int iW = C1598l0.w(g()) * 31;
        AbstractC1582d0 abstractC1582d0F = f();
        int iHashCode = (((((iW + (abstractC1582d0F != null ? abstractC1582d0F.hashCode() : 0)) * 31) + Float.hashCode(c())) * 31) + v.i(this.f30719b)) * 31;
        C c8 = this.f30720c;
        int iHashCode2 = (iHashCode + (c8 != null ? c8.hashCode() : 0)) * 31;
        y yVar = this.f30721d;
        int iG = (iHashCode2 + (yVar != null ? y.g(yVar.i()) : 0)) * 31;
        z zVar = this.f30722e;
        int i8 = (iG + (zVar != null ? z.i(zVar.m()) : 0)) * 31;
        AbstractC3009n abstractC3009n = this.f30723f;
        int iHashCode3 = (i8 + (abstractC3009n != null ? abstractC3009n.hashCode() : 0)) * 31;
        String str = this.f30724g;
        int iHashCode4 = (((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + v.i(this.f30725h)) * 31;
        a aVar = this.f30726i;
        int iF = (iHashCode4 + (aVar != null ? a.f(aVar.h()) : 0)) * 31;
        o oVar = this.f30727j;
        int iHashCode5 = (iF + (oVar != null ? oVar.hashCode() : 0)) * 31;
        e eVar = this.f30728k;
        int iHashCode6 = (((iHashCode5 + (eVar != null ? eVar.hashCode() : 0)) * 31) + C1598l0.w(this.f30729l)) * 31;
        k kVar = this.f30730m;
        int iHashCode7 = (iHashCode6 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        R0 r8 = this.f30731n;
        int iHashCode8 = (iHashCode7 + (r8 != null ? r8.hashCode() : 0)) * 31;
        y yVar2 = this.f30732o;
        int iHashCode9 = (iHashCode8 + (yVar2 != null ? yVar2.hashCode() : 0)) * 31;
        g gVar = this.f30733p;
        return iHashCode9 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final AbstractC3009n i() {
        return this.f30723f;
    }

    public final String j() {
        return this.f30724g;
    }

    public final long k() {
        return this.f30719b;
    }

    public final y l() {
        return this.f30721d;
    }

    public final z m() {
        return this.f30722e;
    }

    public final C n() {
        return this.f30720c;
    }

    public final long o() {
        return this.f30725h;
    }

    public final e p() {
        return this.f30728k;
    }

    public final y q() {
        return this.f30732o;
    }

    public final R0 r() {
        return this.f30731n;
    }

    public final k s() {
        return this.f30730m;
    }

    public final n t() {
        return this.f30718a;
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) C1598l0.x(g())) + ", brush=" + f() + ", alpha=" + c() + ", fontSize=" + ((Object) v.j(this.f30719b)) + ", fontWeight=" + this.f30720c + ", fontStyle=" + this.f30721d + ", fontSynthesis=" + this.f30722e + ", fontFamily=" + this.f30723f + ", fontFeatureSettings=" + this.f30724g + ", letterSpacing=" + ((Object) v.j(this.f30725h)) + ", baselineShift=" + this.f30726i + ", textGeometricTransform=" + this.f30727j + ", localeList=" + this.f30728k + ", background=" + ((Object) C1598l0.x(this.f30729l)) + ", textDecoration=" + this.f30730m + ", shadow=" + this.f30731n + ", platformStyle=" + this.f30732o + ", drawStyle=" + this.f30733p + ')';
    }

    public final o u() {
        return this.f30727j;
    }

    public final boolean v(B b8) {
        if (this == b8) {
            return true;
        }
        return v.e(this.f30719b, b8.f30719b) && t.c(this.f30720c, b8.f30720c) && t.c(this.f30721d, b8.f30721d) && t.c(this.f30722e, b8.f30722e) && t.c(this.f30723f, b8.f30723f) && t.c(this.f30724g, b8.f30724g) && v.e(this.f30725h, b8.f30725h) && t.c(this.f30726i, b8.f30726i) && t.c(this.f30727j, b8.f30727j) && t.c(this.f30728k, b8.f30728k) && C1598l0.q(this.f30729l, b8.f30729l) && t.c(this.f30732o, b8.f30732o);
    }

    public final boolean w(B b8) {
        return t.c(this.f30718a, b8.f30718a) && t.c(this.f30730m, b8.f30730m) && t.c(this.f30731n, b8.f30731n) && t.c(this.f30733p, b8.f30733p);
    }

    public final B x(B b8) {
        return b8 == null ? this : C.b(this, b8.f30718a.d(), b8.f30718a.e(), b8.f30718a.c(), b8.f30719b, b8.f30720c, b8.f30721d, b8.f30722e, b8.f30723f, b8.f30724g, b8.f30725h, b8.f30726i, b8.f30727j, b8.f30728k, b8.f30729l, b8.f30730m, b8.f30731n, b8.f30732o, b8.f30733p);
    }

    public /* synthetic */ B(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, y yVar2, g gVar, AbstractC2633k abstractC2633k) {
        this(j8, j9, c8, yVar, zVar, abstractC3009n, str, j10, aVar, oVar, eVar, j11, kVar, r8, yVar2, gVar);
    }

    @InterfaceC0916e
    public /* synthetic */ B(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, y yVar2, AbstractC2633k abstractC2633k) {
        this(j8, j9, c8, yVar, zVar, abstractC3009n, str, j10, aVar, oVar, eVar, j11, kVar, r8, yVar2);
    }

    public /* synthetic */ B(AbstractC1582d0 abstractC1582d0, float f8, long j8, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j9, a aVar, o oVar, e eVar, long j10, k kVar, R0 r8, y yVar2, g gVar, AbstractC2633k abstractC2633k) {
        this(abstractC1582d0, f8, j8, c8, yVar, zVar, abstractC3009n, str, j9, aVar, oVar, eVar, j10, kVar, r8, yVar2, gVar);
    }

    public /* synthetic */ B(n nVar, long j8, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j9, a aVar, o oVar, e eVar, long j10, k kVar, R0 r8, y yVar2, g gVar, AbstractC2633k abstractC2633k) {
        this(nVar, j8, c8, yVar, zVar, abstractC3009n, str, j9, aVar, oVar, eVar, j10, kVar, r8, yVar2, gVar);
    }

    public B(n nVar, long j8, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j9, a aVar, o oVar, e eVar, long j10, k kVar, R0 r8, y yVar2, g gVar) {
        this.f30718a = nVar;
        this.f30719b = j8;
        this.f30720c = c8;
        this.f30721d = yVar;
        this.f30722e = zVar;
        this.f30723f = abstractC3009n;
        this.f30724g = str;
        this.f30725h = j9;
        this.f30726i = aVar;
        this.f30727j = oVar;
        this.f30728k = eVar;
        this.f30729l = j10;
        this.f30730m = kVar;
        this.f30731n = r8;
        this.f30732o = yVar2;
        this.f30733p = gVar;
    }

    public /* synthetic */ B(n nVar, long j8, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j9, a aVar, o oVar, e eVar, long j10, k kVar, R0 r8, y yVar2, g gVar, int i8, AbstractC2633k abstractC2633k) {
        this(nVar, (i8 & 2) != 0 ? v.f462b.a() : j8, (i8 & 4) != 0 ? null : c8, (i8 & 8) != 0 ? null : yVar, (i8 & 16) != 0 ? null : zVar, (i8 & 32) != 0 ? null : abstractC3009n, (i8 & 64) != 0 ? null : str, (i8 & 128) != 0 ? v.f462b.a() : j9, (i8 & 256) != 0 ? null : aVar, (i8 & 512) != 0 ? null : oVar, (i8 & 1024) != 0 ? null : eVar, (i8 & 2048) != 0 ? C1598l0.f9405b.e() : j10, (i8 & 4096) != 0 ? null : kVar, (i8 & 8192) != 0 ? null : r8, (i8 & 16384) != 0 ? null : yVar2, (i8 & 32768) != 0 ? null : gVar, (AbstractC2633k) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ B(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, int i8, AbstractC2633k abstractC2633k) {
        long jE = (i8 & 1) != 0 ? C1598l0.f9405b.e() : j8;
        long jA = (i8 & 2) != 0 ? v.f462b.a() : j9;
        C c9 = (i8 & 4) != 0 ? null : c8;
        y yVar2 = (i8 & 8) != 0 ? null : yVar;
        z zVar2 = (i8 & 16) != 0 ? null : zVar;
        AbstractC3009n abstractC3009n2 = (i8 & 32) != 0 ? null : abstractC3009n;
        String str2 = (i8 & 64) != 0 ? null : str;
        long jA2 = (i8 & 128) != 0 ? v.f462b.a() : j10;
        a aVar2 = (i8 & 256) != 0 ? null : aVar;
        o oVar2 = (i8 & 512) != 0 ? null : oVar;
        e eVar2 = (i8 & 1024) != 0 ? null : eVar;
        long jE2 = (i8 & 2048) != 0 ? C1598l0.f9405b.e() : j11;
        y yVar3 = yVar2;
        z zVar3 = zVar2;
        AbstractC3009n abstractC3009n3 = abstractC3009n2;
        String str3 = str2;
        long j12 = jA2;
        a aVar3 = aVar2;
        o oVar3 = oVar2;
        e eVar3 = eVar2;
        long j13 = jE2;
        this(jE, jA, c9, yVar3, zVar3, abstractC3009n3, str3, j12, aVar3, oVar3, eVar3, j13, (i8 & 4096) != 0 ? null : kVar, (i8 & 8192) != 0 ? null : r8, (AbstractC2633k) null);
    }

    public B(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, a aVar, o oVar, e eVar, long j11, k kVar, R0 r8) {
        this(n.f39032a.b(j8), j9, c8, yVar, zVar, abstractC3009n, str, j10, aVar, oVar, eVar, j11, kVar, r8, (y) null, (g) null, 32768, (AbstractC2633k) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ B(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, y yVar2, int i8, AbstractC2633k abstractC2633k) {
        long jE = (i8 & 1) != 0 ? C1598l0.f9405b.e() : j8;
        long jA = (i8 & 2) != 0 ? v.f462b.a() : j9;
        C c9 = (i8 & 4) != 0 ? null : c8;
        y yVar3 = (i8 & 8) != 0 ? null : yVar;
        z zVar2 = (i8 & 16) != 0 ? null : zVar;
        AbstractC3009n abstractC3009n2 = (i8 & 32) != 0 ? null : abstractC3009n;
        String str2 = (i8 & 64) != 0 ? null : str;
        long jA2 = (i8 & 128) != 0 ? v.f462b.a() : j10;
        a aVar2 = (i8 & 256) != 0 ? null : aVar;
        o oVar2 = (i8 & 512) != 0 ? null : oVar;
        e eVar2 = (i8 & 1024) != 0 ? null : eVar;
        long jE2 = (i8 & 2048) != 0 ? C1598l0.f9405b.e() : j11;
        k kVar2 = (i8 & 4096) != 0 ? null : kVar;
        long j12 = jE;
        long j13 = jA;
        C c10 = c9;
        k kVar3 = kVar2;
        y yVar4 = yVar3;
        z zVar3 = zVar2;
        AbstractC3009n abstractC3009n3 = abstractC3009n2;
        String str3 = str2;
        long j14 = jA2;
        a aVar3 = aVar2;
        o oVar3 = oVar2;
        e eVar3 = eVar2;
        long j15 = jE2;
        this(j12, j13, c10, yVar4, zVar3, abstractC3009n3, str3, j14, aVar3, oVar3, eVar3, j15, kVar3, (i8 & 8192) != 0 ? null : r8, (i8 & 16384) != 0 ? null : yVar2, (AbstractC2633k) null);
    }

    public B(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, y yVar2) {
        this(n.f39032a.b(j8), j9, c8, yVar, zVar, abstractC3009n, str, j10, aVar, oVar, eVar, j11, kVar, r8, yVar2, (g) null, 32768, (AbstractC2633k) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ B(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, y yVar2, g gVar, int i8, AbstractC2633k abstractC2633k) {
        long jE = (i8 & 1) != 0 ? C1598l0.f9405b.e() : j8;
        long jA = (i8 & 2) != 0 ? v.f462b.a() : j9;
        C c9 = (i8 & 4) != 0 ? null : c8;
        y yVar3 = (i8 & 8) != 0 ? null : yVar;
        z zVar2 = (i8 & 16) != 0 ? null : zVar;
        AbstractC3009n abstractC3009n2 = (i8 & 32) != 0 ? null : abstractC3009n;
        String str2 = (i8 & 64) != 0 ? null : str;
        long jA2 = (i8 & 128) != 0 ? v.f462b.a() : j10;
        a aVar2 = (i8 & 256) != 0 ? null : aVar;
        o oVar2 = (i8 & 512) != 0 ? null : oVar;
        e eVar2 = (i8 & 1024) != 0 ? null : eVar;
        long jE2 = (i8 & 2048) != 0 ? C1598l0.f9405b.e() : j11;
        k kVar2 = (i8 & 4096) != 0 ? null : kVar;
        long j12 = jE;
        R0 r9 = (i8 & 8192) != 0 ? null : r8;
        y yVar4 = (i8 & 16384) != 0 ? null : yVar2;
        long j13 = jA;
        C c10 = c9;
        k kVar3 = kVar2;
        y yVar5 = yVar3;
        z zVar3 = zVar2;
        AbstractC3009n abstractC3009n3 = abstractC3009n2;
        String str3 = str2;
        long j14 = jA2;
        a aVar3 = aVar2;
        o oVar3 = oVar2;
        e eVar3 = eVar2;
        long j15 = jE2;
        this(j12, j13, c10, yVar5, zVar3, abstractC3009n3, str3, j14, aVar3, oVar3, eVar3, j15, kVar3, r9, yVar4, (i8 & 32768) != 0 ? null : gVar, (AbstractC2633k) null);
    }

    public B(long j8, long j9, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j10, a aVar, o oVar, e eVar, long j11, k kVar, R0 r8, y yVar2, g gVar) {
        this(n.f39032a.b(j8), j9, c8, yVar, zVar, abstractC3009n, str, j10, aVar, oVar, eVar, j11, kVar, r8, yVar2, gVar, (AbstractC2633k) null);
    }

    public /* synthetic */ B(AbstractC1582d0 abstractC1582d0, float f8, long j8, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j9, a aVar, o oVar, e eVar, long j10, k kVar, R0 r8, y yVar2, g gVar, int i8, AbstractC2633k abstractC2633k) {
        this(abstractC1582d0, (i8 & 2) != 0 ? Float.NaN : f8, (i8 & 4) != 0 ? v.f462b.a() : j8, (i8 & 8) != 0 ? null : c8, (i8 & 16) != 0 ? null : yVar, (i8 & 32) != 0 ? null : zVar, (i8 & 64) != 0 ? null : abstractC3009n, (i8 & 128) != 0 ? null : str, (i8 & 256) != 0 ? v.f462b.a() : j9, (i8 & 512) != 0 ? null : aVar, (i8 & 1024) != 0 ? null : oVar, (i8 & 2048) != 0 ? null : eVar, (i8 & 4096) != 0 ? C1598l0.f9405b.e() : j10, (i8 & 8192) != 0 ? null : kVar, (i8 & 16384) != 0 ? null : r8, (32768 & i8) != 0 ? null : yVar2, (i8 & 65536) != 0 ? null : gVar, (AbstractC2633k) null);
    }

    public B(AbstractC1582d0 abstractC1582d0, float f8, long j8, C c8, y yVar, z zVar, AbstractC3009n abstractC3009n, String str, long j9, a aVar, o oVar, e eVar, long j10, k kVar, R0 r8, y yVar2, g gVar) {
        this(n.f39032a.a(abstractC1582d0, f8), j8, c8, yVar, zVar, abstractC3009n, str, j9, aVar, oVar, eVar, j10, kVar, r8, yVar2, gVar, (AbstractC2633k) null);
    }
}
