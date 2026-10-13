package p211y4;

import Q4.e;
import R4.d;
import R4.l;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.util.Set;
import p195w4.b;
import p203x4.a;
import p203x4.f;
import p219z4.AbstractC3207p;
import p219z4.C3195d;
import p219z4.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class U extends d implements f.a, f.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a.AbstractC0839a f38325h = Q4.d.f9220c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f38327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.AbstractC0839a f38328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f38329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3195d f38330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f38331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public T f38332g;

    public U(Context context, Handler handler, C3195d c3195d) {
        a.AbstractC0839a abstractC0839a = f38325h;
        this.f38326a = context;
        this.f38327b = handler;
        this.f38330e = (C3195d) AbstractC3207p.l(c3195d, "ClientSettings must not be null");
        this.f38329d = c3195d.e();
        this.f38328c = abstractC0839a;
    }

    public static /* bridge */ /* synthetic */ void R(U u8, l lVar) {
        b bVarA = lVar.a();
        if (bVarA.e()) {
            K k8 = (K) AbstractC3207p.k(lVar.b());
            b bVarA2 = k8.a();
            if (!bVarA2.e()) {
                String strValueOf = String.valueOf(bVarA2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                u8.f38332g.a(bVarA2);
                u8.f38331f.i();
                return;
            }
            u8.f38332g.c(k8.b(), u8.f38329d);
        } else {
            u8.f38332g.a(bVarA);
        }
        u8.f38331f.i();
    }

    @Override // R4.d, R4.f
    public final void B(l lVar) {
        this.f38327b.post(new S(this, lVar));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Q4.e, x4.a$f] */
    public final void S(T t8) {
        e eVar = this.f38331f;
        if (eVar != null) {
            eVar.i();
        }
        this.f38330e.i(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0839a abstractC0839a = this.f38328c;
        Context context = this.f38326a;
        Handler handler = this.f38327b;
        C3195d c3195d = this.f38330e;
        this.f38331f = abstractC0839a.a(context, handler.getLooper(), c3195d, c3195d.f(), this, this);
        this.f38332g = t8;
        Set set = this.f38329d;
        if (set == null || set.isEmpty()) {
            this.f38327b.post(new Q(this));
        } else {
            this.f38331f.p();
        }
    }

    public final void T() {
        e eVar = this.f38331f;
        if (eVar != null) {
            eVar.i();
        }
    }

    @Override // p211y4.InterfaceC3103d
    public final void a(int i8) {
        this.f38332g.d(i8);
    }

    @Override // p211y4.InterfaceC3109j
    public final void c(b bVar) {
        this.f38332g.a(bVar);
    }

    @Override // p211y4.InterfaceC3103d
    public final void d(Bundle bundle) {
        this.f38331f.c(this);
    }
}
