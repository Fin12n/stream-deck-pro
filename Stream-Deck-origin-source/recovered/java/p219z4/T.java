package p219z4;

import A4.b;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class T implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = b.v(parcel);
        int iR = 0;
        boolean zM = false;
        boolean zM2 = false;
        int iR2 = 0;
        int iR3 = 0;
        while (parcel.dataPosition() < iV) {
            int iP = b.p(parcel);
            int iL = b.l(iP);
            if (iL == 1) {
                iR = b.r(parcel, iP);
            } else if (iL == 2) {
                zM = b.m(parcel, iP);
            } else if (iL == 3) {
                zM2 = b.m(parcel, iP);
            } else if (iL == 4) {
                iR2 = b.r(parcel, iP);
            } else if (iL != 5) {
                b.u(parcel, iP);
            } else {
                iR3 = b.r(parcel, iP);
            }
        }
        b.k(parcel, iV);
        return new r(iR, zM, zM2, iR2, iR3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new r[i8];
    }
}
