package p193w2;

import C6.G;
import C6.q;
import C6.r;
import G6.d;
import G6.e;
import I6.h;
import I6.l;
import Q6.k;
import Q6.o;
import android.os.CancellationSignal;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1785g;
import p017b7.AbstractC1789i;
import p017b7.C1797m;
import p017b7.C1802o0;
import p017b7.InterfaceC1795l;
import p017b7.InterfaceC1815v0;
import p017b7.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36797a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: w2.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0820a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f36798a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Callable f36799b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0820a(Callable callable, d dVar) {
                super(2, dVar);
                this.f36799b = callable;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                return new C0820a(this.f36799b, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, d dVar) {
                return ((C0820a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                H6.c.f();
                if (this.f36798a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return this.f36799b.call();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CancellationSignal f36800a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1815v0 f36801b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CancellationSignal cancellationSignal, InterfaceC1815v0 interfaceC1815v0) {
                super(1);
                this.f36800a = cancellationSignal;
                this.f36801b = interfaceC1815v0;
            }

            public final void b(Throwable th) {
                CancellationSignal cancellationSignal = this.f36800a;
                if (cancellationSignal != null) {
                    A2.b.a(cancellationSignal);
                }
                InterfaceC1815v0.a.a(this.f36801b, null, 1, null);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f36802a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Callable f36803b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1795l f36804c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Callable callable, InterfaceC1795l interfaceC1795l, d dVar) {
                super(2, dVar);
                this.f36803b = callable;
                this.f36804c = interfaceC1795l;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                return new c(this.f36803b, this.f36804c, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, d dVar) {
                return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                H6.c.f();
                if (this.f36802a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                try {
                    this.f36804c.resumeWith(q.b(this.f36803b.call()));
                } catch (Throwable th) {
                    InterfaceC1795l interfaceC1795l = this.f36804c;
                    q.a aVar = q.f1441b;
                    interfaceC1795l.resumeWith(q.b(r.a(th)));
                }
                return G.f1419a;
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final Object a(r rVar, boolean z8, CancellationSignal cancellationSignal, Callable callable, d dVar) {
            e eVarB;
            if (rVar.y() && rVar.s()) {
                return callable.call();
            }
            y yVar = (y) dVar.getContext().A(y.f36917c);
            if (yVar == null || (eVarB = yVar.a()) == null) {
                eVarB = z8 ? g.b(rVar) : g.a(rVar);
            }
            e eVar = eVarB;
            C1797m c1797m = new C1797m(H6.b.c(dVar), 1);
            c1797m.z();
            c1797m.J(new b(cancellationSignal, AbstractC1789i.d(C1802o0.f15975a, eVar, null, new c(callable, c1797m, null), 2, null)));
            Object objS = c1797m.s();
            if (objS == H6.c.f()) {
                h.c(dVar);
            }
            return objS;
        }

        public final Object b(r rVar, boolean z8, Callable callable, d dVar) {
            e eVarB;
            if (rVar.y() && rVar.s()) {
                return callable.call();
            }
            y yVar = (y) dVar.getContext().A(y.f36917c);
            if (yVar == null || (eVarB = yVar.a()) == null) {
                eVarB = z8 ? g.b(rVar) : g.a(rVar);
            }
            return AbstractC1785g.g(eVarB, new C0820a(callable, null), dVar);
        }

        public a() {
        }
    }

    public static final Object a(r rVar, boolean z8, CancellationSignal cancellationSignal, Callable callable, d dVar) {
        return f36797a.a(rVar, z8, cancellationSignal, callable, dVar);
    }

    public static final Object b(r rVar, boolean z8, Callable callable, d dVar) {
        return f36797a.b(rVar, z8, callable, dVar);
    }
}
