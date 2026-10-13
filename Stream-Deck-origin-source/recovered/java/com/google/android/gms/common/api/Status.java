package com.google.android.gms.common.api;

import A4.a;
import A4.c;
import P2.Lsk.mHPawN;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p195w4.b;
import p203x4.d;
import p203x4.n;
import p219z4.AbstractC3206o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Status extends a implements ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f17909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f17910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Status f17899e = new Status(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Status f17900f = new Status(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Status f17901g = new Status(14);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Status f17902h = new Status(8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Status f17903i = new Status(15);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Status f17904j = new Status(16);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Status f17906l = new Status(17);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Status f17905k = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new n();

    public Status(int i8, String str, PendingIntent pendingIntent, b bVar) {
        this.f17907a = i8;
        this.f17908b = str;
        this.f17909c = pendingIntent;
        this.f17910d = bVar;
    }

    public b a() {
        return this.f17910d;
    }

    public int b() {
        return this.f17907a;
    }

    public String c() {
        return this.f17908b;
    }

    public boolean d() {
        return this.f17909c != null;
    }

    public boolean e() {
        return this.f17907a <= 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f17907a == status.f17907a && AbstractC3206o.a(this.f17908b, status.f17908b) && AbstractC3206o.a(this.f17909c, status.f17909c) && AbstractC3206o.a(this.f17910d, status.f17910d);
    }

    public final String f() {
        String str = this.f17908b;
        return str != null ? str : d.a(this.f17907a);
    }

    public int hashCode() {
        return AbstractC3206o.b(Integer.valueOf(this.f17907a), this.f17908b, this.f17909c, this.f17910d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int iA = c.a(parcel);
        c.j(parcel, 1, b());
        c.n(parcel, 2, c(), false);
        c.m(parcel, 3, this.f17909c, i8, false);
        c.m(parcel, 4, a(), i8, false);
        c.b(parcel, iA);
    }

    public Status(int i8) {
        this(i8, (String) null);
    }

    public Status(b bVar, String str) {
        this(bVar, str, 17);
    }

    public String toString() {
        AbstractC3206o.a aVarC = AbstractC3206o.c(this);
        aVarC.a(mHPawN.jgBKLcK, f());
        aVarC.a("resolution", this.f17909c);
        return aVarC.toString();
    }

    public Status(int i8, String str) {
        this(i8, str, (PendingIntent) null);
    }

    @Deprecated
    public Status(b bVar, String str, int i8) {
        this(i8, str, bVar.c(), bVar);
    }

    public Status(int i8, String str, PendingIntent pendingIntent) {
        this(i8, str, pendingIntent, null);
    }
}
