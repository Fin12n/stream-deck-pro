package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class O0 implements InterfaceC2021h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T0 f18812b = new M0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T0 f18813a;

    public O0() {
        T0 t8;
        C2040m0 c2040m0C = C2040m0.c();
        try {
            t8 = (T0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            t8 = f18812b;
        }
        N0 n8 = new N0(c2040m0C, t8);
        Charset charset = AbstractC2081y0.f19031a;
        this.f18813a = n8;
    }

    public static boolean b(S0 s8) {
        return s8.j() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2021h1
    public final InterfaceC2017g1 a(Class cls) {
        AbstractC2025i1.y(cls);
        S0 s0A = this.f18813a.a(cls);
        if (s0A.zzb()) {
            return AbstractC2056q0.class.isAssignableFrom(cls) ? Z0.j(AbstractC2025i1.u(), AbstractC2020h0.b(), s0A.zza()) : Z0.j(AbstractC2025i1.t(), AbstractC2020h0.a(), s0A.zza());
        }
        if (AbstractC2056q0.class.isAssignableFrom(cls)) {
            return b(s0A) ? Y0.A(cls, s0A, AbstractC1997b1.b(), L0.d(), AbstractC2025i1.u(), AbstractC2020h0.b(), R0.b()) : Y0.A(cls, s0A, AbstractC1997b1.b(), L0.d(), AbstractC2025i1.u(), null, R0.b());
        }
        return b(s0A) ? Y0.A(cls, s0A, AbstractC1997b1.a(), L0.c(), AbstractC2025i1.t(), AbstractC2020h0.a(), R0.a()) : Y0.A(cls, s0A, AbstractC1997b1.a(), L0.c(), AbstractC2025i1.t(), null, R0.a());
    }
}
