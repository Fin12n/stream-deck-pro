package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Y7 extends A4.a {
    public static final Parcelable.Creator<Y7> CREATOR = new C1158h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6708c;

    public Y7() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.n(parcel, 2, this.f6706a, false);
        A4.c.n(parcel, 3, this.f6707b, false);
        A4.c.j(parcel, 4, this.f6708c);
        A4.c.b(parcel, iA);
    }

    public Y7(String str, String str2, int i8) {
        this.f6706a = str;
        this.f6707b = str2;
        this.f6708c = i8;
    }
}
