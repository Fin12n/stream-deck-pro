package io.sentry;

import com.google.mlkit.common.internal.ckI.WqXA;
import java.io.Closeable;
import p180u5.FCkZ.BpgIURjN;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: renamed from: io.sentry.z1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2595z1 implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f27819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f27820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f27821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2595z1 f27822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v3 f27824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2503h f27825g;

    public C2595z1(V v8, V v9, V v10, String str) {
        this(v8, v9, v10, null, str);
    }

    @Override // io.sentry.X
    public io.sentry.protocol.u B(Throwable th, H h8) {
        return L(th, h8, null);
    }

    @Override // io.sentry.X
    public io.sentry.protocol.u C(io.sentry.protocol.B b8, p3 p3Var, H h8, C2497f1 c2497f1) {
        io.sentry.protocol.B b9;
        io.sentry.util.u.c(b8, "transaction is required");
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f27472b;
        if (!isEnabled()) {
            b().getLogger().c(EnumC2596z2.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        } else if (!b8.q0()) {
            b().getLogger().c(EnumC2596z2.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", b8.G());
        } else if (Boolean.TRUE.equals(Boolean.valueOf(b8.r0()))) {
            try {
                b9 = b8;
                try {
                    return O().d(b9, p3Var, P(), h8, c2497f1);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    b().getLogger().b(EnumC2596z2.ERROR, "Error while capturing transaction with id: " + b9.G(), th2);
                    return uVar;
                }
            } catch (Throwable th3) {
                th = th3;
                b9 = b8;
            }
        } else {
            b().getLogger().c(EnumC2596z2.DEBUG, "Transaction %s was dropped due to sampling decision.", b8.G());
            if (b().getBackpressureMonitor().a() > 0) {
                io.sentry.clientreport.h clientReportRecorder = b().getClientReportRecorder();
                io.sentry.clientreport.f fVar = io.sentry.clientreport.f.BACKPRESSURE;
                clientReportRecorder.a(fVar, EnumC2515k.Transaction);
                b().getClientReportRecorder().c(fVar, EnumC2515k.Span, b8.o0().size() + 1);
            } else {
                io.sentry.clientreport.h clientReportRecorder2 = b().getClientReportRecorder();
                io.sentry.clientreport.f fVar2 = io.sentry.clientreport.f.SAMPLE_RATE;
                clientReportRecorder2.a(fVar2, EnumC2515k.Transaction);
                b().getClientReportRecorder().c(fVar2, EnumC2515k.Span, b8.o0().size() + 1);
            }
        }
        return uVar;
    }

    @Override // io.sentry.X
    public X E(String str) {
        return new C2595z1(this.f27819a.m232clone(), this.f27820b.m232clone(), this.f27821c, this, str);
    }

    @Override // io.sentry.X
    public io.sentry.protocol.u F(C2557s2 c2557s2, H h8) {
        return K(c2557s2, h8, null);
    }

    public final void I(C2557s2 c2557s2) {
        P().A(c2557s2);
    }

    public final V J(V v8, InterfaceC2549q1 interfaceC2549q1) {
        if (interfaceC2549q1 != null) {
            try {
                V vM223clone = v8.m232clone();
                interfaceC2549q1.a(vM223clone);
                return vM223clone;
            } catch (Throwable th) {
                b().getLogger().b(EnumC2596z2.ERROR, "Error in the 'ScopeCallback' callback.", th);
            }
        }
        return v8;
    }

    public final io.sentry.protocol.u K(C2557s2 c2557s2, H h8, InterfaceC2549q1 interfaceC2549q1) {
        io.sentry.protocol.u uVarE = io.sentry.protocol.u.f27472b;
        if (!isEnabled()) {
            b().getLogger().c(EnumC2596z2.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return uVarE;
        }
        if (c2557s2 == null) {
            b().getLogger().c(EnumC2596z2.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return uVarE;
        }
        try {
            I(c2557s2);
            uVarE = O().e(c2557s2, J(P(), interfaceC2549q1), h8);
            R(uVarE);
            return uVarE;
        } catch (Throwable th) {
            b().getLogger().b(EnumC2596z2.ERROR, "Error while capturing event with id: " + c2557s2.G(), th);
            return uVarE;
        }
    }

    public X N(String str) {
        return new C2595z1(this.f27819a.m232clone(), this.f27820b, this.f27821c, this, str);
    }

    public final Z O() {
        return P().x();
    }

    public final V P() {
        return this.f27825g;
    }

    public final Double Q(s3 s3Var) {
        Double dJ;
        C2487d c2487dB = s3Var.b();
        return (c2487dB == null || (dJ = c2487dB.j()) == null) ? P().u().c() : dJ;
    }

    public final void R(io.sentry.protocol.u uVar) {
        P().F(uVar);
    }

    @Override // io.sentry.X
    public void a(final boolean z8) {
        if (!isEnabled()) {
            b().getLogger().c(EnumC2596z2.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (InterfaceC2516k0 interfaceC2516k0 : b().getIntegrations()) {
                if (interfaceC2516k0 instanceof Closeable) {
                    try {
                        ((Closeable) interfaceC2516k0).close();
                    } catch (Throwable th) {
                        b().getLogger().c(EnumC2596z2.WARNING, "Failed to close the integration {}.", interfaceC2516k0, th);
                    }
                }
            }
            u(new InterfaceC2549q1() { // from class: io.sentry.t1
                @Override // io.sentry.InterfaceC2549q1
                public final void a(V v8) {
                    v8.clear();
                }
            });
            EnumC2556s1 enumC2556s1 = EnumC2556s1.ISOLATION;
            w(enumC2556s1, new InterfaceC2549q1() { // from class: io.sentry.u1
                @Override // io.sentry.InterfaceC2549q1
                public final void a(V v8) {
                    v8.clear();
                }
            });
            b().getBackpressureMonitor().close();
            b().getTransactionProfiler().close();
            b().getTransactionPerformanceCollector().close();
            final InterfaceC2447a0 executorService = b().getExecutorService();
            if (z8) {
                executorService.submit(new Runnable() { // from class: io.sentry.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        executorService.a(this.f27750a.b().getShutdownTimeoutMillis());
                    }
                });
            } else {
                executorService.a(b().getShutdownTimeoutMillis());
            }
            w(EnumC2556s1.CURRENT, new InterfaceC2549q1() { // from class: io.sentry.w1
                @Override // io.sentry.InterfaceC2549q1
                public final void a(V v8) {
                    v8.x().a(z8);
                }
            });
            w(enumC2556s1, new InterfaceC2549q1() { // from class: io.sentry.x1
                @Override // io.sentry.InterfaceC2549q1
                public final void a(V v8) {
                    v8.x().a(z8);
                }
            });
            w(EnumC2556s1.GLOBAL, new InterfaceC2549q1() { // from class: io.sentry.y1
                @Override // io.sentry.InterfaceC2549q1
                public final void a(V v8) {
                    v8.x().a(z8);
                }
            });
        } catch (Throwable th2) {
            b().getLogger().b(EnumC2596z2.ERROR, "Error while closing the Scopes.", th2);
        }
    }

    @Override // io.sentry.X
    public J2 b() {
        return this.f27825g.b();
    }

    @Override // io.sentry.X
    public void c(io.sentry.protocol.F f8) {
        if (isEnabled()) {
            P().c(f8);
        } else {
            b().getLogger().c(EnumC2596z2.WARNING, "Instance is disabled and this 'setUser' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.X
    public void e(C2491e c2491e, H h8) {
        if (!isEnabled()) {
            b().getLogger().c(EnumC2596z2.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (c2491e == null) {
            b().getLogger().c(EnumC2596z2.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            P().e(c2491e, h8);
        }
    }

    @Override // io.sentry.X
    public void f(Throwable th, InterfaceC2488d0 interfaceC2488d0, String str) {
        P().f(th, interfaceC2488d0, str);
    }

    @Override // io.sentry.X
    public InterfaceC2496f0 h() {
        if (isEnabled()) {
            return P().h();
        }
        b().getLogger().c(EnumC2596z2.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.X
    public void i(C2491e c2491e) {
        e(c2491e, new H());
    }

    @Override // io.sentry.X
    public boolean isEnabled() {
        return O().isEnabled();
    }

    @Override // io.sentry.X
    public void j() {
        if (!isEnabled()) {
            b().getLogger().c(EnumC2596z2.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        Y2 y2J = P().j();
        if (y2J != null) {
            O().b(y2J, io.sentry.util.m.e(new io.sentry.hints.m()));
        }
    }

    @Override // io.sentry.X
    public void k() {
        if (!isEnabled()) {
            b().getLogger().c(EnumC2596z2.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        C2533o1.d dVarK = P().k();
        if (dVarK == null) {
            b().getLogger().c(EnumC2596z2.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        if (dVarK.b() != null) {
            O().b(dVarK.b(), io.sentry.util.m.e(new io.sentry.hints.m()));
        }
        O().b(dVarK.a(), io.sentry.util.m.e(new io.sentry.hints.o()));
    }

    @Override // io.sentry.X
    public io.sentry.transport.A m() {
        return O().m();
    }

    @Override // io.sentry.X
    public boolean n() {
        return O().n();
    }

    @Override // io.sentry.X
    public void p(long j8) {
        if (!isEnabled()) {
            b().getLogger().c(EnumC2596z2.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            O().p(j8);
        } catch (Throwable th) {
            b().getLogger().b(EnumC2596z2.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    @Override // io.sentry.X
    public InterfaceC2480b0 q() {
        return M1.E(this);
    }

    @Override // io.sentry.X
    public io.sentry.protocol.u r(W1 w8, H h8) {
        io.sentry.util.u.c(w8, "SentryEnvelope is required.");
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f27472b;
        if (isEnabled()) {
            try {
                io.sentry.protocol.u uVarR = O().r(w8, h8);
                if (uVarR != null) {
                    return uVarR;
                }
            } catch (Throwable th) {
                b().getLogger().b(EnumC2596z2.ERROR, "Error while capturing envelope.", th);
            }
        } else {
            b().getLogger().c(EnumC2596z2.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
        }
        return uVar;
    }

    @Override // io.sentry.X
    public InterfaceC2496f0 s(s3 s3Var, u3 u3Var) {
        return M(s3Var, u3Var);
    }

    @Override // io.sentry.X
    public void w(EnumC2556s1 enumC2556s1, InterfaceC2549q1 interfaceC2549q1) {
        if (!isEnabled()) {
            b().getLogger().c(EnumC2596z2.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            interfaceC2549q1.a(this.f27825g.N(enumC2556s1));
        } catch (Throwable th) {
            b().getLogger().b(EnumC2596z2.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.X
    public io.sentry.protocol.u x(K2 k8, H h8) {
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f27472b;
        if (isEnabled()) {
            try {
                return O().c(k8, P(), h8);
            } catch (Throwable th) {
                b().getLogger().b(EnumC2596z2.ERROR, "Error while capturing replay", th);
            }
        } else {
            b().getLogger().c(EnumC2596z2.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
        }
        return uVar;
    }

    @Override // io.sentry.X
    public V y() {
        return this.f27819a;
    }

    @Override // io.sentry.X
    public void z(InterfaceC2549q1 interfaceC2549q1) {
        if (!isEnabled()) {
            try {
                interfaceC2549q1.a(H0.i());
                return;
            } catch (Throwable th) {
                b().getLogger().b(EnumC2596z2.ERROR, "Error in the 'withScope' callback.", th);
                return;
            }
        }
        X xN = N("withScope");
        try {
            InterfaceC2480b0 interfaceC2480b0Q = xN.q();
            try {
                interfaceC2549q1.a(xN.y());
                if (interfaceC2480b0Q != null) {
                    interfaceC2480b0Q.close();
                }
            } catch (Throwable th2) {
                if (interfaceC2480b0Q != null) {
                    try {
                        interfaceC2480b0Q.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Throwable th4) {
            b().getLogger().b(EnumC2596z2.ERROR, "Error in the 'withScope' callback.", th4);
        }
    }

    public C2595z1(V v8, V v9, V v10, C2595z1 c2595z1, String str) {
        this.f27825g = new C2503h(v10, v9, v8);
        this.f27819a = v8;
        this.f27820b = v9;
        this.f27821c = v10;
        this.f27822d = c2595z1;
        this.f27823e = str;
        J2 j2B = b();
        S(j2B);
        this.f27824f = j2B.getTransactionPerformanceCollector();
    }

    public static void S(J2 j8) {
        io.sentry.util.u.c(j8, QhsKALGiniuQ.TxGxoxFeNaGybPZ);
        if (j8.getDsn() == null || j8.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
        }
    }

    public final io.sentry.protocol.u L(Throwable th, H h8, InterfaceC2549q1 interfaceC2549q1) {
        io.sentry.protocol.u uVarE = io.sentry.protocol.u.f27472b;
        if (!isEnabled()) {
            b().getLogger().c(EnumC2596z2.WARNING, WqXA.LPATnUlZxE, new Object[0]);
        } else if (th == null) {
            b().getLogger().c(EnumC2596z2.WARNING, "captureException called with null parameter.", new Object[0]);
        } else {
            try {
                C2557s2 c2557s2 = new C2557s2(th);
                I(c2557s2);
                uVarE = O().e(c2557s2, J(P(), interfaceC2549q1), h8);
            } catch (Throwable th2) {
                b().getLogger().b(EnumC2596z2.ERROR, "Error while capturing exception: " + th.getMessage(), th2);
            }
        }
        R(uVarE);
        return uVarE;
    }

    public final InterfaceC2496f0 M(s3 s3Var, u3 u3Var) {
        InterfaceC2496f0 interfaceC2496f0A;
        io.sentry.util.u.c(s3Var, "transactionContext is required");
        s3Var.r(u3Var.a());
        if (!isEnabled()) {
            b().getLogger().c(EnumC2596z2.WARNING, BpgIURjN.DMSanPiJKJGe, new Object[0]);
            interfaceC2496f0A = S0.v();
        } else if (io.sentry.util.A.b(b().getIgnoredSpanOrigins(), s3Var.f())) {
            b().getLogger().c(EnumC2596z2.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", s3Var.f());
            interfaceC2496f0A = S0.v();
        } else if (!b().getInstrumenter().equals(s3Var.d())) {
            b().getLogger().c(EnumC2596z2.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", s3Var.d(), b().getInstrumenter());
            interfaceC2496f0A = S0.v();
        } else if (b().isTracingEnabled()) {
            r3 r3VarA = b().getInternalTracesSampler().a(new C2529n1(s3Var, u3Var.j(), Q(s3Var)));
            s3Var.s(r3VarA);
            InterfaceC2492e0 interfaceC2492e0M = u3Var.m();
            if (interfaceC2492e0M == null) {
                interfaceC2492e0M = b().getSpanFactory();
            }
            interfaceC2496f0A = interfaceC2492e0M.a(s3Var, this, u3Var, this.f27824f);
            if (r3VarA.e().booleanValue() && r3VarA.b().booleanValue()) {
                InterfaceC2500g0 transactionProfiler = b().getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.b(interfaceC2496f0A);
                } else if (u3Var.o()) {
                    transactionProfiler.b(interfaceC2496f0A);
                }
            }
        } else {
            b().getLogger().c(EnumC2596z2.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            interfaceC2496f0A = S0.v();
        }
        if (u3Var.p()) {
            interfaceC2496f0A.q();
        }
        return interfaceC2496f0A;
    }

    @Override // io.sentry.X
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public P m234clone() {
        if (!isEnabled()) {
            b().getLogger().c(EnumC2596z2.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new L(E("scopes clone"));
    }
}
