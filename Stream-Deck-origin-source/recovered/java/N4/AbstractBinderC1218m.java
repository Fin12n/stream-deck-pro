package N4;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: N4.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC1218m extends AbstractBinderC1307u implements InterfaceC1230n {
    public static InterfaceC1230n a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1230n ? (InterfaceC1230n) iInterfaceQueryLocalInterface : new C1206l(iBinder);
    }
}
