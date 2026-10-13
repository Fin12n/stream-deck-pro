package p162s3;

import A1.h;
import C6.G;
import J3.n;
import N3.f;
import P3.i;
import Q6.k;
import Q6.p;
import androidx.compose.foundation.c;
import androidx.compose.foundation.d;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p065h1.I0;
import p082j0.InterfaceC2608l;
import p191w0.AbstractC3079p0;
import p191w0.AbstractC3085t;
import p191w0.Z;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f33067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f33068c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f33069d;

        /* JADX INFO: renamed from: s3.o$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0750a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k f33070a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f.b f33071b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0750a(k kVar, f.b bVar) {
                super(0);
                this.f33070a = kVar;
                this.f33071b = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m262invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m262invoke() {
                this.f33070a.invoke(this.f33071b);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f33072a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f.b f33073b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f33074c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z8, f.b bVar, String str) {
                super(2);
                this.f33072a = z8;
                this.f33073b = bVar;
                this.f33074c = str;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(334650072, i8, -1, "com.elgato.streamdeck.discovery.UnknownHostsCard.<anonymous>.<anonymous>.<anonymous> (UnknownHostsCard.kt:44)");
                }
                if (this.f33072a) {
                    String strJ = this.f33073b.j();
                    String str = this.f33074c;
                    if (str == null ? false : i.d(str, strJ)) {
                        AbstractC3079p0.a(I0.a(androidx.compose.foundation.layout.f.l(L0.i.f4836a, h.m(24)), "host_row_pairing_indicator"), 0L, 0.0f, 0L, 0, interfaceC3163l, 6, 30);
                    }
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((InterfaceC3163l) obj, ((Number) obj2).intValue());
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, List list, Function0 function0, k kVar) {
            super(3);
            this.f33066a = str;
            this.f33067b = list;
            this.f33068c = function0;
            this.f33069d = kVar;
        }

        public final void b(InterfaceC2608l Card, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(Card, "$this$Card");
            if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-347242794, i8, -1, "com.elgato.streamdeck.discovery.UnknownHostsCard.<anonymous> (UnknownHostsCard.kt:37)");
            }
            boolean z8 = this.f33066a != null;
            interfaceC3163l.f(1762583001);
            List<f.b> list = this.f33067b;
            k kVar = this.f33069d;
            String str = this.f33066a;
            for (f.b bVar : list) {
                boolean z9 = bVar.t() && !z8;
                String strE = bVar.e();
                L0.i iVarB = c.b(I0.a(L0.i.f4836a, I3.a.f3771a.d(bVar.e())), Z.f35786a.a(interfaceC3163l, Z.f35787b).G(), null, 2, null);
                interfaceC3163l.f(-1156531145);
                boolean zR = interfaceC3163l.R(kVar) | interfaceC3163l.R(bVar);
                Object objG = interfaceC3163l.g();
                if (zR || objG == InterfaceC3163l.f38803a.a()) {
                    objG = new C0750a(kVar, bVar);
                    interfaceC3163l.H(objG);
                }
                interfaceC3163l.N();
                e.a(strE, d.e(iVarB, z9, null, null, (Function0) objG, 6, null), null, z9, null, null, H0.c.b(interfaceC3163l, 334650072, true, new b(z8, bVar, str)), interfaceC3163l, 1572864, 52);
            }
            interfaceC3163l.N();
            e.a(p101l1.f.b(p194w3.b.f37059t, interfaceC3163l, 0), I0.a(d.e(c.b(L0.i.f4836a, Z.f35786a.a(interfaceC3163l, Z.f35787b).G(), null, 2, null), !z8, null, null, this.f33068c, 6, null), "scan_code"), null, !z8, null, p162s3.b.f32885a.a(), null, interfaceC3163l, 196608, 84);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((InterfaceC2608l) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f33075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f33077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f33078d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ L0.i f33079e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f33080f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f33081g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list, String str, k kVar, Function0 function0, L0.i iVar, int i8, int i9) {
            super(2);
            this.f33075a = list;
            this.f33076b = str;
            this.f33077c = kVar;
            this.f33078d = function0;
            this.f33079e = iVar;
            this.f33080f = i8;
            this.f33081g = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            o.a(this.f33075a, this.f33076b, this.f33077c, this.f33078d, this.f33079e, interfaceC3163l, F0.a(this.f33080f | 1), this.f33081g);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(List unknownHosts, String str, k onAuthenticate, Function0 onAddComputer, L0.i iVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        t.g(unknownHosts, "unknownHosts");
        t.g(onAuthenticate, "onAuthenticate");
        t.g(onAddComputer, "onAddComputer");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-2120621816);
        L0.i iVar2 = (i9 & 16) != 0 ? L0.i.f4836a : iVar;
        if (AbstractC3169o.K()) {
            i10 = i8;
            AbstractC3169o.W(-2120621816, i10, -1, "com.elgato.streamdeck.discovery.UnknownHostsCard (UnknownHostsCard.kt:31)");
        } else {
            i10 = i8;
        }
        n.a(p194w3.b.f36940D, null, interfaceC3163lP, 0, 2);
        AbstractC3085t.a(I0.a(iVar2, "card_unknownHosts"), null, null, null, null, H0.c.b(interfaceC3163lP, -347242794, true, new a(str, unknownHosts, onAddComputer, onAuthenticate)), interfaceC3163lP, 196608, 30);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(unknownHosts, str, onAuthenticate, onAddComputer, iVar2, i10, i9));
        }
    }
}
