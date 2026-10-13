package io.ktor.client.engine.cio;

import C6.G;
import C6.r;
import M5.s;
import X5.P;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.AbstractC1823z0;
import p017b7.C1802o0;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1815v0 f24959a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1815v0 interfaceC1815v0) {
            super(1);
            this.f24959a = interfaceC1815v0;
        }

        public final void b(Throwable th) {
            InterfaceC1815v0.a.a(this.f24959a, null, 1, null);
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
        public int f24960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f24961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ G6.g f24962c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ T5.e f24963d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j8, G6.g gVar, T5.e eVar, G6.d dVar) {
            super(2, dVar);
            this.f24961b = j8;
            this.f24962c = gVar;
            this.f24963d = eVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new b(this.f24961b, this.f24962c, this.f24963d, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f24960a;
            if (i8 == 0) {
                r.b(obj);
                long j8 = this.f24961b;
                this.f24960a = 1;
                if (U.a(j8, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            AbstractC1823z0.d(AbstractC1823z0.n(this.f24962c), "Request is timed out", new s(this.f24963d));
            return G.f1419a;
        }
    }

    public static final long b(T5.e request, c engineConfig) {
        t.g(request, "request");
        t.g(engineConfig, "engineConfig");
        boolean zB = P.b(request.h().l());
        if (request.c(M5.u.f5752d) != null || zB || T5.f.b(request)) {
            return Long.MAX_VALUE;
        }
        return engineConfig.f();
    }

    public static final void c(G6.g gVar, T5.e eVar, long j8) {
        if (j8 == Long.MAX_VALUE || j8 == 0) {
            return;
        }
        AbstractC1823z0.n(gVar).H0(new a(AbstractC1789i.d(C1802o0.f15975a, null, null, new b(j8, gVar, eVar, null), 3, null)));
    }
}
