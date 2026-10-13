package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class ya implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = A4.b.v(parcel);
        C1229ma c1229ma = null;
        String strF = null;
        String strF2 = null;
        C1241na[] c1241naArr = null;
        C1205ka[] c1205kaArr = null;
        String[] strArrG = null;
        C1145fa[] c1145faArr = null;
        while (parcel.dataPosition() < iV) {
            int iP = A4.b.p(parcel);
            switch (A4.b.l(iP)) {
                case 1:
                    c1229ma = (C1229ma) A4.b.e(parcel, iP, C1229ma.CREATOR);
                    break;
                case 2:
                    strF = A4.b.f(parcel, iP);
                    break;
                case 3:
                    strF2 = A4.b.f(parcel, iP);
                    break;
                case 4:
                    c1241naArr = (C1241na[]) A4.b.i(parcel, iP, C1241na.CREATOR);
                    break;
                case 5:
                    c1205kaArr = (C1205ka[]) A4.b.i(parcel, iP, C1205ka.CREATOR);
                    break;
                case 6:
                    strArrG = A4.b.g(parcel, iP);
                    break;
                case 7:
                    c1145faArr = (C1145fa[]) A4.b.i(parcel, iP, C1145fa.CREATOR);
                    break;
                default:
                    A4.b.u(parcel, iP);
                    break;
            }
        }
        A4.b.k(parcel, iV);
        return new C1181ia(c1229ma, strF, strF2, c1241naArr, c1205kaArr, strArrG, c1145faArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1181ia[i8];
    }
}
