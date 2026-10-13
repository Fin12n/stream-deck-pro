package C4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class b extends A4.a {
    public static final Parcelable.Creator<b> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1392b;

    public b(boolean z8, int i8) {
        this.f1391a = z8;
        this.f1392b = i8;
    }

    public boolean a() {
        return this.f1391a;
    }

    public int b() {
        return this.f1392b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.c(parcel, 1, a());
        A4.c.j(parcel, 2, b());
        A4.c.b(parcel, iA);
    }
}
