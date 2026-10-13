package com.google.mlkit.vision.barcode.bundled.internal;

import H4.a;
import H4.b;
import android.content.Context;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.S;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class ThickBarcodeScannerCreator extends S {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.T
    public P newBarcodeScanner(a aVar, C c8) {
        return new p164s5.a((Context) b.d(aVar), c8);
    }
}
