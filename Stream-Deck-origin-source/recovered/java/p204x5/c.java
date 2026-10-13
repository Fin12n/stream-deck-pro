package p204x5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import java.nio.ByteBuffer;
import p196w5.a;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f37404a = new c();

    public static ByteBuffer a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    public static c d() {
        return f37404a;
    }

    public static ByteBuffer f(ByteBuffer byteBuffer, boolean z8) {
        int i8;
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        int i9 = iLimit / 6;
        ByteBuffer byteBufferAllocate = z8 ? ByteBuffer.allocate(iLimit) : ByteBuffer.allocateDirect(iLimit);
        int i10 = 0;
        while (true) {
            i8 = i9 * 4;
            if (i10 >= i8) {
                break;
            }
            byteBufferAllocate.put(i10, byteBuffer.get(i10));
            i10++;
        }
        for (int i11 = 0; i11 < i9 + i9; i11++) {
            byteBufferAllocate.put(i8 + i11, byteBuffer.get(((i11 % 2) * i9) + i8 + (i11 / 2)));
        }
        return byteBufferAllocate;
    }

    public static Bitmap g(Bitmap bitmap, int i8, int i9, int i10) {
        if (i8 == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i9, i10);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i8);
        return Bitmap.createBitmap(bitmap, 0, 0, i9, i10, matrix, true);
    }

    public static final void h(Image.Plane plane, int i8, int i9, byte[] bArr, int i10, int i11) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int iLimit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (iLimit == 0) {
            return;
        }
        int i12 = i8 / (i9 / iLimit);
        int rowStride = 0;
        for (int i13 = 0; i13 < iLimit; i13++) {
            int pixelStride = rowStride;
            for (int i14 = 0; i14 < i12; i14++) {
                bArr[i10] = buffer.get(pixelStride);
                i10 += i11;
                pixelStride += plane.getPixelStride();
            }
            rowStride += plane.getRowStride();
        }
    }

    public Bitmap b(Image image, int i8) {
        AbstractC3207p.b(image.getFormat() == 256, "Only JPEG is supported now");
        Image.Plane[] planes = image.getPlanes();
        if (planes == null || planes.length != 1) {
            throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
        }
        ByteBuffer buffer = planes[0].getBuffer();
        buffer.rewind();
        int iRemaining = buffer.remaining();
        byte[] bArr = new byte[iRemaining];
        buffer.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
        return g(bitmapDecodeByteArray, i8, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    public ByteBuffer c(a aVar, boolean z8) throws p105l5.a {
        int iE = aVar.e();
        if (iE != -1) {
            if (iE == 17) {
                return z8 ? a((ByteBuffer) AbstractC3207p.k(aVar.c())) : (ByteBuffer) AbstractC3207p.k(aVar.c());
            }
            if (iE == 35) {
                return e((Image.Plane[]) AbstractC3207p.k(aVar.h()), aVar.j(), aVar.f());
            }
            if (iE == 842094169) {
                return f((ByteBuffer) AbstractC3207p.k(aVar.c()), z8);
            }
            throw new p105l5.a("Unsupported image format", 13);
        }
        Bitmap bitmapCopy = (Bitmap) AbstractC3207p.k(aVar.b());
        if (bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
        }
        Bitmap bitmap = bitmapCopy;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i8 = width * height;
        int[] iArr = new int[i8];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(((double) height) / 2.0d);
        int iCeil2 = ((iCeil + iCeil) * ((int) Math.ceil(((double) width) / 2.0d))) + i8;
        ByteBuffer byteBufferAllocate = z8 ? ByteBuffer.allocate(iCeil2) : ByteBuffer.allocateDirect(iCeil2);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < height; i11++) {
            int i12 = 0;
            while (i12 < width) {
                int i13 = iArr[i10];
                int i14 = i13 >> 16;
                int i15 = i13 >> 8;
                int i16 = i13 & 255;
                int i17 = i9 + 1;
                int i18 = i14 & 255;
                int i19 = i15 & 255;
                byteBufferAllocate.put(i9, (byte) Math.min(255, (((((i18 * 66) + (i19 * 129)) + (i16 * 25)) + 128) >> 8) + 16));
                if (i11 % 2 == 0 && i10 % 2 == 0) {
                    int i20 = ((((i18 * 112) - (i19 * 94)) - (i16 * 18)) + 128) >> 8;
                    int i21 = (((((i18 * (-38)) - (i19 * 74)) + (i16 * 112)) + 128) >> 8) + 128;
                    int i22 = i8 + 1;
                    byteBufferAllocate.put(i8, (byte) Math.min(255, i20 + 128));
                    i8 += 2;
                    byteBufferAllocate.put(i22, (byte) Math.min(255, i21));
                }
                i10++;
                i12++;
                i9 = i17;
            }
        }
        return byteBufferAllocate;
    }

    public ByteBuffer e(Image.Plane[] planeArr, int i8, int i9) {
        int i10 = i8 * i9;
        int i11 = i10 / 4;
        byte[] bArr = new byte[i11 + i11 + i10];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i12 = (i10 + i10) / 4;
        boolean z8 = buffer2.remaining() == i12 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (z8) {
            planeArr[0].getBuffer().get(bArr, 0, i10);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i10, 1);
            buffer3.get(bArr, i10 + 1, i12 - 1);
        } else {
            h(planeArr[0], i8, i9, bArr, 0, 1);
            h(planeArr[1], i8, i9, bArr, i10 + 1, 2);
            h(planeArr[2], i8, i9, bArr, i10, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
