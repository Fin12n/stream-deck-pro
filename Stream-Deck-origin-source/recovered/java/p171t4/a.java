package p171t4;

import A4.b;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = b.v(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Uri uri = null;
        String strF5 = null;
        String strF6 = null;
        ArrayList arrayListJ = null;
        String strF7 = null;
        String strF8 = null;
        long jS = 0;
        int iR = 0;
        while (parcel.dataPosition() < iV) {
            int iP = b.p(parcel);
            switch (b.l(iP)) {
                case 1:
                    iR = b.r(parcel, iP);
                    break;
                case 2:
                    strF = b.f(parcel, iP);
                    break;
                case 3:
                    strF2 = b.f(parcel, iP);
                    break;
                case 4:
                    strF3 = b.f(parcel, iP);
                    break;
                case 5:
                    strF4 = b.f(parcel, iP);
                    break;
                case 6:
                    uri = (Uri) b.e(parcel, iP, Uri.CREATOR);
                    break;
                case 7:
                    strF5 = b.f(parcel, iP);
                    break;
                case 8:
                    jS = b.s(parcel, iP);
                    break;
                case 9:
                    strF6 = b.f(parcel, iP);
                    break;
                case 10:
                    arrayListJ = b.j(parcel, iP, Scope.CREATOR);
                    break;
                case 11:
                    strF7 = b.f(parcel, iP);
                    break;
                case 12:
                    strF8 = b.f(parcel, iP);
                    break;
                default:
                    b.u(parcel, iP);
                    break;
            }
        }
        b.k(parcel, iV);
        return new GoogleSignInAccount(iR, strF, strF2, strF3, strF4, uri, strF5, jS, strF6, arrayListJ, strF7, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new GoogleSignInAccount[i8];
    }
}
