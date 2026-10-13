package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.i2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1905i2 extends AbstractC1940p2 {
    public C1905i2() {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1940p2
    public final void a() {
        if (!j()) {
            for (int i8 = 0; i8 < c(); i8++) {
                ((Z0) ((C1910j2) g(i8)).a()).o();
            }
            Iterator it = d().iterator();
            while (it.hasNext()) {
                ((Z0) ((Map.Entry) it.next()).getKey()).o();
            }
        }
        super.a();
    }
}
