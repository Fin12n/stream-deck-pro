package V2;

import C6.G;
import D6.C0937q;
import D6.z;
import Q6.k;
import Q6.o;
import Q6.q;
import S2.l;
import S2.m;
import Y6.n;
import Z6.v;
import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p201x2.vAk.kDsnNkYbBsI;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f10520j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I0.d f10522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V2.c f10523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f10524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U2.a f10525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q1 f10527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final R2.b f10528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final R2.a f10529i;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T2.a f10530a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(T2.a aVar) {
            super(1);
            this.f10530a = aVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String it) {
            t.g(it, "it");
            return Boolean.valueOf(v.H(it, this.f10530a.getKey(), false, 2, null));
        }
    }

    /* JADX INFO: renamed from: V2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0289b extends u implements Function0 {
        public C0289b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final T2.a invoke() {
            T2.a aVarL = b.this.l();
            if (aVarL != null) {
                return aVarL;
            }
            throw new IllegalStateException(WaYxBuDSBD.ETAwYcBl);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f10533b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, b bVar) {
            super(4);
            this.f10532a = str;
            this.f10533b = bVar;
        }

        public final void b(String suffix, o content, InterfaceC3163l interfaceC3163l, int i8) {
            int i9;
            t.g(suffix, "suffix");
            t.g(content, "content");
            if ((i8 & 14) == 0) {
                i9 = (interfaceC3163l.R(suffix) ? 4 : 2) | i8;
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
                AbstractC3169o.W(-1585690675, i9, -1, "cafe.adriel.voyager.navigator.Navigator.saveableState.<anonymous> (Navigator.kt:147)");
            }
            b.r(this.f10532a, this.f10533b, suffix, content, interfaceC3163l, i9 & 126);
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

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f10535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f10536c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, o oVar) {
            super(2);
            this.f10535b = str;
            this.f10536c = oVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-720851089, i8, -1, "cafe.adriel.voyager.navigator.Navigator.saveableState.<anonymous> (Navigator.kt:149)");
            }
            b.this.f10522b.f(this.f10535b, this.f10536c, interfaceC3163l, 512);
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
    public static final class e extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f10538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ T2.a f10539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f10540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f10541e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f10542f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, T2.a aVar, o oVar, int i8, int i9) {
            super(2);
            this.f10538b = str;
            this.f10539c = aVar;
            this.f10540d = oVar;
            this.f10541e = i8;
            this.f10542f = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            b.this.q(this.f10538b, this.f10539c, this.f10540d, interfaceC3163l, F0.a(this.f10541e | 1), this.f10542f);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public b(List<? extends T2.a> screens, String key, I0.d stateHolder, V2.c disposeBehavior, b bVar) {
        t.g(screens, "screens");
        t.g(key, "key");
        t.g(stateHolder, "stateHolder");
        t.g(disposeBehavior, "disposeBehavior");
        this.f10521a = key;
        this.f10522b = stateHolder;
        this.f10523c = disposeBehavior;
        this.f10524d = bVar;
        this.f10525e = U2.b.a(screens, 1);
        this.f10526f = bVar != null ? bVar.f10526f + 1 : 0;
        this.f10527g = g1.d(new C0289b());
        this.f10528h = new R2.b();
        this.f10529i = new R2.a();
    }

    public static final void r(String str, b bVar, String str2, o oVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(645671963);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(645671963, i8, -1, "cafe.adriel.voyager.navigator.Navigator.saveableState.provideSaveableState (Navigator.kt:133)");
        }
        String str3 = str + ':' + str2;
        bVar.f10528h.add(str3);
        bVar.f10522b.f(str3, oVar, interfaceC3163l, (i8 & 112) | 512);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
    }

    public void c() {
        this.f10525e.a();
    }

    public boolean e() {
        return this.f10525e.b();
    }

    public final R2.a f() {
        return this.f10529i;
    }

    public final V2.c g() {
        return this.f10523c;
    }

    public List h() {
        return this.f10525e.c();
    }

    public final String i() {
        return this.f10521a;
    }

    public U2.c j() {
        return this.f10525e.d();
    }

    public final T2.a k() {
        return (T2.a) this.f10527g.getValue();
    }

    public T2.a l() {
        return (T2.a) this.f10525e.e();
    }

    public final b m() {
        return this.f10524d;
    }

    public boolean n() {
        return this.f10525e.g();
    }

    public void o(T2.a item) {
        t.g(item, "item");
        this.f10525e.h(item);
    }

    public void p(T2.a item) {
        t.g(item, "item");
        this.f10525e.i(item);
    }

    public final void q(String key, T2.a aVar, o content, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        t.g(key, "key");
        t.g(content, "content");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1421478789);
        if ((i9 & 2) != 0) {
            aVar = k();
            i10 = i8 & (-113);
        } else {
            i10 = i8;
        }
        T2.a aVar2 = aVar;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1421478789, i10, -1, "cafe.adriel.voyager.navigator.Navigator.saveableState (Navigator.kt:128)");
        }
        String str = aVar2.getKey() + ':' + key;
        this.f10528h.add(str);
        l lVarA = S2.k.a(aVar2, interfaceC3163lP, 8);
        List listA = W2.c.a(aVar2, interfaceC3163lP, 8);
        interfaceC3163lP.f(511388516);
        boolean zR = interfaceC3163lP.R(lVarA) | interfaceC3163lP.R(listA);
        Object objG = interfaceC3163lP.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = z.B0(C0937q.e(lVarA), listA);
            interfaceC3163lP.H(objG);
        }
        interfaceC3163lP.N();
        S2.f.a((List) objG, H0.c.b(interfaceC3163lP, -1585690675, true, new c(str, this)), H0.c.b(interfaceC3163lP, -720851089, true, new d(str, content)), interfaceC3163lP, 440);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new e(key, aVar2, content, i8, i9));
        }
    }

    public final void d(T2.a aVar) {
        t.g(aVar, kDsnNkYbBsI.ThTehWvE);
        m.f9722a.b(aVar);
        for (String str : n.k(z.Z(z.W0(this.f10528h)), new a(aVar))) {
            this.f10522b.e(str);
            this.f10528h.remove(str);
        }
    }

    public /* synthetic */ b(List list, String str, I0.d dVar, V2.c cVar, b bVar, int i8, AbstractC2633k abstractC2633k) {
        this(list, str, dVar, cVar, (i8 & 16) != 0 ? null : bVar);
    }
}
