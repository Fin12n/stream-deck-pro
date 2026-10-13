package p219z4;

import A4.a;
import A4.c;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: z4.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C3205n extends a {
    public static final Parcelable.Creator<C3205n> CREATOR = new H();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f39236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f39237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f39238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f39239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f39240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f39241i;

    @Deprecated
    public C3205n(int i8, int i9, int i10, long j8, long j9, String str, String str2, int i11) {
        this(i8, i9, i10, j8, j9, str, str2, i11, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f39233a;
        int iA = c.a(parcel);
        c.j(parcel, 1, i9);
        c.j(parcel, 2, this.f39234b);
        c.j(parcel, 3, this.f39235c);
        c.l(parcel, 4, this.f39236d);
        c.l(parcel, 5, this.f39237e);
        c.n(parcel, 6, this.f39238f, false);
        c.n(parcel, 7, this.f39239g, false);
        c.j(parcel, 8, this.f39240h);
        c.j(parcel, 9, this.f39241i);
        c.b(parcel, iA);
    }

    public C3205n(int i8, int i9, int i10, long j8, long j9, String str, String str2, int i11, int i12) {
        this.f39233a = i8;
        this.f39234b = i9;
        this.f39235c = i10;
        this.f39236d = j8;
        this.f39237e = j9;
        this.f39238f = str;
        this.f39239g = str2;
        this.f39240h = i11;
        this.f39241i = i12;
    }
}
