package p115m6;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: m6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2692b {

    /* JADX INFO: renamed from: m6.b$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static Object a(InterfaceC2692b interfaceC2692b, C2691a key) {
            t.g(key, "key");
            Object objE = interfaceC2692b.e(key);
            if (objE != null) {
                return objE;
            }
            throw new IllegalStateException("No instance for key " + key);
        }
    }

    void a(C2691a c2691a);

    Object b(C2691a c2691a);

    Object c(C2691a c2691a, Function0 function0);

    void d(C2691a c2691a, Object obj);

    Object e(C2691a c2691a);

    List f();

    boolean g(C2691a c2691a);
}
