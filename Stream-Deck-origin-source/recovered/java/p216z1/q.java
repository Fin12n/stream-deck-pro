package p216z1;

import A1.v;
import A1.w;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f39041c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f39042d = new q(0, 0, 3, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39044b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final q a() {
            return q.f39042d;
        }

        public a() {
        }
    }

    public /* synthetic */ q(long j8, long j9, AbstractC2633k abstractC2633k) {
        this(j8, j9);
    }

    public final long b() {
        return this.f39043a;
    }

    public final long c() {
        return this.f39044b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return v.e(this.f39043a, qVar.f39043a) && v.e(this.f39044b, qVar.f39044b);
    }

    public int hashCode() {
        return (v.i(this.f39043a) * 31) + v.i(this.f39044b);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) v.j(this.f39043a)) + ", restLine=" + ((Object) v.j(this.f39044b)) + ')';
    }

    public q(long j8, long j9) {
        this.f39043a = j8;
        this.f39044b = j9;
    }

    public /* synthetic */ q(long j8, long j9, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? w.f(0) : j8, (i8 & 2) != 0 ? w.f(0) : j9, null);
    }
}
