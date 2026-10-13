package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1986z extends A4.a {
    public static final Parcelable.Creator<C1986z> CREATOR = new A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f18704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Point[] f18705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1951s f18707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1966v f18708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1971w f18709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C1981y f18710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1976x f18711k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1956t f18712l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1937p f18713m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1942q f18714n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r f18715o;

    public C1986z(int i8, String str, String str2, byte[] bArr, Point[] pointArr, int i9, C1951s c1951s, C1966v c1966v, C1971w c1971w, C1981y c1981y, C1976x c1976x, C1956t c1956t, C1937p c1937p, C1942q c1942q, r rVar) {
        this.f18701a = i8;
        this.f18702b = str;
        this.f18703c = str2;
        this.f18704d = bArr;
        this.f18705e = pointArr;
        this.f18706f = i9;
        this.f18707g = c1951s;
        this.f18708h = c1966v;
        this.f18709i = c1971w;
        this.f18710j = c1981y;
        this.f18711k = c1976x;
        this.f18712l = c1956t;
        this.f18713m = c1937p;
        this.f18714n = c1942q;
        this.f18715o = rVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f18701a;
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 1, i9);
        A4.c.n(parcel, 2, this.f18702b, false);
        A4.c.n(parcel, 3, this.f18703c, false);
        A4.c.e(parcel, 4, this.f18704d, false);
        A4.c.q(parcel, 5, this.f18705e, i8, false);
        A4.c.j(parcel, 6, this.f18706f);
        A4.c.m(parcel, 7, this.f18707g, i8, false);
        A4.c.m(parcel, 8, this.f18708h, i8, false);
        A4.c.m(parcel, 9, this.f18709i, i8, false);
        A4.c.m(parcel, 10, this.f18710j, i8, false);
        A4.c.m(parcel, 11, this.f18711k, i8, false);
        A4.c.m(parcel, 12, this.f18712l, i8, false);
        A4.c.m(parcel, 13, this.f18713m, i8, false);
        A4.c.m(parcel, 14, this.f18714n, i8, false);
        A4.c.m(parcel, 15, this.f18715o, i8, false);
        A4.c.b(parcel, iA);
    }
}
