package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class oa extends A4.a {
    public static final Parcelable.Creator<oa> CREATOR = new Ia();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7255b;

    public oa(String str, String str2) {
        this.f7254a = str;
        this.f7255b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f7254a;
        int iA = A4.c.a(parcel);
        A4.c.n(parcel, 1, str, false);
        A4.c.n(parcel, 2, this.f7255b, false);
        A4.c.b(parcel, iA);
    }
}
