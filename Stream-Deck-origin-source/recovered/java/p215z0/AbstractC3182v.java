package p215z0;

import C6.G;
import Q6.o;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: z0.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3182v {

    /* JADX INFO: renamed from: z0.v$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0[] f38947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f38948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f38949c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0[] c0Arr, o oVar, int i8) {
            super(2);
            this.f38947a = c0Arr;
            this.f38948b = oVar;
            this.f38949c = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            C0[] c0Arr = this.f38947a;
            AbstractC3182v.b((C0[]) Arrays.copyOf(c0Arr, c0Arr.length), this.f38948b, interfaceC3163l, F0.a(this.f38949c | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: z0.v$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0 f38950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f38951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f38952c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0 c8, o oVar, int i8) {
            super(2);
            this.f38950a = c8;
            this.f38951b = oVar;
            this.f38952c = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            AbstractC3182v.a(this.f38950a, this.f38951b, interfaceC3163l, F0.a(this.f38952c | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(C0 c8, o oVar, InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1350970552);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1350970552, i8, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:245)");
        }
        interfaceC3163lP.P(c8);
        oVar.invoke(interfaceC3163lP, Integer.valueOf((i8 >> 3) & 14));
        interfaceC3163lP.M();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(c8, oVar, i8));
        }
    }

    public static final void b(C0[] c0Arr, o oVar, InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1390796515);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1390796515, i8, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:225)");
        }
        interfaceC3163lP.K(c0Arr);
        oVar.invoke(interfaceC3163lP, Integer.valueOf((i8 >> 3) & 14));
        interfaceC3163lP.D();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new a(c0Arr, oVar, i8));
        }
    }

    public static final B0 c(f1 f1Var, Function0 function0) {
        return new J(f1Var, function0);
    }

    public static /* synthetic */ B0 d(f1 f1Var, Function0 function0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f1Var = g1.r();
        }
        return c(f1Var, function0);
    }

    public static final B0 e(Function0 function0) {
        return new r1(function0);
    }
}
