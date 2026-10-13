package N4;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class sa extends A4.a {
    public static final Parcelable.Creator<sa> CREATOR = new ta();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f7309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Point[] f7310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1205ka f7312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1241na f7313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final oa f7314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ra f7315j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final pa f7316k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1217la f7317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1169ha f7318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1181ia f7319n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1193ja f7320o;

    public sa(int i8, String str, String str2, byte[] bArr, Point[] pointArr, int i9, C1205ka c1205ka, C1241na c1241na, oa oaVar, ra raVar, pa paVar, C1217la c1217la, C1169ha c1169ha, C1181ia c1181ia, C1193ja c1193ja) {
        this.f7306a = i8;
        this.f7307b = str;
        this.f7308c = str2;
        this.f7309d = bArr;
        this.f7310e = pointArr;
        this.f7311f = i9;
        this.f7312g = c1205ka;
        this.f7313h = c1241na;
        this.f7314i = oaVar;
        this.f7315j = raVar;
        this.f7316k = paVar;
        this.f7317l = c1217la;
        this.f7318m = c1169ha;
        this.f7319n = c1181ia;
        this.f7320o = c1193ja;
    }

    public final int a() {
        return this.f7306a;
    }

    public final int b() {
        return this.f7311f;
    }

    public final pa c() {
        return this.f7316k;
    }

    public final Point[] d() {
        return this.f7310e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 1, this.f7306a);
        A4.c.n(parcel, 2, this.f7307b, false);
        A4.c.n(parcel, 3, this.f7308c, false);
        A4.c.e(parcel, 4, this.f7309d, false);
        A4.c.q(parcel, 5, this.f7310e, i8, false);
        A4.c.j(parcel, 6, this.f7311f);
        A4.c.m(parcel, 7, this.f7312g, i8, false);
        A4.c.m(parcel, 8, this.f7313h, i8, false);
        A4.c.m(parcel, 9, this.f7314i, i8, false);
        A4.c.m(parcel, 10, this.f7315j, i8, false);
        A4.c.m(parcel, 11, this.f7316k, i8, false);
        A4.c.m(parcel, 12, this.f7317l, i8, false);
        A4.c.m(parcel, 13, this.f7318m, i8, false);
        A4.c.m(parcel, 14, this.f7319n, i8, false);
        A4.c.m(parcel, 15, this.f7320o, i8, false);
        A4.c.b(parcel, iA);
    }
}
