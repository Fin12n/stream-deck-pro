package p211y4;

import K4.h;
import S4.k;
import S4.l;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p010b0.C1749b;
import p195w4.b;
import p195w4.e;
import p219z4.AbstractC3199h;
import p219z4.AbstractC3210t;
import p219z4.C3205n;
import p219z4.C3208q;
import p219z4.C3209s;
import p219z4.G;
import p219z4.InterfaceC3211u;
import p219z4.r;

/* JADX INFO: renamed from: y4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C3104e implements Handler.Callback {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Status f38358p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Status f38359q = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f38360r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static C3104e f38361s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3209s f38364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC3211u f38365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f38366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f38367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final G f38368g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f38375n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f38376o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f38362a = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f38363b = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f38369h = new AtomicInteger(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f38370i = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f38371j = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C3117s f38372k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f38373l = new C1749b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f38374m = new C1749b();

    public C3104e(Context context, Looper looper, e eVar) {
        this.f38376o = true;
        this.f38366e = context;
        h hVar = new h(looper, this);
        this.f38375n = hVar;
        this.f38367f = eVar;
        this.f38368g = new G(eVar);
        if (F4.e.a(context)) {
            this.f38376o = false;
        }
        hVar.sendMessage(hVar.obtainMessage(6));
    }

    public static Status f(C3101b c3101b, b bVar) {
        return new Status(bVar, "API: " + c3101b.b() + " is not available on this device. Connection failed with: " + String.valueOf(bVar));
    }

    public static C3104e t(Context context) {
        C3104e c3104e;
        synchronized (f38360r) {
            try {
                if (f38361s == null) {
                    f38361s = new C3104e(context.getApplicationContext(), AbstractC3199h.c().getLooper(), e.m());
                }
                c3104e = f38361s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3104e;
    }

    public final void A(C3205n c3205n, int i8, long j8, int i9) {
        this.f38375n.sendMessage(this.f38375n.obtainMessage(18, new L(c3205n, i8, j8, i9)));
    }

    public final void B(b bVar, int i8) {
        if (e(bVar, i8)) {
            return;
        }
        Handler handler = this.f38375n;
        handler.sendMessage(handler.obtainMessage(5, i8, 0, bVar));
    }

    public final void C() {
        Handler handler = this.f38375n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void D(p203x4.e eVar) {
        Handler handler = this.f38375n;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void a(C3117s c3117s) {
        synchronized (f38360r) {
            try {
                if (this.f38372k != c3117s) {
                    this.f38372k = c3117s;
                    this.f38373l.clear();
                }
                this.f38373l.addAll(c3117s.t());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(C3117s c3117s) {
        synchronized (f38360r) {
            try {
                if (this.f38372k == c3117s) {
                    this.f38372k = null;
                    this.f38373l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        if (this.f38363b) {
            return false;
        }
        r rVarA = C3208q.b().a();
        if (rVarA != null && !rVarA.c()) {
            return false;
        }
        int iA = this.f38368g.a(this.f38366e, 203400000);
        return iA == -1 || iA == 0;
    }

    public final boolean e(b bVar, int i8) {
        return this.f38367f.w(this.f38366e, bVar, i8);
    }

    public final B g(p203x4.e eVar) {
        Map map = this.f38371j;
        C3101b c3101bD = eVar.d();
        B b8 = (B) map.get(c3101bD);
        if (b8 == null) {
            b8 = new B(this, eVar);
            this.f38371j.put(c3101bD, b8);
        }
        if (b8.b()) {
            this.f38374m.add(c3101bD);
        }
        b8.F();
        return b8;
    }

    public final InterfaceC3211u h() {
        if (this.f38365d == null) {
            this.f38365d = AbstractC3210t.a(this.f38366e);
        }
        return this.f38365d;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:66:0x0220  */
    /* JADX WARN: Code duplicated, block: B:67:0x022d  */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x01ef, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x022d, please report this as an issue */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i8 = message.what;
        B b8 = null;
        switch (i8) {
            case 1:
                this.f38362a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f38375n.removeMessages(12);
                for (C3101b c3101b : this.f38371j.keySet()) {
                    Handler handler = this.f38375n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c3101b), this.f38362a);
                }
                return true;
            case 2:
                b0 b0Var = (b0) message.obj;
                for (C3101b c3101b2 : b0Var.a()) {
                    B b9 = (B) this.f38371j.get(c3101b2);
                    if (b9 == null) {
                        b0Var.b(c3101b2, new b(13), null);
                        return true;
                    }
                    if (b9.Q()) {
                        b0Var.b(c3101b2, b.f37082e, b9.w().h());
                    } else {
                        b bVarU = b9.u();
                        if (bVarU != null) {
                            b0Var.b(c3101b2, bVarU, null);
                        } else {
                            b9.K(b0Var);
                            b9.F();
                        }
                    }
                }
                return true;
            case 3:
                for (B b10 : this.f38371j.values()) {
                    b10.E();
                    b10.F();
                }
                return true;
            case 4:
            case 8:
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                O o8 = (O) message.obj;
                B bG = (B) this.f38371j.get(o8.f38318c.d());
                if (bG == null) {
                    bG = g(o8.f38318c);
                }
                if (!bG.b() || this.f38370i.get() == o8.f38317b) {
                    bG.G(o8.f38316a);
                } else {
                    o8.f38316a.a(f38358p);
                    bG.M();
                }
                return true;
            case 5:
                int i9 = message.arg1;
                b bVar = (b) message.obj;
                for (B b11 : this.f38371j.values()) {
                    if (b11.s() == i9) {
                        b8 = b11;
                        if (b8 != null) {
                            Log.wtf("GoogleApiManager", "Could not find API instance " + i9 + " while trying to fail enqueued calls.", new Exception());
                        } else if (bVar.a() == 13) {
                            b8.h(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f38367f.e(bVar.a()) + ": " + bVar.b()));
                        } else {
                            b8.h(f(b8.f38280c, bVar));
                        }
                        return true;
                    }
                }
                if (b8 != null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i9 + " while trying to fail enqueued calls.", new Exception());
                } else if (bVar.a() == 13) {
                    b8.h(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f38367f.e(bVar.a()) + ": " + bVar.b()));
                } else {
                    b8.h(f(b8.f38280c, bVar));
                }
                return true;
            case 6:
                if (this.f38366e.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C3102c.c((Application) this.f38366e.getApplicationContext());
                    ComponentCallbacks2C3102c.b().a(new C3121w(this));
                    if (!ComponentCallbacks2C3102c.b().e(true)) {
                        this.f38362a = 300000L;
                    }
                }
                return true;
            case 7:
                g((p203x4.e) message.obj);
                return true;
            case 9:
                if (this.f38371j.containsKey(message.obj)) {
                    ((B) this.f38371j.get(message.obj)).L();
                }
                return true;
            case 10:
                Iterator it = this.f38374m.iterator();
                while (it.hasNext()) {
                    B b12 = (B) this.f38371j.remove((C3101b) it.next());
                    if (b12 != null) {
                        b12.M();
                    }
                }
                this.f38374m.clear();
                return true;
            case 11:
                if (this.f38371j.containsKey(message.obj)) {
                    ((B) this.f38371j.get(message.obj)).N();
                }
                return true;
            case 12:
                if (this.f38371j.containsKey(message.obj)) {
                    ((B) this.f38371j.get(message.obj)).e();
                }
                return true;
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                C3118t c3118t = (C3118t) message.obj;
                C3101b c3101bA = c3118t.a();
                if (this.f38371j.containsKey(c3101bA)) {
                    c3118t.b().c(Boolean.valueOf(((B) this.f38371j.get(c3101bA)).r(false)));
                } else {
                    c3118t.b().c(Boolean.FALSE);
                }
                return true;
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                D d8 = (D) message.obj;
                if (this.f38371j.containsKey(d8.f38291a)) {
                    B.C((B) this.f38371j.get(d8.f38291a), d8);
                }
                return true;
            case 16:
                D d9 = (D) message.obj;
                if (this.f38371j.containsKey(d9.f38291a)) {
                    B.D((B) this.f38371j.get(d9.f38291a), d9);
                }
                return true;
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                i();
                return true;
            case 18:
                L l8 = (L) message.obj;
                if (l8.f38311c == 0) {
                    h().c(new C3209s(l8.f38310b, Arrays.asList(l8.f38309a)));
                } else {
                    C3209s c3209s = this.f38364c;
                    if (c3209s != null) {
                        List listB = c3209s.b();
                        if (c3209s.a() != l8.f38310b || (listB != null && listB.size() >= l8.f38312d)) {
                            this.f38375n.removeMessages(17);
                            i();
                        } else {
                            this.f38364c.c(l8.f38309a);
                        }
                    }
                    if (this.f38364c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(l8.f38309a);
                        this.f38364c = new C3209s(l8.f38310b, arrayList);
                        Handler handler2 = this.f38375n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), l8.f38311c);
                    }
                }
                return true;
            case 19:
                this.f38363b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i8);
                return false;
        }
    }

    public final void i() {
        C3209s c3209s = this.f38364c;
        if (c3209s != null) {
            if (c3209s.a() > 0 || d()) {
                h().c(c3209s);
            }
            this.f38364c = null;
        }
    }

    public final void j(l lVar, int i8, p203x4.e eVar) {
        K kB;
        if (i8 == 0 || (kB = K.b(this, i8, eVar.d())) == null) {
            return;
        }
        k kVarA = lVar.a();
        final Handler handler = this.f38375n;
        handler.getClass();
        kVarA.c(new Executor() { // from class: y4.v
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, kB);
    }

    public final int k() {
        return this.f38369h.getAndIncrement();
    }

    public final B s(C3101b c3101b) {
        return (B) this.f38371j.get(c3101b);
    }

    public final void z(p203x4.e eVar, int i8, AbstractC3113n abstractC3113n, l lVar, InterfaceC3112m interfaceC3112m) {
        j(lVar, abstractC3113n.d(), eVar);
        this.f38375n.sendMessage(this.f38375n.obtainMessage(4, new O(new Y(i8, abstractC3113n, lVar, interfaceC3112m), this.f38370i.get(), eVar)));
    }
}
