package p082j0;

import C6.G;
import H0.c;
import L0.i;
import Q6.o;
import Q6.p;
import kotlin.jvm.internal.u;
import p038e1.H;
import p038e1.I;
import p038e1.h0;
import p038e1.j0;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: renamed from: j0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2604h {

    /* JADX INFO: renamed from: j0.h$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ H f28001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f28002b;

        /* JADX INFO: renamed from: j0.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0610a extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p f28003a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C2606j f28004b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0610a(p pVar, C2606j c2606j) {
                super(2);
                this.f28003a = pVar;
                this.f28004b = c2606j;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1945019079, i8, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
                }
                this.f28003a.invoke(this.f28004b, interfaceC3163l, 0);
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
        public a(H h8, p pVar) {
            super(2);
            this.f28001a = h8;
            this.f28002b = pVar;
        }

        public final I b(j0 j0Var, long j8) {
            return this.f28001a.d(j0Var, j0Var.M(G.f1419a, c.c(-1945019079, true, new C0610a(this.f28002b, new C2606j(j0Var, j8, null)))), j8);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((j0) obj, ((A1.b) obj2).s());
        }
    }

    /* JADX INFO: renamed from: j0.h$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f28005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L0.c f28006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f28007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p f28008d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f28009e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f28010f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, L0.c cVar, boolean z8, p pVar, int i8, int i9) {
            super(2);
            this.f28005a = iVar;
            this.f28006b = cVar;
            this.f28007c = z8;
            this.f28008d = pVar;
            this.f28009e = i8;
            this.f28010f = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            AbstractC2604h.a(this.f28005a, this.f28006b, this.f28007c, this.f28008d, interfaceC3163l, F0.a(this.f28009e | 1), this.f28010f);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(i iVar, L0.c cVar, boolean z8, p pVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1781813501);
        int i11 = i9 & 1;
        if (i11 != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.R(iVar) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        int i12 = i9 & 2;
        if (i12 != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= interfaceC3163lP.R(cVar) ? 32 : 16;
        }
        int i13 = i9 & 4;
        if (i13 != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            i10 |= interfaceC3163lP.c(z8) ? 256 : 128;
        }
        if ((i9 & 8) != 0) {
            i10 |= 3072;
        } else if ((i8 & 7168) == 0) {
            i10 |= interfaceC3163lP.l(pVar) ? 2048 : 1024;
        }
        if ((i10 & 5851) == 1170 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (i11 != 0) {
                iVar = i.f4836a;
            }
            if (i12 != 0) {
                cVar = L0.c.f4806a.m();
            }
            if (i13 != 0) {
                z8 = false;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1781813501, i10, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:64)");
            }
            H hG = AbstractC2601e.g(cVar, z8, interfaceC3163lP, (i10 >> 3) & 126);
            interfaceC3163lP.f(1021372304);
            boolean zL = interfaceC3163lP.l(pVar) | interfaceC3163lP.R(hG);
            Object objG = interfaceC3163lP.g();
            if (zL || objG == InterfaceC3163l.f38803a.a()) {
                objG = new a(hG, pVar);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            h0.a(iVar, (o) objG, interfaceC3163lP, i10 & 14, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        i iVar2 = iVar;
        L0.c cVar2 = cVar;
        boolean z9 = z8;
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(iVar2, cVar2, z9, pVar, i8, i9));
        }
    }
}
