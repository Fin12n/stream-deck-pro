package p7;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface e {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static Object a(e eVar, p116m7.a deserializer) {
            t.g(deserializer, "deserializer");
            return deserializer.deserialize(eVar);
        }
    }

    Object A(p116m7.a aVar);

    byte C();

    short F();

    float G();

    double H();

    c b(o7.f fVar);

    boolean i();

    char k();

    int o();

    Void q();

    String s();

    long t();

    boolean v();

    e w(o7.f fVar);

    int y(o7.f fVar);
}
