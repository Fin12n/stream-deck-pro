package N4;

import android.os.Parcel;
import android.os.Parcelable;
import p219z4.AbstractC3206o;

/* JADX INFO: renamed from: N4.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1170i extends A4.a {
    public static final Parcelable.Creator<C1170i> CREATOR = new C1182j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7134b;

    public C1170i() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1170i)) {
            return false;
        }
        C1170i c1170i = (C1170i) obj;
        return this.f7133a == c1170i.f7133a && AbstractC3206o.a(Boolean.valueOf(this.f7134b), Boolean.valueOf(c1170i.f7134b));
    }

    public final int hashCode() {
        return AbstractC3206o.b(Integer.valueOf(this.f7133a), Boolean.valueOf(this.f7134b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 2, this.f7133a);
        A4.c.c(parcel, 3, this.f7134b);
        A4.c.b(parcel, iA);
    }

    public C1170i(int i8, boolean z8) {
        this.f7133a = i8;
        this.f7134b = z8;
    }
}
