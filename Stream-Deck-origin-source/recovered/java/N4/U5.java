package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class U5 extends A4.a {
    public static final Parcelable.Creator<U5> CREATOR = new C1110d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f6587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f6588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f6589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f6590g;

    public U5() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.n(parcel, 2, this.f6584a, false);
        A4.c.n(parcel, 3, this.f6585b, false);
        A4.c.n(parcel, 4, this.f6586c, false);
        A4.c.n(parcel, 5, this.f6587d, false);
        A4.c.n(parcel, 6, this.f6588e, false);
        A4.c.n(parcel, 7, this.f6589f, false);
        A4.c.n(parcel, 8, this.f6590g, false);
        A4.c.b(parcel, iA);
    }

    public U5(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f6584a = str;
        this.f6585b = str2;
        this.f6586c = str3;
        this.f6587d = str4;
        this.f6588e = str5;
        this.f6589f = str6;
        this.f6590g = str7;
    }
}
