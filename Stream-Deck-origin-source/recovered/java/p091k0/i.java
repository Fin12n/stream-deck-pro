package p091k0;

import C6.G;
import D6.r;
import Q6.k;
import Q6.p;
import Q6.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u;
import p109m0.J;
import p109m0.n;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i extends n implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f28408a = new J();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f28409b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f28410a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj) {
            super(1);
            this.f28410a = obj;
        }

        public final Object b(int i8) {
            return this.f28410a;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f28411a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj) {
            super(1);
            this.f28411a = obj;
        }

        public final Object b(int i8) {
            return this.f28411a;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f28412a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p pVar) {
            super(4);
            this.f28412a = pVar;
        }

        public final void b(p091k0.b bVar, int i8, InterfaceC3163l interfaceC3163l, int i9) {
            if ((i9 & 14) == 0) {
                i9 |= interfaceC3163l.R(bVar) ? 4 : 2;
            }
            if ((i9 & 651) == 130 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1010194746, i9, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:58)");
            }
            this.f28412a.invoke(bVar, interfaceC3163l, Integer.valueOf(i9 & 14));
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.q
        public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4) {
            b((p091k0.b) obj, ((Number) obj2).intValue(), (InterfaceC3163l) obj3, ((Number) obj4).intValue());
            return G.f1419a;
        }
    }

    public i(k kVar) {
        kVar.invoke(this);
    }

    @Override // p091k0.v
    public void a(Object obj, Object obj2, p pVar) {
        j().b(1, new h(obj != null ? new a(obj) : null, new b(obj2), H0.c.c(-1010194746, true, new c(pVar))));
    }

    @Override // p091k0.v
    public void d(int i8, k kVar, k kVar2, q qVar) {
        j().b(i8, new h(kVar, kVar2, qVar));
    }

    @Override // p091k0.v
    public void h(Object obj, Object obj2, p pVar) {
        List arrayList = this.f28409b;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f28409b = arrayList;
        }
        arrayList.add(Integer.valueOf(j().k()));
        a(obj, obj2, pVar);
    }

    public final List m() {
        List list = this.f28409b;
        return list == null ? r.n() : list;
    }

    @Override // p109m0.n
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public J j() {
        return this.f28408a;
    }
}
