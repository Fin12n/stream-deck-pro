package p211y4;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import p195w4.b;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f38377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f38378b;

    public e0(f0 f0Var, c0 c0Var) {
        this.f38378b = f0Var;
        this.f38377a = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f38378b.f38380b) {
            b bVarB = this.f38377a.b();
            if (bVarB.d()) {
                f0 f0Var = this.f38378b;
                f0Var.f17911a.startActivityForResult(GoogleApiActivity.a(f0Var.b(), (PendingIntent) AbstractC3207p.k(bVarB.c()), this.f38377a.a(), false), 1);
                return;
            }
            f0 f0Var2 = this.f38378b;
            if (f0Var2.f38383e.b(f0Var2.b(), bVarB.a(), null) != null) {
                f0 f0Var3 = this.f38378b;
                f0Var3.f38383e.v(f0Var3.b(), f0Var3.f17911a, bVarB.a(), 2, this.f38378b);
                return;
            }
            if (bVarB.a() != 18) {
                this.f38378b.l(bVarB, this.f38377a.a());
                return;
            }
            f0 f0Var4 = this.f38378b;
            Dialog dialogQ = f0Var4.f38383e.q(f0Var4.b(), f0Var4);
            f0 f0Var5 = this.f38378b;
            f0Var5.f38383e.r(f0Var5.b().getApplicationContext(), new d0(this, dialogQ));
        }
    }
}
