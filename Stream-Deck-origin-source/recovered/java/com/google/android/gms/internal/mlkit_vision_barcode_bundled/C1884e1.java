package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1884e1 implements K1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1884e1 f18117a = new C1884e1();

    public static C1884e1 c() {
        return f18117a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1
    public final J1 a(Class cls) {
        if (!AbstractC1914k1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (J1) AbstractC1914k1.o(cls.asSubclass(AbstractC1914k1.class)).I(3, null, null);
        } catch (Exception e8) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1
    public final boolean b(Class cls) {
        return AbstractC1914k1.class.isAssignableFrom(cls);
    }
}
