package A1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f432b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f433c = m(0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f434d = m(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f435e = m(Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f436a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final float a() {
            return h.f433c;
        }

        public final float b() {
            return h.f434d;
        }

        public final float c() {
            return h.f435e;
        }

        public a() {
        }
    }

    public /* synthetic */ h(float f8) {
        this.f436a = f8;
    }

    public static final /* synthetic */ h d(float f8) {
        return new h(f8);
    }

    public static int j(float f8, float f9) {
        return Float.compare(f8, f9);
    }

    public static boolean s(float f8, Object obj) {
        return (obj instanceof h) && Float.compare(f8, ((h) obj).w()) == 0;
    }

    public static final boolean t(float f8, float f9) {
        return Float.compare(f8, f9) == 0;
    }

    public static int u(float f8) {
        return Float.hashCode(f8);
    }

    public static String v(float f8) {
        if (Float.isNaN(f8)) {
            return "Dp.Unspecified";
        }
        return f8 + ".dp";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return e(((h) obj).w());
    }

    public int e(float f8) {
        return j(this.f436a, f8);
    }

    public boolean equals(Object obj) {
        return s(this.f436a, obj);
    }

    public int hashCode() {
        return u(this.f436a);
    }

    public String toString() {
        return v(this.f436a);
    }

    public final /* synthetic */ float w() {
        return this.f436a;
    }

    public static float m(float f8) {
        return f8;
    }
}
