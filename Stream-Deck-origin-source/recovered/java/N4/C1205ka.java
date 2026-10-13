package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N4.ka, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1205ka extends A4.a {
    public static final Parcelable.Creator<C1205ka> CREATOR = new Aa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7191d;

    public C1205ka(int i8, String str, String str2, String str3) {
        this.f7188a = i8;
        this.f7189b = str;
        this.f7190c = str2;
        this.f7191d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 1, this.f7188a);
        A4.c.n(parcel, 2, this.f7189b, false);
        A4.c.n(parcel, 3, this.f7190c, false);
        A4.c.n(parcel, 4, this.f7191d, false);
        A4.c.b(parcel, iA);
    }
}
