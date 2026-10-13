package io.sentry.cache;

import io.sentry.EnumC2596z2;
import io.sentry.InterfaceC2524m0;
import io.sentry.J2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f27019a = Charset.forName("UTF-8");

    public static void a(J2 j8, String str, String str2) {
        File fileB = b(j8, str);
        if (fileB == null) {
            j8.getLogger().c(EnumC2596z2.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(fileB, str2);
        if (file.exists()) {
            j8.getLogger().c(EnumC2596z2.DEBUG, "Deleting %s from scope cache", str2);
            if (file.delete()) {
                return;
            }
            j8.getLogger().c(EnumC2596z2.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    public static File b(J2 j8, String str) {
        String cacheDirPath = j8.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    public static Object c(J2 j8, String str, String str2, Class cls, InterfaceC2524m0 interfaceC2524m0) {
        File fileB = b(j8, str);
        if (fileB == null) {
            j8.getLogger().c(EnumC2596z2.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(fileB, str2);
        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f27019a));
                try {
                    Object objC = interfaceC2524m0 == null ? j8.getSerializer().c(bufferedReader, cls) : j8.getSerializer().e(bufferedReader, cls, interfaceC2524m0);
                    bufferedReader.close();
                    return objC;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                j8.getLogger().a(EnumC2596z2.ERROR, th3, "Error reading entity from scope cache: %s", str2);
            }
        } else {
            j8.getLogger().c(EnumC2596z2.DEBUG, "No entry stored for %s", str2);
        }
        return null;
    }

    public static void d(J2 j8, Object obj, String str, String str2) {
        File fileB = b(j8, str);
        if (fileB == null) {
            j8.getLogger().c(EnumC2596z2.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        File file = new File(fileB, str2);
        if (file.exists()) {
            j8.getLogger().c(EnumC2596z2.DEBUG, "Overwriting %s in scope cache", str2);
            if (!file.delete()) {
                j8.getLogger().c(EnumC2596z2.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f27019a));
                try {
                    j8.getSerializer().a(obj, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            j8.getLogger().a(EnumC2596z2.ERROR, th5, "Error persisting entity: %s", str2);
        }
    }
}
