package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class ra extends A4.a {
    public static final Parcelable.Creator<ra> CREATOR = new Ka();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7300c;

    public ra(String str, String str2, int i8) {
        this.f7298a = str;
        this.f7299b = str2;
        this.f7300c = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f7298a;
        int iA = A4.c.a(parcel);
        A4.c.n(parcel, 1, str, false);
        A4.c.n(parcel, 2, this.f7299b, false);
        A4.c.j(parcel, 3, this.f7300c);
        A4.c.b(parcel, iA);
    }
}
