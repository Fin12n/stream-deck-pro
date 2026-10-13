package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N4.ia, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1181ia extends A4.a {
    public static final Parcelable.Creator<C1181ia> CREATOR = new ya();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1229ma f7142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1241na[] f7145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1205ka[] f7146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f7147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1145fa[] f7148g;

    public C1181ia(C1229ma c1229ma, String str, String str2, C1241na[] c1241naArr, C1205ka[] c1205kaArr, String[] strArr, C1145fa[] c1145faArr) {
        this.f7142a = c1229ma;
        this.f7143b = str;
        this.f7144c = str2;
        this.f7145d = c1241naArr;
        this.f7146e = c1205kaArr;
        this.f7147f = strArr;
        this.f7148g = c1145faArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.m(parcel, 1, this.f7142a, i8, false);
        A4.c.n(parcel, 2, this.f7143b, false);
        A4.c.n(parcel, 3, this.f7144c, false);
        A4.c.q(parcel, 4, this.f7145d, i8, false);
        A4.c.q(parcel, 5, this.f7146e, i8, false);
        A4.c.o(parcel, 6, this.f7147f, false);
        A4.c.q(parcel, 7, this.f7148g, i8, false);
        A4.c.b(parcel, iA);
    }
}
