package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N4.la, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1217la extends A4.a {
    public static final Parcelable.Creator<C1217la> CREATOR = new Ba();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f7214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f7215b;

    public C1217la(double d8, double d9) {
        this.f7214a = d8;
        this.f7215b = d9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.f(parcel, 1, this.f7214a);
        A4.c.f(parcel, 2, this.f7215b);
        A4.c.b(parcel, iA);
    }
}
