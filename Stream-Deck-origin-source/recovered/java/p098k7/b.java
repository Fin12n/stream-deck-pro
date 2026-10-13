package p098k7;

import C6.G;
import G6.d;
import G6.g;
import H6.c;
import I6.h;
import Q6.k;
import Q6.p;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1801o;
import p017b7.C1797m;
import p017b7.F;
import p017b7.InterfaceC1795l;
import p017b7.N;
import p017b7.b1;
import p062g7.D;
import p089j7.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class b extends e implements p098k7.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28743i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f28744h;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class a implements InterfaceC1795l, b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1797m f28745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f28746b;

        /* JADX INFO: renamed from: k7.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0629a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f28748a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f28749b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0629a(b bVar, a aVar) {
                super(1);
                this.f28748a = bVar;
                this.f28749b = aVar;
            }

            public final void b(Throwable th) {
                this.f28748a.e(this.f28749b.f28746b);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: renamed from: k7.b$a$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0630b extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f28750a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f28751b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0630b(b bVar, a aVar) {
                super(1);
                this.f28750a = bVar;
                this.f28751b = aVar;
            }

            public final void b(Throwable th) {
                b.w().set(this.f28750a, this.f28751b.f28746b);
                this.f28750a.e(this.f28751b.f28746b);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return G.f1419a;
            }
        }

        public a(C1797m c1797m, Object obj) {
            this.f28745a = c1797m;
            this.f28746b = obj;
        }

        @Override // p017b7.InterfaceC1795l
        public void J(k kVar) {
            this.f28745a.J(kVar);
        }

        @Override // p017b7.InterfaceC1795l
        public void K(Object obj) {
            this.f28745a.K(obj);
        }

        @Override // p017b7.InterfaceC1795l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void G(G g8, k kVar) {
            b.w().set(b.this, this.f28746b);
            this.f28745a.G(g8, new C0629a(b.this, this));
        }

        @Override // p017b7.InterfaceC1795l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void C(F f8, G g8) {
            this.f28745a.C(f8, g8);
        }

        @Override // p017b7.InterfaceC1795l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Object F(G g8, Object obj, k kVar) {
            Object objF = this.f28745a.F(g8, obj, new C0630b(b.this, this));
            if (objF != null) {
                b.w().set(b.this, this.f28746b);
            }
            return objF;
        }

        @Override // p017b7.b1
        public void d(D d8, int i8) {
            this.f28745a.d(d8, i8);
        }

        @Override // p017b7.InterfaceC1795l
        public boolean f(Throwable th) {
            return this.f28745a.f(th);
        }

        @Override // G6.d
        public g getContext() {
            return this.f28745a.getContext();
        }

        @Override // p017b7.InterfaceC1795l
        public boolean isCancelled() {
            return this.f28745a.isCancelled();
        }

        @Override // G6.d
        public void resumeWith(Object obj) {
            this.f28745a.resumeWith(obj);
        }

        @Override // p017b7.InterfaceC1795l
        public boolean y() {
            return this.f28745a.y();
        }
    }

    /* JADX INFO: renamed from: k7.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0631b extends u implements p {

        /* JADX INFO: renamed from: k7.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f28753a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f28754b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Object obj) {
                super(1);
                this.f28753a = bVar;
                this.f28754b = obj;
            }

            public final void b(Throwable th) {
                this.f28753a.e(this.f28754b);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return G.f1419a;
            }
        }

        public C0631b() {
            super(3);
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k invoke(j jVar, Object obj, Object obj2) {
            return new a(b.this, obj);
        }
    }

    public b(boolean z8) {
        super(1, z8 ? 1 : 0);
        this.owner$volatile = z8 ? null : c.f28755a;
        this.f28744h = new C0631b();
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater w() {
        return f28743i;
    }

    public static /* synthetic */ Object z(b bVar, Object obj, d dVar) {
        if (bVar.c(obj)) {
            return G.f1419a;
        }
        Object objA = bVar.A(obj, dVar);
        return objA == c.f() ? objA : G.f1419a;
    }

    public final Object A(Object obj, d dVar) {
        C1797m c1797mB = AbstractC1801o.b(H6.b.c(dVar));
        try {
            g(new a(c1797mB, obj));
            Object objS = c1797mB.s();
            if (objS == c.f()) {
                h.c(dVar);
            }
            return objS == c.f() ? objS : G.f1419a;
        } catch (Throwable th) {
            c1797mB.M();
            throw th;
        }
    }

    public final int B(Object obj) {
        while (!s()) {
            if (obj == null) {
                return 1;
            }
            int iX = x(obj);
            if (iX == 1) {
                return 2;
            }
            if (iX == 2) {
                return 1;
            }
        }
        f28743i.set(this, obj);
        return 0;
    }

    @Override // p098k7.a
    public Object b(Object obj, d dVar) {
        return z(this, obj, dVar);
    }

    @Override // p098k7.a
    public boolean c(Object obj) {
        int iB = B(obj);
        if (iB == 0) {
            return true;
        }
        if (iB == 1) {
            return false;
        }
        if (iB != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // p098k7.a
    public void e(Object obj) {
        while (y()) {
            Object obj2 = f28743i.get(this);
            if (obj2 != c.f28755a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (F1.b.a(f28743i, this, obj2, c.f28755a)) {
                    a();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public String toString() {
        return "Mutex@" + N.b(this) + "[isLocked=" + y() + ",owner=" + f28743i.get(this) + ']';
    }

    public final int x(Object obj) {
        while (y()) {
            Object obj2 = f28743i.get(this);
            if (obj2 != c.f28755a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    public boolean y() {
        return m() == 0;
    }
}
