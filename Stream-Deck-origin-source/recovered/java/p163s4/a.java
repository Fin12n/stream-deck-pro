package p163s4;

import J4.e;
import J4.f;
import M6.eLZq.eGwOBWCdOTaKus;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p195w4.g;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p195w4.a f33151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f33152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f33153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f33154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f33155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f33156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f33157g;

    /* JADX INFO: renamed from: s4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0756a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f33159b;

        public C0756a(String str, boolean z8) {
            this.f33158a = str;
            this.f33159b = z8;
        }

        public String a() {
            return this.f33158a;
        }

        public boolean b() {
            return this.f33159b;
        }

        public String toString() {
            String str = this.f33158a;
            boolean z8 = this.f33159b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z8);
            return sb.toString();
        }
    }

    public a(Context context) {
        this(context, 30000L, false, false);
    }

    public static C0756a a(Context context) {
        a aVar = new a(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.d(false);
            C0756a c0756aB = aVar.b();
            aVar.e(c0756aB, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            aVar.c();
            return c0756aB;
        } catch (Throwable th) {
            try {
                aVar.e(null, true, 0.0f, -1L, "", th);
                throw th;
            } catch (Throwable th2) {
                aVar.c();
                throw th2;
            }
        }
    }

    public C0756a b() {
        C0756a c0756a;
        AbstractC3207p.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f33153c) {
                    synchronized (this.f33154d) {
                        c cVar = this.f33155e;
                        if (cVar == null || !cVar.f33164d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f33153c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e8) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e8);
                    }
                }
                AbstractC3207p.k(this.f33151a);
                AbstractC3207p.k(this.f33152b);
                try {
                    c0756a = new C0756a(this.f33152b.j(), this.f33152b.n(true));
                } catch (RemoteException e9) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e9);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f();
        return c0756a;
    }

    public final void c() {
        AbstractC3207p.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f33156f == null || this.f33151a == null) {
                    return;
                }
                try {
                    if (this.f33153c) {
                        E4.a.b().c(this.f33156f, this.f33151a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f33153c = false;
                this.f33152b = null;
                this.f33151a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        synchronized (this.f33154d) {
            c cVar = this.f33155e;
            if (cVar != null) {
                cVar.f33163c.countDown();
                try {
                    this.f33155e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j8 = this.f33157g;
            if (j8 > 0) {
                this.f33155e = new c(this, j8);
            }
        }
    }

    public final void finalize() throws Throwable {
        c();
        super.finalize();
    }

    public a(Context context, long j8, boolean z8, boolean z9) {
        Context applicationContext;
        this.f33154d = new Object();
        AbstractC3207p.k(context);
        if (z8 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f33156f = context;
        this.f33153c = false;
        this.f33157g = j8;
    }

    public final void d(boolean z8) {
        AbstractC3207p.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f33153c) {
                    c();
                }
                Context context = this.f33156f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iH = p195w4.f.f().h(context, 12451000);
                    if (iH != 0 && iH != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    p195w4.a aVar = new p195w4.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage(eGwOBWCdOTaKus.KeZUIiLC);
                    try {
                        if (!E4.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f33151a = aVar;
                        try {
                            this.f33152b = e.a(aVar.a(10000L, TimeUnit.MILLISECONDS));
                            this.f33153c = true;
                            if (z8) {
                                f();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new g(9);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean e(C0756a c0756a, boolean z8, float f8, long j8, String str, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            String str2 = "1";
            map.put("app_context", "1");
            if (c0756a != null) {
                if (true != c0756a.b()) {
                    str2 = "0";
                }
                map.put("limit_ad_tracking", str2);
                String strA = c0756a.a();
                if (strA != null) {
                    map.put(WaYxBuDSBD.YhfT, Integer.toString(strA.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j8));
            new b(this, map).start();
            return true;
        }
        return false;
    }
}
