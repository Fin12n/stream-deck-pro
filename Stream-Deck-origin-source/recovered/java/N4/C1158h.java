package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N4.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1158h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = A4.b.v(parcel);
        int iR = 0;
        String strF = null;
        String strF2 = null;
        while (parcel.dataPosition() < iV) {
            int iP = A4.b.p(parcel);
            int iL = A4.b.l(iP);
            if (iL == 2) {
                strF = A4.b.f(parcel, iP);
            } else if (iL == 3) {
                strF2 = A4.b.f(parcel, iP);
            } else if (iL != 4) {
                A4.b.u(parcel, iP);
            } else {
                iR = A4.b.r(parcel, iP);
            }
        }
        A4.b.k(parcel, iV);
        return new Y7(strF, strF2, iR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new Y7[i8];
    }
}
