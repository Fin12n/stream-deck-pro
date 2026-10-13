package D7;

import J7.A;
import J7.C;
import J7.p;
import J7.q;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0086a f1957a = C0086a.f1959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1958b = new C0086a.C0087a();

    /* JADX INFO: renamed from: D7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0086a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C0086a f1959a = new C0086a();

        /* JADX INFO: renamed from: D7.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0087a implements a {
            @Override // D7.a
            public C a(File file) {
                t.g(file, "file");
                return p.j(file);
            }

            @Override // D7.a
            public A b(File file) {
                t.g(file, "file");
                try {
                    return q.g(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return q.g(file, false, 1, null);
                }
            }

            @Override // D7.a
            public void c(File directory) throws IOException {
                t.g(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        t.f(file, "file");
                        c(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // D7.a
            public boolean d(File file) {
                t.g(file, "file");
                return file.exists();
            }

            @Override // D7.a
            public void e(File from, File to) throws IOException {
                t.g(from, "from");
                t.g(to, "to");
                f(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // D7.a
            public void f(File file) throws IOException {
                t.g(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // D7.a
            public long h(File file) {
                t.g(file, "file");
                return file.length();
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }

            @Override // D7.a
            public A g(File file) {
                t.g(file, ajyWhveMDgQ.XwfNpT);
                try {
                    return p.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return p.a(file);
                }
            }
        }
    }

    C a(File file);

    A b(File file);

    void c(File file);

    boolean d(File file);

    void e(File file, File file2);

    void f(File file);

    A g(File file);

    long h(File file);
}
