package H;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: H.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0984i0 {

    /* JADX INFO: renamed from: H.i0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class a {
        public static a a(String str, Class cls) {
            return b(str, cls, null);
        }

        public static a b(String str, Class cls, Object obj) {
            return new C0983i(str, cls, obj);
        }

        public abstract String c();

        public abstract Object d();

        public abstract Class e();
    }

    /* JADX INFO: renamed from: H.i0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        boolean a(a aVar);
    }

    /* JADX INFO: renamed from: H.i0$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum c {
        ALWAYS_OVERRIDE,
        HIGH_PRIORITY_REQUIRED,
        REQUIRED,
        OPTIONAL
    }

    static boolean J(c cVar, c cVar2) {
        c cVar3 = c.REQUIRED;
        return cVar == cVar3 && cVar2 == cVar3;
    }

    static InterfaceC0984i0 p(InterfaceC0984i0 interfaceC0984i0, InterfaceC0984i0 interfaceC0984i1) {
        if (interfaceC0984i0 == null && interfaceC0984i1 == null) {
            return T0.g0();
        }
        O0 o0J0 = interfaceC0984i1 != null ? O0.j0(interfaceC0984i1) : O0.i0();
        if (interfaceC0984i0 != null) {
            Iterator it = interfaceC0984i0.c().iterator();
            while (it.hasNext()) {
                v(o0J0, interfaceC0984i1, interfaceC0984i0, (a) it.next());
            }
        }
        return T0.h0(o0J0);
    }

    static void v(O0 o8, InterfaceC0984i0 interfaceC0984i0, InterfaceC0984i0 interfaceC0984i1, a aVar) {
        if (!Objects.equals(aVar, InterfaceC1017z0.f3294u)) {
            o8.K(aVar, interfaceC0984i1.d(aVar), interfaceC0984i1.h(aVar));
            return;
        }
        T.c cVar = (T.c) interfaceC0984i1.f(aVar, null);
        o8.K(aVar, interfaceC0984i1.d(aVar), I.u.a((T.c) interfaceC0984i0.f(aVar, null), cVar));
    }

    void a(String str, b bVar);

    Object b(a aVar, c cVar);

    Set c();

    c d(a aVar);

    boolean e(a aVar);

    Object f(a aVar, Object obj);

    Set g(a aVar);

    Object h(a aVar);
}
