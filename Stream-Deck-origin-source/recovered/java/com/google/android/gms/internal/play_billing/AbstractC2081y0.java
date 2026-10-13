package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2081y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f19031a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f19032b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f19033c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f19034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f19035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final W f19036f;

    static {
        byte[] bArr = new byte[0];
        f19034d = bArr;
        f19035e = ByteBuffer.wrap(bArr);
        int i8 = W.f18828a;
        U u8 = new U(bArr, 0, 0, false, null);
        try {
            u8.c(0);
            f19036f = u8;
        } catch (A0 e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static int a(boolean z8) {
        return z8 ? 1231 : 1237;
    }

    public static int b(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
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

    public static String d(byte[] bArr) {
        return new String(bArr, f19032b);
    }
}
