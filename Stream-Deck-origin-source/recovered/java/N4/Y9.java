package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Y9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = A4.b.v(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        O2 o8 = null;
        O2 o9 = null;
        while (parcel.dataPosition() < iV) {
            int iP = A4.b.p(parcel);
            switch (A4.b.l(iP)) {
                case 2:
                    strF = A4.b.f(parcel, iP);
                    break;
                case 3:
                    strF2 = A4.b.f(parcel, iP);
                    break;
                case 4:
                    strF3 = A4.b.f(parcel, iP);
                    break;
                case 5:
                    strF4 = A4.b.f(parcel, iP);
                    break;
                case 6:
                    strF5 = A4.b.f(parcel, iP);
                    break;
                case 7:
                    o8 = (O2) A4.b.e(parcel, iP, O2.CREATOR);
                    break;
                case 8:
                    o9 = (O2) A4.b.e(parcel, iP, O2.CREATOR);
                    break;
                default:
                    A4.b.u(parcel, iP);
                    break;
            }
        }
        A4.b.k(parcel, iV);
        return new C1257p3(strF, strF2, strF3, strF4, strF5, o8, o9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1257p3[i8];
    }
}
