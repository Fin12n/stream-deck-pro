package p219z4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import p195w4.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Y extends M {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f39119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC3194c f39120h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(AbstractC3194c abstractC3194c, int i8, IBinder iBinder, Bundle bundle) {
        super(abstractC3194c, i8, bundle);
        this.f39120h = abstractC3194c;
        this.f39119g = iBinder;
    }

    @Override // p219z4.M
    public final void f(b bVar) {
        if (this.f39120h.f39152v != null) {
            this.f39120h.f39152v.c(bVar);
        }
        this.f39120h.K(bVar);
    }

    @Override // p219z4.M
    public final boolean g() {
        try {
            IBinder iBinder = this.f39119g;
            AbstractC3207p.k(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f39120h.D().equals(interfaceDescriptor)) {
                Log.w("GmsClient", uYOhHhTXuF.jUB + this.f39120h.D() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceR = this.f39120h.r(this.f39119g);
            if (iInterfaceR == null || !(AbstractC3194c.e0(this.f39120h, 2, 4, iInterfaceR) || AbstractC3194c.e0(this.f39120h, 3, 4, iInterfaceR))) {
                return false;
            }
            this.f39120h.f39156z = null;
            AbstractC3194c abstractC3194c = this.f39120h;
            Bundle bundleW = abstractC3194c.w();
            if (abstractC3194c.f39151u == null) {
                return true;
            }
            this.f39120h.f39151u.d(bundleW);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
