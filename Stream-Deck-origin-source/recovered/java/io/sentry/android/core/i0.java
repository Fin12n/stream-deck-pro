package io.sentry.android.core;

import android.content.Context;
import io.sentry.InterfaceC2480b0;
import io.sentry.W2;
import io.sentry.util.C2569a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f26352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f26353b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2569a f26354c = new C2569a();

    public static String a(Context context) {
        InterfaceC2480b0 interfaceC2480b0A = f26354c.a();
        try {
            if (f26352a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    if (!file.exists()) {
                        String strC = c(file);
                        f26352a = strC;
                        if (interfaceC2480b0A != null) {
                            interfaceC2480b0A.close();
                        }
                        return strC;
                    }
                    f26352a = b(file);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            String str = f26352a;
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return str;
        } catch (Throwable th2) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static String b(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, f26353b);
            randomAccessFile.close();
            return str;
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String c(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            String strA = W2.a();
            fileOutputStream.write(strA.getBytes(f26353b));
            fileOutputStream.flush();
            fileOutputStream.close();
            return strA;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
