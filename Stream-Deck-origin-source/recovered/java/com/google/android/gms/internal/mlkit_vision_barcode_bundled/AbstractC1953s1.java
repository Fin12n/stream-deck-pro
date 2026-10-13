package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.s1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1953s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f18650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f18651b;

    static {
        Charset.forName("US-ASCII");
        f18650a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f18651b = bArr;
        ByteBuffer.wrap(bArr);
        int i8 = N0.f17990a;
        try {
            new L0(bArr, 0, 0, false, null).c(0);
        } catch (C1963u1 e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static int a(boolean z8) {
        return z8 ? 1231 : 1237;
    }

    public static int b(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            i8 = (i8 * 31) + bArr[i11];
        }
        return i8;
    }

    public static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }
}
