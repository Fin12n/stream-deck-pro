package G3;

import C6.G;
import C6.r;
import Q6.o;
import Z2.p;
import android.content.Context;
import kotlin.jvm.internal.t;
import p017b7.J;
import p044e7.AbstractC2262h;
import p044e7.H;
import p044e7.M;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i implements R3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f2745a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f2747b;

        public a(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            a aVar = new a(dVar);
            aVar.f2747b = ((Boolean) obj).booleanValue();
            return aVar;
        }

        public final Object g(boolean z8, G6.d dVar) {
            return ((a) create(Boolean.valueOf(z8), dVar)).invokeSuspend(G.f1419a);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return g(((Boolean) obj).booleanValue(), (G6.d) obj2);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f2746a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            boolean z8 = this.f2747b;
            Z2.j.a aVar = Z2.j.f12858c;
            String str = "Online status changed " + z8;
            String strC = aVar.c();
            p pVar = p.Debug;
            if (aVar.a().a().compareTo(pVar) <= 0) {
                aVar.b(pVar, strC, null, str);
            }
            return G.f1419a;
        }
    }

    public i(Context context, J scope) {
        t.g(context, "context");
        t.g(scope, "scope");
        this.f2745a = AbstractC2262h.T(AbstractC2262h.M(AbstractC2262h.p(j.b(context)), new a(null)), scope, H.f20929a.c(), Boolean.FALSE);
    }

    @Override // R3.a
    public M a() {
        return this.f2745a;
    }
}
