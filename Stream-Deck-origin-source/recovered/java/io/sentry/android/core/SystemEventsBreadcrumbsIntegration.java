package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.pairip.VMRunner;
import io.sentry.C2491e;
import io.sentry.EnumC2596z2;
import io.sentry.InterfaceC2480b0;
import io.sentry.InterfaceC2516k0;
import io.sentry.J2;
import io.sentry.util.C2569a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class SystemEventsBreadcrumbsIntegration implements InterfaceC2516k0, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f26260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f26261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f26262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2569a f26264f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.sentry.X f26265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SentryAndroidOptions f26266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final io.sentry.android.core.internal.util.h f26267c = new io.sentry.android.core.internal.util.h(io.sentry.android.core.internal.util.b.a(), 60000, 0);

        public a(io.sentry.X x8, SentryAndroidOptions sentryAndroidOptions) {
            this.f26265a = x8;
            this.f26266b = sentryAndroidOptions;
        }

        public static /* synthetic */ void a(a aVar, long j8, Intent intent, String str, boolean z8) {
            C2491e c2491eB = aVar.b(j8, intent, str, z8);
            io.sentry.H h8 = new io.sentry.H();
            h8.k("android:intent", intent);
            aVar.f26265a.e(c2491eB, h8);
        }

        public final C2491e b(long j8, Intent intent, String str, boolean z8) {
            C2491e c2491e = new C2491e(j8);
            c2491e.C("system");
            c2491e.y("device.event");
            String strD = io.sentry.util.B.d(str);
            if (strD != null) {
                c2491e.z("action", strD);
            }
            if (z8) {
                Float fC = d0.c(intent, this.f26266b);
                if (fC != null) {
                    c2491e.z("level", fC);
                }
                Boolean boolT = d0.t(intent, this.f26266b);
                if (boolT != null) {
                    c2491e.z("charging", boolT);
                }
            } else {
                Bundle extras = intent.getExtras();
                HashMap map = new HashMap();
                if (extras != null && !extras.isEmpty()) {
                    for (String str2 : extras.keySet()) {
                        try {
                            Object obj = extras.get(str2);
                            if (obj != null) {
                                map.put(str2, obj.toString());
                            }
                        } catch (Throwable th) {
                            this.f26266b.getLogger().a(EnumC2596z2.ERROR, th, "%s key of the %s action threw an error.", str2, str);
                        }
                    }
                    c2491e.z("extras", map);
                }
            }
            c2491e.A(EnumC2596z2.INFO);
            return c2491e;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VMRunner.invoke("VsOX3ydCLkpco00D", new Object[]{this, context, intent});
        }
    }

    public SystemEventsBreadcrumbsIntegration(Context context) {
        this(context, c());
    }

    public static /* synthetic */ void b(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, io.sentry.X x8, J2 j8) {
        InterfaceC2480b0 interfaceC2480b0A = systemEventsBreadcrumbsIntegration.f26264f.a();
        try {
            if (!systemEventsBreadcrumbsIntegration.f26263e) {
                systemEventsBreadcrumbsIntegration.j(x8, (SentryAndroidOptions) j8);
            }
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static List c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.intent.action.ACTION_SHUTDOWN");
        arrayList.add("android.intent.action.AIRPLANE_MODE");
        arrayList.add("android.intent.action.BATTERY_CHANGED");
        arrayList.add("android.intent.action.CAMERA_BUTTON");
        arrayList.add("android.intent.action.CONFIGURATION_CHANGED");
        arrayList.add("android.intent.action.DATE_CHANGED");
        arrayList.add("android.intent.action.DEVICE_STORAGE_LOW");
        arrayList.add("android.intent.action.DEVICE_STORAGE_OK");
        arrayList.add("android.intent.action.DOCK_EVENT");
        arrayList.add("android.intent.action.DREAMING_STARTED");
        arrayList.add("android.intent.action.DREAMING_STOPPED");
        arrayList.add("android.intent.action.INPUT_METHOD_CHANGED");
        arrayList.add("android.intent.action.LOCALE_CHANGED");
        arrayList.add("android.intent.action.SCREEN_OFF");
        arrayList.add("android.intent.action.SCREEN_ON");
        arrayList.add("android.intent.action.TIMEZONE_CHANGED");
        arrayList.add("android.intent.action.TIME_SET");
        arrayList.add("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        arrayList.add("android.os.action.POWER_SAVE_MODE_CHANGED");
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC2480b0 interfaceC2480b0A = this.f26264f.a();
        try {
            this.f26263e = true;
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            a aVar = this.f26260b;
            if (aVar != null) {
                this.f26259a.unregisterReceiver(aVar);
                this.f26260b = null;
                SentryAndroidOptions sentryAndroidOptions = this.f26261c;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().c(EnumC2596z2.DEBUG, "SystemEventsBreadcrumbsIntegration remove.", new Object[0]);
                }
            }
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final void j(io.sentry.X x8, SentryAndroidOptions sentryAndroidOptions) {
        this.f26260b = new a(x8, sentryAndroidOptions);
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = this.f26262d.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        try {
            Z.v(this.f26259a, sentryAndroidOptions, this.f26260b, intentFilter);
            sentryAndroidOptions.getLogger().c(EnumC2596z2.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
            io.sentry.util.o.a("SystemEventsBreadcrumbs");
        } catch (Throwable th) {
            sentryAndroidOptions.setEnableSystemEventBreadcrumbs(false);
            sentryAndroidOptions.getLogger().b(EnumC2596z2.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th);
        }
    }

    @Override // io.sentry.InterfaceC2516k0
    public void o(final io.sentry.X x8, final J2 j8) {
        io.sentry.util.u.c(x8, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.u.c(j8 instanceof SentryAndroidOptions ? (SentryAndroidOptions) j8 : null, "SentryAndroidOptions is required");
        this.f26261c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().c(EnumC2596z2.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f26261c.isEnableSystemEventBreadcrumbs()));
        if (this.f26261c.isEnableSystemEventBreadcrumbs()) {
            try {
                j8.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.A0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SystemEventsBreadcrumbsIntegration.b(this.f26080a, x8, j8);
                    }
                });
            } catch (Throwable th) {
                j8.getLogger().b(EnumC2596z2.DEBUG, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", th);
            }
        }
    }

    public SystemEventsBreadcrumbsIntegration(Context context, List<String> list) {
        this.f26263e = false;
        this.f26264f = new C2569a();
        this.f26259a = (Context) io.sentry.util.u.c(Z.h(context), "Context is required");
        this.f26262d = (List) io.sentry.util.u.c(list, "Actions list is required");
    }
}
