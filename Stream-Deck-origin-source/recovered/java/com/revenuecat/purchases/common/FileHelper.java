package com.revenuecat.purchases.common;

import C6.G;
import Q6.k;
import android.content.Context;
import com.revenuecat.purchases.utils.FileExtensionsKt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Consumer;
import java.util.stream.Stream;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class FileHelper {
    private final Context applicationContext;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.FileHelper$readFilePerLines$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AnonymousClass1 extends u implements k {
        final /* synthetic */ k $streamBlock;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(k kVar) {
            super(1);
            this.$streamBlock = kVar;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BufferedReader) obj);
            return G.f1419a;
        }

        public final void invoke(BufferedReader bufferedReader) {
            t.g(bufferedReader, "bufferedReader");
            k kVar = this.$streamBlock;
            Stream<String> streamLines = bufferedReader.lines();
            t.f(streamLines, "bufferedReader.lines()");
            kVar.invoke(streamLines);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.FileHelper$removeFirstLinesFromFile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21621 extends u implements k {
        final /* synthetic */ int $numberOfLinesToRemove;
        final /* synthetic */ StringBuilder $textToAppend;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.FileHelper$removeFirstLinesFromFile$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C04431 extends u implements k {
            final /* synthetic */ StringBuilder $textToAppend;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04431(StringBuilder sb) {
                super(1);
                this.$textToAppend = sb;
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return G.f1419a;
            }

            public final void invoke(String str) {
                StringBuilder sb = this.$textToAppend;
                sb.append(str);
                sb.append("\n");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21621(int i8, StringBuilder sb) {
            super(1);
            this.$numberOfLinesToRemove = i8;
            this.$textToAppend = sb;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(k tmp0, Object obj) {
            t.g(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Stream<String>) obj);
            return G.f1419a;
        }

        public final void invoke(Stream<String> stream) {
            t.g(stream, "stream");
            Stream<String> streamSkip = stream.skip(this.$numberOfLinesToRemove);
            final C04431 c04431 = new C04431(this.$textToAppend);
            streamSkip.forEach(new Consumer() { // from class: com.revenuecat.purchases.common.c
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    FileHelper.C21621.invoke$lambda$0(c04431, obj);
                }
            });
        }
    }

    public FileHelper(Context applicationContext) {
        t.g(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    private final File getFileInFilesDir(String str) {
        return new File(getFilesDir(), str);
    }

    private final File getFilesDir() {
        File filesDir = this.applicationContext.getFilesDir();
        t.f(filesDir, "applicationContext.filesDir");
        return filesDir;
    }

    private final void openBufferedReader(String str, k kVar) throws IllegalAccessException, IOException, InvocationTargetException {
        FileInputStream fileInputStream = new FileInputStream(getFileInFilesDir(str));
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    kVar.invoke(bufferedReader);
                    G g8 = G.f1419a;
                    N6.a.a(bufferedReader, null);
                    N6.a.a(inputStreamReader, null);
                    N6.a.a(fileInputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        N6.a.a(bufferedReader, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    N6.a.a(inputStreamReader, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                N6.a.a(fileInputStream, th5);
                throw th6;
            }
        }
    }

    public final void appendToFile(String filePath, String contentToAppend) throws IllegalAccessException, IOException, InvocationTargetException {
        t.g(filePath, "filePath");
        t.g(contentToAppend, "contentToAppend");
        File fileInFilesDir = getFileInFilesDir(filePath);
        File parentFile = fileInFilesDir.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(fileInFilesDir, true);
        try {
            byte[] bytes = contentToAppend.getBytes(Z6.c.f12941b);
            t.f(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            G g8 = G.f1419a;
            N6.a.a(fileOutputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                N6.a.a(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public final boolean deleteFile(String filePath) {
        t.g(filePath, "filePath");
        return getFileInFilesDir(filePath).delete();
    }

    public final boolean fileIsEmpty(String filePath) {
        t.g(filePath, "filePath");
        File fileInFilesDir = getFileInFilesDir(filePath);
        return !fileInFilesDir.exists() || fileInFilesDir.length() == 0;
    }

    public final double fileSizeInKB(String filePath) {
        t.g(filePath, "filePath");
        return FileExtensionsKt.getSizeInKB(getFileInFilesDir(filePath));
    }

    public final void readFilePerLines(String filePath, k streamBlock) throws IllegalAccessException, IOException, InvocationTargetException {
        t.g(filePath, "filePath");
        t.g(streamBlock, "streamBlock");
        openBufferedReader(filePath, new AnonymousClass1(streamBlock));
    }

    public final void removeFirstLinesFromFile(String filePath, int i8) throws IllegalAccessException, IOException, InvocationTargetException {
        t.g(filePath, "filePath");
        StringBuilder sb = new StringBuilder();
        readFilePerLines(filePath, new C21621(i8, sb));
        deleteFile(filePath);
        String string = sb.toString();
        t.f(string, "textToAppend.toString()");
        appendToFile(filePath, string);
    }
}
