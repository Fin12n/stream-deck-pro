package com.google.android.libraries.barhopper;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class MultiScaleDecodingOptions {
    private float[] extraScales = new float[0];
    private int minimumDetectedDimension = 10;
    private boolean skipProcessingIfBarcodeFound = true;

    public void a(float[] fArr) {
        this.extraScales = fArr;
    }

    public void b(int i8) {
        this.minimumDetectedDimension = i8;
    }

    public void c(boolean z8) {
        this.skipProcessingIfBarcodeFound = z8;
    }
}
