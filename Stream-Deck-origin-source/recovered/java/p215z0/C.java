package p215z0;

import C6.G;
import C6.q;
import C6.r;
import G6.d;
import G6.g;
import I6.h;
import I6.l;
import Q6.k;
import Q6.o;
import android.view.Choreographer;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1785g;
import p017b7.C1797m;
import p017b7.InterfaceC1795l;
import p017b7.J;
import p017b7.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C implements InterfaceC3146c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f38504a = new C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Choreographer f38505b = (Choreographer) AbstractC1785g.e(Z.c().o1(), new a(null));

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38506a;

        public a(d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new a(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f38506a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return Choreographer.getInstance();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Choreographer.FrameCallback f38507a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f38507a = frameCallback;
        }

        public final void b(Throwable th) {
            C.f38505b.removeFrameCallback(this.f38507a);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1795l f38508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f38509b;

        public c(InterfaceC1795l interfaceC1795l, k kVar) {
            this.f38508a = interfaceC1795l;
            this.f38509b = kVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j8) {
            Object objB;
            InterfaceC1795l interfaceC1795l = this.f38508a;
            C c8 = C.f38504a;
            k kVar = this.f38509b;
            try {
                q.a aVar = q.f1441b;
                objB = q.b(kVar.invoke(Long.valueOf(j8)));
            } catch (Throwable th) {
                q.a aVar2 = q.f1441b;
                objB = q.b(r.a(th));
            }
            interfaceC1795l.resumeWith(objB);
        }
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
        C1797m c1797m = new C1797m(H6.b.c(dVar), 1);
        c1797m.z();
        c cVar = new c(c1797m, kVar);
        f38505b.postFrameCallback(cVar);
        c1797m.J(new b(cVar));
        Object objS = c1797m.s();
        if (objS == H6.c.f()) {
            h.c(dVar);
        }
        return objS;
    }

    @Override // G6.g.b, G6.g
    public g j(g.c cVar) {
        return InterfaceC3146c0.a.c(this, cVar);
    }

    @Override // G6.g.b, G6.g
    public Object t(Object obj, o oVar) {
        return InterfaceC3146c0.a.a(this, obj, oVar);
    }
}
