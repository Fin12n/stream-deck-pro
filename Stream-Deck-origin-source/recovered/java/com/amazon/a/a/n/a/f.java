package com.amazon.a.a.n.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class f extends com.amazon.a.a.i.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f16617b = new com.amazon.a.a.o.c("DecisionDialog");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f16619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BlockingQueue<a> f16620e = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Thread f16618c = Thread.currentThread();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.amazon.d.a.a f16623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f16624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Intent f16625c;

        public a(com.amazon.d.a.a aVar) {
            this.f16623a = aVar;
            this.f16624b = aVar.a();
            this.f16625c = aVar.b();
        }

        public com.amazon.d.a.a a() {
            return this.f16623a;
        }

        public String b() {
            return this.f16624b;
        }

        public Intent c() {
            return this.f16625c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f16626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f16627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f16628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final a f16629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a f16630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final a f16631f;

        public b(com.amazon.d.a.f fVar) {
            this.f16626a = fVar.b();
            this.f16627b = fVar.c();
            this.f16628c = fVar.d();
            this.f16629d = a(fVar.e());
            this.f16630e = a(fVar.f());
            this.f16631f = a(fVar.g());
        }

        private a a(com.amazon.d.a.a aVar) {
            if (aVar == null) {
                return null;
            }
            return new a(aVar);
        }

        public String b() {
            return this.f16627b;
        }

        public long c() {
            return this.f16628c;
        }

        public a d() {
            return this.f16631f;
        }

        public a e() {
            return this.f16630e;
        }

        public a f() {
            return this.f16629d;
        }

        public String a() {
            return this.f16626a;
        }
    }

    public f(com.amazon.d.a.f fVar) {
        this.f16619d = new b(fVar);
    }

    private ActivityInfo e(Activity activity) {
        try {
            return activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            if (!com.amazon.a.a.o.c.f16783b) {
                return null;
            }
            f16617b.b("Unable to get info for activity: " + activity);
            return null;
        }
    }

    private Dialog f(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.f16619d.a()).setMessage(this.f16619d.b()).setCancelable(false);
        AlertDialog alertDialogCreate = builder.create();
        a(activity, alertDialogCreate, this.f16619d.f(), -1);
        a(activity, alertDialogCreate, this.f16619d.e(), -3);
        a(activity, alertDialogCreate, this.f16619d.d(), -2);
        return alertDialogCreate;
    }

    private com.amazon.d.a.a n() throws com.amazon.a.a.n.a.a.e {
        try {
            if (com.amazon.a.a.o.c.f16782a) {
                f16617b.a("Blocking while awaiting customer decision: " + Thread.currentThread());
            }
            return this.f16620e.take().a();
        } catch (InterruptedException unused) {
            if (com.amazon.a.a.o.c.f16782a) {
                f16617b.a("Interrupted while awaiting decision, throwing decision expired!");
            }
            throw new com.amazon.a.a.n.a.a.e(o());
        }
    }

    private e o() {
        return l() == com.amazon.a.a.i.d.f16475a ? e.APP_NOT_COMPATIBLE : e.EXPIRATION_DURATION_ELAPSED;
    }

    private boolean p() {
        return a(this.f16619d.f()) || a(this.f16619d.e()) || a(this.f16619d.d());
    }

    @Override // com.amazon.a.a.i.b
    public Dialog d(Activity activity) {
        return f(activity);
    }

    @Override // com.amazon.a.a.e.c
    public long h() {
        return this.f16619d.c();
    }

    public com.amazon.d.a.a i() {
        if (com.amazon.a.a.o.c.f16782a) {
            f16617b.a("GetCustomerDecision: " + this.f16618c);
        }
        return n();
    }

    public String toString() {
        return "DecisionDialog: " + this.f16619d.a();
    }

    private boolean a(a aVar) {
        return (aVar == null || aVar.c() == null) ? false : true;
    }

    @Override // com.amazon.a.a.i.b
    public boolean b(Activity activity) {
        if (!p()) {
            return true;
        }
        ActivityInfo activityInfoE = e(activity);
        if (activityInfoE == null) {
            return false;
        }
        boolean z8 = activityInfoE.launchMode == 3;
        com.amazon.a.a.o.c cVar = f16617b;
        cVar.a("Single instance: " + z8);
        boolean z9 = (activityInfoE.flags & 2) != 0;
        cVar.a("Finish on task launch:" + z9);
        boolean z10 = (activityInfoE.flags & 128) != 0;
        cVar.a("No History: " + z10);
        return (z8 || z9 || z10) ? false : true;
    }

    @Override // com.amazon.a.a.i.b
    public void a(com.amazon.a.a.i.d dVar) {
        if (com.amazon.a.a.o.c.f16782a) {
            f16617b.a("Expiring Decision Dialog: Thread: " + Thread.currentThread());
        }
        this.f16618c.interrupt();
    }

    private void a(Activity activity, AlertDialog alertDialog, final a aVar, int i8) {
        if (aVar == null) {
            return;
        }
        alertDialog.setButton(i8, aVar.b(), new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.n.a.f.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i9) {
                if (com.amazon.a.a.o.c.f16782a) {
                    f.f16617b.a("Choice selected!");
                }
                if (f.this.k()) {
                    f.this.f16620e.add(aVar);
                }
            }
        });
    }
}
