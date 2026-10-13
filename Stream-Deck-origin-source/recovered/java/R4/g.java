package R4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends K4.a implements IInterface {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void S(j jVar, f fVar) {
        Parcel parcelP = P();
        K4.c.c(parcelP, jVar);
        K4.c.d(parcelP, fVar);
        Q(12, parcelP);
    }
}
