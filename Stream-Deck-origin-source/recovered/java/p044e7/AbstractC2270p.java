package p044e7;

import C6.C0918g;
import C6.G;
import C6.r;
import G6.g;
import I6.d;
import Q6.p;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.t;
import p017b7.InterfaceC1815v0;

/* JADX INFO: renamed from: e7.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2270p {

    /* JADX INFO: renamed from: e7.p$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f21063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f21064b;

        /* JADX INFO: renamed from: e7.p$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0489a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f21065a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f21066b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Object f21068d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Object f21069e;

            public C0489a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f21065a = obj;
                this.f21066b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(InterfaceC2260f interfaceC2260f, p pVar) {
            this.f21063a = interfaceC2260f;
            this.f21064b = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        
            if (r6 == r1) goto L24;
         */
        @Override // p044e7.InterfaceC2260f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            C0489a c0489a;
            a aVar;
            if (dVar instanceof C0489a) {
                c0489a = (C0489a) dVar;
                int i8 = c0489a.f21066b;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c0489a.f21066b = i8 - Integer.MIN_VALUE;
                } else {
                    c0489a = new C0489a(dVar);
                }
            } else {
                c0489a = new C0489a(dVar);
            }
            Object objG = c0489a.f21065a;
            Object objF = H6.c.f();
            int i9 = c0489a.f21066b;
            if (i9 != 0) {
                if (i9 == 1) {
                    interfaceC2261g = (InterfaceC2261g) c0489a.f21069e;
                    aVar = (a) c0489a.f21068d;
                    r.b(objG);
                } else {
                    if (i9 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(objG);
                }
                return G.f1419a;
            }
            r.b(objG);
            InterfaceC2260f interfaceC2260f = this.f21063a;
            c0489a.f21068d = this;
            c0489a.f21069e = interfaceC2261g;
            c0489a.f21066b = 1;
            objG = AbstractC2262h.g(interfaceC2260f, interfaceC2261g, c0489a);
            if (objG != objF) {
                aVar = this;
            }
            return objF;
            Throwable th = (Throwable) objG;
            if (th != null) {
                p pVar = aVar.f21064b;
                c0489a.f21068d = null;
                c0489a.f21069e = null;
                c0489a.f21066b = 2;
                kotlin.jvm.internal.r.a(6);
                Object objInvoke = pVar.invoke(interfaceC2261g, th, c0489a);
                kotlin.jvm.internal.r.a(7);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: e7.p$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f21071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f21072c;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f21071b = obj;
            this.f21072c |= Integer.MIN_VALUE;
            return AbstractC2262h.g(null, null, this);
        }
    }

    /* JADX INFO: renamed from: e7.p$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements InterfaceC2261g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2261g f21073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f21074b;

        /* JADX INFO: renamed from: e7.p$c$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f21075a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f21076b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f21078d;

            public a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f21076b = obj;
                this.f21078d |= Integer.MIN_VALUE;
                return c.this.emit(null, this);
            }
        }

        public c(InterfaceC2261g interfaceC2261g, J j8) {
            this.f21073a = interfaceC2261g;
            this.f21074b = j8;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p044e7.InterfaceC2261g
        public final Object emit(Object obj, G6.d dVar) throws Throwable {
            a aVar;
            c cVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i8 = aVar.f21078d;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    aVar.f21078d = i8 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj2 = aVar.f21076b;
            Object objF = H6.c.f();
            int i9 = aVar.f21078d;
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (c) aVar.f21075a;
                try {
                    r.b(obj2);
                    return G.f1419a;
                } catch (Throwable th) {
                    th = th;
                    cVar.f21074b.f28779a = th;
                    throw th;
                }
            }
            r.b(obj2);
            try {
                InterfaceC2261g interfaceC2261g = this.f21073a;
                aVar.f21075a = this;
                aVar.f21078d = 1;
                if (interfaceC2261g.emit(obj, aVar) == objF) {
                    return objF;
                }
                return G.f1419a;
            } catch (Throwable th2) {
                th = th2;
                cVar = this;
                cVar.f21074b.f28779a = th;
                throw th;
            }
        }
    }

    public static final InterfaceC2260f a(InterfaceC2260f interfaceC2260f, p pVar) {
        return new a(interfaceC2260f, pVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(InterfaceC2260f interfaceC2260f, InterfaceC2261g interfaceC2261g, G6.d dVar) throws Throwable {
        b bVar;
        J j8;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f21072c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f21072c = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f21071b;
        Object objF = H6.c.f();
        int i9 = bVar.f21072c;
        if (i9 == 0) {
            r.b(obj);
            J j9 = new J();
            try {
                InterfaceC2261g cVar = new c(interfaceC2261g, j9);
                bVar.f21070a = j9;
                bVar.f21072c = 1;
                if (interfaceC2260f.collect(cVar, bVar) == objF) {
                    return objF;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                j8 = j9;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j8 = (J) bVar.f21070a;
            try {
                r.b(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) j8.f28779a;
        if (d(th, th3) || c(th, bVar.getContext())) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            C0918g.a(th3, th);
            throw th3;
        }
        C0918g.a(th, th3);
        throw th;
    }

    public static final boolean c(Throwable th, g gVar) {
        InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) gVar.A(InterfaceC1815v0.f15985O);
        if (interfaceC1815v0 == null || !interfaceC1815v0.isCancelled()) {
            return false;
        }
        return d(th, interfaceC1815v0.r0());
    }

    public static final boolean d(Throwable th, Throwable th2) {
        return th2 != null && t.c(th2, th);
    }
}
