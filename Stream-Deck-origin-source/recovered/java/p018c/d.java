package p018c;

import C6.G;
import Q6.k;
import Q6.o;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC1733p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p009b.B;
import p009b.C;
import p009b.F;
import p215z0.H;
import p215z0.I;
import p215z0.InterfaceC3163l;
import p215z0.K;
import p215z0.P0;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0400d f16005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f16006b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0400d c0400d, boolean z8) {
            super(0);
            this.f16005a = c0400d;
            this.f16006b = z8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m94invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m94invoke() {
            this.f16005a.j(this.f16006b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C f16007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1733p f16008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C0400d f16009c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C0400d f16010a;

            public a(C0400d c0400d) {
                this.f16010a = c0400d;
            }

            @Override // p215z0.H
            public void d() {
                this.f16010a.h();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C c8, InterfaceC1733p interfaceC1733p, C0400d c0400d) {
            super(1);
            this.f16007a = c8;
            this.f16008b = interfaceC1733p;
            this.f16009c = c0400d;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H invoke(I i8) {
            this.f16007a.h(this.f16008b, this.f16009c);
            return new a(this.f16009c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f16011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f16012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f16013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f16014d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z8, Function0 function0, int i8, int i9) {
            super(2);
            this.f16011a = z8;
            this.f16012b = function0;
            this.f16013c = i8;
            this.f16014d = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            d.a(this.f16011a, this.f16012b, interfaceC3163l, this.f16013c | 1, this.f16014d);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: c.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0400d extends B {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q1 f16015d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0400d(boolean z8, q1 q1Var) {
            super(z8);
            this.f16015d = q1Var;
        }

        @Override // p009b.B
        public void d() {
            d.b(this.f16015d).invoke();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(boolean z8, Function0 function0, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-361453782);
        int i11 = i9 & 1;
        if (i11 != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 6) == 0) {
            i10 = (interfaceC3163lP.c(z8) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 48) == 0) {
            i10 |= interfaceC3163lP.R(function0) ? 32 : 16;
        }
        if ((i10 & 19) == 18 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (i11 != 0) {
                z8 = true;
            }
            q1 q1VarP = g1.p(function0, interfaceC3163lP, (i10 >> 3) & 14);
            interfaceC3163lP.f(-971159753);
            Object objG = interfaceC3163lP.g();
            InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
            if (objG == aVar.a()) {
                objG = new C0400d(z8, q1VarP);
                interfaceC3163lP.H(objG);
            }
            C0400d c0400d = (C0400d) objG;
            interfaceC3163lP.N();
            interfaceC3163lP.f(-971159481);
            boolean zR = interfaceC3163lP.R(c0400d) | interfaceC3163lP.c(z8);
            Object objG2 = interfaceC3163lP.g();
            if (zR || objG2 == aVar.a()) {
                objG2 = new a(c0400d, z8);
                interfaceC3163lP.H(objG2);
            }
            interfaceC3163lP.N();
            K.g((Function0) objG2, interfaceC3163lP, 0);
            F fA = g.f16020a.a(interfaceC3163lP, 6);
            if (fA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            C cB = fA.b();
            InterfaceC1733p interfaceC1733p = (InterfaceC1733p) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            interfaceC3163lP.f(-971159120);
            boolean zR2 = interfaceC3163lP.R(cB) | interfaceC3163lP.R(interfaceC1733p) | interfaceC3163lP.R(c0400d);
            Object objG3 = interfaceC3163lP.g();
            if (zR2 || objG3 == aVar.a()) {
                objG3 = new b(cB, interfaceC1733p, c0400d);
                interfaceC3163lP.H(objG3);
            }
            interfaceC3163lP.N();
            K.b(interfaceC1733p, cB, (k) objG3, interfaceC3163lP, 0);
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(z8, function0, i8, i9));
        }
    }

    public static final Function0 b(q1 q1Var) {
        return (Function0) q1Var.getValue();
    }
}
