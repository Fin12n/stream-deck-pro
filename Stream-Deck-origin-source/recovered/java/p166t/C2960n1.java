package p166t;

import A.C0883m;
import F1.c;
import H.InterfaceC0984i0;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import p158s.a;
import p174u.n;

/* JADX INFO: renamed from: t.n1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2960n1 implements j2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f33799a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.a f33801c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f33800b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Rect f33802d = null;

    public C2960n1(n nVar) {
        this.f33799a = nVar;
    }

    @Override // t.j2.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f33801c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f33802d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f33801c.c(null);
            this.f33801c = null;
            this.f33802d = null;
        }
    }

    @Override // t.j2.b
    public float b() {
        Float f8 = (Float) this.f33799a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f8 == null) {
            return 1.0f;
        }
        return f8.floatValue() < c() ? c() : f8.floatValue();
    }

    @Override // t.j2.b
    public float c() {
        return 1.0f;
    }

    @Override // t.j2.b
    public void d(a.C0723a c0723a) {
        Rect rect = this.f33800b;
        if (rect != null) {
            c0723a.g(CaptureRequest.SCALER_CROP_REGION, rect, InterfaceC0984i0.c.REQUIRED);
        }
    }

    @Override // t.j2.b
    public void e() {
        this.f33802d = null;
        this.f33800b = null;
        c.a aVar = this.f33801c;
        if (aVar != null) {
            aVar.f(new C0883m("Camera is not active."));
            this.f33801c = null;
        }
    }
}
