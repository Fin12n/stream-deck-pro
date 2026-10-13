package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N4.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1253p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = A4.b.v(parcel);
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        int iR4 = 0;
        long jS = 0;
        while (parcel.dataPosition() < iV) {
            int iP = A4.b.p(parcel);
            int iL = A4.b.l(iP);
            if (iL == 2) {
                iR = A4.b.r(parcel, iP);
            } else if (iL == 3) {
                iR2 = A4.b.r(parcel, iP);
            } else if (iL == 4) {
                iR3 = A4.b.r(parcel, iP);
            } else if (iL == 5) {
                jS = A4.b.s(parcel, iP);
            } else if (iL != 6) {
                A4.b.u(parcel, iP);
            } else {
                iR4 = A4.b.r(parcel, iP);
            }
        }
        A4.b.k(parcel, iV);
        return new C1242o(iR, iR2, iR3, jS, iR4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1242o[i8];
    }
}
