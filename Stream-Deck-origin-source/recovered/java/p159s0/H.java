package p159s0;

import D6.C0937q;
import D6.r;
import Q0.g;
import Q0.h;
import Q0.l;
import Q6.k;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p038e1.InterfaceC2247s;
import p128o1.G;
import p143q0.X;
import p176u1.C3018b;
import p176u1.D;
import p176u1.InterfaceC3027k;
import p176u1.L;
import p176u1.M;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC2880b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final M f32664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final X f32665k;

    public /* synthetic */ H(M m8, D d8, X x8, L l8, int i8, AbstractC2633k abstractC2633k) {
        this(m8, (i8 & 2) != 0 ? D.f34350a.a() : d8, x8, (i8 & 8) != 0 ? new L() : l8);
    }

    public final List Y(k kVar) {
        if (!G.h(u())) {
            return r.q(new C3018b("", 0), new L(G.l(u()), G.l(u())));
        }
        InterfaceC3027k interfaceC3027k = (InterfaceC3027k) kVar.invoke(this);
        if (interfaceC3027k != null) {
            return C0937q.e(interfaceC3027k);
        }
        return null;
    }

    public final M Z() {
        return M.d(this.f32664j, e(), u(), null, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    public final int a0(X x8, int i8) {
        h hVarA;
        InterfaceC2247s interfaceC2247sC = x8.c();
        if (interfaceC2247sC != null) {
            InterfaceC2247s interfaceC2247sB = x8.b();
            hVarA = interfaceC2247sB != null ? InterfaceC2247s.t(interfaceC2247sB, interfaceC2247sC, false, 2, null) : null;
            if (hVarA == null) {
                hVarA = h.f9087e.a();
            }
        } else {
            hVarA = h.f9087e.a();
        }
        h hVarE = x8.f().e(p().b(G.i(this.f32664j.g())));
        return p().a(x8.f().x(g.a(hVarE.i(), hVarE.l() + (l.g(hVarA.k()) * i8))));
    }

    public final H b0() {
        X x8;
        if (w().length() > 0 && (x8 = this.f32665k) != null) {
            T(a0(x8, 1));
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final H c0() {
        X x8;
        if (w().length() > 0 && (x8 = this.f32665k) != null) {
            T(a0(x8, -1));
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public H(M m8, D d8, X x8, L l8) {
        super(m8.e(), m8.g(), x8 != null ? x8.f() : null, d8, l8, null);
        this.f32664j = m8;
        this.f32665k = x8;
    }
}
