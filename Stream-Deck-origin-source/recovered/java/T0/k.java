package T0;

import R0.I0;
import R0.V0;
import R0.W0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class k extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f9813f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f9814g = V0.f9341a.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f9815h = W0.f9346a.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I0 f9820e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return k.f9814g;
        }

        public a() {
        }
    }

    public /* synthetic */ k(float f8, float f9, int i8, int i9, I0 i10, AbstractC2633k abstractC2633k) {
        this(f8, f9, i8, i9, i10);
    }

    public final int b() {
        return this.f9818c;
    }

    public final int c() {
        return this.f9819d;
    }

    public final float d() {
        return this.f9817b;
    }

    public final I0 e() {
        return this.f9820e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f9816a == kVar.f9816a && this.f9817b == kVar.f9817b && V0.e(this.f9818c, kVar.f9818c) && W0.e(this.f9819d, kVar.f9819d) && t.c(this.f9820e, kVar.f9820e);
    }

    public final float f() {
        return this.f9816a;
    }

    public int hashCode() {
        int iHashCode = ((((((Float.hashCode(this.f9816a) * 31) + Float.hashCode(this.f9817b)) * 31) + V0.f(this.f9818c)) * 31) + W0.f(this.f9819d)) * 31;
        I0 i8 = this.f9820e;
        return iHashCode + (i8 != null ? i8.hashCode() : 0);
    }

    public String toString() {
        return "Stroke(width=" + this.f9816a + ", miter=" + this.f9817b + ", cap=" + ((Object) V0.g(this.f9818c)) + ", join=" + ((Object) W0.g(this.f9819d)) + ", pathEffect=" + this.f9820e + ')';
    }

    public /* synthetic */ k(float f8, float f9, int i8, int i9, I0 i10, int i11, AbstractC2633k abstractC2633k) {
        this((i11 & 1) != 0 ? 0.0f : f8, (i11 & 2) != 0 ? 4.0f : f9, (i11 & 4) != 0 ? f9814g : i8, (i11 & 8) != 0 ? f9815h : i9, (i11 & 16) != 0 ? null : i10, null);
    }

    public k(float f8, float f9, int i8, int i9, I0 i10) {
        super(null);
        this.f9816a = f8;
        this.f9817b = f9;
        this.f9818c = i8;
        this.f9819d = i9;
        this.f9820e = i10;
    }
}
