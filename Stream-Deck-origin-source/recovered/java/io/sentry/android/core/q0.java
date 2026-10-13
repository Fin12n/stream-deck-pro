package io.sentry.android.core;

import E4.JFpq.XRlnZWSrAFn;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import io.sentry.C2557s2;
import io.sentry.InterfaceC2480b0;
import io.sentry.InterfaceC2594z0;
import io.sentry.d3;
import io.sentry.i3;
import io.sentry.k3;
import io.sentry.protocol.C2539a;
import io.sentry.protocol.C2546h;
import io.sentry.util.C2569a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class q0 implements io.sentry.C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2460h f26537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SentryAndroidOptions f26538c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26536a = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2569a f26539d = new C2569a();

    public static boolean e(double d8, io.sentry.protocol.x xVar) {
        if (d8 >= xVar.f().doubleValue()) {
            return xVar.g() == null || d8 <= xVar.g().doubleValue();
        }
        return false;
    }

    public static io.sentry.protocol.x g(io.sentry.android.core.performance.g gVar, i3 i3Var, io.sentry.protocol.u uVar, String str) {
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(io.sentry.android.core.internal.util.d.f26417b));
        map.put("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        map.put("ui.contributes_to_ttid", bool);
        map.put("ui.contributes_to_ttfd", bool);
        return new io.sentry.protocol.x(Double.valueOf(gVar.t()), Double.valueOf(gVar.j()), uVar, new i3(), i3Var, str, gVar.b(), k3.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), map);
    }

    @Override // io.sentry.C
    public C2557s2 c(C2557s2 c2557s2, io.sentry.H h8) {
        return c2557s2;
    }

    public final boolean d(io.sentry.protocol.B b8) {
        for (io.sentry.protocol.x xVar : b8.o0()) {
            if (xVar.d().contentEquals("app.start.cold") || xVar.d().contentEquals("app.start.warm")) {
                return true;
            }
        }
        d3 d3VarH = b8.C().h();
        if (d3VarH != null) {
            return d3VarH.e().equals("app.start.cold") || d3VarH.e().equals("app.start.warm");
        }
        return false;
    }

    public final void f(io.sentry.protocol.B b8) {
        Object obj;
        io.sentry.protocol.x xVar = null;
        io.sentry.protocol.x xVar2 = null;
        for (io.sentry.protocol.x xVar3 : b8.o0()) {
            if ("ui.load.initial_display".equals(xVar3.d())) {
                xVar = xVar3;
            } else if ("ui.load.full_display".equals(xVar3.d())) {
                xVar2 = xVar3;
            }
            if (xVar != null && xVar2 != null) {
                break;
            }
        }
        if (xVar == null && xVar2 == null) {
            return;
        }
        for (io.sentry.protocol.x xVar4 : b8.o0()) {
            if (xVar4 != xVar && xVar4 != xVar2) {
                Map mapB = xVar4.b();
                boolean z8 = false;
                boolean z9 = xVar != null && e(xVar4.f().doubleValue(), xVar) && (mapB == null || (obj = mapB.get("thread.name")) == null || "main".equals(obj));
                if (xVar2 != null && e(xVar4.f().doubleValue(), xVar2)) {
                    z8 = true;
                }
                if (z9 || z8) {
                    Map mapB2 = xVar4.b();
                    if (mapB2 == null) {
                        mapB2 = new ConcurrentHashMap();
                        xVar4.h(mapB2);
                    }
                    if (z9) {
                        mapB2.put("ui.contributes_to_ttid", Boolean.TRUE);
                    }
                    if (z8) {
                        mapB2.put("ui.contributes_to_ttfd", Boolean.TRUE);
                    }
                }
            }
        }
    }

    @Override // io.sentry.C
    public io.sentry.protocol.B j(io.sentry.protocol.B b8, io.sentry.H h8) {
        Map mapM;
        InterfaceC2480b0 interfaceC2480b0A = this.f26539d.a();
        try {
            if (!this.f26538c.isTracingEnabled()) {
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
                return b8;
            }
            io.sentry.android.core.performance.f fVarM = io.sentry.android.core.performance.f.m();
            if (d(b8)) {
                if (fVarM.v()) {
                    long jC = fVarM.i(this.f26538c).c();
                    if (jC != 0) {
                        b8.m0().put(fVarM.j() == io.sentry.android.core.performance.f.a.COLD ? "app_start_cold" : "app_start_warm", new C2546h(Float.valueOf(jC), InterfaceC2594z0.a.MILLISECOND.apiName()));
                        a(fVarM, b8);
                        fVarM.p();
                    }
                }
                C2539a c2539aD = b8.C().d();
                if (c2539aD == null) {
                    c2539aD = new C2539a();
                    b8.C().m(c2539aD);
                }
                c2539aD.v(fVarM.j() == io.sentry.android.core.performance.f.a.COLD ? "cold" : "warm");
            }
            f(b8);
            io.sentry.protocol.u uVarG = b8.G();
            d3 d3VarH = b8.C().h();
            if (uVarG != null && d3VarH != null && d3VarH.e().contentEquals("ui.load") && (mapM = this.f26537b.m(uVarG)) != null) {
                b8.m0().putAll(mapM);
            }
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return b8;
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

    public q0(SentryAndroidOptions sentryAndroidOptions, C2460h c2460h) {
        this.f26538c = (SentryAndroidOptions) io.sentry.util.u.c(sentryAndroidOptions, XRlnZWSrAFn.XBFczpD);
        this.f26537b = (C2460h) io.sentry.util.u.c(c2460h, "ActivityFramesTracker is required");
    }

    public final void a(io.sentry.android.core.performance.f fVar, io.sentry.protocol.B b8) {
        d3 d3VarH;
        i3 i3VarE;
        if (fVar.j() == io.sentry.android.core.performance.f.a.COLD && (d3VarH = b8.C().h()) != null) {
            io.sentry.protocol.u uVarN = d3VarH.n();
            Iterator it = b8.o0().iterator();
            while (true) {
                if (it.hasNext()) {
                    io.sentry.protocol.x xVar = (io.sentry.protocol.x) it.next();
                    if (xVar.d().contentEquals("app.start.cold")) {
                        i3VarE = xVar.e();
                        break;
                    }
                } else {
                    i3VarE = null;
                    break;
                }
            }
            io.sentry.android.core.performance.g gVarE = fVar.e();
            if (gVarE.x() && Math.abs(gVarE.c()) <= 10000) {
                b8.o0().add(g(gVarE, i3VarE, uVarN, "process.load"));
            }
            List listL = fVar.l();
            if (!listL.isEmpty()) {
                Iterator it2 = listL.iterator();
                while (it2.hasNext()) {
                    b8.o0().add(g((io.sentry.android.core.performance.g) it2.next(), i3VarE, uVarN, "contentprovider.load"));
                }
            }
            io.sentry.android.core.performance.g gVarK = fVar.k();
            if (gVarK.y()) {
                b8.o0().add(g(gVarK, i3VarE, uVarN, LYdqVGvOGMNr.zwegXd));
            }
        }
    }
}
