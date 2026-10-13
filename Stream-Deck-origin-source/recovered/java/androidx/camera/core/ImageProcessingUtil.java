package androidx.camera.core;

import A.AbstractC0890p0;
import A.F0;
import E4.JFpq.XRlnZWSrAFn;
import H.A0;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;
import java.util.Locale;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class ImageProcessingUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f14118a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends androidx.camera.core.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d.a[] f14119d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f14120e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f14121f;

        /* JADX INFO: renamed from: androidx.camera.core.ImageProcessingUtil$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class C0345a implements d.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f14122a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ByteBuffer f14123b;

            public C0345a(int i8, ByteBuffer byteBuffer) {
                this.f14122a = i8;
                this.f14123b = byteBuffer;
            }

            @Override // androidx.camera.core.d.a
            public int a() {
                return this.f14122a;
            }

            @Override // androidx.camera.core.d.a
            public int b() {
                return 1;
            }

            @Override // androidx.camera.core.d.a
            public ByteBuffer l() {
                return this.f14123b;
            }
        }

        public a(d dVar, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i8, int i9, int i10) {
            super(dVar);
            this.f14119d = j(byteBuffer, byteBuffer2, byteBuffer3, i8);
            this.f14120e = i8;
            this.f14121f = i9;
        }

        @Override // androidx.camera.core.b, androidx.camera.core.d
        public d.a[] D() {
            return this.f14119d;
        }

        @Override // androidx.camera.core.b, androidx.camera.core.d
        public int f() {
            return this.f14121f;
        }

        @Override // androidx.camera.core.b, androidx.camera.core.d
        public int g() {
            return this.f14120e;
        }

        public final d.a[] j(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i8) {
            return new d.a[]{new C0345a(i8, byteBuffer), new b(byteBuffer2, i8), new b(byteBuffer3, i8)};
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f14125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f14126b;

        public b(ByteBuffer byteBuffer, int i8) {
            this.f14125a = byteBuffer;
            this.f14126b = i8;
        }

        @Override // androidx.camera.core.d.a
        public int a() {
            return this.f14126b;
        }

        @Override // androidx.camera.core.d.a
        public int b() {
            return 2;
        }

        @Override // androidx.camera.core.d.a
        public ByteBuffer l() {
            return this.f14125a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum c {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static /* synthetic */ void a(d dVar, d dVar2, d dVar3) {
        if (dVar == null || dVar2 == null) {
            return;
        }
        dVar2.close();
    }

    public static /* synthetic */ void b(d dVar, d dVar2, d dVar3) {
        if (dVar == null || dVar2 == null) {
            return;
        }
        dVar2.close();
    }

    public static boolean c(d dVar) {
        if (!m(dVar)) {
            AbstractC0890p0.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return false;
        }
        if (d(dVar) != c.ERROR_CONVERSION) {
            return true;
        }
        AbstractC0890p0.c("ImageProcessingUtil", "One pixel shift for YUV failure");
        return false;
    }

    public static c d(d dVar) {
        int iG = dVar.g();
        int iF = dVar.f();
        int iA = dVar.D()[0].a();
        int iA2 = dVar.D()[1].a();
        int iA3 = dVar.D()[2].a();
        int iB = dVar.D()[0].b();
        int iB2 = dVar.D()[1].b();
        return nativeShiftPixel(dVar.D()[0].l(), iA, dVar.D()[1].l(), iA2, dVar.D()[2].l(), iA3, iB, iB2, iG, iF, iB, iB2, iB2) != 0 ? c.ERROR_CONVERSION : c.SUCCESS;
    }

    public static d e(A0 a8, byte[] bArr) {
        T1.f.a(a8.j() == 256);
        T1.f.g(bArr);
        Surface surface = a8.getSurface();
        T1.f.g(surface);
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            AbstractC0890p0.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        d dVarH = a8.h();
        if (dVarH == null) {
            AbstractC0890p0.c("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return dVarH;
    }

    public static d g(final d dVar, A0 a8, ByteBuffer byteBuffer, int i8, boolean z8) {
        if (!m(dVar)) {
            AbstractC0890p0.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!l(i8)) {
            AbstractC0890p0.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if (h(dVar, a8.getSurface(), byteBuffer, i8, z8) == c.ERROR_CONVERSION) {
            AbstractC0890p0.c("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            AbstractC0890p0.a("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), Integer.valueOf(f14118a)));
            f14118a++;
        }
        final d dVarH = a8.h();
        if (dVarH == null) {
            AbstractC0890p0.c("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        F0 f8 = new F0(dVarH);
        f8.b(new androidx.camera.core.b.a() { // from class: A.g0
            @Override // androidx.camera.core.b.a
            public final void b(androidx.camera.core.d dVar2) {
                ImageProcessingUtil.b(dVarH, dVar, dVar2);
            }
        });
        return f8;
    }

    public static c h(d dVar, Surface surface, ByteBuffer byteBuffer, int i8, boolean z8) {
        int iG = dVar.g();
        int iF = dVar.f();
        int iA = dVar.D()[0].a();
        int iA2 = dVar.D()[1].a();
        int iA3 = dVar.D()[2].a();
        int iB = dVar.D()[0].b();
        int iB2 = dVar.D()[1].b();
        return nativeConvertAndroid420ToABGR(dVar.D()[0].l(), iA, dVar.D()[1].l(), iA2, dVar.D()[2].l(), iA3, iB, iB2, surface, byteBuffer, iG, iF, z8 ? iB : 0, z8 ? iB2 : 0, z8 ? iB2 : 0, i8) != 0 ? c.ERROR_CONVERSION : c.SUCCESS;
    }

    public static void i(Bitmap bitmap, ByteBuffer byteBuffer, int i8) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i8, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void j(Bitmap bitmap, ByteBuffer byteBuffer, int i8) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i8, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean k(d dVar) {
        return dVar.D().length == 3 && dVar.D()[1].b() == 2 && nativeGetYUVImageVUOff(dVar.D()[2].l(), dVar.D()[1].l()) == -1;
    }

    public static boolean l(int i8) {
        return i8 == 0 || i8 == 90 || i8 == 180 || i8 == 270;
    }

    public static boolean m(d dVar) {
        return dVar.getFormat() == 35 && dVar.D().length == 3;
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i8, ByteBuffer byteBuffer2, int i9, ByteBuffer byteBuffer3, int i10, int i11, int i12, Surface surface, ByteBuffer byteBuffer4, int i13, int i14, int i15, int i16, int i17, int i18);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i8, ByteBuffer byteBuffer2, int i9, ByteBuffer byteBuffer3, int i10, int i11, int i12, Bitmap bitmap, int i13, int i14, int i15);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i8, int i9, int i10, int i11, boolean z8);

    public static native int nativeGetYUVImageVUOff(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native ByteBuffer nativeNewDirectByteBuffer(ByteBuffer byteBuffer, int i8, int i9);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i8, ByteBuffer byteBuffer2, int i9, ByteBuffer byteBuffer3, int i10, int i11, ByteBuffer byteBuffer4, int i12, int i13, ByteBuffer byteBuffer5, int i14, int i15, ByteBuffer byteBuffer6, int i16, int i17, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i18, int i19, int i20);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i8, ByteBuffer byteBuffer2, int i9, ByteBuffer byteBuffer3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);

    public static d o(d dVar, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i8) {
        if (!m(dVar)) {
            AbstractC0890p0.c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!l(i8)) {
            AbstractC0890p0.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i8 == 0 && k(dVar)) {
            return null;
        }
        int i9 = i8 % 180;
        int iG = i9 == 0 ? dVar.g() : dVar.f();
        int iF = i9 == 0 ? dVar.f() : dVar.g();
        ByteBuffer byteBufferNativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
        int i10 = iF;
        if (nativeRotateYUV(dVar.D()[0].l(), dVar.D()[0].a(), dVar.D()[1].l(), dVar.D()[1].a(), dVar.D()[2].l(), dVar.D()[2].a(), dVar.D()[2].b(), byteBuffer4, iG, 1, byteBufferNativeNewDirectByteBuffer, iG, 2, byteBuffer5, iG, 2, byteBuffer, byteBuffer2, byteBuffer3, dVar.g(), dVar.f(), i8) == 0) {
            return new F0(new a(dVar, byteBuffer4, byteBufferNativeNewDirectByteBuffer, byteBuffer5, iG, i10, i8));
        }
        AbstractC0890p0.c("ImageProcessingUtil", "rotate YUV failure");
        return null;
    }

    public static c p(d dVar, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i8) {
        int iG = dVar.g();
        int iF = dVar.f();
        int iA = dVar.D()[0].a();
        int iA2 = dVar.D()[1].a();
        int iA3 = dVar.D()[2].a();
        int iB = dVar.D()[1].b();
        Image imageB = M.a.b(imageWriter);
        if (imageB == null) {
            return c.ERROR_CONVERSION;
        }
        if (nativeRotateYUV(dVar.D()[0].l(), iA, dVar.D()[1].l(), iA2, dVar.D()[2].l(), iA3, iB, imageB.getPlanes()[0].getBuffer(), imageB.getPlanes()[0].getRowStride(), imageB.getPlanes()[0].getPixelStride(), imageB.getPlanes()[1].getBuffer(), imageB.getPlanes()[1].getRowStride(), imageB.getPlanes()[1].getPixelStride(), imageB.getPlanes()[2].getBuffer(), imageB.getPlanes()[2].getRowStride(), imageB.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, iG, iF, i8) != 0) {
            return c.ERROR_CONVERSION;
        }
        M.a.d(imageWriter, imageB);
        return c.SUCCESS;
    }

    public static boolean q(Surface surface, byte[] bArr) {
        T1.f.g(bArr);
        T1.f.g(surface);
        if (nativeWriteJpegToSurface(bArr, surface) == 0) {
            return true;
        }
        AbstractC0890p0.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        return false;
    }

    public static Bitmap f(d dVar) {
        if (dVar.getFormat() == 35) {
            int iG = dVar.g();
            int iF = dVar.f();
            int iA = dVar.D()[0].a();
            int iA2 = dVar.D()[1].a();
            int iA3 = dVar.D()[2].a();
            int iB = dVar.D()[0].b();
            int iB2 = dVar.D()[1].b();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dVar.g(), dVar.f(), Bitmap.Config.ARGB_8888);
            if (nativeConvertAndroid420ToBitmap(dVar.D()[0].l(), iA, dVar.D()[1].l(), iA2, dVar.D()[2].l(), iA3, iB, iB2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), iG, iF) == 0) {
                return bitmapCreateBitmap;
            }
            throw new UnsupportedOperationException(XRlnZWSrAFn.BIFAltOXaGdNFG);
        }
        throw new IllegalArgumentException("Input image format must be YUV_420_888");
    }

    public static d n(d dVar, A0 a8, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i8) {
        final d dVar2;
        c cVarP;
        if (!m(dVar)) {
            AbstractC0890p0.c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!l(i8)) {
            AbstractC0890p0.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        c cVar = c.ERROR_CONVERSION;
        if (i8 > 0) {
            dVar2 = dVar;
            cVarP = p(dVar2, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i8);
        } else {
            dVar2 = dVar;
            cVarP = cVar;
        }
        if (cVarP == cVar) {
            AbstractC0890p0.c("ImageProcessingUtil", "rotate YUV failure");
            return null;
        }
        final d dVarH = a8.h();
        if (dVarH == null) {
            AbstractC0890p0.c("ImageProcessingUtil", RaiWHuj.KZmOgIBXiShH);
            return null;
        }
        F0 f8 = new F0(dVarH);
        f8.b(new androidx.camera.core.b.a() { // from class: A.h0
            @Override // androidx.camera.core.b.a
            public final void b(androidx.camera.core.d dVar3) {
                ImageProcessingUtil.a(dVarH, dVar2, dVar3);
            }
        });
        return f8;
    }
}
