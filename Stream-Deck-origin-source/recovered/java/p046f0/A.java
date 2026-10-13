package p046f0;

import C6.G;
import C6.v;
import L0.i;
import Q6.k;
import kotlin.jvm.internal.u;
import p038e1.InterfaceC2247s;
import p047f1.g;
import p047f1.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class A extends i.c implements h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k f21238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k f21239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f21240p;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {
        public a() {
            super(1);
        }

        public final void b(InterfaceC2247s interfaceC2247s) {
            if (A.this.K1()) {
                A.this.e2().invoke(interfaceC2247s);
                k kVarF2 = A.this.f2();
                if (kVarF2 != null) {
                    kVarF2.invoke(interfaceC2247s);
                }
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((InterfaceC2247s) obj);
            return G.f1419a;
        }
    }

    public A(k kVar) {
        this.f21238n = kVar;
        a aVar = new a();
        this.f21239o = aVar;
        this.f21240p = p047f1.i.b(v.a(AbstractC2296y.a(), aVar));
    }

    public final k e2() {
        return this.f21238n;
    }

    public final k f2() {
        if (K1()) {
            return (k) u(AbstractC2296y.a());
        }
        return null;
    }

    @Override // p047f1.h
    public g u0() {
        return this.f21240p;
    }
}
