package A;

import H.AbstractC0972c0;
import H.AbstractC0976e0;
import H.X0;
import H.Y0;
import H.v1;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f36s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final SparseArray f37t = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H.Y f38a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f39b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G f40c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f41d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f42e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HandlerThread f43f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public H.H f44g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public H.G f45h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v1 f46i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public L.m f47j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC0905y f48k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z0 f49l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Y4.a f50m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final H.T f51n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f52o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Y4.a f53p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f54q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f55r;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public F(Context context, G.b bVar) {
        this(context, bVar, new Y0());
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0136  */
    /* JADX WARN: Code duplicated, block: B:39:0x016f A[Catch: all -> 0x01cb, TryCatch #3 {all -> 0x01cb, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x016f, B:40:0x0171, B:43:0x0177, B:45:0x017d, B:46:0x0184, B:48:0x0188, B:49:0x01b4, B:51:0x01b8, B:52:0x01bc, B:57:0x01ca, B:41:0x0172, B:42:0x0176), top: B:63:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x017d A[Catch: all -> 0x01cb, TryCatch #3 {all -> 0x01cb, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x016f, B:40:0x0171, B:43:0x0177, B:45:0x017d, B:46:0x0184, B:48:0x0188, B:49:0x01b4, B:51:0x01b8, B:52:0x01bc, B:57:0x01ca, B:41:0x0172, B:42:0x0176), top: B:63:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0184 A[Catch: all -> 0x01cb, TryCatch #3 {all -> 0x01cb, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x016f, B:40:0x0171, B:43:0x0177, B:45:0x017d, B:46:0x0184, B:48:0x0188, B:49:0x01b4, B:51:0x01b8, B:52:0x01bc, B:57:0x01ca, B:41:0x0172, B:42:0x0176), top: B:63:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0188 A[Catch: all -> 0x01cb, TryCatch #3 {all -> 0x01cb, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x016f, B:40:0x0171, B:43:0x0177, B:45:0x017d, B:46:0x0184, B:48:0x0188, B:49:0x01b4, B:51:0x01b8, B:52:0x01bc, B:57:0x01ca, B:41:0x0172, B:42:0x0176), top: B:63:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01b4 A[Catch: all -> 0x01cb, TryCatch #3 {all -> 0x01cb, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x016f, B:40:0x0171, B:43:0x0177, B:45:0x017d, B:46:0x0184, B:48:0x0188, B:49:0x01b4, B:51:0x01b8, B:52:0x01bc, B:57:0x01ca, B:41:0x0172, B:42:0x0176), top: B:63:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x01b8 A[Catch: all -> 0x01cb, TryCatch #3 {all -> 0x01cb, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x016f, B:40:0x0171, B:43:0x0177, B:45:0x017d, B:46:0x0184, B:48:0x0188, B:49:0x01b4, B:51:0x01b8, B:52:0x01bc, B:57:0x01ca, B:41:0x0172, B:42:0x0176), top: B:63:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x01bc A[Catch: all -> 0x01cb, TRY_LEAVE, TryCatch #3 {all -> 0x01cb, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x016f, B:40:0x0171, B:43:0x0177, B:45:0x017d, B:46:0x0184, B:48:0x0188, B:49:0x01b4, B:51:0x01b8, B:52:0x01bc, B:57:0x01ca, B:41:0x0172, B:42:0x0176), top: B:63:0x0017, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0188, please report this as an issue */
    public static /* synthetic */ void a(final F f8, Context context, final Executor executor, final int i8, final F1.c.a aVar, final long j8) {
        z0.c cVarE;
        f8.getClass();
        E2.a.a("CX:initAndRetryRecursively");
        final Context contextA = I.e.a(context);
        try {
            try {
                H.H.a aVarH0 = f8.f40c.h0(null);
                if (aVarH0 == null) {
                    throw new C0886n0(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                }
                AbstractC0972c0 abstractC0972c0A = AbstractC0972c0.a(f8.f41d, f8.f42e);
                C0900v c0900vF0 = f8.f40c.f0(null);
                long jI0 = f8.f40c.i0();
                v1.c cVarO0 = f8.f40c.o0(null);
                if (cVarO0 == null) {
                    throw new C0886n0(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                f8.f46i = cVarO0.a(contextA);
                L.n nVar = new L.n(f8.f46i, null);
                f8.f47j = nVar;
                f8.f44g = aVarH0.a(contextA, abstractC0972c0A, c0900vF0, jI0, f8.f40c, nVar);
                H.G.a aVarL0 = f8.f40c.l0(null);
                if (aVarL0 == null) {
                    throw new C0886n0(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                }
                H.G gA = aVarL0.a(contextA, f8.f44g.a(), f8.f44g.c());
                f8.f45h = gA;
                f8.f47j.b(gA);
                if (executor instanceof ExecutorC0891q) {
                    ((ExecutorC0891q) executor).e(f8.f44g);
                }
                f8.f38a.n(f8.f44g);
                B.a aVarF = f8.f44g.f();
                aVarF.a(f8.f38a);
                f8.f48k = new C0906z(f8.f38a, aVarF, f8.f46i, f8.f47j);
                Iterator it = f8.f38a.m().iterator();
                while (it.hasNext()) {
                    ((H.J) it.next()).r().r(f8.f48k);
                }
                f8.f51n.A(f8.f44g, f8.f38a);
                f8.f51n.k(f8.f45h);
                f8.f51n.k(f8.f44g.f());
                AbstractC0976e0.a(contextA, f8.f38a, c0900vF0);
                if (i8 > 1) {
                    f8.s(null);
                }
                f8.p();
                aVar.c(null);
                E2.a.b();
            } catch (Throwable th) {
                E2.a.b();
                throw th;
            }
        } catch (C0886n0 e8) {
            e = e8;
            H.U u8 = new H.U(j8, i8, e);
            cVarE = f8.f49l.e(u8);
            f8.s(u8);
            f8.f51n.z();
            if (cVarE.d() || i8 >= Integer.MAX_VALUE) {
                synchronized (f8.f39b) {
                    f8.f52o = a.INITIALIZING_ERROR;
                }
                if (cVarE.c()) {
                    f8.p();
                    aVar.c(null);
                } else if (e instanceof AbstractC0976e0.b) {
                    String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((AbstractC0976e0.b) e).a();
                    AbstractC0890p0.d("CameraX", str, e);
                    aVar.f(new C0886n0(new C0904x(3, str)));
                } else if (e instanceof C0886n0) {
                    aVar.f(e);
                } else {
                    aVar.f(new C0886n0(e));
                }
            } else {
                AbstractC0890p0.m("CameraX", "Retry init. Start time " + j8 + " current time " + SystemClock.elapsedRealtime(), e);
                P1.f.b(f8.f42e, new Runnable() { // from class: A.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11a.n(executor, j8, i8 + 1, contextA, aVar);
                    }
                }, "retry_token", cVarE.b());
            }
            E2.a.b();
        } catch (AbstractC0976e0.b e9) {
            e = e9;
            H.U u9 = new H.U(j8, i8, e);
            cVarE = f8.f49l.e(u9);
            f8.s(u9);
            f8.f51n.z();
            if (cVarE.d()) {
                synchronized (f8.f39b) {
                    f8.f52o = a.INITIALIZING_ERROR;
                    if (cVarE.c()) {
                        f8.p();
                        aVar.c(null);
                    } else if (e instanceof AbstractC0976e0.b) {
                        String str2 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((AbstractC0976e0.b) e).a();
                        AbstractC0890p0.d("CameraX", str2, e);
                        aVar.f(new C0886n0(new C0904x(3, str2)));
                    } else if (e instanceof C0886n0) {
                        aVar.f(e);
                    } else {
                        aVar.f(new C0886n0(e));
                    }
                }
            } else {
                synchronized (f8.f39b) {
                    f8.f52o = a.INITIALIZING_ERROR;
                    if (cVarE.c()) {
                        f8.p();
                        aVar.c(null);
                    } else if (e instanceof AbstractC0976e0.b) {
                        String str3 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((AbstractC0976e0.b) e).a();
                        AbstractC0890p0.d("CameraX", str3, e);
                        aVar.f(new C0886n0(new C0904x(3, str3)));
                    } else if (e instanceof C0886n0) {
                        aVar.f(e);
                    } else {
                        aVar.f(new C0886n0(e));
                    }
                }
            }
            E2.a.b();
        } catch (RuntimeException e10) {
            e = e10;
            H.U u10 = new H.U(j8, i8, e);
            cVarE = f8.f49l.e(u10);
            f8.s(u10);
            f8.f51n.z();
            if (cVarE.d()) {
                synchronized (f8.f39b) {
                    f8.f52o = a.INITIALIZING_ERROR;
                    if (cVarE.c()) {
                        f8.p();
                        aVar.c(null);
                    } else if (e instanceof AbstractC0976e0.b) {
                        String str4 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((AbstractC0976e0.b) e).a();
                        AbstractC0890p0.d("CameraX", str4, e);
                        aVar.f(new C0886n0(new C0904x(3, str4)));
                    } else if (e instanceof C0886n0) {
                        aVar.f(e);
                    } else {
                        aVar.f(new C0886n0(e));
                    }
                }
            } else {
                synchronized (f8.f39b) {
                    f8.f52o = a.INITIALIZING_ERROR;
                    if (cVarE.c()) {
                        f8.p();
                        aVar.c(null);
                    } else if (e instanceof AbstractC0976e0.b) {
                        String str5 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((AbstractC0976e0.b) e).a();
                        AbstractC0890p0.d("CameraX", str5, e);
                        aVar.f(new C0886n0(new C0904x(3, str5)));
                    } else if (e instanceof C0886n0) {
                        aVar.f(e);
                    } else {
                        aVar.f(new C0886n0(e));
                    }
                }
            }
            E2.a.b();
        }
    }

    public static /* synthetic */ void b(F f8, F1.c.a aVar) {
        f8.f44g.shutdown();
        if (f8.f43f != null) {
            Executor executor = f8.f41d;
            if (executor instanceof ExecutorC0891q) {
                ((ExecutorC0891q) executor).d();
            }
            f8.f43f.quit();
        }
        aVar.c(null);
    }

    public static /* synthetic */ Object c(F f8, Context context, F1.c.a aVar) {
        f8.n(f8.f41d, SystemClock.elapsedRealtime(), 1, context, aVar);
        return "CameraX initInternal";
    }

    public static /* synthetic */ Object d(final F f8, final F1.c.a aVar) {
        f8.f51n.z();
        f8.f38a.k().a(new Runnable() { // from class: A.E
            @Override // java.lang.Runnable
            public final void run() {
                F.b(this.f29a, aVar);
            }
        }, f8.f41d);
        return "CameraX shutdownInternal";
    }

    public static void f(Integer num) {
        synchronized (f36s) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = f37t;
                int iIntValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                t();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static G.b k(Context context) {
        ComponentCallbacks2 componentCallbacks2B = I.e.b(context);
        if (componentCallbacks2B instanceof G.b) {
            return (G.b) componentCallbacks2B;
        }
        try {
            Context contextA = I.e.a(context);
            Bundle bundle = contextA.getPackageManager().getServiceInfo(new ComponentName(contextA, (Class<?>) MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (G.b) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
            AbstractC0890p0.c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException e8) {
            e = e8;
            AbstractC0890p0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e9) {
            e = e9;
            AbstractC0890p0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e10) {
            e = e10;
            AbstractC0890p0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e11) {
            e = e11;
            AbstractC0890p0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e12) {
            e = e12;
            AbstractC0890p0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e13) {
            e = e13;
            AbstractC0890p0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e14) {
            e = e14;
            AbstractC0890p0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    public static void m(Integer num) {
        synchronized (f36s) {
            try {
                if (num == null) {
                    return;
                }
                T1.f.c(num.intValue(), 3, 6, "minLogLevel");
                SparseArray sparseArray = f37t;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + ((Integer) sparseArray.get(num.intValue())).intValue() : 1));
                t();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void t() {
        SparseArray sparseArray = f37t;
        if (sparseArray.size() == 0) {
            AbstractC0890p0.i();
            return;
        }
        if (sparseArray.get(3) != null) {
            AbstractC0890p0.j(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            AbstractC0890p0.j(4);
        } else if (sparseArray.get(5) != null) {
            AbstractC0890p0.j(5);
        } else if (sparseArray.get(6) != null) {
            AbstractC0890p0.j(6);
        }
    }

    public static void u(Context context, H.W0 w8, p142q.a aVar) {
        if (w8 != null) {
            AbstractC0890p0.a("CameraX", "QuirkSettings from CameraXConfig: " + w8);
        } else {
            w8 = (H.W0) aVar.apply(context);
            AbstractC0890p0.a("CameraX", "QuirkSettings from app metadata: " + w8);
        }
        if (w8 == null) {
            w8 = X0.f2917b;
            AbstractC0890p0.a("CameraX", "QuirkSettings by default: " + w8);
        }
        X0.b().d(w8);
    }

    public H.H g() {
        H.H h8 = this.f44g;
        if (h8 != null) {
            return h8;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public H.Y h() {
        return this.f38a;
    }

    public int j() {
        return this.f55r;
    }

    public Y4.a l() {
        return this.f50m;
    }

    public final void n(final Executor executor, final long j8, final int i8, final Context context, final F1.c.a aVar) {
        executor.execute(new Runnable() { // from class: A.B
            @Override // java.lang.Runnable
            public final void run() {
                F.a(this.f3a, context, executor, i8, aVar, j8);
            }
        });
    }

    public final Y4.a o(final Context context) {
        Y4.a aVarA;
        synchronized (this.f39b) {
            T1.f.j(this.f52o == a.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f52o = a.INITIALIZING;
            aVarA = F1.c.a(new F1.c.InterfaceC0112c() { // from class: A.A
                @Override // F1.c.InterfaceC0112c
                public final Object a(F1.c.a aVar) {
                    return F.c(this.f0a, context, aVar);
                }
            });
        }
        return aVarA;
    }

    public final void p() {
        synchronized (this.f39b) {
            this.f52o = a.INITIALIZED;
        }
    }

    public Y4.a q() {
        return r();
    }

    public final Y4.a r() {
        synchronized (this.f39b) {
            try {
                this.f42e.removeCallbacksAndMessages("retry_token");
                int iOrdinal = this.f52o.ordinal();
                if (iOrdinal == 0) {
                    this.f52o = a.SHUTDOWN;
                    return K.n.p(null);
                }
                if (iOrdinal == 1) {
                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                }
                if (iOrdinal == 2 || iOrdinal == 3) {
                    this.f52o = a.SHUTDOWN;
                    f(this.f54q);
                    this.f53p = F1.c.a(new F1.c.InterfaceC0112c() { // from class: A.D
                        @Override // F1.c.InterfaceC0112c
                        public final Object a(F1.c.a aVar) {
                            return F.d(this.f17a, aVar);
                        }
                    });
                }
                return this.f53p;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(z0.b bVar) {
        if (E2.a.d()) {
            E2.a.f("CX:CameraProvider-RetryStatus", bVar != null ? bVar.a() : -1);
        }
    }

    public F(Context context, G.b bVar, p142q.a aVar) {
        this.f38a = new H.Y();
        this.f39b = new Object();
        this.f52o = a.UNINITIALIZED;
        this.f53p = K.n.p(null);
        if (bVar != null) {
            this.f40c = bVar.getCameraXConfig();
        } else {
            G.b bVarK = k(context);
            if (bVarK == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.f40c = bVarK.getCameraXConfig();
        }
        u(context, this.f40c.m0(), aVar);
        this.f55r = this.f40c.k0();
        Executor executorG0 = this.f40c.g0(null);
        Handler handlerN0 = this.f40c.n0(null);
        executorG0 = executorG0 == null ? new ExecutorC0891q() : executorG0;
        this.f41d = executorG0;
        if (handlerN0 == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f43f = handlerThread;
            handlerThread.start();
            this.f42e = P1.f.a(handlerThread.getLooper());
        } else {
            this.f43f = null;
            this.f42e = handlerN0;
        }
        Integer num = (Integer) this.f40c.f(G.f68V, null);
        this.f54q = num;
        m(num);
        this.f49l = new z0.a(this.f40c.j0()).a();
        this.f51n = new H.T(executorG0);
        this.f50m = o(context);
    }

    public InterfaceC0905y i() {
        InterfaceC0905y interfaceC0905y = this.f48k;
        if (interfaceC0905y != null) {
            return interfaceC0905y;
        }
        throw new IllegalStateException(RaiWHuj.rdSECL);
    }
}
