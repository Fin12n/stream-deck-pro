package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class B1 extends AbstractList implements RandomAccess, F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F0 f18745a;

    public B1(F0 f8) {
        this.f18745a = f8;
    }

    @Override // com.google.android.gms.internal.play_billing.F0
    public final List d() {
        return this.f18745a.d();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        return ((E0) this.f18745a).get(i8);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new A1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i8) {
        return new C2085z1(this, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.F0
    public final Object n(int i8) {
        return this.f18745a.n(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18745a.size();
    }

    @Override // com.google.android.gms.internal.play_billing.F0
    public final F0 f() {
        return this;
    }
}
