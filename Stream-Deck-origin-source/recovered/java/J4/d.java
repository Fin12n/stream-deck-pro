package J4;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends a implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // J4.f
    public final String j() {
        Parcel parcelQ = Q(1, P());
        String string = parcelQ.readString();
        parcelQ.recycle();
        return string;
    }

    @Override // J4.f
    public final boolean n(boolean z8) {
        Parcel parcelP = P();
        c.a(parcelP, true);
        Parcel parcelQ = Q(2, parcelP);
        boolean zB = c.b(parcelQ);
        parcelQ.recycle();
        return zB;
    }
}
