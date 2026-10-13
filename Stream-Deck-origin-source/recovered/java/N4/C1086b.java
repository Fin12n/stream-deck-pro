package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1086b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = A4.b.v(parcel);
        String strF = null;
        String strF2 = null;
        int iR = 0;
        String strF3 = null;
        while (parcel.dataPosition() < iV) {
            int iP = A4.b.p(parcel);
            int iL = A4.b.l(iP);
            if (iL == 2) {
                iR = A4.b.r(parcel, iP);
            } else if (iL == 3) {
                strF = A4.b.f(parcel, iP);
            } else if (iL == 4) {
                strF3 = A4.b.f(parcel, iP);
            } else if (iL != 5) {
                A4.b.u(parcel, iP);
            } else {
                strF2 = A4.b.f(parcel, iP);
            }
        }
        A4.b.k(parcel, iV);
        return new S4(iR, strF, strF3, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new S4[i8];
    }
}
