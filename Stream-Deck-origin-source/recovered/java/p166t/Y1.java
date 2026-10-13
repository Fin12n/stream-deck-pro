package p166t;

import A.AbstractC0890p0;
import F1.c;
import H.AbstractC0994n0;
import H.AbstractC1000q0;
import K.d;
import K.n;
import Y4.a;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p143q0.nKy.bGZGhbtQmA;
import p174u.f;
import p174u.o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class Y1 extends S1.c implements S1, S1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2957m1 f33590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f33591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f33592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f33593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public S1.c f33594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f33595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Y4.a f33596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public F1.c.a f33597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Y4.a f33598j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f33589a = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f33599k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f33600l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f33601m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f33602n = false;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b extends CameraCaptureSession.StateCallback {
        public b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            Y1.this.D(cameraCaptureSession);
            Y1 y8 = Y1.this;
            y8.q(y8);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            Y1.this.D(cameraCaptureSession);
            Y1 y8 = Y1.this;
            y8.r(y8);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            Y1.this.D(cameraCaptureSession);
            Y1 y8 = Y1.this;
            y8.s(y8);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            F1.c.a aVar;
            try {
                Y1.this.D(cameraCaptureSession);
                Y1 y8 = Y1.this;
                y8.t(y8);
                synchronized (Y1.this.f33589a) {
                    T1.f.h(Y1.this.f33597i, "OpenCaptureSession completer should not null");
                    Y1 y9 = Y1.this;
                    aVar = y9.f33597i;
                    y9.f33597i = null;
                }
            } finally {
                synchronized (Y1.this.f33589a) {
                    T1.f.h(Y1.this.f33597i, "OpenCaptureSession completer should not null");
                    Y1 y10 = Y1.this;
                    aVar = y10.f33597i;
                    y10.f33597i = null;
                    aVar.f(new IllegalStateException("onConfigureFailed"));
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            F1.c.a aVar;
            try {
                Y1.this.D(cameraCaptureSession);
                Y1 y8 = Y1.this;
                y8.u(y8);
                synchronized (Y1.this.f33589a) {
                    T1.f.h(Y1.this.f33597i, "OpenCaptureSession completer should not null");
                    Y1 y9 = Y1.this;
                    aVar = y9.f33597i;
                    y9.f33597i = null;
                }
            } finally {
                synchronized (Y1.this.f33589a) {
                    T1.f.h(Y1.this.f33597i, "OpenCaptureSession completer should not null");
                    Y1 y10 = Y1.this;
                    aVar = y10.f33597i;
                    y10.f33597i = null;
                    aVar.c(null);
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            Y1.this.D(cameraCaptureSession);
            Y1 y8 = Y1.this;
            y8.v(y8);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            Y1.this.D(cameraCaptureSession);
            Y1 y8 = Y1.this;
            y8.x(y8, surface);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {
        public static List a(CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, CaptureRequest captureRequest) {
            return cameraConstrainedHighSpeedCaptureSession.createHighSpeedRequestList(captureRequest);
        }
    }

    public Y1(C2957m1 c2957m1, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f33590b = c2957m1;
        this.f33591c = handler;
        this.f33592d = executor;
        this.f33593e = scheduledExecutorService;
    }

    public static /* synthetic */ void A(Y1 y8, S1 s8) {
        Objects.requireNonNull(y8.f33594f);
        y8.f33594f.C(s8);
    }

    public static /* synthetic */ Y4.a B(Y1 y8, List list, List list2) {
        y8.getClass();
        AbstractC0890p0.a("SyncCaptureSessionBase", "[" + y8 + "] getSurface done with results: " + list2);
        if (list2.isEmpty()) {
            return n.n(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        return list2.contains(null) ? n.n(new AbstractC0994n0.a("Surface closed", (AbstractC0994n0) list.get(list2.indexOf(null)))) : n.p(list2);
    }

    public static /* synthetic */ void y(Y1 y8, S1 s8) {
        y8.f33590b.g(y8);
        y8.C(s8);
        if (y8.f33595g != null) {
            Objects.requireNonNull(y8.f33594f);
            y8.f33594f.s(s8);
            return;
        }
        AbstractC0890p0.l("SyncCaptureSessionBase", "[" + y8 + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
    }

    public static /* synthetic */ Object z(Y1 y8, List list, o oVar, p182v.o oVar2, F1.c.a aVar) {
        String str;
        synchronized (y8.f33589a) {
            y8.E(list);
            T1.f.j(y8.f33597i == null, "The openCaptureSessionCompleter can only set once!");
            y8.f33597i = aVar;
            oVar.a(oVar2);
            str = "openCaptureSession[session=" + y8 + "]";
        }
        return str;
    }

    public void D(CameraCaptureSession cameraCaptureSession) {
        if (this.f33595g == null) {
            this.f33595g = f.e(cameraCaptureSession, this.f33591c);
        }
    }

    public void E(List list) {
        synchronized (this.f33589a) {
            G();
            AbstractC1000q0.d(list);
            this.f33599k = list;
        }
    }

    public boolean F() {
        boolean z8;
        synchronized (this.f33589a) {
            z8 = this.f33596h != null;
        }
        return z8;
    }

    public void G() {
        synchronized (this.f33589a) {
            try {
                List list = this.f33599k;
                if (list != null) {
                    AbstractC1000q0.c(list);
                    this.f33599k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p166t.S1
    public void a() {
        G();
    }

    @Override // p166t.S1
    public int b(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        T1.f.h(this.f33595g, "Need to call openCaptureSession before using this API.");
        return this.f33595g.b(list, f(), captureCallback);
    }

    @Override // t.S1.a
    public p182v.o c(int i8, List list, S1.c cVar) {
        this.f33594f = cVar;
        return new p182v.o(i8, list, f(), new b());
    }

    @Override // p166t.S1
    public void close() {
        T1.f.h(this.f33595g, "Need to call openCaptureSession before using this API.");
        this.f33590b.h(this);
        this.f33595g.d().close();
        f().execute(new Runnable() { // from class: t.W1
            @Override // java.lang.Runnable
            public final void run() {
                Y1 y8 = this.f33565a;
                y8.C(y8);
            }
        });
    }

    @Override // p166t.S1
    public int d(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        T1.f.h(this.f33595g, "Need to call openCaptureSession before using this API.");
        return this.f33595g.a(list, f(), captureCallback);
    }

    @Override // p166t.S1
    public f e() {
        T1.f.g(this.f33595g);
        return this.f33595g;
    }

    @Override // t.S1.a
    public Executor f() {
        return this.f33592d;
    }

    @Override // p166t.S1
    public void g(int i8) {
    }

    @Override // p166t.S1
    public void h() {
        T1.f.h(this.f33595g, "Need to call openCaptureSession before using this API.");
        this.f33595g.d().abortCaptures();
    }

    @Override // p166t.S1
    public CameraDevice i() {
        T1.f.g(this.f33595g);
        return this.f33595g.d().getDevice();
    }

    @Override // p166t.S1
    public int j(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        T1.f.h(this.f33595g, "Need to call openCaptureSession before using this API.");
        return this.f33595g.c(captureRequest, f(), captureCallback);
    }

    @Override // t.S1.a
    public Y4.a k(CameraDevice cameraDevice, final p182v.o oVar, final List list) {
        synchronized (this.f33589a) {
            try {
                if (this.f33601m) {
                    return n.n(new CancellationException("Opener is disabled"));
                }
                this.f33590b.k(this);
                final o oVarB = o.b(cameraDevice, this.f33591c);
                Y4.a aVarA = F1.c.a(new F1.c.InterfaceC0112c() { // from class: t.X1
                    @Override // F1.c.InterfaceC0112c
                    public final Object a(c.a aVar) {
                        return Y1.z(this.f33570a, list, oVarB, oVar, aVar);
                    }
                });
                this.f33596h = aVarA;
                n.j(aVarA, new a(), J.a.a());
                return n.s(this.f33596h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p166t.S1
    public S1.c l() {
        return this;
    }

    @Override // p166t.S1
    public List m(CaptureRequest captureRequest) {
        CameraCaptureSession cameraCaptureSessionD = ((f) T1.f.g(this.f33595g)).d();
        return cameraCaptureSessionD instanceof CameraConstrainedHighSpeedCaptureSession ? c.a((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSessionD, captureRequest) : Collections.EMPTY_LIST;
    }

    @Override // p166t.S1
    public void n() throws CameraAccessException {
        T1.f.h(this.f33595g, "Need to call openCaptureSession before using this API.");
        this.f33595g.d().stopRepeating();
    }

    @Override // t.S1.a
    public Y4.a o(final List list, long j8) {
        synchronized (this.f33589a) {
            try {
                if (this.f33601m) {
                    return n.n(new CancellationException("Opener is disabled"));
                }
                d dVarF = d.b(AbstractC1000q0.e(list, false, j8, f(), this.f33593e)).f(new K.a() { // from class: t.U1
                    @Override // K.a
                    public final a apply(Object obj) {
                        return Y1.B(this.f33559a, list, (List) obj);
                    }
                }, f());
                this.f33598j = dVarF;
                return n.s(dVarF);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t.S1.c
    public void q(S1 s8) {
        Objects.requireNonNull(this.f33594f);
        this.f33594f.q(s8);
    }

    @Override // t.S1.c
    public void r(S1 s8) {
        Objects.requireNonNull(this.f33594f);
        this.f33594f.r(s8);
    }

    @Override // t.S1.a
    public boolean stop() {
        boolean z8;
        Y4.a aVar = null;
        try {
            synchronized (this.f33589a) {
                try {
                    if (!this.f33601m) {
                        Y4.a aVar2 = this.f33598j;
                        aVar = aVar2 != null ? aVar2 : null;
                        this.f33601m = true;
                    }
                    z8 = !F();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (aVar != null) {
                aVar.cancel(true);
            }
            return z8;
        } catch (Throwable th2) {
            if (aVar != null) {
                aVar.cancel(true);
            }
            throw th2;
        }
    }

    @Override // t.S1.c
    public void t(S1 s8) {
        Objects.requireNonNull(this.f33594f);
        a();
        this.f33590b.i(this);
        this.f33594f.t(s8);
    }

    @Override // t.S1.c
    public void u(S1 s8) {
        Objects.requireNonNull(this.f33594f);
        this.f33590b.j(this);
        this.f33594f.u(s8);
    }

    @Override // t.S1.c
    public void v(S1 s8) {
        Objects.requireNonNull(this.f33594f);
        this.f33594f.v(s8);
    }

    @Override // t.S1.c
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void C(final S1 s8) {
        Y4.a aVar;
        synchronized (this.f33589a) {
            try {
                if (this.f33602n) {
                    aVar = null;
                } else {
                    this.f33602n = true;
                    T1.f.h(this.f33596h, "Need to call openCaptureSession before using this API.");
                    aVar = this.f33596h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.a(new Runnable() { // from class: t.V1
                @Override // java.lang.Runnable
                public final void run() {
                    Y1.A(this.f33562a, s8);
                }
            }, J.a.a());
        }
    }

    @Override // t.S1.c
    public void x(S1 s8, Surface surface) {
        Objects.requireNonNull(this.f33594f);
        this.f33594f.x(s8, surface);
    }

    @Override // t.S1.c
    public void s(final S1 s8) {
        Y4.a aVar;
        synchronized (this.f33589a) {
            try {
                if (this.f33600l) {
                    aVar = null;
                } else {
                    this.f33600l = true;
                    T1.f.h(this.f33596h, bGZGhbtQmA.paeNOSGgAGpWq);
                    aVar = this.f33596h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        a();
        if (aVar != null) {
            aVar.a(new Runnable() { // from class: t.T1
                @Override // java.lang.Runnable
                public final void run() {
                    Y1.y(this.f33555a, s8);
                }
            }, J.a.a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements K.c {
        public a() {
        }

        @Override // K.c
        public void b(Throwable th) {
            Y1.this.a();
            Y1 y8 = Y1.this;
            y8.f33590b.i(y8);
        }

        @Override // K.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r8) {
        }
    }
}
