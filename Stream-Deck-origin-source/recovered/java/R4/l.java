package R4;

import android.os.Parcel;
import android.os.Parcelable;
import p219z4.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends A4.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p195w4.b f9502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K f9503c;

    public l(int i8, p195w4.b bVar, K k8) {
        this.f9501a = i8;
        this.f9502b = bVar;
        this.f9503c = k8;
    }

    public final p195w4.b a() {
        return this.f9502b;
    }

    public final K b() {
        return this.f9503c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 1, this.f9501a);
        A4.c.m(parcel, 2, this.f9502b, i8, false);
        A4.c.m(parcel, 3, this.f9503c, i8, false);
        A4.c.b(parcel, iA);
    }
}
