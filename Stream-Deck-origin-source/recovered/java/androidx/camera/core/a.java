package androidx.camera.core;

import A.AbstractC0884m0;
import A.InterfaceC0870f0;
import H.m1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f14131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0346a[] f14132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0870f0 f14133c;

    /* JADX INFO: renamed from: androidx.camera.core.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0346a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Image.Plane f14134a;

        public C0346a(Image.Plane plane) {
            this.f14134a = plane;
        }

        @Override // androidx.camera.core.d.a
        public int a() {
            return this.f14134a.getRowStride();
        }

        @Override // androidx.camera.core.d.a
        public int b() {
            return this.f14134a.getPixelStride();
        }

        @Override // androidx.camera.core.d.a
        public ByteBuffer l() {
            return this.f14134a.getBuffer();
        }
    }

    public a(Image image) {
        this.f14131a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f14132b = new C0346a[planes.length];
            for (int i8 = 0; i8 < planes.length; i8++) {
                this.f14132b[i8] = new C0346a(planes[i8]);
            }
        } else {
            this.f14132b = new C0346a[0];
        }
        this.f14133c = AbstractC0884m0.f(m1.b(), image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // androidx.camera.core.d
    public d.a[] D() {
        return this.f14132b;
    }

    @Override // androidx.camera.core.d, java.lang.AutoCloseable
    public void close() {
        this.f14131a.close();
    }

    @Override // androidx.camera.core.d
    public void d1(Rect rect) {
        this.f14131a.setCropRect(rect);
    }

    @Override // androidx.camera.core.d
    public InterfaceC0870f0 e1() {
        return this.f14133c;
    }

    @Override // androidx.camera.core.d
    public int f() {
        return this.f14131a.getHeight();
    }

    @Override // androidx.camera.core.d
    public int g() {
        return this.f14131a.getWidth();
    }

    @Override // androidx.camera.core.d
    public int getFormat() {
        return this.f14131a.getFormat();
    }

    @Override // androidx.camera.core.d
    public Image x1() {
        return this.f14131a;
    }
}
