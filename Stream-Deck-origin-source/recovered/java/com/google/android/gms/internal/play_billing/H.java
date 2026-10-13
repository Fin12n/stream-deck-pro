package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class H extends J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18769a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S f18771c;

    public H(S s8) {
        this.f18771c = s8;
        this.f18770b = s8.t();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18769a < this.f18770b;
    }

    @Override // com.google.android.gms.internal.play_billing.L
    public final byte zza() {
        int i8 = this.f18769a;
        if (i8 >= this.f18770b) {
            throw new NoSuchElementException();
        }
        this.f18769a = i8 + 1;
        return this.f18771c.o(i8);
    }
}
