package p100l0;

import C6.G;
import Q6.k;
import Q6.o;
import Q6.p;
import Q6.q;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p109m0.J;
import p109m0.n;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class j extends n implements A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f28995d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f28996e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f28997f = a.f29001a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f28998a = new F(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f28999b = new J();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29000c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29001a = new a();

        public a() {
            super(2);
        }

        public final long b(r rVar, int i8) {
            return E.a(1);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C2641b.a(b((r) obj, ((Number) obj2).intValue()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f29002a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj) {
            super(1);
            this.f29002a = obj;
        }

        public final Object b(int i8) {
            return this.f29002a;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f29003a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(k kVar) {
            super(2);
            this.f29003a = kVar;
        }

        public final long b(r rVar, int i8) {
            return ((C2641b) this.f29003a.invoke(rVar)).g();
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C2641b.a(b((r) obj, ((Number) obj2).intValue()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f29004a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj) {
            super(1);
            this.f29004a = obj;
        }

        public final Object b(int i8) {
            return this.f29004a;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f29005a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(p pVar) {
            super(4);
            this.f29005a = pVar;
        }

        public final void b(q qVar, int i8, InterfaceC3163l interfaceC3163l, int i9) {
            if ((i9 & 14) == 0) {
                i9 |= interfaceC3163l.R(qVar) ? 4 : 2;
            }
            if ((i9 & 651) == 130 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-34608120, i9, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.<anonymous> (LazyGridIntervalContent.kt:49)");
            }
            this.f29005a.invoke(qVar, interfaceC3163l, Integer.valueOf(i9 & 14));
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.q
        public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4) {
            b((q) obj, ((Number) obj2).intValue(), (InterfaceC3163l) obj3, ((Number) obj4).intValue());
            return G.f1419a;
        }
    }

    public j(k kVar) {
        kVar.invoke(this);
    }

    @Override // p100l0.A
    public void b(Object obj, k kVar, Object obj2, p pVar) {
        j().b(1, new C2648i(obj != null ? new c(obj) : null, kVar != null ? new d(kVar) : f28997f, new e(obj2), H0.c.c(-34608120, true, new f(pVar))));
        if (kVar != null) {
            this.f29000c = true;
        }
    }

    @Override // p100l0.A
    public void e(int i8, k kVar, o oVar, k kVar2, q qVar) {
        j().b(i8, new C2648i(kVar, oVar == null ? f28997f : oVar, kVar2, qVar));
        if (oVar != null) {
            this.f29000c = true;
        }
    }

    public final boolean m() {
        return this.f29000c;
    }

    @Override // p109m0.n
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public J j() {
        return this.f28999b;
    }

    public final F o() {
        return this.f28998a;
    }
}
