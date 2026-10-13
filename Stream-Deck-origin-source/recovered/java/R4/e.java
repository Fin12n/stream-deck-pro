package R4;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e extends K4.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // K4.b
    public final boolean P(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 3:
                K4.c.b(parcel);
                break;
            case 4:
                K4.c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                K4.c.b(parcel);
                break;
            case 7:
                K4.c.b(parcel);
                break;
            case 8:
                l lVar = (l) K4.c.a(parcel, l.CREATOR);
                K4.c.b(parcel);
                B(lVar);
                break;
            case 9:
                K4.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
