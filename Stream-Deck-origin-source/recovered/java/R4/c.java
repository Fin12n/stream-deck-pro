package R4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = A4.b.v(parcel);
        Intent intent = null;
        int iR = 0;
        int iR2 = 0;
        while (parcel.dataPosition() < iV) {
            int iP = A4.b.p(parcel);
            int iL = A4.b.l(iP);
            if (iL == 1) {
                iR = A4.b.r(parcel, iP);
            } else if (iL == 2) {
                iR2 = A4.b.r(parcel, iP);
            } else if (iL != 3) {
                A4.b.u(parcel, iP);
            } else {
                intent = (Intent) A4.b.e(parcel, iP, Intent.CREATOR);
            }
        }
        A4.b.k(parcel, iV);
        return new b(iR, iR2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new b[i8];
    }
}
