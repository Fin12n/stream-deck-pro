package L5;

import C6.G;
import C6.r;
import I6.l;
import Q6.o;
import R0.pkXL.Oitvkwcwn;
import T5.e;
import io.ktor.utils.io.C;
import io.ktor.utils.io.InterfaceC2442c;
import io.ktor.utils.io.g;
import io.ktor.utils.io.i;
import io.ktor.utils.io.j;
import io.ktor.utils.io.q;
import kotlin.jvm.internal.t;
import p017b7.J;
import p115m6.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f5048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2442c f5049c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, InterfaceC2442c interfaceC2442c, G6.d dVar) {
            super(2, dVar);
            this.f5048b = gVar;
            this.f5049c = interfaceC2442c;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new a(this.f5048b, this.f5049c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C c8, G6.d dVar) {
            return ((a) create(c8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Throwable th;
            Object objF = H6.c.f();
            int i8 = this.f5047a;
            if (i8 == 0) {
                r.b(obj);
                try {
                    g gVar = this.f5048b;
                    InterfaceC2442c interfaceC2442c = this.f5049c;
                    this.f5047a = 1;
                    aVar = this;
                    try {
                        if (i.c(gVar, interfaceC2442c, 0L, aVar, 2, null) == objF) {
                            return objF;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        aVar.f5048b.f(th);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    aVar = this;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    r.b(obj);
                } catch (Throwable th4) {
                    th = th4;
                    aVar = this;
                    aVar.f5048b.f(th);
                }
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2442c f5051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f5052c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC2442c interfaceC2442c, j jVar, G6.d dVar) {
            super(2, dVar);
            this.f5051b = interfaceC2442c;
            this.f5052c = jVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new b(this.f5051b, this.f5052c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C c8, G6.d dVar) {
            return ((b) create(c8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            b bVar;
            Throwable th;
            Object objF = H6.c.f();
            int i8 = this.f5050a;
            if (i8 == 0) {
                r.b(obj);
                try {
                    InterfaceC2442c interfaceC2442c = this.f5051b;
                    j jVar = this.f5052c;
                    this.f5050a = 1;
                    bVar = this;
                    try {
                        if (i.c(interfaceC2442c, jVar, 0L, bVar, 2, null) == objF) {
                            return objF;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        bVar.f5051b.d(th);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bVar = this;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    r.b(obj);
                } catch (Throwable th4) {
                    th = th4;
                    bVar = this;
                    bVar.f5051b.d(th);
                }
            }
            return G.f1419a;
        }
    }

    public static final g a(J j8, g input, e request) {
        t.g(j8, "<this>");
        t.g(input, "input");
        t.g(request, "request");
        if (z.f30119a.c()) {
            return input;
        }
        InterfaceC2442c interfaceC2442cA = d.a(request);
        q.f(j8, null, interfaceC2442cA, new a(input, interfaceC2442cA, null), 1, null);
        return interfaceC2442cA;
    }

    public static final j b(J j8, j output, e request) {
        t.g(j8, Oitvkwcwn.ZBpxvTjT);
        t.g(output, "output");
        t.g(request, "request");
        if (z.f30119a.c()) {
            return output;
        }
        InterfaceC2442c interfaceC2442cA = d.a(request);
        q.f(j8, null, interfaceC2442cA, new b(interfaceC2442cA, output, null), 1, null);
        return interfaceC2442cA;
    }
}
