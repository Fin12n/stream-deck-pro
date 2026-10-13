package p037e0;

import C6.G;
import Q6.k;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import e0.L.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2635m;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p116m7.kKPq.toqHM;
import p215z0.AbstractC3169o;
import p215z0.H;
import p215z0.I;
import p215z0.InterfaceC3163l;
import p215z0.K;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f20045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L.a f20046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f20047c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ K f20048d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, L.a aVar, Object obj2, K k8) {
            super(0);
            this.f20045a = obj;
            this.f20046b = aVar;
            this.f20047c = obj2;
            this.f20048d = k8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m189invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m189invoke() {
            if (t.c(this.f20045a, this.f20046b.c()) && t.c(this.f20047c, this.f20046b.e())) {
                return;
            }
            this.f20046b.C(this.f20045a, this.f20047c, this.f20048d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L f20049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L.a f20050b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ L f20051a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ L.a f20052b;

            public a(L l8, L.a aVar) {
                this.f20051a = l8;
                this.f20052b = aVar;
            }

            @Override // p215z0.H
            public void d() {
                this.f20051a.j(this.f20052b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L l8, L.a aVar) {
            super(1);
            this.f20049a = l8;
            this.f20050b = aVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H invoke(I i8) {
            this.f20049a.f(this.f20050b);
            return new a(this.f20049a, this.f20050b);
        }
    }

    public static final q1 a(L l8, float f8, float f9, K k8, String str, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(-644770905);
        if ((i9 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-644770905, i8, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:316)");
        }
        int i10 = i8 << 3;
        q1 q1VarB = b(l8, Float.valueOf(f8), Float.valueOf(f9), l0.i(C2635m.f28814a), k8, str2, interfaceC3163l, (i8 & 112) | 8 | (i8 & 896) | (57344 & i10) | (i10 & 458752), 0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return q1VarB;
    }

    public static final q1 b(L l8, Object obj, Object obj2, j0 j0Var, K k8, String str, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(-1062847727);
        if ((i9 & 16) != 0) {
            str = toqHM.OZawZibt;
        }
        String str2 = str;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1062847727, i8, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:260)");
        }
        interfaceC3163l.f(-492369756);
        Object objG = interfaceC3163l.g();
        if (objG == InterfaceC3163l.f38803a.a()) {
            L.a aVar = l8.new a(obj, obj2, j0Var, k8, str2);
            interfaceC3163l.H(aVar);
            objG = aVar;
        }
        interfaceC3163l.N();
        L.a aVar2 = (L.a) objG;
        K.g(new a(obj, aVar2, obj2, k8), interfaceC3163l, 0);
        K.a(aVar2, new b(l8, aVar2), interfaceC3163l, 6);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return aVar2;
    }

    public static final L c(String str, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(1013651573);
        if ((i9 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1013651573, i8, -1, uYOhHhTXuF.WKve);
        }
        interfaceC3163l.f(-492369756);
        Object objG = interfaceC3163l.g();
        if (objG == InterfaceC3163l.f38803a.a()) {
            objG = new L(str);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        L l8 = (L) objG;
        l8.k(interfaceC3163l, 8);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return l8;
    }
}
