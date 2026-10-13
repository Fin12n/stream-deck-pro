package p203x4;

import A4.b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = b.v(parcel);
        String strF = null;
        p195w4.b bVar = null;
        int iR = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iV) {
            int iP = b.p(parcel);
            int iL = b.l(iP);
            if (iL == 1) {
                iR = b.r(parcel, iP);
            } else if (iL == 2) {
                strF = b.f(parcel, iP);
            } else if (iL == 3) {
                pendingIntent = (PendingIntent) b.e(parcel, iP, PendingIntent.CREATOR);
            } else if (iL != 4) {
                b.u(parcel, iP);
            } else {
                bVar = (p195w4.b) b.e(parcel, iP, p195w4.b.CREATOR);
            }
        }
        b.k(parcel, iV);
        return new Status(iR, strF, pendingIntent, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new Status[i8];
    }
}
