package p111m2;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.InterfaceC1733p;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.y;
import p009b.q;
import p027d.LrLN.vHKCAgr;
import p217z2.g;

/* JADX INFO: renamed from: m2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC2680e extends ComponentCallbacksC2681f implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f29815A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public boolean f29816B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f29817C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public boolean f29818D0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Handler f29819o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Runnable f29820p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f29821q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public DialogInterface.OnDismissListener f29822r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f29823s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f29824t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f29825u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f29826v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f29827w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f29828x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public y f29829y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public Dialog f29830z0;

    /* JADX INFO: renamed from: m2.e$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnCancelListenerC2680e.this.f29822r0.onDismiss(DialogInterfaceOnCancelListenerC2680e.this.f29830z0);
        }
    }

    /* JADX INFO: renamed from: m2.e$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC2680e.this.f29830z0 != null) {
                DialogInterfaceOnCancelListenerC2680e dialogInterfaceOnCancelListenerC2680e = DialogInterfaceOnCancelListenerC2680e.this;
                dialogInterfaceOnCancelListenerC2680e.onCancel(dialogInterfaceOnCancelListenerC2680e.f29830z0);
            }
        }
    }

    /* JADX INFO: renamed from: m2.e$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC2680e.this.f29830z0 != null) {
                DialogInterfaceOnCancelListenerC2680e dialogInterfaceOnCancelListenerC2680e = DialogInterfaceOnCancelListenerC2680e.this;
                dialogInterfaceOnCancelListenerC2680e.onDismiss(dialogInterfaceOnCancelListenerC2680e.f29830z0);
            }
        }
    }

    /* JADX INFO: renamed from: m2.e$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d implements y {
        public d() {
        }

        @Override // androidx.lifecycle.y
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC1733p interfaceC1733p) {
            if (interfaceC1733p == null || !DialogInterfaceOnCancelListenerC2680e.this.f29826v0) {
                return;
            }
            View viewP1 = DialogInterfaceOnCancelListenerC2680e.this.p1();
            if (viewP1.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC2680e.this.f29830z0 != null) {
                if (y.E0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC2680e.this.f29830z0);
                }
                DialogInterfaceOnCancelListenerC2680e.this.f29830z0.setContentView(viewP1);
            }
        }
    }

    /* JADX INFO: renamed from: m2.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class C0647e extends AbstractC2688m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC2688m f29835a;

        public C0647e(AbstractC2688m abstractC2688m) {
            this.f29835a = abstractC2688m;
        }

        @Override // p111m2.AbstractC2688m
        public View f(int i8) {
            return this.f29835a.g() ? this.f29835a.f(i8) : DialogInterfaceOnCancelListenerC2680e.this.I1(i8);
        }

        @Override // p111m2.AbstractC2688m
        public boolean g() {
            return this.f29835a.g() || DialogInterfaceOnCancelListenerC2680e.this.J1();
        }
    }

    public DialogInterfaceOnCancelListenerC2680e() {
        this.f29820p0 = new a();
        this.f29821q0 = new b();
        this.f29822r0 = new c();
        this.f29823s0 = 0;
        this.f29824t0 = 0;
        this.f29825u0 = true;
        this.f29826v0 = true;
        this.f29827w0 = -1;
        this.f29829y0 = new d();
        this.f29818D0 = false;
    }

    public final void F1(boolean z8, boolean z9, boolean z10) {
        if (this.f29816B0) {
            return;
        }
        this.f29816B0 = true;
        this.f29817C0 = false;
        Dialog dialog = this.f29830z0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f29830z0.dismiss();
            if (!z9) {
                if (Looper.myLooper() == this.f29819o0.getLooper()) {
                    onDismiss(this.f29830z0);
                } else {
                    this.f29819o0.post(this.f29820p0);
                }
            }
        }
        this.f29815A0 = true;
        if (this.f29827w0 >= 0) {
            if (z10) {
                H().T0(this.f29827w0, 1);
            } else {
                H().R0(this.f29827w0, 1, z8);
            }
            this.f29827w0 = -1;
            return;
        }
        G gM = H().m();
        gM.m(true);
        gM.l(this);
        if (z10) {
            gM.h();
        } else if (z8) {
            gM.g();
        } else {
            gM.f();
        }
    }

    public int G1() {
        return this.f29824t0;
    }

    public Dialog H1(Bundle bundle) {
        if (y.E0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new q(o1(), G1());
    }

    public View I1(int i8) {
        Dialog dialog = this.f29830z0;
        if (dialog != null) {
            return dialog.findViewById(i8);
        }
        return null;
    }

    @Override // p111m2.ComponentCallbacksC2681f
    public void J0(Bundle bundle) {
        super.J0(bundle);
        Dialog dialog = this.f29830z0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i8 = this.f29823s0;
        if (i8 != 0) {
            bundle.putInt("android:style", i8);
        }
        int i9 = this.f29824t0;
        if (i9 != 0) {
            bundle.putInt("android:theme", i9);
        }
        boolean z8 = this.f29825u0;
        if (!z8) {
            bundle.putBoolean("android:cancelable", z8);
        }
        boolean z9 = this.f29826v0;
        if (!z9) {
            bundle.putBoolean("android:showsDialog", z9);
        }
        int i10 = this.f29827w0;
        if (i10 != -1) {
            bundle.putInt("android:backStackId", i10);
        }
    }

    public boolean J1() {
        return this.f29818D0;
    }

    @Override // p111m2.ComponentCallbacksC2681f
    public void K0() {
        super.K0();
        Dialog dialog = this.f29830z0;
        if (dialog != null) {
            this.f29815A0 = false;
            dialog.show();
            View decorView = this.f29830z0.getWindow().getDecorView();
            T.b(decorView, this);
            U.b(decorView, this);
            g.b(decorView, this);
        }
    }

    public final void K1(Bundle bundle) {
        if (this.f29826v0 && !this.f29818D0) {
            try {
                this.f29828x0 = true;
                Dialog dialogH1 = H1(bundle);
                this.f29830z0 = dialogH1;
                if (this.f29826v0) {
                    M1(dialogH1, this.f29823s0);
                    Context contextT = t();
                    if (contextT instanceof Activity) {
                        this.f29830z0.setOwnerActivity((Activity) contextT);
                    }
                    this.f29830z0.setCancelable(this.f29825u0);
                    this.f29830z0.setOnCancelListener(this.f29821q0);
                    this.f29830z0.setOnDismissListener(this.f29822r0);
                    this.f29818D0 = true;
                } else {
                    this.f29830z0 = null;
                }
            } finally {
                this.f29828x0 = false;
            }
        }
    }

    @Override // p111m2.ComponentCallbacksC2681f
    public void L0() {
        super.L0();
        Dialog dialog = this.f29830z0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void L1(boolean z8) {
        this.f29826v0 = z8;
    }

    public void M1(Dialog dialog, int i8) {
        if (i8 != 1 && i8 != 2) {
            if (i8 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // p111m2.ComponentCallbacksC2681f
    public void N0(Bundle bundle) {
        Bundle bundle2;
        super.N0(bundle);
        if (this.f29830z0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f29830z0.onRestoreInstanceState(bundle2);
    }

    public void N1(y yVar, String str) {
        this.f29816B0 = false;
        this.f29817C0 = true;
        G gM = yVar.m();
        gM.m(true);
        gM.d(this, str);
        gM.f();
    }

    @Override // p111m2.ComponentCallbacksC2681f
    public void U0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.U0(layoutInflater, viewGroup, bundle);
        if (this.f29846I != null || this.f29830z0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f29830z0.onRestoreInstanceState(bundle2);
    }

    @Override // p111m2.ComponentCallbacksC2681f
    public AbstractC2688m h() {
        return new C0647e(super.h());
    }

    @Override // p111m2.ComponentCallbacksC2681f
    public void h0(Bundle bundle) {
        super.h0(bundle);
    }

    @Override // p111m2.ComponentCallbacksC2681f
    public void k0(Context context) {
        super.k0(context);
        V().h(this.f29829y0);
        if (this.f29817C0) {
            return;
        }
        this.f29816B0 = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f29815A0) {
            return;
        }
        if (y.E0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        F1(true, true, false);
    }

    @Override // p111m2.ComponentCallbacksC2681f
    public void u0() {
        super.u0();
        Dialog dialog = this.f29830z0;
        if (dialog != null) {
            this.f29815A0 = true;
            dialog.setOnDismissListener(null);
            this.f29830z0.dismiss();
            if (!this.f29816B0) {
                onDismiss(this.f29830z0);
            }
            this.f29830z0 = null;
            this.f29818D0 = false;
        }
    }

    @Override // p111m2.ComponentCallbacksC2681f
    public void v0() {
        super.v0();
        if (!this.f29817C0 && !this.f29816B0) {
            this.f29816B0 = true;
        }
        V().l(this.f29829y0);
    }

    @Override // p111m2.ComponentCallbacksC2681f
    public LayoutInflater w0(Bundle bundle) {
        LayoutInflater layoutInflaterW0 = super.w0(bundle);
        if (this.f29826v0 && !this.f29828x0) {
            K1(bundle);
            if (y.E0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f29830z0;
            if (dialog != null) {
                return layoutInflaterW0.cloneInContext(dialog.getContext());
            }
        } else if (y.E0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f29826v0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterW0;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterW0;
    }

    @Override // p111m2.ComponentCallbacksC2681f
    public void n0(Bundle bundle) {
        boolean z8;
        super.n0(bundle);
        this.f29819o0 = new Handler();
        if (this.f29889y == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f29826v0 = z8;
        if (bundle != null) {
            this.f29823s0 = bundle.getInt("android:style", 0);
            this.f29824t0 = bundle.getInt("android:theme", 0);
            this.f29825u0 = bundle.getBoolean("android:cancelable", true);
            this.f29826v0 = bundle.getBoolean(vHKCAgr.DvEQrp, this.f29826v0);
            this.f29827w0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public DialogInterfaceOnCancelListenerC2680e(int i8) {
        super(i8);
        this.f29820p0 = new a();
        this.f29821q0 = new b();
        this.f29822r0 = new c();
        this.f29823s0 = 0;
        this.f29824t0 = 0;
        this.f29825u0 = true;
        this.f29826v0 = true;
        this.f29827w0 = -1;
        this.f29829y0 = new d();
        this.f29818D0 = false;
    }
}
