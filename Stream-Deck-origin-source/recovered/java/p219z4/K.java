package p219z4;

import A4.a;
import A4.c;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p195w4.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class K extends a {
    public static final Parcelable.Creator<K> CREATOR = new L();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f39099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f39100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f39101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f39102e;

    public K(int i8, IBinder iBinder, b bVar, boolean z8, boolean z9) {
        this.f39098a = i8;
        this.f39099b = iBinder;
        this.f39100c = bVar;
        this.f39101d = z8;
        this.f39102e = z9;
    }

    public final b a() {
        return this.f39100c;
    }

    public final InterfaceC3201j b() {
        IBinder iBinder = this.f39099b;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC3201j.a.c(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k8 = (K) obj;
        return this.f39100c.equals(k8.f39100c) && AbstractC3206o.a(b(), k8.b());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = c.a(parcel);
        c.j(parcel, 1, this.f39098a);
        c.i(parcel, 2, this.f39099b, false);
        c.m(parcel, 3, this.f39100c, i8, false);
        c.c(parcel, 4, this.f39101d);
        c.c(parcel, 5, this.f39102e);
        c.b(parcel, iA);
    }
}
