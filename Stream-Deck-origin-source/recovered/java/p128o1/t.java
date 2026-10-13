package p128o1;

import A1.v;
import C6.InterfaceC0916e;
import kotlin.jvm.internal.AbstractC2633k;
import p216z1.e;
import p216z1.f;
import p216z1.h;
import p216z1.j;
import p216z1.l;
import p216z1.q;
import p216z1.s;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f30842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f30843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f30844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f30845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f30846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s f30847i;

    public /* synthetic */ t(int i8, int i9, long j8, q qVar, x xVar, h hVar, int i10, int i11, s sVar, AbstractC2633k abstractC2633k) {
        this(i8, i9, j8, qVar, xVar, hVar, i10, i11, sVar);
    }

    public static /* synthetic */ t b(t tVar, int i8, int i9, long j8, q qVar, x xVar, h hVar, int i10, int i11, s sVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = tVar.f30839a;
        }
        if ((i12 & 2) != 0) {
            i9 = tVar.f30840b;
        }
        if ((i12 & 4) != 0) {
            j8 = tVar.f30841c;
        }
        if ((i12 & 8) != 0) {
            qVar = tVar.f30842d;
        }
        if ((i12 & 16) != 0) {
            xVar = tVar.f30843e;
        }
        if ((i12 & 32) != 0) {
            hVar = tVar.f30844f;
        }
        if ((i12 & 64) != 0) {
            i10 = tVar.f30845g;
        }
        if ((i12 & 128) != 0) {
            i11 = tVar.f30846h;
        }
        if ((i12 & 256) != 0) {
            sVar = tVar.f30847i;
        }
        int i13 = i11;
        s sVar2 = sVar;
        long j9 = j8;
        return tVar.a(i8, i9, j9, qVar, xVar, hVar, i10, i13, sVar2);
    }

    public final t a(int i8, int i9, long j8, q qVar, x xVar, h hVar, int i10, int i11, s sVar) {
        return new t(i8, i9, j8, qVar, xVar, hVar, i10, i11, sVar, (AbstractC2633k) null);
    }

    public final int c() {
        return this.f30846h;
    }

    public final int d() {
        return this.f30845g;
    }

    public final long e() {
        return this.f30841c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return j.k(this.f30839a, tVar.f30839a) && l.j(this.f30840b, tVar.f30840b) && v.e(this.f30841c, tVar.f30841c) && kotlin.jvm.internal.t.c(this.f30842d, tVar.f30842d) && kotlin.jvm.internal.t.c(this.f30843e, tVar.f30843e) && kotlin.jvm.internal.t.c(this.f30844f, tVar.f30844f) && f.f(this.f30845g, tVar.f30845g) && e.g(this.f30846h, tVar.f30846h) && kotlin.jvm.internal.t.c(this.f30847i, tVar.f30847i);
    }

    public final h f() {
        return this.f30844f;
    }

    public final x g() {
        return this.f30843e;
    }

    public final int h() {
        return this.f30839a;
    }

    public int hashCode() {
        int iL = ((((j.l(this.f30839a) * 31) + l.k(this.f30840b)) * 31) + v.i(this.f30841c)) * 31;
        q qVar = this.f30842d;
        int iHashCode = (iL + (qVar != null ? qVar.hashCode() : 0)) * 31;
        x xVar = this.f30843e;
        int iHashCode2 = (iHashCode + (xVar != null ? xVar.hashCode() : 0)) * 31;
        h hVar = this.f30844f;
        int iHashCode3 = (((((iHashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31) + f.j(this.f30845g)) * 31) + e.h(this.f30846h)) * 31;
        s sVar = this.f30847i;
        return iHashCode3 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final int i() {
        return this.f30840b;
    }

    public final q j() {
        return this.f30842d;
    }

    public final s k() {
        return this.f30847i;
    }

    public final t l(t tVar) {
        return tVar == null ? this : u.a(this, tVar.f30839a, tVar.f30840b, tVar.f30841c, tVar.f30842d, tVar.f30843e, tVar.f30844f, tVar.f30845g, tVar.f30846h, tVar.f30847i);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) j.m(this.f30839a)) + ", textDirection=" + ((Object) l.l(this.f30840b)) + ", lineHeight=" + ((Object) v.j(this.f30841c)) + ", textIndent=" + this.f30842d + ", platformStyle=" + this.f30843e + ", lineHeightStyle=" + this.f30844f + ", lineBreak=" + ((Object) f.k(this.f30845g)) + ", hyphens=" + ((Object) e.i(this.f30846h)) + ", textMotion=" + this.f30847i + ')';
    }

    @InterfaceC0916e
    public /* synthetic */ t(j jVar, l lVar, long j8, q qVar, AbstractC2633k abstractC2633k) {
        this(jVar, lVar, j8, qVar);
    }

    @InterfaceC0916e
    public /* synthetic */ t(j jVar, l lVar, long j8, q qVar, x xVar, h hVar, AbstractC2633k abstractC2633k) {
        this(jVar, lVar, j8, qVar, xVar, hVar);
    }

    @InterfaceC0916e
    public /* synthetic */ t(j jVar, l lVar, long j8, q qVar, x xVar, h hVar, f fVar, e eVar, AbstractC2633k abstractC2633k) {
        this(jVar, lVar, j8, qVar, xVar, hVar, fVar, eVar);
    }

    @InterfaceC0916e
    public /* synthetic */ t(j jVar, l lVar, long j8, q qVar, x xVar, h hVar, f fVar, e eVar, s sVar, AbstractC2633k abstractC2633k) {
        this(jVar, lVar, j8, qVar, xVar, hVar, fVar, eVar, sVar);
    }

    public t(int i8, int i9, long j8, q qVar, x xVar, h hVar, int i10, int i11, s sVar) {
        this.f30839a = i8;
        this.f30840b = i9;
        this.f30841c = j8;
        this.f30842d = qVar;
        this.f30843e = xVar;
        this.f30844f = hVar;
        this.f30845g = i10;
        this.f30846h = i11;
        this.f30847i = sVar;
        if (v.e(j8, v.f462b.a()) || v.h(j8) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + v.h(j8) + ')').toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ t(int i8, int i9, long j8, q qVar, x xVar, h hVar, int i10, int i11, s sVar, int i12, AbstractC2633k abstractC2633k) {
        int iG = (i12 & 1) != 0 ? j.f39010b.g() : i8;
        int iF = (i12 & 2) != 0 ? l.f39024b.f() : i9;
        long jA = (i12 & 4) != 0 ? v.f462b.a() : j8;
        q qVar2 = (i12 & 8) != 0 ? null : qVar;
        x xVar2 = (i12 & 16) != 0 ? null : xVar;
        h hVar2 = (i12 & 32) != 0 ? null : hVar;
        int iB = (i12 & 64) != 0 ? f.f38972b.b() : i10;
        int iC = (i12 & 128) != 0 ? e.f38967b.c() : i11;
        this(iG, iF, jA, qVar2, xVar2, hVar2, iB, iC, (i12 & 256) == 0 ? sVar : null, (AbstractC2633k) null);
    }

    public /* synthetic */ t(j jVar, l lVar, long j8, q qVar, x xVar, h hVar, f fVar, e eVar, s sVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? null : jVar, (i8 & 2) != 0 ? null : lVar, (i8 & 4) != 0 ? v.f462b.a() : j8, (i8 & 8) != 0 ? null : qVar, (i8 & 16) != 0 ? null : xVar, (i8 & 32) != 0 ? null : hVar, (i8 & 64) != 0 ? null : fVar, (i8 & 128) != 0 ? null : eVar, (i8 & 256) == 0 ? sVar : null, (AbstractC2633k) null);
    }

    public t(j jVar, l lVar, long j8, q qVar, x xVar, h hVar, f fVar, e eVar, s sVar) {
        this(jVar != null ? jVar.n() : j.f39010b.g(), lVar != null ? lVar.m() : l.f39024b.f(), j8, qVar, xVar, hVar, fVar != null ? fVar.l() : f.f38972b.b(), eVar != null ? eVar.j() : e.f38967b.c(), sVar, (AbstractC2633k) null);
    }

    public /* synthetic */ t(j jVar, l lVar, long j8, q qVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? null : jVar, (i8 & 2) != 0 ? null : lVar, (i8 & 4) != 0 ? v.f462b.a() : j8, (i8 & 8) != 0 ? null : qVar, null);
    }

    public t(j jVar, l lVar, long j8, q qVar) {
        this(jVar != null ? jVar.n() : j.f39010b.g(), lVar != null ? lVar.m() : l.f39024b.f(), j8, qVar, (x) null, (h) null, f.f38972b.b(), e.f38967b.c(), (s) null, (AbstractC2633k) null);
    }

    public /* synthetic */ t(j jVar, l lVar, long j8, q qVar, x xVar, h hVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? null : jVar, (i8 & 2) != 0 ? null : lVar, (i8 & 4) != 0 ? v.f462b.a() : j8, (i8 & 8) != 0 ? null : qVar, (i8 & 16) != 0 ? null : xVar, (i8 & 32) != 0 ? null : hVar, null);
    }

    public t(j jVar, l lVar, long j8, q qVar, x xVar, h hVar) {
        this(jVar != null ? jVar.n() : j.f39010b.g(), lVar != null ? lVar.m() : l.f39024b.f(), j8, qVar, xVar, hVar, f.f38972b.b(), e.f38967b.c(), (s) null, (AbstractC2633k) null);
    }

    public /* synthetic */ t(j jVar, l lVar, long j8, q qVar, x xVar, h hVar, f fVar, e eVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? null : jVar, (i8 & 2) != 0 ? null : lVar, (i8 & 4) != 0 ? v.f462b.a() : j8, (i8 & 8) != 0 ? null : qVar, (i8 & 16) != 0 ? null : xVar, (i8 & 32) != 0 ? null : hVar, (i8 & 64) != 0 ? null : fVar, (i8 & 128) == 0 ? eVar : null, (AbstractC2633k) null);
    }

    public t(j jVar, l lVar, long j8, q qVar, x xVar, h hVar, f fVar, e eVar) {
        this(jVar != null ? jVar.n() : j.f39010b.g(), lVar != null ? lVar.m() : l.f39024b.f(), j8, qVar, xVar, hVar, fVar != null ? fVar.l() : f.f38972b.b(), eVar != null ? eVar.j() : e.f38967b.c(), (s) null, (AbstractC2633k) null);
    }
}
