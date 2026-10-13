package R0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9354a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f9355b = D(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f9356c = D(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f9357d = D(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f9358e = D(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f9359f = D(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f9360g = D(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f9361h = D(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f9362i = D(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f9363j = D(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f9364k = D(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f9365l = D(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f9366m = D(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f9367n = D(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f9368o = D(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f9369p = D(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f9370q = D(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f9371r = D(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f9372s = D(17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f9373t = D(18);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f9374u = D(19);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f9375v = D(20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f9376w = D(21);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f9377x = D(22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f9378y = D(23);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f9379z = D(24);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f9350A = D(25);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f9351B = D(26);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f9352C = D(27);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f9353D = D(28);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int A() {
            return X.f9362i;
        }

        public final int B() {
            return X.f9358e;
        }

        public final int C() {
            return X.f9366m;
        }

        public final int a() {
            return X.f9355b;
        }

        public final int b() {
            return X.f9352C;
        }

        public final int c() {
            return X.f9374u;
        }

        public final int d() {
            return X.f9373t;
        }

        public final int e() {
            return X.f9371r;
        }

        public final int f() {
            return X.f9377x;
        }

        public final int g() {
            return X.f9357d;
        }

        public final int h() {
            return X.f9365l;
        }

        public final int i() {
            return X.f9361h;
        }

        public final int j() {
            return X.f9363j;
        }

        public final int k() {
            return X.f9359f;
        }

        public final int l() {
            return X.f9378y;
        }

        public final int m() {
            return X.f9375v;
        }

        public final int n() {
            return X.f9350A;
        }

        public final int o() {
            return X.f9372s;
        }

        public final int p() {
            return X.f9353D;
        }

        public final int q() {
            return X.f9368o;
        }

        public final int r() {
            return X.f9379z;
        }

        public final int s() {
            return X.f9370q;
        }

        public final int t() {
            return X.f9367n;
        }

        public final int u() {
            return X.f9351B;
        }

        public final int v() {
            return X.f9369p;
        }

        public final int w() {
            return X.f9376w;
        }

        public final int x() {
            return X.f9356c;
        }

        public final int y() {
            return X.f9364k;
        }

        public final int z() {
            return X.f9360g;
        }

        public a() {
        }
    }

    public static final boolean E(int i8, int i9) {
        return i8 == i9;
    }

    public static int F(int i8) {
        return Integer.hashCode(i8);
    }

    public static String G(int i8) {
        if (E(i8, f9355b)) {
            return "Clear";
        }
        if (E(i8, f9356c)) {
            return "Src";
        }
        if (E(i8, f9357d)) {
            return "Dst";
        }
        if (E(i8, f9358e)) {
            return "SrcOver";
        }
        if (E(i8, f9359f)) {
            return "DstOver";
        }
        if (E(i8, f9360g)) {
            return "SrcIn";
        }
        if (E(i8, f9361h)) {
            return "DstIn";
        }
        if (E(i8, f9362i)) {
            return "SrcOut";
        }
        if (E(i8, f9363j)) {
            return "DstOut";
        }
        if (E(i8, f9364k)) {
            return "SrcAtop";
        }
        if (E(i8, f9365l)) {
            return "DstAtop";
        }
        if (E(i8, f9366m)) {
            return "Xor";
        }
        if (E(i8, f9367n)) {
            return "Plus";
        }
        if (E(i8, f9368o)) {
            return "Modulate";
        }
        if (E(i8, f9369p)) {
            return "Screen";
        }
        if (E(i8, f9370q)) {
            return "Overlay";
        }
        if (E(i8, f9371r)) {
            return "Darken";
        }
        if (E(i8, f9372s)) {
            return "Lighten";
        }
        if (E(i8, f9373t)) {
            return "ColorDodge";
        }
        if (E(i8, f9374u)) {
            return "ColorBurn";
        }
        if (E(i8, f9375v)) {
            return "HardLight";
        }
        if (E(i8, f9376w)) {
            return "Softlight";
        }
        if (E(i8, f9377x)) {
            return "Difference";
        }
        if (E(i8, f9378y)) {
            return "Exclusion";
        }
        if (E(i8, f9379z)) {
            return "Multiply";
        }
        if (E(i8, f9350A)) {
            return "Hue";
        }
        if (E(i8, f9351B)) {
            return "Saturation";
        }
        if (E(i8, f9352C)) {
            return "Color";
        }
        return E(i8, f9353D) ? "Luminosity" : "Unknown";
    }

    public static int D(int i8) {
        return i8;
    }
}
