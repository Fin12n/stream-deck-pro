package p056g1;

import C6.G;
import D6.M;
import Q0.f;
import Q0.g;
import Q6.k;
import S6.c;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2230a;
import p038e1.AbstractC2231b;
import p038e1.C2241l;

/* JADX INFO: renamed from: g1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2337a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2338b f23552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC2338b f23559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f23560i;

    /* JADX INFO: renamed from: g1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0545a extends u implements k {
        public C0545a() {
            super(1);
        }

        public final void b(InterfaceC2338b interfaceC2338b) {
            if (interfaceC2338b.f()) {
                if (interfaceC2338b.c().g()) {
                    interfaceC2338b.R();
                }
                Map map = interfaceC2338b.c().f23560i;
                AbstractC2337a abstractC2337a = AbstractC2337a.this;
                for (Map.Entry entry : map.entrySet()) {
                    abstractC2337a.c((AbstractC2230a) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC2338b.q());
                }
                X xK2 = interfaceC2338b.q().k2();
                t.d(xK2);
                while (!t.c(xK2, AbstractC2337a.this.f().q())) {
                    Set<AbstractC2230a> setKeySet = AbstractC2337a.this.e(xK2).keySet();
                    AbstractC2337a abstractC2337a2 = AbstractC2337a.this;
                    for (AbstractC2230a abstractC2230a : setKeySet) {
                        abstractC2337a2.c(abstractC2230a, abstractC2337a2.i(xK2, abstractC2230a), xK2);
                    }
                    xK2 = xK2.k2();
                    t.d(xK2);
                }
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((InterfaceC2338b) obj);
            return G.f1419a;
        }
    }

    public /* synthetic */ AbstractC2337a(InterfaceC2338b interfaceC2338b, AbstractC2633k abstractC2633k) {
        this(interfaceC2338b);
    }

    public final void c(AbstractC2230a abstractC2230a, int i8, X x8) {
        float f8 = i8;
        long jA = g.a(f8, f8);
        while (true) {
            jA = d(x8, jA);
            x8 = x8.k2();
            t.d(x8);
            if (t.c(x8, this.f23552a.q())) {
                break;
            } else if (e(x8).containsKey(abstractC2230a)) {
                float fI = i(x8, abstractC2230a);
                jA = g.a(fI, fI);
            }
        }
        int iD = abstractC2230a instanceof C2241l ? c.d(f.p(jA)) : c.d(f.o(jA));
        Map map = this.f23560i;
        if (map.containsKey(abstractC2230a)) {
            iD = AbstractC2231b.c(abstractC2230a, ((Number) M.h(this.f23560i, abstractC2230a)).intValue(), iD);
        }
        map.put(abstractC2230a, Integer.valueOf(iD));
    }

    public abstract long d(X x8, long j8);

    public abstract Map e(X x8);

    public final InterfaceC2338b f() {
        return this.f23552a;
    }

    public final boolean g() {
        return this.f23553b;
    }

    public final Map h() {
        return this.f23560i;
    }

    public abstract int i(X x8, AbstractC2230a abstractC2230a);

    public final boolean j() {
        return this.f23554c || this.f23556e || this.f23557f || this.f23558g;
    }

    public final boolean k() {
        o();
        return this.f23559h != null;
    }

    public final boolean l() {
        return this.f23555d;
    }

    public final void m() {
        this.f23553b = true;
        InterfaceC2338b interfaceC2338bU = this.f23552a.u();
        if (interfaceC2338bU == null) {
            return;
        }
        if (this.f23554c) {
            interfaceC2338bU.V();
        } else if (this.f23556e || this.f23555d) {
            interfaceC2338bU.requestLayout();
        }
        if (this.f23557f) {
            this.f23552a.V();
        }
        if (this.f23558g) {
            this.f23552a.requestLayout();
        }
        interfaceC2338bU.c().m();
    }

    public final void n() {
        this.f23560i.clear();
        this.f23552a.P(new C0545a());
        this.f23560i.putAll(e(this.f23552a.q()));
        this.f23553b = false;
    }

    public final void o() {
        InterfaceC2338b interfaceC2338b;
        AbstractC2337a abstractC2337aC;
        AbstractC2337a abstractC2337aC2;
        if (j()) {
            interfaceC2338b = this.f23552a;
        } else {
            InterfaceC2338b interfaceC2338bU = this.f23552a.u();
            if (interfaceC2338bU == null) {
                return;
            }
            interfaceC2338b = interfaceC2338bU.c().f23559h;
            if (interfaceC2338b == null || !interfaceC2338b.c().j()) {
                InterfaceC2338b interfaceC2338b2 = this.f23559h;
                if (interfaceC2338b2 == null || interfaceC2338b2.c().j()) {
                    return;
                }
                InterfaceC2338b interfaceC2338bU2 = interfaceC2338b2.u();
                if (interfaceC2338bU2 != null && (abstractC2337aC2 = interfaceC2338bU2.c()) != null) {
                    abstractC2337aC2.o();
                }
                InterfaceC2338b interfaceC2338bU3 = interfaceC2338b2.u();
                interfaceC2338b = (interfaceC2338bU3 == null || (abstractC2337aC = interfaceC2338bU3.c()) == null) ? null : abstractC2337aC.f23559h;
            }
        }
        this.f23559h = interfaceC2338b;
    }

    public final void p() {
        this.f23553b = true;
        this.f23554c = false;
        this.f23556e = false;
        this.f23555d = false;
        this.f23557f = false;
        this.f23558g = false;
        this.f23559h = null;
    }

    public final void q(boolean z8) {
        this.f23556e = z8;
    }

    public final void r(boolean z8) {
        this.f23558g = z8;
    }

    public final void s(boolean z8) {
        this.f23557f = z8;
    }

    public final void t(boolean z8) {
        this.f23555d = z8;
    }

    public final void u(boolean z8) {
        this.f23554c = z8;
    }

    public AbstractC2337a(InterfaceC2338b interfaceC2338b) {
        this.f23552a = interfaceC2338b;
        this.f23553b = true;
        this.f23560i = new HashMap();
    }
}
