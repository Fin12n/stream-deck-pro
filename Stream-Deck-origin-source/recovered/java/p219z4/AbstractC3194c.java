package p219z4;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p195w4.f;

/* JADX INFO: renamed from: z4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3194c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f39132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f39133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f39135e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k0 f39137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f39138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Looper f39139i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC3199h f39140j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f39141k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f39142l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC3203l f39145o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InterfaceC0857c f39146p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public IInterface f39147q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public X f39149s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a f39151u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f39152v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f39153w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f39154x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile String f39155y;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final p195w4.d[] f39127E = new p195w4.d[0];

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String[] f39126D = {"service_esmobile", "service_googleme"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile String f39136f = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f39143m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f39144n = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f39148r = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f39150t = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p195w4.b f39156z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f39128A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public volatile a0 f39129B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public AtomicInteger f39130C = new AtomicInteger(0);

    /* JADX INFO: renamed from: z4.c$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void a(int i8);

        void d(Bundle bundle);
    }

    /* JADX INFO: renamed from: z4.c$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        void c(p195w4.b bVar);
    }

    /* JADX INFO: renamed from: z4.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface InterfaceC0857c {
        void b(p195w4.b bVar);
    }

    /* JADX INFO: renamed from: z4.c$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d implements InterfaceC0857c {
        public d() {
        }

        @Override // p219z4.AbstractC3194c.InterfaceC0857c
        public final void b(p195w4.b bVar) {
            if (bVar.e()) {
                AbstractC3194c abstractC3194c = AbstractC3194c.this;
                abstractC3194c.e(null, abstractC3194c.B());
            } else if (AbstractC3194c.this.f39152v != null) {
                AbstractC3194c.this.f39152v.c(bVar);
            }
        }
    }

    /* JADX INFO: renamed from: z4.c$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface e {
        void a();
    }

    public AbstractC3194c(Context context, Looper looper, AbstractC3199h abstractC3199h, f fVar, int i8, a aVar, b bVar, String str) {
        AbstractC3207p.l(context, "Context must not be null");
        this.f39138h = context;
        AbstractC3207p.l(looper, "Looper must not be null");
        this.f39139i = looper;
        AbstractC3207p.l(abstractC3199h, "Supervisor must not be null");
        this.f39140j = abstractC3199h;
        AbstractC3207p.l(fVar, "API availability must not be null");
        this.f39141k = fVar;
        this.f39142l = new U(this, looper);
        this.f39153w = i8;
        this.f39151u = aVar;
        this.f39152v = bVar;
        this.f39154x = str;
    }

    public static /* bridge */ /* synthetic */ void a0(AbstractC3194c abstractC3194c, a0 a0Var) {
        abstractC3194c.f39129B = a0Var;
        if (abstractC3194c.Q()) {
            C3196e c3196e = a0Var.f39125d;
            C3208q.b().c(c3196e == null ? null : c3196e.f());
        }
    }

    public static /* bridge */ /* synthetic */ void b0(AbstractC3194c abstractC3194c, int i8) {
        int i9;
        int i10;
        synchronized (abstractC3194c.f39143m) {
            i9 = abstractC3194c.f39150t;
        }
        if (i9 == 3) {
            abstractC3194c.f39128A = true;
            i10 = 5;
        } else {
            i10 = 4;
        }
        Handler handler = abstractC3194c.f39142l;
        handler.sendMessage(handler.obtainMessage(i10, abstractC3194c.f39130C.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean e0(AbstractC3194c abstractC3194c, int i8, int i9, IInterface iInterface) {
        synchronized (abstractC3194c.f39143m) {
            try {
                if (abstractC3194c.f39150t != i8) {
                    return false;
                }
                abstractC3194c.g0(i9, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean f0(AbstractC3194c abstractC3194c) {
        if (abstractC3194c.f39128A || TextUtils.isEmpty(abstractC3194c.D()) || TextUtils.isEmpty(abstractC3194c.A())) {
            return false;
        }
        try {
            Class.forName(abstractC3194c.D());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public String A() {
        return null;
    }

    public abstract Set B();

    public final IInterface C() {
        IInterface iInterface;
        synchronized (this.f39143m) {
            try {
                if (this.f39150t == 5) {
                    throw new DeadObjectException();
                }
                q();
                iInterface = this.f39147q;
                AbstractC3207p.l(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String D();

    public abstract String E();

    public String F() {
        return "com.google.android.gms";
    }

    public C3196e G() {
        a0 a0Var = this.f39129B;
        if (a0Var == null) {
            return null;
        }
        return a0Var.f39125d;
    }

    public boolean H() {
        return k() >= 211700000;
    }

    public boolean I() {
        return this.f39129B != null;
    }

    public void J(IInterface iInterface) {
        this.f39133c = System.currentTimeMillis();
    }

    public void K(p195w4.b bVar) {
        this.f39134d = bVar.a();
        this.f39135e = System.currentTimeMillis();
    }

    public void L(int i8) {
        this.f39131a = i8;
        this.f39132b = System.currentTimeMillis();
    }

    public void M(int i8, IBinder iBinder, Bundle bundle, int i9) {
        this.f39142l.sendMessage(this.f39142l.obtainMessage(1, i9, -1, new Y(this, i8, iBinder, bundle)));
    }

    public boolean N() {
        return false;
    }

    public void O(String str) {
        this.f39155y = str;
    }

    public void P(int i8) {
        this.f39142l.sendMessage(this.f39142l.obtainMessage(6, this.f39130C.get(), i8));
    }

    public boolean Q() {
        return false;
    }

    public final String V() {
        String str = this.f39154x;
        return str == null ? this.f39138h.getClass().getName() : str;
    }

    public boolean a() {
        boolean z8;
        synchronized (this.f39143m) {
            z8 = this.f39150t == 4;
        }
        return z8;
    }

    public void b(InterfaceC0857c interfaceC0857c) {
        AbstractC3207p.l(interfaceC0857c, "Connection progress callbacks cannot be null.");
        this.f39146p = interfaceC0857c;
        g0(2, null);
    }

    public final void c0(int i8, Bundle bundle, int i9) {
        this.f39142l.sendMessage(this.f39142l.obtainMessage(7, i9, -1, new Z(this, i8, null)));
    }

    public void e(InterfaceC3201j interfaceC3201j, Set set) {
        Bundle bundleZ = z();
        String str = this.f39155y;
        int i8 = f.f37097a;
        Scope[] scopeArr = C3197f.f39185o;
        Bundle bundle = new Bundle();
        int i9 = this.f39153w;
        p195w4.d[] dVarArr = C3197f.f39186p;
        C3197f c3197f = new C3197f(6, i9, i8, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c3197f.f39190d = this.f39138h.getPackageName();
        c3197f.f39193g = bundleZ;
        if (set != null) {
            c3197f.f39192f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            Account accountT = t();
            if (accountT == null) {
                accountT = new Account("<<default account>>", "com.google");
            }
            c3197f.f39194h = accountT;
            if (interfaceC3201j != null) {
                c3197f.f39191e = interfaceC3201j.asBinder();
            }
        } else if (N()) {
            c3197f.f39194h = t();
        }
        c3197f.f39195i = f39127E;
        c3197f.f39196j = u();
        if (Q()) {
            c3197f.f39199m = true;
        }
        try {
            synchronized (this.f39144n) {
                try {
                    InterfaceC3203l interfaceC3203l = this.f39145o;
                    if (interfaceC3203l != null) {
                        interfaceC3203l.e(new W(this, this.f39130C.get()), c3197f);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e8) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e8);
            P(3);
        } catch (RemoteException e9) {
            e = e9;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            M(8, null, null, this.f39130C.get());
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            M(8, null, null, this.f39130C.get());
        }
    }

    public void f(String str) {
        this.f39136f = str;
        i();
    }

    public boolean g() {
        boolean z8;
        synchronized (this.f39143m) {
            int i8 = this.f39150t;
            z8 = true;
            if (i8 != 2 && i8 != 3) {
                z8 = false;
            }
        }
        return z8;
    }

    public final void g0(int i8, IInterface iInterface) {
        k0 k0Var;
        AbstractC3207p.a((i8 == 4) == (iInterface != null));
        synchronized (this.f39143m) {
            try {
                this.f39150t = i8;
                this.f39147q = iInterface;
                if (i8 == 1) {
                    X x8 = this.f39149s;
                    if (x8 != null) {
                        AbstractC3199h abstractC3199h = this.f39140j;
                        String strB = this.f39137g.b();
                        AbstractC3207p.k(strB);
                        abstractC3199h.e(strB, this.f39137g.a(), 4225, x8, V(), this.f39137g.c());
                        this.f39149s = null;
                    }
                } else if (i8 == 2 || i8 == 3) {
                    X x9 = this.f39149s;
                    if (x9 != null && (k0Var = this.f39137g) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + k0Var.b() + " on " + k0Var.a());
                        AbstractC3199h abstractC3199h2 = this.f39140j;
                        String strB2 = this.f39137g.b();
                        AbstractC3207p.k(strB2);
                        abstractC3199h2.e(strB2, this.f39137g.a(), 4225, x9, V(), this.f39137g.c());
                        this.f39130C.incrementAndGet();
                    }
                    X x10 = new X(this, this.f39130C.get());
                    this.f39149s = x10;
                    k0 k0Var2 = (this.f39150t != 3 || A() == null) ? new k0(F(), E(), false, 4225, H()) : new k0(x().getPackageName(), A(), true, 4225, false);
                    this.f39137g = k0Var2;
                    if (k0Var2.c() && k() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f39137g.b())));
                    }
                    AbstractC3199h abstractC3199h3 = this.f39140j;
                    String strB3 = this.f39137g.b();
                    AbstractC3207p.k(strB3);
                    if (!abstractC3199h3.f(new e0(strB3, this.f39137g.a(), 4225, this.f39137g.c()), x10, V(), v())) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f39137g.b() + " on " + this.f39137g.a());
                        c0(16, null, this.f39130C.get());
                    }
                } else if (i8 == 4) {
                    AbstractC3207p.k(iInterface);
                    J(iInterface);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String h() {
        k0 k0Var;
        if (!a() || (k0Var = this.f39137g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return k0Var.a();
    }

    public void i() {
        this.f39130C.incrementAndGet();
        synchronized (this.f39148r) {
            try {
                int size = this.f39148r.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((V) this.f39148r.get(i8)).d();
                }
                this.f39148r.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f39144n) {
            this.f39145o = null;
        }
        g0(1, null);
    }

    public boolean j() {
        return true;
    }

    public abstract int k();

    public final p195w4.d[] l() {
        a0 a0Var = this.f39129B;
        if (a0Var == null) {
            return null;
        }
        return a0Var.f39123b;
    }

    public void m(e eVar) {
        eVar.a();
    }

    public String n() {
        return this.f39136f;
    }

    public boolean o() {
        return false;
    }

    public final void q() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public abstract IInterface r(IBinder iBinder);

    public boolean s() {
        return false;
    }

    public abstract Account t();

    public p195w4.d[] u() {
        return f39127E;
    }

    public abstract Executor v();

    public Bundle w() {
        return null;
    }

    public final Context x() {
        return this.f39138h;
    }

    public int y() {
        return this.f39153w;
    }

    public Bundle z() {
        return new Bundle();
    }
}
