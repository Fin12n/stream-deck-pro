package io.sentry;

import io.sentry.protocol.C2541c;
import io.sentry.util.C2573e;
import io.sentry.util.C2575g;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class S1 implements Z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2 f25993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io.sentry.transport.q f25994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f25995d = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25992a = true;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements Comparator {
        public b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C2491e c2491e, C2491e c2491e2) {
            return c2491e.w().compareTo(c2491e2.w());
        }
    }

    public S1(J2 j8) {
        this.f25993b = (J2) io.sentry.util.u.c(j8, "SentryOptions is required.");
        InterfaceC2504h0 transportFactory = j8.getTransportFactory();
        if (transportFactory instanceof V0) {
            transportFactory = new C2446a();
            j8.setTransportFactory(transportFactory);
        }
        this.f25994c = transportFactory.a(j8, new C2525m1(j8).a());
    }

    public static /* synthetic */ void g(S1 s8, C2557s2 c2557s2, H h8, Y2 y8) {
        if (y8 == null) {
            s8.f25993b.getLogger().c(EnumC2596z2.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        s8.getClass();
        String strG = null;
        Y2.b bVar = c2557s2.x0() ? Y2.b.Crashed : null;
        boolean z8 = Y2.b.Crashed == bVar || c2557s2.y0();
        String str = (c2557s2.K() == null || c2557s2.K().l() == null || !c2557s2.K().l().containsKey("user-agent")) ? null : (String) c2557s2.K().l().get("user-agent");
        Object objG = io.sentry.util.m.g(h8);
        if (objG instanceof io.sentry.hints.a) {
            strG = ((io.sentry.hints.a) objG).g();
            bVar = Y2.b.Abnormal;
        }
        if (y8.q(bVar, str, z8, strG) && y8.m()) {
            y8.c();
        }
    }

    public final boolean A() {
        io.sentry.util.x xVarA = this.f25993b.getSampleRate() == null ? null : io.sentry.util.z.a();
        return this.f25993b.getSampleRate() == null || xVarA == null || this.f25993b.getSampleRate().doubleValue() >= xVarA.d();
    }

    public final io.sentry.protocol.u B(W1 w8, H h8) {
        J2.b beforeEnvelopeCallback = this.f25993b.getBeforeEnvelopeCallback();
        if (beforeEnvelopeCallback != null) {
            try {
                beforeEnvelopeCallback.b(w8, h8);
            } catch (Throwable th) {
                this.f25993b.getLogger().b(EnumC2596z2.ERROR, "The BeforeEnvelope callback threw an exception.", th);
            }
        }
        if (h8 == null) {
            this.f25994c.u1(w8);
        } else {
            this.f25994c.m0(w8, h8);
        }
        io.sentry.protocol.u uVarA = w8.b().a();
        return uVarA != null ? uVarA : io.sentry.protocol.u.f27472b;
    }

    public final boolean C(P1 p8, H h8) {
        if (io.sentry.util.m.q(h8)) {
            return true;
        }
        this.f25993b.getLogger().c(EnumC2596z2.DEBUG, "Event was cached so not applying scope: %s", p8.G());
        return false;
    }

    public final boolean D(Y2 y8, Y2 y9) {
        if (y9 == null) {
            return false;
        }
        if (y8 == null) {
            return true;
        }
        Y2.b bVarL = y9.l();
        Y2.b bVar = Y2.b.Crashed;
        if (bVarL != bVar || y8.l() == bVar) {
            return y9.e() > 0 && y8.e() <= 0;
        }
        return true;
    }

    public final void E(P1 p8, Collection collection) {
        List listB = p8.B();
        if (listB == null || collection.isEmpty()) {
            return;
        }
        listB.addAll(collection);
        Collections.sort(listB, this.f25995d);
    }

    public Y2 F(final C2557s2 c2557s2, final H h8, V v8) {
        if (io.sentry.util.m.q(h8)) {
            if (v8 != null) {
                return v8.v(new C2533o1.b() { // from class: io.sentry.R1
                    @Override // io.sentry.C2533o1.b
                    public final void a(Y2 y8) {
                        S1.g(this.f25987a, c2557s2, h8, y8);
                    }
                });
            }
            this.f25993b.getLogger().c(EnumC2596z2.INFO, "Scope is null on client.captureEvent", new Object[0]);
        }
        return null;
    }

    @Override // io.sentry.Z
    public void a(boolean z8) {
        long shutdownTimeoutMillis;
        this.f25993b.getLogger().c(EnumC2596z2.INFO, "Closing SentryClient.", new Object[0]);
        if (z8) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = this.f25993b.getShutdownTimeoutMillis();
            } catch (IOException e8) {
                this.f25993b.getLogger().b(EnumC2596z2.WARNING, "Failed to close the connection to the Sentry Server.", e8);
            }
        }
        p(shutdownTimeoutMillis);
        this.f25994c.a(z8);
        for (C c8 : this.f25993b.getEventProcessors()) {
            if (c8 instanceof Closeable) {
                try {
                    ((Closeable) c8).close();
                } catch (IOException e9) {
                    this.f25993b.getLogger().c(EnumC2596z2.WARNING, "Failed to close the event processor {}.", c8, e9);
                }
            }
        }
        this.f25992a = false;
    }

    @Override // io.sentry.Z
    public void b(Y2 y8, H h8) {
        io.sentry.util.u.c(y8, "Session is required.");
        if (y8.h() == null || y8.h().isEmpty()) {
            this.f25993b.getLogger().c(EnumC2596z2.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            r(W1.a(this.f25993b.getSerializer(), y8, this.f25993b.getSdkVersion()), h8);
        } catch (IOException e8) {
            this.f25993b.getLogger().b(EnumC2596z2.ERROR, "Failed to capture session.", e8);
        }
    }

    @Override // io.sentry.Z
    public io.sentry.protocol.u c(K2 k8, V v8, H h8) {
        p3 p3VarB;
        io.sentry.util.u.c(k8, "SessionReplay is required.");
        if (h8 == null) {
            h8 = new H();
        }
        if (C(k8, h8)) {
            k(k8, v8);
        }
        ILogger logger = this.f25993b.getLogger();
        EnumC2596z2 enumC2596z2 = EnumC2596z2.DEBUG;
        logger.c(enumC2596z2, "Capturing session replay: %s", k8.G());
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f27472b;
        io.sentry.protocol.u uVarG = k8.G() != null ? k8.G() : uVar;
        K2 k2Y = y(k8, h8, this.f25993b.getEventProcessors());
        if (k2Y != null && (k2Y = s(k2Y, h8)) == null) {
            this.f25993b.getLogger().c(enumC2596z2, "Event was dropped by beforeSendReplay", new Object[0]);
            this.f25993b.getClientReportRecorder().a(io.sentry.clientreport.f.BEFORE_SEND, EnumC2515k.Replay);
        }
        if (k2Y == null) {
            return uVar;
        }
        if (v8 != null) {
            try {
                InterfaceC2496f0 interfaceC2496f0H = v8.h();
                p3VarB = interfaceC2496f0H != null ? interfaceC2496f0H.b() : io.sentry.util.F.g(v8, this.f25993b).h();
            } catch (IOException e8) {
                this.f25993b.getLogger().a(EnumC2596z2.WARNING, e8, "Capturing event %s failed.", uVarG);
                return io.sentry.protocol.u.f27472b;
            }
        } else {
            p3VarB = null;
        }
        W1 w1O = o(k2Y, h8.f(), p3VarB, io.sentry.util.m.h(h8, io.sentry.hints.c.class));
        h8.b();
        this.f25994c.m0(w1O, h8);
        return uVarG;
    }

    @Override // io.sentry.Z
    public io.sentry.protocol.u d(io.sentry.protocol.B b8, p3 p3Var, V v8, H h8, C2497f1 c2497f1) {
        io.sentry.util.u.c(b8, "Transaction is required.");
        if (h8 == null) {
            h8 = new H();
        }
        if (C(b8, h8)) {
            h(v8, h8);
        }
        ILogger logger = this.f25993b.getLogger();
        EnumC2596z2 enumC2596z2 = EnumC2596z2.DEBUG;
        logger.c(enumC2596z2, "Capturing transaction: %s", b8.G());
        if (io.sentry.util.F.f(this.f25993b.getIgnoredTransactions(), b8.p0())) {
            this.f25993b.getLogger().c(enumC2596z2, "Transaction was dropped as transaction name %s is ignored", b8.p0());
            io.sentry.clientreport.h clientReportRecorder = this.f25993b.getClientReportRecorder();
            io.sentry.clientreport.f fVar = io.sentry.clientreport.f.EVENT_PROCESSOR;
            clientReportRecorder.a(fVar, EnumC2515k.Transaction);
            this.f25993b.getClientReportRecorder().c(fVar, EnumC2515k.Span, b8.o0().size() + 1);
            return io.sentry.protocol.u.f27472b;
        }
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f27472b;
        io.sentry.protocol.u uVarG = b8.G() != null ? b8.G() : uVar;
        if (C(b8, h8)) {
            b8 = (io.sentry.protocol.B) i(b8, v8);
            if (b8 != null && v8 != null) {
                b8 = z(b8, h8, v8.K());
            }
            if (b8 == null) {
                this.f25993b.getLogger().c(enumC2596z2, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (b8 != null) {
            b8 = z(b8, h8, this.f25993b.getEventProcessors());
        }
        if (b8 == null) {
            this.f25993b.getLogger().c(enumC2596z2, "Transaction was dropped by Event processors.", new Object[0]);
            return uVar;
        }
        int size = b8.o0().size();
        io.sentry.protocol.B bT = t(b8, h8);
        int size2 = bT == null ? 0 : bT.o0().size();
        if (bT == null) {
            this.f25993b.getLogger().c(enumC2596z2, "Transaction was dropped by beforeSendTransaction.", new Object[0]);
            io.sentry.clientreport.h clientReportRecorder2 = this.f25993b.getClientReportRecorder();
            io.sentry.clientreport.f fVar2 = io.sentry.clientreport.f.BEFORE_SEND;
            clientReportRecorder2.a(fVar2, EnumC2515k.Transaction);
            this.f25993b.getClientReportRecorder().c(fVar2, EnumC2515k.Span, size + 1);
            return uVar;
        }
        if (size2 < size) {
            int i8 = size - size2;
            this.f25993b.getLogger().c(enumC2596z2, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i8));
            this.f25993b.getClientReportRecorder().c(io.sentry.clientreport.f.BEFORE_SEND, EnumC2515k.Span, i8);
        }
        try {
            W1 w1L = l(bT, u(w(h8)), null, p3Var, c2497f1);
            h8.b();
            return w1L != null ? B(w1L, h8) : uVarG;
        } catch (io.sentry.exception.b | IOException e8) {
            this.f25993b.getLogger().a(EnumC2596z2.WARNING, e8, "Capturing transaction %s failed.", uVarG);
            return io.sentry.protocol.u.f27472b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x019d  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cd  */
    @Override // io.sentry.Z
    public io.sentry.protocol.u e(C2557s2 c2557s2, V v8, H h8) {
        C2557s2 c2557s3;
        S1 s8;
        p3 p3VarB;
        p3 p3Var;
        io.sentry.util.u.c(c2557s2, "SentryEvent is required.");
        if (h8 == null) {
            h8 = new H();
        }
        if (C(c2557s2, h8)) {
            h(v8, h8);
        }
        ILogger logger = this.f25993b.getLogger();
        EnumC2596z2 enumC2596z2 = EnumC2596z2.DEBUG;
        logger.c(enumC2596z2, "Capturing event: %s", c2557s2.G());
        Throwable thO = c2557s2.O();
        if (thO != null && C2575g.b(this.f25993b.getIgnoredExceptionsForType(), thO)) {
            this.f25993b.getLogger().c(enumC2596z2, "Event was dropped as the exception %s is ignored", thO.getClass());
            this.f25993b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC2515k.Error);
            return io.sentry.protocol.u.f27472b;
        }
        if (C2573e.a(this.f25993b.getIgnoredErrors(), c2557s2)) {
            this.f25993b.getLogger().c(enumC2596z2, "Event was dropped as it matched a string/pattern in ignoredErrors", c2557s2.r0());
            this.f25993b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC2515k.Error);
            return io.sentry.protocol.u.f27472b;
        }
        if (C(c2557s2, h8) && (c2557s2 = j(c2557s2, v8, h8)) == null) {
            this.f25993b.getLogger().c(enumC2596z2, "Event was dropped by applyScope", new Object[0]);
            return io.sentry.protocol.u.f27472b;
        }
        C2557s2 c2557s2X = x(c2557s2, h8, this.f25993b.getEventProcessors());
        if (c2557s2X != null && (c2557s2X = q(c2557s2X, h8)) == null) {
            this.f25993b.getLogger().c(enumC2596z2, "Event was dropped by beforeSend", new Object[0]);
            this.f25993b.getClientReportRecorder().a(io.sentry.clientreport.f.BEFORE_SEND, EnumC2515k.Error);
        }
        if (c2557s2X == null) {
            return io.sentry.protocol.u.f27472b;
        }
        Y2 y2V = v8 != null ? v8.v(new C2533o1.b() { // from class: io.sentry.Q1
            @Override // io.sentry.C2533o1.b
            public final void a(Y2 y8) {
                S1.f(y8);
            }
        }) : null;
        Y2 y2F = (y2V == null || !y2V.m()) ? F(c2557s2X, h8, v8) : null;
        if (A()) {
            c2557s3 = c2557s2X;
        } else {
            this.f25993b.getLogger().c(enumC2596z2, "Event %s was dropped due to sampling decision.", c2557s2X.G());
            this.f25993b.getClientReportRecorder().a(io.sentry.clientreport.f.SAMPLE_RATE, EnumC2515k.Error);
            c2557s3 = null;
        }
        boolean zD = D(y2V, y2F);
        if (c2557s3 == null && !zD) {
            this.f25993b.getLogger().c(enumC2596z2, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return io.sentry.protocol.u.f27472b;
        }
        io.sentry.protocol.u uVarB = io.sentry.protocol.u.f27472b;
        if (c2557s3 != null && c2557s3.G() != null) {
            uVarB = c2557s3.G();
        }
        boolean zH = io.sentry.util.m.h(h8, io.sentry.hints.c.class);
        if (c2557s3 != null && !zH && (c2557s3.y0() || c2557s3.x0())) {
            this.f25993b.getReplayController().c(Boolean.valueOf(c2557s3.x0()));
        }
        try {
            if (zH) {
                if (c2557s3 != null) {
                    p3VarB = C2487d.c(c2557s3, this.f25993b).O();
                    p3Var = p3VarB;
                } else {
                    p3Var = null;
                }
            } else if (v8 != null) {
                InterfaceC2496f0 interfaceC2496f0H = v8.h();
                p3VarB = interfaceC2496f0H != null ? interfaceC2496f0H.b() : io.sentry.util.F.g(v8, this.f25993b).h();
                p3Var = p3VarB;
            } else {
                p3Var = null;
            }
            s8 = this;
            try {
                W1 w1L = s8.l(c2557s3, c2557s3 != null ? w(h8) : null, y2F, p3Var, null);
                h8.b();
                if (w1L != null) {
                    uVarB = B(w1L, h8);
                }
            } catch (io.sentry.exception.b e8) {
                e = e8;
                s8.f25993b.getLogger().a(EnumC2596z2.WARNING, e, "Capturing event %s failed.", uVarB);
                uVarB = io.sentry.protocol.u.f27472b;
            } catch (IOException e9) {
                e = e9;
                s8.f25993b.getLogger().a(EnumC2596z2.WARNING, e, "Capturing event %s failed.", uVarB);
                uVarB = io.sentry.protocol.u.f27472b;
            }
        } catch (io.sentry.exception.b e10) {
            e = e10;
            s8 = this;
            s8.f25993b.getLogger().a(EnumC2596z2.WARNING, e, "Capturing event %s failed.", uVarB);
            uVarB = io.sentry.protocol.u.f27472b;
            if (v8 != null) {
                v(v8, h8);
            }
            return uVarB;
        } catch (IOException e11) {
            e = e11;
            s8 = this;
            s8.f25993b.getLogger().a(EnumC2596z2.WARNING, e, "Capturing event %s failed.", uVarB);
            uVarB = io.sentry.protocol.u.f27472b;
            if (v8 != null) {
                v(v8, h8);
            }
            return uVarB;
        }
        if (v8 != null) {
            v(v8, h8);
        }
        return uVarB;
    }

    public final void h(V v8, H h8) {
        if (v8 != null) {
            h8.a(v8.z());
        }
    }

    public final P1 i(P1 p8, V v8) {
        if (v8 != null) {
            if (p8.K() == null) {
                p8.Z(v8.J());
            }
            if (p8.Q() == null) {
                p8.e0(v8.I());
            }
            if (p8.N() == null) {
                p8.d0(new HashMap(v8.getTags()));
            } else {
                for (Map.Entry entry : v8.getTags().entrySet()) {
                    if (!p8.N().containsKey(entry.getKey())) {
                        p8.N().put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            if (p8.B() == null) {
                p8.R(new ArrayList(v8.r()));
            } else {
                E(p8, v8.r());
            }
            if (p8.H() == null) {
                p8.W(new HashMap(v8.getExtras()));
            } else {
                for (Map.Entry entry2 : v8.getExtras().entrySet()) {
                    if (!p8.H().containsKey(entry2.getKey())) {
                        p8.H().put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            C2541c c2541cC = p8.C();
            for (Map.Entry entry3 : new C2541c(v8.B()).b()) {
                if (!c2541cC.a(entry3.getKey())) {
                    c2541cC.j((String) entry3.getKey(), entry3.getValue());
                }
            }
        }
        return p8;
    }

    @Override // io.sentry.Z
    public boolean isEnabled() {
        return this.f25992a;
    }

    public final C2557s2 j(C2557s2 c2557s2, V v8, H h8) {
        if (v8 == null) {
            return c2557s2;
        }
        i(c2557s2, v8);
        if (c2557s2.v0() == null) {
            c2557s2.G0(v8.L());
        }
        if (c2557s2.p0() == null) {
            c2557s2.A0(v8.H());
        }
        if (v8.s() != null) {
            c2557s2.B0(v8.s());
        }
        InterfaceC2488d0 interfaceC2488d0P = v8.p();
        if (c2557s2.C().h() == null) {
            if (interfaceC2488d0P == null) {
                c2557s2.C().u(s3.v(v8.u()));
            } else {
                c2557s2.C().u(interfaceC2488d0P.p());
            }
        }
        return x(c2557s2, h8, v8.K());
    }

    public final K2 k(K2 k8, V v8) {
        if (v8 != null) {
            if (k8.K() == null) {
                k8.Z(v8.J());
            }
            if (k8.Q() == null) {
                k8.e0(v8.I());
            }
            if (k8.N() == null) {
                k8.d0(new HashMap(v8.getTags()));
            } else {
                for (Map.Entry entry : v8.getTags().entrySet()) {
                    if (!k8.N().containsKey(entry.getKey())) {
                        k8.N().put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            C2541c c2541cC = k8.C();
            for (Map.Entry entry2 : new C2541c(v8.B()).b()) {
                if (!c2541cC.a(entry2.getKey())) {
                    c2541cC.j((String) entry2.getKey(), entry2.getValue());
                }
            }
            InterfaceC2488d0 interfaceC2488d0P = v8.p();
            if (k8.C().h() == null) {
                if (interfaceC2488d0P == null) {
                    k8.C().u(s3.v(v8.u()));
                    return k8;
                }
                k8.C().u(interfaceC2488d0P.p());
            }
        }
        return k8;
    }

    public final W1 l(P1 p8, List list, Y2 y8, p3 p3Var, C2497f1 c2497f1) {
        io.sentry.protocol.u uVar;
        ArrayList arrayList = new ArrayList();
        if (p8 != null) {
            arrayList.add(C2550q2.v(this.f25993b.getSerializer(), p8));
            uVar = p8.G();
        } else {
            uVar = null;
        }
        if (y8 != null) {
            arrayList.add(C2550q2.y(this.f25993b.getSerializer(), y8));
        }
        if (c2497f1 != null) {
            arrayList.add(C2550q2.w(c2497f1, this.f25993b.getMaxTraceFileSize(), this.f25993b.getSerializer()));
            if (uVar == null) {
                uVar = new io.sentry.protocol.u(c2497f1.B());
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C2550q2.t(this.f25993b.getSerializer(), this.f25993b.getLogger(), (C2479b) it.next(), this.f25993b.getMaxAttachmentSize()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new W1(new X1(uVar, this.f25993b.getSdkVersion(), p3Var), arrayList);
    }

    @Override // io.sentry.Z
    public io.sentry.transport.A m() {
        return this.f25994c.m();
    }

    @Override // io.sentry.Z
    public boolean n() {
        return this.f25994c.n();
    }

    public final W1 o(K2 k8, C2517k1 c2517k1, p3 p3Var, boolean z8) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C2550q2.x(this.f25993b.getSerializer(), this.f25993b.getLogger(), k8, c2517k1, z8));
        return new W1(new X1(k8.G(), this.f25993b.getSessionReplay().i(), p3Var), arrayList);
    }

    @Override // io.sentry.Z
    public void p(long j8) {
        this.f25994c.p(j8);
    }

    public final C2557s2 q(C2557s2 c2557s2, H h8) {
        J2.c beforeSend = this.f25993b.getBeforeSend();
        if (beforeSend == null) {
            return c2557s2;
        }
        try {
            return beforeSend.a(c2557s2, h8);
        } catch (Throwable th) {
            this.f25993b.getLogger().b(EnumC2596z2.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th);
            return null;
        }
    }

    @Override // io.sentry.Z
    public io.sentry.protocol.u r(W1 w8, H h8) {
        io.sentry.util.u.c(w8, "SentryEnvelope is required.");
        if (h8 == null) {
            h8 = new H();
        }
        try {
            h8.b();
            return B(w8, h8);
        } catch (IOException e8) {
            this.f25993b.getLogger().b(EnumC2596z2.ERROR, "Failed to capture envelope.", e8);
            return io.sentry.protocol.u.f27472b;
        }
    }

    public final K2 s(K2 k8, H h8) {
        this.f25993b.getBeforeSendReplay();
        return k8;
    }

    public final io.sentry.protocol.B t(io.sentry.protocol.B b8, H h8) {
        this.f25993b.getBeforeSendTransaction();
        return b8;
    }

    public final List u(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2479b c2479b = (C2479b) it.next();
            if (c2479b.j()) {
                arrayList.add(c2479b);
            }
        }
        return arrayList;
    }

    public final void v(V v8, H h8) {
        InterfaceC2496f0 interfaceC2496f0H = v8.h();
        if (interfaceC2496f0H == null || !io.sentry.util.m.h(h8, io.sentry.hints.q.class)) {
            return;
        }
        Object objG = io.sentry.util.m.g(h8);
        if (!(objG instanceof io.sentry.hints.f)) {
            interfaceC2496f0H.e(k3.ABORTED, false, null);
        } else {
            ((io.sentry.hints.f) objG).h(interfaceC2496f0H.n());
            interfaceC2496f0H.e(k3.ABORTED, false, h8);
        }
    }

    public final List w(H h8) {
        List listE = h8.e();
        C2479b c2479bG = h8.g();
        if (c2479bG != null) {
            listE.add(c2479bG);
        }
        C2479b c2479bI = h8.i();
        if (c2479bI != null) {
            listE.add(c2479bI);
        }
        C2479b c2479bH = h8.h();
        if (c2479bH != null) {
            listE.add(c2479bH);
        }
        return listE;
    }

    public final C2557s2 x(C2557s2 c2557s2, H h8, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C c8 = (C) it.next();
            try {
                boolean z8 = c8 instanceof InterfaceC2483c;
                boolean zH = io.sentry.util.m.h(h8, io.sentry.hints.c.class);
                if (zH && z8) {
                    c2557s2 = c8.c(c2557s2, h8);
                } else if (!zH && !z8) {
                    c2557s2 = c8.c(c2557s2, h8);
                }
            } catch (Throwable th) {
                this.f25993b.getLogger().a(EnumC2596z2.ERROR, th, "An exception occurred while processing event by processor: %s", c8.getClass().getName());
            }
            if (c2557s2 == null) {
                this.f25993b.getLogger().c(EnumC2596z2.DEBUG, "Event was dropped by a processor: %s", c8.getClass().getName());
                this.f25993b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC2515k.Error);
                break;
            }
        }
        return c2557s2;
    }

    public final K2 y(K2 k8, H h8, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C c8 = (C) it.next();
            try {
                k8 = c8.b(k8, h8);
            } catch (Throwable th) {
                this.f25993b.getLogger().a(EnumC2596z2.ERROR, th, "An exception occurred while processing replay event by processor: %s", c8.getClass().getName());
            }
            if (k8 == null) {
                this.f25993b.getLogger().c(EnumC2596z2.DEBUG, "Replay event was dropped by a processor: %s", c8.getClass().getName());
                this.f25993b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC2515k.Replay);
                break;
            }
        }
        return k8;
    }

    public final io.sentry.protocol.B z(io.sentry.protocol.B b8, H h8, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C c8 = (C) it.next();
            int size = b8.o0().size();
            try {
                b8 = c8.j(b8, h8);
            } catch (Throwable th) {
                this.f25993b.getLogger().a(EnumC2596z2.ERROR, th, "An exception occurred while processing transaction by processor: %s", c8.getClass().getName());
            }
            int size2 = b8 == null ? 0 : b8.o0().size();
            if (b8 == null) {
                this.f25993b.getLogger().c(EnumC2596z2.DEBUG, "Transaction was dropped by a processor: %s", c8.getClass().getName());
                io.sentry.clientreport.h clientReportRecorder = this.f25993b.getClientReportRecorder();
                io.sentry.clientreport.f fVar = io.sentry.clientreport.f.EVENT_PROCESSOR;
                clientReportRecorder.a(fVar, EnumC2515k.Transaction);
                this.f25993b.getClientReportRecorder().c(fVar, EnumC2515k.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i8 = size - size2;
                this.f25993b.getLogger().c(EnumC2596z2.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i8), c8.getClass().getName());
                this.f25993b.getClientReportRecorder().c(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC2515k.Span, i8);
            }
        }
        return b8;
    }

    public static /* synthetic */ void f(Y2 y8) {
    }
}
