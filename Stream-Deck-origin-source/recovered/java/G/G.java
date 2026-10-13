package G;

import A.C0868e0;
import H.InterfaceC1014y;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.io.IOException;
import p043e6.dT.GIGvBf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class G implements Q.A {
    public static Q.B b(Q q8, I.f fVar, androidx.camera.core.d dVar) {
        return Q.B.j(dVar, fVar, q8.b(), q8.f(), q8.h(), d(dVar));
    }

    public static Q.B c(Q q8, I.f fVar, androidx.camera.core.d dVar) {
        Size size = new Size(dVar.g(), dVar.f());
        int iF = q8.f() - fVar.n();
        Size sizeE = e(iF, size);
        Matrix matrixD = I.x.d(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, sizeE.getWidth(), sizeE.getHeight()), iF);
        return Q.B.k(dVar, fVar, sizeE, f(q8.b(), matrixD), fVar.n(), g(q8.h(), matrixD), d(dVar));
    }

    public static InterfaceC1014y d(androidx.camera.core.d dVar) {
        return dVar.e1() instanceof L.c ? ((L.c) dVar.e1()).f() : InterfaceC1014y.a.l();
    }

    public static Size e(int i8, Size size) {
        return I.x.i(I.x.u(i8)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static Rect f(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    public static Matrix g(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    @Override // Q.A
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Q.B apply(P.b bVar) throws C0868e0 {
        I.f fVarG;
        androidx.camera.core.d dVarA = bVar.a();
        Q qB = bVar.b();
        if (P.b.g(dVarA.getFormat())) {
            try {
                fVarG = I.f.g(dVarA);
                dVarA.D()[0].l().rewind();
            } catch (IOException e8) {
                throw new C0868e0(1, GIGvBf.kLpIFKAOsy, e8);
            }
        } else {
            fVarG = null;
        }
        if (C0965y.f2595g.b(dVarA)) {
            T1.f.h(fVarG, "JPEG image must have exif.");
            return c(qB, fVarG, dVarA);
        }
        return b(qB, fVarG, dVarA);
    }
}
