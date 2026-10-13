package p046f0;

import A1.d;
import A1.h;
import A1.t;
import L0.i;
import O0.f;
import Q0.l;
import R0.D0;
import R0.T0;
import p055g0.B;

/* JADX INFO: renamed from: f0.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2286n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f21489a = h.m(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f21490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f21491c;

    /* JADX INFO: renamed from: f0.n$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements T0 {
        @Override // R0.T0
        public D0 a(long j8, t tVar, d dVar) {
            float fV0 = dVar.V0(AbstractC2286n.b());
            return new D0.b(new Q0.h(0.0f, -fV0, l.i(j8), l.g(j8) + fV0));
        }
    }

    /* JADX INFO: renamed from: f0.n$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements T0 {
        @Override // R0.T0
        public D0 a(long j8, t tVar, d dVar) {
            float fV0 = dVar.V0(AbstractC2286n.b());
            return new D0.b(new Q0.h(-fV0, 0.0f, l.i(j8) + fV0, l.g(j8)));
        }
    }

    static {
        i.a aVar = i.f4836a;
        f21490b = f.a(aVar, new a());
        f21491c = f.a(aVar, new b());
    }

    public static final i a(i iVar, B b8) {
        return iVar.j(b8 == B.Vertical ? f21491c : f21490b);
    }

    public static final float b() {
        return f21489a;
    }
}
