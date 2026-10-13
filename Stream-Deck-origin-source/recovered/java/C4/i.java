package C4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = A4.b.v(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iV) {
            int iP = A4.b.p(parcel);
            if (A4.b.l(iP) != 1) {
                A4.b.u(parcel, iP);
            } else {
                pendingIntent = (PendingIntent) A4.b.e(parcel, iP, PendingIntent.CREATOR);
            }
        }
        A4.b.k(parcel, iV);
        return new e(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new e[i8];
    }
}
