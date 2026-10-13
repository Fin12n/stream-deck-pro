package p215z0;

import G6.d;
import G6.g;
import Q6.k;
import Q6.o;

/* JADX INFO: renamed from: z0.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3146c0 extends g.b {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final b f38734U = b.f38735a;

    /* JADX INFO: renamed from: z0.c0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static Object a(InterfaceC3146c0 interfaceC3146c0, Object obj, o oVar) {
            return g.b.a.a(interfaceC3146c0, obj, oVar);
        }

        public static g.b b(InterfaceC3146c0 interfaceC3146c0, g.c cVar) {
            return g.b.a.b(interfaceC3146c0, cVar);
        }

        public static g c(InterfaceC3146c0 interfaceC3146c0, g.c cVar) {
            return g.b.a.c(interfaceC3146c0, cVar);
        }

        public static g d(InterfaceC3146c0 interfaceC3146c0, g gVar) {
            return g.b.a.d(interfaceC3146c0, gVar);
        }
    }

    /* JADX INFO: renamed from: z0.c0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f38735a = new b();
    }

    Object V0(k kVar, d dVar);

    @Override // G6.g.b
    default g.c getKey() {
        return f38734U;
    }
}
