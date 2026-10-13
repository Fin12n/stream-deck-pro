package G6;

import Q6.o;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface g {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: G6.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0122a extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0122a f2819a = new C0122a();

            public C0122a() {
                super(2);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g invoke(g acc, b element) {
                t.g(acc, "acc");
                t.g(element, "element");
                g gVarJ = acc.j(element.getKey());
                h hVar = h.f2820a;
                if (gVarJ == hVar) {
                    return element;
                }
                e.b bVar = e.f2817J;
                e eVar = (e) gVarJ.A(bVar);
                if (eVar == null) {
                    return new G6.c(gVarJ, element);
                }
                g gVarJ2 = gVarJ.j(bVar);
                return gVarJ2 == hVar ? new G6.c(element, eVar) : new G6.c(new G6.c(gVarJ2, element), eVar);
            }
        }

        public static g a(g gVar, g context) {
            t.g(context, "context");
            return context == h.f2820a ? gVar : (g) context.t(gVar, C0122a.f2819a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b extends g {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a {
            public static Object a(b bVar, Object obj, o operation) {
                t.g(operation, "operation");
                return operation.invoke(obj, bVar);
            }

            public static b b(b bVar, c key) {
                t.g(key, "key");
                if (!t.c(bVar.getKey(), key)) {
                    return null;
                }
                t.e(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static g c(b bVar, c key) {
                t.g(key, "key");
                return t.c(bVar.getKey(), key) ? h.f2820a : bVar;
            }

            public static g d(b bVar, g context) {
                t.g(context, "context");
                return a.a(bVar, context);
            }
        }

        @Override // G6.g
        b A(c cVar);

        c getKey();

        @Override // G6.g
        g j(c cVar);

        @Override // G6.g
        Object t(Object obj, o oVar);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {
    }

    b A(c cVar);

    g P1(g gVar);

    g j(c cVar);

    Object t(Object obj, o oVar);
}
