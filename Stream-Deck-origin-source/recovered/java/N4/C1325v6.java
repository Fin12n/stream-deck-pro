package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N4.v6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1325v6 extends A4.a {
    public static final Parcelable.Creator<C1325v6> CREATOR = new C1122e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7358b;

    public C1325v6() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 2, this.f7357a);
        A4.c.n(parcel, 3, this.f7358b, false);
        A4.c.b(parcel, iA);
    }

    public C1325v6(int i8, String str) {
        this.f7357a = i8;
        this.f7358b = str;
    }
}
