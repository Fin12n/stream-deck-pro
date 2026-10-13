package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N4.x7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1348x7 extends A4.a {
    public static final Parcelable.Creator<C1348x7> CREATOR = new C1146g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7381b;

    public C1348x7() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.n(parcel, 2, this.f7380a, false);
        A4.c.n(parcel, 3, this.f7381b, false);
        A4.c.b(parcel, iA);
    }

    public C1348x7(String str, String str2) {
        this.f7380a = str;
        this.f7381b = str2;
    }
}
