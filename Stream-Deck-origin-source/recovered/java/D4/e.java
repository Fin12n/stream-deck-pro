package D4;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e extends K4.b implements f {
    public e() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // K4.b
    public final boolean P(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            Status status = (Status) K4.c.a(parcel, Status.CREATOR);
            C4.b bVar = (C4.b) K4.c.a(parcel, C4.b.CREATOR);
            K4.c.b(parcel);
            p(status, bVar);
        } else if (i8 == 2) {
            Status status2 = (Status) K4.c.a(parcel, Status.CREATOR);
            C4.g gVar = (C4.g) K4.c.a(parcel, C4.g.CREATOR);
            K4.c.b(parcel);
            y(status2, gVar);
        } else if (i8 == 3) {
            Status status3 = (Status) K4.c.a(parcel, Status.CREATOR);
            C4.e eVar = (C4.e) K4.c.a(parcel, C4.e.CREATOR);
            K4.c.b(parcel);
            s(status3, eVar);
        } else {
            if (i8 != 4) {
                return false;
            }
            Status status4 = (Status) K4.c.a(parcel, Status.CREATOR);
            K4.c.b(parcel);
            H(status4);
        }
        return true;
    }
}
