package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Q3 extends A4.a {
    public static final Parcelable.Creator<Q3> CREATOR = new qa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public U5 f6536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1325v6[] f6539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public S4[] f6540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f6541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1233n2[] f6542g;

    public Q3() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.m(parcel, 2, this.f6536a, i8, false);
        A4.c.n(parcel, 3, this.f6537b, false);
        A4.c.n(parcel, 4, this.f6538c, false);
        A4.c.q(parcel, 5, this.f6539d, i8, false);
        A4.c.q(parcel, 6, this.f6540e, i8, false);
        A4.c.o(parcel, 7, this.f6541f, false);
        A4.c.q(parcel, 8, this.f6542g, i8, false);
        A4.c.b(parcel, iA);
    }

    public Q3(U5 u8, String str, String str2, C1325v6[] c1325v6Arr, S4[] s4Arr, String[] strArr, C1233n2[] c1233n2Arr) {
        this.f6536a = u8;
        this.f6537b = str;
        this.f6538c = str2;
        this.f6539d = c1325v6Arr;
        this.f6540e = s4Arr;
        this.f6541f = strArr;
        this.f6542g = c1233n2Arr;
    }
}
