package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class N0 implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T0[] f18797a;

    public N0(T0... t0Arr) {
        this.f18797a = t0Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final S0 a(Class cls) {
        for (int i8 = 0; i8 < 2; i8++) {
            T0 t8 = this.f18797a[i8];
            if (t8.b(cls)) {
                return t8.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final boolean b(Class cls) {
        for (int i8 = 0; i8 < 2; i8++) {
            if (this.f18797a[i8].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
