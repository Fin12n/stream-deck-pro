package p158s;

import A.K;
import H.InterfaceC0984i0;
import H.N0;
import H.O0;
import H.T0;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import p214z.l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a extends l {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final InterfaceC0984i0.a f32604Q = InterfaceC0984i0.a.a("camera2.captureRequest.templateType", Integer.TYPE);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final InterfaceC0984i0.a f32605R = InterfaceC0984i0.a.a("camera2.cameraCaptureSession.streamUseCase", Long.TYPE);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final InterfaceC0984i0.a f32606S = InterfaceC0984i0.a.a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final InterfaceC0984i0.a f32607T = InterfaceC0984i0.a.a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final InterfaceC0984i0.a f32608U = InterfaceC0984i0.a.a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final InterfaceC0984i0.a f32609V = InterfaceC0984i0.a.a("camera2.captureRequest.tag", Object.class);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final InterfaceC0984i0.a f32610W = InterfaceC0984i0.a.a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* JADX INFO: renamed from: s.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0723a implements K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final O0 f32611a = O0.i0();

        @Override // A.K
        public N0 a() {
            return this.f32611a;
        }

        public a c() {
            return new a(T0.h0(this.f32611a));
        }

        public C0723a d(InterfaceC0984i0 interfaceC0984i0) {
            e(interfaceC0984i0, InterfaceC0984i0.c.OPTIONAL);
            return this;
        }

        public C0723a e(InterfaceC0984i0 interfaceC0984i0, InterfaceC0984i0.c cVar) {
            for (InterfaceC0984i0.a aVar : interfaceC0984i0.c()) {
                this.f32611a.K(aVar, cVar, interfaceC0984i0.h(aVar));
            }
            return this;
        }

        public C0723a f(CaptureRequest.Key key, Object obj) {
            this.f32611a.L(a.f0(key), obj);
            return this;
        }

        public C0723a g(CaptureRequest.Key key, Object obj, InterfaceC0984i0.c cVar) {
            this.f32611a.K(a.f0(key), cVar, obj);
            return this;
        }
    }

    public a(InterfaceC0984i0 interfaceC0984i0) {
        super(interfaceC0984i0);
    }

    public static InterfaceC0984i0.a f0(CaptureRequest.Key key) {
        return InterfaceC0984i0.a.b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public l g0() {
        return l.a.e(q()).d();
    }

    public int h0(int i8) {
        return ((Integer) q().f(f32604Q, Integer.valueOf(i8))).intValue();
    }

    public CameraDevice.StateCallback i0(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) q().f(f32606S, stateCallback);
    }

    public String j0(String str) {
        return (String) q().f(f32610W, str);
    }

    public CameraCaptureSession.CaptureCallback k0(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) q().f(f32608U, captureCallback);
    }

    public CameraCaptureSession.StateCallback l0(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) q().f(f32607T, stateCallback);
    }

    public long m0(long j8) {
        return ((Long) q().f(f32605R, Long.valueOf(j8))).longValue();
    }
}
