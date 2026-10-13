package p098k7;

import G6.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: k7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0628a {
        public static /* synthetic */ Object a(a aVar, Object obj, d dVar, int i8, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i8 & 1) != 0) {
                obj = null;
            }
            return aVar.b(obj, dVar);
        }

        public static /* synthetic */ boolean b(a aVar, Object obj, int i8, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i8 & 1) != 0) {
                obj = null;
            }
            return aVar.c(obj);
        }

        public static /* synthetic */ void c(a aVar, Object obj, int i8, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i8 & 1) != 0) {
                obj = null;
            }
            aVar.e(obj);
        }
    }

    Object b(Object obj, d dVar);

    boolean c(Object obj);

    void e(Object obj);
}
