package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2023i extends AbstractC2027j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f18909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f18910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC2027j f18911e;

    public C2023i(AbstractC2027j abstractC2027j, int i8, int i9) {
        this.f18911e = abstractC2027j;
        this.f18909c = i8;
        this.f18910d = i9;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2015g
    public final Object[] A() {
        return this.f18911e.A();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2027j
    /* JADX INFO: renamed from: D */
    public final AbstractC2027j subList(int i8, int i9) {
        AbstractC1995b.d(i8, i9, this.f18910d);
        int i10 = this.f18909c;
        return this.f18911e.subList(i8 + i10, i9 + i10);
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC1995b.a(i8, this.f18910d, "index");
        return this.f18911e.get(i8 + this.f18909c);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2015g
    public final int o() {
        return this.f18911e.t() + this.f18909c + this.f18910d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18910d;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2027j, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i8, int i9) {
        return subList(i8, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2015g
    public final int t() {
        return this.f18911e.t() + this.f18909c;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2015g
    public final boolean z() {
        return true;
    }
}
