package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N4.t5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1302t5 extends A4.a {
    public static final Parcelable.Creator<C1302t5> CREATOR = new C1098c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f7326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f7327b;

    public C1302t5() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.f(parcel, 2, this.f7326a);
        A4.c.f(parcel, 3, this.f7327b);
        A4.c.b(parcel, iA);
    }

    public C1302t5(double d8, double d9) {
        this.f7326a = d8;
        this.f7327b = d9;
    }
}
