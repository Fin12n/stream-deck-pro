package p137p2;

import C6.G;
import Q6.k;
import Q6.o;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.InterfaceC1730m;
import androidx.lifecycle.InterfaceC1733p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.H;
import p215z0.I;
import p215z0.InterfaceC3163l;
import p215z0.K;
import p215z0.P0;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1733p f31136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1726i.a f31137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q1 f31138c;

        /* JADX INFO: renamed from: p2.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0668a implements H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1733p f31139a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1730m f31140b;

            public C0668a(InterfaceC1733p interfaceC1733p, InterfaceC1730m interfaceC1730m) {
                this.f31139a = interfaceC1733p;
                this.f31140b = interfaceC1730m;
            }

            @Override // p215z0.H
            public void d() {
                this.f31139a.w().d(this.f31140b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1733p interfaceC1733p, AbstractC1726i.a aVar, q1 q1Var) {
            super(1);
            this.f31136a = interfaceC1733p;
            this.f31137b = aVar;
            this.f31138c = q1Var;
        }

        public static final void d(AbstractC1726i.a aVar, q1 q1Var, InterfaceC1733p interfaceC1733p, AbstractC1726i.a aVar2) {
            if (aVar2 == aVar) {
                c.b(q1Var).invoke();
            }
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final H invoke(I i8) {
            final AbstractC1726i.a aVar = this.f31137b;
            final q1 q1Var = this.f31138c;
            InterfaceC1730m interfaceC1730m = new InterfaceC1730m() { // from class: p2.b
                @Override // androidx.lifecycle.InterfaceC1730m
                public final void j(InterfaceC1733p interfaceC1733p, AbstractC1726i.a aVar2) {
                    c.a.d(aVar, q1Var, interfaceC1733p, aVar2);
                }
            };
            this.f31136a.w().a(interfaceC1730m);
            return new C0668a(this.f31136a, interfaceC1730m);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1726i.a f31141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1733p f31142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f31143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f31144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f31145e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC1726i.a aVar, InterfaceC1733p interfaceC1733p, Function0 function0, int i8, int i9) {
            super(2);
            this.f31141a = aVar;
            this.f31142b = interfaceC1733p;
            this.f31143c = function0;
            this.f31144d = i8;
            this.f31145e = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            c.a(this.f31141a, this.f31142b, this.f31143c, interfaceC3163l, F0.a(this.f31144d | 1), this.f31145e);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(AbstractC1726i.a aVar, InterfaceC1733p interfaceC1733p, Function0 function0, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-709389590);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 6) == 0) {
            i10 = (interfaceC3163lP.R(aVar) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            i10 |= ((i9 & 2) == 0 && interfaceC3163lP.l(interfaceC1733p)) ? 32 : 16;
        }
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else if ((i8 & 384) == 0) {
            i10 |= interfaceC3163lP.l(function0) ? 256 : 128;
        }
        if ((i10 & 147) == 146 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0 && !interfaceC3163lP.F()) {
                interfaceC3163lP.z();
                if ((i9 & 2) != 0) {
                    i10 &= -113;
                }
            } else if ((i9 & 2) != 0) {
                interfaceC1733p = (InterfaceC1733p) interfaceC3163lP.e(d.a());
                i10 &= -113;
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-709389590, i10, -1, "androidx.lifecycle.compose.LifecycleEventEffect (LifecycleEffect.kt:57)");
            }
            if (aVar == AbstractC1726i.a.ON_DESTROY) {
                throw new IllegalArgumentException("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
            }
            q1 q1VarP = g1.p(function0, interfaceC3163lP, (i10 >> 6) & 14);
            interfaceC3163lP.f(380955345);
            boolean zR = ((i10 & 14) == 4) | interfaceC3163lP.R(q1VarP) | interfaceC3163lP.l(interfaceC1733p);
            Object objG = interfaceC3163lP.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                objG = new a(interfaceC1733p, aVar, q1VarP);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            K.a(interfaceC1733p, (k) objG, interfaceC3163lP, (i10 >> 3) & 14);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        InterfaceC1733p interfaceC1733p2 = interfaceC1733p;
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(aVar, interfaceC1733p2, function0, i8, i9));
        }
    }

    public static final Function0 b(q1 q1Var) {
        return (Function0) q1Var.getValue();
    }
}
