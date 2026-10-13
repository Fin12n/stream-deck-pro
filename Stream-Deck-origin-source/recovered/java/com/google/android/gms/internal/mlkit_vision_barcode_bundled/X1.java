package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class X1 extends C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1875c2 f18044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public F0 f18045b = b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1885e2 f18046c;

    public X1(C1885e2 c1885e2) {
        this.f18046c = c1885e2;
        this.f18044a = new C1875c2(c1885e2, null);
    }

    public final F0 b() {
        C1875c2 c1875c2 = this.f18044a;
        if (c1875c2.hasNext()) {
            return c1875c2.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18045b != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F0
    public final byte zza() {
        F0 f8 = this.f18045b;
        if (f8 == null) {
            throw new NoSuchElementException();
        }
        byte bZza = f8.zza();
        if (!this.f18045b.hasNext()) {
            this.f18045b = b();
        }
        return bZza;
    }
}
