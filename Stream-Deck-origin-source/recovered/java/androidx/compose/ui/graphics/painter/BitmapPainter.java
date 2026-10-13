package androidx.compose.ui.graphics.painter;

import A1.n;
import A1.r;
import A1.s;
import Q0.l;
import R0.AbstractC1615u0;
import R0.C1600m0;
import R0.InterfaceC1621x0;
import S6.c;
import T0.f;
import U0.b;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class BitmapPainter extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1621x0 f14709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f14710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f14711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14712j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f14713k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f14714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C1600m0 f14715m;

    public /* synthetic */ BitmapPainter(InterfaceC1621x0 interfaceC1621x0, long j8, long j9, AbstractC2633k abstractC2633k) {
        this(interfaceC1621x0, j8, j9);
    }

    @Override // U0.b
    public boolean a(float f8) {
        this.f14714l = f8;
        return true;
    }

    @Override // U0.b
    public boolean b(C1600m0 c1600m0) {
        this.f14715m = c1600m0;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return t.c(this.f14709g, bitmapPainter.f14709g) && n.i(this.f14710h, bitmapPainter.f14710h) && r.e(this.f14711i, bitmapPainter.f14711i) && AbstractC1615u0.d(this.f14712j, bitmapPainter.f14712j);
    }

    @Override // U0.b
    public long h() {
        return s.c(this.f14713k);
    }

    public int hashCode() {
        return (((((this.f14709g.hashCode() * 31) + n.l(this.f14710h)) * 31) + r.h(this.f14711i)) * 31) + AbstractC1615u0.e(this.f14712j);
    }

    @Override // U0.b
    public void j(f fVar) {
        f.F0(fVar, this.f14709g, this.f14710h, this.f14711i, 0L, s.a(c.d(l.i(fVar.d())), c.d(l.g(fVar.d()))), this.f14714l, null, this.f14715m, 0, this.f14712j, 328, null);
    }

    public final void k(int i8) {
        this.f14712j = i8;
    }

    public final long l(long j8, long j9) {
        if (n.j(j8) < 0 || n.k(j8) < 0 || r.g(j9) < 0 || r.f(j9) < 0 || r.g(j9) > this.f14709g.g() || r.f(j9) > this.f14709g.f()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return j9;
    }

    public String toString() {
        return "BitmapPainter(image=" + this.f14709g + ", srcOffset=" + ((Object) n.m(this.f14710h)) + ", srcSize=" + ((Object) r.i(this.f14711i)) + ", filterQuality=" + ((Object) AbstractC1615u0.f(this.f14712j)) + ')';
    }

    public /* synthetic */ BitmapPainter(InterfaceC1621x0 interfaceC1621x0, long j8, long j9, int i8, AbstractC2633k abstractC2633k) {
        this(interfaceC1621x0, (i8 & 2) != 0 ? n.f446b.a() : j8, (i8 & 4) != 0 ? s.a(interfaceC1621x0.g(), interfaceC1621x0.f()) : j9, null);
    }

    public BitmapPainter(InterfaceC1621x0 interfaceC1621x0, long j8, long j9) {
        this.f14709g = interfaceC1621x0;
        this.f14710h = j8;
        this.f14711i = j9;
        this.f14712j = AbstractC1615u0.f9427a.a();
        this.f14713k = l(j8, j9);
        this.f14714l = 1.0f;
    }
}
