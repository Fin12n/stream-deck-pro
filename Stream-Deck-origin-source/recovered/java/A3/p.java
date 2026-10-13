package A3;

import C6.G;
import android.app.Activity;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.PurchasesTransactionException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1789i;
import p017b7.Q;
import p044e7.AbstractC2262h;
import p044e7.D;
import p044e7.H;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p044e7.M;
import p044e7.w;
import p180u5.FCkZ.BpgIURjN;
import p181u6.GfRt.QhsKALGiniuQ;
import p215z0.InterfaceC3164l0;
import p215z0.l1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f698g = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.elgato.streamdeck.a.b f700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O3.b f701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M f703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3164l0 f704f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
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
    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f705a = new c();

        public c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 248106315;
        }

        public String toString() {
            return "Offline";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final A3.g f707b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Activity activity, A3.g product) {
            super(null);
            t.g(activity, "activity");
            t.g(product, "product");
            this.f706a = activity;
            this.f707b = product;
        }

        public final Activity a() {
            return this.f706a;
        }

        public final A3.g b() {
            return this.f707b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return t.c(this.f706a, dVar.f706a) && t.c(this.f707b, dVar.f707b);
        }

        public int hashCode() {
            return (this.f706a.hashCode() * 31) + this.f707b.hashCode();
        }

        public String toString() {
            return "Purchase(activity=" + this.f706a + ", product=" + this.f707b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f708a = new e();

        public e() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -183945935;
        }

        public String toString() {
            return "Reload";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f709a = new f();

        public f() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return -1293441769;
        }

        public String toString() {
            return "RestorePurchase";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f712c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final A3.e f713d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final A3.g f714e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f715f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f716g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Throwable f717h;

        public g() {
            this(false, false, false, null, null, null, null, null, 255, null);
        }

        public static /* synthetic */ g b(g gVar, boolean z8, boolean z9, boolean z10, A3.e eVar, A3.g gVar2, String str, List list, Throwable th, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                z8 = gVar.f710a;
            }
            if ((i8 & 2) != 0) {
                z9 = gVar.f711b;
            }
            if ((i8 & 4) != 0) {
                z10 = gVar.f712c;
            }
            if ((i8 & 8) != 0) {
                eVar = gVar.f713d;
            }
            if ((i8 & 16) != 0) {
                gVar2 = gVar.f714e;
            }
            if ((i8 & 32) != 0) {
                str = gVar.f715f;
            }
            if ((i8 & 64) != 0) {
                list = gVar.f716g;
            }
            if ((i8 & 128) != 0) {
                th = gVar.f717h;
            }
            List list2 = list;
            Throwable th2 = th;
            A3.g gVar3 = gVar2;
            String str2 = str;
            return gVar.a(z8, z9, z10, eVar, gVar3, str2, list2, th2);
        }

        public final g a(boolean z8, boolean z9, boolean z10, A3.e eVar, A3.g gVar, String str, List products, Throwable th) {
            t.g(products, "products");
            return new g(z8, z9, z10, eVar, gVar, str, products, th);
        }

        public final A3.g c() {
            return this.f714e;
        }

        public final A3.e d() {
            return this.f713d;
        }

        public final Throwable e() {
            return this.f717h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f710a == gVar.f710a && this.f711b == gVar.f711b && this.f712c == gVar.f712c && t.c(this.f713d, gVar.f713d) && t.c(this.f714e, gVar.f714e) && t.c(this.f715f, gVar.f715f) && t.c(this.f716g, gVar.f716g) && t.c(this.f717h, gVar.f717h);
        }

        public final String f() {
            return this.f715f;
        }

        public final List g() {
            return this.f716g;
        }

        public final boolean h() {
            return this.f712c;
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.f710a) * 31) + Boolean.hashCode(this.f711b)) * 31) + Boolean.hashCode(this.f712c)) * 31;
            A3.e eVar = this.f713d;
            int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
            A3.g gVar = this.f714e;
            int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            String str = this.f715f;
            int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.f716g.hashCode()) * 31;
            Throwable th = this.f717h;
            return iHashCode4 + (th != null ? th.hashCode() : 0);
        }

        public final boolean i() {
            return this.f710a;
        }

        public final boolean j() {
            return this.f711b;
        }

        public String toString() {
            return "State(isLoading=" + this.f710a + ", isOnline=" + this.f711b + ", storeNotSupported=" + this.f712c + ", entitlement=" + this.f713d + ", activeProduct=" + this.f714e + ", managementURL=" + this.f715f + ", products=" + this.f716g + ", error=" + this.f717h + ")";
        }

        public g(boolean z8, boolean z9, boolean z10, A3.e eVar, A3.g gVar, String str, List<A3.g> products, Throwable th) {
            t.g(products, "products");
            this.f710a = z8;
            this.f711b = z9;
            this.f712c = z10;
            this.f713d = eVar;
            this.f714e = gVar;
            this.f715f = str;
            this.f716g = products;
            this.f717h = th;
        }

        public /* synthetic */ g(boolean z8, boolean z9, boolean z10, A3.e eVar, A3.g gVar, String str, List list, Throwable th, int i8, AbstractC2633k abstractC2633k) {
            this((i8 & 1) != 0 ? true : z8, (i8 & 2) != 0 ? true : z9, (i8 & 4) != 0 ? false : z10, (i8 & 8) != 0 ? null : eVar, (i8 & 16) != 0 ? null : gVar, (i8 & 32) != 0 ? null : str, (i8 & 64) != 0 ? D6.r.n() : list, (i8 & 128) != 0 ? null : th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ R3.a f720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p f721d;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ J f722a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f723b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f724c;

            /* JADX INFO: renamed from: A3.p$h$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0013a extends I6.l implements Q6.o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public Object f725a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f726b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f727c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ J f728d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ p f729e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2261g f730f;

                /* JADX INFO: renamed from: A3.p$h$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0014a extends I6.l implements Q6.o {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public int f731a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ p f732b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0014a(p pVar, G6.d dVar) {
                        super(2, dVar);
                        this.f732b = pVar;
                    }

                    @Override // I6.a
                    public final G6.d create(Object obj, G6.d dVar) {
                        return new C0014a(this.f732b, dVar);
                    }

                    @Override // Q6.o
                    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(p017b7.J j8, G6.d dVar) {
                        return ((C0014a) create(j8, dVar)).invokeSuspend(G.f1419a);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        Object objF = H6.c.f();
                        int i8 = this.f731a;
                        if (i8 != 0) {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C6.r.b(obj);
                            return obj;
                        }
                        C6.r.b(obj);
                        n nVar = this.f732b.f699a;
                        this.f731a = 1;
                        Object objF2 = nVar.f(this);
                        return objF2 == objF ? objF : objF2;
                    }
                }

                /* JADX INFO: renamed from: A3.p$h$a$a$b */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class b extends I6.l implements Q6.o {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public int f733a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ p f734b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(p pVar, G6.d dVar) {
                        super(2, dVar);
                        this.f734b = pVar;
                    }

                    @Override // I6.a
                    public final G6.d create(Object obj, G6.d dVar) {
                        return new b(this.f734b, dVar);
                    }

                    @Override // Q6.o
                    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(p017b7.J j8, G6.d dVar) {
                        return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        Object objF = H6.c.f();
                        int i8 = this.f733a;
                        if (i8 != 0) {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C6.r.b(obj);
                            return obj;
                        }
                        C6.r.b(obj);
                        n nVar = this.f734b.f699a;
                        this.f733a = 1;
                        Object objH = nVar.h(this);
                        return objH == objF ? objF : objH;
                    }
                }

                /* JADX INFO: renamed from: A3.p$h$a$a$c */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class c extends I6.l implements Q6.o {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public int f735a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ p f736b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public c(p pVar, G6.d dVar) {
                        super(2, dVar);
                        this.f736b = pVar;
                    }

                    @Override // I6.a
                    public final G6.d create(Object obj, G6.d dVar) {
                        return new c(this.f736b, dVar);
                    }

                    @Override // Q6.o
                    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(p017b7.J j8, G6.d dVar) {
                        return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        Object objF = H6.c.f();
                        int i8 = this.f735a;
                        if (i8 != 0) {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C6.r.b(obj);
                            return obj;
                        }
                        C6.r.b(obj);
                        n nVar = this.f736b.f699a;
                        this.f735a = 1;
                        Object objA = nVar.a(this);
                        return objA == objF ? objF : objA;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0013a(J j8, p pVar, InterfaceC2261g interfaceC2261g, G6.d dVar) {
                    super(2, dVar);
                    this.f728d = j8;
                    this.f729e = pVar;
                    this.f730f = interfaceC2261g;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    C0013a c0013a = new C0013a(this.f728d, this.f729e, this.f730f, dVar);
                    c0013a.f727c = obj;
                    return c0013a;
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(p017b7.J j8, G6.d dVar) {
                    return ((C0013a) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                /* JADX WARN: Code duplicated, block: B:24:0x00af  */
                /* JADX WARN: Code duplicated, block: B:28:0x00cb  */
                /* JADX WARN: Code duplicated, block: B:37:0x00d8 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:39:0x00c5 A[SYNTHETIC] */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x00fc, code lost:
                
                    if (r2.emit(r4, r19) == r1) goto L33;
                 */
                @Override // I6.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Q qB;
                    Object objQ0;
                    Q q8;
                    A3.e eVar;
                    Object objQ1;
                    List list;
                    Object objQ2;
                    A3.e eVar2;
                    List list2;
                    ArrayList arrayList;
                    Object objF = H6.c.f();
                    int i8 = this.f726b;
                    if (i8 == 0) {
                        C6.r.b(obj);
                        p017b7.J j8 = (p017b7.J) this.f727c;
                        Q qB2 = AbstractC1789i.b(j8, null, null, new C0014a(this.f729e, null), 3, null);
                        Q qB3 = AbstractC1789i.b(j8, null, null, new c(this.f729e, null), 3, null);
                        qB = AbstractC1789i.b(j8, null, null, new b(this.f729e, null), 3, null);
                        this.f727c = qB3;
                        this.f725a = qB;
                        this.f726b = 1;
                        objQ0 = qB2.Q0(this);
                        if (objQ0 != objF) {
                            q8 = qB3;
                        }
                        return objF;
                    }
                    if (i8 == 1) {
                        Q q9 = (Q) this.f725a;
                        q8 = (Q) this.f727c;
                        C6.r.b(obj);
                        qB = q9;
                        objQ0 = obj;
                    } else {
                        if (i8 == 2) {
                            eVar = (A3.e) this.f725a;
                            Q q10 = (Q) this.f727c;
                            C6.r.b(obj);
                            qB = q10;
                            objQ1 = obj;
                            list = (List) objQ1;
                            this.f727c = eVar;
                            this.f725a = list;
                            this.f726b = 3;
                            objQ2 = qB.Q0(this);
                            if (objQ2 != objF) {
                                eVar2 = eVar;
                                list2 = list;
                                String str = (String) objQ2;
                                J j9 = this.f728d;
                                A3.g gVarF = this.f729e.f(list2, eVar2);
                                arrayList = new ArrayList();
                                for (Object obj2 : list2) {
                                    if (!((A3.g) obj2).o()) {
                                        arrayList.add(obj2);
                                    }
                                }
                                j9.f28779a = new g(false, false, false, eVar2, gVarF, str, arrayList, null, 6, null);
                                InterfaceC2261g interfaceC2261g = this.f730f;
                                Object obj3 = this.f728d.f28779a;
                                this.f727c = null;
                                this.f725a = null;
                                this.f726b = 4;
                            }
                            return objF;
                        }
                        if (i8 == 3) {
                            list2 = (List) this.f725a;
                            A3.e eVar3 = (A3.e) this.f727c;
                            C6.r.b(obj);
                            eVar2 = eVar3;
                            objQ2 = obj;
                            String str2 = (String) objQ2;
                            J j10 = this.f728d;
                            A3.g gVarF2 = this.f729e.f(list2, eVar2);
                            arrayList = new ArrayList();
                            while (r2.hasNext()) {
                                if (!((A3.g) obj2).o()) {
                                    arrayList.add(obj2);
                                }
                            }
                            j10.f28779a = new g(false, false, false, eVar2, gVarF2, str2, arrayList, null, 6, null);
                            InterfaceC2261g interfaceC2261g2 = this.f730f;
                            Object obj4 = this.f728d.f28779a;
                            this.f727c = null;
                            this.f725a = null;
                            this.f726b = 4;
                        } else {
                            if (i8 != 4) {
                                throw new IllegalStateException(QhsKALGiniuQ.XgGnV);
                            }
                            C6.r.b(obj);
                        }
                    }
                    return G.f1419a;
                    eVar = (A3.e) objQ0;
                    this.f727c = qB;
                    this.f725a = eVar;
                    this.f726b = 2;
                    objQ1 = q8.Q0(this);
                    if (objQ1 != objF) {
                        list = (List) objQ1;
                        this.f727c = eVar;
                        this.f725a = list;
                        this.f726b = 3;
                        objQ2 = qB.Q0(this);
                        if (objQ2 != objF) {
                            eVar2 = eVar;
                            list2 = list;
                            String str3 = (String) objQ2;
                            J j11 = this.f728d;
                            A3.g gVarF3 = this.f729e.f(list2, eVar2);
                            arrayList = new ArrayList();
                            while (r2.hasNext()) {
                                if (!((A3.g) obj2).o()) {
                                    arrayList.add(obj2);
                                }
                            }
                            j11.f28779a = new g(false, false, false, eVar2, gVarF3, str3, arrayList, null, 6, null);
                            InterfaceC2261g interfaceC2261g3 = this.f730f;
                            Object obj5 = this.f728d.f28779a;
                            this.f727c = null;
                            this.f725a = null;
                            this.f726b = 4;
                        }
                    }
                    return objF;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public /* synthetic */ class b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f737a;

                static {
                    int[] iArr = new int[PurchasesErrorCode.values().length];
                    try {
                        iArr[PurchasesErrorCode.PurchaseNotAllowedError.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f737a = iArr;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class c extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public Object f738a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public Object f739b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f740c;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public int f742e;

                public c(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f740c = obj;
                    this.f742e |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(J j8, InterfaceC2261g interfaceC2261g, p pVar) {
                this.f722a = j8;
                this.f723b = interfaceC2261g;
                this.f724c = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:111:0x0350  */
            /* JADX WARN: Code duplicated, block: B:112:0x0352 A[Catch: all -> 0x003d, PHI: r0 r2
              0x0352: PHI (r0v74 java.lang.Object) = (r0v73 java.lang.Object), (r0v1 java.lang.Object) binds: [B:110:0x034e, B:18:0x0044] A[DONT_GENERATE, DONT_INLINE]
              0x0352: PHI (r2v50 A3.p$h$a) = (r2v47 A3.p$h$a), (r2v52 A3.p$h$a) binds: [B:110:0x034e, B:18:0x0044] A[DONT_GENERATE, DONT_INLINE], TryCatch #5 {all -> 0x003d, blocks: (B:13:0x0038, B:18:0x0044, B:112:0x0352, B:114:0x0367, B:116:0x0382, B:118:0x039d, B:119:0x03a6, B:115:0x0375, B:21:0x004d, B:109:0x033e), top: B:137:0x0029 }] */
            /* JADX WARN: Code duplicated, block: B:114:0x0367 A[Catch: all -> 0x003d, TryCatch #5 {all -> 0x003d, blocks: (B:13:0x0038, B:18:0x0044, B:112:0x0352, B:114:0x0367, B:116:0x0382, B:118:0x039d, B:119:0x03a6, B:115:0x0375, B:21:0x004d, B:109:0x033e), top: B:137:0x0029 }] */
            /* JADX WARN: Code duplicated, block: B:115:0x0375 A[Catch: all -> 0x003d, TryCatch #5 {all -> 0x003d, blocks: (B:13:0x0038, B:18:0x0044, B:112:0x0352, B:114:0x0367, B:116:0x0382, B:118:0x039d, B:119:0x03a6, B:115:0x0375, B:21:0x004d, B:109:0x033e), top: B:137:0x0029 }] */
            /* JADX WARN: Code duplicated, block: B:118:0x039d A[Catch: all -> 0x003d, TryCatch #5 {all -> 0x003d, blocks: (B:13:0x0038, B:18:0x0044, B:112:0x0352, B:114:0x0367, B:116:0x0382, B:118:0x039d, B:119:0x03a6, B:115:0x0375, B:21:0x004d, B:109:0x033e), top: B:137:0x0029 }] */
            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            /* JADX WARN: Code duplicated, block: B:85:0x021d  */
            /* JADX WARN: Code duplicated, block: B:86:0x021f A[Catch: all -> 0x005f, PHI: r0 r2 r5
              0x021f: PHI (r0v63 java.lang.Object) = (r0v62 java.lang.Object), (r0v1 java.lang.Object) binds: [B:84:0x021b, B:29:0x006a] A[DONT_GENERATE, DONT_INLINE]
              0x021f: PHI (r2v42 java.lang.Object) = (r2v55 java.lang.Object), (r2v56 java.lang.Object) binds: [B:84:0x021b, B:29:0x006a] A[DONT_GENERATE, DONT_INLINE]
              0x021f: PHI (r5v31 A3.p$h$a) = (r5v28 A3.p$h$a), (r5v33 A3.p$h$a) binds: [B:84:0x021b, B:29:0x006a] A[DONT_GENERATE, DONT_INLINE], TryCatch #7 {all -> 0x005f, blocks: (B:24:0x005a, B:29:0x006a, B:86:0x021f, B:88:0x0224, B:90:0x024d, B:89:0x0239, B:32:0x0077, B:83:0x01fc), top: B:137:0x0029 }] */
            /* JADX WARN: Code duplicated, block: B:88:0x0224 A[Catch: all -> 0x005f, TryCatch #7 {all -> 0x005f, blocks: (B:24:0x005a, B:29:0x006a, B:86:0x021f, B:88:0x0224, B:90:0x024d, B:89:0x0239, B:32:0x0077, B:83:0x01fc), top: B:137:0x0029 }] */
            /* JADX WARN: Code duplicated, block: B:89:0x0239 A[Catch: all -> 0x005f, TryCatch #7 {all -> 0x005f, blocks: (B:24:0x005a, B:29:0x006a, B:86:0x021f, B:88:0x0224, B:90:0x024d, B:89:0x0239, B:32:0x0077, B:83:0x01fc), top: B:137:0x0029 }] */
            /* JADX WARN: Code restructure failed: missing block: B:100:0x02f5, code lost:
            
                if (r0.emit(r2, r3) == r4) goto L130;
             */
            /* JADX WARN: Code restructure failed: missing block: B:120:0x03b6, code lost:
            
                if (r0.emit(r5, r3) == r4) goto L130;
             */
            /* JADX WARN: Code restructure failed: missing block: B:129:0x040f, code lost:
            
                if (r0.emit(r2, r3) == r4) goto L130;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x00e5, code lost:
            
                if (p017b7.K.f(r0, r3) == r4) goto L130;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x0121, code lost:
            
                if (r0.emit(r2, r3) == r4) goto L130;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x0179, code lost:
            
                if (r0.emit(r2, r3) == r4) goto L130;
             */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x01a6, code lost:
            
                if (r0.emit(r2, r3) == r4) goto L130;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x0285, code lost:
            
                if (r0.emit(r9, r3) == r4) goto L130;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0, types: [int] */
            /* JADX WARN: Type inference failed for: r5v18 */
            @Override // p044e7.InterfaceC2261g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(a aVar, G6.d dVar) {
                c cVar;
                a aVar2;
                a aVar3;
                a aVar4;
                Object obj;
                Object obj2;
                A3.e eVar;
                A3.e eVar2;
                A3.g gVarF;
                a aVar5 = aVar;
                if (dVar instanceof c) {
                    cVar = (c) dVar;
                    int i8 = cVar.f742e;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        cVar.f742e = i8 - Integer.MIN_VALUE;
                    } else {
                        cVar = new c(dVar);
                    }
                } else {
                    cVar = new c(dVar);
                }
                Object objB = cVar.f740c;
                Object objF = H6.c.f();
                a aVar6 = cVar.f742e;
                try {
                    try {
                        try {
                            switch (aVar6) {
                                case 0:
                                    C6.r.b(objB);
                                    if (!t.c(aVar5, e.f708a)) {
                                        if (!t.c(aVar5, c.f705a)) {
                                            if (!(aVar5 instanceof d)) {
                                                if (t.c(aVar5, f.f709a)) {
                                                    V3.f.b(q.d(p.f698g));
                                                    try {
                                                        J j8 = this.f722a;
                                                        j8.f28779a = g.b((g) j8.f28779a, true, false, false, null, null, null, null, null, 254, null);
                                                        InterfaceC2261g interfaceC2261g = this.f723b;
                                                        Object obj3 = this.f722a.f28779a;
                                                        cVar.f738a = this;
                                                        cVar.f742e = 10;
                                                        if (interfaceC2261g.emit(obj3, cVar) != objF) {
                                                            aVar3 = this;
                                                            n nVar = aVar3.f724c.f699a;
                                                            cVar.f738a = aVar3;
                                                            cVar.f742e = 11;
                                                            objB = nVar.e(cVar);
                                                            if (objB == objF) {
                                                                eVar2 = (A3.e) objB;
                                                                gVarF = aVar3.f724c.f(((g) aVar3.f722a.f28779a).g(), eVar2);
                                                                if (eVar2 == null) {
                                                                    V3.f.b(q.b(p.f698g, false, null, eVar2));
                                                                } else {
                                                                    V3.f.b(q.b(p.f698g, true, gVarF, eVar2));
                                                                }
                                                                J j9 = aVar3.f722a;
                                                                j9.f28779a = g.b((g) j9.f28779a, false, false, false, eVar2, gVarF, null, null, null, 230, null);
                                                                if (eVar2 == null) {
                                                                    p178u3.b.f(aVar3.f724c.f701c, null, 1, null);
                                                                }
                                                                InterfaceC2261g interfaceC2261g2 = aVar3.f723b;
                                                                Object obj4 = aVar3.f722a.f28779a;
                                                                cVar.f738a = aVar3;
                                                                cVar.f742e = 12;
                                                                break;
                                                            }
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        aVar5 = this;
                                                        V3.f.b(q.b(p.f698g, false, null, null));
                                                        J j10 = aVar5.f722a;
                                                        j10.f28779a = th instanceof PurchasesException ? g.b((g) j10.f28779a, false, false, false, null, null, null, null, th, 126, null) : g.b((g) j10.f28779a, false, false, false, null, null, null, null, null, 254, null);
                                                        InterfaceC2261g interfaceC2261g3 = aVar5.f723b;
                                                        Object obj5 = aVar5.f722a.f28779a;
                                                        cVar.f738a = null;
                                                        cVar.f742e = 13;
                                                        break;
                                                    }
                                                }
                                                return G.f1419a;
                                            }
                                            V3.f.b(q.c(p.f698g, ((d) aVar5).b(), this.f724c.f700b));
                                            try {
                                                J j11 = this.f722a;
                                                j11.f28779a = g.b((g) j11.f28779a, true, false, false, null, null, null, null, null, 254, null);
                                                InterfaceC2261g interfaceC2261g4 = this.f723b;
                                                Object obj6 = this.f722a.f28779a;
                                                cVar.f738a = this;
                                                cVar.f739b = aVar5;
                                                cVar.f742e = 6;
                                                if (interfaceC2261g4.emit(obj6, cVar) != objF) {
                                                    aVar4 = this;
                                                    obj = aVar5;
                                                    n nVar2 = aVar4.f724c.f699a;
                                                    Activity activityA = ((d) obj).a();
                                                    A3.g gVarB = ((d) obj).b();
                                                    cVar.f738a = aVar4;
                                                    cVar.f739b = obj;
                                                    cVar.f742e = 7;
                                                    objB = nVar2.b(activityA, gVarB, cVar);
                                                    obj2 = obj;
                                                    if (objB == objF) {
                                                        eVar = (A3.e) objB;
                                                        if (eVar == null) {
                                                            V3.f.b(q.a(p.f698g, false, ((d) obj2).b(), false, null));
                                                        } else {
                                                            V3.f.b(q.a(p.f698g, true, ((d) obj2).b(), false, eVar));
                                                        }
                                                        J j12 = aVar4.f722a;
                                                        Object obj7 = j12.f28779a;
                                                        j12.f28779a = g.b((g) obj7, false, false, false, eVar, aVar4.f724c.f(((g) obj7).g(), eVar), null, null, null, 230, null);
                                                        InterfaceC2261g interfaceC2261g5 = aVar4.f723b;
                                                        Object obj8 = aVar4.f722a.f28779a;
                                                        cVar.f738a = aVar4;
                                                        cVar.f739b = obj2;
                                                        cVar.f742e = 8;
                                                        break;
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                aVar6 = this;
                                                if (th instanceof PurchasesTransactionException) {
                                                    V3.f.b(q.a(p.f698g, false, ((d) aVar5).b(), th.getUserCancelled(), null));
                                                } else {
                                                    V3.f.b(new V3.g.c(th));
                                                    V3.f.b(q.a(p.f698g, false, ((d) aVar5).b(), false, null));
                                                }
                                                J j13 = aVar6.f722a;
                                                j13.f28779a = g.b((g) j13.f28779a, false, false, false, null, null, null, null, null, 254, null);
                                                InterfaceC2261g interfaceC2261g6 = aVar6.f723b;
                                                Object obj9 = aVar6.f722a.f28779a;
                                                cVar.f738a = null;
                                                cVar.f739b = null;
                                                cVar.f742e = 9;
                                                break;
                                            }
                                        } else {
                                            this.f722a.f28779a = new g(false, false, false, null, null, null, null, null, 124, null);
                                            InterfaceC2261g interfaceC2261g7 = this.f723b;
                                            Object obj10 = this.f722a.f28779a;
                                            cVar.f742e = 5;
                                            break;
                                        }
                                    } else {
                                        try {
                                            this.f722a.f28779a = new g(true, true, false, null, null, null, null, null, 252, null);
                                            InterfaceC2261g interfaceC2261g8 = this.f723b;
                                            Object obj11 = this.f722a.f28779a;
                                            cVar.f738a = this;
                                            cVar.f742e = 1;
                                            if (interfaceC2261g8.emit(obj11, cVar) != objF) {
                                                aVar2 = this;
                                                C0013a c0013a = new C0013a(aVar2.f722a, aVar2.f724c, aVar2.f723b, null);
                                                cVar.f738a = aVar2;
                                                cVar.f742e = 2;
                                            }
                                        } catch (PurchasesException e8) {
                                            e = e8;
                                            aVar5 = this;
                                            V3.f.b(new V3.g.c(e));
                                            aVar5.f722a.f28779a = b.f737a[e.getCode().ordinal()] == 1 ? new g(false, false, true, null, null, null, null, e, 122, null) : new g(false, false, false, null, null, null, null, e, 126, null);
                                            InterfaceC2261g interfaceC2261g9 = aVar5.f723b;
                                            Object obj12 = aVar5.f722a.f28779a;
                                            cVar.f738a = null;
                                            cVar.f742e = 3;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            aVar5 = this;
                                            V3.f.b(new V3.g.c(th));
                                            aVar5.f722a.f28779a = new g(false, false, false, null, null, null, null, th, 126, null);
                                            InterfaceC2261g interfaceC2261g10 = aVar5.f723b;
                                            Object obj13 = aVar5.f722a.f28779a;
                                            cVar.f738a = null;
                                            cVar.f742e = 4;
                                        }
                                        break;
                                    }
                                    return objF;
                                case 1:
                                    aVar2 = (a) cVar.f738a;
                                    C6.r.b(objB);
                                    C0013a c0013a2 = new C0013a(aVar2.f722a, aVar2.f724c, aVar2.f723b, null);
                                    cVar.f738a = aVar2;
                                    cVar.f742e = 2;
                                    break;
                                case 2:
                                    C6.r.b(objB);
                                    return G.f1419a;
                                case 3:
                                case 4:
                                case 9:
                                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                                    C6.r.b(objB);
                                    return G.f1419a;
                                case 5:
                                    C6.r.b(objB);
                                    return G.f1419a;
                                case 6:
                                    Object obj14 = (a) cVar.f739b;
                                    aVar4 = (a) cVar.f738a;
                                    C6.r.b(objB);
                                    obj = obj14;
                                    n nVar3 = aVar4.f724c.f699a;
                                    Activity activityA2 = ((d) obj).a();
                                    A3.g gVarB2 = ((d) obj).b();
                                    cVar.f738a = aVar4;
                                    cVar.f739b = obj;
                                    cVar.f742e = 7;
                                    objB = nVar3.b(activityA2, gVarB2, cVar);
                                    obj2 = obj;
                                    if (objB == objF) {
                                        eVar = (A3.e) objB;
                                        if (eVar == null) {
                                            V3.f.b(q.a(p.f698g, false, ((d) obj2).b(), false, null));
                                        } else {
                                            V3.f.b(q.a(p.f698g, true, ((d) obj2).b(), false, eVar));
                                        }
                                        J j14 = aVar4.f722a;
                                        Object obj15 = j14.f28779a;
                                        j14.f28779a = g.b((g) obj15, false, false, false, eVar, aVar4.f724c.f(((g) obj15).g(), eVar), null, null, null, 230, null);
                                        InterfaceC2261g interfaceC2261g11 = aVar4.f723b;
                                        Object obj16 = aVar4.f722a.f28779a;
                                        cVar.f738a = aVar4;
                                        cVar.f739b = obj2;
                                        cVar.f742e = 8;
                                        break;
                                    }
                                    return objF;
                                case 7:
                                    Object obj17 = (a) cVar.f739b;
                                    aVar4 = (a) cVar.f738a;
                                    C6.r.b(objB);
                                    obj2 = obj17;
                                    eVar = (A3.e) objB;
                                    if (eVar == null) {
                                        V3.f.b(q.a(p.f698g, false, ((d) obj2).b(), false, null));
                                    } else {
                                        V3.f.b(q.a(p.f698g, true, ((d) obj2).b(), false, eVar));
                                    }
                                    J j15 = aVar4.f722a;
                                    Object obj18 = j15.f28779a;
                                    j15.f28779a = g.b((g) obj18, false, false, false, eVar, aVar4.f724c.f(((g) obj18).g(), eVar), null, null, null, 230, null);
                                    InterfaceC2261g interfaceC2261g12 = aVar4.f723b;
                                    Object obj19 = aVar4.f722a.f28779a;
                                    cVar.f738a = aVar4;
                                    cVar.f739b = obj2;
                                    cVar.f742e = 8;
                                    break;
                                case 8:
                                    C6.r.b(objB);
                                    return G.f1419a;
                                case 10:
                                    aVar3 = (a) cVar.f738a;
                                    C6.r.b(objB);
                                    n nVar4 = aVar3.f724c.f699a;
                                    cVar.f738a = aVar3;
                                    cVar.f742e = 11;
                                    objB = nVar4.e(cVar);
                                    if (objB == objF) {
                                        eVar2 = (A3.e) objB;
                                        gVarF = aVar3.f724c.f(((g) aVar3.f722a.f28779a).g(), eVar2);
                                        if (eVar2 == null) {
                                            V3.f.b(q.b(p.f698g, false, null, eVar2));
                                        } else {
                                            V3.f.b(q.b(p.f698g, true, gVarF, eVar2));
                                        }
                                        J j16 = aVar3.f722a;
                                        j16.f28779a = g.b((g) j16.f28779a, false, false, false, eVar2, gVarF, null, null, null, 230, null);
                                        if (eVar2 == null) {
                                            p178u3.b.f(aVar3.f724c.f701c, null, 1, null);
                                        }
                                        InterfaceC2261g interfaceC2261g13 = aVar3.f723b;
                                        Object obj20 = aVar3.f722a.f28779a;
                                        cVar.f738a = aVar3;
                                        cVar.f742e = 12;
                                        break;
                                    }
                                    return objF;
                                case 11:
                                    aVar3 = (a) cVar.f738a;
                                    C6.r.b(objB);
                                    eVar2 = (A3.e) objB;
                                    gVarF = aVar3.f724c.f(((g) aVar3.f722a.f28779a).g(), eVar2);
                                    if (eVar2 == null) {
                                        V3.f.b(q.b(p.f698g, false, null, eVar2));
                                    } else {
                                        V3.f.b(q.b(p.f698g, true, gVarF, eVar2));
                                    }
                                    J j17 = aVar3.f722a;
                                    j17.f28779a = g.b((g) j17.f28779a, false, false, false, eVar2, gVarF, null, null, null, 230, null);
                                    if (eVar2 == null) {
                                        p178u3.b.f(aVar3.f724c.f701c, null, 1, null);
                                    }
                                    InterfaceC2261g interfaceC2261g14 = aVar3.f723b;
                                    Object obj21 = aVar3.f722a.f28779a;
                                    cVar.f738a = aVar3;
                                    cVar.f742e = 12;
                                    break;
                                case 12:
                                    C6.r.b(objB);
                                    return G.f1419a;
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (PurchasesException e9) {
                    e = e9;
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b implements InterfaceC2260f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2260f f743a;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class a implements InterfaceC2261g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2261g f744a;

                /* JADX INFO: renamed from: A3.p$h$b$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0015a extends I6.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f745a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f746b;

                    public C0015a(G6.d dVar) {
                        super(dVar);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        this.f745a = obj;
                        this.f746b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC2261g interfaceC2261g) {
                    this.f744a = interfaceC2261g;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p044e7.InterfaceC2261g
                public final Object emit(Object obj, G6.d dVar) {
                    C0015a c0015a;
                    if (dVar instanceof C0015a) {
                        c0015a = (C0015a) dVar;
                        int i8 = c0015a.f746b;
                        if ((i8 & Integer.MIN_VALUE) != 0) {
                            c0015a.f746b = i8 - Integer.MIN_VALUE;
                        } else {
                            c0015a = new C0015a(dVar);
                        }
                    } else {
                        c0015a = new C0015a(dVar);
                    }
                    Object obj2 = c0015a.f745a;
                    Object objF = H6.c.f();
                    int i9 = c0015a.f746b;
                    if (i9 == 0) {
                        C6.r.b(obj2);
                        InterfaceC2261g interfaceC2261g = this.f744a;
                        Object obj3 = ((Boolean) obj).booleanValue() ? e.f708a : c.f705a;
                        c0015a.f746b = 1;
                        if (interfaceC2261g.emit(obj3, c0015a) == objF) {
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

            public b(InterfaceC2260f interfaceC2260f) {
                this.f743a = interfaceC2260f;
            }

            @Override // p044e7.InterfaceC2260f
            public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
                Object objCollect = this.f743a.collect(new a(interfaceC2261g), dVar);
                return objCollect == H6.c.f() ? objCollect : G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(R3.a aVar, p pVar, G6.d dVar) {
            super(2, dVar);
            this.f720c = aVar;
            this.f721d = pVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            h hVar = new h(this.f720c, this.f721d, dVar);
            hVar.f719b = obj;
            return hVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            return ((h) create(interfaceC2261g, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f718a;
            if (i8 == 0) {
                C6.r.b(obj);
                InterfaceC2261g interfaceC2261g = (InterfaceC2261g) this.f719b;
                J j8 = new J();
                j8.f28779a = new g(false, false, false, null, null, null, null, null, 255, null);
                InterfaceC2260f interfaceC2260fK = AbstractC2262h.K(new b(this.f720c.a()), this.f721d.f702d);
                a aVar = new a(j8, interfaceC2261g, this.f721d);
                this.f718a = 1;
                if (interfaceC2260fK.collect(aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
        }
    }

    public final A3.g f(List list, A3.e eVar) {
        Object obj = null;
        if (!(eVar instanceof A3.e.a)) {
            return null;
        }
        for (Object obj2 : list) {
            if (t.c(((A3.g) obj2).d(), ((A3.e.a) eVar).f())) {
                obj = obj2;
                break;
            }
        }
        return (A3.g) obj;
    }

    public final String g() {
        return this.f699a.g();
    }

    public final M h() {
        return this.f703e;
    }

    public final void i() {
        this.f704f.setValue(Boolean.FALSE);
    }

    public final q1 j() {
        return this.f704f;
    }

    public final M k() {
        return this.f699a.d();
    }

    public final void l(Activity activity, A3.g product) {
        t.g(activity, "activity");
        t.g(product, "product");
        this.f702d.d(new d(activity, product));
    }

    public final void m() {
        this.f702d.d(f.f709a);
    }

    public final void n() {
        this.f704f.setValue(Boolean.TRUE);
    }

    public p(n nVar, R3.a isOnline, p017b7.J scope, com.elgato.streamdeck.a.b vendor, O3.b errorAlertViewModel) {
        t.g(nVar, BpgIURjN.EKXUHzuGkZFL);
        t.g(isOnline, "isOnline");
        t.g(scope, "scope");
        t.g(vendor, "vendor");
        t.g(errorAlertViewModel, "errorAlertViewModel");
        this.f699a = nVar;
        this.f700b = vendor;
        this.f701c = errorAlertViewModel;
        this.f702d = D.b(0, 8, null, 5, null);
        this.f703e = AbstractC2262h.T(AbstractC2262h.D(new h(isOnline, this, null)), scope, H.a.b(H.f20929a, 5000L, 0L, 2, null), new g(false, false, false, null, null, null, null, null, 255, null));
        this.f704f = l1.e(Boolean.FALSE, null, 2, null);
    }
}
