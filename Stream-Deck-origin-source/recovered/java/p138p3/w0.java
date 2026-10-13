package p138p3;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2780o f31222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W f31223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v0 f31224d = new v0(this, true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v0 f31225e = new v0(this, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f31226f;

    public w0(Context context, InterfaceC2780o interfaceC2780o, InterfaceC2768d0 interfaceC2768d0, T t8, r rVar, W w8) {
        this.f31221a = context;
        this.f31222b = interfaceC2780o;
        this.f31223c = w8;
    }

    public static /* bridge */ /* synthetic */ T a(w0 w0Var) {
        w0Var.getClass();
        return null;
    }

    public static /* bridge */ /* synthetic */ r e(w0 w0Var) {
        w0Var.getClass();
        return null;
    }

    public final InterfaceC2780o d() {
        return this.f31222b;
    }

    public final void f() {
        this.f31224d.c(this.f31221a);
        this.f31225e.c(this.f31221a);
    }

    public final void g(boolean z8) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f31226f = z8;
        this.f31225e.a(this.f31221a, intentFilter2);
        if (this.f31226f) {
            this.f31224d.b(this.f31221a, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f31224d.a(this.f31221a, intentFilter);
        }
    }
}
