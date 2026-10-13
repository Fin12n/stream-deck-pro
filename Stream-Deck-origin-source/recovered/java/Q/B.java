package Q;

import H.InterfaceC1014y;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    public static B i(Bitmap bitmap, I.f fVar, Rect rect, int i8, Matrix matrix, InterfaceC1014y interfaceC1014y) {
        return new C1553b(bitmap, fVar, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i8, matrix, interfaceC1014y);
    }

    public static B j(androidx.camera.core.d dVar, I.f fVar, Rect rect, int i8, Matrix matrix, InterfaceC1014y interfaceC1014y) {
        return k(dVar, fVar, new Size(dVar.g(), dVar.f()), rect, i8, matrix, interfaceC1014y);
    }

    public static B k(androidx.camera.core.d dVar, I.f fVar, Size size, Rect rect, int i8, Matrix matrix, InterfaceC1014y interfaceC1014y) {
        if (P.b.g(dVar.getFormat())) {
            T1.f.h(fVar, "JPEG image must have Exif.");
        }
        return new C1553b(dVar, fVar, dVar.getFormat(), size, rect, i8, matrix, interfaceC1014y);
    }

    public static B l(byte[] bArr, I.f fVar, int i8, Size size, Rect rect, int i9, Matrix matrix, InterfaceC1014y interfaceC1014y) {
        return new C1553b(bArr, fVar, i8, size, rect, i9, matrix, interfaceC1014y);
    }

    public abstract InterfaceC1014y a();

    public abstract Rect b();

    public abstract Object c();

    public abstract I.f d();

    public abstract int e();

    public abstract int f();

    public abstract Matrix g();

    public abstract Size h();
}
