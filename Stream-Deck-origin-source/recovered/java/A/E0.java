package A;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class E0 extends androidx.camera.core.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f31d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC0870f0 f32e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect f33f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f34g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f35h;

    public E0(androidx.camera.core.d dVar, InterfaceC0870f0 interfaceC0870f0) {
        this(dVar, null, interfaceC0870f0);
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public void d1(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, g(), f())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f31d) {
            this.f33f = rect;
        }
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public InterfaceC0870f0 e1() {
        return this.f32e;
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public int f() {
        return this.f35h;
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public int g() {
        return this.f34g;
    }

    public E0(androidx.camera.core.d dVar, Size size, InterfaceC0870f0 interfaceC0870f0) {
        super(dVar);
        this.f31d = new Object();
        if (size == null) {
            this.f34g = super.g();
            this.f35h = super.f();
        } else {
            this.f34g = size.getWidth();
            this.f35h = size.getHeight();
        }
        this.f32e = interfaceC0870f0;
    }
}
