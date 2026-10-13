package S;

import android.opengl.EGLSurface;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EGLSurface f9547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9549c;

    public c(EGLSurface eGLSurface, int i8, int i9) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f9547a = eGLSurface;
        this.f9548b = i8;
        this.f9549c = i9;
    }

    @Override // S.g
    public EGLSurface a() {
        return this.f9547a;
    }

    @Override // S.g
    public int b() {
        return this.f9549c;
    }

    @Override // S.g
    public int c() {
        return this.f9548b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f9547a.equals(gVar.a()) && this.f9548b == gVar.c() && this.f9549c == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f9547a.hashCode() ^ 1000003) * 1000003) ^ this.f9548b) * 1000003) ^ this.f9549c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f9547a + ", width=" + this.f9548b + ", height=" + this.f9549c + "}";
    }
}
