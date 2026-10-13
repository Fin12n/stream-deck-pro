package B4;

import T0.Vl.PCRzgdeK;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p211y4.InterfaceC3103d;
import p211y4.InterfaceC3109j;
import p219z4.AbstractC3198g;
import p219z4.C3195d;
import p219z4.C3212v;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends AbstractC3198g {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C3212v f1202I;

    public e(Context context, Looper looper, C3195d c3195d, C3212v c3212v, InterfaceC3103d interfaceC3103d, InterfaceC3109j interfaceC3109j) {
        super(context, looper, 270, c3195d, interfaceC3103d, interfaceC3109j);
        this.f1202I = c3212v;
    }

    @Override // p219z4.AbstractC3194c
    public final String D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // p219z4.AbstractC3194c
    public final String E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // p219z4.AbstractC3194c
    public final boolean H() {
        return true;
    }

    @Override // p219z4.AbstractC3194c, x4.a.f
    public final int k() {
        return 203400000;
    }

    @Override // p219z4.AbstractC3194c
    public final p195w4.d[] u() {
        return K4.d.f4636b;
    }

    @Override // p219z4.AbstractC3194c
    public final Bundle z() {
        return this.f1202I.b();
    }

    @Override // p219z4.AbstractC3194c
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(PCRzgdeK.UHCKIwDPaJ);
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder);
    }
}
