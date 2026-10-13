package io.sentry.android.replay.viewhierarchy;

import D6.z;
import Q6.k;
import R0.AbstractC1602n0;
import R0.C1598l0;
import Z6.w;
import android.graphics.Rect;
import android.view.View;
import io.sentry.EnumC2596z2;
import io.sentry.J2;
import io.sentry.android.replay.util.j;
import io.sentry.android.replay.util.n;
import io.sentry.android.replay.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;
import p038e1.AbstractC2248t;
import p038e1.InterfaceC2247s;
import p056g1.F;
import p056g1.h0;
import p110m1.l;
import p110m1.r;
import p128o1.D;
import p128o1.E;
import p128o1.I;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static WeakReference f26925b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f26924a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f26926c = 8;

    public final b a(F f8, b bVar, int i8, boolean z8, J2 j8) {
        D dL;
        I i9;
        p110m1.a aVar;
        k kVar;
        if (!f8.f() || !f8.I0()) {
            return null;
        }
        if (z8) {
            f26925b = new WeakReference(AbstractC2248t.d(f8.g()));
        }
        p110m1.k kVarG = f8.G();
        InterfaceC2247s interfaceC2247sG = f8.g();
        WeakReference weakReference = f26925b;
        Rect rectA = j.a(interfaceC2247sG, weakReference != null ? (InterfaceC2247s) weakReference.get() : null);
        boolean z9 = false;
        boolean z10 = !f8.k0().v2() && (kVarG == null || !kVarG.o(r.f29573a.l())) && rectA.height() > 0 && rectA.width() > 0;
        boolean z11 = kVarG != null && kVarG.o(p110m1.j.f29521a.w());
        if ((kVarG != null && kVarG.o(r.f29573a.z())) || z11) {
            boolean z12 = z10 && d(f8, false, j8);
            if (bVar != null) {
                bVar.g(true);
            }
            ArrayList arrayList = new ArrayList();
            if (kVarG != null && (aVar = (p110m1.a) l.a(kVarG, p110m1.j.f29521a.h())) != null && (kVar = (k) aVar.a()) != null) {
            }
            io.sentry.android.replay.util.l lVarC = j.c(f8);
            C1598l0 c1598l0A = lVarC.a();
            boolean zB = lVarC.b();
            E e8 = (E) z.k0(arrayList);
            C1598l0 c1598l0G = (e8 == null || (dL = e8.l()) == null || (i9 = dL.i()) == null) ? null : C1598l0.g(i9.h());
            if (c1598l0G == null || c1598l0G.y() != C1598l0.f9405b.e()) {
                c1598l0A = c1598l0G;
            }
            io.sentry.android.replay.util.b bVar2 = (arrayList.isEmpty() || z11) ? null : new io.sentry.android.replay.util.b((E) z.i0(arrayList), zB);
            Integer numValueOf = c1598l0A != null ? Integer.valueOf(n.g(AbstractC1602n0.j(c1598l0A.y()))) : null;
            float f9 = rectA.left;
            float f10 = rectA.top;
            int iR0 = f8.r0();
            float fA = 0.0f;
            int iN = f8.N();
            if (bVar != null) {
                fA = bVar.a();
            }
            return new b.d(bVar2, numValueOf, 0, 0, f9, f10, iR0, iN, fA, i8, bVar, z12, true, z10, rectA, 12, null);
        }
        U0.b bVarB = j.b(f8);
        if (bVarB == null) {
            float fA2 = 0.0f;
            if (z10 && d(f8, false, j8)) {
                z9 = true;
            }
            float f11 = rectA.left;
            float f12 = rectA.top;
            int iR1 = f8.r0();
            int iN2 = f8.N();
            if (bVar != null) {
                fA2 = bVar.a();
            }
            return new b.C0600b(f11, f12, iR1, iN2, fA2, i8, bVar, z9, false, z10, rectA);
        }
        boolean z13 = z10 && d(f8, true, j8);
        if (bVar != null) {
            bVar.g(true);
        }
        float f13 = rectA.left;
        float f14 = rectA.top;
        float fA3 = 0.0f;
        int iR2 = f8.r0();
        boolean z14 = z13;
        int iN3 = f8.N();
        if (bVar != null) {
            fA3 = bVar.a();
        }
        if (z14 && j.d(bVarB)) {
            z9 = true;
        }
        return new b.c(f13, f14, iR2, iN3, fA3, i8, bVar, z9, true, z10, rectA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(View view, b bVar, J2 options) {
        F root;
        t.g(view, "view");
        t.g(options, "options");
        String name = view.getClass().getName();
        t.f(name, "view::class.java.name");
        if (!w.M(name, "AndroidComposeView", false, 2, null) || bVar == null) {
            return false;
        }
        try {
            h0 h0Var = view instanceof h0 ? (h0) view : null;
            if (h0Var != null && (root = h0Var.getRoot()) != null) {
                e(root, bVar, true, options);
                return true;
            }
            return false;
        } catch (Throwable th) {
            options.getLogger().a(EnumC2596z2.ERROR, th, "Error traversing Compose tree. Most likely you're using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it's a newer\nversion, please open a github issue with the version you're using, so we can add\nsupport for it.", new Object[0]);
            return false;
        }
    }

    public final String c(F f8, boolean z8) {
        if (z8) {
            return "android.widget.ImageView";
        }
        p110m1.k kVarG = f8.G();
        if (kVarG != null && kVarG.o(r.f29573a.z())) {
            return "android.widget.TextView";
        }
        p110m1.k kVarG2 = f8.G();
        return (kVarG2 == null || !kVarG2.o(p110m1.j.f29521a.w())) ? "android.view.View" : "android.widget.TextView";
    }

    public final boolean d(F f8, boolean z8, J2 j8) {
        p110m1.k kVarG = f8.G();
        String str = kVarG != null ? (String) l.a(kVarG, v.f26897a.a()) : null;
        if (t.c(str, "unmask")) {
            return false;
        }
        if (t.c(str, "mask")) {
            return true;
        }
        String strC = c(f8, z8);
        if (j8.getSessionReplay().m().contains(strC)) {
            return false;
        }
        return j8.getSessionReplay().e().contains(strC);
    }

    public final void e(F f8, b bVar, boolean z8, J2 j8) {
        List listF = f8.F();
        if (listF.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(listF.size());
        int size = listF.size();
        int i8 = 0;
        while (i8 < size) {
            F f9 = (F) listF.get(i8);
            b bVar2 = bVar;
            boolean z9 = z8;
            J2 j9 = j8;
            b bVarA = a(f9, bVar2, i8, z9, j9);
            if (bVarA != null) {
                arrayList.add(bVarA);
                e(f9, bVarA, false, j9);
            }
            i8++;
            bVar = bVar2;
            z8 = z9;
            j8 = j9;
        }
        bVar.f(arrayList);
    }
}
