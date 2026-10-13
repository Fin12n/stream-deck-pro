package V0;

import R0.AbstractC1582d0;
import R0.H0;
import R0.K0;
import R0.S;
import R0.T;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC1582d0 f10324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f10325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f10326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f10328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f10329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AbstractC1582d0 f10330i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10331j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f10333l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f10334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f10335n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f10336o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10339r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public T0.k f10340s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final H0 f10341t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public H0 f10342u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C6.j f10343v;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10344a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final K0 invoke() {
            return S.a();
        }
    }

    public g() {
        super(null);
        this.f10323b = "";
        this.f10325d = 1.0f;
        this.f10326e = o.e();
        this.f10327f = o.b();
        this.f10328g = 1.0f;
        this.f10331j = o.c();
        this.f10332k = o.d();
        this.f10333l = 4.0f;
        this.f10335n = 1.0f;
        this.f10337p = true;
        this.f10338q = true;
        H0 h0A = T.a();
        this.f10341t = h0A;
        this.f10342u = h0A;
        this.f10343v = C6.k.a(C6.l.NONE, a.f10344a);
    }

    @Override // V0.l
    public void a(T0.f fVar) {
        T0.k kVar;
        if (this.f10337p) {
            v();
        } else if (this.f10339r) {
            w();
        }
        this.f10337p = false;
        this.f10339r = false;
        AbstractC1582d0 abstractC1582d0 = this.f10324c;
        if (abstractC1582d0 != null) {
            T0.f.e0(fVar, this.f10342u, abstractC1582d0, this.f10325d, null, null, 0, 56, null);
        }
        AbstractC1582d0 abstractC1582d1 = this.f10330i;
        if (abstractC1582d1 != null) {
            T0.k kVar2 = this.f10340s;
            if (this.f10338q || kVar2 == null) {
                T0.k kVar3 = new T0.k(this.f10329h, this.f10333l, this.f10331j, this.f10332k, null, 16, null);
                this.f10340s = kVar3;
                this.f10338q = false;
                kVar = kVar3;
            } else {
                kVar = kVar2;
            }
            T0.f.e0(fVar, this.f10342u, abstractC1582d1, this.f10328g, kVar, null, 0, 48, null);
        }
    }

    public final AbstractC1582d0 e() {
        return this.f10324c;
    }

    public final K0 f() {
        return (K0) this.f10343v.getValue();
    }

    public final AbstractC1582d0 g() {
        return this.f10330i;
    }

    public final void h(AbstractC1582d0 abstractC1582d0) {
        this.f10324c = abstractC1582d0;
        c();
    }

    public final void i(float f8) {
        this.f10325d = f8;
        c();
    }

    public final void j(String str) {
        this.f10323b = str;
        c();
    }

    public final void k(List list) {
        this.f10326e = list;
        this.f10337p = true;
        c();
    }

    public final void l(int i8) {
        this.f10327f = i8;
        this.f10342u.f(i8);
        c();
    }

    public final void m(AbstractC1582d0 abstractC1582d0) {
        this.f10330i = abstractC1582d0;
        c();
    }

    public final void n(float f8) {
        this.f10328g = f8;
        c();
    }

    public final void o(int i8) {
        this.f10331j = i8;
        this.f10338q = true;
        c();
    }

    public final void p(int i8) {
        this.f10332k = i8;
        this.f10338q = true;
        c();
    }

    public final void q(float f8) {
        this.f10333l = f8;
        this.f10338q = true;
        c();
    }

    public final void r(float f8) {
        this.f10329h = f8;
        this.f10338q = true;
        c();
    }

    public final void s(float f8) {
        this.f10335n = f8;
        this.f10339r = true;
        c();
    }

    public final void t(float f8) {
        this.f10336o = f8;
        this.f10339r = true;
        c();
    }

    public String toString() {
        return this.f10341t.toString();
    }

    public final void u(float f8) {
        this.f10334m = f8;
        this.f10339r = true;
        c();
    }

    public final void v() {
        k.c(this.f10326e, this.f10341t);
        w();
    }

    public final void w() {
        if (this.f10334m == 0.0f && this.f10335n == 1.0f) {
            this.f10342u = this.f10341t;
            return;
        }
        if (t.c(this.f10342u, this.f10341t)) {
            this.f10342u = T.a();
        } else {
            int iG = this.f10342u.g();
            this.f10342u.l();
            this.f10342u.f(iG);
        }
        f().a(this.f10341t, false);
        float fC = f().c();
        float f8 = this.f10334m;
        float f9 = this.f10336o;
        float f10 = ((f8 + f9) % 1.0f) * fC;
        float f11 = ((this.f10335n + f9) % 1.0f) * fC;
        if (f10 <= f11) {
            f().b(f10, f11, this.f10342u, true);
        } else {
            f().b(f10, fC, this.f10342u, true);
            f().b(0.0f, f11, this.f10342u, true);
        }
    }
}
