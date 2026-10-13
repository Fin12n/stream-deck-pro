package G;

import A.C0868e0;
import H.Z0;
import android.graphics.Rect;
import android.util.Size;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: G.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0963w implements Q.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O.d f2593a;

    /* JADX INFO: renamed from: G.w$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class a {
        public static a c(Q.B b8, int i8) {
            return new C0944c(b8, i8);
        }

        public abstract int a();

        public abstract Q.B b();
    }

    public C0963w(Z0 z8) {
        this.f2593a = new O.d(z8);
    }

    public static I.f b(byte[] bArr) throws C0868e0 {
        try {
            return I.f.h(new ByteArrayInputStream(bArr));
        } catch (IOException e8) {
            throw new C0868e0(0, "Failed to extract Exif from YUV-generated JPEG", e8);
        }
    }

    @Override // Q.A
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Q.B apply(a aVar) {
        Q.B bD;
        try {
            int iE = aVar.b().e();
            if (iE != 35) {
                if (iE != 256 && iE != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + iE);
                }
                bD = c(aVar, iE);
            } else {
                bD = d(aVar);
            }
            ((androidx.camera.core.d) aVar.b().c()).close();
            return bD;
        } catch (Throwable th) {
            ((androidx.camera.core.d) aVar.b().c()).close();
            throw th;
        }
    }

    public final Q.B c(a aVar, int i8) {
        Q.B b8 = aVar.b();
        byte[] bArrA = this.f2593a.a((androidx.camera.core.d) b8.c());
        I.f fVarD = b8.d();
        Objects.requireNonNull(fVarD);
        return Q.B.l(bArrA, fVarD, i8, b8.h(), b8.b(), b8.f(), b8.g(), b8.a());
    }

    public final Q.B d(a aVar) throws C0868e0 {
        Q.B b8 = aVar.b();
        androidx.camera.core.d dVar = (androidx.camera.core.d) b8.c();
        Rect rectB = b8.b();
        try {
            byte[] bArrK = P.b.k(dVar, rectB, aVar.a(), b8.f());
            return Q.B.l(bArrK, b(bArrK), 256, new Size(rectB.width(), rectB.height()), new Rect(0, 0, rectB.width(), rectB.height()), b8.f(), I.x.t(b8.g(), rectB), b8.a());
        } catch (P.b.a e8) {
            throw new C0868e0(1, "Failed to encode the image to JPEG.", e8);
        }
    }
}
