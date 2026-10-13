package O4;

/* JADX INFO: renamed from: O4.s3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1502s3 implements InterfaceC1422h {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8448a;

    EnumC1502s3(int i8) {
        this.f8448a = i8;
    }

    @Override // O4.InterfaceC1422h
    public final int zza() {
        return this.f8448a;
    }
}
