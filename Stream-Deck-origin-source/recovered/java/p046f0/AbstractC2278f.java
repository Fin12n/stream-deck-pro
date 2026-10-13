package p046f0;

import C6.G;
import L0.i;
import O0.e;
import Q0.j;
import Q6.k;
import R0.AbstractC1582d0;
import R0.H0;
import R0.L0;
import R0.T;
import R0.T0;
import R0.U0;
import T0.c;
import T0.f;
import T0.g;
import androidx.compose.foundation.BorderModifierNodeElement;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: f0.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2278f {

    /* JADX INFO: renamed from: f0.f$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21448a = new a();

        public a() {
            super(1);
        }

        public final void b(c cVar) {
            cVar.v1();
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((c) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: f0.f$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1582d0 f21449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f21450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f21451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f21452d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC1582d0 abstractC1582d0, long j8, long j9, g gVar) {
            super(1);
            this.f21449a = abstractC1582d0;
            this.f21450b = j8;
            this.f21451c = j9;
            this.f21452d = gVar;
        }

        public final void b(c cVar) {
            cVar.v1();
            f.q0(cVar, this.f21449a, this.f21450b, this.f21451c, 0.0f, this.f21452d, null, 0, 104, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((c) obj);
            return G.f1419a;
        }
    }

    public static final i e(i iVar, C2280h c2280h, T0 t8) {
        return g(iVar, c2280h.b(), c2280h.a(), t8);
    }

    public static final i f(i iVar, float f8, long j8, T0 t8) {
        return g(iVar, f8, new U0(j8, null), t8);
    }

    public static final i g(i iVar, float f8, AbstractC1582d0 abstractC1582d0, T0 t8) {
        return iVar.j(new BorderModifierNodeElement(f8, abstractC1582d0, t8, null));
    }

    public static final j h(float f8, j jVar) {
        return new j(f8, f8, jVar.j() - f8, jVar.d() - f8, l(jVar.h(), f8), l(jVar.i(), f8), l(jVar.c(), f8), l(jVar.b(), f8), null);
    }

    public static final H0 i(H0 h8, j jVar, float f8, boolean z8) {
        h8.reset();
        h8.i(jVar);
        if (!z8) {
            H0 h0A = T.a();
            h0A.i(h(f8, jVar));
            h8.h(h8, h0A, L0.f9316a.a());
        }
        return h8;
    }

    public static final O0.i j(e eVar) {
        return eVar.e(a.f21448a);
    }

    public static final O0.i k(e eVar, AbstractC1582d0 abstractC1582d0, long j8, long j9, boolean z8, float f8) {
        return eVar.e(new b(abstractC1582d0, z8 ? Q0.f.f9082b.c() : j8, z8 ? eVar.d() : j9, z8 ? T0.j.f9812a : new T0.k(f8, 0.0f, 0, 0, null, 30, null)));
    }

    public static final long l(long j8, float f8) {
        return Q0.b.a(Math.max(0.0f, Q0.a.d(j8) - f8), Math.max(0.0f, Q0.a.e(j8) - f8));
    }
}
