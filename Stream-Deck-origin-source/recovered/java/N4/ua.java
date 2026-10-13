package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class ua extends A4.a {
    public static final Parcelable.Creator<ua> CREATOR = new va();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7352b;

    public ua(int i8, boolean z8) {
        this.f7351a = i8;
        this.f7352b = z8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f7351a;
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 1, i9);
        A4.c.c(parcel, 2, this.f7352b);
        A4.c.b(parcel, iA);
    }
}
