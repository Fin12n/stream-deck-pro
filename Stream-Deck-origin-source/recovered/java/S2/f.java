package S2;

import C6.G;
import D6.w;
import D6.z;
import Q6.o;
import Q6.q;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f9697a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list) {
            super(0);
            this.f9697a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j invoke() {
            return (j) w.N(this.f9697a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f9698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f9699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f9700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f9701d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list, q qVar, o oVar, int i8) {
            super(2);
            this.f9698a = list;
            this.f9699b = qVar;
            this.f9700c = oVar;
            this.f9701d = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            f.a(this.f9698a, this.f9699b, this.f9700c, interfaceC3163l, F0.a(this.f9701d | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f9702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f9703b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q qVar, o oVar) {
            super(4);
            this.f9702a = qVar;
            this.f9703b = oVar;
        }

        public final void b(String suffixKey, o anonymous$parameter$1$, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(suffixKey, "suffixKey");
            t.g(anonymous$parameter$1$, "$anonymous$parameter$1$");
            if ((i8 & 14) == 0) {
                i8 |= interfaceC3163l.R(suffixKey) ? 4 : 2;
            }
            if ((i8 & 651) == 130 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1050024488, i8, -1, "cafe.adriel.voyager.core.lifecycle.RecursiveProvideBeforeScreenContent.<anonymous> (multipleScreenLifecycleOwnerUtil.kt:45)");
            }
            this.f9702a.i(suffixKey, this.f9703b, interfaceC3163l, Integer.valueOf((i8 & 14) | 48));
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.q
        public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4) {
            b((String) obj, (o) obj2, (InterfaceC3163l) obj3, ((Number) obj4).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f9704a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(o oVar) {
            super(2);
            this.f9704a = oVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-666683194, i8, -1, "cafe.adriel.voyager.core.lifecycle.RecursiveProvideBeforeScreenContent.<anonymous> (multipleScreenLifecycleOwnerUtil.kt:48)");
            }
            this.f9704a.invoke(interfaceC3163l, 6);
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
    public static final class e extends u implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f9705a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(q qVar) {
            super(4);
            this.f9705a = qVar;
        }

        public final void b(String suffixKey, o content, InterfaceC3163l interfaceC3163l, int i8) {
            int i9;
            t.g(suffixKey, "suffixKey");
            t.g(content, "content");
            if ((i8 & 14) == 0) {
                i9 = (interfaceC3163l.R(suffixKey) ? 4 : 2) | i8;
            } else {
                i9 = i8;
            }
            if ((i8 & 112) == 0) {
                i9 |= interfaceC3163l.l(content) ? 32 : 16;
            }
            if ((i9 & 731) == 146 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(260867377, i9, -1, "cafe.adriel.voyager.core.lifecycle.RecursiveProvideBeforeScreenContent.<anonymous> (multipleScreenLifecycleOwnerUtil.kt:53)");
            }
            this.f9705a.i(suffixKey, content, interfaceC3163l, Integer.valueOf(i9 & 126));
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.q
        public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4) {
            b((String) obj, (o) obj2, (InterfaceC3163l) obj3, ((Number) obj4).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: S2.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0269f extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f9706a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0269f(o oVar) {
            super(2);
            this.f9706a = oVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-393432241, i8, -1, "cafe.adriel.voyager.core.lifecycle.RecursiveProvideBeforeScreenContent.<anonymous> (multipleScreenLifecycleOwnerUtil.kt:56)");
            }
            this.f9706a.invoke(interfaceC3163l, 0);
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
    public static final class g extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f9707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f9708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f9709c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f9710d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f9711e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(j jVar, q qVar, o oVar, Function0 function0, int i8) {
            super(2);
            this.f9707a = jVar;
            this.f9708b = qVar;
            this.f9709c = oVar;
            this.f9710d = function0;
            this.f9711e = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            f.b(this.f9707a, this.f9708b, this.f9709c, this.f9710d, interfaceC3163l, F0.a(this.f9711e | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f9712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f9713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f9714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f9715d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(j jVar, q qVar, o oVar, Function0 function0) {
            super(2);
            this.f9712a = jVar;
            this.f9713b = qVar;
            this.f9714c = oVar;
            this.f9715d = function0;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-201295924, i8, -1, "cafe.adriel.voyager.core.lifecycle.RecursiveProvideBeforeScreenContent.<anonymous> (multipleScreenLifecycleOwnerUtil.kt:36)");
            }
            f.b(this.f9712a, this.f9713b, this.f9714c, this.f9715d, interfaceC3163l, 0);
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

    public static final void a(List screenLifecycleContentProviders, q provideSaveableState, o content, InterfaceC3163l interfaceC3163l, int i8) {
        q qVar;
        o oVar;
        t.g(screenLifecycleContentProviders, "screenLifecycleContentProviders");
        t.g(provideSaveableState, "provideSaveableState");
        t.g(content, "content");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1115004036);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1115004036, i8, -1, "cafe.adriel.voyager.core.lifecycle.MultipleProvideBeforeScreenContent (multipleScreenLifecycleOwnerUtil.kt:12)");
        }
        if (screenLifecycleContentProviders.isEmpty()) {
            qVar = provideSaveableState;
            oVar = content;
            interfaceC3163lP.f(-441237704);
            oVar.invoke(interfaceC3163lP, Integer.valueOf((i8 >> 6) & 14));
            interfaceC3163lP.N();
        } else {
            interfaceC3163lP.f(-441238046);
            List listU0 = z.U0(screenLifecycleContentProviders);
            qVar = provideSaveableState;
            oVar = content;
            b((j) w.M(listU0), qVar, oVar, new a(listU0), interfaceC3163lP, i8 & 1008);
            interfaceC3163lP.N();
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(screenLifecycleContentProviders, qVar, oVar, i8));
        }
    }

    public static final void b(j jVar, q qVar, o oVar, Function0 function0, InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1467702800);
        int i9 = (i8 & 14) == 0 ? (interfaceC3163lP.R(jVar) ? 4 : 2) | i8 : i8;
        if ((i8 & 112) == 0) {
            i9 |= interfaceC3163lP.l(qVar) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            i9 |= interfaceC3163lP.l(oVar) ? 256 : 128;
        }
        if ((i8 & 7168) == 0) {
            i9 |= interfaceC3163lP.l(function0) ? 2048 : 1024;
        }
        if ((i9 & 5851) == 1170 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1467702800, i9, -1, "cafe.adriel.voyager.core.lifecycle.RecursiveProvideBeforeScreenContent (multipleScreenLifecycleOwnerUtil.kt:32)");
            }
            Object[] objArr = {jVar, qVar, oVar, function0};
            interfaceC3163lP.f(-568225417);
            boolean zR = false;
            for (int i10 = 0; i10 < 4; i10++) {
                zR |= interfaceC3163lP.R(objArr[i10]);
            }
            Object objG = interfaceC3163lP.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                objG = (j) function0.invoke();
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            j jVar2 = (j) objG;
            if (jVar2 != null) {
                interfaceC3163lP.f(586454009);
                H0.a aVarB = H0.c.b(interfaceC3163lP, -201295924, true, new h(jVar2, qVar, oVar, function0));
                jVar.c(H0.c.b(interfaceC3163lP, 1050024488, true, new c(qVar, aVarB)), H0.c.b(interfaceC3163lP, -666683194, true, new d(aVarB)), interfaceC3163lP, ((i9 << 6) & 896) | 54);
                interfaceC3163lP.N();
            } else {
                interfaceC3163lP.f(586454584);
                jVar.c(H0.c.b(interfaceC3163lP, 260867377, true, new e(qVar)), H0.c.b(interfaceC3163lP, -393432241, true, new C0269f(oVar)), interfaceC3163lP, ((i9 << 6) & 896) | 54);
                interfaceC3163lP.N();
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new g(jVar, qVar, oVar, function0, i8));
        }
    }
}
