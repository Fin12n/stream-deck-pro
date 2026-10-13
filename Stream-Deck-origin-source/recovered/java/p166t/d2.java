package p166t;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p174u.b;
import p174u.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends S1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f33641a;

    public d2(List list) {
        ArrayList arrayList = new ArrayList();
        this.f33641a = arrayList;
        arrayList.addAll(list);
    }

    public static S1.c y(S1.c... cVarArr) {
        return new d2(Arrays.asList(cVarArr));
    }

    @Override // t.S1.c
    public void q(S1 s8) {
        Iterator it = this.f33641a.iterator();
        while (it.hasNext()) {
            ((S1.c) it.next()).q(s8);
        }
    }

    @Override // t.S1.c
    public void r(S1 s8) {
        Iterator it = this.f33641a.iterator();
        while (it.hasNext()) {
            ((S1.c) it.next()).r(s8);
        }
    }

    @Override // t.S1.c
    public void s(S1 s8) {
        Iterator it = this.f33641a.iterator();
        while (it.hasNext()) {
            ((S1.c) it.next()).s(s8);
        }
    }

    @Override // t.S1.c
    public void t(S1 s8) {
        Iterator it = this.f33641a.iterator();
        while (it.hasNext()) {
            ((S1.c) it.next()).t(s8);
        }
    }

    @Override // t.S1.c
    public void u(S1 s8) {
        Iterator it = this.f33641a.iterator();
        while (it.hasNext()) {
            ((S1.c) it.next()).u(s8);
        }
    }

    @Override // t.S1.c
    public void v(S1 s8) {
        Iterator it = this.f33641a.iterator();
        while (it.hasNext()) {
            ((S1.c) it.next()).v(s8);
        }
    }

    @Override // t.S1.c
    public void w(S1 s8) {
        Iterator it = this.f33641a.iterator();
        while (it.hasNext()) {
            ((S1.c) it.next()).w(s8);
        }
    }

    @Override // t.S1.c
    public void x(S1 s8, Surface surface) {
        Iterator it = this.f33641a.iterator();
        while (it.hasNext()) {
            ((S1.c) it.next()).x(s8, surface);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends S1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f33642a;

        public a(CameraCaptureSession.StateCallback stateCallback) {
            this.f33642a = stateCallback;
        }

        @Override // t.S1.c
        public void q(S1 s8) {
            this.f33642a.onActive(s8.e().d());
        }

        @Override // t.S1.c
        public void r(S1 s8) {
            d.b(this.f33642a, s8.e().d());
        }

        @Override // t.S1.c
        public void s(S1 s8) {
            this.f33642a.onClosed(s8.e().d());
        }

        @Override // t.S1.c
        public void t(S1 s8) {
            this.f33642a.onConfigureFailed(s8.e().d());
        }

        @Override // t.S1.c
        public void u(S1 s8) {
            this.f33642a.onConfigured(s8.e().d());
        }

        @Override // t.S1.c
        public void v(S1 s8) {
            this.f33642a.onReady(s8.e().d());
        }

        @Override // t.S1.c
        public void x(S1 s8, Surface surface) {
            b.a(this.f33642a, s8.e().d(), surface);
        }

        public a(List list) {
            this(T0.a(list));
        }

        @Override // t.S1.c
        public void w(S1 s8) {
        }
    }
}
