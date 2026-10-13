package p191w0;

import A1.h;
import C6.G;
import G6.d;
import H6.c;
import p037e0.B;
import p037e0.C2205a;
import p037e0.C2225v;
import p037e0.D;
import p037e0.InterfaceC2213i;
import p037e0.i0;
import p073i0.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f35278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f35279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f35280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i0 f35281d;

    static {
        C2225v c2225v = new C2225v(0.4f, 0.0f, 0.6f, 1.0f);
        f35278a = c2225v;
        f35279b = new i0(120, 0, D.d(), 2, null);
        f35280c = new i0(150, 0, c2225v, 2, null);
        f35281d = new i0(120, 0, c2225v, 2, null);
    }

    public static final Object d(C2205a c2205a, float f8, j jVar, j jVar2, d dVar) {
        InterfaceC2213i interfaceC2213iB;
        if (jVar2 != null) {
            interfaceC2213iB = G.f35277a.a(jVar2);
        } else {
            interfaceC2213iB = jVar != null ? G.f35277a.b(jVar) : null;
        }
        InterfaceC2213i interfaceC2213i = interfaceC2213iB;
        if (interfaceC2213i != null) {
            Object objF = C2205a.f(c2205a, h.d(f8), interfaceC2213i, null, null, dVar, 12, null);
            return objF == c.f() ? objF : G.f1419a;
        }
        Object objT = c2205a.t(h.d(f8), dVar);
        return objT == c.f() ? objT : G.f1419a;
    }
}
