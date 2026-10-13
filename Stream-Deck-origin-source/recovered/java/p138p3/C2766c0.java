package p138p3;

import android.content.Context;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.internal.play_billing.B;
import com.google.android.gms.internal.play_billing.v2;
import p032d4.b;
import p032d4.c;
import p032d4.e;
import p032d4.f;
import p041e4.a;

/* JADX INFO: renamed from: p3.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2766c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f31187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f31188b;

    public C2766c0(Context context) {
        try {
            TransportRuntime.f(context);
            this.f31188b = TransportRuntime.c().g(a.f20755g).a("PLAY_BILLING_LIBRARY", v2.class, b.b("proto"), new e() { // from class: p3.b0
                @Override // p032d4.e
                public final Object apply(Object obj) {
                    return ((v2) obj).e();
                }
            });
        } catch (Throwable unused) {
            this.f31187a = true;
        }
    }

    public final void a(v2 v2Var) {
        if (this.f31187a) {
            B.j("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f31188b.a(c.d(v2Var));
        } catch (Throwable unused) {
            B.j("BillingLogger", "logging failed.");
        }
    }
}
