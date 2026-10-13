package p009b;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.InterfaceC1733p;
import androidx.lifecycle.T;
import androidx.lifecycle.r;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p217z2.d;
import p217z2.e;
import p217z2.f;
import p217z2.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class q extends Dialog implements InterfaceC1733p, F, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f15548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f15549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f15550c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(Context context) {
        this(context, 0, 2, null);
        t.g(context, "context");
    }

    public static final void f(q this$0) {
        t.g(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t.g(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // p009b.F
    public final C b() {
        return this.f15550c;
    }

    public final r c() {
        r rVar = this.f15548a;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(this);
        this.f15548a = rVar2;
        return rVar2;
    }

    public void d() {
        Window window = getWindow();
        t.d(window);
        View decorView = window.getDecorView();
        t.f(decorView, "window!!.decorView");
        T.b(decorView, this);
        Window window2 = getWindow();
        t.d(window2);
        View decorView2 = window2.getDecorView();
        t.f(decorView2, "window!!.decorView");
        J.b(decorView2, this);
        Window window3 = getWindow();
        t.d(window3);
        View decorView3 = window3.getDecorView();
        t.f(decorView3, "window!!.decorView");
        g.b(decorView3, this);
    }

    @Override // p217z2.f
    public d l() {
        return this.f15549b.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f15550c.l();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C c8 = this.f15550c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            t.f(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            c8.o(onBackInvokedDispatcher);
        }
        this.f15549b.d(bundle);
        c().i(AbstractC1726i.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        t.f(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f15549b.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        c().i(AbstractC1726i.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        c().i(AbstractC1726i.a.ON_DESTROY);
        this.f15548a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i8) {
        d();
        super.setContentView(i8);
    }

    @Override // androidx.lifecycle.InterfaceC1733p
    public AbstractC1726i w() {
        return c();
    }

    public /* synthetic */ q(Context context, int i8, int i9, AbstractC2633k abstractC2633k) {
        this(context, (i9 & 2) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, int i8) {
        super(context, i8);
        t.g(context, "context");
        this.f15549b = e.f39070d.a(this);
        this.f15550c = new C(new Runnable() { // from class: b.p
            @Override // java.lang.Runnable
            public final void run() {
                q.f(this.f15547a);
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        t.g(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t.g(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
