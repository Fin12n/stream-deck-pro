package p211y4;

import K4.h;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import p195w4.b;
import p195w4.d;
import p201x2.vAk.kDsnNkYbBsI;
import p203x4.a;
import p219z4.AbstractC3194c;
import p219z4.AbstractC3199h;
import p219z4.AbstractC3207p;
import p219z4.InterfaceC3201j;

/* JADX INFO: renamed from: y4.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class ServiceConnectionC3108i implements a.f, ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComponentName f38393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f38394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3103d f38395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f38396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3109j f38397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IBinder f38398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f38399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f38400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f38401k;

    public ServiceConnectionC3108i(Context context, Looper looper, ComponentName componentName, InterfaceC3103d interfaceC3103d, InterfaceC3109j interfaceC3109j) {
        this(context, looper, null, null, componentName, interfaceC3103d, interfaceC3109j);
    }

    @Override // x4.a.f
    public final boolean a() {
        s();
        return this.f38398h != null;
    }

    @Override // x4.a.f
    public final void b(AbstractC3194c.InterfaceC0857c interfaceC0857c) {
        s();
        String.valueOf(this.f38398h);
        if (a()) {
            try {
                f("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f38393c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f38391a).setAction(this.f38392b);
            }
            boolean zBindService = this.f38394d.bindService(intent, this, AbstractC3199h.a());
            this.f38399i = zBindService;
            if (!zBindService) {
                this.f38398h = null;
                this.f38397g.c(new b(16));
            }
            String.valueOf(this.f38398h);
        } catch (SecurityException e8) {
            this.f38399i = false;
            this.f38398h = null;
            throw e8;
        }
    }

    @Override // x4.a.f
    public final Set d() {
        return Collections.EMPTY_SET;
    }

    @Override // x4.a.f
    public final void e(InterfaceC3201j interfaceC3201j, Set set) {
    }

    @Override // x4.a.f
    public final void f(String str) {
        s();
        this.f38400j = str;
        i();
    }

    @Override // x4.a.f
    public final boolean g() {
        s();
        return this.f38399i;
    }

    @Override // x4.a.f
    public final String h() {
        String str = this.f38391a;
        if (str != null) {
            return str;
        }
        AbstractC3207p.k(this.f38393c);
        return this.f38393c.getPackageName();
    }

    @Override // x4.a.f
    public final void i() {
        s();
        String.valueOf(this.f38398h);
        try {
            this.f38394d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f38399i = false;
        this.f38398h = null;
    }

    @Override // x4.a.f
    public final boolean j() {
        return false;
    }

    @Override // x4.a.f
    public final int k() {
        return 0;
    }

    @Override // x4.a.f
    public final d[] l() {
        return new d[0];
    }

    @Override // x4.a.f
    public final void m(AbstractC3194c.e eVar) {
    }

    @Override // x4.a.f
    public final String n() {
        return this.f38400j;
    }

    @Override // x4.a.f
    public final boolean o() {
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f38396f.post(new Runnable() { // from class: y4.N
            @Override // java.lang.Runnable
            public final void run() {
                this.f38314a.q(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f38396f.post(new Runnable() { // from class: y4.M
            @Override // java.lang.Runnable
            public final void run() {
                this.f38313a.p();
            }
        });
    }

    public final /* synthetic */ void p() {
        this.f38399i = false;
        this.f38398h = null;
        this.f38395e.a(1);
    }

    public final /* synthetic */ void q(IBinder iBinder) {
        this.f38399i = false;
        this.f38398h = iBinder;
        String.valueOf(iBinder);
        this.f38395e.d(new Bundle());
    }

    public final void r(String str) {
        this.f38401k = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r6 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ServiceConnectionC3108i(Context context, Looper looper, String str, String str2, ComponentName componentName, InterfaceC3103d interfaceC3103d, InterfaceC3109j interfaceC3109j) {
        this.f38399i = false;
        this.f38400j = null;
        this.f38394d = context;
        this.f38396f = new h(looper);
        this.f38395e = interfaceC3103d;
        this.f38397g = interfaceC3109j;
        if (str != null && str2 != null) {
            if (componentName == null) {
                componentName = null;
                this.f38391a = str;
                this.f38392b = str2;
                this.f38393c = componentName;
                return;
            }
            throw new AssertionError("Must specify either package or component, but not both");
        }
    }

    public final void s() {
        if (Thread.currentThread() != this.f38396f.getLooper().getThread()) {
            throw new IllegalStateException(kDsnNkYbBsI.NVZvWbQZHzzmR);
        }
    }

    public ServiceConnectionC3108i(Context context, Looper looper, String str, String str2, InterfaceC3103d interfaceC3103d, InterfaceC3109j interfaceC3109j) {
        this(context, looper, str, str2, null, interfaceC3103d, interfaceC3109j);
    }
}
