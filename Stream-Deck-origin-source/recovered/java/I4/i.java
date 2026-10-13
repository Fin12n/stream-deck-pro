package I4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends L4.a implements IInterface {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final H4.a Q(H4.a aVar, String str, int i8, H4.a aVar2) {
        Parcel parcelP = P();
        L4.c.d(parcelP, aVar);
        parcelP.writeString(str);
        parcelP.writeInt(i8);
        L4.c.d(parcelP, aVar2);
        Parcel parcelA = a(2, parcelP);
        H4.a aVarC = H4.a.AbstractBinderC0133a.c(parcelA.readStrongBinder());
        parcelA.recycle();
        return aVarC;
    }

    public final H4.a R(H4.a aVar, String str, int i8, H4.a aVar2) {
        Parcel parcelP = P();
        L4.c.d(parcelP, aVar);
        parcelP.writeString(str);
        parcelP.writeInt(i8);
        L4.c.d(parcelP, aVar2);
        Parcel parcelA = a(3, parcelP);
        H4.a aVarC = H4.a.AbstractBinderC0133a.c(parcelA.readStrongBinder());
        parcelA.recycle();
        return aVarC;
    }
}
