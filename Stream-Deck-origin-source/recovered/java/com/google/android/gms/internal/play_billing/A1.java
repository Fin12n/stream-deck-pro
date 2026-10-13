package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class A1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f18728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B1 f18729b;

    public A1(B1 b8) {
        this.f18729b = b8;
        this.f18728a = b8.f18745a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18728a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f18728a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
