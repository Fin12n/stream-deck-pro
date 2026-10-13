package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N4.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1242o extends A4.a {
    public static final Parcelable.Creator<C1242o> CREATOR = new C1253p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7244e;

    public C1242o() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 2, this.f7240a);
        A4.c.j(parcel, 3, this.f7241b);
        A4.c.j(parcel, 4, this.f7242c);
        A4.c.l(parcel, 5, this.f7243d);
        A4.c.j(parcel, 6, this.f7244e);
        A4.c.b(parcel, iA);
    }

    public C1242o(int i8, int i9, int i10, long j8, int i11) {
        this.f7240a = i8;
        this.f7241b = i9;
        this.f7242c = i10;
        this.f7243d = j8;
        this.f7244e = i11;
    }
}
