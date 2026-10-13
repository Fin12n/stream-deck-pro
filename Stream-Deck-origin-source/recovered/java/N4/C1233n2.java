package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N4.n2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1233n2 extends A4.a {
    public static final Parcelable.Creator<C1233n2> CREATOR = new M1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f7234b;

    public C1233n2() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 2, this.f7233a);
        A4.c.o(parcel, 3, this.f7234b, false);
        A4.c.b(parcel, iA);
    }

    public C1233n2(int i8, String[] strArr) {
        this.f7233a = i8;
        this.f7234b = strArr;
    }
}
