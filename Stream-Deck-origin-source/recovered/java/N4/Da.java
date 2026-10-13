package N4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Da extends AbstractC1074a implements Fa {
    public Da(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // N4.Fa
    public final Ca J(H4.a aVar, ua uaVar) {
        Ca ca;
        Parcel parcelP = P();
        P.b(parcelP, aVar);
        P.a(parcelP, uaVar);
        Parcel parcelQ = Q(1, parcelP);
        IBinder strongBinder = parcelQ.readStrongBinder();
        if (strongBinder == null) {
            ca = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            ca = iInterfaceQueryLocalInterface instanceof Ca ? (Ca) iInterfaceQueryLocalInterface : new Ca(strongBinder);
        }
        parcelQ.recycle();
        return ca;
    }
}
