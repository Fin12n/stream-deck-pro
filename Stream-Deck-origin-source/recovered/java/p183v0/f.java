package p183v0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f34976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f34977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34979d;

    public f(float f8, float f9, float f10, float f11) {
        this.f34976a = f8;
        this.f34977b = f9;
        this.f34978c = f10;
        this.f34979d = f11;
    }

    public final float a() {
        return this.f34976a;
    }

    public final float b() {
        return this.f34977b;
    }

    public final float c() {
        return this.f34978c;
    }

    public final float d() {
        return this.f34979d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f34976a == fVar.f34976a && this.f34977b == fVar.f34977b && this.f34978c == fVar.f34978c && this.f34979d == fVar.f34979d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f34976a) * 31) + Float.hashCode(this.f34977b)) * 31) + Float.hashCode(this.f34978c)) * 31) + Float.hashCode(this.f34979d);
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f34976a + ", focusedAlpha=" + this.f34977b + ", hoveredAlpha=" + this.f34978c + ", pressedAlpha=" + this.f34979d + ')';
    }
}
