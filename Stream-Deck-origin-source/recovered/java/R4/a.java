package R4;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import p143q0.nKy.bGZGhbtQmA;
import p179u4.eubL.OjEsfyJYzbPn;
import p219z4.AbstractC3194c;
import p219z4.AbstractC3198g;
import p219z4.AbstractC3207p;
import p219z4.C3195d;
import p219z4.I;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a extends AbstractC3198g implements Q4.e {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f9489M = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f9490I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C3195d f9491J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final Bundle f9492K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Integer f9493L;

    public a(Context context, Looper looper, boolean z8, C3195d c3195d, Bundle bundle, x4.f.a aVar, x4.f.b bVar) {
        super(context, looper, 44, c3195d, aVar, bVar);
        this.f9490I = true;
        this.f9491J = c3195d;
        this.f9492K = bundle;
        this.f9493L = c3195d.g();
    }

    @Override // p219z4.AbstractC3194c
    public final String D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // p219z4.AbstractC3194c
    public final String E() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // p219z4.AbstractC3194c, x4.a.f
    public final int k() {
        return 12451000;
    }

    @Override // p219z4.AbstractC3194c, x4.a.f
    public final boolean o() {
        return this.f9490I;
    }

    @Override // Q4.e
    public final void p() {
        b(new AbstractC3194c.d());
    }

    @Override // p219z4.AbstractC3194c
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // p219z4.AbstractC3194c
    public final Bundle z() {
        if (!x().getPackageName().equals(this.f9491J.d())) {
            this.f9492K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f9491J.d());
        }
        return this.f9492K;
    }

    @Override // Q4.e
    public final void c(f fVar) {
        AbstractC3207p.l(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountB = this.f9491J.b();
            ((g) C()).S(new j(1, new I(accountB, ((Integer) AbstractC3207p.k(this.f9493L)).intValue(), bGZGhbtQmA.wDSNXsgdvlqEqtG.equals(accountB.name) ? p179u4.a.a(x()).b() : null)), fVar);
        } catch (RemoteException e8) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.B(new l(1, new p195w4.b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e8);
            }
        }
    }

    public static Bundle j0(C3195d c3195d) {
        c3195d.f();
        Integer numG = c3195d.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c3195d.a());
        if (numG != null) {
            bundle.putInt(OjEsfyJYzbPn.gUYCirhLBhL, numG.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }
}
