package p038e1;

import C6.G;
import H0.c;
import L0.h;
import L0.i;
import Q6.o;
import Q6.p;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p056g1.InterfaceC2343g;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.R0;
import p215z0.v1;

/* JADX INFO: renamed from: e1.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2252x {

    /* JADX INFO: renamed from: e1.x$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f20542a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list) {
            super(2);
            this.f20542a = list;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1953651383, i8, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:180)");
            }
            List list = this.f20542a;
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                o oVar = (o) list.get(i9);
                int iA = AbstractC3157i.a(interfaceC3163l, 0);
                InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
                Function0 function0F = aVar.f();
                interfaceC3163l.f(-692256719);
                if (interfaceC3163l.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163l.r();
                if (interfaceC3163l.m()) {
                    interfaceC3163l.w(function0F);
                } else {
                    interfaceC3163l.G();
                }
                InterfaceC3163l interfaceC3163lA = v1.a(interfaceC3163l);
                o oVarB = aVar.b();
                if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                oVar.invoke(interfaceC3163l, 0);
                interfaceC3163l.O();
                interfaceC3163l.N();
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

    /* JADX INFO: renamed from: e1.x$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f20543a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar) {
            super(3);
            this.f20543a = iVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, InterfaceC3163l interfaceC3163l2, int i8) {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1586257396, i8, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:203)");
            }
            int iA = AbstractC3157i.a(interfaceC3163l2, 0);
            i iVarC = h.c(interfaceC3163l2, this.f20543a);
            interfaceC3163l.f(509942095);
            InterfaceC3163l interfaceC3163lA = v1.a(interfaceC3163l);
            InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
            v1.b(interfaceC3163lA, iVarC, aVar.d());
            o oVarB = aVar.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            interfaceC3163l.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b(((R0) obj).f(), (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    public static final o a(List list) {
        return c.c(-1953651383, true, new a(list));
    }

    public static final p b(i iVar) {
        return c.c(-1586257396, true, new b(iVar));
    }
}
