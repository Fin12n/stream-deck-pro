package io.ktor.utils.io;

import C6.G;
import E4.JFpq.XRlnZWSrAFn;
import Z.JTT.ryTuoS;
import p017b7.AbstractC1789i;
import p017b7.F;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2442c f25556a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2442c interfaceC2442c) {
            super(1);
            this.f25556a = interfaceC2442c;
        }

        public final void b(Throwable th) {
            this.f25556a.d(th);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f25559c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2442c f25560d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Q6.o f25561e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ F f25562f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z8, InterfaceC2442c interfaceC2442c, Q6.o oVar, F f8, G6.d dVar) {
            super(2, dVar);
            this.f25559c = z8;
            this.f25560d = interfaceC2442c;
            this.f25561e = oVar;
            this.f25562f = f8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            b bVar = new b(this.f25559c, this.f25560d, this.f25561e, this.f25562f, dVar);
            bVar.f25558b = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f25557a;
            try {
                if (i8 == 0) {
                    C6.r.b(obj);
                    J j8 = (J) this.f25558b;
                    if (this.f25559c) {
                        InterfaceC2442c interfaceC2442c = this.f25560d;
                        G6.g.b bVarA = j8.getCoroutineContext().A(InterfaceC1815v0.f15985O);
                        kotlin.jvm.internal.t.d(bVarA);
                        interfaceC2442c.A((InterfaceC1815v0) bVarA);
                    }
                    m mVar = new m(j8, this.f25560d);
                    Q6.o oVar = this.f25561e;
                    this.f25557a = 1;
                    if (oVar.invoke(mVar, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj);
                }
            } catch (Throwable th) {
                if (!kotlin.jvm.internal.t.c(this.f25562f, Z.d()) && this.f25562f != null) {
                    throw th;
                }
                this.f25560d.f(th);
            }
            return G.f1419a;
        }
    }

    public static final l a(J j8, G6.g gVar, InterfaceC2442c interfaceC2442c, boolean z8, Q6.o oVar) {
        InterfaceC1815v0 interfaceC1815v0D = AbstractC1789i.d(j8, gVar, null, new b(z8, interfaceC2442c, oVar, (F) j8.getCoroutineContext().A(F.f15894b), null), 2, null);
        interfaceC1815v0D.H0(new a(interfaceC2442c));
        return new l(interfaceC1815v0D, interfaceC2442c);
    }

    public static final y b(J j8, G6.g coroutineContext, InterfaceC2442c channel, Q6.o block) {
        kotlin.jvm.internal.t.g(j8, "<this>");
        kotlin.jvm.internal.t.g(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.t.g(channel, "channel");
        kotlin.jvm.internal.t.g(block, "block");
        return a(j8, coroutineContext, channel, false, block);
    }

    public static final B d(J j8, G6.g coroutineContext, InterfaceC2442c channel, Q6.o block) {
        kotlin.jvm.internal.t.g(j8, "<this>");
        kotlin.jvm.internal.t.g(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.t.g(channel, "channel");
        kotlin.jvm.internal.t.g(block, "block");
        return a(j8, coroutineContext, channel, false, block);
    }

    public static /* synthetic */ B f(J j8, G6.g gVar, InterfaceC2442c interfaceC2442c, Q6.o oVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = G6.h.f2820a;
        }
        return d(j8, gVar, interfaceC2442c, oVar);
    }

    public static /* synthetic */ B g(J j8, G6.g gVar, boolean z8, Q6.o oVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = G6.h.f2820a;
        }
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return e(j8, gVar, z8, oVar);
    }

    public static final y c(J j8, G6.g coroutineContext, boolean z8, Q6.o oVar) {
        kotlin.jvm.internal.t.g(j8, "<this>");
        kotlin.jvm.internal.t.g(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.t.g(oVar, XRlnZWSrAFn.gWikwE);
        return a(j8, coroutineContext, e.a(z8), true, oVar);
    }

    public static final B e(J j8, G6.g coroutineContext, boolean z8, Q6.o oVar) {
        kotlin.jvm.internal.t.g(j8, "<this>");
        kotlin.jvm.internal.t.g(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.t.g(oVar, ryTuoS.JNXCNa);
        return a(j8, coroutineContext, e.a(z8), true, oVar);
    }
}
