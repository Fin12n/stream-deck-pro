package H;

import A.InterfaceC0880k0;

/* JADX INFO: renamed from: H.w0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1011w0 implements u1, InterfaceC1017z0, L.r {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3257Q = InterfaceC0984i0.a.a("camerax.core.imageAnalysis.backpressureStrategy", A.S.b.class);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3258R = InterfaceC0984i0.a.a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3259S = InterfaceC0984i0.a.a("camerax.core.imageAnalysis.imageReaderProxyProvider", InterfaceC0880k0.class);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3260T = InterfaceC0984i0.a.a("camerax.core.imageAnalysis.outputImageFormat", A.S.e.class);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3261U = InterfaceC0984i0.a.a("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3262V = InterfaceC0984i0.a.a("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final T0 f3263P;

    public C1011w0(T0 t8) {
        this.f3263P = t8;
    }

    public int f0(int i8) {
        return ((Integer) f(f3257Q, Integer.valueOf(i8))).intValue();
    }

    public int g0(int i8) {
        return ((Integer) f(f3258R, Integer.valueOf(i8))).intValue();
    }

    public InterfaceC0880k0 h0() {
        p063h.s.a(f(f3259S, null));
        return null;
    }

    public Boolean i0(Boolean bool) {
        return (Boolean) f(f3261U, bool);
    }

    public int j0(int i8) {
        return ((Integer) f(f3260T, Integer.valueOf(i8))).intValue();
    }

    public Boolean k0(Boolean bool) {
        return (Boolean) f(f3262V, bool);
    }

    @Override // H.a1
    public InterfaceC0984i0 q() {
        return this.f3263P;
    }

    @Override // H.InterfaceC1015y0
    public int u() {
        return 35;
    }
}
