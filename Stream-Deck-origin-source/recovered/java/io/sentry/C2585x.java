package io.sentry;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: io.sentry.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2585x implements N {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f27795b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2484c0 f27796a;

    public C2585x(InterfaceC2484c0 interfaceC2484c0) {
        this.f27796a = interfaceC2484c0;
    }

    @Override // io.sentry.N
    public W1 a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i8 = 0;
        int i9 = -1;
        while (true) {
            try {
                int i10 = inputStream.read(bArr);
                if (i10 <= 0) {
                    break;
                }
                for (int i11 = 0; i9 == -1 && i11 < i10; i11++) {
                    if (bArr[i11] == 10) {
                        i9 = i8 + i11;
                        break;
                    }
                }
                byteArrayOutputStream.write(bArr, 0, i10);
                i8 += i10;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length == 0) {
            throw new IllegalArgumentException("Empty stream.");
        }
        if (i9 == -1) {
            throw new IllegalArgumentException("Envelope contains no header.");
        }
        X1 x1B = b(byteArray, 0, i9);
        if (x1B == null) {
            throw new IllegalArgumentException("Envelope header is null.");
        }
        int i12 = i9 + 1;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i13 = i12;
            while (true) {
                if (i13 >= byteArray.length) {
                    i13 = -1;
                    break;
                }
                if (byteArray[i13] == 10) {
                    break;
                }
                i13++;
            }
            if (i13 == -1) {
                throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
            }
            C2553r2 c2553r2C = c(byteArray, i12, i13 - i12);
            if (c2553r2C == null || c2553r2C.a() <= 0) {
                throw new IllegalArgumentException("Item header at index '" + arrayList.size() + "' is null or empty.");
            }
            int iA = c2553r2C.a() + i13;
            int i14 = iA + 1;
            if (i14 > byteArray.length) {
                throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i14 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
            }
            arrayList.add(new C2550q2(c2553r2C, Arrays.copyOfRange(byteArray, i13 + 1, i14)));
            if (i14 == byteArray.length) {
                break;
            }
            i12 = iA + 2;
            if (i12 == byteArray.length) {
                if (byteArray[i14] == 10) {
                    break;
                }
                throw new IllegalArgumentException("Envelope has invalid data following an item.");
            }
        }
        W1 w8 = new W1(x1B, arrayList);
        byteArrayOutputStream.close();
        return w8;
    }

    public final X1 b(byte[] bArr, int i8, int i9) {
        StringReader stringReader = new StringReader(new String(bArr, i8, i9, f27795b));
        try {
            X1 x8 = (X1) this.f27796a.c(stringReader, X1.class);
            stringReader.close();
            return x8;
        } catch (Throwable th) {
            try {
                stringReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final C2553r2 c(byte[] bArr, int i8, int i9) {
        StringReader stringReader = new StringReader(new String(bArr, i8, i9, f27795b));
        try {
            C2553r2 c2553r2 = (C2553r2) this.f27796a.c(stringReader, C2553r2.class);
            stringReader.close();
            return c2553r2;
        } catch (Throwable th) {
            try {
                stringReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
