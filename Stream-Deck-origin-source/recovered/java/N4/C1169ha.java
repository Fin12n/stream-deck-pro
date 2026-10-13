package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N4.ha, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1169ha extends A4.a {
    public static final Parcelable.Creator<C1169ha> CREATOR = new xa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1157ga f7131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1157ga f7132g;

    public C1169ha(String str, String str2, String str3, String str4, String str5, C1157ga c1157ga, C1157ga c1157ga2) {
        this.f7126a = str;
        this.f7127b = str2;
        this.f7128c = str3;
        this.f7129d = str4;
        this.f7130e = str5;
        this.f7131f = c1157ga;
        this.f7132g = c1157ga2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f7126a;
        int iA = A4.c.a(parcel);
        A4.c.n(parcel, 1, str, false);
        A4.c.n(parcel, 2, this.f7127b, false);
        A4.c.n(parcel, 3, this.f7128c, false);
        A4.c.n(parcel, 4, this.f7129d, false);
        A4.c.n(parcel, 5, this.f7130e, false);
        A4.c.m(parcel, 6, this.f7131f, i8, false);
        A4.c.m(parcel, 7, this.f7132g, i8, false);
        A4.c.b(parcel, iA);
    }
}
