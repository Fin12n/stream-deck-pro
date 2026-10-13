package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N4.r4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1279r4 extends A4.a {
    public static final Parcelable.Creator<C1279r4> CREATOR = new Na();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f7284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f7285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f7286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f7287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f7288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f7289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f7290i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f7291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f7292k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f7293l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f7294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f7295n;

    public C1279r4() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.n(parcel, 2, this.f7282a, false);
        A4.c.n(parcel, 3, this.f7283b, false);
        A4.c.n(parcel, 4, this.f7284c, false);
        A4.c.n(parcel, 5, this.f7285d, false);
        A4.c.n(parcel, 6, this.f7286e, false);
        A4.c.n(parcel, 7, this.f7287f, false);
        A4.c.n(parcel, 8, this.f7288g, false);
        A4.c.n(parcel, 9, this.f7289h, false);
        A4.c.n(parcel, 10, this.f7290i, false);
        A4.c.n(parcel, 11, this.f7291j, false);
        A4.c.n(parcel, 12, this.f7292k, false);
        A4.c.n(parcel, 13, this.f7293l, false);
        A4.c.n(parcel, 14, this.f7294m, false);
        A4.c.n(parcel, 15, this.f7295n, false);
        A4.c.b(parcel, iA);
    }

    public C1279r4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f7282a = str;
        this.f7283b = str2;
        this.f7284c = str3;
        this.f7285d = str4;
        this.f7286e = str5;
        this.f7287f = str6;
        this.f7288g = str7;
        this.f7289h = str8;
        this.f7290i = str9;
        this.f7291j = str10;
        this.f7292k = str11;
        this.f7293l = str12;
        this.f7294m = str13;
        this.f7295n = str14;
    }
}
