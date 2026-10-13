package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class W6 extends A4.a {
    public static final Parcelable.Creator<W6> CREATOR = new C1134f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6620b;

    public W6() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.n(parcel, 2, this.f6619a, false);
        A4.c.n(parcel, 3, this.f6620b, false);
        A4.c.b(parcel, iA);
    }

    public W6(String str, String str2) {
        this.f6619a = str;
        this.f6620b = str2;
    }
}
