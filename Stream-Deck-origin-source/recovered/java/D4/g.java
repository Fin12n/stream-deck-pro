package D4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends K4.a implements IInterface {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void S(f fVar, a aVar) {
        Parcel parcelP = P();
        K4.c.d(parcelP, fVar);
        K4.c.c(parcelP, aVar);
        Q(1, parcelP);
    }

    public final void T(f fVar, a aVar, h hVar) {
        Parcel parcelP = P();
        K4.c.d(parcelP, fVar);
        K4.c.c(parcelP, aVar);
        K4.c.d(parcelP, hVar);
        Q(2, parcelP);
    }
}
