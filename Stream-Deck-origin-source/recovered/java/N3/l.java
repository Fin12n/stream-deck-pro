package N3;

import C6.G;
import D6.C0938s;
import X5.C1692v;
import X5.y;
import com.elgato.streamdeck.vsd2.Endpoint;
import com.revenuecat.purchases.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f6074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6075b;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f6074a = obj;
            this.f6075b |= Integer.MIN_VALUE;
            return l.a(null, null, 0, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f6076a = new b();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f6077a = new a();

            public a() {
                super(1);
            }

            public final void b(P5.b.a install) {
                t.g(install, "$this$install");
                p106l6.c.b(install, null, null, 3, null);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((P5.b.a) obj);
                return G.f1419a;
            }
        }

        public b() {
            super(1);
        }

        public final void b(G5.b config) {
            t.g(config, "$this$config");
            config.i(P5.b.f8896c, a.f6077a);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((G5.b) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f6078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f6080c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ G5.a f6081d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f6082e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f6083f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f6084g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f6085h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(G5.a aVar, String str, int i8, String str2, long j8, G6.d dVar) {
            super(2, dVar);
            this.f6081d = aVar;
            this.f6082e = str;
            this.f6083f = i8;
            this.f6084g = str2;
            this.f6085h = j8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            c cVar = new c(this.f6081d, this.f6082e, this.f6083f, this.f6084g, this.f6085h, dVar);
            cVar.f6080c = obj;
            return cVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            return ((c) create(interfaceC2261g, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0043 A[PHI: r1
          0x0043: PHI (r1v8 e7.g) = (r1v1 e7.g), (r1v5 e7.g), (r1v14 e7.g) binds: [B:20:0x003b, B:35:0x0097, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:23:0x004b A[Catch: all -> 0x002a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x002a, blocks: (B:23:0x004b, B:11:0x0026), top: B:41:0x0026 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0060  */
        /* JADX WARN: Code duplicated, block: B:30:0x006e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0097 -> B:21:0x0043). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = H6.c.f()
                int r1 = r10.f6079b
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L3b
                if (r1 == r5) goto L2c
                if (r1 == r4) goto L22
                if (r1 != r3) goto L1a
                java.lang.Object r1 = r10.f6080c
                e7.g r1 = (p044e7.InterfaceC2261g) r1
                C6.r.b(r11)
                goto L43
            L1a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L22:
                java.lang.Object r1 = r10.f6080c
                e7.g r1 = (p044e7.InterfaceC2261g) r1
                C6.r.b(r11)     // Catch: java.lang.Throwable -> L2a
                goto L8b
            L2a:
                r11 = move-exception
                goto L70
            L2c:
                java.lang.Object r1 = r10.f6078a
                e7.g r1 = (p044e7.InterfaceC2261g) r1
                java.lang.Object r6 = r10.f6080c
                e7.g r6 = (p044e7.InterfaceC2261g) r6
                C6.r.b(r11)     // Catch: java.lang.Throwable -> L38
                goto L61
            L38:
                r11 = move-exception
                r1 = r6
                goto L70
            L3b:
                C6.r.b(r11)
                java.lang.Object r11 = r10.f6080c
                e7.g r11 = (p044e7.InterfaceC2261g) r11
                r1 = r11
            L43:
                G5.a r11 = r10.f6081d
                boolean r11 = p017b7.K.h(r11)
                if (r11 == 0) goto L9a
                G5.a r11 = r10.f6081d     // Catch: java.lang.Throwable -> L2a
                java.lang.String r6 = r10.f6082e     // Catch: java.lang.Throwable -> L2a
                int r7 = r10.f6083f     // Catch: java.lang.Throwable -> L2a
                java.lang.String r8 = r10.f6084g     // Catch: java.lang.Throwable -> L2a
                r10.f6080c = r1     // Catch: java.lang.Throwable -> L2a
                r10.f6078a = r1     // Catch: java.lang.Throwable -> L2a
                r10.f6079b = r5     // Catch: java.lang.Throwable -> L2a
                java.lang.Object r11 = N3.l.a(r11, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L2a
                if (r11 != r0) goto L60
                goto L99
            L60:
                r6 = r1
            L61:
                r10.f6080c = r6     // Catch: java.lang.Throwable -> L38
                r10.f6078a = r2     // Catch: java.lang.Throwable -> L38
                r10.f6079b = r4     // Catch: java.lang.Throwable -> L38
                java.lang.Object r11 = r1.emit(r11, r10)     // Catch: java.lang.Throwable -> L38
                if (r11 != r0) goto L6e
                goto L99
            L6e:
                r1 = r6
                goto L8b
            L70:
                Z2.j$a r6 = Z2.j.f12858c
                java.lang.String r7 = r6.c()
                Z2.p r8 = Z2.p.Error
                Z2.k r9 = r6.a()
                Z2.p r9 = r9.a()
                int r9 = r9.compareTo(r8)
                if (r9 > 0) goto L8b
                java.lang.String r9 = "Error fetching from discovery service"
                r6.b(r8, r7, r11, r9)
            L8b:
                long r6 = r10.f6085h
                r10.f6080c = r1
                r10.f6078a = r2
                r10.f6079b = r3
                java.lang.Object r11 = p017b7.U.b(r6, r10)
                if (r11 != r0) goto L43
            L99:
                return r0
            L9a:
                C6.G r11 = C6.G.f1419a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: N3.l.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6087b;

        public d(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            d dVar2 = new d(dVar);
            dVar2.f6087b = obj;
            return dVar2;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, G6.d dVar) {
            return ((d) create(list, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f6086a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            return AbstractC2262h.a((List) this.f6087b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6089b;

        public e(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            e eVar = new e(dVar);
            eVar.f6089b = obj;
            return eVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p pVar, G6.d dVar) {
            return ((e) create(pVar, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f6088a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            p pVar = (p) this.f6089b;
            List listE = pVar.e();
            ArrayList arrayList = new ArrayList(C0938s.y(listE, 10));
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                arrayList.add(new o(pVar.f(), (Endpoint) it.next(), null));
            }
            return AbstractC2262h.a(arrayList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f6090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f6091b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f6092a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f6093b;

            /* JADX INFO: renamed from: N3.l$f$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0229a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f6094a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f6095b;

                public C0229a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f6094a = obj;
                    this.f6095b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g, String str) {
                this.f6092a = interfaceC2261g;
                this.f6093b = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0229a c0229a;
                if (dVar instanceof C0229a) {
                    c0229a = (C0229a) dVar;
                    int i8 = c0229a.f6095b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0229a.f6095b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0229a = new C0229a(dVar);
                    }
                } else {
                    c0229a = new C0229a(dVar);
                }
                Object obj2 = c0229a.f6094a;
                Object objF = H6.c.f();
                int i9 = c0229a.f6095b;
                if (i9 == 0) {
                    C6.r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f6092a;
                    if (P3.i.d(((p) obj).f(), this.f6093b)) {
                        c0229a.f6095b = 1;
                        if (interfaceC2261g.emit(obj, c0229a) == objF) {
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

        public f(InterfaceC2260f interfaceC2260f, String str) {
            this.f6090a = interfaceC2260f;
            this.f6091b = str;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f6090a.collect(new a(interfaceC2261g, this.f6091b), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        if (r11 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(G5.a aVar, String str, int i8, String str2, G6.d dVar) {
        a aVar2;
        if (dVar instanceof a) {
            aVar2 = (a) dVar;
            int i9 = aVar2.f6075b;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                aVar2.f6075b = i9 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(dVar);
            }
        } else {
            aVar2 = new a(dVar);
        }
        Object objC = aVar2.f6074a;
        Object objF = H6.c.f();
        int i10 = aVar2.f6075b;
        if (i10 == 0) {
            C6.r.b(objC);
            G5.a aVarB = aVar.b(b.f6076a);
            String str3 = "https://" + str + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + i8 + "/" + str2;
            T5.d dVar2 = new T5.d();
            T5.f.d(dVar2, str3);
            dVar2.n(C1692v.f11962b.b());
            U5.g gVar = new U5.g(dVar2, aVarB);
            aVar2.f6075b = 1;
            objC = gVar.c(aVar2);
            if (objC != objF) {
            }
            return objF;
        }
        if (i10 == 1) {
            C6.r.b(objC);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(objC);
        }
        if (objC == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.elgato.streamdeck.vsd2.discovery.ElgatoDiscoveryHost>");
        }
        List<k> list = (List) objC;
        ArrayList arrayList = new ArrayList(C0938s.y(list, 10));
        for (k kVar : list) {
            String strB = P3.i.b(kVar.b());
            String strB2 = kVar.b();
            List listC = kVar.c();
            ArrayList arrayList2 = new ArrayList(C0938s.y(listC, 10));
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                arrayList2.add(P3.f.a((String) it.next(), kVar.d(), Endpoint.Source.ELGATO_DISCOVERY));
            }
            arrayList.add(new p(strB, strB2, arrayList2, null));
        }
        return arrayList;
        if (!y.b(((U5.c) objC).g())) {
            objC = null;
        }
        U5.c cVar = (U5.c) objC;
        if (cVar == null) {
            return D6.r.n();
        }
        H5.b bVarG1 = cVar.g1();
        X6.m mVarJ = K.j(List.class, X6.n.f12042c.a(K.i(k.class)));
        p181u6.a aVarC = p181u6.b.c(X6.r.e(mVarJ), K.b(List.class), mVarJ);
        aVar2.f6075b = 2;
        objC = bVarG1.a(aVarC, aVar2);
    }

    public static final InterfaceC2260f b(G5.a elgatoDiscoveryFlow, long j8, String host, int i8, String productID) {
        t.g(elgatoDiscoveryFlow, "$this$elgatoDiscoveryFlow");
        t.g(host, "host");
        t.g(productID, "productID");
        return AbstractC2262h.D(new c(elgatoDiscoveryFlow, host, i8, productID, j8, null));
    }

    public static /* synthetic */ InterfaceC2260f c(G5.a aVar, long j8, String str, int i8, String str2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            p008a7.a.C0338a c0338a = p008a7.a.f13446b;
            j8 = p008a7.c.s(10, p008a7.d.SECONDS);
        }
        long j9 = j8;
        if ((i9 & 2) != 0) {
            str = "discovery.elgato.com";
        }
        String str3 = str;
        if ((i9 & 4) != 0) {
            i8 = 443;
        }
        int i10 = i8;
        if ((i9 & 8) != 0) {
            str2 = "vsd2";
        }
        return b(aVar, j9, str3, i10, str2);
    }

    public static final InterfaceC2260f d(N3.b endpoints, String workstationID) {
        t.g(endpoints, "$this$endpoints");
        t.g(workstationID, "workstationID");
        return AbstractC2262h.B(new f(AbstractC2262h.B(endpoints.a(), new d(null)), workstationID), new e(null));
    }
}
