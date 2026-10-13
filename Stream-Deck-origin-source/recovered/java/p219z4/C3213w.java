package p219z4;

import A4.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: z4.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C3213w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = b.v(parcel);
        ArrayList arrayListJ = null;
        int iR = 0;
        while (parcel.dataPosition() < iV) {
            int iP = b.p(parcel);
            int iL = b.l(iP);
            if (iL == 1) {
                iR = b.r(parcel, iP);
            } else if (iL != 2) {
                b.u(parcel, iP);
            } else {
                arrayListJ = b.j(parcel, iP, C3205n.CREATOR);
            }
        }
        b.k(parcel, iV);
        return new C3209s(iR, arrayListJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3209s[i8];
    }
}
