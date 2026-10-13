package p044e7;

import C6.C0918g;
import C6.G;
import C6.r;
import I6.d;
import Q6.o;
import Q6.p;
import io.jentz.winter.js.HRHLwtyqJWz;
import java.lang.reflect.InvocationTargetException;
import p053f7.u;

/* JADX INFO: renamed from: e7.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2269o {

    /* JADX INFO: renamed from: e7.o$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f21046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f21047c;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f21046b = obj;
            this.f21047c |= Integer.MIN_VALUE;
            return AbstractC2269o.c(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: e7.o$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f21048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f21049b;

        /* JADX INFO: renamed from: e7.o$b$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f21050a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f21051b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Object f21053d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Object f21054e;

            public a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f21050a = obj;
                this.f21051b |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        public b(InterfaceC2260f interfaceC2260f, p pVar) {
            this.f21048a = interfaceC2260f;
            this.f21049b = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0088  */
        /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) throws Throwable {
            a aVar;
            b bVar;
            S s8;
            p pVar;
            u uVar;
            Throwable th;
            u uVar2;
            Object objInvoke;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i8 = aVar.f21051b;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    aVar.f21051b = i8 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj = aVar.f21050a;
            Object objF = H6.c.f();
            int i9 = aVar.f21051b;
            if (i9 == 0) {
                r.b(obj);
                try {
                    InterfaceC2260f interfaceC2260f = this.f21048a;
                    aVar.f21053d = this;
                    aVar.f21054e = interfaceC2261g;
                    aVar.f21051b = 1;
                    if (interfaceC2260f.collect(interfaceC2261g, aVar) != objF) {
                        bVar = this;
                        uVar = new u(interfaceC2261g, aVar.getContext());
                        p pVar2 = bVar.f21049b;
                        aVar.f21053d = uVar;
                        aVar.f21054e = null;
                        aVar.f21051b = 3;
                        kotlin.jvm.internal.r.a(6);
                        objInvoke = pVar2.invoke(uVar, null, aVar);
                        kotlin.jvm.internal.r.a(7);
                        if (objInvoke != objF) {
                            uVar2 = uVar;
                            uVar2.releaseIntercepted();
                            return G.f1419a;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = this;
                    s8 = new S(th);
                    pVar = bVar.f21049b;
                    aVar.f21053d = th;
                    aVar.f21054e = null;
                    aVar.f21051b = 2;
                    if (AbstractC2269o.c(s8, pVar, th, aVar) == objF) {
                        throw th;
                    }
                }
                return objF;
            }
            if (i9 != 1) {
                if (i9 == 2) {
                    Throwable th3 = (Throwable) aVar.f21053d;
                    r.b(obj);
                    throw th3;
                }
                if (i9 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uVar2 = (u) aVar.f21053d;
                try {
                    r.b(obj);
                    uVar2.releaseIntercepted();
                    return G.f1419a;
                } catch (Throwable th4) {
                    th = th4;
                    uVar2.releaseIntercepted();
                    throw th;
                }
            }
            interfaceC2261g = (InterfaceC2261g) aVar.f21054e;
            bVar = (b) aVar.f21053d;
            try {
                r.b(obj);
                uVar = new u(interfaceC2261g, aVar.getContext());
                try {
                    p pVar3 = bVar.f21049b;
                    aVar.f21053d = uVar;
                    aVar.f21054e = null;
                    aVar.f21051b = 3;
                    kotlin.jvm.internal.r.a(6);
                    objInvoke = pVar3.invoke(uVar, null, aVar);
                    kotlin.jvm.internal.r.a(7);
                    if (objInvoke != objF) {
                        uVar2 = uVar;
                        uVar2.releaseIntercepted();
                        return G.f1419a;
                    }
                    return objF;
                } catch (Throwable th5) {
                    th = th5;
                    uVar2 = uVar;
                    uVar2.releaseIntercepted();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                s8 = new S(th);
                pVar = bVar.f21049b;
                aVar.f21053d = th;
                aVar.f21054e = null;
                aVar.f21051b = 2;
                if (AbstractC2269o.c(s8, pVar, th, aVar) == objF) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e7.o$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f21055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f21056b;

        /* JADX INFO: renamed from: e7.o$c$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f21057a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f21058b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Object f21060d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Object f21061e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public Object f21062f;

            public a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f21057a = obj;
                this.f21058b |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(o oVar, InterfaceC2260f interfaceC2260f) {
            this.f21055a = oVar;
            this.f21056b = interfaceC2260f;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
        
            if (r7.collect(r2, r0) == r1) goto L27;
         */
        @Override // p044e7.InterfaceC2260f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) throws Throwable {
            a aVar;
            Throwable th;
            u uVar;
            c cVar;
            InterfaceC2261g interfaceC2261g2;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i8 = aVar.f21058b;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    aVar.f21058b = i8 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj = aVar.f21057a;
            Object objF = H6.c.f();
            int i9 = aVar.f21058b;
            if (i9 != 0) {
                if (i9 == 1) {
                    uVar = (u) aVar.f21062f;
                    interfaceC2261g2 = (InterfaceC2261g) aVar.f21061e;
                    cVar = (c) aVar.f21060d;
                    try {
                        r.b(obj);
                        uVar.releaseIntercepted();
                        InterfaceC2260f interfaceC2260f = cVar.f21056b;
                        aVar.f21060d = null;
                        aVar.f21061e = null;
                        aVar.f21062f = null;
                        aVar.f21058b = 2;
                    } catch (Throwable th2) {
                        th = th2;
                        uVar.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i9 != 2) {
                        throw new IllegalStateException(HRHLwtyqJWz.ztHuqlu);
                    }
                    r.b(obj);
                }
                return G.f1419a;
            }
            r.b(obj);
            u uVar2 = new u(interfaceC2261g, aVar.getContext());
            try {
                o oVar = this.f21055a;
                aVar.f21060d = this;
                aVar.f21061e = interfaceC2261g;
                aVar.f21062f = uVar2;
                aVar.f21058b = 1;
                kotlin.jvm.internal.r.a(6);
                Object objInvoke = oVar.invoke(uVar2, aVar);
                kotlin.jvm.internal.r.a(7);
                if (objInvoke != objF) {
                    cVar = this;
                    interfaceC2261g2 = interfaceC2261g;
                    uVar = uVar2;
                    uVar.releaseIntercepted();
                    InterfaceC2260f interfaceC2260f2 = cVar.f21056b;
                    aVar.f21060d = null;
                    aVar.f21061e = null;
                    aVar.f21062f = null;
                    aVar.f21058b = 2;
                }
                return objF;
            } catch (Throwable th3) {
                th = th3;
                uVar = uVar2;
                uVar.releaseIntercepted();
                throw th;
            }
        }
    }

    public static final void b(InterfaceC2261g interfaceC2261g) {
        if (interfaceC2261g instanceof S) {
            throw ((S) interfaceC2261g).f20969a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(InterfaceC2261g interfaceC2261g, p pVar, Throwable th, G6.d dVar) throws IllegalAccessException, InvocationTargetException {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f21047c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f21047c = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f21046b;
        Object objF = H6.c.f();
        int i9 = aVar.f21047c;
        try {
            if (i9 == 0) {
                r.b(obj);
                aVar.f21045a = th;
                aVar.f21047c = 1;
                if (pVar.invoke(interfaceC2261g, th, aVar) == objF) {
                    return objF;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) aVar.f21045a;
                r.b(obj);
            }
            return G.f1419a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                C0918g.a(th2, th);
            }
            throw th2;
        }
    }

    public static final InterfaceC2260f d(InterfaceC2260f interfaceC2260f, p pVar) {
        return new b(interfaceC2260f, pVar);
    }

    public static final InterfaceC2260f e(InterfaceC2260f interfaceC2260f, o oVar) {
        return new c(oVar, interfaceC2260f);
    }
}
