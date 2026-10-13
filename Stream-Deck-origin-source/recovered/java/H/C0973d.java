package H;

import androidx.lifecycle.AbstractC1737u;

/* JADX INFO: renamed from: H.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C0973d extends C1007u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f2980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B f2983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AbstractC1737u f2984f;

    public C0973d(I i8, B b8) {
        super(i8);
        this.f2981c = false;
        this.f2982d = false;
        this.f2984f = null;
        this.f2980b = i8;
        this.f2983e = b8;
        b8.M(null);
        x(b8.C());
        w(b8.Z());
    }

    public static float u(float f8, float f9, float f10) {
        if (f10 == f9) {
            return 0.0f;
        }
        if (f8 == f10) {
            return 1.0f;
        }
        if (f8 == f9) {
            return 0.0f;
        }
        float f11 = 1.0f / f9;
        return ((1.0f / f8) - f11) / ((1.0f / f10) - f11);
    }

    @Override // H.C1007u0, H.I
    public I g() {
        return this.f2980b;
    }

    public B t() {
        return this.f2983e;
    }

    public e1 v() {
        return null;
    }

    public void w(boolean z8) {
        this.f2982d = z8;
    }

    public void x(boolean z8) {
        this.f2981c = z8;
    }
}
