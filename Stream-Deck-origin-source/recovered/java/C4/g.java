package C4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class g extends A4.a {
    public static final Parcelable.Creator<g> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1399b;

    public g(int i8) {
        this(i8, false);
    }

    public int a() {
        return this.f1398a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 1, a());
        A4.c.c(parcel, 2, this.f1399b);
        A4.c.b(parcel, iA);
    }

    public g(int i8, boolean z8) {
        this.f1398a = i8;
        this.f1399b = z8;
    }
}
