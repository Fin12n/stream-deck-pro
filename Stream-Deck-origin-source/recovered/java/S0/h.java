package S0;

import R0.AbstractC1602n0;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2635m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f9639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f9640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f9641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f9642j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1628c f9643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1628c f9644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC1628c f9645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC1628c f9646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f9648f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: S0.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0267a extends h {
            public C0267a(AbstractC1628c abstractC1628c, int i8) {
                super(abstractC1628c, abstractC1628c, i8, null);
            }

            @Override // S0.h
            public long e(float f8, float f9, float f10, float f11) {
                return AbstractC1602n0.a(f8, f9, f10, f11, d());
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final float[] b(AbstractC1628c abstractC1628c, AbstractC1628c abstractC1628c2, int i8) {
            if (!m.e(i8, m.f9669a.a())) {
                return null;
            }
            long jG = abstractC1628c.g();
            AbstractC1627b.a aVar = AbstractC1627b.f9606a;
            boolean zE = AbstractC1627b.e(jG, aVar.b());
            boolean zE2 = AbstractC1627b.e(abstractC1628c2.g(), aVar.b());
            if (zE && zE2) {
                return null;
            }
            if (!zE && !zE2) {
                return null;
            }
            if (!zE) {
                abstractC1628c = abstractC1628c2;
            }
            kotlin.jvm.internal.t.e(abstractC1628c, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            A a8 = (A) abstractC1628c;
            float[] fArrC = zE ? a8.Z().c() : j.f9652a.c();
            float[] fArrC2 = zE2 ? a8.Z().c() : j.f9652a.c();
            return new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]};
        }

        public final h c() {
            return h.f9642j;
        }

        public final h d() {
            return h.f9640h;
        }

        public final h e() {
            return h.f9641i;
        }

        public final h f(AbstractC1628c abstractC1628c) {
            return new C0267a(abstractC1628c, m.f9669a.c());
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends h {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final A f9649k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final A f9650l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final float[] f9651m;

        public /* synthetic */ b(A a8, A a9, int i8, AbstractC2633k abstractC2633k) {
            this(a8, a9, i8);
        }

        @Override // S0.h
        public long e(float f8, float f9, float f10, float f11) {
            float fA = (float) this.f9649k.Q().a(f8);
            float fA2 = (float) this.f9649k.Q().a(f9);
            float fA3 = (float) this.f9649k.Q().a(f10);
            return AbstractC1602n0.a((float) this.f9650l.U().a(AbstractC1629d.n(this.f9651m, fA, fA2, fA3)), (float) this.f9650l.U().a(AbstractC1629d.o(this.f9651m, fA, fA2, fA3)), (float) this.f9650l.U().a(AbstractC1629d.p(this.f9651m, fA, fA2, fA3)), f11, this.f9650l);
        }

        public final float[] f(A a8, A a9, int i8) {
            if (AbstractC1629d.f(a8.Z(), a9.Z())) {
                return AbstractC1629d.k(a9.S(), a8.Y());
            }
            float[] fArrY = a8.Y();
            float[] fArrS = a9.S();
            float[] fArrC = a8.Z().c();
            float[] fArrC2 = a9.Z().c();
            C cZ = a8.Z();
            j jVar = j.f9652a;
            if (!AbstractC1629d.f(cZ, jVar.b())) {
                float[] fArrB = AbstractC1626a.f9601b.a().b();
                float[] fArrC3 = jVar.c();
                float[] fArrCopyOf = Arrays.copyOf(fArrC3, fArrC3.length);
                kotlin.jvm.internal.t.f(fArrCopyOf, "copyOf(this, size)");
                fArrY = AbstractC1629d.k(AbstractC1629d.e(fArrB, fArrC, fArrCopyOf), a8.Y());
            }
            if (!AbstractC1629d.f(a9.Z(), jVar.b())) {
                float[] fArrB2 = AbstractC1626a.f9601b.a().b();
                float[] fArrC4 = jVar.c();
                float[] fArrCopyOf2 = Arrays.copyOf(fArrC4, fArrC4.length);
                kotlin.jvm.internal.t.f(fArrCopyOf2, "copyOf(this, size)");
                fArrS = AbstractC1629d.j(AbstractC1629d.k(AbstractC1629d.e(fArrB2, fArrC2, fArrCopyOf2), a9.Y()));
            }
            if (m.e(i8, m.f9669a.a())) {
                fArrY = AbstractC1629d.l(new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]}, fArrY);
            }
            return AbstractC1629d.k(fArrS, fArrY);
        }

        public b(A a8, A a9, int i8) {
            super(a8, a9, a8, a9, i8, null, null);
            this.f9649k = a8;
            this.f9650l = a9;
            this.f9651m = f(a8, a9, i8);
        }
    }

    static {
        AbstractC2633k abstractC2633k = null;
        a aVar = new a(abstractC2633k);
        f9639g = aVar;
        g gVar = g.f9615a;
        f9640h = aVar.f(gVar.w());
        A aW = gVar.w();
        AbstractC1628c abstractC1628cT = gVar.t();
        m.a aVar2 = m.f9669a;
        f9641i = new h(aW, abstractC1628cT, aVar2.b(), abstractC2633k);
        f9642j = new h(gVar.t(), gVar.w(), aVar2.b(), abstractC2633k);
    }

    public /* synthetic */ h(AbstractC1628c abstractC1628c, AbstractC1628c abstractC1628c2, int i8, AbstractC2633k abstractC2633k) {
        this(abstractC1628c, abstractC1628c2, i8);
    }

    public final AbstractC1628c d() {
        return this.f9644b;
    }

    public long e(float f8, float f9, float f10, float f11) {
        long j8 = this.f9645c.j(f8, f9, f10);
        C2635m c2635m = C2635m.f28814a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        float fM = this.f9645c.m(f8, f9, f10);
        float[] fArr = this.f9648f;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fM *= fArr[2];
        }
        float f12 = fIntBitsToFloat2;
        float f13 = fIntBitsToFloat;
        return this.f9646d.n(f13, f12, fM, f11, this.f9644b);
    }

    public /* synthetic */ h(AbstractC1628c abstractC1628c, AbstractC1628c abstractC1628c2, AbstractC1628c abstractC1628c3, AbstractC1628c abstractC1628c4, int i8, float[] fArr, AbstractC2633k abstractC2633k) {
        this(abstractC1628c, abstractC1628c2, abstractC1628c3, abstractC1628c4, i8, fArr);
    }

    public h(AbstractC1628c abstractC1628c, AbstractC1628c abstractC1628c2, AbstractC1628c abstractC1628c3, AbstractC1628c abstractC1628c4, int i8, float[] fArr) {
        this.f9643a = abstractC1628c;
        this.f9644b = abstractC1628c2;
        this.f9645c = abstractC1628c3;
        this.f9646d = abstractC1628c4;
        this.f9647e = i8;
        this.f9648f = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(AbstractC1628c abstractC1628c, AbstractC1628c abstractC1628c2, int i8) {
        long jG = abstractC1628c.g();
        AbstractC1627b.a aVar = AbstractC1627b.f9606a;
        this(abstractC1628c, abstractC1628c2, AbstractC1627b.e(jG, aVar.b()) ? AbstractC1629d.d(abstractC1628c, j.f9652a.b(), null, 2, null) : abstractC1628c, AbstractC1627b.e(abstractC1628c2.g(), aVar.b()) ? AbstractC1629d.d(abstractC1628c2, j.f9652a.b(), null, 2, null) : abstractC1628c2, i8, f9639g.b(abstractC1628c, abstractC1628c2, i8), null);
    }
}
