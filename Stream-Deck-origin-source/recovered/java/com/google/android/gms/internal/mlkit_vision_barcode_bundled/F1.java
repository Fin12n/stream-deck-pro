package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class F1 implements InterfaceC1895g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final K1 f17947b = new D1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K1 f17948a;

    public F1() {
        C1884e1 c1884e1C = C1884e1.c();
        U1 u8 = U1.f18028c;
        E1 e8 = new E1(c1884e1C, f17947b);
        Charset charset = AbstractC1953s1.f18650a;
        this.f17948a = e8;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1895g2
    public final InterfaceC1890f2 a(Class cls) {
        AbstractC1954s2 abstractC1954s2 = AbstractC1900h2.f18578a;
        if (!AbstractC1914k1.class.isAssignableFrom(cls)) {
            U1 u8 = U1.f18028c;
        }
        J1 j1A = this.f17948a.a(cls);
        if (j1A.zzb()) {
            U1 u9 = U1.f18028c;
            return Q1.j(AbstractC1900h2.r(), Y0.a(), j1A.zza());
        }
        U1 u10 = U1.f18028c;
        return P1.A(cls, j1A, T1.a(), C1.a(), AbstractC1900h2.r(), j1A.j() + (-1) != 1 ? Y0.a() : null, I1.a());
    }
}
