package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class La extends A4.a {
    public static final Parcelable.Creator<La> CREATOR = new Ma();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6481e;

    public La(int i8, int i9, int i10, int i11, long j8) {
        this.f6477a = i8;
        this.f6478b = i9;
        this.f6479c = i10;
        this.f6480d = i11;
        this.f6481e = j8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f6477a;
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 1, i9);
        A4.c.j(parcel, 2, this.f6478b);
        A4.c.j(parcel, 3, this.f6479c);
        A4.c.j(parcel, 4, this.f6480d);
        A4.c.l(parcel, 5, this.f6481e);
        A4.c.b(parcel, iA);
    }
}
