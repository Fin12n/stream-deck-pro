package B4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p219z4.C3209s;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends K4.a implements IInterface {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void S(C3209s c3209s) {
        Parcel parcelP = P();
        K4.c.c(parcelP, c3209s);
        R(1, parcelP);
    }
}
