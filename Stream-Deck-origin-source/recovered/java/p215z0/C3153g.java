package p215z0;

import C6.G;
import C6.q;
import C6.r;
import G6.d;
import G6.g;
import H6.c;
import I6.h;
import Q6.k;
import Q6.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.C1797m;

/* JADX INFO: renamed from: z0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3153g implements InterfaceC3146c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f38746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f38747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f38748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f38749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f38750e;

    /* JADX INFO: renamed from: z0.g$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f38751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f38752b;

        public a(k kVar, d<Object> dVar) {
            this.f38751a = kVar;
            this.f38752b = dVar;
        }

        public final d a() {
            return this.f38752b;
        }

        public final void b(long j8) {
            Object objB;
            d dVar = this.f38752b;
            try {
                q.a aVar = q.f1441b;
                objB = q.b(this.f38751a.invoke(Long.valueOf(j8)));
            } catch (Throwable th) {
                q.a aVar2 = q.f1441b;
                objB = q.b(r.a(th));
            }
            dVar.resumeWith(objB);
        }
    }

    /* JADX INFO: renamed from: z0.g$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f38754b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(J j8) {
            super(1);
            this.f38754b = j8;
        }

        public final void b(Throwable th) {
            a aVar;
            Object obj = C3153g.this.f38747b;
            C3153g c3153g = C3153g.this;
            J j8 = this.f38754b;
            synchronized (obj) {
                try {
                    List list = c3153g.f38749d;
                    Object obj2 = j8.f28779a;
                    if (obj2 == null) {
                        t.t("awaiter");
                        aVar = null;
                    } else {
                        aVar = (a) obj2;
                    }
                    list.remove(aVar);
                    G g8 = G.f1419a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3153g() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // G6.g.b, G6.g
    public g.b A(g.c cVar) {
        return InterfaceC3146c0.a.b(this, cVar);
    }

    @Override // G6.g
    public g P1(g gVar) {
        return InterfaceC3146c0.a.d(this, gVar);
    }

    @Override // p215z0.InterfaceC3146c0
    public Object V0(k kVar, d dVar) {
        a aVar;
        C1797m c1797m = new C1797m(H6.b.c(dVar), 1);
        c1797m.z();
        J j8 = new J();
        synchronized (this.f38747b) {
            Throwable th = this.f38748c;
            if (th != null) {
                q.a aVar2 = q.f1441b;
                c1797m.resumeWith(q.b(r.a(th)));
            } else {
                j8.f28779a = new a(kVar, c1797m);
                boolean zIsEmpty = this.f38749d.isEmpty();
                List list = this.f38749d;
                Object obj = j8.f28779a;
                if (obj == null) {
                    t.t("awaiter");
                    aVar = null;
                } else {
                    aVar = (a) obj;
                }
                list.add(aVar);
                c1797m.J(new b(j8));
                if (zIsEmpty && this.f38746a != null) {
                    try {
                        this.f38746a.invoke();
                    } catch (Throwable th2) {
                        h(th2);
                    }
                }
            }
        }
        Object objS = c1797m.s();
        if (objS == c.f()) {
            h.c(dVar);
        }
        return objS;
    }

    public final void h(Throwable th) {
        synchronized (this.f38747b) {
            try {
                if (this.f38748c != null) {
                    return;
                }
                this.f38748c = th;
                List list = this.f38749d;
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    d dVarA = ((a) list.get(i8)).a();
                    q.a aVar = q.f1441b;
                    dVarA.resumeWith(q.b(r.a(th)));
                }
                this.f38749d.clear();
                G g8 = G.f1419a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i() {
        boolean z8;
        synchronized (this.f38747b) {
            z8 = !this.f38749d.isEmpty();
        }
        return z8;
    }

    @Override // G6.g.b, G6.g
    public g j(g.c cVar) {
        return InterfaceC3146c0.a.c(this, cVar);
    }

    public final void k(long j8) {
        synchronized (this.f38747b) {
            try {
                List list = this.f38749d;
                this.f38749d = this.f38750e;
                this.f38750e = list;
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((a) list.get(i8)).b(j8);
                }
                list.clear();
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G6.g.b, G6.g
    public Object t(Object obj, o oVar) {
        return InterfaceC3146c0.a.a(this, obj, oVar);
    }

    public C3153g(Function0 function0) {
        this.f38746a = function0;
        this.f38747b = new Object();
        this.f38749d = new ArrayList();
        this.f38750e = new ArrayList();
    }

    public /* synthetic */ C3153g(Function0 function0, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? null : function0);
    }
}
