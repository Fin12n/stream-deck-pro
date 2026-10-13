package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2051p extends AbstractC2027j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC2027j f18994e = new C2051p(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f18995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f18996d;

    public C2051p(Object[] objArr, int i8) {
        this.f18995c = objArr;
        this.f18996d = i8;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2015g
    public final Object[] A() {
        return this.f18995c;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2027j, com.google.android.gms.internal.play_billing.AbstractC2015g
    public final int c(Object[] objArr, int i8) {
        System.arraycopy(this.f18995c, 0, objArr, 0, this.f18996d);
        return this.f18996d;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC1995b.a(i8, this.f18996d, "index");
        Object obj = this.f18995c[i8];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2015g
    public final int o() {
        return this.f18996d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18996d;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2015g
    public final int t() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2015g
    public final boolean z() {
        return false;
    }
}
