package com.elgato.streamdeck.vsd2;

import android.graphics.Bitmap;
import com.elgato.vsd2.Messages;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class ImageDecompressor {
    public static final Companion Companion = new Companion(null);
    private final ByteBuffer input;
    private final ByteBuffer output;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Messages.c.values().length];
            try {
                iArr[Messages.c.LZF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Messages.c.LZFSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Messages.c.LZ4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        System.loadLibrary("vsd2-android");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImageDecompressor() {
        int i8 = 0;
        this(i8, i8, 3, null);
    }

    private final native void decodeLZ4(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    private final native void decodeLZF(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    private final native void decodeLZFSE(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public final Bitmap createBitmap(Messages.Image image) {
        t.g(image, "image");
        try {
            if (image.getImage().size() <= 0) {
                throw new IllegalArgumentException("Image data is empty");
            }
            if (this.input.capacity() < image.getImage().size()) {
                throw new IllegalStateException("Input buffer is to small for incoming image data");
            }
            image.getImage().F(this.input);
            Messages.c format = image.getFormat();
            int i8 = format == null ? -1 : WhenMappings.$EnumSwitchMapping$0[format.ordinal()];
            if (i8 == 1) {
                decodeLZF(this.input, this.output);
            } else if (i8 == 2) {
                decodeLZFSE(this.input, this.output);
            } else {
                if (i8 != 3) {
                    throw new IllegalArgumentException("Image format " + image.getFormat() + " not supported");
                }
                decodeLZ4(this.input, this.output);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(image.getSize().getWidth(), image.getSize().getHeight(), Bitmap.Config.ARGB_8888);
            t.f(bitmapCreateBitmap, "createBitmap(...)");
            bitmapCreateBitmap.copyPixelsFromBuffer(this.output);
            this.input.clear();
            this.output.clear();
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            this.input.clear();
            this.output.clear();
            throw th;
        }
    }

    public ImageDecompressor(int i8, int i9) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i8);
        t.f(byteBufferAllocateDirect, "allocateDirect(...)");
        this.input = byteBufferAllocateDirect;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(i9);
        t.f(byteBufferAllocateDirect2, "allocateDirect(...)");
        this.output = byteBufferAllocateDirect2;
    }

    public /* synthetic */ ImageDecompressor(int i8, int i9, int i10, AbstractC2633k abstractC2633k) {
        this((i10 & 1) != 0 ? 500000 : i8, (i10 & 2) != 0 ? 500000 : i9);
    }
}
