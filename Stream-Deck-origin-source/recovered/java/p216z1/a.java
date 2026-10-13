package p216z1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0854a f38959b = new C0854a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f38960c = c(0.5f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f38961d = c(-0.5f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f38962e = c(0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f38963a;

    /* JADX INFO: renamed from: z1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0854a {
        public /* synthetic */ C0854a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final float a() {
            return a.f38962e;
        }

        public C0854a() {
        }
    }

    public /* synthetic */ a(float f8) {
        this.f38963a = f8;
    }

    public static final /* synthetic */ a b(float f8) {
        return new a(f8);
    }

    public static boolean d(float f8, Object obj) {
        return (obj instanceof a) && Float.compare(f8, ((a) obj).h()) == 0;
    }

    public static final boolean e(float f8, float f9) {
        return Float.compare(f8, f9) == 0;
    }

    public static int f(float f8) {
        return Float.hashCode(f8);
    }

    public static String g(float f8) {
        return "BaselineShift(multiplier=" + f8 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f38963a, obj);
    }

    public final /* synthetic */ float h() {
        return this.f38963a;
    }

    public int hashCode() {
        return f(this.f38963a);
    }

    public String toString() {
        return g(this.f38963a);
    }

    public static float c(float f8) {
        return f8;
    }
}
