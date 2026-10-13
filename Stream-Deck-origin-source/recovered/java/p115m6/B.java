package p115m6;

import D6.z;
import Q6.o;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface B {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static boolean a(B b8, String name) {
            t.g(name, "name");
            return b8.c(name) != null;
        }

        public static void b(B b8, o body) {
            t.g(body, "body");
            for (Map.Entry entry : b8.a()) {
                body.invoke((String) entry.getKey(), (List) entry.getValue());
            }
        }

        public static String c(B b8, String name) {
            t.g(name, "name");
            List listC = b8.c(name);
            if (listC != null) {
                return (String) z.k0(listC);
            }
            return null;
        }
    }

    Set a();

    boolean b();

    List c(String str);

    boolean contains(String str);

    String d(String str);

    void e(o oVar);

    boolean isEmpty();

    Set names();
}
