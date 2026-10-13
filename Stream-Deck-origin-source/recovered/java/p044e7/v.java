package p044e7;

import C6.G;
import C6.r;
import I6.l;
import Q6.p;
import Q6.q;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f[] f21205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f21206b;

        /* JADX INFO: renamed from: e7.v$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0497a extends l implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f21207a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f21208b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f21209c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ q f21210d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0497a(G6.d dVar, q qVar) {
                super(3, dVar);
                this.f21210d = qVar;
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2261g interfaceC2261g, Object[] objArr, G6.d dVar) {
                C0497a c0497a = new C0497a(dVar, this.f21210d);
                c0497a.f21208b = interfaceC2261g;
                c0497a.f21209c = objArr;
                return c0497a.invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
            
                if (r1.emit(r8, r7) == r0) goto L15;
             */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                InterfaceC2261g interfaceC2261g;
                Object objF = H6.c.f();
                int i8 = this.f21207a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        interfaceC2261g = (InterfaceC2261g) this.f21208b;
                        r.b(obj);
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    return G.f1419a;
                }
                r.b(obj);
                interfaceC2261g = (InterfaceC2261g) this.f21208b;
                Object[] objArr = (Object[]) this.f21209c;
                q qVar = this.f21210d;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                this.f21208b = interfaceC2261g;
                this.f21207a = 1;
                kotlin.jvm.internal.r.a(6);
                obj = qVar.i(obj2, obj3, obj4, this);
                kotlin.jvm.internal.r.a(7);
                if (obj != objF) {
                }
                return objF;
                this.f21208b = null;
                this.f21207a = 2;
            }
        }

        public a(InterfaceC2260f[] interfaceC2260fArr, q qVar) {
            this.f21205a = interfaceC2260fArr;
            this.f21206b = qVar;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objA = p053f7.l.a(interfaceC2261g, this.f21205a, v.f(), new C0497a(null, this.f21206b), dVar);
            return objA == H6.c.f() ? objA : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f[] f21211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q6.r f21212b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends l implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f21213a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f21214b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f21215c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Q6.r f21216d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(G6.d dVar, Q6.r rVar) {
                super(3, dVar);
                this.f21216d = rVar;
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2261g interfaceC2261g, Object[] objArr, G6.d dVar) {
                a aVar = new a(dVar, this.f21216d);
                aVar.f21214b = interfaceC2261g;
                aVar.f21215c = objArr;
                return aVar.invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
            
                if (r1.emit(r11, r10) == r0) goto L15;
             */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                InterfaceC2261g interfaceC2261g;
                a aVar;
                Object objF = H6.c.f();
                int i8 = this.f21213a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        interfaceC2261g = (InterfaceC2261g) this.f21214b;
                        r.b(obj);
                        aVar = this;
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    return G.f1419a;
                }
                r.b(obj);
                interfaceC2261g = (InterfaceC2261g) this.f21214b;
                Object[] objArr = (Object[]) this.f21215c;
                Q6.r rVar = this.f21216d;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                Object obj5 = objArr[3];
                this.f21214b = interfaceC2261g;
                this.f21213a = 1;
                kotlin.jvm.internal.r.a(6);
                aVar = this;
                obj = rVar.n(obj2, obj3, obj4, obj5, aVar);
                kotlin.jvm.internal.r.a(7);
                if (obj != objF) {
                }
                return objF;
                aVar.f21214b = null;
                aVar.f21213a = 2;
            }
        }

        public b(InterfaceC2260f[] interfaceC2260fArr, Q6.r rVar) {
            this.f21211a = interfaceC2260fArr;
            this.f21212b = rVar;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objA = p053f7.l.a(interfaceC2261g, this.f21211a, v.f(), new a(null, this.f21212b), dVar);
            return objA == H6.c.f() ? objA : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f21217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f21218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f21219c;

        public c(InterfaceC2260f interfaceC2260f, InterfaceC2260f interfaceC2260f2, p pVar) {
            this.f21217a = interfaceC2260f;
            this.f21218b = interfaceC2260f2;
            this.f21219c = pVar;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objA = p053f7.l.a(interfaceC2261g, new InterfaceC2260f[]{this.f21217a, this.f21218b}, v.f(), new d(this.f21219c, null), dVar);
            return objA == H6.c.f() ? objA : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f21224a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public static final InterfaceC2260f b(InterfaceC2260f interfaceC2260f, InterfaceC2260f interfaceC2260f2, p pVar) {
        return AbstractC2262h.E(interfaceC2260f, interfaceC2260f2, pVar);
    }

    public static final InterfaceC2260f c(InterfaceC2260f interfaceC2260f, InterfaceC2260f interfaceC2260f2, InterfaceC2260f interfaceC2260f3, q qVar) {
        return new a(new InterfaceC2260f[]{interfaceC2260f, interfaceC2260f2, interfaceC2260f3}, qVar);
    }

    public static final InterfaceC2260f d(InterfaceC2260f interfaceC2260f, InterfaceC2260f interfaceC2260f2, InterfaceC2260f interfaceC2260f3, InterfaceC2260f interfaceC2260f4, Q6.r rVar) {
        return new b(new InterfaceC2260f[]{interfaceC2260f, interfaceC2260f2, interfaceC2260f3, interfaceC2260f4}, rVar);
    }

    public static final InterfaceC2260f e(InterfaceC2260f interfaceC2260f, InterfaceC2260f interfaceC2260f2, p pVar) {
        return new c(interfaceC2260f, interfaceC2260f2, pVar);
    }

    public static final Function0 f() {
        return e.f21224a;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f21221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f21222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p f21223d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p pVar, G6.d dVar) {
            super(3, dVar);
            this.f21223d = pVar;
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2261g interfaceC2261g, Object[] objArr, G6.d dVar) {
            d dVar2 = new d(this.f21223d, dVar);
            dVar2.f21221b = interfaceC2261g;
            dVar2.f21222c = objArr;
            return dVar2.invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC2261g interfaceC2261g;
            Object objF = H6.c.f();
            int i8 = this.f21220a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        r.b(obj);
                    } else {
                        throw new IllegalStateException(yOZfxp.VhciRzLkdRis);
                    }
                } else {
                    interfaceC2261g = (InterfaceC2261g) this.f21221b;
                    r.b(obj);
                }
                return G.f1419a;
            }
            r.b(obj);
            interfaceC2261g = (InterfaceC2261g) this.f21221b;
            Object[] objArr = (Object[]) this.f21222c;
            p pVar = this.f21223d;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.f21221b = interfaceC2261g;
            this.f21220a = 1;
            obj = pVar.invoke(obj2, obj3, this);
            if (obj != objF) {
            }
            return objF;
            this.f21221b = null;
            this.f21220a = 2;
        }
    }
}
