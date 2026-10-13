package p048f2;

import C6.G;
import C6.r;
import G6.d;
import H6.c;
import I6.l;
import Q6.p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f21569b;

        public a(d dVar) {
            super(3, dVar);
        }

        public final Object g(z zVar, boolean z8, d dVar) {
            a aVar = new a(dVar);
            aVar.f21569b = zVar;
            return aVar.invokeSuspend(G.f1419a);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return g((z) obj, ((Boolean) obj2).booleanValue(), (d) obj3);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f21568a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            z zVar = (z) this.f21569b;
            this.f21568a = 1;
            Object objE = zVar.e(this);
            return objE == objF ? objF : objE;
        }
    }

    public static final Object a(G g8, d dVar) {
        return g8.b(new a(null), dVar);
    }
}
