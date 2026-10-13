package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2055q extends AbstractC2027j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f19001c;

    public C2055q(r rVar) {
        this.f19001c = rVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        AbstractC1995b.a(i8, this.f19001c.f19004e, "index");
        int i9 = i8 + i8;
        Object obj = this.f19001c.f19003d[i9];
        Objects.requireNonNull(obj);
        Object obj2 = this.f19001c.f19003d[i9 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19001c.f19004e;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2015g
    public final boolean z() {
        return true;
    }
}
