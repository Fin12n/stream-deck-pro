package R4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends A4.a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9498b;

    public h(List list, String str) {
        this.f9497a = list;
        this.f9498b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        List list = this.f9497a;
        int iA = A4.c.a(parcel);
        A4.c.p(parcel, 1, list, false);
        A4.c.n(parcel, 2, this.f9498b, false);
        A4.c.b(parcel, iA);
    }
}
