package p166t;

import A.C0883m;
import F1.c;
import H.InterfaceC0984i0;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import p158s.a;
import p174u.n;
import p182v.b;

/* JADX INFO: renamed from: t.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2925c implements j2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f33616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Range f33617b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.a f33619d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f33621f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f33618c = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f33620e = 1.0f;

    public C2925c(n nVar) {
        this.f33621f = false;
        this.f33616a = nVar;
        this.f33617b = (Range) nVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.f33621f = nVar.i();
    }

    @Override // t.j2.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f33619d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f8 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f8 == null) {
                return;
            }
            if (this.f33620e == f8.floatValue()) {
                this.f33619d.c(null);
                this.f33619d = null;
            }
        }
    }

    @Override // t.j2.b
    public float b() {
        return ((Float) this.f33617b.getUpper()).floatValue();
    }

    @Override // t.j2.b
    public float c() {
        return ((Float) this.f33617b.getLower()).floatValue();
    }

    @Override // t.j2.b
    public void d(a.C0723a c0723a) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float fValueOf = Float.valueOf(this.f33618c);
        InterfaceC0984i0.c cVar = InterfaceC0984i0.c.REQUIRED;
        c0723a.g(key, fValueOf, cVar);
        if (this.f33621f) {
            b.a(c0723a, cVar);
        }
    }

    @Override // t.j2.b
    public void e() {
        this.f33618c = 1.0f;
        c.a aVar = this.f33619d;
        if (aVar != null) {
            aVar.f(new C0883m("Camera is not active."));
            this.f33619d = null;
        }
    }
}
