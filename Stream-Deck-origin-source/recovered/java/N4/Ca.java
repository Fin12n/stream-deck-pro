package N4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Ca extends AbstractC1074a implements IInterface {
    public Ca(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    public final List S(H4.a aVar, La la) {
        Parcel parcelP = P();
        P.b(parcelP, aVar);
        P.a(parcelP, la);
        Parcel parcelQ = Q(3, parcelP);
        ArrayList arrayListCreateTypedArrayList = parcelQ.createTypedArrayList(sa.CREATOR);
        parcelQ.recycle();
        return arrayListCreateTypedArrayList;
    }

    public final void T() {
        R(1, P());
    }

    public final void l() {
        R(2, P());
    }
}
