package N4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: N4.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1206l extends AbstractC1074a implements InterfaceC1230n {
    public C1206l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override // N4.InterfaceC1230n
    public final C1194k L(H4.a aVar, C1170i c1170i) {
        C1194k c1194k;
        Parcel parcelP = P();
        P.b(parcelP, aVar);
        P.a(parcelP, c1170i);
        Parcel parcelQ = Q(1, parcelP);
        IBinder strongBinder = parcelQ.readStrongBinder();
        if (strongBinder == null) {
            c1194k = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            c1194k = iInterfaceQueryLocalInterface instanceof C1194k ? (C1194k) iInterfaceQueryLocalInterface : new C1194k(strongBinder);
        }
        parcelQ.recycle();
        return c1194k;
    }
}
