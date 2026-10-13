package A;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: renamed from: A.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0873h extends G0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H.J f280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f282e;

    public C0873h(Size size, Rect rect, H.J j8, int i8, boolean z8) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f278a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.f279b = rect;
        this.f280c = j8;
        this.f281d = i8;
        this.f282e = z8;
    }

    @Override // A.G0.a
    public H.J a() {
        return this.f280c;
    }

    @Override // A.G0.a
    public Rect b() {
        return this.f279b;
    }

    @Override // A.G0.a
    public Size c() {
        return this.f278a;
    }

    @Override // A.G0.a
    public boolean d() {
        return this.f282e;
    }

    @Override // A.G0.a
    public int e() {
        return this.f281d;
    }

    public boolean equals(Object obj) {
        H.J j8;
        if (obj == this) {
            return true;
        }
        if (obj instanceof G0.a) {
            G0.a aVar = (G0.a) obj;
            if (this.f278a.equals(aVar.c()) && this.f279b.equals(aVar.b()) && ((j8 = this.f280c) != null ? j8.equals(aVar.a()) : aVar.a() == null) && this.f281d == aVar.e() && this.f282e == aVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f278a.hashCode() ^ 1000003) * 1000003) ^ this.f279b.hashCode()) * 1000003;
        H.J j8 = this.f280c;
        return ((((iHashCode ^ (j8 == null ? 0 : j8.hashCode())) * 1000003) ^ this.f281d) * 1000003) ^ (this.f282e ? 1231 : 1237);
    }

    public String toString() {
        return "CameraInputInfo{inputSize=" + this.f278a + ", inputCropRect=" + this.f279b + ", cameraInternal=" + this.f280c + ", rotationDegrees=" + this.f281d + ", mirroring=" + this.f282e + "}";
    }
}
