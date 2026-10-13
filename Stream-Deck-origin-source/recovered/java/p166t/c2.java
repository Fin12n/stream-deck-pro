package p166t;

import A.AbstractC0890p0;
import H.AbstractC0994n0;
import H.Z0;
import K.d;
import K.n;
import Y4.a;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p090k.zI.jULK;
import p182v.o;
import p198x.h;
import p198x.i;
import p198x.s;
import p198x.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c2 extends Y1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ScheduledExecutorService f33624o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f33625p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f33626q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f33627r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f33628s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h f33629t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final s f33630u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u f33631v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f33632w;

    public c2(Z0 z8, Z0 z9, C2957m1 c2957m1, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(c2957m1, executor, scheduledExecutorService, handler);
        this.f33625p = new Object();
        this.f33632w = new AtomicBoolean(false);
        this.f33628s = new i(z8, z9);
        this.f33630u = new s(z8.a(CaptureSessionStuckQuirk.class) || z8.a(IncorrectCaptureStateQuirk.class));
        this.f33629t = new h(z9);
        this.f33631v = new u(z9);
        this.f33624o = scheduledExecutorService;
    }

    public static /* synthetic */ a I(c2 c2Var, CameraDevice cameraDevice, o oVar, List list, List list2) {
        if (c2Var.f33631v.a()) {
            c2Var.K();
        }
        c2Var.L("start openCaptureSession");
        return super.k(cameraDevice, oVar, list);
    }

    public static /* synthetic */ void J(c2 c2Var) {
        c2Var.L("Session call super.close()");
        super.close();
    }

    public final void K() {
        Iterator it = this.f33590b.d().iterator();
        while (it.hasNext()) {
            ((S1) it.next()).close();
        }
    }

    @Override // p166t.Y1, p166t.S1
    public void a() {
        super.a();
        this.f33630u.g();
    }

    @Override // p166t.Y1, p166t.S1
    public void close() {
        if (!this.f33632w.compareAndSet(false, true)) {
            L("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f33631v.a()) {
            try {
                L("Call abortCaptures() before closing session.");
                h();
            } catch (Exception e8) {
                L("Exception when calling abortCaptures()" + e8);
            }
        }
        L("Session call close()");
        this.f33630u.e().a(new Runnable() { // from class: t.a2
            @Override // java.lang.Runnable
            public final void run() {
                c2.J(this.f33610a);
            }
        }, f());
    }

    @Override // p166t.Y1, p166t.S1
    public int d(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.d(list, this.f33630u.d(captureCallback));
    }

    @Override // p166t.Y1, p166t.S1
    public void g(int i8) {
        super.g(i8);
        if (i8 == 5) {
            synchronized (this.f33625p) {
                try {
                    if (F() && this.f33626q != null) {
                        L("Close DeferrableSurfaces for CameraDevice error.");
                        Iterator it = this.f33626q.iterator();
                        while (it.hasNext()) {
                            ((AbstractC0994n0) it.next()).d();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p166t.Y1, p166t.S1
    public int j(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.j(captureRequest, this.f33630u.d(captureCallback));
    }

    @Override // p166t.Y1, t.S1.a
    public a k(final CameraDevice cameraDevice, final o oVar, final List list) {
        a aVarS;
        synchronized (this.f33625p) {
            try {
                List listD = this.f33590b.d();
                ArrayList arrayList = new ArrayList();
                Iterator it = listD.iterator();
                while (it.hasNext()) {
                    arrayList.add(((S1) it.next()).p());
                }
                a aVarW = n.w(arrayList);
                this.f33627r = aVarW;
                aVarS = n.s(d.b(aVarW).f(new K.a() { // from class: t.b2
                    @Override // K.a
                    public final a apply(Object obj) {
                        return c2.I(this.f33612a, cameraDevice, oVar, list, (List) obj);
                    }
                }, f()));
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVarS;
    }

    @Override // p166t.Y1, t.S1.a
    public a o(List list, long j8) {
        a aVarO;
        synchronized (this.f33625p) {
            this.f33626q = list;
            aVarO = super.o(list, j8);
        }
        return aVarO;
    }

    @Override // p166t.S1
    public a p() {
        return n.q(1500L, this.f33624o, this.f33630u.e());
    }

    @Override // p166t.Y1, t.S1.c
    public void s(S1 s8) {
        synchronized (this.f33625p) {
            this.f33628s.a(this.f33626q);
        }
        L("onClosed()");
        super.s(s8);
    }

    @Override // p166t.Y1, t.S1.a
    public boolean stop() {
        boolean zStop;
        synchronized (this.f33625p) {
            try {
                if (F()) {
                    this.f33628s.a(this.f33626q);
                } else {
                    a aVar = this.f33627r;
                    if (aVar != null) {
                        aVar.cancel(true);
                    }
                }
                zStop = super.stop();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zStop;
    }

    @Override // p166t.Y1, t.S1.c
    public void u(S1 s8) {
        L("Session onConfigured()");
        this.f33629t.c(s8, this.f33590b.e(), this.f33590b.d(), new h.a() { // from class: t.Z1
            @Override // x.h.a
            public final void a(S1 s9) {
                super/*t.Y1*/.u(s9);
            }
        });
    }

    public void L(String str) {
        AbstractC0890p0.a("SyncCaptureSessionImpl", jULK.JQinmnNvD + this + "] " + str);
    }
}
