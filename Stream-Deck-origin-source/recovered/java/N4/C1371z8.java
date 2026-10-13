package N4;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N4.z8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1371z8 extends A4.a {
    public static final Parcelable.Creator<C1371z8> CREATOR = new W8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f7417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Point[] f7419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public S4 f7420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1325v6 f7421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public W6 f7422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Y7 f7423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C1348x7 f7424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C1302t5 f7425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1257p3 f7426l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Q3 f7427m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C1279r4 f7428n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f7429o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7430p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double f7431q;

    public C1371z8() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 2, this.f7415a);
        A4.c.n(parcel, 3, this.f7416b, false);
        A4.c.n(parcel, 4, this.f7417c, false);
        A4.c.j(parcel, 5, this.f7418d);
        A4.c.q(parcel, 6, this.f7419e, i8, false);
        A4.c.m(parcel, 7, this.f7420f, i8, false);
        A4.c.m(parcel, 8, this.f7421g, i8, false);
        A4.c.m(parcel, 9, this.f7422h, i8, false);
        A4.c.m(parcel, 10, this.f7423i, i8, false);
        A4.c.m(parcel, 11, this.f7424j, i8, false);
        A4.c.m(parcel, 12, this.f7425k, i8, false);
        A4.c.m(parcel, 13, this.f7426l, i8, false);
        A4.c.m(parcel, 14, this.f7427m, i8, false);
        A4.c.m(parcel, 15, this.f7428n, i8, false);
        A4.c.e(parcel, 16, this.f7429o, false);
        A4.c.c(parcel, 17, this.f7430p);
        A4.c.f(parcel, 18, this.f7431q);
        A4.c.b(parcel, iA);
    }

    public C1371z8(int i8, String str, String str2, int i9, Point[] pointArr, S4 s8, C1325v6 c1325v6, W6 w8, Y7 y8, C1348x7 c1348x7, C1302t5 c1302t5, C1257p3 c1257p3, Q3 q8, C1279r4 c1279r4, byte[] bArr, boolean z8, double d8) {
        this.f7415a = i8;
        this.f7416b = str;
        this.f7429o = bArr;
        this.f7417c = str2;
        this.f7418d = i9;
        this.f7419e = pointArr;
        this.f7430p = z8;
        this.f7431q = d8;
        this.f7420f = s8;
        this.f7421g = c1325v6;
        this.f7422h = w8;
        this.f7423i = y8;
        this.f7424j = c1348x7;
        this.f7425k = c1302t5;
        this.f7426l = c1257p3;
        this.f7427m = q8;
        this.f7428n = c1279r4;
    }
}
