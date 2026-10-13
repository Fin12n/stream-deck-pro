package p143q0;

import C6.G;
import C6.r;
import I6.l;
import Q6.k;
import Q6.o;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p011b1.C1766n;
import p011b1.I;
import p011b1.InterfaceC1755c;
import p011b1.y;
import p011b1.z;
import p017b7.AbstractC1789i;
import p017b7.J;
import p017b7.K;
import p017b7.L;
import p055g0.AbstractC2335p;
import p055g0.P;
import p055g0.x;

/* JADX INFO: renamed from: q0.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2825z {

    /* JADX INFO: renamed from: q0.z$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f31964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f31965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ I f31966c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ G f31967d;

        /* JADX INFO: renamed from: q0.z$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0700a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f31968a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f31969b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ G f31970c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0700a(I i8, G g8, G6.d dVar) {
                super(2, dVar);
                this.f31969b = i8;
                this.f31970c = g8;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new C0700a(this.f31969b, this.f31970c, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((C0700a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f31968a;
                if (i8 == 0) {
                    r.b(obj);
                    I i9 = this.f31969b;
                    G g8 = this.f31970c;
                    this.f31968a = 1;
                    if (AbstractC2825z.e(i9, g8, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return G.f1419a;
            }
        }

        /* JADX INFO: renamed from: q0.z$a$b */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f31971a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f31972b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ G f31973c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(I i8, G g8, G6.d dVar) {
                super(2, dVar);
                this.f31972b = i8;
                this.f31973c = g8;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new b(this.f31972b, this.f31973c, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f31971a;
                if (i8 == 0) {
                    r.b(obj);
                    I i9 = this.f31972b;
                    G g8 = this.f31973c;
                    this.f31971a = 1;
                    if (AbstractC2825z.d(i9, g8, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(I i8, G g8, G6.d dVar) {
            super(2, dVar);
            this.f31966c = i8;
            this.f31967d = g8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            a aVar = new a(this.f31966c, this.f31967d, dVar);
            aVar.f31965b = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f31964a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            J j8 = (J) this.f31965b;
            L l8 = L.UNDISPATCHED;
            AbstractC1789i.d(j8, null, l8, new C0700a(this.f31966c, this.f31967d, null), 1, null);
            return AbstractC1789i.d(j8, null, l8, new b(this.f31966c, this.f31967d, null), 1, null);
        }
    }

    /* JADX INFO: renamed from: q0.z$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G f31974a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(G g8) {
            super(1);
            this.f31974a = g8;
        }

        public final void b(long j8) {
            this.f31974a.b(j8);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((Q0.f) obj).x());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: q0.z$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G f31975a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(G g8) {
            super(0);
            this.f31975a = g8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m236invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m236invoke() {
            this.f31975a.c();
        }
    }

    /* JADX INFO: renamed from: q0.z$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G f31976a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(G g8) {
            super(0);
            this.f31976a = g8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m237invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m237invoke() {
            this.f31976a.onCancel();
        }
    }

    /* JADX INFO: renamed from: q0.z$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G f31977a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(G g8) {
            super(2);
            this.f31977a = g8;
        }

        public final void b(z zVar, long j8) {
            this.f31977a.e(j8);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((z) obj, ((Q0.f) obj2).x());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: q0.z$f */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.k implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f31978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f31979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f31980d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ G f31981e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(G g8, G6.d dVar) {
            super(2, dVar);
            this.f31981e = g8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            f fVar = new f(this.f31981e, dVar);
            fVar.f31980d = obj;
            return fVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1755c interfaceC1755c, G6.d dVar) {
            return ((f) create(interfaceC1755c, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        
            if (r14 == r0) goto L17;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005d -> B:18:0x0060). Please report as a decompilation issue!!! */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            f fVar;
            InterfaceC1755c interfaceC1755c;
            InterfaceC1755c interfaceC1755c2;
            z zVar;
            Object objF = H6.c.f();
            int i8 = this.f31979c;
            if (i8 == 0) {
                r.b(obj);
                InterfaceC1755c interfaceC1755c3 = (InterfaceC1755c) this.f31980d;
                this.f31980d = interfaceC1755c3;
                this.f31979c = 1;
                fVar = this;
                obj = P.e(interfaceC1755c3, false, null, fVar, 2, null);
                if (obj != objF) {
                    interfaceC1755c = interfaceC1755c3;
                }
                return objF;
            }
            if (i8 == 1) {
                interfaceC1755c = (InterfaceC1755c) this.f31980d;
                r.b(obj);
                fVar = this;
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zVar = (z) this.f31978b;
                interfaceC1755c2 = (InterfaceC1755c) this.f31980d;
                r.b(obj);
                fVar = this;
            }
            List listC = ((C1766n) obj).c();
            int size = listC.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    fVar.f31981e.d();
                    return G.f1419a;
                }
                z zVar2 = (z) listC.get(i9);
                if (y.d(zVar2.g(), zVar.g()) && zVar2.j()) {
                    break;
                }
                i9++;
            }
            fVar.f31980d = interfaceC1755c2;
            fVar.f31978b = zVar;
            fVar.f31979c = 2;
            obj = InterfaceC1755c.r1(interfaceC1755c2, null, this, 1, null);
            z zVar3 = (z) obj;
            fVar.f31981e.a(zVar3.i());
            interfaceC1755c2 = interfaceC1755c;
            zVar = zVar3;
            fVar.f31980d = interfaceC1755c2;
            fVar.f31978b = zVar;
            fVar.f31979c = 2;
            obj = InterfaceC1755c.r1(interfaceC1755c2, null, this, 1, null);
        }
    }

    public static final Object c(I i8, G g8, G6.d dVar) {
        Object objF = K.f(new a(i8, g8, null), dVar);
        return objF == H6.c.f() ? objF : G.f1419a;
    }

    public static final Object d(I i8, G g8, G6.d dVar) {
        Object objD = AbstractC2335p.d(i8, new b(g8), new c(g8), new d(g8), new e(g8), dVar);
        return objD == H6.c.f() ? objD : G.f1419a;
    }

    public static final Object e(I i8, G g8, G6.d dVar) {
        Object objC = x.c(i8, new f(g8, null), dVar);
        return objC == H6.c.f() ? objC : G.f1419a;
    }
}
