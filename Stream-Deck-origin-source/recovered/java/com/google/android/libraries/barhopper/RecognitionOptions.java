package com.google.android.libraries.barhopper;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class RecognitionOptions {
    private int barcodeFormats = 0;
    private boolean outputUnrecognizedBarcodes = false;
    private boolean useQrMobilenetV3 = false;
    private boolean enableQrAlignmentGrid = true;
    private boolean enableUseKeypointAsFinderPattern = true;
    private boolean useHalideAffineCrop = false;
    private MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
    private MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
    private OnedRecognitionOptions onedRecognitionOptions = new OnedRecognitionOptions();
    private boolean qrEnableFourthCornerApproximation = false;

    public void a(int i8) {
        this.barcodeFormats = i8;
    }

    public void b(boolean z8) {
        this.enableQrAlignmentGrid = z8;
    }

    public void c(boolean z8) {
        this.enableUseKeypointAsFinderPattern = z8;
    }

    public void d(MultiScaleDecodingOptions multiScaleDecodingOptions) {
        this.multiScaleDecodingOptions = multiScaleDecodingOptions;
    }

    public void e(MultiScaleDetectionOptions multiScaleDetectionOptions) {
        this.multiScaleDetectionOptions = multiScaleDetectionOptions;
    }

    public void f(boolean z8) {
        this.outputUnrecognizedBarcodes = z8;
    }

    public void g(boolean z8) {
        this.qrEnableFourthCornerApproximation = z8;
    }
}
