package p065h1;

import C6.G;
import C6.q;
import C6.r;
import G6.d;
import G6.e;
import G6.g;
import I6.h;
import Q6.k;
import Q6.o;
import android.view.Choreographer;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.C1797m;
import p017b7.InterfaceC1795l;
import p215z0.InterfaceC3146c0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class M implements InterfaceC3146c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Choreographer f24135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f24136b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ K f24137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Choreographer.FrameCallback f24138b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(K k8, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f24137a = k8;
            this.f24138b = frameCallback;
        }

        public final void b(Throwable th) {
            this.f24137a.i2(this.f24138b);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Choreographer.FrameCallback f24140b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f24140b = frameCallback;
        }

        public final void b(Throwable th) {
            M.this.a().removeFrameCallback(this.f24140b);
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
        public final /* synthetic */ InterfaceC1795l f24141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ M f24142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f24143c;

        public c(InterfaceC1795l interfaceC1795l, M m8, k kVar) {
            this.f24141a = interfaceC1795l;
            this.f24142b = m8;
            this.f24143c = kVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j8) {
            Object objB;
            InterfaceC1795l interfaceC1795l = this.f24141a;
            k kVar = this.f24143c;
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

    public M(Choreographer choreographer, K k8) {
        this.f24135a = choreographer;
        this.f24136b = k8;
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
        K k8 = this.f24136b;
        if (k8 == null) {
            g.b bVarA = dVar.getContext().A(e.f2817J);
            k8 = bVarA instanceof K ? (K) bVarA : null;
        }
        C1797m c1797m = new C1797m(H6.b.c(dVar), 1);
        c1797m.z();
        c cVar = new c(c1797m, this, kVar);
        if (k8 == null || !t.c(k8.c2(), a())) {
            a().postFrameCallback(cVar);
            c1797m.J(new b(cVar));
        } else {
            k8.h2(cVar);
            c1797m.J(new a(k8, cVar));
        }
        Object objS = c1797m.s();
        if (objS == H6.c.f()) {
            h.c(dVar);
        }
        return objS;
    }

    public final Choreographer a() {
        return this.f24135a;
    }

    @Override // G6.g.b, G6.g
    public g j(g.c cVar) {
        return InterfaceC3146c0.a.c(this, cVar);
    }

    @Override // G6.g.b, G6.g
    public Object t(Object obj, o oVar) {
        return InterfaceC3146c0.a.a(this, obj, oVar);
    }

    public M(Choreographer choreographer) {
        this(choreographer, null);
    }
}
