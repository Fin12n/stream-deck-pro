package R0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class R0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f9335d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final R0 f9336e = new R0(0, 0, 0.0f, 7, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9339c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final R0 a() {
            return R0.f9336e;
        }

        public a() {
        }
    }

    public /* synthetic */ R0(long j8, long j9, float f8, AbstractC2633k abstractC2633k) {
        this(j8, j9, f8);
    }

    public final float b() {
        return this.f9339c;
    }

    public final long c() {
        return this.f9337a;
    }

    public final long d() {
        return this.f9338b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R0)) {
            return false;
        }
        R0 r8 = (R0) obj;
        return C1598l0.q(this.f9337a, r8.f9337a) && Q0.f.l(this.f9338b, r8.f9338b) && this.f9339c == r8.f9339c;
    }

    public int hashCode() {
        return (((C1598l0.w(this.f9337a) * 31) + Q0.f.q(this.f9338b)) * 31) + Float.hashCode(this.f9339c);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) C1598l0.x(this.f9337a)) + ", offset=" + ((Object) Q0.f.v(this.f9338b)) + ", blurRadius=" + this.f9339c + ')';
    }

    public R0(long j8, long j9, float f8) {
        this.f9337a = j8;
        this.f9338b = j9;
        this.f9339c = f8;
    }

    public /* synthetic */ R0(long j8, long j9, float f8, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? AbstractC1602n0.d(4278190080L) : j8, (i8 & 2) != 0 ? Q0.f.f9082b.c() : j9, (i8 & 4) != 0 ? 0.0f : f8, null);
    }
}
