package io.sentry.android.core;

import V.ocy.SVzBK;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import io.sentry.C2491e;
import io.sentry.C2557s2;
import io.sentry.C2561t2;
import io.sentry.EnumC2596z2;
import io.sentry.InterfaceC2483c;
import io.sentry.N2;
import io.sentry.P1;
import io.sentry.d3;
import io.sentry.protocol.C2539a;
import io.sentry.protocol.C2541c;
import io.sentry.protocol.C2542d;
import io.sentry.protocol.C2543e;
import io.sentry.protocol.DebugImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class I implements InterfaceC2483c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SentryAndroidOptions f26199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q f26200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2561t2 f26201d;

    public I(Context context, SentryAndroidOptions sentryAndroidOptions, Q q8) {
        this.f26198a = Z.h(context);
        this.f26199b = sentryAndroidOptions;
        this.f26200c = q8;
        this.f26201d = new C2561t2(new N2(sentryAndroidOptions));
    }

    public final void A(P1 p8) {
        if (p8.J() == null) {
            p8.Y((String) io.sentry.cache.h.i(this.f26199b, "release.json", String.class));
        }
    }

    public final void B(C2557s2 c2557s2) {
        String str = (String) io.sentry.cache.s.x(this.f26199b, "replay.json", String.class);
        if (!new File(this.f26199b.getCacheDirPath(), "replay_" + str).exists()) {
            if (!m(c2557s2)) {
                return;
            }
            File[] fileArrListFiles = new File(this.f26199b.getCacheDirPath()).listFiles();
            String strSubstring = null;
            if (fileArrListFiles != null) {
                long jLastModified = Long.MIN_VALUE;
                for (File file : fileArrListFiles) {
                    if (file.isDirectory() && file.getName().startsWith("replay_") && file.lastModified() > jLastModified && file.lastModified() <= c2557s2.u0().getTime()) {
                        jLastModified = file.lastModified();
                        strSubstring = file.getName().substring(7);
                    }
                }
            }
            str = strSubstring;
        }
        if (str == null) {
            return;
        }
        io.sentry.cache.s.A(this.f26199b, str, "replay.json");
        c2557s2.C().j("replay_id", str);
    }

    public final void C(P1 p8) {
        if (p8.K() == null) {
            p8.Z((io.sentry.protocol.l) io.sentry.cache.s.x(this.f26199b, "request.json", io.sentry.protocol.l.class));
        }
    }

    public final void D(P1 p8) {
        Map map = (Map) io.sentry.cache.s.x(this.f26199b, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (p8.N() == null) {
            p8.d0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!p8.N().containsKey(entry.getKey())) {
                p8.c0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public final void E(P1 p8) {
        if (p8.L() == null) {
            p8.a0((io.sentry.protocol.o) io.sentry.cache.h.i(this.f26199b, "sdk-version.json", io.sentry.protocol.o.class));
        }
    }

    public final void F(P1 p8) {
        try {
            Z.a aVarL = d0.i(this.f26198a, this.f26199b).l();
            if (aVarL != null) {
                for (Map.Entry entry : aVarL.a().entrySet()) {
                    p8.c0((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th) {
            this.f26199b.getLogger().b(EnumC2596z2.ERROR, "Error getting side loaded info.", th);
        }
    }

    public final void G(C2557s2 c2557s2) {
        l(c2557s2);
        F(c2557s2);
    }

    public final void H(C2557s2 c2557s2) {
        d3 d3Var = (d3) io.sentry.cache.s.x(this.f26199b, "trace.json", d3.class);
        if (c2557s2.C().h() != null || d3Var == null || d3Var.k() == null || d3Var.n() == null) {
            return;
        }
        c2557s2.C().u(d3Var);
    }

    public final void I(C2557s2 c2557s2) {
        String str = (String) io.sentry.cache.s.x(this.f26199b, "transaction.json", String.class);
        if (c2557s2.v0() == null) {
            c2557s2.G0(str);
        }
    }

    public final void J(P1 p8) {
        if (p8.Q() == null) {
            p8.e0((io.sentry.protocol.F) io.sentry.cache.s.x(this.f26199b, "user.json", io.sentry.protocol.F.class));
        }
    }

    public final void a(C2557s2 c2557s2, Object obj) {
        A(c2557s2);
        t(c2557s2);
        s(c2557s2);
        q(c2557s2);
        E(c2557s2);
        n(c2557s2, obj);
        y(c2557s2);
    }

    @Override // io.sentry.C
    public C2557s2 c(C2557s2 c2557s2, io.sentry.H h8) {
        Object objG = io.sentry.util.m.g(h8);
        if (!(objG instanceof io.sentry.hints.c)) {
            this.f26199b.getLogger().c(EnumC2596z2.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return c2557s2;
        }
        u(c2557s2, objG);
        z(c2557s2);
        k(c2557s2);
        r(c2557s2);
        if (!((io.sentry.hints.c) objG).a()) {
            this.f26199b.getLogger().c(EnumC2596z2.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return c2557s2;
        }
        d(c2557s2, objG);
        a(c2557s2, objG);
        G(c2557s2);
        return c2557s2;
    }

    public final void d(C2557s2 c2557s2, Object obj) {
        C(c2557s2);
        J(c2557s2);
        D(c2557s2);
        o(c2557s2);
        v(c2557s2);
        p(c2557s2);
        I(c2557s2);
        w(c2557s2, obj);
        x(c2557s2);
        H(c2557s2);
        B(c2557s2);
    }

    public final io.sentry.protocol.A e(List list) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            io.sentry.protocol.A a8 = (io.sentry.protocol.A) it.next();
            String strM = a8.m();
            if (strM != null && strM.equals("main")) {
                return a8;
            }
        }
        return null;
    }

    public final C2543e f() {
        C2543e c2543e = new C2543e();
        if (this.f26199b.isSendDefaultPii()) {
            c2543e.d0(Z.l(this.f26198a));
        }
        c2543e.Z(Build.MANUFACTURER);
        c2543e.O(Build.BRAND);
        c2543e.T(Z.n(this.f26199b.getLogger()));
        c2543e.b0(Build.MODEL);
        c2543e.c0(Build.ID);
        c2543e.K(Z.k());
        ActivityManager.MemoryInfo memoryInfoP = Z.p(this.f26198a, this.f26199b.getLogger());
        if (memoryInfoP != null) {
            c2543e.a0(h(memoryInfoP));
        }
        c2543e.m0(this.f26200c.f());
        DisplayMetrics displayMetricsM = Z.m(this.f26198a, this.f26199b.getLogger());
        if (displayMetricsM != null) {
            c2543e.l0(Integer.valueOf(displayMetricsM.widthPixels));
            c2543e.k0(Integer.valueOf(displayMetricsM.heightPixels));
            c2543e.i0(Float.valueOf(displayMetricsM.density));
            c2543e.j0(Integer.valueOf(displayMetricsM.densityDpi));
        }
        if (c2543e.I() == null) {
            c2543e.W(g());
        }
        List listC = io.sentry.android.core.internal.util.g.a().c();
        if (!listC.isEmpty()) {
            c2543e.h0(Double.valueOf(((Integer) Collections.max(listC)).doubleValue()));
            c2543e.g0(Integer.valueOf(listC.size()));
        }
        return c2543e;
    }

    public final String g() {
        try {
            return i0.a(this.f26198a);
        } catch (Throwable th) {
            this.f26199b.getLogger().b(EnumC2596z2.ERROR, "Error getting installationId.", th);
            return null;
        }
    }

    public final Long h(ActivityManager.MemoryInfo memoryInfo) {
        return Long.valueOf(memoryInfo.totalMem);
    }

    public final boolean i(Object obj) {
        if (obj instanceof io.sentry.hints.a) {
            return "anr_background".equals(((io.sentry.hints.a) obj).g());
        }
        return false;
    }

    @Override // io.sentry.C
    public io.sentry.protocol.B j(io.sentry.protocol.B b8, io.sentry.H h8) {
        return b8;
    }

    public final void k(P1 p8) {
        String str;
        io.sentry.protocol.k kVarF = p8.C().f();
        p8.C().q(d0.i(this.f26198a, this.f26199b).j());
        if (kVarF != null) {
            String strG = kVarF.g();
            if (strG == null || strG.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + strG.trim().toLowerCase(Locale.ROOT);
            }
            p8.C().j(str, kVarF);
        }
    }

    public final void l(P1 p8) {
        io.sentry.protocol.F fQ = p8.Q();
        if (fQ == null) {
            fQ = new io.sentry.protocol.F();
            p8.e0(fQ);
        }
        if (fQ.i() == null) {
            fQ.l(g());
        }
        if (fQ.j() == null && this.f26199b.isSendDefaultPii()) {
            fQ.m("{{auto}}");
        }
    }

    public final boolean m(C2557s2 c2557s2) {
        String str = (String) io.sentry.cache.h.i(this.f26199b, "replay-error-sample-rate.json", String.class);
        if (str == null) {
            return false;
        }
        try {
            if (Double.parseDouble(str) >= io.sentry.util.z.a().d()) {
                return true;
            }
            this.f26199b.getLogger().c(EnumC2596z2.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", c2557s2.G());
            return false;
        } catch (Throwable th) {
            this.f26199b.getLogger().b(EnumC2596z2.ERROR, "Error parsing replay sample rate.", th);
            return false;
        }
    }

    public final void n(P1 p8, Object obj) {
        C2539a c2539aD = p8.C().d();
        if (c2539aD == null) {
            c2539aD = new C2539a();
        }
        c2539aD.o(Z.j(this.f26198a));
        c2539aD.r(Boolean.valueOf(!i(obj)));
        PackageInfo packageInfoR = Z.r(this.f26198a, this.f26200c);
        if (packageInfoR != null) {
            c2539aD.n(packageInfoR.packageName);
        }
        String strJ = p8.J() != null ? p8.J() : (String) io.sentry.cache.h.i(this.f26199b, "release.json", String.class);
        if (strJ != null) {
            try {
                String strSubstring = strJ.substring(strJ.indexOf(64) + 1, strJ.indexOf(43));
                String strSubstring2 = strJ.substring(strJ.indexOf(43) + 1);
                c2539aD.q(strSubstring);
                c2539aD.m(strSubstring2);
            } catch (Throwable unused) {
                this.f26199b.getLogger().c(EnumC2596z2.WARNING, "Failed to parse release from scope cache: %s", strJ);
            }
        }
        try {
            Z.b bVarM = d0.i(this.f26198a, this.f26199b).m();
            if (bVarM != null) {
                c2539aD.t(Boolean.valueOf(bVarM.b()));
                if (bVarM.a() != null) {
                    c2539aD.u(Arrays.asList(bVarM.a()));
                }
            }
        } catch (Throwable th) {
            this.f26199b.getLogger().b(EnumC2596z2.ERROR, "Error getting split apks info.", th);
        }
        p8.C().m(c2539aD);
    }

    public final void o(P1 p8) {
        List list = (List) io.sentry.cache.s.y(this.f26199b, "breadcrumbs.json", List.class, new C2491e.a());
        if (list == null) {
            return;
        }
        if (p8.B() == null) {
            p8.R(new ArrayList(list));
        } else {
            p8.B().addAll(list);
        }
    }

    public final void p(P1 p8) {
        C2541c c2541c = (C2541c) io.sentry.cache.s.x(this.f26199b, "contexts.json", C2541c.class);
        if (c2541c == null) {
            return;
        }
        C2541c c2541cC = p8.C();
        for (Map.Entry entry : new C2541c(c2541c).b()) {
            Object value = entry.getValue();
            if (!"trace".equals(entry.getKey()) || !(value instanceof d3)) {
                if (!c2541cC.a(entry.getKey())) {
                    c2541cC.j((String) entry.getKey(), value);
                }
            }
        }
    }

    public final void r(P1 p8) {
        if (p8.C().e() == null) {
            p8.C().o(f());
        }
    }

    public final void s(P1 p8) {
        String str;
        if (p8.E() == null) {
            p8.T((String) io.sentry.cache.h.i(this.f26199b, "dist.json", String.class));
        }
        if (p8.E() != null || (str = (String) io.sentry.cache.h.i(this.f26199b, "release.json", String.class)) == null) {
            return;
        }
        try {
            p8.T(str.substring(str.indexOf(43) + 1));
        } catch (Throwable unused) {
            this.f26199b.getLogger().c(EnumC2596z2.WARNING, "Failed to parse release from scope cache: %s", str);
        }
    }

    public final void t(P1 p8) {
        if (p8.F() == null) {
            String environment = (String) io.sentry.cache.h.i(this.f26199b, "environment.json", String.class);
            if (environment == null) {
                environment = this.f26199b.getEnvironment();
            }
            p8.U(environment);
        }
    }

    public final void u(C2557s2 c2557s2, Object obj) {
        io.sentry.protocol.i iVar = new io.sentry.protocol.i();
        if (((io.sentry.hints.c) obj).a()) {
            iVar.p("AppExitInfo");
        } else {
            iVar.p("HistoricalAppExitInfo");
        }
        String str = "ANR";
        if (i(obj)) {
            str = "Background ANR";
        }
        ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(str, Thread.currentThread());
        io.sentry.protocol.A aE = e(c2557s2.t0());
        if (aE == null) {
            aE = new io.sentry.protocol.A();
            aE.y(new io.sentry.protocol.z());
        }
        c2557s2.z0(this.f26201d.f(aE, iVar, applicationNotResponding));
    }

    public final void v(P1 p8) {
        Map map = (Map) io.sentry.cache.s.x(this.f26199b, "extras.json", Map.class);
        if (map == null) {
            return;
        }
        if (p8.H() == null) {
            p8.W(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!p8.H().containsKey(entry.getKey())) {
                p8.H().put((String) entry.getKey(), entry.getValue());
            }
        }
    }

    public final void w(C2557s2 c2557s2, Object obj) {
        List list = (List) io.sentry.cache.s.x(this.f26199b, "fingerprint.json", List.class);
        if (c2557s2.p0() == null) {
            c2557s2.A0(list);
        }
        boolean zI = i(obj);
        if (c2557s2.p0() == null) {
            c2557s2.A0(Arrays.asList("{{ default }}", zI ? "background-anr" : "foreground-anr"));
        }
    }

    public final void x(C2557s2 c2557s2) {
        EnumC2596z2 enumC2596z2 = (EnumC2596z2) io.sentry.cache.s.x(this.f26199b, "level.json", EnumC2596z2.class);
        if (c2557s2.q0() == null) {
            c2557s2.B0(enumC2596z2);
        }
    }

    public final void y(P1 p8) {
        Map map = (Map) io.sentry.cache.h.i(this.f26199b, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (p8.N() == null) {
            p8.d0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!p8.N().containsKey(entry.getKey())) {
                p8.c0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public final void z(P1 p8) {
        if (p8.I() == null) {
            p8.X("java");
        }
    }

    public final void q(P1 p8) {
        C2542d c2542dD = p8.D();
        if (c2542dD == null) {
            c2542dD = new C2542d();
        }
        if (c2542dD.c() == null) {
            c2542dD.d(new ArrayList());
        }
        List listC = c2542dD.c();
        if (listC != null) {
            String str = (String) io.sentry.cache.h.i(this.f26199b, SVzBK.QWefUDTTmeCp, String.class);
            if (str != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str);
                listC.add(debugImage);
            }
            p8.S(c2542dD);
        }
    }
}
