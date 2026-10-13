package p211y4;

import K4.h;
import X.i;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;
import p195w4.b;
import p195w4.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f0 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f38380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f38381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f38382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f38383e;

    public f0(InterfaceC3106g interfaceC3106g, e eVar) {
        super(interfaceC3106g);
        this.f38381c = new AtomicReference(null);
        this.f38382d = new h(Looper.getMainLooper());
        this.f38383e = eVar;
    }

    public static final int p(c0 c0Var) {
        if (c0Var == null) {
            return -1;
        }
        return c0Var.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i8, int i9, Intent intent) {
        c0 c0Var = (c0) this.f38381c.get();
        if (i8 != 1) {
            if (i8 == 2) {
                int iG = this.f38383e.g(b());
                if (iG == 0) {
                    o();
                    return;
                } else {
                    if (c0Var == null) {
                        return;
                    }
                    if (c0Var.b().a() == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i9 == -1) {
            o();
            return;
        } else if (i9 == 0) {
            if (c0Var != null) {
                l(new b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, c0Var.b().toString()), p(c0Var));
                return;
            }
            return;
        }
        if (c0Var != null) {
            l(c0Var.b(), c0Var.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f38381c.set(bundle.getBoolean("resolving_error", false) ? new c0(new b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        c0 c0Var = (c0) this.f38381c.get();
        if (c0Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c0Var.a());
        bundle.putInt("failed_status", c0Var.b().a());
        bundle.putParcelable("failed_resolution", c0Var.b().c());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.f38380b = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.f38380b = false;
    }

    public final void l(b bVar, int i8) {
        this.f38381c.set(null);
        m(bVar, i8);
    }

    public abstract void m(b bVar, int i8);

    public abstract void n();

    public final void o() {
        this.f38381c.set(null);
        n();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new b(13, null), p((c0) this.f38381c.get()));
    }

    public final void s(b bVar, int i8) {
        AtomicReference atomicReference;
        c0 c0Var = new c0(bVar, i8);
        do {
            atomicReference = this.f38381c;
            if (i.a(atomicReference, null, c0Var)) {
                this.f38382d.post(new e0(this, c0Var));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
