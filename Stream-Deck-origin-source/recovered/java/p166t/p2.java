package p166t;

import A.AbstractC0890p0;
import H.A0;
import H.AbstractC0994n0;
import H.B0;
import H.c1;
import P.c;
import P.e;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.d;
import androidx.camera.core.f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p174u.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class p2 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f33825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f33826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f33827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33828d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f33829e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f33830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f33831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f33832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AbstractC0994n0 f33833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f33834j;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageWriter f33837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f33838b = new AtomicBoolean(true);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Executor f33839c;

        public b(Executor executor) {
            this.f33839c = executor;
        }

        public void b() {
            this.f33838b.set(false);
        }

        public boolean c(final d dVar) {
            ImageWriter imageWriter;
            Image imageX1 = dVar.x1();
            if (this.f33838b.get() && (imageWriter = this.f33837a) != null && imageX1 != null) {
                try {
                    M.a.d(imageWriter, imageX1);
                    M.a.e(this.f33837a, new ImageWriter.OnImageReleasedListener() { // from class: t.q2
                        @Override // android.media.ImageWriter.OnImageReleasedListener
                        public final void onImageReleased(ImageWriter imageWriter2) {
                            dVar.close();
                        }
                    }, this.f33839c);
                    return true;
                } catch (IllegalStateException e8) {
                    AbstractC0890p0.c("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e8.getMessage());
                }
            }
            return false;
        }

        public void d(ImageWriter imageWriter) {
            if (this.f33838b.get()) {
                if (this.f33837a != null) {
                    AbstractC0890p0.l("ZslControlImpl", "ImageWriter already existed in the ImageWriter holder. Closing the previous one.");
                    this.f33837a.close();
                }
                this.f33837a = imageWriter;
            }
        }

        public void e() {
            b();
            ImageWriter imageWriter = this.f33837a;
            if (imageWriter != null) {
                imageWriter.close();
            }
        }
    }

    public p2(n nVar, Executor executor) {
        this.f33830f = false;
        this.f33831g = false;
        this.f33825a = nVar;
        this.f33826b = executor;
        this.f33830f = r2.a(nVar, 4);
        this.f33831g = p190w.e.b(ZslDisablerQuirk.class) != null;
        this.f33827c = new e(3, new c() { // from class: t.o2
            @Override // P.c
            public final void a(Object obj) {
                ((d) obj).close();
            }
        });
    }

    public static /* synthetic */ void i(p2 p2Var, A0 a8) {
        p2Var.getClass();
        try {
            d dVarH = a8.h();
            if (dVarH != null) {
                p2Var.f33827c.d(dVarH);
            }
        } catch (IllegalStateException e8) {
            AbstractC0890p0.c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e8.getMessage());
        }
    }

    public static /* synthetic */ void j(f fVar, b bVar) {
        fVar.d();
        bVar.e();
    }

    @Override // p166t.l2
    public void a() {
        k();
    }

    @Override // p166t.l2
    public void b(c1.b bVar) {
        k();
        if (this.f33828d) {
            bVar.y(1);
            return;
        }
        if (this.f33831g) {
            bVar.y(1);
            return;
        }
        Map mapM = m(this.f33825a);
        if (!this.f33830f || mapM.isEmpty() || !mapM.containsKey(34) || !n(this.f33825a, 34)) {
            bVar.y(1);
            return;
        }
        Size size = (Size) mapM.get(34);
        androidx.camera.core.e eVar = new androidx.camera.core.e(size.getWidth(), size.getHeight(), 34, 9);
        final f fVar = new f(eVar);
        Surface surface = fVar.getSurface();
        Objects.requireNonNull(surface);
        B0 b8 = new B0(surface, new Size(fVar.g(), fVar.f()), 34);
        final b bVar2 = new b(this.f33826b);
        this.f33832h = fVar;
        this.f33833i = b8;
        this.f33834j = bVar2;
        fVar.i(new A0.a() { // from class: t.m2
            @Override // H.A0.a
            public final void a(A0 a8) {
                p2.i(this.f33798a, a8);
            }
        }, J.a.c());
        b8.k().a(new Runnable() { // from class: t.n2
            @Override // java.lang.Runnable
            public final void run() {
                p2.j(fVar, bVar2);
            }
        }, this.f33826b);
        bVar.l(b8);
        bVar.e(eVar.o());
        bVar.k(new a(bVar2));
        bVar.u(new InputConfiguration(fVar.g(), fVar.f(), fVar.j()));
    }

    @Override // p166t.l2
    public boolean c() {
        return this.f33828d;
    }

    @Override // p166t.l2
    public boolean d() {
        return this.f33829e;
    }

    @Override // p166t.l2
    public void e(boolean z8) {
        this.f33829e = z8;
    }

    @Override // p166t.l2
    public void f(boolean z8) {
        if (this.f33828d != z8 && z8) {
            l();
        }
        this.f33828d = z8;
    }

    @Override // p166t.l2
    public d g() {
        try {
            return (d) this.f33827c.a();
        } catch (NoSuchElementException unused) {
            AbstractC0890p0.c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // p166t.l2
    public boolean h(d dVar) {
        b bVar = this.f33834j;
        if (bVar != null) {
            return bVar.c(dVar);
        }
        return false;
    }

    public final void k() {
        f fVar = this.f33832h;
        if (fVar != null) {
            fVar.k();
            this.f33832h = null;
        }
        b bVar = this.f33834j;
        if (bVar != null) {
            bVar.b();
            this.f33834j = null;
        }
        l();
        AbstractC0994n0 abstractC0994n0 = this.f33833i;
        if (abstractC0994n0 != null) {
            abstractC0994n0.d();
            this.f33833i = null;
        }
    }

    public final void l() {
        e eVar = this.f33827c;
        while (!eVar.c()) {
            ((d) eVar.a()).close();
        }
    }

    public final Map m(n nVar) {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) nVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e8) {
            AbstractC0890p0.c("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e8.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        for (int i8 : streamConfigurationMap.getInputFormats()) {
            Size[] inputSizes = streamConfigurationMap.getInputSizes(i8);
            if (inputSizes != null) {
                Arrays.sort(inputSizes, new I.d(true));
                map.put(Integer.valueOf(i8), inputSizes[0]);
            }
        }
        return map;
    }

    public final boolean n(n nVar, int i8) {
        int[] validOutputFormatsForInput;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) nVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(i8)) == null) {
            return false;
        }
        for (int i9 : validOutputFormatsForInput) {
            if (i9 == 256) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f33835a;

        public a(b bVar) {
            this.f33835a = bVar;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                this.f33835a.d(M.a.c(inputSurface, 1));
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }
    }
}
