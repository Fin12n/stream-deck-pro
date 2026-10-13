package p128o1;

import C6.j;
import C6.l;
import D6.r;
import Q0.f;
import Q0.h;
import Q0.m;
import R0.AbstractC1582d0;
import R0.F;
import R0.H0;
import R0.InterfaceC1586f0;
import R0.R0;
import R0.T;
import T0.g;
import W6.n;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p136p1.z;
import p144q1.a;
import p168t1.AbstractC3009n;
import p192w1.c;
import p192w1.d;
import p216z1.i;
import p216z1.k;

/* JADX INFO: renamed from: o1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2736a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f30769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f30772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f30773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f30774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f30775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f30776h;

    /* JADX INFO: renamed from: o1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C0659a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30777a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30777a = iArr;
        }
    }

    /* JADX INFO: renamed from: o1.a$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return new a(C2736a.this.J(), C2736a.this.f30773e.E());
        }
    }

    public /* synthetic */ C2736a(String str, I i8, List list, List list2, int i9, boolean z8, long j8, AbstractC3009n.b bVar, A1.d dVar, AbstractC2633k abstractC2633k) {
        this(str, i8, list, list2, i9, z8, j8, bVar, dVar);
    }

    @Override // p128o1.n
    public int A(float f8) {
        return this.f30773e.q((int) f8);
    }

    @Override // p128o1.n
    public void B(InterfaceC1586f0 interfaceC1586f0, long j8, R0 r8, k kVar, g gVar, int i8) {
        int iA = K().a();
        p192w1.g gVarK = K();
        gVarK.d(j8);
        gVarK.f(r8);
        gVarK.g(kVar);
        gVarK.e(gVar);
        gVarK.b(i8);
        M(interfaceC1586f0);
        K().b(iA);
    }

    @Override // p128o1.n
    public H0 C(int i8, int i9) {
        if (i8 >= 0 && i8 <= i9 && i9 <= this.f30774f.length()) {
            Path path = new Path();
            this.f30773e.D(i8, i9, path);
            return T.b(path);
        }
        throw new IllegalArgumentException(("start(" + i8 + ") or end(" + i9 + ") is out of range [0.." + this.f30774f.length() + "], or start > end!").toString());
    }

    @Override // p128o1.n
    public float D(int i8, boolean z8) {
        return z8 ? z.A(this.f30773e, i8, false, 2, null) : z.C(this.f30773e, i8, false, 2, null);
    }

    @Override // p128o1.n
    public float E(int i8) {
        return this.f30773e.s(i8);
    }

    public final z G(int i8, int i9, TextUtils.TruncateAt truncateAt, int i10, int i11, int i12, int i13, int i14) {
        return new z(this.f30774f, g(), K(), i8, truncateAt, this.f30769a.j(), 1.0f, 0.0f, c.b(this.f30769a.i()), true, i10, i12, i13, i14, i11, i9, null, null, this.f30769a.g(), 196736, null);
    }

    public final float H(int i8) {
        return this.f30773e.j(i8);
    }

    public final p208y1.b[] I(z zVar) {
        if (!(zVar.E() instanceof Spanned)) {
            return new p208y1.b[0];
        }
        CharSequence charSequenceE = zVar.E();
        t.e(charSequenceE, "null cannot be cast to non-null type android.text.Spanned");
        p208y1.b[] bVarArr = (p208y1.b[]) ((Spanned) charSequenceE).getSpans(0, zVar.E().length(), p208y1.b.class);
        return bVarArr.length == 0 ? new p208y1.b[0] : bVarArr;
    }

    public final Locale J() {
        return this.f30769a.k().getTextLocale();
    }

    public final p192w1.g K() {
        return this.f30769a.k();
    }

    public final a L() {
        return (a) this.f30776h.getValue();
    }

    public final void M(InterfaceC1586f0 interfaceC1586f0) {
        Canvas canvasD = F.d(interfaceC1586f0);
        if (z()) {
            canvasD.save();
            canvasD.clipRect(0.0f, 0.0f, g(), f());
        }
        this.f30773e.I(canvasD);
        if (z()) {
            canvasD.restore();
        }
    }

    @Override // p128o1.n
    public float a(int i8) {
        return this.f30773e.v(i8);
    }

    @Override // p128o1.n
    public float b(int i8) {
        return this.f30773e.k(i8);
    }

    @Override // p128o1.n
    public float c() {
        return this.f30769a.c();
    }

    @Override // p128o1.n
    public int d(int i8) {
        return this.f30773e.u(i8);
    }

    @Override // p128o1.n
    public int e() {
        return this.f30773e.l();
    }

    @Override // p128o1.n
    public float f() {
        return this.f30773e.e();
    }

    @Override // p128o1.n
    public float g() {
        return A1.b.n(this.f30772d);
    }

    @Override // p128o1.n
    public float h() {
        return this.f30769a.h();
    }

    @Override // p128o1.n
    public void j(long j8, float[] fArr, int i8) {
        this.f30773e.a(G.l(j8), G.k(j8), fArr, i8);
    }

    @Override // p128o1.n
    public i k(int i8) {
        return this.f30773e.y(this.f30773e.p(i8)) == 1 ? i.Ltr : i.Rtl;
    }

    @Override // p128o1.n
    public float l() {
        return H(e() - 1);
    }

    @Override // p128o1.n
    public h m(int i8) {
        if (i8 >= 0 && i8 <= this.f30774f.length()) {
            float fA = z.A(this.f30773e, i8, false, 2, null);
            int iP = this.f30773e.p(i8);
            return new h(fA, this.f30773e.v(iP), fA, this.f30773e.k(iP));
        }
        throw new IllegalArgumentException(("offset(" + i8 + ") is out of bounds [0," + this.f30774f.length() + ']').toString());
    }

    @Override // p128o1.n
    public long n(int i8) {
        return H.b(L().b(i8), L().a(i8));
    }

    @Override // p128o1.n
    public int o(int i8) {
        return this.f30773e.p(i8);
    }

    @Override // p128o1.n
    public float p() {
        return H(0);
    }

    @Override // p128o1.n
    public i q(int i8) {
        return this.f30773e.H(i8) ? i.Rtl : i.Ltr;
    }

    @Override // p128o1.n
    public int r(long j8) {
        return this.f30773e.x(this.f30773e.q((int) f.p(j8)), f.o(j8));
    }

    @Override // p128o1.n
    public h s(int i8) {
        if (i8 >= 0 && i8 < this.f30774f.length()) {
            RectF rectFB = this.f30773e.b(i8);
            return new h(rectFB.left, rectFB.top, rectFB.right, rectFB.bottom);
        }
        throw new IllegalArgumentException(("offset(" + i8 + ") is out of bounds [0," + this.f30774f.length() + ')').toString());
    }

    @Override // p128o1.n
    public List t() {
        return this.f30775g;
    }

    @Override // p128o1.n
    public boolean u(int i8) {
        return this.f30773e.G(i8);
    }

    @Override // p128o1.n
    public void v(InterfaceC1586f0 interfaceC1586f0, AbstractC1582d0 abstractC1582d0, float f8, R0 r8, k kVar, g gVar, int i8) {
        int iA = K().a();
        p192w1.g gVarK = K();
        gVarK.c(abstractC1582d0, m.a(g(), f()), f8);
        gVarK.f(r8);
        gVarK.g(kVar);
        gVarK.e(gVar);
        gVarK.b(i8);
        M(interfaceC1586f0);
        K().b(iA);
    }

    @Override // p128o1.n
    public int w(int i8, boolean z8) {
        return z8 ? this.f30773e.w(i8) : this.f30773e.o(i8);
    }

    @Override // p128o1.n
    public float x(int i8) {
        return this.f30773e.t(i8);
    }

    @Override // p128o1.n
    public boolean z() {
        return this.f30773e.c();
    }

    public /* synthetic */ C2736a(d dVar, int i8, boolean z8, long j8, AbstractC2633k abstractC2633k) {
        this(dVar, i8, z8, j8);
    }

    public C2736a(d dVar, int i8, boolean z8, long j8) {
        CharSequence charSequenceE;
        C2736a c2736a;
        List listN;
        h hVar;
        float fD;
        float fJ;
        int iB;
        float fV;
        float fB;
        float fJ2;
        this.f30769a = dVar;
        this.f30770b = i8;
        this.f30771c = z8;
        this.f30772d = j8;
        if (A1.b.o(j8) != 0 || A1.b.p(j8) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i8 >= 1) {
            I i9 = dVar.i();
            if (AbstractC2737b.k(i9, z8)) {
                charSequenceE = AbstractC2737b.i(dVar.e());
            } else {
                charSequenceE = dVar.e();
            }
            this.f30774f = charSequenceE;
            int iL = AbstractC2737b.l(i9.z());
            boolean zK = p216z1.j.k(i9.z(), p216z1.j.f39010b.c());
            int iN = AbstractC2737b.n(i9.v().c());
            int iM = AbstractC2737b.m(p216z1.f.g(i9.r()));
            int iO = AbstractC2737b.o(p216z1.f.h(i9.r()));
            int iP = AbstractC2737b.p(p216z1.f.i(i9.r()));
            TextUtils.TruncateAt truncateAt = z8 ? TextUtils.TruncateAt.END : null;
            z zVarG = G(iL, zK ? 1 : 0, truncateAt, i8, iN, iM, iO, iP);
            if (z8 && zVarG.e() > A1.b.m(j8) && i8 > 1) {
                int iJ = AbstractC2737b.j(zVarG, A1.b.m(j8));
                if (iJ < 0 || iJ == i8) {
                    c2736a = this;
                } else {
                    int iD = n.d(iJ, 1);
                    c2736a = this;
                    zVarG = c2736a.G(iL, zK ? 1 : 0, truncateAt, iD, iN, iM, iO, iP);
                }
                c2736a.f30773e = zVarG;
            } else {
                c2736a = this;
                c2736a.f30773e = zVarG;
            }
            c2736a.K().c(i9.g(), m.a(c2736a.g(), c2736a.f()), i9.d());
            boolean z9 = false;
            for (p208y1.b bVar : c2736a.I(c2736a.f30773e)) {
                bVar.c(m.a(c2736a.g(), c2736a.f()));
            }
            CharSequence charSequence = c2736a.f30774f;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                Object[] spans = spanned.getSpans(0, charSequence.length(), p152r1.j.class);
                ArrayList arrayList = new ArrayList(spans.length);
                int length = spans.length;
                int i10 = 0;
                while (i10 < length) {
                    p152r1.j jVar = (p152r1.j) spans[i10];
                    int spanStart = spanned.getSpanStart(jVar);
                    int spanEnd = spanned.getSpanEnd(jVar);
                    int iP2 = c2736a.f30773e.p(spanStart);
                    boolean z10 = iP2 >= c2736a.f30770b ? true : z9;
                    boolean z11 = (c2736a.f30773e.m(iP2) <= 0 || spanEnd <= c2736a.f30773e.n(iP2)) ? z9 : true;
                    boolean z12 = spanEnd > c2736a.f30773e.o(iP2) ? true : z9;
                    if (z11 || z12 || z10) {
                        hVar = null;
                    } else {
                        int i11 = C0659a.f30777a[c2736a.q(spanStart).ordinal()];
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new C6.m();
                            }
                            fD = c2736a.D(spanStart, true) - jVar.d();
                        } else {
                            fD = c2736a.D(spanStart, true);
                        }
                        float fD2 = jVar.d() + fD;
                        z zVar = c2736a.f30773e;
                        switch (jVar.c()) {
                            case 0:
                                fJ = zVar.j(iP2);
                                iB = jVar.b();
                                fV = fJ - iB;
                                hVar = new h(fD, fV, fD2, jVar.b() + fV);
                                break;
                            case 1:
                                fV = zVar.v(iP2);
                                hVar = new h(fD, fV, fD2, jVar.b() + fV);
                                break;
                            case 2:
                                fJ = zVar.k(iP2);
                                iB = jVar.b();
                                fV = fJ - iB;
                                hVar = new h(fD, fV, fD2, jVar.b() + fV);
                                break;
                            case 3:
                                fV = ((zVar.v(iP2) + zVar.k(iP2)) - jVar.b()) / 2;
                                hVar = new h(fD, fV, fD2, jVar.b() + fV);
                                break;
                            case 4:
                                fB = jVar.a().ascent;
                                fJ2 = zVar.j(iP2);
                                fV = fB + fJ2;
                                hVar = new h(fD, fV, fD2, jVar.b() + fV);
                                break;
                            case 5:
                                fJ = jVar.a().descent + zVar.j(iP2);
                                iB = jVar.b();
                                fV = fJ - iB;
                                hVar = new h(fD, fV, fD2, jVar.b() + fV);
                                break;
                            case 6:
                                Paint.FontMetricsInt fontMetricsIntA = jVar.a();
                                fB = ((fontMetricsIntA.ascent + fontMetricsIntA.descent) - jVar.b()) / 2;
                                fJ2 = zVar.j(iP2);
                                fV = fB + fJ2;
                                hVar = new h(fD, fV, fD2, jVar.b() + fV);
                                break;
                            default:
                                throw new IllegalStateException("unexpected verticalAlignment");
                        }
                    }
                    arrayList.add(hVar);
                    i10++;
                    z9 = false;
                }
                listN = arrayList;
            } else {
                listN = r.n();
            }
            c2736a.f30775g = listN;
            c2736a.f30776h = C6.k.a(l.NONE, c2736a.new b());
            return;
        }
        throw new IllegalArgumentException("maxLines should be greater than 0");
    }

    public C2736a(String str, I i8, List list, List list2, int i9, boolean z8, long j8, AbstractC3009n.b bVar, A1.d dVar) {
        this(new d(str, i8, list, list2, bVar, dVar), i9, z8, j8, null);
    }
}
