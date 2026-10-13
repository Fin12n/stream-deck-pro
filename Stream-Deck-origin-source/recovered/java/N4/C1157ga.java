package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N4.ga, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1157ga extends A4.a {
    public static final Parcelable.Creator<C1157ga> CREATOR = new wa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7117h;

    public C1157ga(int i8, int i9, int i10, int i11, int i12, int i13, boolean z8, String str) {
        this.f7110a = i8;
        this.f7111b = i9;
        this.f7112c = i10;
        this.f7113d = i11;
        this.f7114e = i12;
        this.f7115f = i13;
        this.f7116g = z8;
        this.f7117h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 1, this.f7110a);
        A4.c.j(parcel, 2, this.f7111b);
        A4.c.j(parcel, 3, this.f7112c);
        A4.c.j(parcel, 4, this.f7113d);
        A4.c.j(parcel, 5, this.f7114e);
        A4.c.j(parcel, 6, this.f7115f);
        A4.c.c(parcel, 7, this.f7116g);
        A4.c.n(parcel, 8, this.f7117h, false);
        A4.c.b(parcel, iA);
    }
}
