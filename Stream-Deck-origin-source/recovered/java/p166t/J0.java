package p166t;

import A.AbstractC0890p0;
import H.AbstractC0994n0;
import H.C0980g0;
import H.InterfaceC0984i0;
import H.InterfaceC1014y;
import H.g1;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p198x.y;
import p214z.l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class J0 {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static CaptureRequest.Builder a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    public static void a(C0980g0 c0980g0, CaptureRequest.Builder builder) {
        Range rangeE = c0980g0.e();
        if (!rangeE.equals(g1.f3033a)) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeE);
        }
        AbstractC0890p0.a("Camera2CaptureRequestBuilder", "applyAeFpsRange: expectedFrameRateRange = " + rangeE);
    }

    public static void b(CaptureRequest.Builder builder, InterfaceC0984i0 interfaceC0984i0) {
        l lVarD = l.a.e(interfaceC0984i0).d();
        for (InterfaceC0984i0.a aVar : lVarD.c()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.d();
            try {
                builder.set(key, lVarD.h(aVar));
            } catch (IllegalArgumentException unused) {
                AbstractC0890p0.c("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static void c(CaptureRequest.Builder builder, int i8, y yVar) {
        for (Map.Entry entry : yVar.a(i8).entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static void d(C0980g0 c0980g0, CaptureRequest.Builder builder) {
        Integer numH = h(c0980g0);
        if (numH != null) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, numH);
        }
        AbstractC0890p0.a("Camera2CaptureRequestBuilder", "applyVideoStabilization: mode = " + numH);
    }

    public static CaptureRequest e(C0980g0 c0980g0, CameraDevice cameraDevice, Map map, boolean z8, y yVar) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List listG = g(c0980g0.i(), map);
        if (listG.isEmpty()) {
            return null;
        }
        InterfaceC1014y interfaceC1014yD = c0980g0.d();
        if (c0980g0.k() == 5 && interfaceC1014yD != null && (interfaceC1014yD.i() instanceof TotalCaptureResult)) {
            AbstractC0890p0.a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            builderCreateCaptureRequest = a.a(cameraDevice, (TotalCaptureResult) interfaceC1014yD.i());
        } else {
            AbstractC0890p0.a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (c0980g0.k() == 5) {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z8 ? 1 : 2);
            } else {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(c0980g0.k());
            }
        }
        c(builderCreateCaptureRequest, c0980g0.k(), yVar);
        a(c0980g0, builderCreateCaptureRequest);
        d(c0980g0, builderCreateCaptureRequest);
        InterfaceC0984i0 interfaceC0984i0G = c0980g0.g();
        InterfaceC0984i0.a aVar = C0980g0.f3014i;
        if (interfaceC0984i0G.e(aVar)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) c0980g0.g().h(aVar));
        }
        InterfaceC0984i0 interfaceC0984i0G2 = c0980g0.g();
        InterfaceC0984i0.a aVar2 = C0980g0.f3015j;
        if (interfaceC0984i0G2.e(aVar2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) c0980g0.g().h(aVar2)).byteValue()));
        }
        b(builderCreateCaptureRequest, c0980g0.g());
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it.next());
        }
        builderCreateCaptureRequest.setTag(c0980g0.j());
        return builderCreateCaptureRequest.build();
    }

    public static CaptureRequest f(C0980g0 c0980g0, CameraDevice cameraDevice, y yVar) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        AbstractC0890p0.a("Camera2CaptureRequestBuilder", "template type = " + c0980g0.k());
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(c0980g0.k());
        c(builderCreateCaptureRequest, c0980g0.k(), yVar);
        a(c0980g0, builderCreateCaptureRequest);
        b(builderCreateCaptureRequest, c0980g0.g());
        return builderCreateCaptureRequest.build();
    }

    public static List g(List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) map.get((AbstractC0994n0) it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }

    public static Integer h(C0980g0 c0980g0) {
        if (c0980g0.h() == 1 || c0980g0.l() == 1) {
            return 0;
        }
        if (c0980g0.h() == 2) {
            return 2;
        }
        return c0980g0.l() == 2 ? 1 : null;
    }
}
