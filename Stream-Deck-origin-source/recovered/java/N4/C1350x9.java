package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N4.x9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1350x9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = A4.b.v(parcel);
        String strF = null;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        int iR4 = 0;
        int iR5 = 0;
        int iR6 = 0;
        boolean zM = false;
        while (parcel.dataPosition() < iV) {
            int iP = A4.b.p(parcel);
            switch (A4.b.l(iP)) {
                case 2:
                    iR = A4.b.r(parcel, iP);
                    break;
                case 3:
                    iR2 = A4.b.r(parcel, iP);
                    break;
                case 4:
                    iR3 = A4.b.r(parcel, iP);
                    break;
                case 5:
                    iR4 = A4.b.r(parcel, iP);
                    break;
                case 6:
                    iR5 = A4.b.r(parcel, iP);
                    break;
                case 7:
                    iR6 = A4.b.r(parcel, iP);
                    break;
                case 8:
                    zM = A4.b.m(parcel, iP);
                    break;
                case 9:
                    strF = A4.b.f(parcel, iP);
                    break;
                default:
                    A4.b.u(parcel, iP);
                    break;
            }
        }
        A4.b.k(parcel, iV);
        return new O2(iR, iR2, iR3, iR4, iR5, iR6, zM, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new O2[i8];
    }
}
