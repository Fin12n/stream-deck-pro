package p166t;

import A.C0894s;
import A.C0904x;
import C6.G;
import D6.z;
import F1.c;
import H.AbstractC0969b;
import K.n;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC2633k;
import p174u.e;
import p174u.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class P0 extends AbstractC0969b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f33408i = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f33410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CameraManager.AvailabilityCallback f33411h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends CameraManager.AvailabilityCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            Log.d("Camera2PresenceSrc", "System onCameraAccessPrioritiesChanged.");
            P0 p8 = P0.this;
            p8.p(p8.a());
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String cameraId) {
            kotlin.jvm.internal.t.g(cameraId, "cameraId");
            Log.d("Camera2PresenceSrc", "System onCameraAvailable: " + cameraId);
            P0 p8 = P0.this;
            p8.p(p8.a());
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String cameraId) {
            kotlin.jvm.internal.t.g(cameraId, "cameraId");
            Log.d("Camera2PresenceSrc", "System onCameraUnavailable: " + cameraId);
            P0 p8 = P0.this;
            p8.p(p8.a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(List<String> initialCameraIds, t cameraManager, Executor systemCallbackExecutor) {
        super(initialCameraIds);
        kotlin.jvm.internal.t.g(initialCameraIds, "initialCameraIds");
        kotlin.jvm.internal.t.g(cameraManager, "cameraManager");
        kotlin.jvm.internal.t.g(systemCallbackExecutor, "systemCallbackExecutor");
        this.f33409f = cameraManager;
        this.f33410g = systemCallbackExecutor;
    }

    public static final Object n(final P0 p8, final c.a completer) {
        kotlin.jvm.internal.t.g(completer, "completer");
        p8.f33410g.execute(new Runnable() { // from class: t.O0
            @Override // java.lang.Runnable
            public final void run() {
                P0.o(this.f33404a, completer);
            }
        });
        return "FetchData for CameraAvailability";
    }

    public static final void o(P0 p8, c.a aVar) {
        try {
            String[] strArrD = p8.f33409f.d();
            kotlin.jvm.internal.t.f(strArrD, "getCameraIdList(...)");
            ArrayList arrayList = new ArrayList(strArrD.length);
            for (String str : strArrD) {
                C0894s.a aVar2 = C0894s.f306c;
                kotlin.jvm.internal.t.d(str);
                arrayList.add(C0894s.a.d(aVar2, str, null, null, 6, null));
            }
            Log.d("Camera2PresenceSrc", "[FetchData] Refreshed camera list: " + z.r0(arrayList, null, null, null, 0, null, null, 63, null));
            p8.h(arrayList);
            aVar.c(arrayList);
        } catch (e e8) {
            Log.e("Camera2PresenceSrc", "[FetchData] Failed to get camera list for refresh.", e8);
            C0904x c0904xA = Y0.a(e8);
            kotlin.jvm.internal.t.f(c0904xA, "createFrom(...)");
            p8.i(c0904xA);
            aVar.f(c0904xA);
        }
    }

    @Override // H.R0
    public Y4.a a() {
        Y4.a aVarA = c.a(new c.InterfaceC0112c() { // from class: t.N0
            @Override // F1.c.InterfaceC0112c
            public final Object a(c.a aVar) {
                return P0.n(this.f33397a, aVar);
            }
        });
        kotlin.jvm.internal.t.f(aVarA, "getFuture(...)");
        return aVarA;
    }

    @Override // H.AbstractC0969b
    public void f() {
        if (this.f33411h != null) {
            Log.w("Camera2PresenceSrc", "Monitoring already started. Unregistering existing callback.");
            g();
        }
        Log.i("Camera2PresenceSrc", "Starting system availability monitoring.");
        b bVar = new b();
        this.f33411h = bVar;
        t tVar = this.f33409f;
        Executor executor = this.f33410g;
        kotlin.jvm.internal.t.d(bVar);
        tVar.g(executor, bVar);
        p(a());
    }

    @Override // H.AbstractC0969b
    public void g() {
        Log.i("Camera2PresenceSrc", "Stopping system availability monitoring.");
        CameraManager.AvailabilityCallback availabilityCallback = this.f33411h;
        if (availabilityCallback != null) {
            try {
                try {
                    this.f33409f.h(availabilityCallback);
                    G g8 = G.f1419a;
                } catch (Exception e8) {
                    Log.w("Camera2PresenceSrc", "Failed to unregister system availability callback.", e8);
                }
            } finally {
                this.f33411h = null;
            }
        }
    }

    public final void p(Y4.a aVar) {
        n.z(aVar);
    }
}
