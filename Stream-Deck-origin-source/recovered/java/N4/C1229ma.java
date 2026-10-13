package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N4.ma, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1229ma extends A4.a {
    public static final Parcelable.Creator<C1229ma> CREATOR = new Ga();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7232g;

    public C1229ma(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f7226a = str;
        this.f7227b = str2;
        this.f7228c = str3;
        this.f7229d = str4;
        this.f7230e = str5;
        this.f7231f = str6;
        this.f7232g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f7226a;
        int iA = A4.c.a(parcel);
        A4.c.n(parcel, 1, str, false);
        A4.c.n(parcel, 2, this.f7227b, false);
        A4.c.n(parcel, 3, this.f7228c, false);
        A4.c.n(parcel, 4, this.f7229d, false);
        A4.c.n(parcel, 5, this.f7230e, false);
        A4.c.n(parcel, 6, this.f7231f, false);
        A4.c.n(parcel, 7, this.f7232g, false);
        A4.c.b(parcel, iA);
    }
}
