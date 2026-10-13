package S0;

import p180u5.FCkZ.BpgIURjN;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f9615a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f9616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f9617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B f9618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B f9619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final A f9620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final A f9621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final A f9622h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final A f9623i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final A f9624j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final A f9625k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final A f9626l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final A f9627m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final A f9628n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final A f9629o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final A f9630p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final A f9631q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final A f9632r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final A f9633s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AbstractC1628c f9634t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AbstractC1628c f9635u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final A f9636v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final AbstractC1628c f9637w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final AbstractC1628c[] f9638x;

    public static final double c(double d8) {
        return AbstractC1629d.a(d8, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public static final double d(double d8) {
        return AbstractC1629d.b(d8, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final A e() {
        return f9632r;
    }

    public final A f() {
        return f9633s;
    }

    public final A g() {
        return f9630p;
    }

    public final A h() {
        return f9625k;
    }

    public final A i() {
        return f9624j;
    }

    public final AbstractC1628c j() {
        return f9635u;
    }

    public final AbstractC1628c k() {
        return f9634t;
    }

    public final AbstractC1628c[] l() {
        return f9638x;
    }

    public final A m() {
        return f9626l;
    }

    public final A n() {
        return f9627m;
    }

    public final A o() {
        return f9622h;
    }

    public final A p() {
        return f9623i;
    }

    public final A q() {
        return f9621g;
    }

    public final A r() {
        return f9628n;
    }

    public final float[] s() {
        return f9617c;
    }

    public final AbstractC1628c t() {
        return f9637w;
    }

    public final A u() {
        return f9631q;
    }

    public final A v() {
        return f9629o;
    }

    public final A w() {
        return f9620f;
    }

    public final float[] x() {
        return f9616b;
    }

    public final A y() {
        return f9636v;
    }

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f9616b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f9617c = fArr2;
        B b8 = new B(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f9618d = b8;
        B b9 = new B(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f9619e = b9;
        j jVar = j.f9652a;
        A a8 = new A("sRGB IEC61966-2.1", fArr, jVar.e(), b8, 0);
        f9620f = a8;
        A a9 = new A("sRGB IEC61966-2.1 (Linear)", fArr, jVar.e(), 1.0d, 0.0f, 1.0f, 1);
        f9621g = a9;
        A a10 = new A("scRGB-nl IEC 61966-2-2:2003", fArr, jVar.e(), null, new i() { // from class: S0.e
            @Override // S0.i
            public final double a(double d8) {
                return g.c(d8);
            }
        }, new i() { // from class: S0.f
            @Override // S0.i
            public final double a(double d8) {
                return g.d(d8);
            }
        }, -0.799f, 2.399f, b8, 2);
        f9622h = a10;
        A a11 = new A("scRGB IEC 61966-2-2:2003", fArr, jVar.e(), 1.0d, -0.5f, 7.499f, 3);
        f9623i = a11;
        A a12 = new A("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, jVar.e(), new B(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f9624j = a12;
        A a13 = new A("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, jVar.e(), new B(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f9625k = a13;
        A a14 = new A("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f9626l = a14;
        A a15 = new A(QhsKALGiniuQ.hOwhZdowL, new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, jVar.e(), b8, 7);
        f9627m = a15;
        A a16 = new A("NTSC (1953)", fArr2, jVar.a(), new B(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        f9628n = a16;
        A a17 = new A("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, jVar.e(), new B(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        f9629o = a17;
        A a18 = new A("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, jVar.e(), 2.2d, 0.0f, 1.0f, 10);
        f9630p = a18;
        A a19 = new A("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, jVar.b(), new B(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        f9631q = a19;
        A a20 = new A("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, jVar.d(), 1.0d, -65504.0f, 65504.0f, 12);
        f9632r = a20;
        A a21 = new A("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, jVar.d(), 1.0d, -65504.0f, 65504.0f, 13);
        f9633s = a21;
        D d8 = new D(BpgIURjN.KYspoGmrmkD, 14);
        f9634t = d8;
        k kVar = new k("Generic L*a*b*", 15);
        f9635u = kVar;
        A a22 = new A("None", fArr, jVar.e(), b9, 16);
        f9636v = a22;
        l lVar = new l("Oklab", 17);
        f9637w = lVar;
        f9638x = new AbstractC1628c[]{a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, d8, kVar, a22, lVar};
    }
}
