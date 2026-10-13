package G;

import A.AbstractC0882l0;
import A.C0868e0;
import android.graphics.Bitmap;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: G.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C0962v implements Q.A {
    @Override // Q.A
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap apply(Q.B b8) throws Throwable {
        androidx.camera.core.f fVar;
        Bitmap bitmapJ;
        androidx.camera.core.f fVar2 = null;
        try {
            try {
                int iE = b8.e();
                if (iE == 35) {
                    androidx.camera.core.d dVar = (androidx.camera.core.d) b8.c();
                    boolean z8 = b8.f() % 180 != 0;
                    fVar = new androidx.camera.core.f(AbstractC0882l0.a(z8 ? dVar.f() : dVar.g(), z8 ? dVar.g() : dVar.f(), 1, 2));
                    try {
                        androidx.camera.core.d dVarG = ImageProcessingUtil.g(dVar, fVar, ByteBuffer.allocateDirect(dVar.g() * dVar.f() * 4), b8.f(), false);
                        dVar.close();
                        if (dVarG == null) {
                            throw new C0868e0(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapJ = P.b.a(dVarG);
                        dVarG.close();
                    } catch (UnsupportedOperationException e8) {
                        e = e8;
                        throw new C0868e0(0, "Can't convert " + (b8.e() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th) {
                        th = th;
                        fVar2 = fVar;
                        if (fVar2 != null) {
                            fVar2.close();
                        }
                        throw th;
                    }
                } else {
                    if (iE != 256 && iE != 4101) {
                        throw new IllegalArgumentException("Invalid postview image format : " + b8.e());
                    }
                    androidx.camera.core.d dVar2 = (androidx.camera.core.d) b8.c();
                    Bitmap bitmapA = P.b.a(dVar2);
                    dVar2.close();
                    fVar = null;
                    bitmapJ = P.b.j(bitmapA, b8.f());
                }
                if (fVar != null) {
                    fVar.close();
                }
                return bitmapJ;
            } catch (UnsupportedOperationException e9) {
                e = e9;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
