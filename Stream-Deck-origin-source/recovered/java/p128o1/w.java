package p128o1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f30852a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f30853b = h(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f30854c = h(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f30855d = h(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f30856e = h(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f30857f = h(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f30858g = h(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f30859h = h(7);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return w.f30853b;
        }

        public final int b() {
            return w.f30855d;
        }

        public final int c() {
            return w.f30856e;
        }

        public final int d() {
            return w.f30858g;
        }

        public final int e() {
            return w.f30859h;
        }

        public final int f() {
            return w.f30857f;
        }

        public final int g() {
            return w.f30854c;
        }

        public a() {
        }
    }

    public static final boolean i(int i8, int i9) {
        return i8 == i9;
    }

    public static int j(int i8) {
        return Integer.hashCode(i8);
    }

    public static String k(int i8) {
        if (i(i8, f30853b)) {
            return "AboveBaseline";
        }
        if (i(i8, f30854c)) {
            return "Top";
        }
        if (i(i8, f30855d)) {
            return "Bottom";
        }
        if (i(i8, f30856e)) {
            return "Center";
        }
        if (i(i8, f30857f)) {
            return "TextTop";
        }
        if (i(i8, f30858g)) {
            return "TextBottom";
        }
        return i(i8, f30859h) ? "TextCenter" : "Invalid";
    }

    public static int h(int i8) {
        return i8;
    }
}
