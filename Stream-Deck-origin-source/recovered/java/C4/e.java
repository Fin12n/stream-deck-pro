package C4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class e extends A4.a {
    public static final Parcelable.Creator<e> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f1393a;

    public e(PendingIntent pendingIntent) {
        this.f1393a = pendingIntent;
    }

    public PendingIntent a() {
        return this.f1393a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.m(parcel, 1, a(), i8, false);
        A4.c.b(parcel, iA);
    }
}
