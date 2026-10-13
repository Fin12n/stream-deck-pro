package Q;

import H.InterfaceC1014y;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: renamed from: Q.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1553b extends B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I.f f9002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f9004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f9005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f9007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC1014y f9008h;

    public C1553b(Object obj, I.f fVar, int i8, Size size, Rect rect, int i9, Matrix matrix, InterfaceC1014y interfaceC1014y) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.f9001a = obj;
        this.f9002b = fVar;
        this.f9003c = i8;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f9004d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f9005e = rect;
        this.f9006f = i9;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f9007g = matrix;
        if (interfaceC1014y == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f9008h = interfaceC1014y;
    }

    @Override // Q.B
    public InterfaceC1014y a() {
        return this.f9008h;
    }

    @Override // Q.B
    public Rect b() {
        return this.f9005e;
    }

    @Override // Q.B
    public Object c() {
        return this.f9001a;
    }

    @Override // Q.B
    public I.f d() {
        return this.f9002b;
    }

    @Override // Q.B
    public int e() {
        return this.f9003c;
    }

    public boolean equals(Object obj) {
        I.f fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof B) {
            B b8 = (B) obj;
            if (this.f9001a.equals(b8.c()) && ((fVar = this.f9002b) != null ? fVar.equals(b8.d()) : b8.d() == null) && this.f9003c == b8.e() && this.f9004d.equals(b8.h()) && this.f9005e.equals(b8.b()) && this.f9006f == b8.f() && this.f9007g.equals(b8.g()) && this.f9008h.equals(b8.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // Q.B
    public int f() {
        return this.f9006f;
    }

    @Override // Q.B
    public Matrix g() {
        return this.f9007g;
    }

    @Override // Q.B
    public Size h() {
        return this.f9004d;
    }

    public int hashCode() {
        int iHashCode = (this.f9001a.hashCode() ^ 1000003) * 1000003;
        I.f fVar = this.f9002b;
        return ((((((((((((iHashCode ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003) ^ this.f9003c) * 1000003) ^ this.f9004d.hashCode()) * 1000003) ^ this.f9005e.hashCode()) * 1000003) ^ this.f9006f) * 1000003) ^ this.f9007g.hashCode()) * 1000003) ^ this.f9008h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.f9001a + ", exif=" + this.f9002b + ", format=" + this.f9003c + ", size=" + this.f9004d + ", cropRect=" + this.f9005e + ", rotationDegrees=" + this.f9006f + ", sensorToBufferTransform=" + this.f9007g + ", cameraCaptureResult=" + this.f9008h + "}";
    }
}
