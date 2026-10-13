package p219z4;

import A4.a;
import A4.c;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class r extends a {
    public static final Parcelable.Creator<r> CREATOR = new T();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39251e;

    public r(int i8, boolean z8, boolean z9, int i9, int i10) {
        this.f39247a = i8;
        this.f39248b = z8;
        this.f39249c = z9;
        this.f39250d = i9;
        this.f39251e = i10;
    }

    public int a() {
        return this.f39250d;
    }

    public int b() {
        return this.f39251e;
    }

    public boolean c() {
        return this.f39248b;
    }

    public boolean d() {
        return this.f39249c;
    }

    public int e() {
        return this.f39247a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = c.a(parcel);
        c.j(parcel, 1, e());
        c.c(parcel, 2, c());
        c.c(parcel, 3, d());
        c.j(parcel, 4, a());
        c.j(parcel, 5, b());
        c.b(parcel, iA);
    }
}
