package p158s;

import A.AbstractC0890p0;
import A.C0904x;
import C6.j;
import C6.k;
import D6.C0938s;
import D6.r;
import H.c1;
import M6.eLZq.eGwOBWCdOTaKus;
import V.d;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.os.Bundle;
import android.util.Size;
import android.view.SurfaceHolder;
import com.amazon.a.a.o.b.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2625c;
import kotlin.jvm.internal.AbstractC2633k;
import p116m7.kKPq.toqHM;
import p166t.Y0;
import p174u.e;
import p174u.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class n implements D.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f32617k = new c(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f32618l = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f32619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f32620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f32621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f32622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f32623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f32624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f32625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j f32626j;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f32627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageReader f32628b;

        public a(OutputConfiguration value, ImageReader imageReader) {
            kotlin.jvm.internal.t.g(value, "value");
            this.f32627a = value;
            this.f32628b = imageReader;
        }

        public final OutputConfiguration b() {
            return this.f32627a;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            ImageReader imageReader = this.f32628b;
            if (imageReader != null) {
                imageReader.close();
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.t.c(this.f32627a, aVar.f32627a) && kotlin.jvm.internal.t.c(this.f32628b, aVar.f32628b);
        }

        public int hashCode() {
            int iHashCode = this.f32627a.hashCode() * 31;
            ImageReader imageReader = this.f32628b;
            return iHashCode + (imageReader == null ? 0 : imageReader.hashCode());
        }

        public String toString() {
            return "CloseableOutputConfiguration(value=" + this.f32627a + toqHM.uAxDcu + this.f32628b + ')';
        }

        public /* synthetic */ a(OutputConfiguration outputConfiguration, ImageReader imageReader, int i8, AbstractC2633k abstractC2633k) {
            this(outputConfiguration, (i8 & 2) != 0 ? null : imageReader);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends CameraCaptureSession.StateCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession p8) {
            kotlin.jvm.internal.t.g(p8, "p0");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession p8) {
            kotlin.jvm.internal.t.g(p8, "p0");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {
        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public c() {
        }
    }

    public n(Context context, String cameraId, t cameraManagerCompat) {
        kotlin.jvm.internal.t.g(context, "context");
        kotlin.jvm.internal.t.g(cameraId, "cameraId");
        kotlin.jvm.internal.t.g(cameraManagerCompat, "cameraManagerCompat");
        this.f32619c = context;
        this.f32620d = cameraId;
        this.f32621e = cameraManagerCompat;
        this.f32622f = k.b(new Function0() { // from class: s.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.j(this.f32614a);
            }
        });
        this.f32623g = k.b(new Function0() { // from class: s.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.k(this.f32615a);
            }
        });
        this.f32624h = k.b(new Function0() { // from class: s.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.i(this.f32616a);
            }
        });
        this.f32625i = k.b(new Function0() { // from class: s.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.m(this.f32612a);
            }
        });
        this.f32626j = k.b(new Function0() { // from class: s.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(n.u(this.f32613a));
            }
        });
    }

    public static final p174u.n i(n nVar) throws C0904x {
        try {
            p174u.n nVarC = nVar.f32621e.c(nVar.f32620d);
            kotlin.jvm.internal.t.d(nVarC);
            return nVarC;
        } catch (e e8) {
            throw Y0.a(e8);
        }
    }

    public static final d j(n nVar) {
        return new V.e(nVar.f32619c).a(nVar.f32620d);
    }

    public static final CameraDevice.CameraDeviceSetup k(n nVar) {
        if (nVar.f32621e.i().isCameraDeviceSetupSupported(nVar.f32620d)) {
            return nVar.f32621e.i().getCameraDeviceSetup(nVar.f32620d);
        }
        return null;
    }

    public static final DynamicRangeProfiles m(n nVar) {
        return p182v.e.a(nVar.o()).d();
    }

    public static final boolean u(n nVar) {
        return kotlin.jvm.internal.t.c(nVar.s(), Boolean.FALSE);
    }

    @Override // D.a
    public boolean a(c1 sessionConfig) throws Exception {
        kotlin.jvm.internal.t.g(sessionConfig, "sessionConfig");
        List listL = l(sessionConfig);
        ArrayList arrayList = new ArrayList(C0938s.y(listL, 10));
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).b());
        }
        SessionConfiguration sessionConfigurationN = n(arrayList, sessionConfig);
        if (sessionConfigurationN == null) {
            return false;
        }
        int iA = q().a(sessionConfigurationN).a();
        AbstractC0890p0.a("FeatureCombinationQueryImpl", "isSupported: supported = " + iA + " for session config with " + x(sessionConfig));
        boolean z8 = iA == 1;
        Iterator it2 = listL.iterator();
        while (it2.hasNext()) {
            f.a((AutoCloseable) it2.next());
        }
        return z8;
    }

    public final void h(OutputConfiguration outputConfiguration, c1.f fVar) {
        DynamicRangeProfiles dynamicRangeProfilesR = r();
        if (dynamicRangeProfilesR == null) {
            return;
        }
        Long lA = p182v.c.a(fVar.b(), dynamicRangeProfilesR);
        if (lA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        outputConfiguration.setDynamicRangeProfile(lA.longValue());
    }

    public final List l(c1 c1Var) {
        a aVarV;
        List<c1.f> listI = c1Var.i();
        kotlin.jvm.internal.t.f(listI, "getOutputConfigs(...)");
        ArrayList arrayList = new ArrayList(C0938s.y(listI, 10));
        for (c1.f fVar : listI) {
            if (t()) {
                kotlin.jvm.internal.t.d(fVar);
                aVarV = w(fVar);
            } else {
                kotlin.jvm.internal.t.d(fVar);
                aVarV = v(fVar);
            }
            if (fVar.f().g() != null) {
                h(aVarV.b(), fVar);
            }
            arrayList.add(aVarV);
        }
        return arrayList;
    }

    public final SessionConfiguration n(List list, c1 c1Var) {
        SessionConfiguration sessionConfiguration = new SessionConfiguration(0, list, J.a.a(), f32618l);
        CameraDevice.CameraDeviceSetup cameraDeviceSetupP = p();
        if (cameraDeviceSetupP == null) {
            return null;
        }
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDeviceSetupP.createCaptureRequest(c1Var.p());
        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, c1Var.e());
        if (c1Var.k().h() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        }
        sessionConfiguration.setSessionParameters(builderCreateCaptureRequest.build());
        return sessionConfiguration;
    }

    public final p174u.n o() {
        return (p174u.n) this.f32624h.getValue();
    }

    public final CameraDevice.CameraDeviceSetup p() {
        return e.a(this.f32623g.getValue());
    }

    public final d q() {
        return (d) this.f32622f.getValue();
    }

    public final DynamicRangeProfiles r() {
        return d.a(this.f32625i.getValue());
    }

    public final Boolean s() {
        try {
            ServiceInfo[] serviceInfoArr = this.f32619c.getPackageManager().getPackageInfo(this.f32619c.getPackageName(), 132).services;
            if (serviceInfoArr == null) {
                return Boolean.FALSE;
            }
            Iterator itA = AbstractC2625c.a(serviceInfoArr);
            while (itA.hasNext()) {
                Bundle bundle = ((ServiceInfo) itA.next()).metaData;
                if (bundle != null && bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final boolean t() {
        return ((Boolean) this.f32626j.getValue()).booleanValue();
    }

    public final a v(c1.f fVar) {
        long j8;
        Class clsG = fVar.f().g();
        if (kotlin.jvm.internal.t.c(clsG, MediaCodec.class)) {
            j8 = 65536;
        } else if (kotlin.jvm.internal.t.c(clsG, SurfaceHolder.class)) {
            j8 = 2048;
        } else {
            j8 = kotlin.jvm.internal.t.c(clsG, SurfaceTexture.class) ? 256L : 0L;
        }
        long j9 = j8;
        AbstractC0890p0.a("FeatureCombinationQueryImpl", "toConcreteOutputConfiguration: surface containerClass = " + fVar.f().g() + ", usageFlag = " + j9);
        ImageReader imageReaderNewInstance = ImageReader.newInstance(fVar.f().h().getWidth(), fVar.f().h().getHeight(), fVar.f().i(), 1, j9);
        kotlin.jvm.internal.t.f(imageReaderNewInstance, "newInstance(...)");
        return new a(new OutputConfiguration(imageReaderNewInstance.getSurface()), imageReaderNewInstance);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a w(c1.f fVar) {
        OutputConfiguration outputConfigurationA;
        Class clsG = fVar.f().g();
        AbstractC0890p0.a("FeatureCombinationQueryImpl", "toDeferredOutputConfiguration: surface containerClass = " + fVar.f().g());
        if (clsG != null) {
            Size sizeH = fVar.f().h();
            if (sizeH == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            outputConfigurationA = new OutputConfiguration(sizeH, clsG);
        } else {
            p158s.c.a();
            outputConfigurationA = p158s.b.a(fVar.f().i(), fVar.f().h());
        }
        return new a(outputConfigurationA, null, 2, 0 == true ? 1 : 0);
    }

    public final String x(c1 c1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("sessionParameters=[");
        sb.append("fpsRange=" + c1Var.e());
        sb.append(eGwOBWCdOTaKus.qzPMiczZBPy + c1Var.k().h());
        sb.append("], ");
        sb.append("outputConfigurations=[");
        List listI = c1Var.i();
        kotlin.jvm.internal.t.f(listI, "getOutputConfigs(...)");
        int i8 = 0;
        for (Object obj : listI) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                r.x();
            }
            c1.f fVar = (c1.f) obj;
            if (i8 != 0) {
                sb.append(f.f16777a);
            }
            sb.append("{format=" + fVar.f().i() + ", size=" + fVar.f().h() + ", dynamicRange=" + fVar.b() + ", class=" + fVar.f().g() + '}');
            i8 = i9;
        }
        sb.append("]");
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "toString(...)");
        return string;
    }
}
