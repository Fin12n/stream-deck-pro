package H;

import G.InterfaceC0964x;
import Z.JTT.ryTuoS;
import android.util.Range;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface u1 extends L.q, InterfaceC1015y0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3216A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3217B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3218C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3219D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3220E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3221F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3222G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3223H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3224I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3225J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3226K;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3227w = InterfaceC0984i0.a.a("camerax.core.useCase.defaultSessionConfig", c1.class);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3228x = InterfaceC0984i0.a.a("camerax.core.useCase.defaultCaptureConfig", C0980g0.class);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3229y = InterfaceC0984i0.a.a("camerax.core.useCase.sessionConfigUnpacker", c1.e.class);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3230z = InterfaceC0984i0.a.a("camerax.core.useCase.captureConfigUnpacker", C0980g0.b.class);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements G.X.b {
        public a() {
        }

        @Override // G.X.b
        public G.X a(InterfaceC0964x interfaceC0964x) {
            return new G.b0(interfaceC0964x);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b extends A.K {
        u1 b();
    }

    default c1 A() {
        return (c1) h(f3227w);
    }

    default boolean B(boolean z8) {
        return ((Boolean) f(f3220E, Boolean.valueOf(z8))).booleanValue();
    }

    default C0980g0 G(C0980g0 c0980g0) {
        return (C0980g0) f(f3228x, c0980g0);
    }

    default C0980g0.b H(C0980g0.b bVar) {
        return (C0980g0.b) f(f3230z, bVar);
    }

    default h1 N() {
        h1 h1Var = (h1) f(f3226K, h1.DEFAULT);
        Objects.requireNonNull(h1Var);
        return h1Var;
    }

    default v1.b O() {
        return (v1.b) h(f3222G);
    }

    default int P() {
        return ((Integer) f(f3224I, 0)).intValue();
    }

    default Range R(Range range) {
        return (Range) f(f3218C, range);
    }

    default int U(int i8) {
        return ((Integer) f(f3216A, Integer.valueOf(i8))).intValue();
    }

    default int W() {
        return ((Integer) f(f3223H, 0)).intValue();
    }

    default boolean X() {
        Boolean bool = (Boolean) f(f3219D, Boolean.FALSE);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    default boolean a0(boolean z8) {
        return ((Boolean) f(f3221F, Boolean.valueOf(z8))).booleanValue();
    }

    default boolean c0() {
        return e(f3218C);
    }

    default c1.e l(c1.e eVar) {
        return (c1.e) f(f3229y, eVar);
    }

    default c1 m(c1 c1Var) {
        return (c1) f(f3227w, c1Var);
    }

    default int t(int i8) {
        return ((Integer) f(f3217B, Integer.valueOf(i8))).intValue();
    }

    default G.X.b x() {
        G.X.b bVar = (G.X.b) f(f3225J, new a());
        Objects.requireNonNull(bVar);
        return bVar;
    }

    static {
        String str = uYOhHhTXuF.Pebln;
        Class cls = Integer.TYPE;
        f3216A = InterfaceC0984i0.a.a(str, cls);
        f3217B = InterfaceC0984i0.a.a("camerax.core.useCase.sessionType", cls);
        f3218C = InterfaceC0984i0.a.a("camerax.core.useCase.targetFrameRate", Range.class);
        f3219D = InterfaceC0984i0.a.a("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class);
        Class cls2 = Boolean.TYPE;
        f3220E = InterfaceC0984i0.a.a("camerax.core.useCase.zslDisabled", cls2);
        f3221F = InterfaceC0984i0.a.a(ryTuoS.thgkCJt, cls2);
        f3222G = InterfaceC0984i0.a.a("camerax.core.useCase.captureType", v1.b.class);
        f3223H = InterfaceC0984i0.a.a("camerax.core.useCase.previewStabilizationMode", cls);
        f3224I = InterfaceC0984i0.a.a("camerax.core.useCase.videoStabilizationMode", cls);
        f3225J = InterfaceC0984i0.a.a("camerax.core.useCase.takePictureManagerProvider", G.X.b.class);
        f3226K = InterfaceC0984i0.a.a("camerax.core.useCase.streamUseCase", h1.class);
    }
}
