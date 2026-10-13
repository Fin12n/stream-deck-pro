package p004a3;

import J7.g;
import J7.p;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p063h.s;
import p103l3.w;
import p112m3.c;
import p121n3.d;
import p121n3.j;
import p135p0.Dyk.GOKsbdzhLhXAMt;

/* JADX INFO: renamed from: a3.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1712s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f13302a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f13303b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f13304c = {80, 75, 3, 4};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f13305d = {31, -117, 8};

    public static Boolean B(g gVar) {
        return E(gVar, f13305d);
    }

    public static boolean C(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static Boolean D(g gVar) {
        return E(gVar, f13304c);
    }

    public static Boolean E(g gVar, byte[] bArr) {
        try {
            g gVarPeek = gVar.peek();
            for (byte b8 : bArr) {
                if (gVarPeek.readByte() != b8) {
                    return Boolean.FALSE;
                }
            }
            gVarPeek.close();
            return Boolean.TRUE;
        } catch (Exception e8) {
            d.b("Failed to check zip file header", e8);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static void F(boolean z8) {
        ArrayList arrayList = new ArrayList(f13303b);
        if (arrayList.size() <= 0) {
            return;
        }
        s.a(arrayList.get(0));
        throw null;
    }

    public static String G(Context context, int i8) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(C(context) ? "_night_" : "_day_");
        sb.append(i8);
        return sb.toString();
    }

    public static /* synthetic */ O a(WeakReference weakReference, Context context, int i8, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return v(context, i8, str);
    }

    public static /* synthetic */ O b(Context context, String str, String str2) {
        O oC = AbstractC1699e.h(context).c(context, str, str2);
        if (str2 != null && oC.b() != null) {
            p058g3.g.b().c(str2, (C1705k) oC.b());
        }
        return oC;
    }

    public static /* synthetic */ void d(String str, AtomicBoolean atomicBoolean, C1705k c1705k) {
        Map map = f13302a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            F(true);
        }
    }

    public static /* synthetic */ void e(String str, AtomicBoolean atomicBoolean, Throwable th) {
        Map map = f13302a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            F(true);
        }
    }

    public static Q h(final String str, Callable callable, Runnable runnable) {
        C1705k c1705kA = str == null ? null : p058g3.g.b().a(str);
        Q q8 = c1705kA != null ? new Q(c1705kA) : null;
        if (str != null) {
            Map map = f13302a;
            if (map.containsKey(str)) {
                q8 = (Q) map.get(str);
            }
        }
        if (q8 != null) {
            if (runnable != null) {
                runnable.run();
            }
            return q8;
        }
        Q q9 = new Q((Callable<O>) callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            q9.d(new L() { // from class: a3.q
                @Override // p004a3.L
                public final void onResult(Object obj) {
                    AbstractC1712s.d(str, atomicBoolean, (C1705k) obj);
                }
            });
            q9.c(new L() { // from class: a3.r
                @Override // p004a3.L
                public final void onResult(Object obj) {
                    AbstractC1712s.e(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map map2 = f13302a;
                map2.put(str, q9);
                if (map2.size() == 1) {
                    F(false);
                }
            }
        }
        return q9;
    }

    public static K i(C1705k c1705k, String str) {
        for (K k8 : c1705k.j().values()) {
            if (k8.c().equals(str)) {
                return k8;
            }
        }
        return null;
    }

    public static Q j(Context context, String str) {
        return k(context, str, "asset_" + str);
    }

    public static Q k(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return h(str2, new Callable() { // from class: a3.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC1712s.m(applicationContext, str, str2);
            }
        }, null);
    }

    public static O l(Context context, String str) {
        return m(context, str, "asset_" + str);
    }

    public static O m(Context context, String str, String str2) {
        C1705k c1705kA = str2 == null ? null : p058g3.g.b().a(str2);
        if (c1705kA != null) {
            return new O(c1705kA);
        }
        try {
            g gVarD = p.d(p.k(context.getAssets().open(str)));
            if (D(gVarD).booleanValue()) {
                return y(context, new ZipInputStream(gVarD.Y1()), str2);
            }
            return B(gVarD).booleanValue() ? o(new GZIPInputStream(gVarD.Y1()), str2) : o(gVarD.Y1(), str2);
        } catch (IOException e8) {
            return new O((Throwable) e8);
        }
    }

    public static Q n(final InputStream inputStream, final String str) {
        return h(str, new Callable() { // from class: a3.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC1712s.o(inputStream, str);
            }
        }, new Runnable() { // from class: a3.n
            @Override // java.lang.Runnable
            public final void run() {
                j.c(inputStream);
            }
        });
    }

    public static O o(InputStream inputStream, String str) {
        return p(inputStream, str, true);
    }

    public static O p(InputStream inputStream, String str, boolean z8) {
        return q(c.v(p.d(p.k(inputStream))), str, z8);
    }

    public static O q(c cVar, String str, boolean z8) {
        return r(cVar, str, z8);
    }

    public static O r(c cVar, String str, boolean z8) {
        try {
            C1705k c1705kA = str == null ? null : p058g3.g.b().a(str);
            if (c1705kA != null) {
                return new O(c1705kA);
            }
            C1705k c1705kA2 = w.a(cVar);
            if (str != null) {
                p058g3.g.b().c(str, c1705kA2);
            }
            return new O(c1705kA2);
        } catch (Exception e8) {
            return new O((Throwable) e8);
        } finally {
            if (z8) {
                j.c(cVar);
            }
        }
    }

    public static Q s(Context context, int i8) {
        return t(context, i8, G(context, i8));
    }

    public static Q t(Context context, final int i8, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return h(str, new Callable() { // from class: a3.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC1712s.a(weakReference, applicationContext, i8, str);
            }
        }, null);
    }

    public static O u(Context context, int i8) {
        return v(context, i8, G(context, i8));
    }

    public static O v(Context context, int i8, String str) {
        C1705k c1705kA = str == null ? null : p058g3.g.b().a(str);
        if (c1705kA != null) {
            return new O(c1705kA);
        }
        try {
            g gVarD = p.d(p.k(context.getResources().openRawResource(i8)));
            if (D(gVarD).booleanValue()) {
                return y(context, new ZipInputStream(gVarD.Y1()), str);
            }
            if (!B(gVarD).booleanValue()) {
                return o(gVarD.Y1(), str);
            }
            try {
                return o(new GZIPInputStream(gVarD.Y1()), str);
            } catch (IOException e8) {
                return new O((Throwable) e8);
            }
        } catch (Resources.NotFoundException e9) {
            return new O((Throwable) e9);
        }
    }

    public static Q w(Context context, String str) {
        return x(context, str, "url_" + str);
    }

    public static Q x(final Context context, final String str, final String str2) {
        return h(str2, new Callable() { // from class: a3.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC1712s.b(context, str, str2);
            }
        }, null);
    }

    public static O y(Context context, ZipInputStream zipInputStream, String str) {
        return z(context, zipInputStream, str, true);
    }

    public static O z(Context context, ZipInputStream zipInputStream, String str, boolean z8) {
        try {
            return A(context, zipInputStream, str);
        } finally {
            if (z8) {
                j.c(zipInputStream);
            }
        }
    }

    public static O A(Context context, ZipInputStream zipInputStream, String str) {
        C1705k c1705kA;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            c1705kA = null;
        } else {
            try {
                c1705kA = p058g3.g.b().a(str);
            } catch (IOException e8) {
                return new O((Throwable) e8);
            }
        }
        if (c1705kA != null) {
            return new O(c1705kA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        C1705k c1705k = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                c1705k = (C1705k) r(c.v(p.d(p.k(zipInputStream))), null, false).b();
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(GOKsbdzhLhXAMt.Icrb)) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                File file = new File(context.getCacheDir(), str2);
                new FileOutputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i8 = zipInputStream.read(bArr);
                            if (i8 == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i8);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            d.c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                        }
                        map2.put(str3, typefaceCreateFromFile);
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    d.d("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                }
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (c1705k == null) {
            return new O((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            K kI = i(c1705k, (String) entry.getKey());
            if (kI != null) {
                kI.g(j.l((Bitmap) entry.getValue(), kI.f(), kI.d()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z8 = false;
            for (p058g3.c cVar : c1705k.g().values()) {
                if (cVar.a().equals(entry2.getKey())) {
                    cVar.e((Typeface) entry2.getValue());
                    z8 = true;
                }
            }
            if (!z8) {
                d.c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it = c1705k.j().entrySet().iterator();
            while (it.hasNext()) {
                K k8 = (K) ((Map.Entry) it.next()).getValue();
                if (k8 == null) {
                    return null;
                }
                String strC = k8.c();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (strC.startsWith("data:") && strC.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(strC.substring(strC.indexOf(44) + 1), 0);
                        k8.g(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                    } catch (IllegalArgumentException e9) {
                        d.d("data URL did not have correct base64 format.", e9);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            p058g3.g.b().c(str, c1705k);
        }
        return new O(c1705k);
    }
}
