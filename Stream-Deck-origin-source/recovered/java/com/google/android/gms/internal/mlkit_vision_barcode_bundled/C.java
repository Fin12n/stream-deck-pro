package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C extends A4.a {
    public static final Parcelable.Creator<C> CREATOR = new D();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17938b;

    public C(int i8, boolean z8) {
        this.f17937a = i8;
        this.f17938b = z8;
    }

    public final int a() {
        return this.f17937a;
    }

    public final boolean b() {
        return this.f17938b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 1, this.f17937a);
        A4.c.c(parcel, 2, this.f17938b);
        A4.c.b(parcel, iA);
    }
}
