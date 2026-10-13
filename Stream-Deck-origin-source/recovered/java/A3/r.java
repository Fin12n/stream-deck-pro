package A3;

import C6.G;
import D6.C0938s;
import D6.z;
import Z6.w;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.elgato.streamdeck.vsd2.AppSettings;
import com.elgato.streamdeck.vsd2.AppSettingsStore;
import com.revenuecat.purchases.CacheFetchPolicy;
import com.revenuecat.purchases.CoroutinesExtensionsCommonKt;
import com.revenuecat.purchases.CoroutinesExtensionsKt;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.PurchaseResult;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.amazon.AmazonStoreProduct;
import com.revenuecat.purchases.amazon.AmazonStoreProductKt;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.J;
import p044e7.AbstractC2262h;
import p044e7.H;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p044e7.M;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r implements n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f748i = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f749j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Z2.j f750k = Z2.j.f12858c.d("purchases");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppSettingsStore f752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Purchases f753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R3.a f754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J f755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public A3.e f757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M f758h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f768b;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.PROMOTIONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f767a = iArr;
            int[] iArr2 = new int[Period.Unit.values().length];
            try {
                iArr2[Period.Unit.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Period.Unit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Period.Unit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Period.Unit.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Period.Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            f768b = iArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f771c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f773e;

        public d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f771c = obj;
            this.f773e |= Integer.MIN_VALUE;
            return r.this.f(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f774a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f776c;

        public e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f774a = obj;
            this.f776c |= Integer.MIN_VALUE;
            return r.this.h(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f778b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f780d;

        public f(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f778b = obj;
            this.f780d |= Integer.MIN_VALUE;
            return r.this.a(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f783c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f785e;

        public g(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f783c = obj;
            this.f785e |= Integer.MIN_VALUE;
            return r.this.b(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f786a;

        public h(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return r.this.new h(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((h) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f786a;
            try {
                if (i8 == 0) {
                    C6.r.b(obj);
                    r rVar = r.this;
                    this.f786a = 1;
                    if (rVar.f(this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj);
                }
            } catch (Throwable th) {
                V3.f.b(new V3.g.c(th));
                Z2.j jVar = r.f750k;
                String strC = jVar.c();
                Z2.p pVar = Z2.p.Error;
                if (jVar.a().a().compareTo(pVar) <= 0) {
                    jVar.b(pVar, strC, th, "Error fetching entitlement");
                }
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f790c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f792e;

        public i(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f790c = obj;
            this.f792e |= Integer.MIN_VALUE;
            return r.this.e(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f793a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f794a;

            /* JADX INFO: renamed from: A3.r$j$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0019a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f795a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f796b;

                public C0019a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f795a = obj;
                    this.f796b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g) {
                this.f794a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0019a c0019a;
                if (dVar instanceof C0019a) {
                    c0019a = (C0019a) dVar;
                    int i8 = c0019a.f796b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0019a.f796b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0019a = new C0019a(dVar);
                    }
                } else {
                    c0019a = new C0019a(dVar);
                }
                Object obj2 = c0019a.f795a;
                Object objF = H6.c.f();
                int i9 = c0019a.f796b;
                if (i9 == 0) {
                    C6.r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f794a;
                    Boolean boolA = I6.b.a(((AppSettings) obj).getIsProUser());
                    c0019a.f796b = 1;
                    if (interfaceC2261g.emit(boolA, c0019a) == objF) {
                        return objF;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj2);
                }
                return G.f1419a;
            }
        }

        public j(InterfaceC2260f interfaceC2260f) {
            this.f793a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f793a.collect(new a(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f798a = new k();

        public k() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((r7.f) obj);
            return G.f1419a;
        }

        public final void invoke(r7.f Json) {
            t.g(Json, "$this$Json");
            Json.f(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f803e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f805g;

        public l(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f803e = obj;
            this.f805g |= Integer.MIN_VALUE;
            return r.this.q(null, this);
        }
    }

    public r(Context context, AppSettingsStore store, Purchases purchases, R3.a isOnline, J scope) {
        t.g(context, "context");
        t.g(store, "store");
        t.g(purchases, "purchases");
        t.g(isOnline, "isOnline");
        t.g(scope, "scope");
        this.f751a = context;
        this.f752b = store;
        this.f753c = purchases;
        this.f754d = isOnline;
        this.f755e = scope;
        this.f756f = new LinkedHashMap();
        AbstractC1789i.d(scope, null, null, new a(null), 3, null);
        this.f758h = AbstractC2262h.T(new j(store.getData()), scope, H.f20929a.c(), Boolean.FALSE);
    }

    public static /* synthetic */ A3.g o(r rVar, Package r8, boolean z8, Map map, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            map = null;
        }
        return rVar.n(r8, z8, map);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // A3.n
    public Object a(G6.d dVar) throws Throwable {
        f fVar;
        r rVar;
        List<Package> listN;
        List<Package> listN2;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i8 = fVar.f780d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                fVar.f780d = i8 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object objAwaitOfferings = fVar.f778b;
        Object objF = H6.c.f();
        int i9 = fVar.f780d;
        if (i9 == 0) {
            C6.r.b(objAwaitOfferings);
            Purchases purchases = this.f753c;
            fVar.f777a = this;
            fVar.f780d = 1;
            objAwaitOfferings = CoroutinesExtensionsCommonKt.awaitOfferings(purchases, fVar);
            if (objAwaitOfferings == objF) {
                return objF;
            }
            rVar = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = (r) fVar.f777a;
            C6.r.b(objAwaitOfferings);
        }
        Offerings offerings = (Offerings) objAwaitOfferings;
        Offering offering = offerings.get("default");
        if (offering == null || (listN = offering.getAvailablePackages()) == null) {
            listN = D6.r.n();
        }
        Offering offering2 = offerings.get("streamdeckv2");
        if (offering2 == null || (listN2 = offering2.getAvailablePackages()) == null) {
            listN2 = D6.r.n();
        }
        List<Package> list = listN2;
        Map map = rVar.f756f;
        for (Object obj : list) {
            map.put(((Package) obj).getProduct().getId(), obj);
        }
        ArrayList arrayList = new ArrayList(C0938s.y(listN, 10));
        Iterator<T> it = listN.iterator();
        while (it.hasNext()) {
            arrayList.add(o(rVar, (Package) it.next(), true, null, 2, null));
        }
        ArrayList arrayList2 = new ArrayList(C0938s.y(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(rVar.n((Package) it2.next(), false, offering2 != null ? offering2.getMetadata() : null));
        }
        return z.B0(arrayList, arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // A3.n
    public Object b(Activity activity, A3.g gVar, G6.d dVar) throws Throwable {
        g gVar2;
        r rVar;
        r rVar2;
        if (dVar instanceof g) {
            gVar2 = (g) dVar;
            int i8 = gVar2.f785e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                gVar2.f785e = i8 - Integer.MIN_VALUE;
            } else {
                gVar2 = new g(dVar);
            }
        } else {
            gVar2 = new g(dVar);
        }
        Object objAwaitPurchase = gVar2.f783c;
        Object objF = H6.c.f();
        int i9 = gVar2.f785e;
        if (i9 == 0) {
            C6.r.b(objAwaitPurchase);
            Object obj = this.f756f.get(gVar.d());
            if (obj == null) {
                throw new IllegalStateException("BUG: Invalid Product ID");
            }
            Purchases purchases = this.f753c;
            PurchaseParams purchaseParamsBuild = new PurchaseParams.Builder(activity, (Package) obj).build();
            gVar2.f781a = this;
            gVar2.f782b = this;
            gVar2.f785e = 1;
            objAwaitPurchase = CoroutinesExtensionsCommonKt.awaitPurchase(purchases, purchaseParamsBuild, gVar2);
            if (objAwaitPurchase != objF) {
                rVar = this;
                rVar2 = rVar;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            A3.e eVar = (A3.e) gVar2.f781a;
            C6.r.b(objAwaitPurchase);
            return eVar;
        }
        rVar = (r) gVar2.f782b;
        rVar2 = (r) gVar2.f781a;
        C6.r.b(objAwaitPurchase);
        A3.e eVarL = rVar.l(((PurchaseResult) objAwaitPurchase).getCustomerInfo());
        gVar2.f781a = eVarL;
        gVar2.f782b = null;
        gVar2.f785e = 2;
        return rVar2.q(eVarL, gVar2) == objF ? objF : eVarL;
    }

    @Override // S3.a
    public boolean c() {
        return ((Boolean) d().getValue()).booleanValue();
    }

    @Override // S3.a
    public M d() {
        return this.f758h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // A3.n
    public Object e(G6.d dVar) throws Throwable {
        i iVar;
        r rVar;
        r rVar2;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i8 = iVar.f792e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                iVar.f792e = i8 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object objAwaitRestore = iVar.f790c;
        Object objF = H6.c.f();
        int i9 = iVar.f792e;
        if (i9 == 0) {
            C6.r.b(objAwaitRestore);
            Purchases purchases = this.f753c;
            iVar.f788a = this;
            iVar.f789b = this;
            iVar.f792e = 1;
            objAwaitRestore = CoroutinesExtensionsCommonKt.awaitRestore(purchases, iVar);
            if (objAwaitRestore != objF) {
                rVar = this;
                rVar2 = rVar;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            A3.e eVar = (A3.e) iVar.f788a;
            C6.r.b(objAwaitRestore);
            return eVar;
        }
        rVar = (r) iVar.f789b;
        rVar2 = (r) iVar.f788a;
        C6.r.b(objAwaitRestore);
        A3.e eVarL = rVar.l((CustomerInfo) objAwaitRestore);
        iVar.f788a = eVarL;
        iVar.f789b = null;
        iVar.f792e = 2;
        return rVar2.q(eVarL, iVar) == objF ? objF : eVarL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // A3.n
    public Object f(G6.d dVar) throws Throwable {
        d dVar2;
        r rVar;
        r rVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i8 = dVar2.f773e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar2.f773e = i8 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objAwaitCustomerInfo = dVar2.f771c;
        Object objF = H6.c.f();
        int i9 = dVar2.f773e;
        if (i9 == 0) {
            C6.r.b(objAwaitCustomerInfo);
            Purchases purchases = this.f753c;
            CacheFetchPolicy cacheFetchPolicy = CacheFetchPolicy.NOT_STALE_CACHED_OR_CURRENT;
            dVar2.f769a = this;
            dVar2.f770b = this;
            dVar2.f773e = 1;
            objAwaitCustomerInfo = CoroutinesExtensionsKt.awaitCustomerInfo(purchases, cacheFetchPolicy, dVar2);
            if (objAwaitCustomerInfo != objF) {
                rVar = this;
                rVar2 = rVar;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            A3.e eVar = (A3.e) dVar2.f769a;
            C6.r.b(objAwaitCustomerInfo);
            return eVar;
        }
        rVar = (r) dVar2.f770b;
        rVar2 = (r) dVar2.f769a;
        C6.r.b(objAwaitCustomerInfo);
        A3.e eVarL = rVar.l((CustomerInfo) objAwaitCustomerInfo);
        dVar2.f769a = eVarL;
        dVar2.f770b = null;
        dVar2.f773e = 2;
        return rVar2.q(eVarL, dVar2) == objF ? objF : eVarL;
    }

    @Override // A3.n
    public String g() {
        return this.f753c.getAppUserID();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // A3.n
    public Object h(G6.d dVar) {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i8 = eVar.f776c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f776c = i8 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objAwaitCustomerInfo$default = eVar.f774a;
        Object objF = H6.c.f();
        int i9 = eVar.f776c;
        if (i9 == 0) {
            C6.r.b(objAwaitCustomerInfo$default);
            Purchases purchases = this.f753c;
            eVar.f776c = 1;
            objAwaitCustomerInfo$default = CoroutinesExtensionsKt.awaitCustomerInfo$default(purchases, null, eVar, 1, null);
            if (objAwaitCustomerInfo$default == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(objAwaitCustomerInfo$default);
        }
        Uri managementURL = ((CustomerInfo) objAwaitCustomerInfo$default).getManagementURL();
        if (managementURL != null) {
            return managementURL.toString();
        }
        return null;
    }

    public final A3.e l(CustomerInfo customerInfo) {
        EntitlementInfo entitlementInfo = customerInfo.getEntitlements().getActive().get("Full Access");
        if (entitlementInfo == null) {
            return null;
        }
        if (c.f767a[entitlementInfo.getStore().ordinal()] == 1) {
            return new A3.e.b(entitlementInfo.getExpirationDate(), p186v3.b.c(entitlementInfo.getStore()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(entitlementInfo.getProductIdentifier());
        String productPlanIdentifier = entitlementInfo.getProductPlanIdentifier();
        if (productPlanIdentifier != null) {
            sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            sb.append(productPlanIdentifier);
        }
        String string = sb.toString();
        t.f(string, "toString(...)");
        return new A3.e.a(string, entitlementInfo.getExpirationDate(), entitlementInfo.getOriginalPurchaseDate(), entitlementInfo.getLatestPurchaseDate(), entitlementInfo.getWillRenew(), entitlementInfo.getBillingIssueDetectedAt(), entitlementInfo.getUnsubscribeDetectedAt(), entitlementInfo.getPeriodType() == PeriodType.TRIAL, p186v3.b.c(entitlementInfo.getStore()));
    }

    public void m() {
        AbstractC1789i.d(this.f755e, null, null, new h(null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:101:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:109:0x0212  */
    /* JADX WARN: Code duplicated, block: B:112:0x0237  */
    /* JADX WARN: Code duplicated, block: B:114:0x023b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0240  */
    /* JADX WARN: Code duplicated, block: B:117:0x0243  */
    /* JADX WARN: Code duplicated, block: B:120:0x026b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0274  */
    /* JADX WARN: Code duplicated, block: B:127:0x0288  */
    /* JADX WARN: Code duplicated, block: B:130:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:58:0x0107  */
    /* JADX WARN: Code duplicated, block: B:60:0x010a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0120  */
    /* JADX WARN: Code duplicated, block: B:65:0x0139 A[LOOP:0: B:61:0x011e->B:65:0x0139, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0142  */
    /* JADX WARN: Code duplicated, block: B:71:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0152 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0154  */
    /* JADX WARN: Code duplicated, block: B:75:0x0157  */
    /* JADX WARN: Code duplicated, block: B:77:0x015a  */
    /* JADX WARN: Code duplicated, block: B:78:0x015c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0162  */
    /* JADX WARN: Code duplicated, block: B:81:0x0165  */
    /* JADX WARN: Code duplicated, block: B:82:0x0168  */
    /* JADX WARN: Code duplicated, block: B:83:0x016b  */
    /* JADX WARN: Code duplicated, block: B:85:0x016f  */
    /* JADX WARN: Code duplicated, block: B:86:0x018a  */
    /* JADX WARN: Code duplicated, block: B:88:0x018d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0190  */
    /* JADX WARN: Code duplicated, block: B:91:0x0195  */
    /* JADX WARN: Code duplicated, block: B:93:0x0198  */
    /* JADX WARN: Code duplicated, block: B:94:0x019a  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x01a6  */
    /* JADX WARN: Instruction removed from duplicated block: B:105:0x01d7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:109:0x0212, please report this as an issue */
    public final A3.g n(Package r25, boolean z8, Map map) {
        Period period;
        SubscriptionOption freeTrial;
        PricingPhase freePhase;
        Period billingPeriod;
        String str;
        String string;
        String string2;
        String strF;
        int iS;
        String strSubstring;
        String str2;
        Period.Unit unit;
        int i8;
        String str3;
        String formatted;
        String str4;
        boolean z9;
        boolean z10;
        Integer numValueOf;
        String strName;
        Period.Unit unit2;
        int i9;
        int i10;
        String quantityString;
        int i11;
        int i12;
        r7.c cVarB = r7.p.b(null, k.f798a, 1, null);
        AmazonStoreProduct amazonProduct = AmazonStoreProductKt.getAmazonProduct(r25.getProduct());
        String strValueOf = String.valueOf(amazonProduct != null ? amazonProduct.getOriginalProductJSON() : null);
        cVarB.a();
        A3.a aVar = (A3.a) cVarB.b(p125n7.a.u(A3.a.Companion.serializer()), strValueOf);
        if (G3.h.a()) {
            period = aVar != null ? aVar.b() : null;
        } else {
            period = r25.getProduct().getPeriod();
        }
        if (!G3.h.a()) {
            SubscriptionOptions subscriptionOptions = r25.getProduct().getSubscriptionOptions();
            if (subscriptionOptions == null || (freeTrial = subscriptionOptions.getFreeTrial()) == null || (freePhase = freeTrial.getFreePhase()) == null) {
                billingPeriod = null;
            } else {
                billingPeriod = freePhase.getBillingPeriod();
            }
        } else if (aVar != null) {
            billingPeriod = aVar.a();
        } else {
            billingPeriod = null;
        }
        Object obj = map != null ? map.get("best_value") : null;
        Object obj2 = map != null ? map.get("most_popular") : null;
        Object obj3 = map != null ? map.get("default") : null;
        String identifier = r25.getIdentifier();
        if (!t.c(identifier, obj)) {
            if (t.c(identifier, obj2)) {
                string = this.f751a.getString(p194w3.b.f36962K0);
            } else {
                str = null;
            }
            string2 = "";
            if (period != null) {
                strF = s.f806a.f(r25.getProduct().getTitle(), "");
                iS = w.S(strF);
                while (true) {
                    if (-1 < iS) {
                        strSubstring = "";
                        break;
                    }
                    if (!Character.valueOf(strF.charAt(iS)).equals(" ")) {
                        strSubstring = strF.substring(0, iS + 1);
                        t.f(strSubstring, "substring(...)");
                        break;
                    }
                    iS--;
                }
            } else {
                i11 = c.f768b[period.getUnit().ordinal()];
                if (i11 != 1) {
                    i12 = p194w3.a.f36923b;
                } else if (i11 != 2) {
                    i12 = p194w3.a.f36925d;
                } else if (i11 != 3) {
                    i12 = p194w3.a.f36924c;
                } else if (i11 != 4) {
                    i12 = p194w3.a.f36926e;
                } else {
                    if (i11 == 5) {
                        throw new C6.m();
                    }
                    i12 = 0;
                }
                if (i12 != 0) {
                    strSubstring = this.f751a.getResources().getQuantityString(i12, period.getValue(), Integer.valueOf(period.getValue()));
                } else {
                    strSubstring = null;
                }
                if (strSubstring == null) {
                    strF = s.f806a.f(r25.getProduct().getTitle(), "");
                    iS = w.S(strF);
                    while (true) {
                        if (-1 < iS) {
                            strSubstring = "";
                            break;
                        }
                        if (!Character.valueOf(strF.charAt(iS)).equals(" ")) {
                            strSubstring = strF.substring(0, iS + 1);
                            t.f(strSubstring, "substring(...)");
                            break;
                        }
                        iS--;
                    }
                }
            }
            t.d(strSubstring);
            if (billingPeriod != null) {
                i9 = c.f768b[billingPeriod.getUnit().ordinal()];
                if (i9 != 1) {
                    i10 = p194w3.a.f36927f;
                } else if (i9 != 2) {
                    i10 = p194w3.a.f36929h;
                } else if (i9 != 3) {
                    i10 = p194w3.a.f36928g;
                } else if (i9 != 4) {
                    i10 = p194w3.a.f36930i;
                } else {
                    if (i9 == 5) {
                        throw new C6.m();
                    }
                    i10 = 0;
                }
                if (i10 != 0) {
                    quantityString = this.f751a.getResources().getQuantityString(i10, billingPeriod.getValue(), Integer.valueOf(billingPeriod.getValue()));
                } else {
                    quantityString = null;
                }
                str2 = quantityString;
            } else {
                str2 = null;
            }
            if (period != null) {
                unit = period.getUnit();
            } else {
                unit = null;
            }
            if (unit == null) {
                i8 = -1;
            } else {
                i8 = c.f768b[unit.ordinal()];
            }
            if (i8 != -1) {
                string2 = this.f751a.getString(p194w3.b.f36953H0);
            } else if (i8 != 3) {
                string2 = this.f751a.getString(p194w3.b.f36950G0);
            } else if (i8 == 4) {
                string2 = this.f751a.getString(p194w3.b.f36947F0);
            }
            str3 = string2;
            t.d(str3);
            formatted = r25.getProduct().getPrice().getFormatted();
            if (billingPeriod != null) {
                str4 = str2 + " - " + this.f751a.getResources().getString(p194w3.b.f36956I0, r25.getProduct().getPrice().getFormatted()) + " " + str3;
                if (str4 == null) {
                    str4 = formatted + " " + str3;
                }
            } else {
                str4 = formatted + " " + str3;
            }
            String str5 = str4;
            String id = r25.getProduct().getId();
            if (r25.getProduct().getSubscriptionOptions() != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (billingPeriod != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            String offeringIdentifier = r25.getPresentedOfferingContext().getOfferingIdentifier();
            String strValueOf2 = String.valueOf(r25.getProduct().getPrice().getAmountMicros());
            String currencyCode = r25.getProduct().getPrice().getCurrencyCode();
            if (period != null) {
                numValueOf = Integer.valueOf(period.getValue());
            } else {
                numValueOf = null;
            }
            String strValueOf3 = String.valueOf(numValueOf);
            if (period != null || (unit2 = period.getUnit()) == null) {
                strName = null;
            } else {
                strName = unit2.name();
            }
            return new A3.g(id, strSubstring, str2, formatted, str3, str, t.c(r25.getIdentifier(), obj3), str5, z9, z10, z8, offeringIdentifier, strValueOf2, currencyCode, strValueOf3, strName);
        }
        string = this.f751a.getString(p194w3.b.f36959J0);
        str = string;
        string2 = "";
        if (period != null) {
            strF = s.f806a.f(r25.getProduct().getTitle(), "");
            iS = w.S(strF);
            while (true) {
                if (-1 < iS) {
                    strSubstring = "";
                    break;
                }
                if (!Character.valueOf(strF.charAt(iS)).equals(" ")) {
                    strSubstring = strF.substring(0, iS + 1);
                    t.f(strSubstring, "substring(...)");
                    break;
                }
                iS--;
            }
        } else {
            i11 = c.f768b[period.getUnit().ordinal()];
            if (i11 != 1) {
                i12 = p194w3.a.f36923b;
            } else if (i11 != 2) {
                i12 = p194w3.a.f36925d;
            } else if (i11 != 3) {
                i12 = p194w3.a.f36924c;
            } else if (i11 != 4) {
                i12 = p194w3.a.f36926e;
            } else {
                if (i11 == 5) {
                    throw new C6.m();
                }
                i12 = 0;
            }
            if (i12 != 0) {
                strSubstring = this.f751a.getResources().getQuantityString(i12, period.getValue(), Integer.valueOf(period.getValue()));
            } else {
                strSubstring = null;
            }
            if (strSubstring == null) {
                strF = s.f806a.f(r25.getProduct().getTitle(), "");
                iS = w.S(strF);
                while (true) {
                    if (-1 < iS) {
                        strSubstring = "";
                        break;
                    }
                    if (!Character.valueOf(strF.charAt(iS)).equals(" ")) {
                        strSubstring = strF.substring(0, iS + 1);
                        t.f(strSubstring, "substring(...)");
                        break;
                    }
                    iS--;
                }
            }
        }
        t.d(strSubstring);
        if (billingPeriod != null) {
            i9 = c.f768b[billingPeriod.getUnit().ordinal()];
            if (i9 != 1) {
                i10 = p194w3.a.f36927f;
            } else if (i9 != 2) {
                i10 = p194w3.a.f36929h;
            } else if (i9 != 3) {
                i10 = p194w3.a.f36928g;
            } else if (i9 != 4) {
                i10 = p194w3.a.f36930i;
            } else {
                if (i9 == 5) {
                    throw new C6.m();
                }
                i10 = 0;
            }
            if (i10 != 0) {
                quantityString = this.f751a.getResources().getQuantityString(i10, billingPeriod.getValue(), Integer.valueOf(billingPeriod.getValue()));
            } else {
                quantityString = null;
            }
            str2 = quantityString;
        } else {
            str2 = null;
        }
        if (period != null) {
            unit = period.getUnit();
        } else {
            unit = null;
        }
        if (unit == null) {
            i8 = -1;
        } else {
            i8 = c.f768b[unit.ordinal()];
        }
        if (i8 != -1) {
            string2 = this.f751a.getString(p194w3.b.f36953H0);
        } else if (i8 != 3) {
            string2 = this.f751a.getString(p194w3.b.f36950G0);
        } else if (i8 == 4) {
            string2 = this.f751a.getString(p194w3.b.f36947F0);
        }
        str3 = string2;
        t.d(str3);
        formatted = r25.getProduct().getPrice().getFormatted();
        if (billingPeriod != null) {
            str4 = str2 + " - " + this.f751a.getResources().getString(p194w3.b.f36956I0, r25.getProduct().getPrice().getFormatted()) + " " + str3;
            if (str4 == null) {
                str4 = formatted + " " + str3;
            }
        } else {
            str4 = formatted + " " + str3;
        }
        String str6 = str4;
        String id2 = r25.getProduct().getId();
        if (r25.getProduct().getSubscriptionOptions() != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (billingPeriod != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        String offeringIdentifier2 = r25.getPresentedOfferingContext().getOfferingIdentifier();
        String strValueOf4 = String.valueOf(r25.getProduct().getPrice().getAmountMicros());
        String currencyCode2 = r25.getProduct().getPrice().getCurrencyCode();
        if (period != null) {
            numValueOf = Integer.valueOf(period.getValue());
        } else {
            numValueOf = null;
        }
        String strValueOf5 = String.valueOf(numValueOf);
        if (period != null) {
            strName = null;
        } else {
            strName = null;
        }
        return new A3.g(id2, strSubstring, str2, formatted, str3, str, t.c(r25.getIdentifier(), obj3), str6, z9, z10, z8, offeringIdentifier2, strValueOf4, currencyCode2, strValueOf5, strName);
    }

    public final void p(A3.e eVar) {
        if (eVar instanceof A3.e.b) {
            b bVar = f748i;
            V3.f.a(s.b(bVar, true));
            V3.f.a(s.j(bVar, false));
            Date dateA = ((A3.e.b) eVar).a();
            V3.f.a(s.c(bVar, String.valueOf(dateA != null ? dateA.getTime() / ((long) 1000) : -1L)));
            V3.f.a(s.f(bVar, "-1"));
            V3.f.a(s.e(bVar, "-1"));
            V3.f.a(s.g(bVar, "-1"));
            V3.f.a(s.i(bVar, "-1"));
            V3.f.a(s.d(bVar, false));
            V3.f.a(s.h(bVar, true));
            return;
        }
        if (!(eVar instanceof A3.e.a)) {
            if (eVar == null) {
                b bVar2 = f748i;
                V3.f.a(s.b(bVar2, false));
                V3.f.a(s.j(bVar2, false));
                V3.f.a(s.c(bVar2, "-1"));
                V3.f.a(s.f(bVar2, "-1"));
                V3.f.a(s.e(bVar2, "-1"));
                V3.f.a(s.g(bVar2, "-1"));
                V3.f.a(s.i(bVar2, "-1"));
                V3.f.a(s.d(bVar2, false));
                V3.f.a(s.h(bVar2, false));
                return;
            }
            return;
        }
        b bVar3 = f748i;
        V3.f.a(s.b(bVar3, true));
        A3.e.a aVar = (A3.e.a) eVar;
        V3.f.a(s.j(bVar3, aVar.i()));
        Date dateB = aVar.b();
        V3.f.a(s.c(bVar3, String.valueOf(dateB != null ? dateB.getTime() / ((long) 1000) : -1L)));
        Date dateE = aVar.e();
        V3.f.a(s.f(bVar3, String.valueOf(dateE != null ? dateE.getTime() / ((long) 1000) : -1L)));
        Date dateD = aVar.d();
        V3.f.a(s.e(bVar3, String.valueOf(dateD != null ? dateD.getTime() / ((long) 1000) : -1L)));
        V3.f.a(s.g(bVar3, aVar.f()));
        Date dateH = aVar.h();
        V3.f.a(s.i(bVar3, String.valueOf(dateH != null ? dateH.getTime() / ((long) 1000) : -1L)));
        V3.f.a(s.d(bVar3, aVar.c()));
        V3.f.a(s.h(bVar3, false));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(A3.e eVar, G6.d dVar) {
        l lVar;
        r rVar;
        A3.e eVar2;
        int i8;
        int i9;
        A3.e eVar3;
        r rVar2;
        if (dVar instanceof l) {
            lVar = (l) dVar;
            int i10 = lVar.f805g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f805g = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(dVar);
            }
        } else {
            lVar = new l(dVar);
        }
        Object obj = lVar.f803e;
        Object objF = H6.c.f();
        int i11 = lVar.f805g;
        if (i11 == 0) {
            C6.r.b(obj);
            int i12 = eVar != null ? 1 : 0;
            AppSettingsStore appSettingsStore = this.f752b;
            lVar.f799a = this;
            lVar.f800b = eVar;
            lVar.f801c = i12;
            lVar.f802d = i12;
            lVar.f805g = 1;
            Object obj2 = appSettingsStore.get(lVar);
            if (obj2 != objF) {
                rVar = this;
                eVar2 = eVar;
                i8 = i12;
                obj = obj2;
                i9 = i8;
            }
            return objF;
        }
        if (i11 == 1) {
            i8 = lVar.f802d;
            i9 = lVar.f801c;
            eVar2 = (A3.e) lVar.f800b;
            rVar = (r) lVar.f799a;
            C6.r.b(obj);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar3 = (A3.e) lVar.f800b;
            rVar2 = (r) lVar.f799a;
            C6.r.b(obj);
        }
        eVar2 = eVar3;
        rVar = rVar2;
        if (!t.c(eVar2, rVar.f757g)) {
            rVar.p(eVar2);
        }
        rVar.f757g = eVar2;
        return G.f1419a;
        if (i8 != ((AppSettings) obj).getIsProUser()) {
            Z2.j jVar = f750k;
            String str = "Set isProUser to " + (i9 != 0);
            String strC = jVar.c();
            Z2.p pVar = Z2.p.Debug;
            if (jVar.a().a().compareTo(pVar) <= 0) {
                jVar.b(pVar, strC, null, str);
            }
            AppSettingsStore appSettingsStore2 = rVar.f752b;
            boolean z8 = i9 != 0;
            lVar.f799a = rVar;
            lVar.f800b = eVar2;
            lVar.f805g = 2;
            if (appSettingsStore2.updateIsProUser(z8, lVar) != objF) {
                eVar3 = eVar2;
                rVar2 = rVar;
                eVar2 = eVar3;
                rVar = rVar2;
            }
            return objF;
        }
        if (!t.c(eVar2, rVar.f757g)) {
            rVar.p(eVar2);
        }
        rVar.f757g = eVar2;
        return G.f1419a;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f759a;

        /* JADX INFO: renamed from: A3.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0016a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r f761a;

            public C0016a(r rVar) {
                this.f761a = rVar;
            }

            public final Object a(boolean z8, G6.d dVar) {
                Z2.j jVar = r.f750k;
                String strC = jVar.c();
                Z2.p pVar = Z2.p.Debug;
                if (jVar.a().a().compareTo(pVar) <= 0) {
                    jVar.b(pVar, strC, null, "Reload entitlement because we are online");
                }
                this.f761a.m();
                return G.f1419a;
            }

            @Override // p044e7.InterfaceC2261g
            public /* bridge */ /* synthetic */ Object emit(Object obj, G6.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b implements InterfaceC2260f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2260f f762a;

            /* JADX INFO: renamed from: A3.r$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0017a implements InterfaceC2261g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2261g f763a;

                /* JADX INFO: renamed from: A3.r$a$b$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0018a extends I6.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f764a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f765b;

                    public C0018a(G6.d dVar) {
                        super(dVar);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        this.f764a = obj;
                        this.f765b |= Integer.MIN_VALUE;
                        return C0017a.this.emit(null, this);
                    }
                }

                public C0017a(InterfaceC2261g interfaceC2261g) {
                    this.f763a = interfaceC2261g;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p044e7.InterfaceC2261g
                public final Object emit(Object obj, G6.d dVar) {
                    C0018a c0018a;
                    if (dVar instanceof C0018a) {
                        c0018a = (C0018a) dVar;
                        int i8 = c0018a.f765b;
                        if ((i8 & Integer.MIN_VALUE) != 0) {
                            c0018a.f765b = i8 - Integer.MIN_VALUE;
                        } else {
                            c0018a = new C0018a(dVar);
                        }
                    } else {
                        c0018a = new C0018a(dVar);
                    }
                    Object obj2 = c0018a.f764a;
                    Object objF = H6.c.f();
                    int i9 = c0018a.f765b;
                    if (i9 == 0) {
                        C6.r.b(obj2);
                        InterfaceC2261g interfaceC2261g = this.f763a;
                        if (((Boolean) obj).booleanValue()) {
                            c0018a.f765b = 1;
                            if (interfaceC2261g.emit(obj, c0018a) == objF) {
                                return objF;
                            }
                        }
                    } else {
                        if (i9 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(obj2);
                    }
                    return G.f1419a;
                }
            }

            public b(InterfaceC2260f interfaceC2260f) {
                this.f762a = interfaceC2260f;
            }

            @Override // p044e7.InterfaceC2260f
            public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
                Object objCollect = this.f762a.collect(new C0017a(interfaceC2261g), dVar);
                return objCollect == H6.c.f() ? objCollect : G.f1419a;
            }
        }

        public a(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return r.this.new a(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f759a;
            if (i8 != 0) {
                if (i8 == 1) {
                    C6.r.b(obj);
                } else {
                    throw new IllegalStateException(SZCvugJaXc.DqErEcvMLGyk);
                }
            } else {
                C6.r.b(obj);
                b bVar = new b(r.this.f754d.a());
                C0016a c0016a = new C0016a(r.this);
                this.f759a = 1;
                if (bVar.collect(c0016a, this) == objF) {
                    return objF;
                }
            }
            return G.f1419a;
        }
    }
}
