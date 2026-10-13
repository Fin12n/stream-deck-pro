package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2003d extends AbstractC2077x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18880b;

    public AbstractC2003d(int i8, int i9) {
        AbstractC1995b.b(i9, i8, "index");
        this.f18879a = i8;
        this.f18880b = i9;
    }

    public abstract Object b(int i8);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f18880b < this.f18879a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18880b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f18880b;
        this.f18880b = i8 + 1;
        return b(i8);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18880b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f18880b - 1;
        this.f18880b = i8;
        return b(i8);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18880b - 1;
    }
}
