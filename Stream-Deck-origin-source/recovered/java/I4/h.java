package I4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends L4.a implements IInterface {
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int Q() {
        Parcel parcelA = a(6, P());
        int i8 = parcelA.readInt();
        parcelA.recycle();
        return i8;
    }

    public final int R(H4.a aVar, String str, boolean z8) {
        Parcel parcelP = P();
        L4.c.d(parcelP, aVar);
        parcelP.writeString(str);
        parcelP.writeInt(z8 ? 1 : 0);
        Parcel parcelA = a(3, parcelP);
        int i8 = parcelA.readInt();
        parcelA.recycle();
        return i8;
    }

    public final int S(H4.a aVar, String str, boolean z8) {
        Parcel parcelP = P();
        L4.c.d(parcelP, aVar);
        parcelP.writeString(str);
        parcelP.writeInt(z8 ? 1 : 0);
        Parcel parcelA = a(5, parcelP);
        int i8 = parcelA.readInt();
        parcelA.recycle();
        return i8;
    }

    public final H4.a T(H4.a aVar, String str, int i8) {
        Parcel parcelP = P();
        L4.c.d(parcelP, aVar);
        parcelP.writeString(str);
        parcelP.writeInt(i8);
        Parcel parcelA = a(2, parcelP);
        H4.a aVarC = H4.a.AbstractBinderC0133a.c(parcelA.readStrongBinder());
        parcelA.recycle();
        return aVarC;
    }

    public final H4.a U(H4.a aVar, String str, int i8, H4.a aVar2) {
        Parcel parcelP = P();
        L4.c.d(parcelP, aVar);
        parcelP.writeString(str);
        parcelP.writeInt(i8);
        L4.c.d(parcelP, aVar2);
        Parcel parcelA = a(8, parcelP);
        H4.a aVarC = H4.a.AbstractBinderC0133a.c(parcelA.readStrongBinder());
        parcelA.recycle();
        return aVarC;
    }

    public final H4.a V(H4.a aVar, String str, int i8) {
        Parcel parcelP = P();
        L4.c.d(parcelP, aVar);
        parcelP.writeString(str);
        parcelP.writeInt(i8);
        Parcel parcelA = a(4, parcelP);
        H4.a aVarC = H4.a.AbstractBinderC0133a.c(parcelA.readStrongBinder());
        parcelA.recycle();
        return aVarC;
    }

    public final H4.a W(H4.a aVar, String str, boolean z8, long j8) {
        Parcel parcelP = P();
        L4.c.d(parcelP, aVar);
        parcelP.writeString(str);
        parcelP.writeInt(z8 ? 1 : 0);
        parcelP.writeLong(j8);
        Parcel parcelA = a(7, parcelP);
        H4.a aVarC = H4.a.AbstractBinderC0133a.c(parcelA.readStrongBinder());
        parcelA.recycle();
        return aVarC;
    }
}
