package androidx.compose.foundation.layout;

import A1.h;
import A1.t;
import C6.G;
import L0.i;
import Q6.k;
import kotlin.jvm.internal.u;
import p065h1.C2403m0;
import p082j0.J;
import p082j0.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f14491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f14492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f14493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f14494d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f8, float f9, float f10, float f11) {
            super(1);
            this.f14491a = f8;
            this.f14492b = f9;
            this.f14493c = f10;
            this.f14494d = f11;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("padding");
            c2403m0.a().b("start", h.d(this.f14491a));
            c2403m0.a().b("top", h.d(this.f14492b));
            c2403m0.a().b("end", h.d(this.f14493c));
            c2403m0.a().b("bottom", h.d(this.f14494d));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f14495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f14496b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f8, float f9) {
            super(1);
            this.f14495a = f8;
            this.f14496b = f9;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("padding");
            c2403m0.a().b("horizontal", h.d(this.f14495a));
            c2403m0.a().b("vertical", h.d(this.f14496b));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f14497a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f8) {
            super(1);
            this.f14497a = f8;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("padding");
            c2403m0.c(h.d(this.f14497a));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J f14498a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(J j8) {
            super(1);
            this.f14498a = j8;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("padding");
            c2403m0.a().b("paddingValues", this.f14498a);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }
    }

    public static final J a(float f8) {
        return new K(f8, f8, f8, f8, null);
    }

    public static final J b(float f8, float f9) {
        return new K(f8, f9, f8, f9, null);
    }

    public static /* synthetic */ J c(float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = h.m(0);
        }
        if ((i8 & 2) != 0) {
            f9 = h.m(0);
        }
        return b(f8, f9);
    }

    public static final J d(float f8, float f9, float f10, float f11) {
        return new K(f8, f9, f10, f11, null);
    }

    public static /* synthetic */ J e(float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = h.m(0);
        }
        if ((i8 & 2) != 0) {
            f9 = h.m(0);
        }
        if ((i8 & 4) != 0) {
            f10 = h.m(0);
        }
        if ((i8 & 8) != 0) {
            f11 = h.m(0);
        }
        return d(f8, f9, f10, f11);
    }

    public static final float f(J j8, t tVar) {
        return tVar == t.Ltr ? j8.b(tVar) : j8.c(tVar);
    }

    public static final float g(J j8, t tVar) {
        return tVar == t.Ltr ? j8.c(tVar) : j8.b(tVar);
    }

    public static final i h(i iVar, J j8) {
        return iVar.j(new PaddingValuesElement(j8, new d(j8)));
    }

    public static final i i(i iVar, float f8) {
        return iVar.j(new PaddingElement(f8, f8, f8, f8, true, new c(f8), null));
    }

    public static final i j(i iVar, float f8, float f9) {
        return iVar.j(new PaddingElement(f8, f9, f8, f9, true, new b(f8, f9), null));
    }

    public static /* synthetic */ i k(i iVar, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = h.m(0);
        }
        if ((i8 & 2) != 0) {
            f9 = h.m(0);
        }
        return j(iVar, f8, f9);
    }

    public static final i l(i iVar, float f8, float f9, float f10, float f11) {
        return iVar.j(new PaddingElement(f8, f9, f10, f11, true, new a(f8, f9, f10, f11), null));
    }

    public static /* synthetic */ i m(i iVar, float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = h.m(0);
        }
        if ((i8 & 2) != 0) {
            f9 = h.m(0);
        }
        if ((i8 & 4) != 0) {
            f10 = h.m(0);
        }
        if ((i8 & 8) != 0) {
            f11 = h.m(0);
        }
        return l(iVar, f8, f9, f10, f11);
    }
}
