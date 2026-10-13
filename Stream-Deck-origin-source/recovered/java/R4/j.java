package R4;

import android.os.Parcel;
import android.os.Parcelable;
import p219z4.I;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends A4.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f9500b;

    public j(int i8, I i9) {
        this.f9499a = i8;
        this.f9500b = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 1, this.f9499a);
        A4.c.m(parcel, 2, this.f9500b, i8, false);
        A4.c.b(parcel, iA);
    }
}
