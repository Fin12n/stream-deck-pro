package io.sentry;

import io.sentry.protocol.C2541c;
import io.sentry.util.C2569a;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p027d.LrLN.vHKCAgr;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class V2 implements InterfaceC2496f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.u f26018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f26019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f26020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X f26021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f26023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile TimerTask f26024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile TimerTask f26025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile Timer f26026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C2569a f26027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C2569a f26028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f26029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f26030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public io.sentry.protocol.E f26031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final EnumC2512j0 f26032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C2541c f26033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v3 f26034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u3 f26035r;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            V2.this.T();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            V2.this.S();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f26038c = d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f26039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k3 f26040b;

        public c(boolean z8, k3 k3Var) {
            this.f26039a = z8;
            this.f26040b = k3Var;
        }

        public static c c(k3 k3Var) {
            return new c(true, k3Var);
        }

        public static c d() {
            return new c(false, null);
        }
    }

    public V2(s3 s3Var, X x8) {
        this(s3Var, x8, new u3(), null);
    }

    public static /* synthetic */ void A(V2 v8, f3 f3Var, AtomicReference atomicReference, c3 c3Var) {
        if (f3Var != null) {
            v8.getClass();
            f3Var.a(c3Var);
        }
        t3 t3VarN = v8.f26035r.n();
        if (t3VarN != null) {
            t3VarN.a(v8);
        }
        v3 v3Var = v8.f26034q;
        if (v3Var != null) {
            atomicReference.set(v3Var.c(v8));
        }
    }

    public static /* synthetic */ void w(V2 v8, V v9, InterfaceC2496f0 interfaceC2496f0) {
        v8.getClass();
        if (interfaceC2496f0 == v8) {
            v9.n();
        }
    }

    public static /* synthetic */ void x(final V2 v8, final V v9) {
        v8.getClass();
        v9.E(new C2533o1.c() { // from class: io.sentry.S2
            @Override // io.sentry.C2533o1.c
            public final void a(InterfaceC2496f0 interfaceC2496f0) {
                V2.w(this.f25996a, v9, interfaceC2496f0);
            }
        });
    }

    public static /* synthetic */ void y(V2 v8, V v9) {
        v8.getClass();
        v9.G(v8);
    }

    public static /* synthetic */ void z(V2 v8, c3 c3Var) {
        v3 v3Var = v8.f26034q;
        if (v3Var != null) {
            v3Var.a(c3Var);
        }
        c cVar = v8.f26023f;
        if (v8.f26035r.l() == null) {
            if (cVar.f26039a) {
                v8.g(cVar.f26040b);
            }
        } else if (!v8.f26035r.q() || v8.P()) {
            v8.o();
        }
    }

    public final void D() {
        InterfaceC2480b0 interfaceC2480b0A = this.f26027j.a();
        try {
            if (this.f26025h != null) {
                this.f26025h.cancel();
                this.f26030m.set(false);
                this.f26025h = null;
            }
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final void E() {
        InterfaceC2480b0 interfaceC2480b0A = this.f26027j.a();
        try {
            if (this.f26024g != null) {
                this.f26024g.cancel();
                this.f26029l.set(false);
                this.f26024g = null;
            }
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final InterfaceC2488d0 F(d3 d3Var, j3 j3Var) {
        if (this.f26019b.d()) {
            return Q0.v();
        }
        if (!this.f26032o.equals(d3Var.d())) {
            return Q0.v();
        }
        if (io.sentry.util.A.b(this.f26021d.b().getIgnoredSpanOrigins(), j3Var.a())) {
            return Q0.v();
        }
        i3 i3VarG = d3Var.g();
        String strE = d3Var.e();
        String strC = d3Var.c();
        if (this.f26020c.size() >= this.f26021d.b().getMaxSpans()) {
            this.f26021d.b().getLogger().c(EnumC2596z2.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", strE, strC);
            return Q0.v();
        }
        io.sentry.util.u.c(i3VarG, "parentSpanId is required");
        io.sentry.util.u.c(strE, "operation is required");
        E();
        c3 c3Var = new c3(this, this.f26021d, d3Var, j3Var, new f3() { // from class: io.sentry.T2
            @Override // io.sentry.f3
            public final void a(c3 c3Var2) {
                V2.z(this.f26008a, c3Var2);
            }
        });
        c3Var.c("thread.id", String.valueOf(this.f26021d.b().getThreadChecker().a()));
        c3Var.c("thread.name", this.f26021d.b().getThreadChecker().b() ? "main" : Thread.currentThread().getName());
        this.f26020c.add(c3Var);
        v3 v3Var = this.f26034q;
        if (v3Var != null) {
            v3Var.b(c3Var);
        }
        return c3Var;
    }

    public final InterfaceC2488d0 G(String str, String str2, U1 u8, EnumC2512j0 enumC2512j0, j3 j3Var) {
        if (this.f26019b.d()) {
            return Q0.v();
        }
        if (!this.f26032o.equals(enumC2512j0)) {
            return Q0.v();
        }
        if (this.f26020c.size() < this.f26021d.b().getMaxSpans()) {
            return this.f26019b.l(str, str2, u8, enumC2512j0, j3Var);
        }
        this.f26021d.b().getLogger().c(EnumC2596z2.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return Q0.v();
    }

    public void H(k3 k3Var, U1 u8, boolean z8, H h8) {
        U1 u1R = this.f26019b.r();
        if (u8 == null) {
            u8 = u1R;
        }
        if (u8 == null) {
            u8 = this.f26021d.b().getDateProvider().a();
        }
        for (c3 c3Var : this.f26020c) {
            if (c3Var.z().d()) {
                c3Var.t(k3Var != null ? k3Var : p().f27084g, u8);
            }
        }
        this.f26023f = c.c(k3Var);
        if (this.f26019b.d()) {
            return;
        }
        if (!this.f26035r.q() || P()) {
            final AtomicReference atomicReference = new AtomicReference();
            final f3 f3VarC = this.f26019b.C();
            this.f26019b.I(new f3() { // from class: io.sentry.P2
                @Override // io.sentry.f3
                public final void a(c3 c3Var2) {
                    V2.A(this.f25981a, f3VarC, atomicReference, c3Var2);
                }
            });
            this.f26019b.t(this.f26023f.f26040b, u8);
            Boolean bool = Boolean.TRUE;
            C2497f1 c2497f1A = (bool.equals(R()) && bool.equals(Q())) ? this.f26021d.b().getTransactionProfiler().a(this, (List) atomicReference.get(), this.f26021d.b()) : null;
            if (atomicReference.get() != null) {
                ((List) atomicReference.get()).clear();
            }
            this.f26021d.u(new InterfaceC2549q1() { // from class: io.sentry.Q2
                @Override // io.sentry.InterfaceC2549q1
                public final void a(V v8) {
                    V2.x(this.f25985a, v8);
                }
            });
            io.sentry.protocol.B b8 = new io.sentry.protocol.B(this);
            if (this.f26026i != null) {
                InterfaceC2480b0 interfaceC2480b0A = this.f26027j.a();
                try {
                    if (this.f26026i != null) {
                        E();
                        D();
                        this.f26026i.cancel();
                        this.f26026i = null;
                    }
                    if (interfaceC2480b0A != null) {
                        interfaceC2480b0A.close();
                    }
                } catch (Throwable th) {
                    if (interfaceC2480b0A != null) {
                        try {
                            interfaceC2480b0A.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (z8 && this.f26020c.isEmpty() && this.f26035r.l() != null) {
                this.f26021d.b().getLogger().c(EnumC2596z2.DEBUG, "Dropping idle transaction %s because it has no child spans", this.f26022e);
            } else {
                b8.m0().putAll(this.f26019b.x());
                this.f26021d.C(b8, b(), h8, c2497f1A);
            }
        }
    }

    public List I() {
        return this.f26020c;
    }

    public C2541c J() {
        return this.f26033p;
    }

    public Map K() {
        return this.f26019b.v();
    }

    public c3 L() {
        return this.f26019b;
    }

    public r3 M() {
        return this.f26019b.B();
    }

    public List N() {
        return this.f26020c;
    }

    public io.sentry.protocol.E O() {
        return this.f26031n;
    }

    public final boolean P() {
        ArrayList<c3> arrayList = new ArrayList(this.f26020c);
        if (arrayList.isEmpty()) {
            return true;
        }
        for (c3 c3Var : arrayList) {
            if (!c3Var.d() && c3Var.r() == null) {
                return false;
            }
        }
        return true;
    }

    public Boolean Q() {
        return this.f26019b.G();
    }

    public Boolean R() {
        return this.f26019b.H();
    }

    public final void S() {
        k3 k3VarA = a();
        if (k3VarA == null) {
            k3VarA = k3.DEADLINE_EXCEEDED;
        }
        e(k3VarA, this.f26035r.l() != null, null);
        this.f26030m.set(false);
    }

    public final void T() {
        k3 k3VarA = a();
        if (k3VarA == null) {
            k3VarA = k3.OK;
        }
        g(k3VarA);
        this.f26029l.set(false);
    }

    public final void U() {
        Long lK = this.f26035r.k();
        if (lK != null) {
            InterfaceC2480b0 interfaceC2480b0A = this.f26027j.a();
            try {
                if (this.f26026i != null) {
                    D();
                    this.f26030m.set(true);
                    this.f26025h = new b();
                    try {
                        this.f26026i.schedule(this.f26025h, lK.longValue());
                    } catch (Throwable th) {
                        this.f26021d.b().getLogger().b(EnumC2596z2.WARNING, "Failed to schedule finish timer", th);
                        S();
                    }
                }
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
            } catch (Throwable th2) {
                if (interfaceC2480b0A != null) {
                    try {
                        interfaceC2480b0A.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public void V(String str, Number number) {
        if (this.f26019b.x().containsKey(str)) {
            return;
        }
        s(str, number);
    }

    public void W(String str, Number number, InterfaceC2594z0 interfaceC2594z0) {
        if (this.f26019b.x().containsKey(str)) {
            return;
        }
        j(str, number, interfaceC2594z0);
    }

    public InterfaceC2488d0 X(i3 i3Var, String str, String str2, U1 u8, EnumC2512j0 enumC2512j0, j3 j3Var) {
        d3 d3VarA = p().a(str, i3Var, null);
        d3VarA.p(str2);
        d3VarA.q(enumC2512j0);
        j3Var.h(u8);
        return F(d3VarA, j3Var);
    }

    public final void Y(C2487d c2487d) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26028k.a();
        try {
            if (c2487d.s()) {
                final AtomicReference atomicReference = new AtomicReference();
                this.f26021d.u(new InterfaceC2549q1() { // from class: io.sentry.R2
                    @Override // io.sentry.InterfaceC2549q1
                    public final void a(V v8) {
                        atomicReference.set(v8.t());
                    }
                });
                c2487d.M(p().n(), (io.sentry.protocol.u) atomicReference.get(), this.f26021d.b(), M(), getName(), O());
                c2487d.b();
            }
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC2480b0A == null) {
                throw th;
            }
            try {
                interfaceC2480b0A.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // io.sentry.InterfaceC2488d0
    public k3 a() {
        return this.f26019b.a();
    }

    @Override // io.sentry.InterfaceC2488d0
    public p3 b() {
        C2487d c2487dB;
        if (!this.f26021d.b().isTraceSampling() || (c2487dB = p().b()) == null) {
            return null;
        }
        Y(c2487dB);
        return c2487dB.O();
    }

    @Override // io.sentry.InterfaceC2488d0
    public void c(String str, Object obj) {
        if (this.f26019b.d()) {
            this.f26021d.b().getLogger().c(EnumC2596z2.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            this.f26019b.c(str, obj);
        }
    }

    @Override // io.sentry.InterfaceC2488d0
    public boolean d() {
        return this.f26019b.d();
    }

    @Override // io.sentry.InterfaceC2496f0
    public void e(k3 k3Var, boolean z8, H h8) {
        if (d()) {
            return;
        }
        U1 u1A = this.f26021d.b().getDateProvider().a();
        List list = this.f26020c;
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            c3 c3Var = (c3) listIterator.previous();
            c3Var.I(null);
            c3Var.t(k3Var, u1A);
        }
        H(k3Var, u1A, z8, h8);
    }

    @Override // io.sentry.InterfaceC2488d0
    public boolean f(U1 u8) {
        return this.f26019b.f(u8);
    }

    @Override // io.sentry.InterfaceC2488d0
    public void g(k3 k3Var) {
        t(k3Var, null);
    }

    @Override // io.sentry.InterfaceC2488d0
    public String getDescription() {
        return this.f26019b.getDescription();
    }

    @Override // io.sentry.InterfaceC2496f0
    public String getName() {
        return this.f26022e;
    }

    @Override // io.sentry.InterfaceC2488d0
    public InterfaceC2488d0 h(String str, String str2, U1 u8, EnumC2512j0 enumC2512j0) {
        return l(str, str2, u8, enumC2512j0, new j3());
    }

    @Override // io.sentry.InterfaceC2488d0
    public void i() {
        g(a());
    }

    @Override // io.sentry.InterfaceC2488d0
    public void j(String str, Number number, InterfaceC2594z0 interfaceC2594z0) {
        this.f26019b.j(str, number, interfaceC2594z0);
    }

    @Override // io.sentry.InterfaceC2496f0
    public InterfaceC2488d0 k() {
        ArrayList arrayList = new ArrayList(this.f26020c);
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((c3) arrayList.get(size)).d()) {
                return (InterfaceC2488d0) arrayList.get(size);
            }
        }
        return null;
    }

    @Override // io.sentry.InterfaceC2488d0
    public InterfaceC2488d0 l(String str, String str2, U1 u8, EnumC2512j0 enumC2512j0, j3 j3Var) {
        return G(str, str2, u8, enumC2512j0, j3Var);
    }

    @Override // io.sentry.InterfaceC2488d0
    public void m(String str) {
        if (this.f26019b.d()) {
            this.f26021d.b().getLogger().c(EnumC2596z2.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            this.f26019b.m(str);
        }
    }

    @Override // io.sentry.InterfaceC2496f0
    public io.sentry.protocol.u n() {
        return this.f26018a;
    }

    @Override // io.sentry.InterfaceC2488d0
    public d3 p() {
        return this.f26019b.p();
    }

    @Override // io.sentry.InterfaceC2488d0
    public InterfaceC2480b0 q() {
        this.f26021d.u(new InterfaceC2549q1() { // from class: io.sentry.U2
            @Override // io.sentry.InterfaceC2549q1
            public final void a(V v8) {
                V2.y(this.f26010a, v8);
            }
        });
        return J0.b();
    }

    @Override // io.sentry.InterfaceC2488d0
    public U1 r() {
        return this.f26019b.r();
    }

    @Override // io.sentry.InterfaceC2488d0
    public void s(String str, Number number) {
        this.f26019b.s(str, number);
    }

    @Override // io.sentry.InterfaceC2488d0
    public void t(k3 k3Var, U1 u8) {
        H(k3Var, u8, true, null);
    }

    @Override // io.sentry.InterfaceC2488d0
    public U1 u() {
        return this.f26019b.u();
    }

    public V2(s3 s3Var, X x8, u3 u3Var) {
        this(s3Var, x8, u3Var, null);
    }

    @Override // io.sentry.InterfaceC2496f0
    public void o() {
        Long l8;
        InterfaceC2480b0 interfaceC2480b0A = this.f26027j.a();
        try {
            if (this.f26026i != null && (l8 = this.f26035r.l()) != null) {
                E();
                this.f26029l.set(true);
                this.f26024g = new a();
                try {
                    this.f26026i.schedule(this.f26024g, l8.longValue());
                } catch (Throwable th) {
                    this.f26021d.b().getLogger().b(EnumC2596z2.WARNING, vHKCAgr.CkXdbMzYm, th);
                    T();
                }
            }
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public V2(s3 s3Var, X x8, u3 u3Var, v3 v3Var) {
        this.f26018a = new io.sentry.protocol.u();
        this.f26020c = new CopyOnWriteArrayList();
        this.f26023f = c.f26038c;
        this.f26026i = null;
        this.f26027j = new C2569a();
        this.f26028k = new C2569a();
        this.f26029l = new AtomicBoolean(false);
        this.f26030m = new AtomicBoolean(false);
        this.f26033p = new C2541c();
        io.sentry.util.u.c(s3Var, "context is required");
        io.sentry.util.u.c(x8, "scopes are required");
        this.f26019b = new c3(s3Var, this, x8, u3Var);
        this.f26022e = s3Var.w();
        this.f26032o = s3Var.d();
        this.f26021d = x8;
        this.f26034q = v3Var;
        this.f26031n = s3Var.y();
        this.f26035r = u3Var;
        if (v3Var != null) {
            v3Var.d(this);
        }
        if (u3Var.l() == null && u3Var.k() == null) {
            return;
        }
        this.f26026i = new Timer(true);
        U();
        o();
    }
}
