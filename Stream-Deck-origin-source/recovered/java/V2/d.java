package V2;

import C6.G;
import D6.C0937q;
import Q6.k;
import Q6.o;
import Q6.p;
import Z6.C1694a;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3182v;
import p215z0.B0;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B0 f10545a = AbstractC3182v.e(c.f10549a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f10546b = 36;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T2.a f10547a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(T2.a aVar) {
            super(2);
            this.f10547a = aVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(279379675, i8, -1, "cafe.adriel.voyager.navigator.CurrentScreen.<anonymous> (Navigator.kt:47)");
            }
            this.f10547a.m(interfaceC3163l, 8);
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
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10548a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i8) {
            super(2);
            this.f10548a = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            d.a(interfaceC3163l, F0.a(this.f10548a | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f10549a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final V2.b invoke() {
            return null;
        }
    }

    /* JADX INFO: renamed from: V2.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0290d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0290d f10550a = new C0290d();

        public C0290d() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(T2.a it) {
            t.g(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T2.a f10551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ V2.c f10552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f10553c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f10554d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p f10555e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f10556f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f10557g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(T2.a aVar, V2.c cVar, k kVar, String str, p pVar, int i8, int i9) {
            super(2);
            this.f10551a = aVar;
            this.f10552b = cVar;
            this.f10553c = kVar;
            this.f10554d = str;
            this.f10555e = pVar;
            this.f10556f = i8;
            this.f10557g = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            d.b(this.f10551a, this.f10552b, this.f10553c, this.f10554d, this.f10555e, interfaceC3163l, F0.a(this.f10556f | 1), this.f10557g);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f10558a = new f();

        public f() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(T2.a it) {
            t.g(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f10559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f10560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ V2.c f10561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f10562d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p f10563e;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ V2.c f10564a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ V2.b f10565b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f10566c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ p f10567d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(V2.c cVar, V2.b bVar, k kVar, p pVar) {
                super(2);
                this.f10564a = cVar;
                this.f10565b = bVar;
                this.f10566c = kVar;
                this.f10567d = pVar;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-184665941, i8, -1, "cafe.adriel.voyager.navigator.Navigator.<anonymous>.<anonymous> (Navigator.kt:91)");
                }
                interfaceC3163l.f(1185192621);
                if (this.f10564a.b()) {
                    W2.e.c(this.f10565b, interfaceC3163l, 8);
                }
                interfaceC3163l.N();
                W2.d.a(this.f10565b, this.f10566c, interfaceC3163l, 8);
                this.f10567d.invoke(this.f10565b, interfaceC3163l, 8);
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
        public g(List list, String str, V2.c cVar, k kVar, p pVar) {
            super(2);
            this.f10559a = list;
            this.f10560b = str;
            this.f10561c = cVar;
            this.f10562d = kVar;
            this.f10563e = pVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            V2.c cVarG;
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1982643221, i8, -1, "cafe.adriel.voyager.navigator.Navigator.<anonymous> (Navigator.kt:82)");
            }
            V2.b bVarB = W2.f.b(this.f10559a, this.f10560b, this.f10561c, (V2.b) interfaceC3163l.e(d.f()), interfaceC3163l, 4104);
            interfaceC3163l.f(1621646237);
            V2.b bVarM = bVarB.m();
            if (bVarM == null || (cVarG = bVarM.g()) == null || cVarG.a()) {
                W2.e.b(bVarB, interfaceC3163l, 8);
            }
            interfaceC3163l.N();
            AbstractC3182v.a(d.f().c(bVarB), H0.c.b(interfaceC3163l, -184665941, true, new a(this.f10561c, bVarB, this.f10562d, this.f10563e)), interfaceC3163l, 56);
            W2.e.a(bVarB, interfaceC3163l, 8);
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
    public static final class h extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f10568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ V2.c f10569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f10570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f10571d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p f10572e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f10573f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f10574g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List list, V2.c cVar, k kVar, String str, p pVar, int i8, int i9) {
            super(2);
            this.f10568a = list;
            this.f10569b = cVar;
            this.f10570c = kVar;
            this.f10571d = str;
            this.f10572e = pVar;
            this.f10573f = i8;
            this.f10574g = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            d.c(this.f10568a, this.f10569b, this.f10570c, this.f10571d, this.f10572e, interfaceC3163l, F0.a(this.f10573f | 1), this.f10574g);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1533346094);
        if (i8 == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1533346094, i8, -1, "cafe.adriel.voyager.navigator.CurrentScreen (Navigator.kt:42)");
            }
            V2.b bVar = (V2.b) e(f10545a, interfaceC3163lP, 6);
            bVar.q("currentScreen", null, H0.c.b(interfaceC3163lP, 279379675, true, new a(bVar.k())), interfaceC3163lP, 4486, 2);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(i8));
        }
    }

    public static final void b(T2.a screen, V2.c cVar, k kVar, String str, p pVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        V2.c cVar2;
        int i10;
        String strD;
        t.g(screen, "screen");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(644293085);
        if ((i9 & 2) != 0) {
            cVar2 = new V2.c(false, false, 3, null);
            i10 = i8 & (-113);
        } else {
            cVar2 = cVar;
            i10 = i8;
        }
        k kVar2 = (i9 & 4) != 0 ? C0290d.f10550a : kVar;
        if ((i9 & 8) != 0) {
            i10 &= -7169;
            strD = d(interfaceC3163lP, 0);
        } else {
            strD = str;
        }
        p pVarA = (i9 & 16) != 0 ? V2.a.f10515a.a() : pVar;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(644293085, i10, -1, "cafe.adriel.voyager.navigator.Navigator (Navigator.kt:58)");
        }
        c(C0937q.e(screen), cVar2, kVar2, strD, pVarA, interfaceC3163lP, (i10 & 112) | 8 | (i10 & 896) | (i10 & 7168) | (i10 & 57344), 0);
        V2.c cVar3 = cVar2;
        k kVar3 = kVar2;
        String str2 = strD;
        p pVar2 = pVarA;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new e(screen, cVar3, kVar3, str2, pVar2, i8, i9));
        }
    }

    public static final void c(List screens, V2.c cVar, k kVar, String str, p pVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        t.g(screens, "screens");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-209920213);
        if ((i9 & 2) != 0) {
            cVar = new V2.c(false, false, 3, null);
            i10 = i8 & (-113);
        } else {
            i10 = i8;
        }
        V2.c cVar2 = cVar;
        if ((i9 & 4) != 0) {
            kVar = f.f10558a;
        }
        k kVar2 = kVar;
        if ((i9 & 8) != 0) {
            str = d(interfaceC3163lP, 0);
            i10 &= -7169;
        }
        p pVarB = (i9 & 16) != 0 ? V2.a.f10515a.b() : pVar;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-209920213, i10, -1, "cafe.adriel.voyager.navigator.Navigator (Navigator.kt:75)");
        }
        if (screens.isEmpty()) {
            throw new IllegalArgumentException("Navigator must have at least one screen");
        }
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Navigator key can't be empty");
        }
        AbstractC3182v.a(W2.f.a().d(I0.f.a(interfaceC3163lP, 0)), H0.c.b(interfaceC3163lP, -1982643221, true, new g(screens, str, cVar2, kVar2, pVarB)), interfaceC3163lP, 56);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new h(screens, cVar2, kVar2, str, pVarB, i8, i9));
        }
    }

    public static final String d(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-470755924);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-470755924, i8, -1, "cafe.adriel.voyager.navigator.compositionUniqueId (Navigator.kt:189)");
        }
        String string = Integer.toString(AbstractC3157i.a(interfaceC3163l, 0), C1694a.a(f10546b));
        t.f(string, "toString(...)");
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return string;
    }

    public static final Object e(B0 b8, InterfaceC3163l interfaceC3163l, int i8) {
        t.g(b8, "<this>");
        interfaceC3163l.f(864469981);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(864469981, i8, -1, "cafe.adriel.voyager.navigator.<get-currentOrThrow> (Navigator.kt:39)");
        }
        Object objE = interfaceC3163l.e(b8);
        if (objE == null) {
            throw new IllegalStateException("CompositionLocal is null");
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return objE;
    }

    public static final B0 f() {
        return f10545a;
    }
}
