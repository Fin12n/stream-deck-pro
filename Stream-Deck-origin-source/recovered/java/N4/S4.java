package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class S4 extends A4.a {
    public static final Parcelable.Creator<S4> CREATOR = new C1086b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f6568d;

    public S4() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 2, this.f6565a);
        A4.c.n(parcel, 3, this.f6566b, false);
        A4.c.n(parcel, 4, this.f6567c, false);
        A4.c.n(parcel, 5, this.f6568d, false);
        A4.c.b(parcel, iA);
    }

    public S4(int i8, String str, String str2, String str3) {
        this.f6565a = i8;
        this.f6566b = str;
        this.f6567c = str2;
        this.f6568d = str3;
    }
}
