package p035d7;

import C6.G;
import C6.q;
import C6.r;
import G6.d;
import H6.c;
import I6.l;
import Q6.o;
import p017b7.AbstractC1787h;
import p017b7.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19949b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y f19950c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f19951d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar, Object obj, d dVar) {
            super(2, dVar);
            this.f19950c = yVar;
            this.f19951d = obj;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            a aVar = new a(this.f19950c, this.f19951d, dVar);
            aVar.f19949b = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = c.f();
            int i8 = this.f19948a;
            try {
                if (i8 == 0) {
                    r.b(obj);
                    y yVar = this.f19950c;
                    Object obj2 = this.f19951d;
                    q.a aVar = q.f1441b;
                    this.f19948a = 1;
                    if (yVar.i(obj2, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                objB = q.b(G.f1419a);
            } catch (Throwable th) {
                q.a aVar2 = q.f1441b;
                objB = q.b(r.a(th));
            }
            return k.b(q.h(objB) ? k.f19942b.c(G.f1419a) : k.f19942b.a(q.e(objB)));
        }
    }

    public static final Object a(y yVar, Object obj) {
        Object objM = yVar.m(obj);
        if (objM instanceof k.c) {
            return ((k) AbstractC1787h.b(null, new a(yVar, obj, null), 1, null)).k();
        }
        return k.f19942b.c(G.f1419a);
    }
}
