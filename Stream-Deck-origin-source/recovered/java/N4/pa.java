package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class pa extends A4.a {
    public static final Parcelable.Creator<pa> CREATOR = new Ja();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7268b;

    public pa(String str, String str2) {
        this.f7267a = str;
        this.f7268b = str2;
    }

    public final String a() {
        return this.f7267a;
    }

    public final String b() {
        return this.f7268b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f7267a;
        int iA = A4.c.a(parcel);
        A4.c.n(parcel, 1, str, false);
        A4.c.n(parcel, 2, this.f7268b, false);
        A4.c.b(parcel, iA);
    }
}
