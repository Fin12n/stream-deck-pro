package p094k3;

import android.content.Context;
import android.util.Pair;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import p004a3.AbstractC1712s;
import p004a3.C1705k;
import p004a3.O;
import p121n3.d;
import p135p0.Dyk.GOKsbdzhLhXAMt;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f28690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f28691b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28692a;

        static {
            int[] iArr = new int[c.values().length];
            f28692a = iArr;
            try {
                iArr[c.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28692a[c.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public h(g gVar, f fVar) {
        this.f28690a = gVar;
        this.f28691b = fVar;
    }

    public final C1705k a(Context context, String str, String str2) {
        g gVar;
        Pair pairA;
        O oY;
        if (str2 == null || (gVar = this.f28690a) == null || (pairA = gVar.a(str)) == null) {
            return null;
        }
        c cVar = (c) pairA.first;
        InputStream inputStream = (InputStream) pairA.second;
        int i8 = a.f28692a[cVar.ordinal()];
        if (i8 == 1) {
            oY = AbstractC1712s.y(context, new ZipInputStream(inputStream), str2);
        } else if (i8 != 2) {
            oY = AbstractC1712s.o(inputStream, str2);
        } else {
            try {
                oY = AbstractC1712s.o(new GZIPInputStream(inputStream), str2);
            } catch (IOException e8) {
                oY = new O((Throwable) e8);
            }
        }
        if (oY.b() != null) {
            return (C1705k) oY.b();
        }
        return null;
    }

    public final O b(Context context, String str, String str2) {
        O o8;
        d.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                d dVarA = this.f28691b.a(str);
                if (dVarA.v1()) {
                    o8 = e(context, str, dVarA.X0(), dVarA.G0(), str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Completed fetch from network. Success: ");
                    sb.append(o8.b() != null);
                    d.a(sb.toString());
                } else {
                    o8 = new O((Throwable) new IllegalArgumentException(dVarA.N0()));
                }
                try {
                    dVarA.close();
                    return o8;
                } catch (IOException e8) {
                    d.d("LottieFetchResult close failed ", e8);
                    return o8;
                }
            } catch (Exception e9) {
                O o9 = new O((Throwable) e9);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e10) {
                        d.d("LottieFetchResult close failed ", e10);
                    }
                }
                return o9;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            try {
                closeable.close();
                throw th;
            } catch (IOException e11) {
                d.d("LottieFetchResult close failed ", e11);
                throw th;
            }
        }
    }

    public O c(Context context, String str, String str2) {
        C1705k c1705kA = a(context, str, str2);
        if (c1705kA != null) {
            return new O(c1705kA);
        }
        d.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(context, str, str2);
    }

    public final O d(String str, InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f28690a) == null) ? AbstractC1712s.o(new GZIPInputStream(inputStream), null) : AbstractC1712s.o(new GZIPInputStream(new FileInputStream(gVar.g(str, inputStream, c.GZIP))), str);
    }

    public final O f(String str, InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f28690a) == null) ? AbstractC1712s.o(inputStream, null) : AbstractC1712s.o(new FileInputStream(gVar.g(str, inputStream, c.JSON).getAbsolutePath()), str);
    }

    public final O g(Context context, String str, InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f28690a) == null) ? AbstractC1712s.y(context, new ZipInputStream(inputStream), null) : AbstractC1712s.y(context, new ZipInputStream(new FileInputStream(gVar.g(str, inputStream, c.ZIP))), str);
    }

    public final O e(Context context, String str, InputStream inputStream, String str2, String str3) {
        O oG;
        c cVar;
        g gVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            d.a("Handling zip response.");
            c cVar2 = c.ZIP;
            oG = g(context, str, inputStream, str3);
            cVar = cVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(GOKsbdzhLhXAMt.BYbIMAwvbAfStWi)) {
            d.a("Handling gzip response.");
            cVar = c.GZIP;
            oG = d(str, inputStream, str3);
        } else {
            d.a("Received json response.");
            cVar = c.JSON;
            oG = f(str, inputStream, str3);
        }
        if (str3 != null && oG.b() != null && (gVar = this.f28690a) != null) {
            gVar.f(str, cVar);
        }
        return oG;
    }
}
