package p138p3;

import com.android.billingclient.api.d;
import com.google.android.gms.internal.play_billing.AbstractC2039m;
import com.google.android.gms.internal.play_billing.B;
import com.google.android.gms.internal.play_billing.C1998b2;
import com.google.android.gms.internal.play_billing.Q1;
import com.google.android.gms.internal.play_billing.R1;
import com.google.android.gms.internal.play_billing.U1;
import com.google.android.gms.internal.play_billing.V1;
import com.google.android.gms.internal.play_billing.X1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31181a = 0;

    static {
        AbstractC2039m abstractC2039m = W.f31182a;
    }

    public static R1 a(int i8, int i9, d dVar) {
        try {
            Q1 q1F = R1.F();
            X1 x1F = C1998b2.F();
            x1F.r(dVar.b());
            x1F.q(dVar.a());
            x1F.s(i8);
            q1F.p(x1F);
            q1F.r(i9);
            return (R1) q1F.h();
        } catch (Exception e8) {
            B.k("BillingLogger", "Unable to create logging payload", e8);
            return null;
        }
    }

    public static R1 b(int i8, int i9, d dVar, String str) {
        try {
            X1 x1F = C1998b2.F();
            x1F.r(dVar.b());
            x1F.q(dVar.a());
            x1F.s(i8);
            if (str != null) {
                x1F.p(str);
            }
            Q1 q1F = R1.F();
            q1F.p(x1F);
            q1F.r(i9);
            return (R1) q1F.h();
        } catch (Exception e8) {
            B.k("BillingLogger", "Unable to create logging payload", e8);
            return null;
        }
    }

    public static V1 c(int i8) {
        try {
            U1 u1D = V1.D();
            u1D.q(i8);
            return (V1) u1D.h();
        } catch (Exception e8) {
            B.k("BillingLogger", "Unable to create logging payload", e8);
            return null;
        }
    }
}
