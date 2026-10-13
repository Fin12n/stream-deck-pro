package A;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: A.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0879k extends S0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Matrix f293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f294f;

    public C0879k(Rect rect, int i8, int i9, boolean z8, Matrix matrix, boolean z9) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f289a = rect;
        this.f290b = i8;
        this.f291c = i9;
        this.f292d = z8;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f293e = matrix;
        this.f294f = z9;
    }

    @Override // A.S0.h
    public Rect a() {
        return this.f289a;
    }

    @Override // A.S0.h
    public int b() {
        return this.f290b;
    }

    @Override // A.S0.h
    public Matrix c() {
        return this.f293e;
    }

    @Override // A.S0.h
    public int d() {
        return this.f291c;
    }

    @Override // A.S0.h
    public boolean e() {
        return this.f292d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof S0.h) {
            S0.h hVar = (S0.h) obj;
            if (this.f289a.equals(hVar.a()) && this.f290b == hVar.b() && this.f291c == hVar.d() && this.f292d == hVar.e() && this.f293e.equals(hVar.c()) && this.f294f == hVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // A.S0.h
    public boolean f() {
        return this.f294f;
    }

    public int hashCode() {
        return ((((((((((this.f289a.hashCode() ^ 1000003) * 1000003) ^ this.f290b) * 1000003) ^ this.f291c) * 1000003) ^ (this.f292d ? 1231 : 1237)) * 1000003) ^ this.f293e.hashCode()) * 1000003) ^ (this.f294f ? 1231 : 1237);
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f289a + ", getRotationDegrees=" + this.f290b + ", getTargetRotation=" + this.f291c + ", hasCameraTransform=" + this.f292d + ", getSensorToBufferTransform=" + this.f293e + ", isMirroring=" + this.f294f + "}";
    }
}
