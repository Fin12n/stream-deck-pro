package p219z4;

import A4.a;
import A4.c;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: z4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C3196e extends a {
    public static final Parcelable.Creator<C3196e> CREATOR = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f39173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f39176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f39178f;

    public C3196e(r rVar, boolean z8, boolean z9, int[] iArr, int i8, int[] iArr2) {
        this.f39173a = rVar;
        this.f39174b = z8;
        this.f39175c = z9;
        this.f39176d = iArr;
        this.f39177e = i8;
        this.f39178f = iArr2;
    }

    public int a() {
        return this.f39177e;
    }

    public int[] b() {
        return this.f39176d;
    }

    public int[] c() {
        return this.f39178f;
    }

    public boolean d() {
        return this.f39174b;
    }

    public boolean e() {
        return this.f39175c;
    }

    public final r f() {
        return this.f39173a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = c.a(parcel);
        c.m(parcel, 1, this.f39173a, i8, false);
        c.c(parcel, 2, d());
        c.c(parcel, 3, e());
        c.k(parcel, 4, b(), false);
        c.j(parcel, 5, a());
        c.k(parcel, 6, c(), false);
        c.b(parcel, iA);
    }
}
