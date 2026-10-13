package p106l6;

import C6.G;
import C6.r;
import G6.d;
import I6.l;
import Q6.o;
import io.ktor.utils.io.g;
import p017b7.AbstractC1785g;
import p017b7.J;
import p017b7.Z;
import r7.B;
import r7.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f29216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f29217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p181u6.a f29218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f29219d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, p181u6.a aVar, c cVar, d dVar) {
            super(2, dVar);
            this.f29217b = gVar;
            this.f29218c = aVar;
            this.f29219d = cVar;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new a(this.f29217b, this.f29218c, this.f29219d, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f29216a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return B.b(this.f29219d, io.ktor.utils.io.jvm.javaio.b.d(this.f29217b, null, 1, null), p097k6.g.d(this.f29219d.a(), f.a(this.f29218c)), null, 4, null);
        }
    }

    public static final Object a(c cVar, g gVar, p181u6.a aVar, d dVar) {
        return AbstractC1785g.g(Z.b(), new a(gVar, aVar, cVar, null), dVar);
    }
}
