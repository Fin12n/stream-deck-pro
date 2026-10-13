package R4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends A4.a {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f9496c;

    public b() {
        this(2, 0, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f9494a;
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 1, i9);
        A4.c.j(parcel, 2, this.f9495b);
        A4.c.m(parcel, 3, this.f9496c, i8, false);
        A4.c.b(parcel, iA);
    }

    public b(int i8, int i9, Intent intent) {
        this.f9494a = i8;
        this.f9495b = i9;
        this.f9496c = intent;
    }
}
