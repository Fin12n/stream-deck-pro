package H;

import A.C0864c0;
import A.InterfaceC0880k0;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: H.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1013x0 implements u1, InterfaceC1017z0, L.i {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3269Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3270R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3271S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3272T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3273U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3274V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3275W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3276X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3277Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3278Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3279a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3280b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3281c0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final T0 f3282P;

    public C1013x0(T0 t8) {
        this.f3282P = t8;
    }

    public InterfaceC0978f0 f0(InterfaceC0978f0 interfaceC0978f0) {
        return (InterfaceC0978f0) f(f3271S, interfaceC0978f0);
    }

    public int g0() {
        return ((Integer) h(f3269Q)).intValue();
    }

    public int h0(int i8) {
        return ((Integer) f(f3270R, Integer.valueOf(i8))).intValue();
    }

    public int i0(int i8) {
        return ((Integer) f(f3277Y, Integer.valueOf(i8))).intValue();
    }

    public InterfaceC0880k0 j0() {
        p063h.s.a(f(f3275W, null));
        return null;
    }

    public Executor k0(Executor executor) {
        return (Executor) f(L.i.f4771L, executor);
    }

    public C0864c0.i l0() {
        return (C0864c0.i) f(f3279a0, null);
    }

    public boolean m0() {
        return e(f3269Q);
    }

    @Override // H.a1
    public InterfaceC0984i0 q() {
        return this.f3282P;
    }

    @Override // H.InterfaceC1015y0
    public int u() {
        return ((Integer) h(InterfaceC1015y0.f3283j)).intValue();
    }

    static {
        Class cls = Integer.TYPE;
        f3269Q = InterfaceC0984i0.a.a("camerax.core.imageCapture.captureMode", cls);
        f3270R = InterfaceC0984i0.a.a("camerax.core.imageCapture.flashMode", cls);
        f3271S = InterfaceC0984i0.a.a("camerax.core.imageCapture.captureBundle", InterfaceC0978f0.class);
        f3272T = InterfaceC0984i0.a.a("camerax.core.imageCapture.bufferFormat", Integer.class);
        f3273U = InterfaceC0984i0.a.a(ajyWhveMDgQ.jJirHgUuOqkZg, Integer.class);
        f3274V = InterfaceC0984i0.a.a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        f3275W = InterfaceC0984i0.a.a("camerax.core.imageCapture.imageReaderProxyProvider", InterfaceC0880k0.class);
        f3276X = InterfaceC0984i0.a.a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
        f3277Y = InterfaceC0984i0.a.a("camerax.core.imageCapture.flashType", cls);
        f3278Z = InterfaceC0984i0.a.a("camerax.core.imageCapture.jpegCompressionQuality", cls);
        f3279a0 = InterfaceC0984i0.a.a("camerax.core.imageCapture.screenFlash", C0864c0.i.class);
        f3280b0 = InterfaceC0984i0.a.a("camerax.core.useCase.postviewResolutionSelector", T.c.class);
        f3281c0 = InterfaceC0984i0.a.a("camerax.core.useCase.isPostviewEnabled", Boolean.class);
    }
}
