package J5;

import C6.G;
import C6.r;
import D6.T;
import I0.mIk.efuWFSeiT;
import Q6.p;
import java.io.Closeable;
import java.util.Set;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.AbstractC1823z0;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.Q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface b extends J, Closeable {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: J5.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0158a extends I6.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f4314a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f4315b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f4316c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f4317d;

            public C0158a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f4316c = obj;
                this.f4317d |= Integer.MIN_VALUE;
                return a.e(null, null, this);
            }
        }

        /* JADX INFO: renamed from: J5.b$a$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0159b extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f4318a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f4319b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ T5.e f4320c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0159b(b bVar, T5.e eVar, G6.d dVar) {
                super(2, dVar);
                this.f4319b = bVar;
                this.f4320c = eVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new C0159b(this.f4319b, this.f4320c, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((C0159b) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f4318a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    return obj;
                }
                r.b(obj);
                if (a.f(this.f4319b)) {
                    throw new J5.a(null, 1, null);
                }
                b bVar = this.f4319b;
                T5.e eVar = this.f4320c;
                this.f4318a = 1;
                Object objA1 = bVar.A1(eVar, this);
                return objA1 == objF ? objF : objA1;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends I6.l implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f4321a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f4322b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f4323c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ G5.a f4324d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b f4325e;

            /* JADX INFO: renamed from: J5.b$a$c$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0160a extends u implements Q6.k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ G5.a f4326a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ U5.c f4327b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0160a(G5.a aVar, U5.c cVar) {
                    super(1);
                    this.f4326a = aVar;
                    this.f4327b = cVar;
                }

                public final void b(Throwable th) {
                    if (th != null) {
                        this.f4326a.y().a(V5.c.c(), this.f4327b);
                    }
                }

                @Override // Q6.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((Throwable) obj);
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(G5.a aVar, b bVar, G6.d dVar) {
                super(3, dVar);
                this.f4324d = aVar;
                this.f4325e = bVar;
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p173t6.e eVar, Object obj, G6.d dVar) {
                c cVar = new c(this.f4324d, this.f4325e, dVar);
                cVar.f4322b = eVar;
                cVar.f4323c = obj;
                return cVar.invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x00f0, code lost:
            
                if (r3.h(r5, r9) == r0) goto L23;
             */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                T5.e eVarB;
                p173t6.e eVar;
                Object objF = H6.c.f();
                int i8 = this.f4321a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        eVarB = (T5.e) this.f4323c;
                        eVar = (p173t6.e) this.f4322b;
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
                p173t6.e eVar2 = (p173t6.e) this.f4322b;
                Object obj2 = this.f4323c;
                T5.d dVar = new T5.d();
                dVar.p((T5.d) eVar2.d());
                if (obj2 == null) {
                    dVar.j(p007a6.b.f13441a);
                    X6.m mVarI = K.i(Object.class);
                    dVar.k(p181u6.b.c(X6.r.e(mVarI), K.b(Object.class), mVarI));
                } else if (obj2 instanceof p007a6.c) {
                    dVar.j(obj2);
                    dVar.k(null);
                } else {
                    dVar.j(obj2);
                    X6.m mVarI2 = K.i(Object.class);
                    dVar.k(p181u6.b.c(X6.r.e(mVarI2), K.b(Object.class), mVarI2));
                }
                this.f4324d.y().a(V5.c.b(), dVar);
                eVarB = dVar.b();
                eVarB.a().d(i.c(), this.f4324d.t());
                i.d(eVarB);
                a.d(this.f4325e, eVarB);
                b bVar = this.f4325e;
                this.f4322b = eVar2;
                this.f4323c = eVarB;
                this.f4321a = 1;
                Object objE = a.e(bVar, eVarB, this);
                if (objE != objF) {
                    eVar = eVar2;
                    obj = objE;
                }
                return objF;
                H5.b bVar2 = new H5.b(this.f4324d, eVarB, (T5.h) obj);
                U5.c cVarG = bVar2.g();
                this.f4324d.y().a(V5.c.e(), cVarG);
                AbstractC1823z0.n(cVarG.getCoroutineContext()).H0(new C0160a(this.f4324d, cVarG));
                this.f4322b = null;
                this.f4323c = null;
                this.f4321a = 2;
            }
        }

        public static void d(b bVar, T5.e eVar) {
            for (e eVar2 : eVar.g()) {
                if (!bVar.h0().contains(eVar2)) {
                    throw new IllegalArgumentException(("Engine doesn't support " + eVar2).toString());
                }
            }
        }

        public static boolean f(b bVar) {
            InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) bVar.getCoroutineContext().A(InterfaceC1815v0.f15985O);
            return !(interfaceC1815v0 != null ? interfaceC1815v0.b() : false);
        }

        public static Set g(b bVar) {
            return T.d();
        }

        public static void h(b bVar, G5.a client) {
            t.g(client, "client");
            client.i0().l(T5.i.f9925h.a(), new c(client, bVar, null));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static Object e(b bVar, T5.e eVar, G6.d dVar) {
            C0158a c0158a;
            if (dVar instanceof C0158a) {
                c0158a = (C0158a) dVar;
                int i8 = c0158a.f4317d;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c0158a.f4317d = i8 - Integer.MIN_VALUE;
                } else {
                    c0158a = new C0158a(dVar);
                }
            } else {
                c0158a = new C0158a(dVar);
            }
            Object objB = c0158a.f4316c;
            Object objF = H6.c.f();
            int i9 = c0158a.f4317d;
            if (i9 == 0) {
                r.b(objB);
                InterfaceC1815v0 interfaceC1815v0D = eVar.d();
                c0158a.f4314a = bVar;
                c0158a.f4315b = eVar;
                c0158a.f4317d = 1;
                objB = i.b(bVar, interfaceC1815v0D, c0158a);
                if (objB != objF) {
                }
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException(efuWFSeiT.OloFhAEYqOGT);
                }
                r.b(objB);
                return objB;
            }
            eVar = (T5.e) c0158a.f4315b;
            bVar = (b) c0158a.f4314a;
            r.b(objB);
            b bVar2 = bVar;
            G6.g gVar = (G6.g) objB;
            Q qB = AbstractC1789i.b(bVar2, gVar.P1(new j(gVar)), null, new C0159b(bVar2, eVar, null), 2, null);
            c0158a.f4314a = null;
            c0158a.f4315b = null;
            c0158a.f4317d = 2;
            Object objQ0 = qB.Q0(c0158a);
            return objQ0 == objF ? objF : objQ0;
        }
    }

    Object A1(T5.e eVar, G6.d dVar);

    void f1(G5.a aVar);

    Set h0();

    g q();
}
