package p048f2;

import C6.G;
import C6.r;
import I6.d;
import p017b7.AbstractC1816w;
import p017b7.InterfaceC1812u;
import p098k7.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p098k7.a f21535a = c.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1812u f21536b = AbstractC1816w.b(null, 1, null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f21538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f21539c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21541e;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f21539c = obj;
            this.f21541e |= Integer.MIN_VALUE;
            return A.this.c(this);
        }
    }

    public final Object a(G6.d dVar) {
        Object objQ0 = this.f21536b.Q0(dVar);
        return objQ0 == H6.c.f() ? objQ0 : G.f1419a;
    }

    public abstract Object b(G6.d dVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(G6.d dVar) throws Throwable {
        a aVar;
        p098k7.a aVar2;
        A a8;
        p098k7.a aVar3;
        Throwable th;
        A a9;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f21541e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f21541e = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f21539c;
        Object objF = H6.c.f();
        int i9 = aVar.f21541e;
        try {
            if (i9 == 0) {
                r.b(obj);
                if (this.f21536b.y()) {
                    return G.f1419a;
                }
                aVar2 = this.f21535a;
                aVar.f21537a = this;
                aVar.f21538b = aVar2;
                aVar.f21541e = 1;
                if (aVar2.b(null, aVar) != objF) {
                    a8 = this;
                }
                return objF;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (p098k7.a) aVar.f21538b;
                a9 = (A) aVar.f21537a;
                try {
                    r.b(obj);
                    InterfaceC1812u interfaceC1812u = a9.f21536b;
                    G g8 = G.f1419a;
                    interfaceC1812u.r1(g8);
                    aVar3.e(null);
                    return g8;
                } catch (Throwable th2) {
                    th = th2;
                    aVar3.e(null);
                    throw th;
                }
            }
            p098k7.a aVar4 = (p098k7.a) aVar.f21538b;
            a8 = (A) aVar.f21537a;
            r.b(obj);
            aVar2 = aVar4;
            if (a8.f21536b.y()) {
                G g9 = G.f1419a;
                aVar2.e(null);
                return g9;
            }
            aVar.f21537a = a8;
            aVar.f21538b = aVar2;
            aVar.f21541e = 2;
            if (a8.b(aVar) != objF) {
                aVar3 = aVar2;
                a9 = a8;
                InterfaceC1812u interfaceC1812u2 = a9.f21536b;
                G g10 = G.f1419a;
                interfaceC1812u2.r1(g10);
                aVar3.e(null);
                return g10;
            }
            return objF;
        } catch (Throwable th3) {
            aVar3 = aVar2;
            th = th3;
            aVar3.e(null);
            throw th;
        }
    }
}
