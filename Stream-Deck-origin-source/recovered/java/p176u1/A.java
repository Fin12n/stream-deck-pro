package p176u1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34339a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f34340b = j(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f34341c = j(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f34342d = j(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f34343e = j(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f34344f = j(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f34345g = j(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f34346h = j(7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f34347i = j(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f34348j = j(9);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return A.f34341c;
        }

        public final int b() {
            return A.f34348j;
        }

        public final int c() {
            return A.f34345g;
        }

        public final int d() {
            return A.f34342d;
        }

        public final int e() {
            return A.f34347i;
        }

        public final int f() {
            return A.f34346h;
        }

        public final int g() {
            return A.f34343e;
        }

        public final int h() {
            return A.f34340b;
        }

        public final int i() {
            return A.f34344f;
        }

        public a() {
        }
    }

    public static final boolean k(int i8, int i9) {
        return i8 == i9;
    }

    public static int l(int i8) {
        return Integer.hashCode(i8);
    }

    public static String m(int i8) {
        if (k(i8, f34340b)) {
            return "Text";
        }
        if (k(i8, f34341c)) {
            return "Ascii";
        }
        if (k(i8, f34342d)) {
            return "Number";
        }
        if (k(i8, f34343e)) {
            return "Phone";
        }
        if (k(i8, f34344f)) {
            return "Uri";
        }
        if (k(i8, f34345g)) {
            return "Email";
        }
        if (k(i8, f34346h)) {
            return "Password";
        }
        if (k(i8, f34347i)) {
            return "NumberPassword";
        }
        return k(i8, f34348j) ? "Decimal" : "Invalid";
    }

    public static int j(int i8) {
        return i8;
    }
}
