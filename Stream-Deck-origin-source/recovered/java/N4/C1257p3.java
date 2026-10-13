package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N4.p3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1257p3 extends A4.a {
    public static final Parcelable.Creator<C1257p3> CREATOR = new Y9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f7259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f7260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f7261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public O2 f7262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public O2 f7263g;

    public C1257p3() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.n(parcel, 2, this.f7257a, false);
        A4.c.n(parcel, 3, this.f7258b, false);
        A4.c.n(parcel, 4, this.f7259c, false);
        A4.c.n(parcel, 5, this.f7260d, false);
        A4.c.n(parcel, 6, this.f7261e, false);
        A4.c.m(parcel, 7, this.f7262f, i8, false);
        A4.c.m(parcel, 8, this.f7263g, i8, false);
        A4.c.b(parcel, iA);
    }

    public C1257p3(String str, String str2, String str3, String str4, String str5, O2 o8, O2 o9) {
        this.f7257a = str;
        this.f7258b = str2;
        this.f7259c = str3;
        this.f7260d = str4;
        this.f7261e = str5;
        this.f7262f = o8;
        this.f7263g = o9;
    }
}
