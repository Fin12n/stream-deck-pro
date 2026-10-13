package p137p2;

import C6.G;
import C6.r;
import G6.d;
import G6.g;
import G6.h;
import H6.c;
import I6.l;
import Q6.o;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.C;
import androidx.lifecycle.InterfaceC1733p;
import kotlin.jvm.internal.t;
import p017b7.J;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p044e7.M;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3191z0;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: p2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0664a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f31119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f31120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC1726i f31121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AbstractC1726i.b f31122d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ g f31123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f31124f;

        /* JADX INFO: renamed from: p2.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0665a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f31125a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f31126b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2260f f31127c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3191z0 f31128d;

            /* JADX INFO: renamed from: p2.a$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0666a implements InterfaceC2261g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC3191z0 f31129a;

                public C0666a(InterfaceC3191z0 interfaceC3191z0) {
                    this.f31129a = interfaceC3191z0;
                }

                @Override // p044e7.InterfaceC2261g
                public final Object emit(Object obj, d dVar) {
                    this.f31129a.setValue(obj);
                    return G.f1419a;
                }
            }

            /* JADX INFO: renamed from: p2.a$a$a$b */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class b extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f31130a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2260f f31131b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ InterfaceC3191z0 f31132c;

                /* JADX INFO: renamed from: p2.a$a$a$b$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0667a implements InterfaceC2261g {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ InterfaceC3191z0 f31133a;

                    public C0667a(InterfaceC3191z0 interfaceC3191z0) {
                        this.f31133a = interfaceC3191z0;
                    }

                    @Override // p044e7.InterfaceC2261g
                    public final Object emit(Object obj, d dVar) {
                        this.f31133a.setValue(obj);
                        return G.f1419a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(InterfaceC2260f interfaceC2260f, InterfaceC3191z0 interfaceC3191z0, d dVar) {
                    super(2, dVar);
                    this.f31131b = interfaceC2260f;
                    this.f31132c = interfaceC3191z0;
                }

                @Override // I6.a
                public final d create(Object obj, d dVar) {
                    return new b(this.f31131b, this.f31132c, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, d dVar) {
                    return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = c.f();
                    int i8 = this.f31130a;
                    if (i8 == 0) {
                        r.b(obj);
                        InterfaceC2260f interfaceC2260f = this.f31131b;
                        C0667a c0667a = new C0667a(this.f31132c);
                        this.f31130a = 1;
                        if (interfaceC2260f.collect(c0667a, this) == objF) {
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
            public C0665a(g gVar, InterfaceC2260f interfaceC2260f, InterfaceC3191z0 interfaceC3191z0, d dVar) {
                super(2, dVar);
                this.f31126b = gVar;
                this.f31127c = interfaceC2260f;
                this.f31128d = interfaceC3191z0;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                return new C0665a(this.f31126b, this.f31127c, this.f31128d, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, d dVar) {
                return ((C0665a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
            
                if (r7.collect(r1, r6) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
            
                if (p017b7.AbstractC1785g.g(r7, r1, r6) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
            
                return r0;
             */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objF = c.f();
                int i8 = this.f31125a;
                if (i8 == 0) {
                    r.b(obj);
                    if (t.c(this.f31126b, h.f2820a)) {
                        InterfaceC2260f interfaceC2260f = this.f31127c;
                        C0666a c0666a = new C0666a(this.f31128d);
                        this.f31125a = 1;
                    } else {
                        g gVar = this.f31126b;
                        b bVar = new b(this.f31127c, this.f31128d, null);
                        this.f31125a = 2;
                    }
                } else {
                    if (i8 != 1 && i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0664a(AbstractC1726i abstractC1726i, AbstractC1726i.b bVar, g gVar, InterfaceC2260f interfaceC2260f, d dVar) {
            super(2, dVar);
            this.f31121c = abstractC1726i;
            this.f31122d = bVar;
            this.f31123e = gVar;
            this.f31124f = interfaceC2260f;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            C0664a c0664a = new C0664a(this.f31121c, this.f31122d, this.f31123e, this.f31124f, dVar);
            c0664a.f31120b = obj;
            return c0664a;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3191z0 interfaceC3191z0, d dVar) {
            return ((C0664a) create(interfaceC3191z0, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f31119a;
            if (i8 == 0) {
                r.b(obj);
                InterfaceC3191z0 interfaceC3191z0 = (InterfaceC3191z0) this.f31120b;
                AbstractC1726i abstractC1726i = this.f31121c;
                AbstractC1726i.b bVar = this.f31122d;
                C0665a c0665a = new C0665a(this.f31123e, this.f31124f, interfaceC3191z0, null);
                this.f31119a = 1;
                if (C.a(abstractC1726i, bVar, c0665a, this) == objF) {
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

    public static final q1 a(InterfaceC2260f interfaceC2260f, Object obj, AbstractC1726i abstractC1726i, AbstractC1726i.b bVar, g gVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(1977777920);
        if ((i9 & 4) != 0) {
            bVar = AbstractC1726i.b.STARTED;
        }
        AbstractC1726i.b bVar2 = bVar;
        if ((i9 & 8) != 0) {
            gVar = h.f2820a;
        }
        g gVar2 = gVar;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1977777920, i8, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:169)");
        }
        Object[] objArr = {interfaceC2260f, abstractC1726i, bVar2, gVar2};
        interfaceC3163l.f(710004817);
        boolean zL = interfaceC3163l.l(abstractC1726i) | ((((i8 & 7168) ^ 3072) > 2048 && interfaceC3163l.R(bVar2)) || (i8 & 3072) == 2048) | interfaceC3163l.l(gVar2) | interfaceC3163l.l(interfaceC2260f);
        Object objG = interfaceC3163l.g();
        if (zL || objG == InterfaceC3163l.f38803a.a()) {
            C0664a c0664a = new C0664a(abstractC1726i, bVar2, gVar2, interfaceC2260f, null);
            interfaceC3163l.H(c0664a);
            objG = c0664a;
        }
        interfaceC3163l.N();
        q1 q1VarN = g1.n(obj, objArr, (o) objG, interfaceC3163l, (i8 >> 3) & 14);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return q1VarN;
    }

    public static final q1 b(M m8, InterfaceC1733p interfaceC1733p, AbstractC1726i.b bVar, g gVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(743249048);
        if ((i9 & 1) != 0) {
            interfaceC1733p = (InterfaceC1733p) interfaceC3163l.e(d.a());
        }
        if ((i9 & 2) != 0) {
            bVar = AbstractC1726i.b.STARTED;
        }
        AbstractC1726i.b bVar2 = bVar;
        if ((i9 & 4) != 0) {
            gVar = h.f2820a;
        }
        g gVar2 = gVar;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(743249048, i8, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:60)");
        }
        int i10 = i8 << 3;
        q1 q1VarA = a(m8, m8.getValue(), interfaceC1733p.w(), bVar2, gVar2, interfaceC3163l, (i8 & 14) | (i10 & 7168) | (i10 & 57344), 0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return q1VarA;
    }
}
