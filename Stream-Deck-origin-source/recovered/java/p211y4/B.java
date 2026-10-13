package p211y4;

import S4.l;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import p010b0.C1748a;
import p195w4.b;
import p195w4.d;
import p203x4.a;
import p203x4.e;
import p203x4.f;
import p203x4.j;
import p219z4.AbstractC3206o;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class B implements f.a, f.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.f f38279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3101b f38280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f38281d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f38284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final U f38285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f38286i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C3104e f38290o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue f38278a = new LinkedList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f38282e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f38283f = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f38287j = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f38288m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f38289n = 0;

    public B(C3104e c3104e, e eVar) {
        this.f38290o = c3104e;
        a.f fVarK = eVar.k(c3104e.f38375n.getLooper(), this);
        this.f38279b = fVarK;
        this.f38280c = eVar.d();
        this.f38281d = new r();
        this.f38284g = eVar.j();
        if (fVarK.o()) {
            this.f38285h = eVar.l(c3104e.f38366e, c3104e.f38375n);
        } else {
            this.f38285h = null;
        }
    }

    public static /* bridge */ /* synthetic */ void C(B b8, D d8) {
        if (b8.f38287j.contains(d8) && !b8.f38286i) {
            if (b8.f38279b.a()) {
                b8.j();
            } else {
                b8.F();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void D(B b8, D d8) {
        d[] dVarArrG;
        if (b8.f38287j.remove(d8)) {
            b8.f38290o.f38375n.removeMessages(15, d8);
            b8.f38290o.f38375n.removeMessages(16, d8);
            d dVar = d8.f38292b;
            ArrayList arrayList = new ArrayList(b8.f38278a.size());
            for (a0 a0Var : b8.f38278a) {
                if ((a0Var instanceof J) && (dVarArrG = ((J) a0Var).g(b8)) != null && F4.a.b(dVarArrG, dVar)) {
                    arrayList.add(a0Var);
                }
            }
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                a0 a0Var2 = (a0) arrayList.get(i8);
                b8.f38278a.remove(a0Var2);
                a0Var2.b(new j(dVar));
            }
        }
    }

    public final void E() {
        AbstractC3207p.d(this.f38290o.f38375n);
        this.f38288m = null;
    }

    public final void F() {
        AbstractC3207p.d(this.f38290o.f38375n);
        if (this.f38279b.a() || this.f38279b.g()) {
            return;
        }
        try {
            C3104e c3104e = this.f38290o;
            int iB = c3104e.f38368g.b(c3104e.f38366e, this.f38279b);
            if (iB == 0) {
                C3104e c3104e2 = this.f38290o;
                a.f fVar = this.f38279b;
                F f8 = new F(c3104e2, fVar, this.f38280c);
                if (fVar.o()) {
                    ((U) AbstractC3207p.k(this.f38285h)).S(f8);
                }
                try {
                    this.f38279b.b(f8);
                    return;
                } catch (SecurityException e8) {
                    I(new b(10), e8);
                    return;
                }
            }
            b bVar = new b(iB, null);
            Log.w("GoogleApiManager", "The service for " + this.f38279b.getClass().getName() + " is not available: " + bVar.toString());
            I(bVar, null);
        } catch (IllegalStateException e9) {
            I(new b(10), e9);
        }
    }

    public final void G(a0 a0Var) {
        AbstractC3207p.d(this.f38290o.f38375n);
        if (this.f38279b.a()) {
            if (p(a0Var)) {
                m();
                return;
            } else {
                this.f38278a.add(a0Var);
                return;
            }
        }
        this.f38278a.add(a0Var);
        b bVar = this.f38288m;
        if (bVar == null || !bVar.d()) {
            F();
        } else {
            I(this.f38288m, null);
        }
    }

    public final void H() {
        this.f38289n++;
    }

    public final void I(b bVar, Exception exc) {
        AbstractC3207p.d(this.f38290o.f38375n);
        U u8 = this.f38285h;
        if (u8 != null) {
            u8.T();
        }
        E();
        this.f38290o.f38368g.c();
        g(bVar);
        if ((this.f38279b instanceof B4.e) && bVar.a() != 24) {
            this.f38290o.f38363b = true;
            C3104e c3104e = this.f38290o;
            c3104e.f38375n.sendMessageDelayed(c3104e.f38375n.obtainMessage(19), 300000L);
        }
        if (bVar.a() == 4) {
            h(C3104e.f38359q);
            return;
        }
        if (this.f38278a.isEmpty()) {
            this.f38288m = bVar;
            return;
        }
        if (exc != null) {
            AbstractC3207p.d(this.f38290o.f38375n);
            i(null, exc, false);
            return;
        }
        if (!this.f38290o.f38376o) {
            h(C3104e.f(this.f38280c, bVar));
            return;
        }
        i(C3104e.f(this.f38280c, bVar), null, true);
        if (this.f38278a.isEmpty() || q(bVar) || this.f38290o.e(bVar, this.f38284g)) {
            return;
        }
        if (bVar.a() == 18) {
            this.f38286i = true;
        }
        if (!this.f38286i) {
            h(C3104e.f(this.f38280c, bVar));
            return;
        }
        C3104e c3104e2 = this.f38290o;
        c3104e2.f38375n.sendMessageDelayed(Message.obtain(c3104e2.f38375n, 9, this.f38280c), 5000L);
    }

    public final void J(b bVar) {
        AbstractC3207p.d(this.f38290o.f38375n);
        a.f fVar = this.f38279b;
        fVar.f("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(bVar));
        I(bVar, null);
    }

    public final void K(b0 b0Var) {
        AbstractC3207p.d(this.f38290o.f38375n);
        this.f38282e.add(b0Var);
    }

    public final void L() {
        AbstractC3207p.d(this.f38290o.f38375n);
        if (this.f38286i) {
            F();
        }
    }

    public final void M() {
        AbstractC3207p.d(this.f38290o.f38375n);
        h(C3104e.f38358p);
        this.f38281d.d();
        for (AbstractC3107h abstractC3107h : (AbstractC3107h[]) this.f38283f.keySet().toArray(new AbstractC3107h[0])) {
            G(new Z(abstractC3107h, new l()));
        }
        g(new b(4));
        if (this.f38279b.a()) {
            this.f38279b.m(new A(this));
        }
    }

    public final void N() {
        AbstractC3207p.d(this.f38290o.f38375n);
        if (this.f38286i) {
            o();
            C3104e c3104e = this.f38290o;
            h(c3104e.f38367f.g(c3104e.f38366e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f38279b.f("Timing out connection while resuming.");
        }
    }

    public final boolean Q() {
        return this.f38279b.a();
    }

    @Override // p211y4.InterfaceC3103d
    public final void a(int i8) {
        if (Looper.myLooper() == this.f38290o.f38375n.getLooper()) {
            l(i8);
        } else {
            this.f38290o.f38375n.post(new RunnableC3123y(this, i8));
        }
    }

    public final boolean b() {
        return this.f38279b.o();
    }

    @Override // p211y4.InterfaceC3109j
    public final void c(b bVar) {
        I(bVar, null);
    }

    @Override // p211y4.InterfaceC3103d
    public final void d(Bundle bundle) {
        if (Looper.myLooper() == this.f38290o.f38375n.getLooper()) {
            k();
        } else {
            this.f38290o.f38375n.post(new RunnableC3122x(this));
        }
    }

    public final boolean e() {
        return r(true);
    }

    public final d f(d[] dVarArr) {
        if (dVarArr != null && dVarArr.length != 0) {
            d[] dVarArrL = this.f38279b.l();
            if (dVarArrL == null) {
                dVarArrL = new d[0];
            }
            C1748a c1748a = new C1748a(dVarArrL.length);
            for (d dVar : dVarArrL) {
                c1748a.put(dVar.getName(), Long.valueOf(dVar.a()));
            }
            for (d dVar2 : dVarArr) {
                Long l8 = (Long) c1748a.get(dVar2.getName());
                if (l8 == null || l8.longValue() < dVar2.a()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    public final void g(b bVar) {
        Iterator it = this.f38282e.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).b(this.f38280c, bVar, AbstractC3206o.a(bVar, b.f37082e) ? this.f38279b.h() : null);
        }
        this.f38282e.clear();
    }

    public final void h(Status status) {
        AbstractC3207p.d(this.f38290o.f38375n);
        i(status, null, false);
    }

    public final void i(Status status, Exception exc, boolean z8) {
        AbstractC3207p.d(this.f38290o.f38375n);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f38278a.iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            if (!z8 || a0Var.f38339a == 2) {
                if (status != null) {
                    a0Var.a(status);
                } else {
                    a0Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void j() {
        ArrayList arrayList = new ArrayList(this.f38278a);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            a0 a0Var = (a0) arrayList.get(i8);
            if (!this.f38279b.a()) {
                return;
            }
            if (p(a0Var)) {
                this.f38278a.remove(a0Var);
            }
        }
    }

    public final void k() {
        E();
        g(b.f37082e);
        o();
        Iterator it = this.f38283f.values().iterator();
        while (it.hasNext()) {
            P p8 = (P) it.next();
            if (f(p8.f38319a.b()) != null) {
                it.remove();
            } else {
                try {
                    p8.f38319a.c(this.f38279b, new l());
                } catch (DeadObjectException unused) {
                    a(3);
                    this.f38279b.f("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        j();
        m();
    }

    public final void l(int i8) {
        E();
        this.f38286i = true;
        this.f38281d.c(i8, this.f38279b.n());
        C3101b c3101b = this.f38280c;
        C3104e c3104e = this.f38290o;
        c3104e.f38375n.sendMessageDelayed(Message.obtain(c3104e.f38375n, 9, c3101b), 5000L);
        C3101b c3101b2 = this.f38280c;
        C3104e c3104e2 = this.f38290o;
        c3104e2.f38375n.sendMessageDelayed(Message.obtain(c3104e2.f38375n, 11, c3101b2), 120000L);
        this.f38290o.f38368g.c();
        Iterator it = this.f38283f.values().iterator();
        while (it.hasNext()) {
            ((P) it.next()).f38321c.run();
        }
    }

    public final void m() {
        this.f38290o.f38375n.removeMessages(12, this.f38280c);
        C3101b c3101b = this.f38280c;
        C3104e c3104e = this.f38290o;
        c3104e.f38375n.sendMessageDelayed(c3104e.f38375n.obtainMessage(12, c3101b), this.f38290o.f38362a);
    }

    public final void n(a0 a0Var) {
        a0Var.d(this.f38281d, b());
        try {
            a0Var.c(this);
        } catch (DeadObjectException unused) {
            a(1);
            this.f38279b.f("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void o() {
        if (this.f38286i) {
            C3104e c3104e = this.f38290o;
            c3104e.f38375n.removeMessages(11, this.f38280c);
            C3104e c3104e2 = this.f38290o;
            c3104e2.f38375n.removeMessages(9, this.f38280c);
            this.f38286i = false;
        }
    }

    public final boolean p(a0 a0Var) {
        if (!(a0Var instanceof J)) {
            n(a0Var);
            return true;
        }
        J j8 = (J) a0Var;
        d dVarF = f(j8.g(this));
        if (dVarF == null) {
            n(a0Var);
            return true;
        }
        Log.w("GoogleApiManager", this.f38279b.getClass().getName() + " could not execute call because it requires feature (" + dVarF.getName() + ", " + dVarF.a() + ").");
        if (!this.f38290o.f38376o || !j8.f(this)) {
            j8.b(new j(dVarF));
            return true;
        }
        D d8 = new D(this.f38280c, dVarF, null);
        int iIndexOf = this.f38287j.indexOf(d8);
        if (iIndexOf >= 0) {
            D d9 = (D) this.f38287j.get(iIndexOf);
            this.f38290o.f38375n.removeMessages(15, d9);
            C3104e c3104e = this.f38290o;
            c3104e.f38375n.sendMessageDelayed(Message.obtain(c3104e.f38375n, 15, d9), 5000L);
            return false;
        }
        this.f38287j.add(d8);
        C3104e c3104e2 = this.f38290o;
        c3104e2.f38375n.sendMessageDelayed(Message.obtain(c3104e2.f38375n, 15, d8), 5000L);
        C3104e c3104e3 = this.f38290o;
        c3104e3.f38375n.sendMessageDelayed(Message.obtain(c3104e3.f38375n, 16, d8), 120000L);
        b bVar = new b(2, null);
        if (q(bVar)) {
            return false;
        }
        this.f38290o.e(bVar, this.f38284g);
        return false;
    }

    public final boolean q(b bVar) {
        synchronized (C3104e.f38360r) {
            try {
                C3104e c3104e = this.f38290o;
                if (c3104e.f38372k == null || !c3104e.f38373l.contains(this.f38280c)) {
                    return false;
                }
                this.f38290o.f38372k.s(bVar, this.f38284g);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean r(boolean z8) {
        AbstractC3207p.d(this.f38290o.f38375n);
        if (!this.f38279b.a() || !this.f38283f.isEmpty()) {
            return false;
        }
        if (!this.f38281d.e()) {
            this.f38279b.f("Timing out service connection.");
            return true;
        }
        if (!z8) {
            return false;
        }
        m();
        return false;
    }

    public final int s() {
        return this.f38284g;
    }

    public final int t() {
        return this.f38289n;
    }

    public final b u() {
        AbstractC3207p.d(this.f38290o.f38375n);
        return this.f38288m;
    }

    public final a.f w() {
        return this.f38279b;
    }

    public final Map y() {
        return this.f38283f;
    }
}
