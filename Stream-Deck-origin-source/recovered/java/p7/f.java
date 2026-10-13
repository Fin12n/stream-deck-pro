package p7;

import kotlin.jvm.internal.t;
import p116m7.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface f {
    void A(int i8);

    void D(long j8);

    d E(o7.f fVar, int i8);

    void F(String str);

    t7.c a();

    d b(o7.f fVar);

    void f();

    void g(double d8);

    void h(short s8);

    void j(byte b8);

    void k(boolean z8);

    void m(float f8);

    void n(k kVar, Object obj);

    void o(o7.f fVar, int i8);

    void p(char c8);

    f r(o7.f fVar);

    void s();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static d a(f fVar, o7.f descriptor, int i8) {
            t.g(descriptor, "descriptor");
            return fVar.b(descriptor);
        }

        public static void c(f fVar, k serializer, Object obj) {
            t.g(serializer, "serializer");
            if (serializer.getDescriptor().c()) {
                fVar.n(serializer, obj);
            } else if (obj == null) {
                fVar.f();
            } else {
                fVar.s();
                fVar.n(serializer, obj);
            }
        }

        public static void d(f fVar, k serializer, Object obj) {
            t.g(serializer, "serializer");
            serializer.serialize(fVar, obj);
        }

        public static void b(f fVar) {
        }
    }
}
