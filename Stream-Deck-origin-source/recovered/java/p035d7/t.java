package p035d7;

import C6.G;
import C6.q;
import C6.r;
import G6.g;
import H6.c;
import I6.d;
import I6.h;
import Q6.k;
import Q6.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p017b7.C1797m;
import p017b7.E;
import p017b7.InterfaceC1795l;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.L;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class t {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f19955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f19956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f19957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19958d;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f19957c = obj;
            this.f19958d |= Integer.MIN_VALUE;
            return t.a(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1795l f19959a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1795l interfaceC1795l) {
            super(1);
            this.f19959a = interfaceC1795l;
        }

        public final void b(Throwable th) {
            InterfaceC1795l interfaceC1795l = this.f19959a;
            q.a aVar = q.f1441b;
            interfaceC1795l.resumeWith(q.b(G.f1419a));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(v vVar, Function0 function0, G6.d dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f19958d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f19958d = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f19957c;
        Object objF = c.f();
        int i9 = aVar.f19958d;
        try {
            if (i9 == 0) {
                r.b(obj);
                if (aVar.getContext().A(InterfaceC1815v0.f15985O) != vVar) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                aVar.f19955a = vVar;
                aVar.f19956b = function0;
                aVar.f19958d = 1;
                C1797m c1797m = new C1797m(H6.b.c(aVar), 1);
                c1797m.z();
                vVar.k(new b(c1797m));
                Object objS = c1797m.s();
                if (objS == c.f()) {
                    h.c(aVar);
                }
                if (objS == objF) {
                    return objF;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = (Function0) aVar.f19956b;
                r.b(obj);
            }
            function0.invoke();
            return G.f1419a;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }

    public static final x b(J j8, g gVar, int i8, o oVar) {
        return c(j8, gVar, i8, d.SUSPEND, L.DEFAULT, null, oVar);
    }

    public static final x c(J j8, g gVar, int i8, d dVar, L l8, k kVar, o oVar) {
        u uVar = new u(E.e(j8, gVar), j.b(i8, dVar, null, 4, null));
        if (kVar != null) {
            uVar.H0(kVar);
        }
        uVar.c1(l8, uVar, oVar);
        return uVar;
    }

    public static /* synthetic */ x d(J j8, g gVar, int i8, o oVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            gVar = G6.h.f2820a;
        }
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return b(j8, gVar, i8, oVar);
    }

    public static /* synthetic */ x e(J j8, g gVar, int i8, d dVar, L l8, k kVar, o oVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            gVar = G6.h.f2820a;
        }
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            dVar = d.SUSPEND;
        }
        if ((i9 & 8) != 0) {
            l8 = L.DEFAULT;
        }
        if ((i9 & 16) != 0) {
            kVar = null;
        }
        k kVar2 = kVar;
        return c(j8, gVar, i8, dVar, l8, kVar2, oVar);
    }
}
