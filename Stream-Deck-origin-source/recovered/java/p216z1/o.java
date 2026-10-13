package p216z1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f39037c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f39038d = new o(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f39039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f39040b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final o a() {
            return o.f39038d;
        }

        public a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o() {
        float f8 = 0.0f;
        this(f8, f8, 3, null);
    }

    public final float b() {
        return this.f39039a;
    }

    public final float c() {
        return this.f39040b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f39039a == oVar.f39039a && this.f39040b == oVar.f39040b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f39039a) * 31) + Float.hashCode(this.f39040b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f39039a + ", skewX=" + this.f39040b + ')';
    }

    public o(float f8, float f9) {
        this.f39039a = f8;
        this.f39040b = f9;
    }

    public /* synthetic */ o(float f8, float f9, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? 1.0f : f8, (i8 & 2) != 0 ? 0.0f : f9);
    }
}
