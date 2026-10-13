package p168t1;

import C6.G;
import C6.r;
import I6.d;
import Q6.k;
import kotlin.jvm.internal.t;
import p192w1.p;
import p192w1.q;

/* JADX INFO: renamed from: t1.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3003h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34065a = a.b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p160s1.b f34066b = new p160s1.b(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p160s1.c f34067c = new p160s1.c(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f34068d = p.a();

    /* JADX INFO: renamed from: t1.h$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC3008m f34070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f34071b;

        public b(InterfaceC3008m interfaceC3008m, Object obj) {
            this.f34070a = interfaceC3008m;
            this.f34071b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return t.c(this.f34070a, bVar.f34070a) && t.c(this.f34071b, bVar.f34071b);
        }

        public int hashCode() {
            int iHashCode = this.f34070a.hashCode() * 31;
            Object obj = this.f34071b;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.f34070a + ", loaderKey=" + this.f34071b + ')';
        }
    }

    /* JADX INFO: renamed from: t1.h$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f34072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f34073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f34074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f34075d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f34077f;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f34075d = obj;
            this.f34077f |= Integer.MIN_VALUE;
            return C3003h.this.g(null, null, false, null, this);
        }
    }

    public static /* synthetic */ void f(C3003h c3003h, InterfaceC3008m interfaceC3008m, H h8, Object obj, boolean z8, int i8, Object obj2) {
        if ((i8 & 8) != 0) {
            z8 = false;
        }
        c3003h.e(interfaceC3008m, h8, obj, z8);
    }

    public final a d(InterfaceC3008m interfaceC3008m, H h8) {
        a aVar;
        b bVar = new b(interfaceC3008m, h8.c());
        synchronized (this.f34068d) {
            aVar = (a) this.f34066b.d(bVar);
            if (aVar == null) {
                aVar = (a) this.f34067c.c(bVar);
            }
        }
        return aVar;
    }

    public final void e(InterfaceC3008m interfaceC3008m, H h8, Object obj, boolean z8) {
        b bVar = new b(interfaceC3008m, h8.c());
        synchronized (this.f34068d) {
            try {
                if (obj == null) {
                } else if (z8) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(InterfaceC3008m interfaceC3008m, H h8, boolean z8, k kVar, G6.d dVar) {
        c cVar;
        b bVar;
        C3003h c3003h;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i8 = cVar.f34077f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.f34077f = i8 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f34075d;
        Object objF = H6.c.f();
        int i9 = cVar.f34077f;
        if (i9 == 0) {
            r.b(obj);
            b bVar2 = new b(interfaceC3008m, h8.c());
            synchronized (this.f34068d) {
                try {
                    a aVar = (a) this.f34066b.d(bVar2);
                    if (aVar == null) {
                        aVar = (a) this.f34067c.c(bVar2);
                    }
                    if (aVar != null) {
                        return aVar.g();
                    }
                    G g8 = G.f1419a;
                    cVar.f34072a = this;
                    cVar.f34073b = bVar2;
                    cVar.f34074c = z8;
                    cVar.f34077f = 1;
                    Object objInvoke = kVar.invoke(cVar);
                    if (objInvoke == objF) {
                        return objF;
                    }
                    obj = objInvoke;
                    bVar = bVar2;
                    c3003h = this;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z8 = cVar.f34074c;
            bVar = (b) cVar.f34073b;
            c3003h = (C3003h) cVar.f34072a;
            r.b(obj);
        }
        synchronized (c3003h.f34068d) {
            try {
                if (obj == null) {
                    c3003h.f34067c.i(bVar, a.a(c3003h.f34065a));
                } else if (z8) {
                    c3003h.f34067c.i(bVar, a.a(a.b(obj)));
                } else {
                    c3003h.f34066b.e(bVar, a.a(a.b(obj)));
                }
                G g9 = G.f1419a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: t1.h$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f34069a;

        public /* synthetic */ a(Object obj) {
            this.f34069a = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        public static boolean c(Object obj, Object obj2) {
            return (obj2 instanceof a) && t.c(obj, ((a) obj2).g());
        }

        public static int d(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static final boolean e(Object obj) {
            return obj == null;
        }

        public static String f(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return c(this.f34069a, obj);
        }

        public final /* synthetic */ Object g() {
            return this.f34069a;
        }

        public int hashCode() {
            return d(this.f34069a);
        }

        public String toString() {
            return f(this.f34069a);
        }

        public static Object b(Object obj) {
            return obj;
        }
    }
}
