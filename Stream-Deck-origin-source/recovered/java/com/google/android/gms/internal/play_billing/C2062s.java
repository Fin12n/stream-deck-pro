package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2062s extends AbstractC2043n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient AbstractC2039m f19010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient AbstractC2027j f19011d;

    public C2062s(AbstractC2039m abstractC2039m, AbstractC2027j abstractC2027j) {
        this.f19010c = abstractC2039m;
        this.f19011d = abstractC2027j;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2015g
    public final int c(Object[] objArr, int i8) {
        return this.f19011d.c(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2015g, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f19010c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f19011d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19010c.size();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2043n, com.google.android.gms.internal.play_billing.AbstractC2015g
    public final AbstractC2027j y() {
        return this.f19011d;
    }
}
