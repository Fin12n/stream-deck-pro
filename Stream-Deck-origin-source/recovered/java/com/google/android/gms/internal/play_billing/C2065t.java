package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2065t extends AbstractC2027j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f19012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f19013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f19014e;

    public C2065t(Object[] objArr, int i8, int i9) {
        this.f19012c = objArr;
        this.f19013d = i8;
        this.f19014e = i9;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC1995b.a(i8, this.f19014e, "index");
        Object obj = this.f19012c[i8 + i8 + this.f19013d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19014e;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2015g
    public final boolean z() {
        return true;
    }
}
