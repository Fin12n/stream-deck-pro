package p219z4;

import A4.a;
import A4.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p195w4.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends a {
    public static final Parcelable.Creator<a0> CREATOR = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f39122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d[] f39123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C3196e f39125d;

    public a0(Bundle bundle, d[] dVarArr, int i8, C3196e c3196e) {
        this.f39122a = bundle;
        this.f39123b = dVarArr;
        this.f39124c = i8;
        this.f39125d = c3196e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = c.a(parcel);
        c.d(parcel, 1, this.f39122a, false);
        c.q(parcel, 2, this.f39123b, i8, false);
        c.j(parcel, 3, this.f39124c);
        c.m(parcel, 4, this.f39125d, i8, false);
        c.b(parcel, iA);
    }

    public a0() {
    }
}
