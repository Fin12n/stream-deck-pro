package p103l3;

import java.util.List;
import p004a3.C1705k;
import p067h3.a;
import p067h3.b;
import p067h3.d;
import p067h3.f;
import p067h3.g;
import p067h3.h;
import p067h3.j;
import p112m3.c;

/* JADX INFO: renamed from: l3.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2652d {
    public static List a(c cVar, float f8, C1705k c1705k, N n8) {
        return u.a(cVar, c1705k, f8, n8, false);
    }

    public static List b(c cVar, C1705k c1705k, N n8) {
        return u.a(cVar, c1705k, 1.0f, n8, false);
    }

    public static a c(c cVar, C1705k c1705k) {
        return new a(b(cVar, c1705k, C2655g.f29169a));
    }

    public static j d(c cVar, C1705k c1705k) {
        return new j(a(cVar, p121n3.j.e(), c1705k, C2657i.f29171a));
    }

    public static b e(c cVar, C1705k c1705k) {
        return f(cVar, c1705k, true);
    }

    public static b f(c cVar, C1705k c1705k, boolean z8) {
        return new b(a(cVar, z8 ? p121n3.j.e() : 1.0f, c1705k, C2660l.f29185a));
    }

    public static p067h3.c g(c cVar, C1705k c1705k, int i8) {
        return new p067h3.c(b(cVar, c1705k, new o(i8)));
    }

    public static d h(c cVar, C1705k c1705k) {
        return new d(b(cVar, c1705k, r.f29195a));
    }

    public static f i(c cVar, C1705k c1705k) {
        return new f(u.a(cVar, c1705k, p121n3.j.e(), B.f29147a, true));
    }

    public static g j(c cVar, C1705k c1705k) {
        return new g((List<p130o3.a>) b(cVar, c1705k, G.f29152a));
    }

    public static h k(c cVar, C1705k c1705k) {
        return new h(a(cVar, p121n3.j.e(), c1705k, H.f29153a));
    }
}
