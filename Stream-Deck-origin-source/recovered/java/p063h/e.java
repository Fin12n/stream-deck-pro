package p063h;

import P1.g;
import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;
import p010b0.C1749b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f23887a = new c(new d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f23888b = -100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static g f23889c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static g f23890d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f23891e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f23892f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1749b f23893g = new C1749b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f23894h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f23895i = new Object();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f23896a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Queue f23897b = new ArrayDeque();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Executor f23898c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Runnable f23899d;

        public c(Executor executor) {
            this.f23898c = executor;
        }

        public static /* synthetic */ void a(c cVar, Runnable runnable) {
            cVar.getClass();
            try {
                runnable.run();
            } finally {
                cVar.b();
            }
        }

        public void b() {
            synchronized (this.f23896a) {
                try {
                    Runnable runnable = (Runnable) this.f23897b.poll();
                    this.f23899d = runnable;
                    if (runnable != null) {
                        this.f23898c.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f23896a) {
                try {
                    this.f23897b.add(new Runnable() { // from class: h.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.c.a(this.f23900a, runnable);
                        }
                    });
                    if (this.f23899d == null) {
                        b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static void D(e eVar) {
        synchronized (f23894h) {
            E(eVar);
        }
    }

    public static void E(e eVar) {
        synchronized (f23894h) {
            try {
                Iterator it = f23893g.iterator();
                while (it.hasNext()) {
                    e eVar2 = (e) ((WeakReference) it.next()).get();
                    if (eVar2 == eVar || eVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void N(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (k().f()) {
                    String strB = H1.c.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(strB));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    public static void O(final Context context) {
        if (u(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f23892f) {
                    return;
                }
                f23887a.execute(new Runnable() { // from class: h.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.c(context);
                    }
                });
                return;
            }
            synchronized (f23895i) {
                try {
                    g gVar = f23889c;
                    if (gVar == null) {
                        if (f23890d == null) {
                            f23890d = g.b(H1.c.b(context));
                        }
                        if (f23890d.f()) {
                        } else {
                            f23889c = f23890d;
                        }
                    } else if (!gVar.equals(f23890d)) {
                        g gVar2 = f23889c;
                        f23890d = gVar2;
                        H1.c.a(context, gVar2.h());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static /* synthetic */ void c(Context context) {
        N(context);
        f23892f = true;
    }

    public static void d(e eVar) {
        synchronized (f23894h) {
            E(eVar);
            f23893g.add(new WeakReference(eVar));
        }
    }

    public static e h(Activity activity, p063h.c cVar) {
        return new g(activity, cVar);
    }

    public static e i(Dialog dialog, p063h.c cVar) {
        return new g(dialog, cVar);
    }

    public static g k() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objO = o();
            if (objO != null) {
                return g.j(b.a(objO));
            }
        } else {
            g gVar = f23889c;
            if (gVar != null) {
                return gVar;
            }
        }
        return g.e();
    }

    public static int m() {
        return f23888b;
    }

    public static Object o() {
        Context contextL;
        Iterator it = f23893g.iterator();
        while (it.hasNext()) {
            e eVar = (e) ((WeakReference) it.next()).get();
            if (eVar != null && (contextL = eVar.l()) != null) {
                return contextL.getSystemService("locale");
            }
        }
        return null;
    }

    public static g q() {
        return f23889c;
    }

    public static boolean u(Context context) {
        if (f23891e == null) {
            try {
                Bundle bundle = n.a(context).metaData;
                if (bundle != null) {
                    f23891e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f23891e = Boolean.FALSE;
            }
        }
        return f23891e.booleanValue();
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C();

    public abstract boolean F(int i8);

    public abstract void G(int i8);

    public abstract void H(View view);

    public abstract void I(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void J(int i8);

    public abstract void L(int i8);

    public abstract void M(CharSequence charSequence);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public Context g(Context context) {
        f(context);
        return context;
    }

    public abstract View j(int i8);

    public abstract Context l();

    public abstract int n();

    public abstract MenuInflater p();

    public abstract p063h.a r();

    public abstract void s();

    public abstract void t();

    public abstract void v(Configuration configuration);

    public abstract void w(Bundle bundle);

    public abstract void x();

    public abstract void y(Bundle bundle);

    public abstract void z();

    public void K(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void f(Context context) {
    }
}
