package p166t;

import A.AbstractC0890p0;
import A.J;
import F1.c;
import H.AbstractC0994n0;
import H.AbstractC0995o;
import H.C0980g0;
import H.Z0;
import H.c1;
import I0.mIk.efuWFSeiT;
import K.n;
import T1.f;
import Y4.a;
import Z.JTT.ryTuoS;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.utils.SurfaceUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import p090k.zI.jULK;
import p182v.e;
import p182v.h;
import p182v.i;
import p182v.o;
import p198x.s;
import p198x.v;
import p198x.y;
import p198x.z;

/* JADX INFO: renamed from: t.i1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2945i1 implements InterfaceC2948j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f33731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f33732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f33733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public S1.a f33734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public S1 f33735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c1 f33736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f33737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f33738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f33739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f33740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Y4.a f33741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public F1.c.a f33742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Map f33743m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v f33744n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final z f33745o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f33746p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f33747q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f33748r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f33749s;

    /* JADX INFO: renamed from: t.i1$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b extends CameraCaptureSession.CaptureCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            synchronized (C2945i1.this.f33731a) {
                try {
                    c1 c1Var = C2945i1.this.f33736f;
                    if (c1Var == null) {
                        return;
                    }
                    C0980g0 c0980g0K = c1Var.k();
                    AbstractC0890p0.a("CaptureSession", "Submit FLASH_MODE_OFF request");
                    C2945i1 c2945i1 = C2945i1.this;
                    c2945i1.f(Collections.singletonList(c2945i1.f33745o.a(c0980g0K)));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: t.i1$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum c {
        UNINITIALIZED,
        RELEASED,
        INITIALIZED,
        GET_SURFACE,
        RELEASING,
        CLOSED,
        f33758g,
        OPENED
    }

    /* JADX INFO: renamed from: t.i1$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class d extends S1.c {
        public d() {
        }

        @Override // t.S1.c
        public void t(S1 s8) {
            synchronized (C2945i1.this.f33731a) {
                try {
                    switch (C2945i1.this.f33740j) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + C2945i1.this.f33740j);
                        case RELEASED:
                            AbstractC0890p0.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                        case RELEASING:
                        case CLOSED:
                        case f33758g:
                            C2945i1.this.s();
                            break;
                    }
                    AbstractC0890p0.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + C2945i1.this.f33740j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // t.S1.c
        public void u(S1 s8) {
            synchronized (C2945i1.this.f33731a) {
                try {
                    switch (C2945i1.this.f33740j) {
                        case UNINITIALIZED:
                        case RELEASED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + C2945i1.this.f33740j);
                        case RELEASING:
                            s8.close();
                            break;
                        case CLOSED:
                            C2945i1.this.f33735e = s8;
                            break;
                        case f33758g:
                            C2945i1.this.A(c.OPENED);
                            C2945i1.this.f33735e = s8;
                            AbstractC0890p0.a("CaptureSession", "Attempting to send capture request onConfigured");
                            C2945i1 c2945i1 = C2945i1.this;
                            c2945i1.y(c2945i1.f33736f);
                            C2945i1.this.x();
                            break;
                    }
                    AbstractC0890p0.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C2945i1.this.f33740j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // t.S1.c
        public void v(S1 s8) {
            synchronized (C2945i1.this.f33731a) {
                try {
                    if (C2945i1.this.f33740j.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + C2945i1.this.f33740j);
                    }
                    AbstractC0890p0.a("CaptureSession", "CameraCaptureSession.onReady() " + C2945i1.this.f33740j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // t.S1.c
        /* JADX INFO: renamed from: w */
        public void C(S1 s8) {
            synchronized (C2945i1.this.f33731a) {
                try {
                    if (C2945i1.this.f33740j == c.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + C2945i1.this.f33740j);
                    }
                    AbstractC0890p0.a(jULK.joaV, "onSessionFinished()");
                    C2945i1.this.s();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C2945i1(e eVar) {
        this(eVar, false);
    }

    public static /* synthetic */ void j(C2945i1 c2945i1) {
        synchronized (c2945i1.f33731a) {
            if (c2945i1.f33732b.isEmpty()) {
                return;
            }
            try {
                c2945i1.w(c2945i1.f33732b);
                c2945i1.f33732b.clear();
            } catch (Throwable th) {
                c2945i1.f33732b.clear();
                throw th;
            }
        }
    }

    public static /* synthetic */ Object k(C2945i1 c2945i1, F1.c.a aVar) {
        String str;
        synchronized (c2945i1.f33731a) {
            f.j(c2945i1.f33742l == null, "Release completer expected to be null");
            c2945i1.f33742l = aVar;
            str = "Release[session=" + c2945i1 + "]";
        }
        return str;
    }

    public static /* synthetic */ void m(C2945i1 c2945i1, CameraCaptureSession cameraCaptureSession, int i8, boolean z8) {
        synchronized (c2945i1.f33731a) {
            try {
                if (c2945i1.f33740j == c.OPENED) {
                    c2945i1.y(c2945i1.f33736f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Map r(Map map, Map map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.intValue();
            ArrayList arrayList = new ArrayList();
            int i8 = 0;
            for (c1.f fVar : (List) map.get(num)) {
                SurfaceUtil.a aVarA = SurfaceUtil.a((Surface) map2.get(fVar.f()));
                if (i8 == 0) {
                    i8 = aVarA.f14166a;
                }
                AbstractC2930d1.a();
                int i9 = aVarA.f14167b;
                int i10 = aVarA.f14168c;
                String strD = fVar.d();
                Objects.requireNonNull(strD);
                arrayList.add(AbstractC2927c1.a(i9, i10, strD));
            }
            if (i8 == 0 || arrayList.isEmpty()) {
                AbstractC0890p0.c("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: " + i8 + ", streamInfos size: " + arrayList.size());
            } else {
                List listCreateInstancesForMultiResolutionOutput = OutputConfiguration.createInstancesForMultiResolutionOutput(arrayList, i8);
                if (listCreateInstancesForMultiResolutionOutput != null) {
                    for (c1.f fVar2 : (List) map.get(num)) {
                        OutputConfiguration outputConfiguration = (OutputConfiguration) listCreateInstancesForMultiResolutionOutput.remove(0);
                        outputConfiguration.addSurface((Surface) map2.get(fVar2.f()));
                        map3.put(fVar2, new i(outputConfiguration));
                    }
                }
            }
        }
        return map3;
    }

    public static Map v(Collection collection) {
        HashMap map = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c1.f fVar = (c1.f) it.next();
            if (fVar.g() > 0 && fVar.e().isEmpty()) {
                List arrayList = (List) map.get(Integer.valueOf(fVar.g()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Integer.valueOf(fVar.g()), arrayList);
                }
                arrayList.add(fVar);
            }
        }
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            num.intValue();
            if (((List) map.get(num)).size() >= 2) {
                map2.put(num, (List) map.get(num));
            }
        }
        return map2;
    }

    public final void A(c cVar) {
        if (cVar.ordinal() > this.f33739i.ordinal()) {
            this.f33739i = cVar;
        }
        this.f33740j = cVar;
        if (!E2.a.d() || this.f33739i.ordinal() < c.GET_SURFACE.ordinal()) {
            return;
        }
        E2.a.f("CX:C2State[" + String.format("CaptureSession@%x", Integer.valueOf(hashCode())) + "]", cVar.ordinal());
    }

    @Override // p166t.InterfaceC2948j1
    public void a(c1 c1Var) {
        synchronized (this.f33731a) {
            try {
                switch (this.f33740j) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f33740j);
                    case RELEASED:
                    case RELEASING:
                    case CLOSED:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                    case INITIALIZED:
                    case GET_SURFACE:
                    case f33758g:
                        this.f33736f = c1Var;
                        break;
                    case OPENED:
                        this.f33736f = c1Var;
                        if (c1Var == null) {
                            return;
                        }
                        if (!this.f33737g.keySet().containsAll(c1Var.o())) {
                            AbstractC0890p0.c("CaptureSession", "Does not have the proper configured lists");
                            return;
                        } else {
                            AbstractC0890p0.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            y(this.f33736f);
                        }
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p166t.InterfaceC2948j1
    public void b() {
        ArrayList<C0980g0> arrayList;
        synchronized (this.f33731a) {
            try {
                if (this.f33732b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.f33732b);
                    this.f33732b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            for (C0980g0 c0980g0 : arrayList) {
                Iterator it = c0980g0.c().iterator();
                while (it.hasNext()) {
                    ((AbstractC0995o) it.next()).a(c0980g0.f());
                }
            }
        }
    }

    @Override // p166t.InterfaceC2948j1
    public Y4.a c(final c1 c1Var, final CameraDevice cameraDevice, S1.a aVar) {
        synchronized (this.f33731a) {
            try {
                if (this.f33740j.ordinal() == 2) {
                    A(c.GET_SURFACE);
                    ArrayList arrayList = new ArrayList(c1Var.o());
                    this.f33738h = arrayList;
                    this.f33734d = aVar;
                    K.d dVarF = K.d.b(aVar.o(arrayList, 5000L)).f(new K.a() { // from class: t.f1
                        @Override // K.a
                        public final a apply(Object obj) {
                            return this.f33707a.z((List) obj, c1Var, cameraDevice);
                        }
                    }, this.f33734d.f());
                    n.j(dVarF, new a(), this.f33734d.f());
                    return n.s(dVarF);
                }
                AbstractC0890p0.c("CaptureSession", "Open not allowed in state: " + this.f33740j);
                return n.n(new IllegalStateException("open() should not allow the state: " + this.f33740j));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p166t.InterfaceC2948j1
    public void close() {
        synchronized (this.f33731a) {
            try {
                int iOrdinal = this.f33740j.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.f33740j);
                }
                if (iOrdinal == 2) {
                    A(c.RELEASED);
                } else if (iOrdinal == 3) {
                    f.h(this.f33734d, "The Opener shouldn't null in state:" + this.f33740j);
                    this.f33734d.stop();
                    A(c.RELEASED);
                } else if (iOrdinal == 6 || iOrdinal == 7) {
                    f.h(this.f33734d, "The Opener shouldn't null in state:" + this.f33740j);
                    this.f33734d.stop();
                    A(c.CLOSED);
                    this.f33746p.g();
                    this.f33736f = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[Catch: all -> 0x001a, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000b, B:29:0x008d, B:8:0x0010, B:11:0x0016, B:17:0x0025, B:16:0x001e, B:18:0x002a, B:20:0x0054, B:21:0x0058, B:23:0x005c, B:24:0x0067, B:25:0x0069, B:27:0x006b, B:28:0x0088, B:32:0x0094, B:33:0x00ac), top: B:38:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x005c A[Catch: all -> 0x001a, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000b, B:29:0x008d, B:8:0x0010, B:11:0x0016, B:17:0x0025, B:16:0x001e, B:18:0x002a, B:20:0x0054, B:21:0x0058, B:23:0x005c, B:24:0x0067, B:25:0x0069, B:27:0x006b, B:28:0x0088, B:32:0x0094, B:33:0x00ac), top: B:38:0x0003, inners: #0 }] */
    @Override // p166t.InterfaceC2948j1
    public Y4.a d(boolean z8) {
        synchronized (this.f33731a) {
            int iOrdinal = this.f33740j.ordinal();
            if (iOrdinal == 0) {
                throw new IllegalStateException("release() should not be possible in state: " + this.f33740j);
            }
            switch (iOrdinal) {
                case 2:
                    A(c.RELEASED);
                    return n.p(null);
                case 3:
                    f.h(this.f33734d, "The Opener shouldn't null in state:" + this.f33740j);
                    this.f33734d.stop();
                    A(c.RELEASED);
                    return n.p(null);
                case 4:
                    if (this.f33741k == null) {
                        this.f33741k = F1.c.a(new F1.c.InterfaceC0112c() { // from class: t.e1
                            @Override // F1.c.InterfaceC0112c
                            public final Object a(c.a aVar) {
                                return C2945i1.k(this.f33648a, aVar);
                            }
                        });
                    }
                    return this.f33741k;
                case 5:
                case 7:
                    S1 s8 = this.f33735e;
                    if (s8 != null) {
                        if (z8) {
                            try {
                                s8.h();
                            } catch (CameraAccessException e8) {
                                AbstractC0890p0.d("CaptureSession", "Unable to abort captures.", e8);
                            }
                        }
                        this.f33735e.close();
                        break;
                    }
                    A(c.RELEASING);
                    this.f33746p.g();
                    f.h(this.f33734d, "The Opener shouldn't null in state:" + this.f33740j);
                    if (this.f33734d.stop()) {
                        s();
                        return n.p(null);
                    }
                    if (this.f33741k == null) {
                        this.f33741k = F1.c.a(new F1.c.InterfaceC0112c() { // from class: t.e1
                            @Override // F1.c.InterfaceC0112c
                            public final Object a(c.a aVar) {
                                return C2945i1.k(this.f33648a, aVar);
                            }
                        });
                    }
                    return this.f33741k;
                case 6:
                    A(c.RELEASING);
                    this.f33746p.g();
                    f.h(this.f33734d, "The Opener shouldn't null in state:" + this.f33740j);
                    if (this.f33734d.stop()) {
                        s();
                        return n.p(null);
                    }
                    if (this.f33741k == null) {
                        this.f33741k = F1.c.a(new F1.c.InterfaceC0112c() { // from class: t.e1
                            @Override // F1.c.InterfaceC0112c
                            public final Object a(c.a aVar) {
                                return C2945i1.k(this.f33648a, aVar);
                            }
                        });
                    }
                    return this.f33741k;
                default:
                    return n.p(null);
            }
        }
    }

    @Override // p166t.InterfaceC2948j1
    public List e() {
        List listUnmodifiableList;
        synchronized (this.f33731a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f33732b);
        }
        return listUnmodifiableList;
    }

    @Override // p166t.InterfaceC2948j1
    public void f(List list) {
        synchronized (this.f33731a) {
            try {
                switch (this.f33740j) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f33740j);
                    case RELEASED:
                    case RELEASING:
                    case CLOSED:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                    case INITIALIZED:
                    case GET_SURFACE:
                    case f33758g:
                        this.f33732b.addAll(list);
                        break;
                    case OPENED:
                        this.f33732b.addAll(list);
                        x();
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p166t.InterfaceC2948j1
    public c1 g() {
        c1 c1Var;
        synchronized (this.f33731a) {
            c1Var = this.f33736f;
        }
        return c1Var;
    }

    @Override // p166t.InterfaceC2948j1
    public boolean h() {
        boolean z8;
        synchronized (this.f33731a) {
            try {
                c cVar = this.f33740j;
                z8 = cVar == c.OPENED || cVar == c.f33758g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z8;
    }

    @Override // p166t.InterfaceC2948j1
    public void i(Map map) {
        synchronized (this.f33731a) {
            this.f33743m = map;
        }
    }

    public final int p(List list, S0 s8) {
        S0 s9 = new S0();
        Iterator it = list.iterator();
        int iD = -1;
        while (it.hasNext()) {
            CaptureRequest captureRequest = (CaptureRequest) it.next();
            S1 s10 = this.f33735e;
            Objects.requireNonNull(s10);
            List listM = s10.m(captureRequest);
            Iterator it2 = listM.iterator();
            while (it2.hasNext()) {
                s9.a((CaptureRequest) it2.next(), Collections.singletonList(new L1(captureRequest, s8)));
            }
            iD = this.f33735e.d(listM, s9);
        }
        return iD;
    }

    public final CameraCaptureSession.CaptureCallback q(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC2924b1.a((AbstractC0995o) it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return Z.a(arrayList);
    }

    public void s() {
        c cVar = this.f33740j;
        c cVar2 = c.RELEASED;
        if (cVar == cVar2) {
            AbstractC0890p0.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        A(cVar2);
        this.f33735e = null;
        F1.c.a aVar = this.f33742l;
        if (aVar != null) {
            aVar.c(null);
            this.f33742l = null;
        }
    }

    public final i t(c1.f fVar, Map map, String str) {
        long jLongValue;
        DynamicRangeProfiles dynamicRangeProfilesD;
        Surface surface = (Surface) map.get(fVar.f());
        f.h(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        i iVar = new i(fVar.g(), surface);
        if (str != null) {
            iVar.f(str);
        } else {
            iVar.f(fVar.d());
        }
        if (fVar.c() == 0) {
            iVar.e(1);
        } else if (fVar.c() == 1) {
            iVar.e(2);
        }
        if (!fVar.e().isEmpty()) {
            iVar.b();
            Iterator it = fVar.e().iterator();
            while (it.hasNext()) {
                Surface surface2 = (Surface) map.get((AbstractC0994n0) it.next());
                f.h(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                iVar.a(surface2);
            }
        }
        if (Build.VERSION.SDK_INT < 33 || (dynamicRangeProfilesD = this.f33747q.d()) == null) {
            jLongValue = 1;
        } else {
            J jB = fVar.b();
            Long lA = p182v.c.a(jB, dynamicRangeProfilesD);
            if (lA == null) {
                AbstractC0890p0.c("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + jB);
                jLongValue = 1;
            } else {
                jLongValue = lA.longValue();
            }
        }
        iVar.d(jLongValue);
        return iVar;
    }

    public final List u(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!arrayList.contains(iVar.c())) {
                arrayList.add(iVar.c());
                arrayList2.add(iVar);
            }
        }
        return arrayList2;
    }

    public void x() {
        this.f33746p.e().a(new Runnable() { // from class: t.g1
            @Override // java.lang.Runnable
            public final void run() {
                C2945i1.j(this.f33712a);
            }
        }, J.a.a());
    }

    public final Y4.a z(List list, c1 c1Var, CameraDevice cameraDevice) {
        synchronized (this.f33731a) {
            try {
                int iOrdinal = this.f33740j.ordinal();
                if (iOrdinal == 0 || iOrdinal == 7 || iOrdinal == 2) {
                    return n.n(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f33740j));
                }
                if (iOrdinal != 3) {
                    return n.n(new CancellationException("openCaptureSession() not execute in state: " + this.f33740j));
                }
                this.f33737g.clear();
                for (int i8 = 0; i8 < list.size(); i8++) {
                    this.f33737g.put((AbstractC0994n0) this.f33738h.get(i8), (Surface) list.get(i8));
                }
                A(c.f33758g);
                AbstractC0890p0.a("CaptureSession", "Opening capture session.");
                S1.c cVarY = d2.y(this.f33733c, new d2.a(c1Var.l()));
                p158s.a aVar = new p158s.a(c1Var.g());
                C0980g0.a aVarJ = C0980g0.a.j(c1Var.k());
                Map map = new HashMap();
                if (this.f33749s && Build.VERSION.SDK_INT >= 35) {
                    map = r(v(c1Var.i()), this.f33737g);
                }
                ArrayList arrayList = new ArrayList();
                String strJ0 = aVar.j0(null);
                for (c1.f fVar : c1Var.i()) {
                    i iVarT = (!this.f33749s || Build.VERSION.SDK_INT < 35) ? null : (i) map.get(fVar);
                    if (iVarT == null) {
                        iVarT = t(fVar, this.f33737g, strJ0);
                        if (this.f33743m.containsKey(fVar.f())) {
                            iVarT.g(((Long) this.f33743m.get(fVar.f())).longValue());
                        }
                    }
                    arrayList.add(iVarT);
                }
                o oVarC = this.f33734d.c(c1Var.m(), u(arrayList), cVarY);
                if (c1Var.p() == 5 && c1Var.h() != null) {
                    oVarC.a(h.b(c1Var.h()));
                }
                try {
                    CaptureRequest captureRequestF = J0.f(aVarJ.h(), cameraDevice, this.f33748r);
                    if (captureRequestF != null) {
                        oVarC.b(captureRequestF);
                    }
                    return this.f33734d.k(cameraDevice, oVarC, this.f33738h);
                } catch (CameraAccessException e8) {
                    return n.n(e8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C2945i1(e eVar, boolean z8) {
        this(eVar, new Z0(Collections.EMPTY_LIST), z8, null);
    }

    public int w(List list) {
        synchronized (this.f33731a) {
            try {
                if (this.f33740j != c.OPENED) {
                    AbstractC0890p0.a("CaptureSession", ryTuoS.GhcLKDRQuO);
                    return -1;
                }
                if (list.isEmpty()) {
                    return -1;
                }
                try {
                    S0 s8 = new S0();
                    ArrayList arrayList = new ArrayList();
                    AbstractC0890p0.a("CaptureSession", "Issuing capture request.");
                    Iterator it = list.iterator();
                    boolean z8 = false;
                    while (it.hasNext()) {
                        C0980g0 c0980g0 = (C0980g0) it.next();
                        if (!c0980g0.i().isEmpty()) {
                            Iterator it2 = c0980g0.i().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    if (c0980g0.k() == 2) {
                                        z8 = true;
                                    }
                                    C0980g0.a aVarJ = C0980g0.a.j(c0980g0);
                                    if (c0980g0.k() == 5 && c0980g0.d() != null) {
                                        aVarJ.n(c0980g0.d());
                                    }
                                    c1 c1Var = this.f33736f;
                                    if (c1Var != null) {
                                        aVarJ.e(c1Var.k().g());
                                    }
                                    aVarJ.e(c0980g0.g());
                                    CaptureRequest captureRequestE = J0.e(aVarJ.h(), this.f33735e.i(), this.f33737g, false, this.f33748r);
                                    if (captureRequestE != null) {
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator it3 = c0980g0.c().iterator();
                                        while (it3.hasNext()) {
                                            AbstractC2924b1.b((AbstractC0995o) it3.next(), arrayList2);
                                        }
                                        s8.a(captureRequestE, arrayList2);
                                        arrayList.add(captureRequestE);
                                        break;
                                    }
                                    AbstractC0890p0.a("CaptureSession", "Skipping issuing request without surface.");
                                    return -1;
                                }
                                AbstractC0994n0 abstractC0994n0 = (AbstractC0994n0) it2.next();
                                if (!this.f33737g.containsKey(abstractC0994n0)) {
                                    AbstractC0890p0.a("CaptureSession", "Skipping capture request with invalid surface: " + abstractC0994n0);
                                    break;
                                }
                            }
                        } else {
                            AbstractC0890p0.a("CaptureSession", "Skipping issuing empty capture request.");
                        }
                    }
                    if (arrayList.isEmpty()) {
                        AbstractC0890p0.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                        return -1;
                    }
                    if (this.f33744n.a(arrayList, z8)) {
                        this.f33735e.n();
                        s8.c(new S0.a() { // from class: t.h1
                            @Override // t.S0.a
                            public final void a(CameraCaptureSession cameraCaptureSession, int i8, boolean z9) {
                                C2945i1.m(this.f33727a, cameraCaptureSession, i8, z9);
                            }
                        });
                    }
                    if (this.f33745o.b(arrayList, z8)) {
                        s8.a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new b()));
                    }
                    c1 c1Var2 = this.f33736f;
                    if (c1Var2 == null || c1Var2.m() != 1) {
                        return this.f33735e.d(arrayList, s8);
                    }
                    return p(arrayList, s8);
                } catch (CameraAccessException e8) {
                    AbstractC0890p0.c("CaptureSession", "Unable to access camera: " + e8.getMessage());
                    Thread.dumpStack();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int y(c1 c1Var) {
        synchronized (this.f33731a) {
            try {
                if (c1Var == null) {
                    AbstractC0890p0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                    return -1;
                }
                if (this.f33740j != c.OPENED) {
                    AbstractC0890p0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                    return -1;
                }
                C0980g0 c0980g0K = c1Var.k();
                if (c0980g0K.i().isEmpty()) {
                    AbstractC0890p0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                    try {
                        this.f33735e.n();
                    } catch (CameraAccessException e8) {
                        AbstractC0890p0.c("CaptureSession", "Unable to access camera: " + e8.getMessage());
                        Thread.dumpStack();
                    }
                    return -1;
                }
                try {
                    AbstractC0890p0.a("CaptureSession", efuWFSeiT.ORFR);
                    CaptureRequest captureRequestE = J0.e(c0980g0K, this.f33735e.i(), this.f33737g, true, this.f33748r);
                    if (captureRequestE == null) {
                        AbstractC0890p0.a("CaptureSession", "Skipping issuing empty request for session.");
                        return -1;
                    }
                    CameraCaptureSession.CaptureCallback captureCallbackD = this.f33746p.d(q(c0980g0K.c(), new CameraCaptureSession.CaptureCallback[0]));
                    if (c1Var.m() != 1) {
                        return this.f33735e.j(captureRequestE, captureCallbackD);
                    }
                    return this.f33735e.b(this.f33735e.m(captureRequestE), captureCallbackD);
                } catch (CameraAccessException e9) {
                    AbstractC0890p0.c("CaptureSession", "Unable to access camera: " + e9.getMessage());
                    Thread.dumpStack();
                    return -1;
                }
                throw th;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C2945i1(e eVar, Z0 z8, p214z.i iVar) {
        this(eVar, z8, false, iVar);
    }

    public C2945i1(e eVar, Z0 z8, boolean z9, p214z.i iVar) {
        this.f33731a = new Object();
        this.f33732b = new ArrayList();
        this.f33737g = new HashMap();
        this.f33738h = Collections.EMPTY_LIST;
        c cVar = c.UNINITIALIZED;
        this.f33739i = cVar;
        this.f33740j = cVar;
        this.f33743m = new HashMap();
        this.f33744n = new v();
        this.f33745o = new z();
        A(c.INITIALIZED);
        this.f33747q = eVar;
        this.f33733c = new d();
        this.f33746p = new s(z8.a(CaptureNoResponseQuirk.class));
        this.f33748r = new y(z8);
        this.f33749s = z9;
    }

    /* JADX INFO: renamed from: t.i1$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements K.c {
        public a() {
        }

        @Override // K.c
        public void b(Throwable th) {
            synchronized (C2945i1.this.f33731a) {
                try {
                    C2945i1.this.f33734d.stop();
                    int iOrdinal = C2945i1.this.f33740j.ordinal();
                    if ((iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6) && !(th instanceof CancellationException)) {
                        AbstractC0890p0.m("CaptureSession", "Opening session with fail " + C2945i1.this.f33740j, th);
                        C2945i1.this.s();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // K.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r8) {
        }
    }
}
