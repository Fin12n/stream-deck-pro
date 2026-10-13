package J3;

import C6.G;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.InterfaceC2247s;
import p191w0.O;
import p191w0.Z;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.P0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f4282a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3164l0 interfaceC3164l0) {
            super(1);
            this.f4282a = interfaceC3164l0;
        }

        public final void b(InterfaceC2247s it) {
            t.g(it, "it");
            o.c(this.f4282a, it.a());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((InterfaceC2247s) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f4283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f4284b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f8, float f9) {
            super(2);
            this.f4283a = f8;
            this.f4284b = f9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(742132020, i8, -1, "com.elgato.streamdeck.ui.components.LockView.<anonymous> (LockView.kt:47)");
            }
            O.a(p101l1.c.d(p154r3.h.f32477a0, interfaceC3163l, 0), null, androidx.compose.foundation.layout.e.i(androidx.compose.foundation.c.b(O0.f.a(androidx.compose.foundation.layout.e.i(L0.i.f4836a, this.f4283a), p135p0.g.f()), Z.f35786a.a(interfaceC3163l, Z.f35787b).v(), null, 2, null), A1.h.m(this.f4284b * 0.04f)), I3.f.d((p014b4.c) interfaceC3163l.e(p014b4.b.a())), interfaceC3163l, 56, 0);
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L0.i f4285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f4286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f4287c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(L0.i iVar, int i8, int i9) {
            super(2);
            this.f4285a = iVar;
            this.f4286b = i8;
            this.f4287c = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            o.a(this.f4285a, interfaceC3163l, F0.a(this.f4286b | 1), this.f4287c);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(L0.i iVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        L0.i iVar2;
        int i10;
        L0.i iVar3;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-172191783);
        int i11 = i9 & 1;
        if (i11 != 0) {
            i10 = i8 | 6;
            iVar2 = iVar;
        } else if ((i8 & 14) == 0) {
            iVar2 = iVar;
            i10 = (interfaceC3163lP.R(iVar2) ? 4 : 2) | i8;
        } else {
            iVar2 = iVar;
            i10 = i8;
        }
        if ((i10 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
            iVar3 = iVar2;
        } else {
            L0.i iVar4 = i11 != 0 ? L0.i.f4836a : iVar2;
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-172191783, i10, -1, "com.elgato.streamdeck.ui.components.LockView (LockView.kt:34)");
            }
            interfaceC3163lP.f(-876904120);
            Object objG = interfaceC3163lP.g();
            InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
            if (objG == aVar.a()) {
                objG = l1.e(A1.r.b(A1.r.f455b.a()), null, 2, null);
                interfaceC3163lP.H(objG);
            }
            InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG;
            interfaceC3163lP.N();
            float fM = A1.h.m(Math.max(A1.h.m(A1.r.g(b(interfaceC3164l0))), A1.h.m(A1.r.f(b(interfaceC3164l0)))));
            float fM2 = A1.h.m(0.02f * fM);
            long jC = I3.f.c((p014b4.c) interfaceC3163lP.e(p014b4.b.a()));
            interfaceC3163lP.f(-876903843);
            Object objG2 = interfaceC3163lP.g();
            if (objG2 == aVar.a()) {
                objG2 = new a(interfaceC3164l0);
                interfaceC3163lP.H(objG2);
            }
            interfaceC3163lP.N();
            iVar3 = iVar4;
            p191w0.F0.a(androidx.compose.ui.layout.c.a(iVar4, (Q6.k) objG2), p135p0.g.f(), jC, 0L, 0.0f, 0.0f, null, H0.c.b(interfaceC3163lP, 742132020, true, new b(fM2, fM)), interfaceC3163lP, 12582912, 120);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(iVar3, i8, i9));
        }
    }

    public static final long b(InterfaceC3164l0 interfaceC3164l0) {
        return ((A1.r) interfaceC3164l0.getValue()).j();
    }

    public static final void c(InterfaceC3164l0 interfaceC3164l0, long j8) {
        interfaceC3164l0.setValue(A1.r.b(j8));
    }
}
