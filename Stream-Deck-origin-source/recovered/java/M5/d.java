package M5;

import C6.G;
import p115m6.C2691a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2691a f5603a = new C2691a("ValidateMark");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L7.a f5604b = p157r6.a.a("io.ktor.client.plugins.DefaultResponseValidation");

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G5.b f5605a;

        /* JADX INFO: renamed from: M5.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0202a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f5606a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f5607b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f5608c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f5609d;

            public C0202a(G6.d dVar) {
                super(2, dVar);
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                C0202a c0202a = new C0202a(dVar);
                c0202a.f5609d = obj;
                return c0202a;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(U5.c cVar, G6.d dVar) {
                return ((C0202a) create(cVar, dVar)).invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code duplicated, block: B:39:0x00e2  */
            /* JADX WARN: Code duplicated, block: B:41:0x00e6 A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:44:0x00ef A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:45:0x00f1  */
            /* JADX WARN: Code duplicated, block: B:48:0x00fb  */
            @Override // I6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                int iO0;
                U5.c cVar;
                U5.c cVarG;
                int i8;
                U5.c cVar2;
                U5.c cVar3;
                String str;
                Throwable yVar;
                Object objF = H6.c.f();
                int i9 = this.f5608c;
                try {
                    if (i9 == 0) {
                        C6.r.b(obj);
                        U5.c cVar4 = (U5.c) this.f5609d;
                        if (!((Boolean) cVar4.g1().getAttributes().b(j.e())).booleanValue()) {
                            d.f5604b.b("Skipping default response validation for " + cVar4.g1().f().o());
                            return G.f1419a;
                        }
                        iO0 = cVar4.g().o0();
                        H5.b bVarG1 = cVar4.g1();
                        if (iO0 < 300 || bVarG1.getAttributes().g(d.f5603a)) {
                            return G.f1419a;
                        }
                        this.f5609d = cVar4;
                        this.f5607b = iO0;
                        this.f5608c = 1;
                        Object objA = H5.d.a(bVarG1, this);
                        if (objA != objF) {
                            cVar = cVar4;
                            obj = objA;
                        }
                        return objF;
                    }
                    if (i9 != 1) {
                        if (i9 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i8 = this.f5607b;
                        cVar3 = (U5.c) this.f5606a;
                        cVar2 = (U5.c) this.f5609d;
                        try {
                            C6.r.b(obj);
                            str = (String) obj;
                        } catch (p197w6.c unused) {
                            str = "<body failed decoding>";
                        }
                        if (300 > i8 && i8 < 400) {
                            yVar = new w(cVar3, str);
                        } else if (400 > i8 && i8 < 500) {
                            yVar = new c(cVar3, str);
                        } else if (500 <= i8 || i8 >= 600) {
                            yVar = new y(cVar3, str);
                        } else {
                            yVar = new B(cVar3, str);
                        }
                        d.f5604b.b("Default response validation for " + cVar2.g1().f().o() + " failed with " + yVar);
                        throw yVar;
                    }
                    iO0 = this.f5607b;
                    cVar = (U5.c) this.f5609d;
                    C6.r.b(obj);
                    this.f5609d = cVar;
                    this.f5606a = cVarG;
                    this.f5607b = iO0;
                    this.f5608c = 2;
                    Object objB = U5.e.b(cVarG, null, this, 1, null);
                    if (objB != objF) {
                        i8 = iO0;
                        cVar3 = cVarG;
                        obj = objB;
                        cVar2 = cVar;
                        str = (String) obj;
                        if (300 > i8) {
                            if (400 > i8) {
                                if (500 <= i8) {
                                    yVar = new y(cVar3, str);
                                } else {
                                    yVar = new y(cVar3, str);
                                }
                            } else if (500 <= i8) {
                                yVar = new y(cVar3, str);
                            } else {
                                yVar = new y(cVar3, str);
                            }
                        } else if (400 > i8) {
                            if (500 <= i8) {
                                yVar = new y(cVar3, str);
                            } else {
                                yVar = new y(cVar3, str);
                            }
                        } else if (500 <= i8) {
                            yVar = new y(cVar3, str);
                        } else {
                            yVar = new y(cVar3, str);
                        }
                        d.f5604b.b("Default response validation for " + cVar2.g1().f().o() + " failed with " + yVar);
                        throw yVar;
                    }
                    return objF;
                } catch (p197w6.c unused2) {
                    i8 = iO0;
                    cVar2 = cVar;
                    cVar3 = cVarG;
                    str = "<body failed decoding>";
                }
                H5.b bVar = (H5.b) obj;
                bVar.getAttributes().d(d.f5603a, G.f1419a);
                cVarG = bVar.g();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(G5.b bVar) {
            super(1);
            this.f5605a = bVar;
        }

        public final void b(i.b HttpResponseValidator) {
            kotlin.jvm.internal.t.g(HttpResponseValidator, "$this$HttpResponseValidator");
            HttpResponseValidator.d(this.f5605a.e());
            HttpResponseValidator.e(new C0202a(null));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((i.b) obj);
            return G.f1419a;
        }
    }

    public static final void c(G5.b bVar) {
        kotlin.jvm.internal.t.g(bVar, "<this>");
        j.b(bVar, new a(bVar));
    }
}
