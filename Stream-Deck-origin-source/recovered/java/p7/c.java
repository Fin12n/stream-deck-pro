package p7;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static int a(c cVar, o7.f descriptor) {
            t.g(descriptor, "descriptor");
            return -1;
        }

        public static boolean b(c cVar) {
            return false;
        }

        public static /* synthetic */ Object c(c cVar, o7.f fVar, int i8, p116m7.a aVar, Object obj, int i9, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i9 & 8) != 0) {
                obj = null;
            }
            return cVar.u(fVar, i8, aVar, obj);
        }
    }

    double B(o7.f fVar, int i8);

    long D(o7.f fVar, int i8);

    int E(o7.f fVar);

    t7.c a();

    void c(o7.f fVar);

    boolean e(o7.f fVar, int i8);

    String f(o7.f fVar, int i8);

    byte g(o7.f fVar, int i8);

    char h(o7.f fVar, int i8);

    short j(o7.f fVar, int i8);

    float l(o7.f fVar, int i8);

    int n(o7.f fVar, int i8);

    e p(o7.f fVar, int i8);

    int r(o7.f fVar);

    Object u(o7.f fVar, int i8, p116m7.a aVar, Object obj);

    boolean x();

    Object z(o7.f fVar, int i8, p116m7.a aVar, Object obj);
}
