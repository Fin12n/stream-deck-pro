package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.c2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1875c2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f18115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public H0 f18116b;

    public /* synthetic */ C1875c2(J0 j8, AbstractC1870b2 abstractC1870b2) {
        if (!(j8 instanceof C1885e2)) {
            this.f18115a = null;
            this.f18116b = (H0) j8;
            return;
        }
        C1885e2 c1885e2 = (C1885e2) j8;
        ArrayDeque arrayDeque = new ArrayDeque(c1885e2.A());
        this.f18115a = arrayDeque;
        arrayDeque.push(c1885e2);
        this.f18116b = c(c1885e2.f18120d);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final H0 next() {
        H0 h0C;
        H0 h8 = this.f18116b;
        if (h8 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f18115a;
            h0C = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            h0C = c(((C1885e2) this.f18115a.pop()).f18121e);
        } while (h0C.y() == 0);
        this.f18116b = h0C;
        return h8;
    }

    public final H0 c(J0 j8) {
        while (j8 instanceof C1885e2) {
            C1885e2 c1885e2 = (C1885e2) j8;
            this.f18115a.push(c1885e2);
            j8 = c1885e2.f18120d;
        }
        return (H0) j8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18116b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
