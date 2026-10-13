package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.g1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1894g1 extends AbstractC1889f1 implements N1 {
    public AbstractC1894g1(AbstractC1899h1 abstractC1899h1) {
        super(abstractC1899h1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1889f1
    public final void r() {
        super.r();
        if (((AbstractC1899h1) this.f18125b).zzb != C1864a1.d()) {
            AbstractC1899h1 abstractC1899h1 = (AbstractC1899h1) this.f18125b;
            abstractC1899h1.zzb = abstractC1899h1.zzb.clone();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1889f1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final AbstractC1899h1 A() {
        if (!((AbstractC1899h1) this.f18125b).F()) {
            return (AbstractC1899h1) this.f18125b;
        }
        ((AbstractC1899h1) this.f18125b).zzb.g();
        return (AbstractC1899h1) super.A();
    }
}
