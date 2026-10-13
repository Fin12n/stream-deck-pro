package L;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4733d;

    public a(float f8, float f9, float f10, float f11) {
        this.f4730a = f8;
        this.f4731b = f9;
        this.f4732c = f10;
        this.f4733d = f11;
    }

    @Override // L.h, A.W0
    public float a() {
        return this.f4731b;
    }

    @Override // L.h, A.W0
    public float b() {
        return this.f4732c;
    }

    @Override // L.h, A.W0
    public float c() {
        return this.f4730a;
    }

    @Override // L.h, A.W0
    public float d() {
        return this.f4733d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (Float.floatToIntBits(this.f4730a) == Float.floatToIntBits(hVar.c()) && Float.floatToIntBits(this.f4731b) == Float.floatToIntBits(hVar.a()) && Float.floatToIntBits(this.f4732c) == Float.floatToIntBits(hVar.b()) && Float.floatToIntBits(this.f4733d) == Float.floatToIntBits(hVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f4730a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f4731b)) * 1000003) ^ Float.floatToIntBits(this.f4732c)) * 1000003) ^ Float.floatToIntBits(this.f4733d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f4730a + ", maxZoomRatio=" + this.f4731b + ", minZoomRatio=" + this.f4732c + ", linearZoom=" + this.f4733d + "}";
    }
}
