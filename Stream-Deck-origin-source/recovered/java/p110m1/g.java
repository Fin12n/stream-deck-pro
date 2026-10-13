package p110m1;

import W6.e;
import W6.m;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f29502d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f29503e = new g(0.0f, m.b(0.0f, 0.0f), 0, 4, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f29504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f29505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29506c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final g a() {
            return g.f29503e;
        }

        public a() {
        }
    }

    public g(float f8, e eVar, int i8) {
        this.f29504a = f8;
        this.f29505b = eVar;
        this.f29506c = i8;
        if (Float.isNaN(f8)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final float b() {
        return this.f29504a;
    }

    public final e c() {
        return this.f29505b;
    }

    public final int d() {
        return this.f29506c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f29504a == gVar.f29504a && t.c(this.f29505b, gVar.f29505b) && this.f29506c == gVar.f29506c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f29504a) * 31) + this.f29505b.hashCode()) * 31) + this.f29506c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f29504a + ", range=" + this.f29505b + ", steps=" + this.f29506c + ')';
    }

    public /* synthetic */ g(float f8, e eVar, int i8, int i9, AbstractC2633k abstractC2633k) {
        this(f8, eVar, (i9 & 4) != 0 ? 0 : i8);
    }
}
