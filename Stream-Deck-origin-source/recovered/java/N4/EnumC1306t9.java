package N4;

/* JADX INFO: renamed from: N4.t9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1306t9 implements O0 {
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    TEZ_CODE(16);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7345a;

    EnumC1306t9(int i8) {
        this.f7345a = i8;
    }

    @Override // N4.O0
    public final int zza() {
        return this.f7345a;
    }
}
