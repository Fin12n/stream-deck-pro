package D4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p211y4.InterfaceC3103d;
import p211y4.InterfaceC3109j;
import p219z4.AbstractC3198g;
import p219z4.C3195d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends AbstractC3198g {
    public o(Context context, Looper looper, C3195d c3195d, InterfaceC3103d interfaceC3103d, InterfaceC3109j interfaceC3109j) {
        super(context, looper, 308, c3195d, interfaceC3103d, interfaceC3109j);
    }

    @Override // p219z4.AbstractC3194c
    public final String D() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // p219z4.AbstractC3194c
    public final String E() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // p219z4.AbstractC3194c
    public final boolean H() {
        return true;
    }

    @Override // p219z4.AbstractC3194c
    public final boolean Q() {
        return true;
    }

    @Override // p219z4.AbstractC3194c, x4.a.f
    public final int k() {
        return 17895000;
    }

    @Override // p219z4.AbstractC3194c
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // p219z4.AbstractC3194c
    public final p195w4.d[] u() {
        return K4.i.f4640b;
    }
}
