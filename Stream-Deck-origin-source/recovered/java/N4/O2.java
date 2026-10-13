package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class O2 extends A4.a {
    public static final Parcelable.Creator<O2> CREATOR = new C1350x9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f6518h;

    public O2() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 2, this.f6511a);
        A4.c.j(parcel, 3, this.f6512b);
        A4.c.j(parcel, 4, this.f6513c);
        A4.c.j(parcel, 5, this.f6514d);
        A4.c.j(parcel, 6, this.f6515e);
        A4.c.j(parcel, 7, this.f6516f);
        A4.c.c(parcel, 8, this.f6517g);
        A4.c.n(parcel, 9, this.f6518h, false);
        A4.c.b(parcel, iA);
    }

    public O2(int i8, int i9, int i10, int i11, int i12, int i13, boolean z8, String str) {
        this.f6511a = i8;
        this.f6512b = i9;
        this.f6513c = i10;
        this.f6514d = i11;
        this.f6515e = i12;
        this.f6516f = i13;
        this.f6517g = z8;
        this.f6518h = str;
    }
}
