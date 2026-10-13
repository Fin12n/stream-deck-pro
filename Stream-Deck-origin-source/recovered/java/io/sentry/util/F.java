package io.sentry.util;

import io.sentry.C2487d;
import io.sentry.C2505h1;
import io.sentry.C2533o1;
import io.sentry.E0;
import io.sentry.InterfaceC2549q1;
import io.sentry.J2;
import io.sentry.V;
import io.sentry.X;
import io.sentry.r3;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class F {
    public static /* synthetic */ void c(V v8, J2 j8, C2505h1 c2505h1) {
        C2487d c2487dA = c2505h1.a();
        if (c2487dA.s()) {
            c2487dA.L(v8, j8);
            c2487dA.b();
        }
    }

    public static C2487d d(C2487d c2487d, r3 r3Var) {
        return e(c2487d, r3Var == null ? null : r3Var.e(), r3Var == null ? null : r3Var.d(), r3Var != null ? r3Var.c() : null);
    }

    public static C2487d e(C2487d c2487d, Boolean bool, Double d8, Double d9) {
        if (c2487d == null) {
            c2487d = new C2487d(E0.e());
        }
        if (c2487d.i() == null) {
            Double dL = c2487d.l();
            if (dL != null) {
                d8 = dL;
            }
            c2487d.F(y.b(d9, d8, bool));
        }
        if (c2487d.s() && c2487d.t()) {
            c2487d.b();
        }
        return c2487d;
    }

    public static boolean f(List list, String str) {
        if (str != null && list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((io.sentry.F) it.next()).a().equalsIgnoreCase(str)) {
                    return true;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    if (((io.sentry.F) it2.next()).b(str)) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return false;
    }

    public static C2505h1 g(final V v8, final J2 j8) {
        return v8.C(new C2533o1.a() { // from class: io.sentry.util.C
            @Override // io.sentry.C2533o1.a
            public final void a(C2505h1 c2505h1) {
                F.c(v8, j8, c2505h1);
            }
        });
    }

    public static void h(X x8) {
        x8.u(new InterfaceC2549q1() { // from class: io.sentry.util.D
            @Override // io.sentry.InterfaceC2549q1
            public final void a(V v8) {
                v8.C(new C2533o1.a() { // from class: io.sentry.util.E
                    @Override // io.sentry.C2533o1.a
                    public final void a(C2505h1 c2505h1) {
                        v8.M(new C2505h1());
                    }
                });
            }
        });
    }
}
