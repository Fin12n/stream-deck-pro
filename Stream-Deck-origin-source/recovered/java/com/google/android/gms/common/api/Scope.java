package com.google.android.gms.common.api;

import A4.a;
import A4.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p203x4.m;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17898b;

    public Scope(int i8, String str) {
        AbstractC3207p.f(str, "scopeUri must not be null or empty");
        this.f17897a = i8;
        this.f17898b = str;
    }

    public String a() {
        return this.f17898b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f17898b.equals(((Scope) obj).f17898b);
        }
        return false;
    }

    public int hashCode() {
        return this.f17898b.hashCode();
    }

    public String toString() {
        return this.f17898b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f17897a;
        int iA = c.a(parcel);
        c.j(parcel, 1, i9);
        c.n(parcel, 2, a(), false);
        c.b(parcel, iA);
    }

    public Scope(String str) {
        this(1, str);
    }
}
