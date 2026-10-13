package N4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: N4.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1194k extends AbstractC1074a implements IInterface {
    public C1194k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final C1371z8[] S(H4.a aVar, C1242o c1242o) {
        Parcel parcelP = P();
        P.b(parcelP, aVar);
        P.a(parcelP, c1242o);
        Parcel parcelQ = Q(1, parcelP);
        C1371z8[] c1371z8Arr = (C1371z8[]) parcelQ.createTypedArray(C1371z8.CREATOR);
        parcelQ.recycle();
        return c1371z8Arr;
    }

    public final C1371z8[] T(H4.a aVar, C1242o c1242o) {
        Parcel parcelP = P();
        P.b(parcelP, aVar);
        P.a(parcelP, c1242o);
        Parcel parcelQ = Q(2, parcelP);
        C1371z8[] c1371z8Arr = (C1371z8[]) parcelQ.createTypedArray(C1371z8.CREATOR);
        parcelQ.recycle();
        return c1371z8Arr;
    }

    public final void k() {
        R(3, P());
    }
}
