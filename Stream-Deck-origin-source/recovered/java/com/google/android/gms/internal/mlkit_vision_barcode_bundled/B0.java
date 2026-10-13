package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class B0 extends C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17934a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J0 f17936c;

    public B0(J0 j8) {
        this.f17936c = j8;
        this.f17935b = j8.y();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17934a < this.f17935b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F0
    public final byte zza() {
        int i8 = this.f17934a;
        if (i8 >= this.f17935b) {
            throw new NoSuchElementException();
        }
        this.f17934a = i8 + 1;
        return this.f17936c.o(i8);
    }
}
