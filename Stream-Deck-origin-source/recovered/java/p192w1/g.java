package p192w1;

import Q0.f;
import Q0.l;
import R0.AbstractC1582d0;
import R0.AbstractC1602n0;
import R0.C1598l0;
import R0.F0;
import R0.G0;
import R0.M;
import R0.P0;
import R0.R0;
import R0.U0;
import T0.j;
import W6.n;
import android.text.TextPaint;
import kotlin.jvm.internal.t;
import p200x1.e;
import p216z1.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g extends TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F0 f36738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f36739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public R0 f36740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T0.g f36741d;

    public g(int i8, float f8) {
        super(i8);
        ((TextPaint) this).density = f8;
        this.f36738a = M.b(this);
        this.f36739b = k.f39019b.c();
        this.f36740c = R0.f9335d.a();
    }

    public final int a() {
        return this.f36738a.y();
    }

    public final void b(int i8) {
        this.f36738a.h(i8);
    }

    public final void c(AbstractC1582d0 abstractC1582d0, long j8, float f8) {
        if (((abstractC1582d0 instanceof U0) && ((U0) abstractC1582d0).b() != C1598l0.f9405b.e()) || ((abstractC1582d0 instanceof P0) && j8 != l.f9103b.a())) {
            abstractC1582d0.a(j8, this.f36738a, Float.isNaN(f8) ? this.f36738a.c() : n.j(f8, 0.0f, 1.0f));
        } else if (abstractC1582d0 == null) {
            this.f36738a.l(null);
        }
    }

    public final void d(long j8) {
        if (j8 != C1598l0.f9405b.e()) {
            this.f36738a.t(j8);
            this.f36738a.l(null);
        }
    }

    public final void e(T0.g gVar) {
        if (gVar == null || t.c(this.f36741d, gVar)) {
            return;
        }
        this.f36741d = gVar;
        if (t.c(gVar, j.f9812a)) {
            this.f36738a.s(G0.f9302a.a());
            return;
        }
        if (gVar instanceof T0.k) {
            this.f36738a.s(G0.f9302a.b());
            T0.k kVar = (T0.k) gVar;
            this.f36738a.w(kVar.f());
            this.f36738a.n(kVar.d());
            this.f36738a.r(kVar.c());
            this.f36738a.g(kVar.b());
            this.f36738a.e(kVar.e());
        }
    }

    public final void f(R0 r8) {
        if (r8 == null || t.c(this.f36740c, r8)) {
            return;
        }
        this.f36740c = r8;
        if (t.c(r8, R0.f9335d.a())) {
            clearShadowLayer();
        } else {
            setShadowLayer(e.b(this.f36740c.b()), f.o(this.f36740c.d()), f.p(this.f36740c.d()), AbstractC1602n0.j(this.f36740c.c()));
        }
    }

    public final void g(k kVar) {
        if (kVar == null || t.c(this.f36739b, kVar)) {
            return;
        }
        this.f36739b = kVar;
        k.a aVar = k.f39019b;
        setUnderlineText(kVar.d(aVar.d()));
        setStrikeThruText(this.f36739b.d(aVar.b()));
    }
}
