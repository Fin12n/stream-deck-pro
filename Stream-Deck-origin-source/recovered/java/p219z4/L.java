package p219z4;

import A4.b;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class L implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = b.v(parcel);
        int iR = 0;
        boolean zM = false;
        boolean zM2 = false;
        IBinder iBinderQ = null;
        p195w4.b bVar = null;
        while (parcel.dataPosition() < iV) {
            int iP = b.p(parcel);
            int iL = b.l(iP);
            if (iL == 1) {
                iR = b.r(parcel, iP);
            } else if (iL == 2) {
                iBinderQ = b.q(parcel, iP);
            } else if (iL == 3) {
                bVar = (p195w4.b) b.e(parcel, iP, p195w4.b.CREATOR);
            } else if (iL == 4) {
                zM = b.m(parcel, iP);
            } else if (iL != 5) {
                b.u(parcel, iP);
            } else {
                zM2 = b.m(parcel, iP);
            }
        }
        b.k(parcel, iV);
        return new K(iR, iBinderQ, bVar, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new K[i8];
    }
}
