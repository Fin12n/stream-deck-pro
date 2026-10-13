package p138p3;

import android.content.Context;
import com.google.android.gms.internal.play_billing.B;
import com.google.android.gms.internal.play_billing.C2;
import com.google.android.gms.internal.play_billing.C2034k2;
import com.google.android.gms.internal.play_billing.C2038l2;
import com.google.android.gms.internal.play_billing.R1;
import com.google.android.gms.internal.play_billing.V1;
import com.google.android.gms.internal.play_billing.u2;
import com.google.android.gms.internal.play_billing.v2;

/* JADX INFO: renamed from: p3.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2762a0 implements W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2038l2 f31185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2766c0 f31186c;

    public C2762a0(Context context, C2038l2 c2038l2) {
        this.f31186c = new C2766c0(context);
        this.f31185b = c2038l2;
    }

    @Override // p138p3.W
    public final void a(C2 c8) {
        if (c8 == null) {
            return;
        }
        try {
            u2 u2VarF = v2.F();
            u2VarF.r(this.f31185b);
            u2VarF.s(c8);
            this.f31186c.a((v2) u2VarF.h());
        } catch (Throwable th) {
            B.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // p138p3.W
    public final void b(V1 v8, int i8) {
        try {
            C2034k2 c2034k2 = (C2034k2) this.f31185b.h();
            c2034k2.p(i8);
            this.f31185b = (C2038l2) c2034k2.h();
            c(v8);
        } catch (Throwable th) {
            B.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // p138p3.W
    public final void c(V1 v8) {
        if (v8 == null) {
            return;
        }
        try {
            u2 u2VarF = v2.F();
            u2VarF.r(this.f31185b);
            u2VarF.q(v8);
            this.f31186c.a((v2) u2VarF.h());
        } catch (Throwable th) {
            B.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // p138p3.W
    public final void d(R1 r8, int i8) {
        try {
            C2034k2 c2034k2 = (C2034k2) this.f31185b.h();
            c2034k2.p(i8);
            this.f31185b = (C2038l2) c2034k2.h();
            e(r8);
        } catch (Throwable th) {
            B.k("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // p138p3.W
    public final void e(R1 r8) {
        if (r8 == null) {
            return;
        }
        try {
            u2 u2VarF = v2.F();
            u2VarF.r(this.f31185b);
            u2VarF.p(r8);
            this.f31186c.a((v2) u2VarF.h());
        } catch (Throwable th) {
            B.k("BillingLogger", "Unable to log.", th);
        }
    }
}
