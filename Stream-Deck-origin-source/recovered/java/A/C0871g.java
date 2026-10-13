package A;

import H.m1;
import android.graphics.Matrix;

/* JADX INFO: renamed from: A.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0871g extends AbstractC0884m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f275e;

    public C0871g(m1 m1Var, long j8, int i8, Matrix matrix, int i9) {
        if (m1Var == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f271a = m1Var;
        this.f272b = j8;
        this.f273c = i8;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f274d = matrix;
        this.f275e = i9;
    }

    @Override // A.AbstractC0884m0, A.InterfaceC0870f0
    public long a() {
        return this.f272b;
    }

    @Override // A.AbstractC0884m0, A.InterfaceC0870f0
    public m1 b() {
        return this.f271a;
    }

    @Override // A.AbstractC0884m0, A.InterfaceC0870f0
    public int c() {
        return this.f275e;
    }

    @Override // A.AbstractC0884m0, A.InterfaceC0870f0
    public int e() {
        return this.f273c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0884m0) {
            AbstractC0884m0 abstractC0884m0 = (AbstractC0884m0) obj;
            if (this.f271a.equals(abstractC0884m0.b()) && this.f272b == abstractC0884m0.a() && this.f273c == abstractC0884m0.e() && this.f274d.equals(abstractC0884m0.g()) && this.f275e == abstractC0884m0.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // A.AbstractC0884m0
    public Matrix g() {
        return this.f274d;
    }

    public int hashCode() {
        int iHashCode = (this.f271a.hashCode() ^ 1000003) * 1000003;
        long j8 = this.f272b;
        return ((((((iHashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ this.f273c) * 1000003) ^ this.f274d.hashCode()) * 1000003) ^ this.f275e;
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f271a + ", timestamp=" + this.f272b + ", rotationDegrees=" + this.f273c + ", sensorToBufferTransformMatrix=" + this.f274d + ", flashState=" + this.f275e + "}";
    }
}
