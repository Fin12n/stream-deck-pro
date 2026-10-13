package O4;

/* JADX INFO: renamed from: O4.y3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1544y3 implements InterfaceC1422h {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8669a;

    EnumC1544y3(int i8) {
        this.f8669a = i8;
    }

    @Override // O4.InterfaceC1422h
    public final int zza() {
        return this.f8669a;
    }
}
