package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N4.na, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1241na extends A4.a {
    public static final Parcelable.Creator<C1241na> CREATOR = new Ha();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7239b;

    public C1241na(int i8, String str) {
        this.f7238a = i8;
        this.f7239b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 1, this.f7238a);
        A4.c.n(parcel, 2, this.f7239b, false);
        A4.c.b(parcel, iA);
    }
}
