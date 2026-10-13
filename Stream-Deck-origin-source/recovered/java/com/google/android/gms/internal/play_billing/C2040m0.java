package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2040m0 implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2040m0 f18985a = new C2040m0();

    public static C2040m0 c() {
        return f18985a;
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final S0 a(Class cls) {
        if (!AbstractC2056q0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (S0) AbstractC2056q0.i(cls.asSubclass(AbstractC2056q0.class)).y(3, null, null);
        } catch (Exception e8) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final boolean b(Class cls) {
        return AbstractC2056q0.class.isAssignableFrom(cls);
    }
}
