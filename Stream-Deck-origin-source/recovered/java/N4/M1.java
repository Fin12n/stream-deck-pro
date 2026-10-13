package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class M1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = A4.b.v(parcel);
        String[] strArrG = null;
        int iR = 0;
        while (parcel.dataPosition() < iV) {
            int iP = A4.b.p(parcel);
            int iL = A4.b.l(iP);
            if (iL == 2) {
                iR = A4.b.r(parcel, iP);
            } else if (iL != 3) {
                A4.b.u(parcel, iP);
            } else {
                strArrG = A4.b.g(parcel, iP);
            }
        }
        A4.b.k(parcel, iV);
        return new C1233n2(iR, strArrG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1233n2[i8];
    }
}
