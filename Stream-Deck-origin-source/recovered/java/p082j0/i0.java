package p082j0;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f28011a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f28012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f28013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f28014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f28015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f28016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f28017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f28018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f28019i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f28020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f28021k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f28022l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f28023m;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return i0.f28012b;
        }

        public final int b() {
            return i0.f28014d;
        }

        public final int c() {
            return i0.f28013c;
        }

        public final int d() {
            return i0.f28015e;
        }

        public final int e() {
            return i0.f28019i;
        }

        public final int f() {
            return i0.f28022l;
        }

        public final int g() {
            return i0.f28018h;
        }

        public final int h() {
            return i0.f28023m;
        }

        public a() {
        }
    }

    static {
        int i8 = i(8);
        f28012b = i8;
        int i9 = i(4);
        f28013c = i9;
        int i10 = i(2);
        f28014d = i10;
        int i11 = i(1);
        f28015e = i11;
        f28016f = m(i8, i11);
        f28017g = m(i9, i10);
        int i12 = i(16);
        f28018h = i12;
        int i13 = i(32);
        f28019i = i13;
        int iM = m(i8, i10);
        f28020j = iM;
        int iM2 = m(i9, i11);
        f28021k = iM2;
        f28022l = m(iM, iM2);
        f28023m = m(i12, i13);
    }

    public static final boolean j(int i8, int i9) {
        return i8 == i9;
    }

    public static final boolean k(int i8, int i9) {
        return (i8 & i9) != 0;
    }

    public static int l(int i8) {
        return Integer.hashCode(i8);
    }

    public static final int m(int i8, int i9) {
        return i(i8 | i9);
    }

    public static String n(int i8) {
        return "WindowInsetsSides(" + o(i8) + ')';
    }

    public static final String o(int i8) {
        StringBuilder sb = new StringBuilder();
        int i9 = f28016f;
        if ((i8 & i9) == i9) {
            p(sb, "Start");
        }
        int i10 = f28020j;
        if ((i8 & i10) == i10) {
            p(sb, "Left");
        }
        int i11 = f28018h;
        if ((i8 & i11) == i11) {
            p(sb, "Top");
        }
        int i12 = f28017g;
        if ((i8 & i12) == i12) {
            p(sb, "End");
        }
        int i13 = f28021k;
        if ((i8 & i13) == i13) {
            p(sb, "Right");
        }
        int i14 = f28019i;
        if ((i8 & i14) == i14) {
            p(sb, "Bottom");
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final void p(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static int i(int i8) {
        return i8;
    }
}
