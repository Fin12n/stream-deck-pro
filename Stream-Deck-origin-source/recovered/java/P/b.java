package P;

import I.h;
import I.i;
import T1.f;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Rational;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumC0245a f8824a;

        /* JADX INFO: renamed from: P.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public enum EnumC0245a {
            ENCODE_FAILED,
            DECODE_FAILED,
            f8827c
        }

        public a(String str, EnumC0245a enumC0245a) {
            super(str);
            this.f8824a = enumC0245a;
        }
    }

    public static Bitmap a(androidx.camera.core.d dVar) {
        int format = dVar.getFormat();
        if (format == 1) {
            return c(dVar);
        }
        if (format == 35) {
            return ImageProcessingUtil.f(dVar);
        }
        if (format == 256 || format == 4101) {
            return b(dVar);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + dVar.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
    }

    public static Bitmap b(androidx.camera.core.d dVar) {
        byte[] bArrI = i(dVar);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrI, 0, bArrI.length, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static Bitmap c(androidx.camera.core.d dVar) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dVar.g(), dVar.f(), Bitmap.Config.ARGB_8888);
        dVar.D()[0].l().rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, dVar.D()[0].l(), dVar.D()[0].a());
        return bitmapCreateBitmap;
    }

    public static ByteBuffer d(Bitmap bitmap) {
        f.b(bitmap.getConfig() == Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.i(bitmap, byteBufferAllocateDirect, bitmap.getRowBytes());
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    public static Rational e(int i8, Rational rational) {
        return (i8 == 90 || i8 == 270) ? f(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static Rational f(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean g(int i8) {
        return i8 == 256 || i8 == 4101;
    }

    public static boolean h(int i8) {
        return i8 == 32;
    }

    public static byte[] i(androidx.camera.core.d dVar) {
        if (!g(dVar.getFormat())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + dVar.getFormat());
        }
        ByteBuffer byteBufferL = dVar.D()[0].l();
        byte[] bArr = new byte[byteBufferL.capacity()];
        byteBufferL.rewind();
        byteBufferL.get(bArr);
        return bArr;
    }

    public static Bitmap j(Bitmap bitmap, int i8) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i8);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static byte[] k(androidx.camera.core.d dVar, Rect rect, int i8, int i9) throws a {
        if (dVar.getFormat() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + dVar.getFormat());
        }
        YuvImage yuvImage = new YuvImage(l(dVar), 17, dVar.g(), dVar.f(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        i iVar = new i(byteArrayOutputStream, h.c(dVar, i9));
        if (rect == null) {
            rect = new Rect(0, 0, dVar.g(), dVar.f());
        }
        if (yuvImage.compressToJpeg(rect, i8, iVar)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new a("YuvImage failed to encode jpeg.", a.EnumC0245a.ENCODE_FAILED);
    }

    public static byte[] l(androidx.camera.core.d dVar) {
        androidx.camera.core.d.a aVar = dVar.D()[0];
        androidx.camera.core.d.a aVar2 = dVar.D()[1];
        androidx.camera.core.d.a aVar3 = dVar.D()[2];
        ByteBuffer byteBufferL = aVar.l();
        ByteBuffer byteBufferL2 = aVar2.l();
        ByteBuffer byteBufferL3 = aVar3.l();
        byteBufferL.rewind();
        byteBufferL2.rewind();
        byteBufferL3.rewind();
        int iRemaining = byteBufferL.remaining();
        byte[] bArr = new byte[((dVar.g() * dVar.f()) / 2) + iRemaining];
        int iG = 0;
        for (int i8 = 0; i8 < dVar.f(); i8++) {
            byteBufferL.get(bArr, iG, dVar.g());
            iG += dVar.g();
            byteBufferL.position(Math.min(iRemaining, (byteBufferL.position() - dVar.g()) + aVar.a()));
        }
        int iF = dVar.f() / 2;
        int iG2 = dVar.g() / 2;
        int iA = aVar3.a();
        int iA2 = aVar2.a();
        int iB = aVar3.b();
        int iB2 = aVar2.b();
        byte[] bArr2 = new byte[iA];
        byte[] bArr3 = new byte[iA2];
        for (int i9 = 0; i9 < iF; i9++) {
            byteBufferL3.get(bArr2, 0, Math.min(iA, byteBufferL3.remaining()));
            byteBufferL2.get(bArr3, 0, Math.min(iA2, byteBufferL2.remaining()));
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < iG2; i12++) {
                int i13 = iG + 1;
                bArr[iG] = bArr2[i10];
                iG += 2;
                bArr[i13] = bArr3[i11];
                i10 += iB;
                i11 += iB2;
            }
        }
        return bArr;
    }
}
