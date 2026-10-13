package E3;

import C6.G;
import D6.z;
import J3.m;
import J3.n;
import L0.i;
import Q6.k;
import Q6.o;
import Q6.q;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.mlkit.common.internal.ckI.WqXA;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2252x;
import p038e1.H;
import p056g1.InterfaceC2343g;
import p082j0.AbstractC2607k;
import p082j0.C2598b;
import p082j0.C2609m;
import p082j0.InterfaceC2608l;
import p082j0.J;
import p091k0.v;
import p154r3.j;
import p168t1.C;
import p191w0.AbstractC3085t;
import p191w0.AbstractC3086t0;
import p191w0.P0;
import p191w0.U;
import p191w0.V;
import p191w0.Z;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.R0;
import p215z0.v1;
import r7.p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c f2177a = p.b(null, g.f2217a, 1, null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f2178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f2179b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, String str) {
            super(0);
            this.f2178a = kVar;
            this.f2179b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m57invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m57invoke() {
            this.f2178a.invoke(this.f2179b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f2181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f2182c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, k kVar, int i8) {
            super(2);
            this.f2180a = str;
            this.f2181b = kVar;
            this.f2182c = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            d.a(this.f2180a, this.f2181b, interfaceC3163l, F0.a(this.f2182c | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f2183a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Map f2184a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ List f2185b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f2186c;

            /* JADX INFO: renamed from: E3.d$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0098a extends u implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Map f2187a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Map.Entry f2188b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ k f2189c;

                /* JADX INFO: renamed from: E3.d$c$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0099a extends u implements o {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ Map.Entry f2190a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ k f2191b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0099a(Map.Entry entry, k kVar) {
                        super(2);
                        this.f2190a = entry;
                        this.f2191b = kVar;
                    }

                    public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                        if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                            interfaceC3163l.z();
                            return;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1969479988, i8, -1, "com.elgato.streamdeck.settings.license.LicenseScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LicenseScreen.kt:85)");
                        }
                        d.a((String) this.f2190a.getKey(), this.f2191b, interfaceC3163l, 0);
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
                public C0098a(Map map, Map.Entry entry, k kVar) {
                    super(2);
                    this.f2187a = map;
                    this.f2188b = entry;
                    this.f2189c = kVar;
                }

                public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                    if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                        interfaceC3163l.z();
                        return;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-313237460, i8, -1, "com.elgato.streamdeck.settings.license.LicenseScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LicenseScreen.kt:84)");
                    }
                    n.b(E3.f.a(this.f2187a, this.f2188b), null, H0.c.b(interfaceC3163l, 1969479988, true, new C0099a(this.f2188b, this.f2189c)), interfaceC3163l, 384, 2);
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
            public static final class b extends u implements k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final b f2192a = new b();

                public b() {
                    super(1);
                }

                @Override // Q6.k
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Void invoke(Object obj) {
                    return null;
                }
            }

            /* JADX INFO: renamed from: E3.d$c$a$c, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0100c extends u implements k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ k f2193a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ List f2194b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0100c(k kVar, List list) {
                    super(1);
                    this.f2193a = kVar;
                    this.f2194b = list;
                }

                public final Object b(int i8) {
                    return this.f2193a.invoke(this.f2194b.get(i8));
                }

                @Override // Q6.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).intValue());
                }
            }

            /* JADX INFO: renamed from: E3.d$c$a$d, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0101d extends u implements q {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ List f2195a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f2196b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0101d(List list, k kVar) {
                    super(4);
                    this.f2195a = list;
                    this.f2196b = kVar;
                }

                public final void b(p091k0.b bVar, int i8, InterfaceC3163l interfaceC3163l, int i9) {
                    int i10;
                    if ((i9 & 14) == 0) {
                        i10 = (interfaceC3163l.R(bVar) ? 4 : 2) | i9;
                    } else {
                        i10 = i9;
                    }
                    if ((i9 & 112) == 0) {
                        i10 |= interfaceC3163l.i(i8) ? 32 : 16;
                    }
                    if ((i10 & 731) == 146 && interfaceC3163l.s()) {
                        interfaceC3163l.z();
                        return;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-632812321, i10, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                    }
                    E3.e eVar = (E3.e) this.f2195a.get(i8);
                    interfaceC3163l.f(-983413990);
                    d.c(eVar, true, this.f2196b, interfaceC3163l, 56, 0);
                    interfaceC3163l.N();
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

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class e extends u implements k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final e f2197a = new e();

                public e() {
                    super(1);
                }

                @Override // Q6.k
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Void invoke(Object obj) {
                    return null;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class f extends u implements k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ k f2198a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ List f2199b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(k kVar, List list) {
                    super(1);
                    this.f2198a = kVar;
                    this.f2199b = list;
                }

                public final Object b(int i8) {
                    return this.f2198a.invoke(this.f2199b.get(i8));
                }

                @Override // Q6.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).intValue());
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class g extends u implements q {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ List f2200a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f2201b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(List list, k kVar) {
                    super(4);
                    this.f2200a = list;
                    this.f2201b = kVar;
                }

                public final void b(p091k0.b bVar, int i8, InterfaceC3163l interfaceC3163l, int i9) {
                    int i10;
                    if ((i9 & 14) == 0) {
                        i10 = (interfaceC3163l.R(bVar) ? 4 : 2) | i9;
                    } else {
                        i10 = i9;
                    }
                    if ((i9 & 112) == 0) {
                        i10 |= interfaceC3163l.i(i8) ? 32 : 16;
                    }
                    if ((i10 & 731) == 146 && interfaceC3163l.s()) {
                        interfaceC3163l.z();
                        return;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-632812321, i10, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                    }
                    E3.e eVar = (E3.e) this.f2200a.get(i8);
                    interfaceC3163l.f(-184420997);
                    d.c(eVar, false, this.f2201b, interfaceC3163l, 8, 2);
                    interfaceC3163l.N();
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map map, List list, k kVar) {
                super(1);
                this.f2184a = map;
                this.f2185b = list;
                this.f2186c = kVar;
            }

            public final void b(v LazyColumnForm) {
                t.g(LazyColumnForm, "$this$LazyColumnForm");
                Map map = this.f2184a;
                k kVar = this.f2186c;
                for (Map.Entry entry : map.entrySet()) {
                    d.i(LazyColumnForm, H0.c.c(-313237460, true, new C0098a(map, entry, kVar)));
                    List list = (List) entry.getValue();
                    LazyColumnForm.d(list.size(), null, new f(e.f2197a, list), H0.c.c(-632812321, true, new g(list, kVar)));
                }
                if (this.f2185b.isEmpty()) {
                    return;
                }
                d.i(LazyColumnForm, E3.a.f2163a.a());
                List list2 = this.f2185b;
                k kVar2 = this.f2186c;
                LazyColumnForm.d(list2.size(), null, new C0100c(b.f2192a, list2), H0.c.c(-632812321, true, new C0101d(list2, kVar2)));
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((v) obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f2202a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context) {
                super(1);
                this.f2202a = context;
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return G.f1419a;
            }

            public final void invoke(String str) {
                t.g(str, WqXA.ahcZNgC);
                j.a(this.f2202a, str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(3);
            this.f2183a = list;
        }

        public final void b(J paddingValues, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(paddingValues, "paddingValues");
            int i9 = (i8 & 14) == 0 ? (interfaceC3163l.R(paddingValues) ? 4 : 2) | i8 : i8;
            if ((i9 & 91) == 18 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-28561760, i9, -1, "com.elgato.streamdeck.settings.license.LicenseScreenContent.<anonymous> (LicenseScreen.kt:72)");
            }
            b bVar = new b((Context) interfaceC3163l.e(AndroidCompositionLocals_androidKt.g()));
            List list = this.f2183a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((E3.e) obj).d().size() > 1) {
                    arrayList.add(obj);
                }
            }
            List list2 = this.f2183a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (((E3.e) obj2).d().size() == 1) {
                    arrayList2.add(obj2);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj3 : arrayList2) {
                String strA = ((E3.e) obj3).c().a();
                Object arrayList3 = linkedHashMap.get(strA);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap.put(strA, arrayList3);
                }
                ((List) arrayList3).add(obj3);
            }
            m.a(null, paddingValues, null, new a(linkedHashMap, arrayList, bVar), interfaceC3163l, (i9 << 3) & 112, 5);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((J) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: E3.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0102d extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f2203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2204b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0102d(List list, int i8) {
            super(2);
            this.f2203a = list;
            this.f2204b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            d.b(this.f2203a, interfaceC3163l, F0.a(this.f2204b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ E3.e f2205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f2206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f2207c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ E3.e f2208a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(E3.e eVar) {
                super(2);
                this.f2208a = eVar;
            }

            /* JADX WARN: Code duplicated, block: B:28:0x0122  */
            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                String str;
                if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1218997272, i8, -1, "com.elgato.streamdeck.settings.license.ProjectItem.<anonymous>.<anonymous> (LicenseScreen.kt:112)");
                }
                E3.e eVar = this.f2208a;
                interfaceC3163l.f(-483455358);
                i.a aVar = i.f4836a;
                H hA = AbstractC2607k.a(C2598b.f27914a.g(), L0.c.f4806a.i(), interfaceC3163l, 0);
                interfaceC3163l.f(-1323940314);
                int iA = AbstractC3157i.a(interfaceC3163l, 0);
                InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
                InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
                Function0 function0A = aVar2.a();
                Q6.p pVarB = AbstractC2252x.b(aVar);
                if (interfaceC3163l.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163l.r();
                if (interfaceC3163l.m()) {
                    interfaceC3163l.w(function0A);
                } else {
                    interfaceC3163l.G();
                }
                InterfaceC3163l interfaceC3163lA = v1.a(interfaceC3163l);
                v1.b(interfaceC3163lA, hA, aVar2.c());
                v1.b(interfaceC3163lA, interfaceC3184wE, aVar2.e());
                o oVarB = aVar2.b();
                if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
                interfaceC3163l.f(2058660585);
                C2609m c2609m = C2609m.f28036a;
                P0.b(eVar.e(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC3163l, 0, 0, 131070);
                String strG = eVar.g();
                String strH = eVar.h();
                if (strH != null) {
                    str = " (" + strH + ")";
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = "";
                }
                P0.b(strG + str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC3163l, 0, 0, 131070);
                interfaceC3163l.N();
                interfaceC3163l.O();
                interfaceC3163l.N();
                interfaceC3163l.N();
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
            public final /* synthetic */ E3.e f2209a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f2210b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f2211c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(E3.e eVar, boolean z8, k kVar) {
                super(2);
                this.f2209a = eVar;
                this.f2210b = z8;
                this.f2211c = kVar;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                Integer num;
                E3.e eVar;
                boolean z8;
                k kVar;
                int i9;
                InterfaceC3163l interfaceC3163l2 = interfaceC3163l;
                if ((i8 & 11) == 2 && interfaceC3163l2.s()) {
                    interfaceC3163l2.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2012100053, i8, -1, "com.elgato.streamdeck.settings.license.ProjectItem.<anonymous>.<anonymous> (LicenseScreen.kt:118)");
                }
                C2598b.e eVarN = C2598b.f27914a.n(W3.c.f11463a.h());
                E3.e eVar2 = this.f2209a;
                boolean z9 = this.f2210b;
                k kVar2 = this.f2211c;
                interfaceC3163l2.f(-483455358);
                i.a aVar = i.f4836a;
                H hA = AbstractC2607k.a(eVarN, L0.c.f4806a.i(), interfaceC3163l2, 0);
                interfaceC3163l2.f(-1323940314);
                int iA = AbstractC3157i.a(interfaceC3163l2, 0);
                InterfaceC3184w interfaceC3184wE = interfaceC3163l2.E();
                InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
                Function0 function0A = aVar2.a();
                Q6.p pVarB = AbstractC2252x.b(aVar);
                if (interfaceC3163l2.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163l2.r();
                if (interfaceC3163l2.m()) {
                    interfaceC3163l2.w(function0A);
                } else {
                    interfaceC3163l2.G();
                }
                InterfaceC3163l interfaceC3163lA = v1.a(interfaceC3163l2);
                v1.b(interfaceC3163lA, hA, aVar2.c());
                v1.b(interfaceC3163lA, interfaceC3184wE, aVar2.e());
                o oVarB = aVar2.b();
                if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB.invoke(R0.a(R0.b(interfaceC3163l2)), interfaceC3163l2, 0);
                interfaceC3163l2.f(2058660585);
                C2609m c2609m = C2609m.f28036a;
                interfaceC3163l2.f(-1418500038);
                if (eVar2.b().isEmpty()) {
                    num = 0;
                    eVar = eVar2;
                    z8 = z9;
                    kVar = kVar2;
                } else {
                    num = 0;
                    z8 = z9;
                    kVar = kVar2;
                    eVar = eVar2;
                    P0.b(p101l1.f.c(p194w3.b.f37046o1, new Object[]{z.r0(eVar2.b(), ", ", null, null, 0, null, null, 62, null)}, interfaceC3163l2, 64), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC3163l, 0, 0, 131070);
                    interfaceC3163l2 = interfaceC3163l;
                }
                interfaceC3163l2.N();
                String strF = eVar.f();
                interfaceC3163l2.f(-1418499703);
                if (strF == null) {
                    i9 = 0;
                } else {
                    i9 = 0;
                    d.a(strF, kVar, interfaceC3163l2, 0);
                }
                interfaceC3163l2.N();
                interfaceC3163l2.f(684158148);
                if (z8) {
                    int i10 = i9;
                    k kVar3 = kVar;
                    P0.b(p101l1.f.b(p194w3.b.f37040m1, interfaceC3163l2, i9), null, 0L, 0L, null, C.f33980b.a(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC3163l, 196608, 0, 131038);
                    interfaceC3163l2 = interfaceC3163l;
                    for (E3.b bVar : eVar.d()) {
                        interfaceC3163l2.f(-483455358);
                        i.a aVar3 = i.f4836a;
                        H hA2 = AbstractC2607k.a(C2598b.f27914a.g(), L0.c.f4806a.i(), interfaceC3163l2, i10);
                        interfaceC3163l2.f(-1323940314);
                        int iA2 = AbstractC3157i.a(interfaceC3163l2, i10);
                        InterfaceC3184w interfaceC3184wE2 = interfaceC3163l2.E();
                        InterfaceC2343g.a aVar4 = InterfaceC2343g.f23596Q;
                        Function0 function0A2 = aVar4.a();
                        Q6.p pVarB2 = AbstractC2252x.b(aVar3);
                        if (interfaceC3163l2.t() == null) {
                            AbstractC3157i.c();
                        }
                        interfaceC3163l2.r();
                        if (interfaceC3163l2.m()) {
                            interfaceC3163l2.w(function0A2);
                        } else {
                            interfaceC3163l2.G();
                        }
                        InterfaceC3163l interfaceC3163lA2 = v1.a(interfaceC3163l2);
                        v1.b(interfaceC3163lA2, hA2, aVar4.c());
                        v1.b(interfaceC3163lA2, interfaceC3184wE2, aVar4.e());
                        o oVarB2 = aVar4.b();
                        if (interfaceC3163lA2.m() || !t.c(interfaceC3163lA2.g(), Integer.valueOf(iA2))) {
                            interfaceC3163lA2.H(Integer.valueOf(iA2));
                            interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
                        }
                        pVarB2.invoke(R0.a(R0.b(interfaceC3163l2)), interfaceC3163l2, num);
                        interfaceC3163l2.f(2058660585);
                        C2609m c2609m2 = C2609m.f28036a;
                        P0.b(bVar.b(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC3163l, 0, 0, 131070);
                        interfaceC3163l2 = interfaceC3163l;
                        d.a(bVar.a(), kVar3, interfaceC3163l2, i10);
                        interfaceC3163l2.N();
                        interfaceC3163l2.O();
                        interfaceC3163l2.N();
                        interfaceC3163l2.N();
                    }
                }
                interfaceC3163l2.N();
                interfaceC3163l2.N();
                interfaceC3163l2.O();
                interfaceC3163l2.N();
                interfaceC3163l2.N();
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
        public e(E3.e eVar, boolean z8, k kVar) {
            super(3);
            this.f2205a = eVar;
            this.f2206b = z8;
            this.f2207c = kVar;
        }

        public final void b(InterfaceC2608l Card, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(Card, "$this$Card");
            if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(787213450, i8, -1, "com.elgato.streamdeck.settings.license.ProjectItem.<anonymous> (LicenseScreen.kt:109)");
            }
            V.a(H0.c.b(interfaceC3163l, -1218997272, true, new a(this.f2205a)), null, null, H0.c.b(interfaceC3163l, -2012100053, true, new b(this.f2205a, this.f2206b, this.f2207c)), null, null, m.b(U.f35700a, interfaceC3163l, U.f35702c), 0.0f, 0.0f, interfaceC3163l, 3078, 438);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((InterfaceC2608l) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ E3.e f2212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f2213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f2214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f2215d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f2216e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(E3.e eVar, boolean z8, k kVar, int i8, int i9) {
            super(2);
            this.f2212a = eVar;
            this.f2213b = z8;
            this.f2214c = kVar;
            this.f2215d = i8;
            this.f2216e = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            d.c(this.f2212a, this.f2213b, this.f2214c, interfaceC3163l, F0.a(this.f2215d | 1), this.f2216e);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f2217a = new g();

        public g() {
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
    public static final class h extends u implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f2218a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(o oVar) {
            super(3);
            this.f2218a = oVar;
        }

        public final void b(p091k0.b stickyHeader, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(stickyHeader, "$this$stickyHeader");
            if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(737691441, i8, -1, "com.elgato.streamdeck.settings.license.sectionHeader.<anonymous> (LicenseScreen.kt:158)");
            }
            p191w0.F0.a(androidx.compose.foundation.layout.f.h(i.f4836a, 0.0f, 1, null), null, m.c(Z.f35786a.a(interfaceC3163l, Z.f35787b), interfaceC3163l, 0), 0L, 0.0f, 0.0f, null, this.f2218a, interfaceC3163l, 6, 122);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((p091k0.b) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    public static final void a(String str, k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        InterfaceC3163l interfaceC3163l2;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1913835448);
        if ((i8 & 14) == 0) {
            i9 = i8 | (interfaceC3163lP.R(str) ? 4 : 2);
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= interfaceC3163lP.l(kVar) ? 32 : 16;
        }
        if ((i9 & 91) == 18 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
            interfaceC3163l2 = interfaceC3163lP;
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1913835448, i9, -1, "com.elgato.streamdeck.settings.license.ExternalLink (LicenseScreen.kt:148)");
            }
            long jB = Z.f35786a.a(interfaceC3163lP, Z.f35787b).B();
            int iB = p216z1.t.f39054a.b();
            i.a aVar = i.f4836a;
            interfaceC3163lP.f(1507721866);
            boolean z8 = (i9 & 112) == 32;
            int i10 = i9 & 14;
            boolean z9 = z8 | (i10 == 4);
            Object objG = interfaceC3163lP.g();
            if (z9 || objG == InterfaceC3163l.f38803a.a()) {
                objG = new a(kVar, str);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            interfaceC3163l2 = interfaceC3163lP;
            P0.b(str, androidx.compose.foundation.d.e(aVar, false, null, null, (Function0) objG, 7, null), jB, 0L, null, null, null, 0L, null, null, 0L, iB, false, 1, 0, null, null, interfaceC3163l2, i10, 3120, 120824);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        p215z0.P0 p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new b(str, kVar, i8));
        }
    }

    public static final void b(List list, InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-727013679);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-727013679, i8, -1, "com.elgato.streamdeck.settings.license.LicenseScreenContent (LicenseScreen.kt:71)");
        }
        AbstractC3086t0.b(null, null, null, null, null, 0, 0L, 0L, null, H0.c.b(interfaceC3163lP, -28561760, true, new c(list)), interfaceC3163lP, 805306368, 511);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        p215z0.P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new C0102d(list, i8));
        }
    }

    public static final void c(E3.e eVar, boolean z8, k kVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1779310312);
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1779310312, i8, -1, "com.elgato.streamdeck.settings.license.ProjectItem (LicenseScreen.kt:108)");
        }
        AbstractC3085t.a(null, null, null, null, null, H0.c.b(interfaceC3163lP, 787213450, true, new e(eVar, z8, kVar)), interfaceC3163lP, 196608, 31);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        p215z0.P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new f(eVar, z8, kVar, i8, i9));
        }
    }

    public static final void i(v vVar, o oVar) {
        v.g(vVar, null, null, H0.c.c(737691441, true, new h(oVar)), 3, null);
    }
}
