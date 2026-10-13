package p115m6;

import C6.G;
import C6.r;
import G6.d;
import H6.c;
import I6.l;
import Q6.o;
import p017b7.AbstractC1787h;
import p017b7.J;
import p035d7.g;
import p035d7.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30085a;

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
            Object objF = c.f();
            int i8 = this.f30085a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            g gVarE = x.e();
            this.f30085a = 1;
            Object objL = gVarE.l(this);
            return objL == objF ? objF : objL;
        }
    }

    public static final String a() {
        String str = (String) k.f(x.e().g());
        return str != null ? str : b();
    }

    public static final String b() {
        x.b();
        return (String) AbstractC1787h.b(null, new a(null), 1, null);
    }
}
