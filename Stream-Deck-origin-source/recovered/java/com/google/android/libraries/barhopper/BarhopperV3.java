package com.google.android.libraries.barhopper;

import X4.C1668a;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1963u1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.V0;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p212y5.C3125a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class BarhopperV3 implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f19040b = "BarhopperV3";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f19041a;

    public BarhopperV3() {
        System.loadLibrary("barhopper_v3");
    }

    private native void closeNative(long j8);

    private native long createNativeWithClientOptions(byte[] bArr);

    private native byte[] recognizeBitmapNative(long j8, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j8, int i8, int i9, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j8, int i8, int i9, byte[] bArr, RecognitionOptions recognitionOptions);

    public static C3125a t(byte[] bArr) {
        bArr.getClass();
        try {
            return C3125a.K(bArr, V0.a());
        } catch (C1963u1 e8) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}", e8);
        }
    }

    public void b(C1668a c1668a) {
        if (this.f19041a != 0) {
            Log.w(f19040b, "Native pointer already exists.");
            return;
        }
        long jCreateNativeWithClientOptions = createNativeWithClientOptions(c1668a.i());
        this.f19041a = jCreateNativeWithClientOptions;
        if (jCreateNativeWithClientOptions == 0) {
            throw new IllegalArgumentException("Failed to create native pointer with client options.");
        }
    }

    public C3125a c(int i8, int i9, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j8 = this.f19041a;
        if (j8 != 0) {
            return t(recognizeBufferNative(j8, i8, i9, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j8 = this.f19041a;
        if (j8 != 0) {
            closeNative(j8);
            this.f19041a = 0L;
        }
    }

    public C3125a j(int i8, int i9, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j8 = this.f19041a;
        if (j8 != 0) {
            return t(recognizeNative(j8, i8, i9, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    public C3125a o(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        if (this.f19041a == 0) {
            throw new IllegalStateException("Native pointer does not exist.");
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            Log.d(f19040b, "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig())));
            bitmap = bitmap.copy(config2, bitmap.isMutable());
        }
        return t(recognizeBitmapNative(this.f19041a, bitmap, recognitionOptions));
    }
}
