package p204x5;

import H4.a;
import H4.b;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import java.nio.ByteBuffer;
import p219z4.AbstractC3207p;
import p219z4.C3200i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3200i f37405a = new C3200i("MLKitImageUtils", "");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f37406b = new d();

    public static d b() {
        return f37406b;
    }

    public a a(p196w5.a aVar) throws p105l5.a {
        int iE = aVar.e();
        if (iE == -1) {
            return b.P((Bitmap) AbstractC3207p.k(aVar.b()));
        }
        if (iE != 17) {
            if (iE == 35) {
                return b.P(aVar.g());
            }
            if (iE != 842094169) {
                throw new p105l5.a("Unsupported image format: " + aVar.e(), 3);
            }
        }
        return b.P((ByteBuffer) AbstractC3207p.k(aVar.c()));
    }

    public int c(p196w5.a aVar) {
        if (aVar.e() == -1) {
            return ((Bitmap) AbstractC3207p.k(aVar.b())).getAllocationByteCount();
        }
        if (aVar.e() == 17 || aVar.e() == 842094169) {
            return ((ByteBuffer) AbstractC3207p.k(aVar.c())).limit();
        }
        if (aVar.e() != 35) {
            return 0;
        }
        return (((Image.Plane[]) AbstractC3207p.k(aVar.h()))[0].getBuffer().limit() * 3) / 2;
    }

    public Matrix d(int i8, int i9, int i10) {
        if (i10 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i8) / 2.0f, (-i9) / 2.0f);
        matrix.postRotate(i10 * 90);
        int i11 = i10 % 2;
        int i12 = i11 != 0 ? i9 : i8;
        if (i11 == 0) {
            i8 = i9;
        }
        matrix.postTranslate(i12 / 2.0f, i8 / 2.0f);
        return matrix;
    }
}
