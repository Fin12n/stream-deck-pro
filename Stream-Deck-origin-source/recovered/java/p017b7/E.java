package p017b7;

import G6.d;
import G6.e;
import G6.g;
import G6.h;
import Q6.o;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class E {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15883a = new a();

        public a() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g invoke(g gVar, g.b bVar) {
            return gVar.P1(bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J f15884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f15885b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(J j8, boolean z8) {
            super(2);
            this.f15884a = j8;
            this.f15885b = z8;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g invoke(g gVar, g.b bVar) {
            return gVar.P1(bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f15886a = new c();

        public c() {
            super(2);
        }

        public final Boolean b(boolean z8, g.b bVar) {
            return Boolean.valueOf(z8);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Boolean) obj).booleanValue(), (g.b) obj2);
        }
    }

    public static final g a(g gVar, g gVar2, boolean z8) {
        boolean zC = c(gVar);
        boolean zC2 = c(gVar2);
        if (!zC && !zC2) {
            return gVar.P1(gVar2);
        }
        J j8 = new J();
        j8.f28779a = gVar2;
        h hVar = h.f2820a;
        g gVar3 = (g) gVar.t(hVar, new b(j8, z8));
        if (zC2) {
            j8.f28779a = ((g) j8.f28779a).t(hVar, a.f15883a);
        }
        return gVar3.P1((g) j8.f28779a);
    }

    public static final String b(g gVar) {
        return null;
    }

    public static final boolean c(g gVar) {
        return ((Boolean) gVar.t(Boolean.FALSE, c.f15886a)).booleanValue();
    }

    public static final g d(g gVar, g gVar2) {
        return !c(gVar2) ? gVar.P1(gVar2) : a(gVar, gVar2, false);
    }

    public static final g e(J j8, g gVar) {
        g gVarA = a(j8.getCoroutineContext(), gVar, true);
        return (gVarA == Z.a() || gVarA.A(e.f2817J) != null) ? gVarA : gVarA.P1(Z.a());
    }

    public static final Z0 f(I6.e eVar) {
        while (!(eVar instanceof V) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof Z0) {
                return (Z0) eVar;
            }
        }
        return null;
    }

    public static final Z0 g(d dVar, g gVar, Object obj) {
        if (!(dVar instanceof I6.e) || gVar.A(a1.f15939a) == null) {
            return null;
        }
        Z0 z0F = f((I6.e) dVar);
        if (z0F != null) {
            z0F.e1(gVar, obj);
        }
        return z0F;
    }
}
