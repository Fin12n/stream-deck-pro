package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f19193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I f19194b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Class f19195c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        public b() {
            super();
        }

        public static List f(Object obj, long j8) {
            return (List) z0.G(obj, j8);
        }

        public static List g(Object obj, long j8, int i8) {
            List listA;
            List listF = f(obj, j8);
            if (listF.isEmpty()) {
                if (listF instanceof H) {
                    listA = new G(i8);
                } else {
                    listA = ((listF instanceof h0) && (listF instanceof A.j)) ? ((A.j) listF).a(i8) : new ArrayList(i8);
                }
                z0.V(obj, j8, listA);
                return listA;
            }
            if (f19195c.isAssignableFrom(listF.getClass())) {
                ArrayList arrayList = new ArrayList(listF.size() + i8);
                arrayList.addAll(listF);
                z0.V(obj, j8, arrayList);
                return arrayList;
            }
            if (listF instanceof y0) {
                G g8 = new G(listF.size() + i8);
                g8.addAll((y0) listF);
                z0.V(obj, j8, g8);
                return g8;
            }
            if ((listF instanceof h0) && (listF instanceof A.j)) {
                A.j jVar = (A.j) listF;
                if (!jVar.C()) {
                    A.j jVarA = jVar.a(listF.size() + i8);
                    z0.V(obj, j8, jVarA);
                    return jVarA;
                }
            }
            return listF;
        }

        @Override // com.google.protobuf.I
        public void c(Object obj, long j8) {
            Object objUnmodifiableList;
            List list = (List) z0.G(obj, j8);
            if (list instanceof H) {
                objUnmodifiableList = ((H) list).v();
            } else {
                if (f19195c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof h0) && (list instanceof A.j)) {
                    A.j jVar = (A.j) list;
                    if (jVar.C()) {
                        jVar.g();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            z0.V(obj, j8, objUnmodifiableList);
        }

        @Override // com.google.protobuf.I
        public void d(Object obj, Object obj2, long j8) {
            List listF = f(obj2, j8);
            List listG = g(obj, j8, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            z0.V(obj, j8, listF);
        }

        @Override // com.google.protobuf.I
        public List e(Object obj, long j8) {
            return g(obj, j8, 10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I {
        public c() {
            super();
        }

        public static A.j f(Object obj, long j8) {
            return (A.j) z0.G(obj, j8);
        }

        @Override // com.google.protobuf.I
        public void c(Object obj, long j8) {
            f(obj, j8).g();
        }

        @Override // com.google.protobuf.I
        public void d(Object obj, Object obj2, long j8) {
            A.j jVarF = f(obj, j8);
            A.j jVarF2 = f(obj2, j8);
            int size = jVarF.size();
            int size2 = jVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!jVarF.C()) {
                    jVarF = jVarF.a(size2 + size);
                }
                jVarF.addAll(jVarF2);
            }
            if (size > 0) {
                jVarF2 = jVarF;
            }
            z0.V(obj, j8, jVarF2);
        }

        @Override // com.google.protobuf.I
        public List e(Object obj, long j8) {
            A.j jVarF = f(obj, j8);
            if (jVarF.C()) {
                return jVarF;
            }
            int size = jVarF.size();
            A.j jVarA = jVarF.a(size == 0 ? 10 : size * 2);
            z0.V(obj, j8, jVarA);
            return jVarA;
        }
    }

    static {
        f19193a = new b();
        f19194b = new c();
    }

    public static I a() {
        return f19193a;
    }

    public static I b() {
        return f19194b;
    }

    public abstract void c(Object obj, long j8);

    public abstract void d(Object obj, Object obj2, long j8);

    public abstract List e(Object obj, long j8);

    public I() {
    }
}
