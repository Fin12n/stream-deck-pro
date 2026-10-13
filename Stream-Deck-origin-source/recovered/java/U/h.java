package U;

import H.N0;
import H.O0;
import H.T0;
import H.u1;
import H.v1;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class h implements u1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O0 f9972a;

    public h() {
        this(O0.i0());
    }

    @Override // A.K
    public N0 a() {
        return this.f9972a;
    }

    @Override // H.u1.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i b() {
        return new i(T0.h0(this.f9972a));
    }

    public h d(v1.b bVar) {
        a().L(u1.f3222G, bVar);
        return this;
    }

    public h e(Class cls) {
        a().L(L.q.f4795N, cls);
        if (a().f(L.q.f4794M, null) == null) {
            f(cls.getCanonicalName() + "-" + UUID.randomUUID());
        }
        return this;
    }

    public h f(String str) {
        a().L(L.q.f4794M, str);
        return this;
    }

    public h(O0 o8) {
        this.f9972a = o8;
        Class cls = (Class) o8.f(L.q.f4795N, null);
        if (cls == null || cls.equals(g.class)) {
            d(v1.b.STREAM_SHARING);
            e(g.class);
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
