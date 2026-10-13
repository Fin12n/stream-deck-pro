package p041e4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p050f4.j;
import p050f4.k;
import p050f4.l;
import p050f4.m;
import p050f4.n;
import p050f4.o;
import p050f4.p;
import p059g4.e;
import p068h4.f;
import p068h4.g;
import p068h4.i;
import p104l4.c;
import p181u6.GfRt.QhsKALGiniuQ;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p042e5.a f20760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f20761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f20762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f20763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p147q4.a f20764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p147q4.a f20765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20766g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URL f20767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f20768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f20769c;

        public a(URL url, j jVar, String str) {
            this.f20767a = url;
            this.f20768b = jVar;
            this.f20769c = str;
        }

        public a a(URL url) {
            return new a(url, this.f20768b, this.f20769c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final URL f20771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f20772c;

        public b(int i8, URL url, long j8) {
            this.f20770a = i8;
            this.f20771b = url;
            this.f20772c = j8;
        }
    }

    public d(Context context, p147q4.a aVar, p147q4.a aVar2, int i8) {
        this.f20760a = j.b();
        this.f20762c = context;
        this.f20761b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f20763d = m(p041e4.a.f20751c);
        this.f20764e = aVar2;
        this.f20765f = aVar;
        this.f20766g = i8;
    }

    public static /* synthetic */ a d(a aVar, b bVar) {
        URL url = bVar.f20771b;
        if (url == null) {
            return null;
        }
        p095k4.a.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f20771b);
    }

    public static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.b.UNKNOWN_MOBILE_SUBTYPE.b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return o.b.COMBINED.b();
        }
        if (o.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    public static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? o.c.NONE.b() : networkInfo.getType();
    }

    public static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e8) {
            p095k4.a.c("CctTransportBackend", "Unable to find version code for package", e8);
            return -1;
        }
    }

    public static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static InputStream l(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static URL m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e8) {
            throw new IllegalArgumentException("Invalid url: " + str, e8);
        }
    }

    @Override // p068h4.i
    public g a(f fVar) {
        j jVarI = i(fVar);
        URL urlM = this.f20763d;
        String strD = null;
        if (fVar.c() != null) {
            try {
                p041e4.a aVarC = p041e4.a.c(fVar.c());
                strD = aVarC.d() != null ? aVarC.d() : null;
                if (aVarC.e() != null) {
                    urlM = m(aVarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) p104l4.b.a(5, new a(urlM, jVarI, strD), new p104l4.a() { // from class: e4.b
                @Override // p104l4.a
                public final Object apply(Object obj) {
                    return this.f20759a.e((d.a) obj);
                }
            }, new c() { // from class: e4.c
                @Override // p104l4.c
                public final Object a(Object obj, Object obj2) {
                    return d.d((d.a) obj, (d.b) obj2);
                }
            });
            int i8 = bVar.f20770a;
            if (i8 == 200) {
                return g.e(bVar.f20772c);
            }
            if (i8 < 500 && i8 != 404) {
                return i8 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e8) {
            p095k4.a.c("CctTransportBackend", "Could not make request to the backend", e8);
            return g.f();
        }
    }

    public final b e(a aVar) throws IOException {
        p095k4.a.e("CctTransportBackend", "Making request to: %s", aVar.f20767a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f20767a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f20766g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.8"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f20769c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f20760a.a(aVar.f20768b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    p095k4.a.e("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    p095k4.a.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    p095k4.a.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamL = l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(inputStreamL))).c());
                            if (inputStreamL != null) {
                                inputStreamL.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th) {
                            if (inputStreamL != null) {
                                try {
                                    inputStreamL.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                }
                throw th7;
            }
        } catch (p042e5.c e8) {
            e = e8;
            p095k4.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(RCHTTPStatusCodes.BAD_REQUEST, null, 0L);
        } catch (ConnectException e9) {
            e = e9;
            p095k4.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            p095k4.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            p095k4.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(RCHTTPStatusCodes.BAD_REQUEST, null, 0L);
        }
    }

    @Override // p068h4.i
    public com.google.android.datatransport.runtime.d b(com.google.android.datatransport.runtime.d dVar) {
        NetworkInfo activeNetworkInfo = this.f20761b.getActiveNetworkInfo();
        return dVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c(kDsnNkYbBsI.tLDSH, Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f20762c).getSimOperator()).c("application_build", Integer.toString(h(this.f20762c))).d();
    }

    public final j i(f fVar) {
        l.a aVarJ;
        HashMap map = new HashMap();
        for (com.google.android.datatransport.runtime.d dVar : fVar.b()) {
            String strJ = dVar.j();
            if (map.containsKey(strJ)) {
                ((List) map.get(strJ)).add(dVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(dVar);
                map.put(strJ, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            com.google.android.datatransport.runtime.d dVar2 = (com.google.android.datatransport.runtime.d) ((List) entry.getValue()).get(0);
            m.a aVarB = m.a().f(p.DEFAULT).g(this.f20765f.a()).h(this.f20764e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(p050f4.a.a().m(Integer.valueOf(dVar2.g("sdk-version"))).j(dVar2.b("model")).f(dVar2.b("hardware")).d(dVar2.b("device")).l(dVar2.b("product")).k(dVar2.b("os-uild")).h(dVar2.b("manufacturer")).e(dVar2.b("fingerprint")).c(dVar2.b("country")).g(dVar2.b(QhsKALGiniuQ.LdDrONkvILg)).i(dVar2.b("mcc_mnc")).b(dVar2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (com.google.android.datatransport.runtime.d dVar3 : (List) entry.getValue()) {
                e eVarE = dVar3.e();
                p032d4.b bVarB = eVarE.b();
                if (bVarB.equals(p032d4.b.b("proto"))) {
                    aVarJ = l.j(eVarE.a());
                } else if (bVarB.equals(p032d4.b.b("json"))) {
                    aVarJ = l.i(new String(eVarE.a(), Charset.forName("UTF-8")));
                } else {
                    p095k4.a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", bVarB);
                }
                aVarJ.c(dVar3.f()).d(dVar3.k()).h(dVar3.h("tz-offset")).e(o.a().c(o.c.a(dVar3.g("net-type"))).b(o.b.a(dVar3.g("mobile-subtype"))).a());
                if (dVar3.d() != null) {
                    aVarJ.b(dVar3.d());
                }
                arrayList3.add(aVarJ.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return j.a(arrayList2);
    }

    public d(Context context, p147q4.a aVar, p147q4.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
