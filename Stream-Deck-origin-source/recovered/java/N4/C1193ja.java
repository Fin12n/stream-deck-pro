package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N4.ja, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1193ja extends A4.a {
    public static final Parcelable.Creator<C1193ja> CREATOR = new za();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f7162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f7163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f7164k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f7165l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f7166m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f7167n;

    public C1193ja(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f7154a = str;
        this.f7155b = str2;
        this.f7156c = str3;
        this.f7157d = str4;
        this.f7158e = str5;
        this.f7159f = str6;
        this.f7160g = str7;
        this.f7161h = str8;
        this.f7162i = str9;
        this.f7163j = str10;
        this.f7164k = str11;
        this.f7165l = str12;
        this.f7166m = str13;
        this.f7167n = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f7154a;
        int iA = A4.c.a(parcel);
        A4.c.n(parcel, 1, str, false);
        A4.c.n(parcel, 2, this.f7155b, false);
        A4.c.n(parcel, 3, this.f7156c, false);
        A4.c.n(parcel, 4, this.f7157d, false);
        A4.c.n(parcel, 5, this.f7158e, false);
        A4.c.n(parcel, 6, this.f7159f, false);
        A4.c.n(parcel, 7, this.f7160g, false);
        A4.c.n(parcel, 8, this.f7161h, false);
        A4.c.n(parcel, 9, this.f7162i, false);
        A4.c.n(parcel, 10, this.f7163j, false);
        A4.c.n(parcel, 11, this.f7164k, false);
        A4.c.n(parcel, 12, this.f7165l, false);
        A4.c.n(parcel, 13, this.f7166m, false);
        A4.c.n(parcel, 14, this.f7167n, false);
        A4.c.b(parcel, iA);
    }
}
