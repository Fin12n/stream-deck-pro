package R0;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class I implements InterfaceC1621x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f9307b;

    public I(Bitmap bitmap) {
        this.f9307b = bitmap;
    }

    @Override // R0.InterfaceC1621x0
    public void a() {
        this.f9307b.prepareToDraw();
    }

    @Override // R0.InterfaceC1621x0
    public int b() {
        return J.e(this.f9307b.getConfig());
    }

    public final Bitmap c() {
        return this.f9307b;
    }

    @Override // R0.InterfaceC1621x0
    public int f() {
        return this.f9307b.getHeight();
    }

    @Override // R0.InterfaceC1621x0
    public int g() {
        return this.f9307b.getWidth();
    }
}
