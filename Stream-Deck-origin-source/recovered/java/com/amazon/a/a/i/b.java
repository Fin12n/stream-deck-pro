package com.amazon.a.a.i;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends com.amazon.a.a.e.c<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f16453b = new com.amazon.a.a.o.c("Prompt");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f16454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f16455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Activity f16456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f16457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Dialog f16458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f16459h = new AtomicBoolean(false);

    public b() {
        int i8 = i();
        this.f16455d = i8;
        if (com.amazon.a.a.o.c.f16782a) {
            f16453b.a("Creating Prompt: " + i8);
        }
    }

    private boolean e(Activity activity) {
        if (this.f16454c.b(com.amazon.a.a.m.c.f16557e)) {
            return false;
        }
        return b(activity);
    }

    private void f(Activity activity) {
        if (com.amazon.a.a.o.c.f16782a) {
            f16453b.a("Showing prompt, id: " + j() + ", prompt: " + this + ", activity: " + activity);
        }
        if (this.f16456e != null) {
            m();
        }
        activity.showDialog(j());
    }

    private int i() {
        int iNextInt = new Random().nextInt(2146249079) + 1234567;
        if (iNextInt <= 1234567) {
            return 1234567;
        }
        return iNextInt;
    }

    private void m() {
        if (com.amazon.a.a.o.c.f16782a) {
            f16453b.b("Dismissing dialog: " + this.f16455d);
        }
        try {
            this.f16456e.dismissDialog(this.f16455d);
            this.f16456e.removeDialog(this.f16455d);
        } catch (Exception unused) {
            if (com.amazon.a.a.o.c.f16782a) {
                f16453b.b("Unable to remove dialog: " + this.f16455d);
            }
        }
        this.f16456e = null;
        this.f16458g = null;
    }

    public final void a(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        if (e(activity)) {
            f(activity);
        } else {
            b(d.f16475a);
        }
    }

    public abstract void a(d dVar);

    public boolean b(Activity activity) {
        return true;
    }

    public final Dialog c(Activity activity) {
        this.f16456e = activity;
        Dialog dialogD = d(activity);
        this.f16458g = dialogD;
        dialogD.setCancelable(false);
        this.f16458g.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.amazon.a.a.i.b.1
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i8, KeyEvent keyEvent) {
                return i8 == 84;
            }
        });
        return this.f16458g;
    }

    public abstract Dialog d(Activity activity);

    @Override // com.amazon.a.a.e.a
    public final void d() {
        if (com.amazon.a.a.o.c.f16782a) {
            f16453b.a("Expiring prompt: " + this);
        }
        this.f16417a.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.i.b.2
            @Override // com.amazon.a.a.n.a
            public void a() {
                b.this.k();
            }

            public String toString() {
                return "DismissPromptTask: " + b.this.toString();
            }
        });
        a(l());
    }

    public int j() {
        return this.f16455d;
    }

    public final boolean k() {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f16782a) {
            f16453b.a("Dismissing Prompt: " + this.f16455d);
        }
        if (!this.f16459h.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f16782a) {
                f16453b.b("Prompt has already been dismissed");
            }
            return false;
        }
        if (this.f16456e != null) {
            m();
        }
        f();
        return true;
    }

    public d l() {
        if (!g()) {
            return null;
        }
        d dVar = this.f16457f;
        return dVar == null ? d.EXPIRATION_DURATION_ELAPSED : dVar;
    }

    private void b(d dVar) {
        if (com.amazon.a.a.o.c.f16782a) {
            f16453b.a("Expiring prompt pre-maturely: id: " + j() + ", prompt: " + this + ",, reason: " + dVar);
        }
        this.f16457f = dVar;
        c();
    }

    public void a(Activity activity, boolean z8) {
        if (activity != this.f16456e) {
            if (com.amazon.a.a.o.c.f16782a) {
                f16453b.a("Unrecognized context");
            }
        } else {
            if (!z8 || this.f16458g.isShowing()) {
                return;
            }
            if (com.amazon.a.a.o.c.f16782a) {
                f16453b.a("showing dialog because it was not showing");
            }
            this.f16458g.show();
        }
    }
}
