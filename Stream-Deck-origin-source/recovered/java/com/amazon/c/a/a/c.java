package com.amazon.c.a.a;

import io.sentry.exception.uXy.SZCvugJaXc;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f16901a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16902b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16903c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16904d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f16905e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f16906f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f16907g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f16908h = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f16909i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f16910j = 76;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f16913m = "US-ASCII";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f16916p = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte f16914n = -5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte f16911k = 61;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte f16915o = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte f16912l = 10;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final byte[] f16917q = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f16914n, f16914n, -9, -9, f16914n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f16914n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, f16911k, -9, -9, -9, f16915o, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, f16912l, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final byte[] f16918r = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte[] f16919s = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f16914n, f16914n, -9, -9, f16914n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f16914n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, f16911k, -9, -9, -9, f16915o, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, f16912l, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte[] f16920t = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final byte[] f16921u = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f16914n, f16914n, -9, -9, f16914n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f16914n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, f16912l, -9, -9, -9, f16915o, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, f16911k, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f16922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f16924c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f16925d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f16926e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f16927f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f16928g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f16929h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[] f16930i;

        public a(InputStream inputStream) {
            this(inputStream, 0);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i8;
            if (this.f16923b < 0) {
                if (this.f16922a) {
                    byte[] bArr = new byte[3];
                    int i9 = 0;
                    for (int i10 = 0; i10 < 3; i10++) {
                        int i11 = ((FilterInputStream) this).in.read();
                        if (i11 < 0) {
                            break;
                        }
                        bArr[i10] = (byte) i11;
                        i9++;
                    }
                    if (i9 <= 0) {
                        return -1;
                    }
                    c.b(bArr, 0, i9, this.f16924c, 0, this.f16929h);
                    this.f16923b = 0;
                    this.f16926e = 4;
                } else {
                    byte[] bArr2 = new byte[4];
                    int i12 = 0;
                    while (i12 < 4) {
                        do {
                            i8 = ((FilterInputStream) this).in.read();
                            if (i8 < 0) {
                                break;
                            }
                        } while (this.f16930i[i8 & 127] <= -5);
                        if (i8 < 0) {
                            break;
                        }
                        bArr2[i12] = (byte) i8;
                        i12++;
                    }
                    if (i12 != 4) {
                        if (i12 == 0) {
                            return -1;
                        }
                        throw new IOException("Improperly padded Base64 input.");
                    }
                    this.f16926e = c.b(bArr2, 0, this.f16924c, 0, this.f16929h);
                    this.f16923b = 0;
                }
            }
            int i13 = this.f16923b;
            if (i13 < 0) {
                throw new IOException("Error in Base64 code reading stream.");
            }
            if (i13 >= this.f16926e) {
                return -1;
            }
            if (this.f16922a && this.f16928g && this.f16927f >= c.f16910j) {
                this.f16927f = 0;
                return 10;
            }
            this.f16927f++;
            byte[] bArr3 = this.f16924c;
            int i14 = i13 + 1;
            this.f16923b = i14;
            byte b8 = bArr3[i13];
            if (i14 >= this.f16925d) {
                this.f16923b = -1;
            }
            return b8 & c.f16915o;
        }

        public a(InputStream inputStream, int i8) {
            super(inputStream);
            this.f16929h = i8;
            this.f16928g = (i8 & 8) > 0;
            boolean z8 = (i8 & 1) > 0;
            this.f16922a = z8;
            int i9 = z8 ? 4 : 3;
            this.f16925d = i9;
            this.f16924c = new byte[i9];
            this.f16923b = -1;
            this.f16927f = 0;
            this.f16930i = c.c(i8);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) throws IOException {
            int i10 = 0;
            while (i10 < i9) {
                int i11 = read();
                if (i11 >= 0) {
                    bArr[i8 + i10] = (byte) i11;
                    i10++;
                } else if (i10 == 0) {
                    return -1;
                }
            }
            return i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f16931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f16933c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f16934d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f16935e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f16936f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f16937g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f16938h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f16939i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte[] f16940j;

        public b(OutputStream outputStream) {
            this(outputStream, 1);
        }

        public void a() throws IOException {
            int i8 = this.f16932b;
            if (i8 > 0) {
                if (!this.f16931a) {
                    throw new IOException("Base64 input not properly padded.");
                }
                ((FilterOutputStream) this).out.write(c.b(this.f16937g, this.f16933c, i8, this.f16939i));
                this.f16932b = 0;
            }
        }

        public void b() throws IOException {
            a();
            this.f16938h = true;
        }

        public void c() {
            this.f16938h = false;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a();
            super.close();
            this.f16933c = null;
            ((FilterOutputStream) this).out = null;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i8) throws IOException {
            if (this.f16938h) {
                ((FilterOutputStream) this).out.write(i8);
                return;
            }
            if (!this.f16931a) {
                byte b8 = this.f16940j[i8 & 127];
                if (b8 <= -5) {
                    if (b8 != -5) {
                        throw new IOException("Invalid character in Base64 data.");
                    }
                    return;
                }
                byte[] bArr = this.f16933c;
                int i9 = this.f16932b;
                int i10 = i9 + 1;
                this.f16932b = i10;
                bArr[i9] = (byte) i8;
                if (i10 >= this.f16934d) {
                    ((FilterOutputStream) this).out.write(this.f16937g, 0, c.b(bArr, 0, this.f16937g, 0, this.f16939i));
                    this.f16932b = 0;
                    return;
                }
                return;
            }
            byte[] bArr2 = this.f16933c;
            int i11 = this.f16932b;
            int i12 = i11 + 1;
            this.f16932b = i12;
            bArr2[i11] = (byte) i8;
            int i13 = this.f16934d;
            if (i12 >= i13) {
                ((FilterOutputStream) this).out.write(c.b(this.f16937g, bArr2, i13, this.f16939i));
                int i14 = this.f16935e + 4;
                this.f16935e = i14;
                if (this.f16936f && i14 >= c.f16910j) {
                    ((FilterOutputStream) this).out.write(10);
                    this.f16935e = 0;
                }
                this.f16932b = 0;
            }
        }

        public b(OutputStream outputStream, int i8) {
            super(outputStream);
            this.f16936f = (i8 & 8) != 0;
            boolean z8 = (i8 & 1) != 0;
            this.f16931a = z8;
            int i9 = z8 ? 3 : 4;
            this.f16934d = i9;
            this.f16933c = new byte[i9];
            this.f16932b = 0;
            this.f16935e = 0;
            this.f16938h = false;
            this.f16937g = new byte[4];
            this.f16939i = i8;
            this.f16940j = c.c(i8);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i8, int i9) throws IOException {
            if (this.f16938h) {
                ((FilterOutputStream) this).out.write(bArr, i8, i9);
                return;
            }
            for (int i10 = 0; i10 < i9; i10++) {
                write(bArr[i8 + i10]);
            }
        }
    }

    private c() {
    }

    private static final byte[] b(int i8) {
        if ((i8 & 16) == 16) {
            return f16918r;
        }
        return (i8 & 32) == 32 ? f16920t : f16916p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] c(int i8) {
        if ((i8 & 16) == 16) {
            return f16919s;
        }
        return (i8 & 32) == 32 ? f16921u : f16917q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] b(byte[] bArr, byte[] bArr2, int i8, int i9) {
        b(bArr2, 0, i8, bArr, 0, i9);
        return bArr;
    }

    public static byte[] c(byte[] bArr) {
        return c(bArr, 0, bArr.length, 0);
    }

    public static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int iMin = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, iMin);
            b(bArr2, bArr, iMin, 0);
            byteBuffer2.put(bArr2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] b(byte[] bArr, int i8, int i9, byte[] bArr2, int i10, int i11) {
        byte[] bArrB = b(i11);
        int i12 = (i9 > 0 ? (bArr[i8] << 24) >>> 8 : 0) | (i9 > 1 ? (bArr[i8 + 1] << 24) >>> 16 : 0) | (i9 > 2 ? (bArr[i8 + 2] << 24) >>> 24 : 0);
        if (i9 == 1) {
            bArr2[i10] = bArrB[i12 >>> 18];
            bArr2[i10 + 1] = bArrB[(i12 >>> 12) & 63];
            bArr2[i10 + 2] = f16911k;
            bArr2[i10 + 3] = f16911k;
            return bArr2;
        }
        if (i9 == 2) {
            bArr2[i10] = bArrB[i12 >>> 18];
            bArr2[i10 + 1] = bArrB[(i12 >>> 12) & 63];
            bArr2[i10 + 2] = bArrB[(i12 >>> 6) & 63];
            bArr2[i10 + 3] = f16911k;
            return bArr2;
        }
        if (i9 != 3) {
            return bArr2;
        }
        bArr2[i10] = bArrB[i12 >>> 18];
        bArr2[i10 + 1] = bArrB[(i12 >>> 12) & 63];
        bArr2[i10 + 2] = bArrB[(i12 >>> 6) & 63];
        bArr2[i10 + 3] = bArrB[i12 & 63];
        return bArr2;
    }

    public static byte[] c(byte[] bArr, int i8, int i9, int i10) throws IOException {
        int i11;
        if (bArr != null) {
            if (i8 < 0 || (i11 = i8 + i9) > bArr.length) {
                throw new IllegalArgumentException(String.format(SZCvugJaXc.WwRhChxHLSMF, Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
            }
            if (i9 == 0) {
                return new byte[0];
            }
            if (i9 >= 4) {
                byte[] bArrC = c(i10);
                byte[] bArr2 = new byte[(i9 * 3) / 4];
                byte[] bArr3 = new byte[4];
                int i12 = 0;
                int iB = 0;
                while (i8 < i11) {
                    byte b8 = bArr[i8];
                    byte b9 = bArrC[b8 & f16915o];
                    if (b9 < -5) {
                        throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", Integer.valueOf(bArr[i8] & f16915o), Integer.valueOf(i8)));
                    }
                    if (b9 >= -1) {
                        int i13 = i12 + 1;
                        bArr3[i12] = b8;
                        if (i13 > 3) {
                            iB += b(bArr3, 0, bArr2, iB, i10);
                            if (bArr[i8] == 61) {
                                break;
                            }
                            i12 = 0;
                        } else {
                            i12 = i13;
                        }
                    }
                    i8++;
                }
                byte[] bArr4 = new byte[iB];
                System.arraycopy(bArr2, 0, bArr4, 0, iB);
                return bArr4;
            }
            throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + i9);
        }
        throw new NullPointerException("Cannot decode null source array.");
    }

    public static void a(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int iMin = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, iMin);
            b(bArr2, bArr, iMin, 0);
            for (int i8 = 0; i8 < 4; i8++) {
                charBuffer.put((char) (bArr2[i8] & f16915o));
            }
        }
    }

    public static String a(Serializable serializable) {
        return a(serializable, 0);
    }

    public static byte[] b(byte[] bArr) {
        try {
            return b(bArr, 0, bArr.length, 0);
        } catch (IOException e8) {
            if (f16909i) {
                return null;
            }
            throw new AssertionError("IOExceptions only come from GZipping, which is turned off: " + e8.getMessage());
        }
    }

    public static String a(Serializable serializable, int i8) throws Throwable {
        OutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        b bVar;
        ObjectOutputStream objectOutputStream;
        if (serializable != null) {
            ObjectOutputStream objectOutputStream2 = null;
            objectOutputStream2 = null;
            objectOutputStream2 = null;
            objectOutputStream2 = null;
            objectOutputStream2 = null;
            objectOutputStream2 = null;
            ByteArrayOutputStream byteArrayOutputStream2 = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bVar = new b(byteArrayOutputStream, i8 | 1);
                    try {
                        if ((i8 & 2) != 0) {
                            gZIPOutputStream = new GZIPOutputStream(bVar);
                            try {
                                objectOutputStream2 = new ObjectOutputStream(gZIPOutputStream);
                                gZIPOutputStream = gZIPOutputStream;
                            } catch (IOException e8) {
                                e = e8;
                                objectOutputStream = objectOutputStream2;
                                byteArrayOutputStream2 = byteArrayOutputStream;
                                gZIPOutputStream = gZIPOutputStream;
                                try {
                                    throw e;
                                } catch (Throwable th) {
                                    th = th;
                                    ObjectOutputStream objectOutputStream3 = objectOutputStream;
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                    objectOutputStream2 = objectOutputStream3;
                                    try {
                                        objectOutputStream2.close();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        gZIPOutputStream.close();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        bVar.close();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th;
                                    } catch (Exception unused4) {
                                        throw th;
                                    }
                                }
                            }
                        } else {
                            objectOutputStream2 = new ObjectOutputStream(bVar);
                            gZIPOutputStream = null;
                        }
                        objectOutputStream2.writeObject(serializable);
                        try {
                            objectOutputStream2.close();
                        } catch (Exception unused5) {
                        }
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception unused6) {
                        }
                        try {
                            bVar.close();
                        } catch (Exception unused7) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused8) {
                        }
                        try {
                            return new String(byteArrayOutputStream.toByteArray(), f16913m);
                        } catch (UnsupportedEncodingException unused9) {
                            return new String(byteArrayOutputStream.toByteArray());
                        }
                    } catch (IOException e9) {
                        e = e9;
                        ObjectOutputStream objectOutputStream4 = objectOutputStream2;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        objectOutputStream = objectOutputStream4;
                        gZIPOutputStream = objectOutputStream4;
                    } catch (Throwable th2) {
                        th = th2;
                        gZIPOutputStream = objectOutputStream2;
                    }
                } catch (IOException e10) {
                    e = e10;
                    gZIPOutputStream = null;
                    bVar = null;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    objectOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    gZIPOutputStream = null;
                    bVar = null;
                }
            } catch (IOException e11) {
                e = e11;
                gZIPOutputStream = null;
                objectOutputStream = null;
                bVar = null;
            } catch (Throwable th4) {
                th = th4;
                gZIPOutputStream = null;
                byteArrayOutputStream = null;
                bVar = null;
            }
        } else {
            throw new NullPointerException("Cannot serialize a null object.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] b(byte[] bArr, int i8, int i9, int i10) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        b bVar;
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i8);
        }
        if (i9 >= 0) {
            if (i8 + i9 > bArr2.length) {
                throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(bArr2.length)));
            }
            if ((i10 & 2) != 0) {
                GZIPOutputStream gZIPOutputStream2 = null;
                gZIPOutputStream2 = null;
                gZIPOutputStream2 = null;
                ByteArrayOutputStream byteArrayOutputStream2 = null;
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bVar = new b(byteArrayOutputStream, i10 | 1);
                        try {
                            gZIPOutputStream = new GZIPOutputStream(bVar);
                            try {
                                gZIPOutputStream.write(bArr2, i8, i9);
                                gZIPOutputStream.close();
                                try {
                                    gZIPOutputStream.close();
                                } catch (Exception unused) {
                                }
                                try {
                                    bVar.close();
                                } catch (Exception unused2) {
                                }
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused3) {
                                }
                                return byteArrayOutputStream.toByteArray();
                            } catch (IOException e8) {
                                e = e8;
                                byteArrayOutputStream2 = byteArrayOutputStream;
                                try {
                                    throw e;
                                } catch (Throwable th) {
                                    th = th;
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                    gZIPOutputStream2 = gZIPOutputStream;
                                    try {
                                        gZIPOutputStream2.close();
                                    } catch (Exception unused4) {
                                    }
                                    try {
                                        bVar.close();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th;
                                    } catch (Exception unused6) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                gZIPOutputStream2 = gZIPOutputStream;
                                gZIPOutputStream2.close();
                                bVar.close();
                                byteArrayOutputStream.close();
                                throw th;
                            }
                        } catch (IOException e9) {
                            e = e9;
                            gZIPOutputStream = null;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        bVar = null;
                        gZIPOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        bVar = null;
                    }
                } catch (IOException e11) {
                    e = e11;
                    bVar = null;
                    gZIPOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    byteArrayOutputStream = null;
                    bVar = null;
                }
            } else {
                Object[] objArr = (i10 & 8) != 0;
                int i11 = ((i9 / 3) * 4) + (i9 % 3 > 0 ? 4 : 0);
                if (objArr != false) {
                    i11 += i11 / f16910j;
                }
                int i12 = i11;
                byte[] bArr3 = new byte[i12];
                int i13 = i9 - 2;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (i15 < i13) {
                    b(bArr2, i15 + i8, 3, bArr3, i14, i10);
                    i16 += 4;
                    if (objArr != false && i16 >= f16910j) {
                        bArr3[i14 + 4] = f16912l;
                        i14++;
                        i16 = 0;
                    }
                    i15 += 3;
                    i14 += 4;
                    bArr2 = bArr;
                }
                if (i15 < i9) {
                    b(bArr, i15 + i8, i9 - i15, bArr3, i14, i10);
                    i14 += 4;
                }
                if (i14 > i12 - 1) {
                    return bArr3;
                }
                byte[] bArr4 = new byte[i14];
                System.arraycopy(bArr3, 0, bArr4, 0, i14);
                return bArr4;
            }
        } else {
            throw new IllegalArgumentException("Cannot have length offset: " + i9);
        }
    }

    public static String c(String str) throws Throwable {
        a aVar = null;
        try {
            File file = new File(str);
            byte[] bArr = new byte[Math.max((int) ((file.length() * 1.4d) + 1.0d), 40)];
            a aVar2 = new a(new BufferedInputStream(new FileInputStream(file)), 1);
            int i8 = 0;
            while (true) {
                try {
                    int i9 = aVar2.read(bArr, i8, 4096);
                    if (i9 < 0) {
                        break;
                    }
                    i8 += i9;
                } catch (IOException e8) {
                    aVar = aVar2;
                    throw e8;
                } catch (Throwable th) {
                    th = th;
                    aVar = aVar2;
                    try {
                        aVar.close();
                    } catch (Exception unused) {
                    }
                    throw th;
                }
            }
            String str2 = new String(bArr, 0, i8, f16913m);
            try {
                aVar2.close();
            } catch (Exception unused2) {
            }
            return str2;
        } catch (IOException e9) {
            throw e9;
        }
    }

    public static void c(String str, String str2) throws Throwable {
        byte[] bArrB = b(str);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str2));
                try {
                    bufferedOutputStream2.write(bArrB);
                    try {
                        bufferedOutputStream2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e8) {
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    try {
                        bufferedOutputStream.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e9) {
            throw e9;
        }
    }

    public static String a(byte[] bArr) throws Throwable {
        String strA;
        try {
            strA = a(bArr, 0, bArr.length, 0);
        } catch (IOException e8) {
            if (!f16909i) {
                throw new AssertionError(e8.getMessage());
            }
            strA = null;
        }
        if (f16909i || strA != null) {
            return strA;
        }
        throw new AssertionError();
    }

    public static String a(byte[] bArr, int i8) {
        return a(bArr, 0, bArr.length, i8);
    }

    public static String a(byte[] bArr, int i8, int i9) throws Throwable {
        String strA;
        try {
            strA = a(bArr, i8, i9, 0);
        } catch (IOException e8) {
            if (!f16909i) {
                throw new AssertionError(e8.getMessage());
            }
            strA = null;
        }
        if (f16909i || strA != null) {
            return strA;
        }
        throw new AssertionError();
    }

    public static String a(byte[] bArr, int i8, int i9, int i10) throws Throwable {
        byte[] bArrB = b(bArr, i8, i9, i10);
        try {
            return new String(bArrB, f16913m);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArrB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(byte[] bArr, int i8, byte[] bArr2, int i9, int i10) {
        int i11;
        int i12;
        if (bArr == null) {
            throw new NullPointerException("Source array was null.");
        }
        if (bArr2 != null) {
            if (i8 >= 0 && (i11 = i8 + 3) < bArr.length) {
                if (i9 >= 0 && (i12 = i9 + 2) < bArr2.length) {
                    byte[] bArrC = c(i10);
                    byte b8 = bArr[i8 + 2];
                    if (b8 == 61) {
                        bArr2[i9] = (byte) ((((bArrC[bArr[i8 + 1]] & f16915o) << 12) | ((bArrC[bArr[i8]] & f16915o) << 18)) >>> 16);
                        return 1;
                    }
                    byte b9 = bArr[i11];
                    if (b9 == 61) {
                        int i13 = ((bArrC[bArr[i8 + 1]] & f16915o) << 12) | ((bArrC[bArr[i8]] & f16915o) << 18) | ((bArrC[b8] & f16915o) << 6);
                        bArr2[i9] = (byte) (i13 >>> 16);
                        bArr2[i9 + 1] = (byte) (i13 >>> 8);
                        return 2;
                    }
                    int i14 = ((bArrC[bArr[i8 + 1]] & f16915o) << 12) | ((bArrC[bArr[i8]] & f16915o) << 18) | ((bArrC[b8] & f16915o) << 6) | (bArrC[b9] & f16915o);
                    bArr2[i9] = (byte) (i14 >> 16);
                    bArr2[i9 + 1] = (byte) (i14 >> 8);
                    bArr2[i12] = (byte) i14;
                    return 3;
                }
                throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i9)));
            }
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i8)));
        }
        throw new NullPointerException("Destination array was null.");
    }

    public static byte[] a(String str) {
        return a(str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static byte[] a(String str, int i8) throws Throwable {
        byte[] bytes;
        ByteArrayInputStream length;
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream;
        if (str != null) {
            try {
                bytes = str.getBytes(f16913m);
            } catch (UnsupportedEncodingException unused) {
                bytes = str.getBytes();
            }
            byte[] bArrC = c(bytes, 0, bytes.length, i8);
            boolean z8 = (i8 & 4) != 0;
            if (bArrC != null && (length = bArrC.length) >= 4 && !z8 && 35615 == ((bArrC[0] & f16915o) | ((bArrC[1] << 8) & 65280))) {
                byte[] bArr = new byte[2048];
                ByteArrayOutputStream byteArrayOutputStream = null;
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            byteArrayInputStream = new ByteArrayInputStream(bArrC);
                            try {
                                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                while (true) {
                                    try {
                                        int i9 = gZIPInputStream.read(bArr);
                                        if (i9 < 0) {
                                            break;
                                        }
                                        byteArrayOutputStream2.write(bArr, 0, i9);
                                    } catch (IOException e8) {
                                        e = e8;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        byteArrayInputStream = byteArrayInputStream;
                                        try {
                                            e.printStackTrace();
                                            byteArrayOutputStream.close();
                                            length = byteArrayInputStream;
                                        } catch (Throwable th) {
                                            th = th;
                                            try {
                                                byteArrayOutputStream.close();
                                            } catch (Exception unused2) {
                                            }
                                            try {
                                                gZIPInputStream.close();
                                            } catch (Exception unused3) {
                                            }
                                            try {
                                                byteArrayInputStream.close();
                                                throw th;
                                            } catch (Exception unused4) {
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        byteArrayOutputStream.close();
                                        gZIPInputStream.close();
                                        byteArrayInputStream.close();
                                        throw th;
                                    }
                                }
                                bArrC = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                length = byteArrayInputStream;
                            } catch (IOException e9) {
                                e = e9;
                                gZIPInputStream = null;
                            } catch (Throwable th3) {
                                th = th3;
                                gZIPInputStream = null;
                            }
                        } catch (IOException e10) {
                            e = e10;
                            byteArrayInputStream = null;
                            gZIPInputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            byteArrayInputStream = null;
                            gZIPInputStream = null;
                        }
                    } catch (Exception unused5) {
                    }
                } catch (IOException e11) {
                    e = e11;
                    byteArrayInputStream = null;
                    gZIPInputStream = null;
                } catch (Throwable th5) {
                    th = th5;
                    byteArrayInputStream = null;
                    gZIPInputStream = null;
                }
                try {
                    gZIPInputStream.close();
                } catch (Exception unused6) {
                }
                try {
                    length.close();
                } catch (Exception unused7) {
                }
            }
            return bArrC;
        }
        throw new NullPointerException("Input string was null.");
    }

    public static byte[] b(String str) throws Throwable {
        a aVar = null;
        try {
            try {
                File file = new File(str);
                if (file.length() <= 2147483647L) {
                    byte[] bArr = new byte[(int) file.length()];
                    a aVar2 = new a(new BufferedInputStream(new FileInputStream(file)), 0);
                    int i8 = 0;
                    while (true) {
                        try {
                            int i9 = aVar2.read(bArr, i8, 4096);
                            if (i9 < 0) {
                                break;
                            }
                            i8 += i9;
                        } catch (IOException e8) {
                            throw e8;
                        } catch (Throwable th) {
                            th = th;
                            aVar = aVar2;
                            try {
                                aVar.close();
                            } catch (Exception unused) {
                            }
                            throw th;
                        }
                    }
                    byte[] bArr2 = new byte[i8];
                    System.arraycopy(bArr, 0, bArr2, 0, i8);
                    try {
                        aVar2.close();
                    } catch (Exception unused2) {
                    }
                    return bArr2;
                }
                throw new IOException("File is too big for this convenience method (" + file.length() + " bytes).");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e9) {
            throw e9;
        }
    }

    public static void a(byte[] bArr, String str) throws Throwable {
        if (bArr != null) {
            b bVar = null;
            try {
                try {
                    b bVar2 = new b(new FileOutputStream(str), 1);
                    try {
                        bVar2.write(bArr);
                        try {
                            bVar2.close();
                        } catch (Exception unused) {
                        }
                    } catch (IOException e8) {
                    } catch (Throwable th) {
                        th = th;
                        bVar = bVar2;
                        try {
                            bVar.close();
                        } catch (Exception unused2) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e9) {
                throw e9;
            }
        } else {
            throw new NullPointerException("Data to encode was null.");
        }
    }

    public static void a(String str, String str2) throws Throwable {
        b bVar = null;
        try {
            try {
                b bVar2 = new b(new FileOutputStream(str2), 0);
                try {
                    bVar2.write(str.getBytes(f16913m));
                    try {
                        bVar2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e8) {
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar2;
                    try {
                        bVar.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (IOException e9) {
                throw e9;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void b(String str, String str2) throws Throwable {
        String strC = c(str);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str2));
                try {
                    bufferedOutputStream2.write(strC.getBytes(f16913m));
                    try {
                        bufferedOutputStream2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e8) {
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    try {
                        bufferedOutputStream.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e9) {
            throw e9;
        }
    }
}
