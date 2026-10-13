package A;

import H.InterfaceC0984i0;
import H.v1;
import android.os.Handler;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class G implements L.q {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final InterfaceC0984i0.a f63Q = InterfaceC0984i0.a.a("camerax.core.appConfig.cameraFactoryProvider", H.H.a.class);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final InterfaceC0984i0.a f64R = InterfaceC0984i0.a.a("camerax.core.appConfig.deviceSurfaceManagerProvider", H.G.a.class);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final InterfaceC0984i0.a f65S = InterfaceC0984i0.a.a("camerax.core.appConfig.useCaseConfigFactoryProvider", v1.c.class);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final InterfaceC0984i0.a f66T = InterfaceC0984i0.a.a("camerax.core.appConfig.cameraExecutor", Executor.class);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final InterfaceC0984i0.a f67U = InterfaceC0984i0.a.a("camerax.core.appConfig.schedulerHandler", Handler.class);

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final InterfaceC0984i0.a f68V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final InterfaceC0984i0.a f69W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final InterfaceC0984i0.a f70X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final InterfaceC0984i0.a f71Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final InterfaceC0984i0.a f72Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final InterfaceC0984i0.a f73a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final InterfaceC0984i0.a f74b0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final H.T0 f75P;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final H.O0 f76a;

        public a() {
            this(H.O0.i0());
        }

        public G a() {
            return new G(H.T0.h0(this.f76a));
        }

        public H.N0 b() {
            return this.f76a;
        }

        public a c(H.H.a aVar) {
            b().L(G.f63Q, aVar);
            return this;
        }

        public a d(int i8) {
            b().L(G.f73a0, Integer.valueOf(i8));
            return this;
        }

        public a e(H.G.a aVar) {
            b().L(G.f64R, aVar);
            return this;
        }

        public a f(boolean z8) {
            b().L(G.f74b0, Boolean.valueOf(z8));
            return this;
        }

        public a g(Class cls) {
            b().L(L.q.f4795N, cls);
            if (b().f(L.q.f4794M, null) == null) {
                h(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a h(String str) {
            b().L(L.q.f4794M, str);
            return this;
        }

        public a i(v1.c cVar) {
            b().L(G.f65S, cVar);
            return this;
        }

        public a(H.O0 o8) {
            this.f76a = o8;
            Class cls = (Class) o8.f(L.q.f4795N, null);
            if (cls == null || cls.equals(F.class)) {
                g(F.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        G getCameraXConfig();
    }

    static {
        Class cls = Integer.TYPE;
        f68V = InterfaceC0984i0.a.a("camerax.core.appConfig.minimumLoggingLevel", cls);
        f69W = InterfaceC0984i0.a.a("camerax.core.appConfig.availableCamerasLimiter", C0900v.class);
        f70X = InterfaceC0984i0.a.a("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE);
        f71Y = InterfaceC0984i0.a.a("camerax.core.appConfig.cameraProviderInitRetryPolicy", z0.class);
        f72Z = InterfaceC0984i0.a.a("camerax.core.appConfig.quirksSettings", H.W0.class);
        f73a0 = InterfaceC0984i0.a.a("camerax.core.appConfig.configImplType", cls);
        f74b0 = InterfaceC0984i0.a.a("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE);
    }

    public G(H.T0 t8) {
        this.f75P = t8;
    }

    public C0900v f0(C0900v c0900v) {
        return (C0900v) this.f75P.f(f69W, c0900v);
    }

    public Executor g0(Executor executor) {
        return (Executor) this.f75P.f(f66T, executor);
    }

    public H.H.a h0(H.H.a aVar) {
        return (H.H.a) this.f75P.f(f63Q, aVar);
    }

    public long i0() {
        return ((Long) this.f75P.f(f70X, -1L)).longValue();
    }

    public z0 j0() {
        z0 z0Var = (z0) this.f75P.f(f71Y, z0.f346b);
        Objects.requireNonNull(z0Var);
        return z0Var;
    }

    public int k0() {
        return ((Integer) this.f75P.f(f73a0, -1)).intValue();
    }

    public H.G.a l0(H.G.a aVar) {
        return (H.G.a) this.f75P.f(f64R, aVar);
    }

    public H.W0 m0() {
        return (H.W0) this.f75P.f(f72Z, null);
    }

    public Handler n0(Handler handler) {
        return (Handler) this.f75P.f(f67U, handler);
    }

    public v1.c o0(v1.c cVar) {
        return (v1.c) this.f75P.f(f65S, cVar);
    }

    public boolean p0() {
        return ((Boolean) this.f75P.f(f74b0, Boolean.TRUE)).booleanValue();
    }

    @Override // H.a1
    public InterfaceC0984i0 q() {
        return this.f75P;
    }
}
