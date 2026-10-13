package p219z4;

import F4.f;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: z4.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C3204m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3200i f39230b = new C3200i("LibraryVersion", "");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3204m f39231c = new C3204m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f39232a = new ConcurrentHashMap();

    public static C3204m a() {
        return f39231c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    public String b(String str) throws Throwable {
        ?? r8;
        InputStream resourceAsStream;
        AbstractC3207p.f(str, "Please provide a valid libraryName");
        if (this.f39232a.containsKey(str)) {
            return (String) this.f39232a.get(str);
        }
        Properties properties = new Properties();
        ?? r9 = 0;
        r9 = 0;
        r9 = 0;
        InputStream inputStream = null;
        try {
            try {
                resourceAsStream = C3204m.class.getResourceAsStream(String.format("/%s.properties", str));
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        String property = properties.getProperty(DiagnosticsEntry.VERSION_KEY, null);
                        f39230b.e("LibraryVersion", str + " version is " + property);
                        r9 = property;
                    } else {
                        f39230b.f("LibraryVersion", "Failed to get app version for libraryName: " + str);
                    }
                } catch (IOException e8) {
                    e = e8;
                    r8 = r9;
                    inputStream = resourceAsStream;
                    f39230b.d("LibraryVersion", "Failed to get app version for libraryName: " + str, e);
                    ?? r10 = r8;
                    resourceAsStream = inputStream;
                    r9 = r10;
                } catch (Throwable th) {
                    th = th;
                    r9 = resourceAsStream;
                    if (r9 != 0) {
                        f.a(r9);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e9) {
            e = e9;
            r8 = 0;
        }
        if (resourceAsStream != null) {
            f.a(resourceAsStream);
        }
        if (r9 == 0) {
            f39230b.b("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            r9 = "UNKNOWN";
        }
        this.f39232a.put(str, r9);
        return r9;
    }
}
