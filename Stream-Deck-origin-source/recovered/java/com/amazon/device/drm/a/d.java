package com.amazon.device.drm.a;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.amazon.device.drm.LicensingListener;
import com.amazon.device.drm.model.AppstoreSDKModes;
import com.amazon.device.drm.model.RequestId;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f17043a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static d f17044b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f17045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f17046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LicensingListener f17047e;

    private d() {
    }

    public static d d() {
        return f17044b;
    }

    private void f() {
        if (this.f17047e == null) {
            throw new IllegalStateException("You must register a PurchasingListener before invoking this operation");
        }
    }

    private void g() {
        if (this.f17046d == null) {
            throw new IllegalStateException("You must register a ApplicationContext before invoking this operation");
        }
    }

    public void a(Context context, LicensingListener licensingListener) {
        if (licensingListener == null || context == null) {
            throw new IllegalArgumentException("LicensingManager/Context cannot be null");
        }
        com.amazon.device.drm.a.e.b.a(f17043a, "LicensingListener registered: " + licensingListener);
        com.amazon.device.drm.a.e.b.a(f17043a, "LicensingListener Context: " + context);
        this.f17046d = context.getApplicationContext();
        this.f17047e = licensingListener;
        c cVarA = a.a().a(this.f17046d);
        this.f17045c = cVarA;
        if (cVarA == null) {
            com.amazon.device.drm.a.e.b.a(f17043a, "requestHandler is null");
        }
    }

    public LicensingListener b() {
        return this.f17047e;
    }

    public Context c() {
        return this.f17046d;
    }

    public RequestId e() {
        f();
        RequestId requestId = new RequestId();
        this.f17045c.a(requestId);
        return requestId;
    }

    public String a() {
        try {
            g();
            if (com.amazon.a.a.a((Application) this.f17046d.getApplicationContext())) {
                return AppstoreSDKModes.SANDBOX.name();
            }
            return AppstoreSDKModes.PRODUCTION.name();
        } catch (IllegalStateException unused) {
            return AppstoreSDKModes.UNKNOWN.name();
        }
    }

    public void a(Context context, Intent intent) {
        try {
            this.f17045c.a(context, intent);
        } catch (Exception e8) {
            com.amazon.device.drm.a.e.b.b(f17043a, "Error in onReceive: " + e8);
        }
    }
}
