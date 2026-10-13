package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.f1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1889f1 extends AbstractC1957t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1914k1 f18124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC1914k1 f18125b;

    public AbstractC1889f1(AbstractC1914k1 abstractC1914k1) {
        this.f18124a = abstractC1914k1;
        if (abstractC1914k1.F()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f18125b = abstractC1914k1.p();
    }

    public static void k(Object obj, Object obj2) {
        U1.a().b(obj.getClass()).e(obj, obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1
    public final boolean e() {
        return AbstractC1914k1.E(this.f18125b, false);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1957t0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final AbstractC1889f1 clone() {
        AbstractC1889f1 abstractC1889f1 = (AbstractC1889f1) this.f18124a.I(5, null, null);
        abstractC1889f1.f18125b = A();
        return abstractC1889f1;
    }

    public final AbstractC1889f1 m(AbstractC1914k1 abstractC1914k1) {
        if (!this.f18124a.equals(abstractC1914k1)) {
            if (!this.f18125b.F()) {
                r();
            }
            k(this.f18125b, abstractC1914k1);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final AbstractC1914k1 y() {
        AbstractC1914k1 abstractC1914k1A = A();
        if (AbstractC1914k1.E(abstractC1914k1A, true)) {
            return abstractC1914k1A;
        }
        throw new C1949r2(abstractC1914k1A);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC1914k1 A() {
        if (!this.f18125b.F()) {
            return this.f18125b;
        }
        this.f18125b.z();
        return this.f18125b;
    }

    public final void q() {
        if (this.f18125b.F()) {
            return;
        }
        r();
    }

    public void r() {
        AbstractC1914k1 abstractC1914k1P = this.f18124a.p();
        k(abstractC1914k1P, this.f18125b);
        this.f18125b = abstractC1914k1P;
    }
}
