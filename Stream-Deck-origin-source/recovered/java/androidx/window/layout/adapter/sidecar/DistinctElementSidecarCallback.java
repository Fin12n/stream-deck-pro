package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f15425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f15426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N2.a f15427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f15428e;

    public DistinctElementSidecarCallback(N2.a aVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f15424a = new Object();
        this.f15426c = new WeakHashMap();
        this.f15427d = aVar;
        this.f15428e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f15424a) {
            try {
                if (this.f15427d.a(this.f15425b, sidecarDeviceState)) {
                    return;
                }
                this.f15425b = sidecarDeviceState;
                this.f15428e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f15424a) {
            try {
                if (this.f15427d.d((SidecarWindowLayoutInfo) this.f15426c.get(iBinder), sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f15426c.put(iBinder, sidecarWindowLayoutInfo);
                this.f15428e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public DistinctElementSidecarCallback(SidecarInterface.SidecarCallback sidecarCallback) {
        this.f15424a = new Object();
        this.f15426c = new WeakHashMap();
        this.f15427d = new N2.a();
        this.f15428e = sidecarCallback;
    }
}
