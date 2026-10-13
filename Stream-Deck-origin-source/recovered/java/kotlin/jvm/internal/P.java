package kotlin.jvm.internal;

import C6.InterfaceC0919h;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class P {
    public static Collection a(Object obj) {
        if ((obj instanceof R6.a) && !(obj instanceof R6.b)) {
            q(obj, "kotlin.collections.MutableCollection");
        }
        return f(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof R6.a) && !(obj instanceof R6.c)) {
            q(obj, "kotlin.collections.MutableIterable");
        }
        return g(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof R6.a) && !(obj instanceof R6.d)) {
            q(obj, "kotlin.collections.MutableList");
        }
        return h(obj);
    }

    public static Map d(Object obj) {
        if ((obj instanceof R6.a) && !(obj instanceof R6.e)) {
            q(obj, "kotlin.collections.MutableMap");
        }
        return i(obj);
    }

    public static Object e(Object obj, int i8) {
        if (obj != null && !k(obj, i8)) {
            q(obj, "kotlin.jvm.functions.Function" + i8);
        }
        return obj;
    }

    public static Collection f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e8) {
            throw p(e8);
        }
    }

    public static Iterable g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e8) {
            throw p(e8);
        }
    }

    public static List h(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e8) {
            throw p(e8);
        }
    }

    public static Map i(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e8) {
            throw p(e8);
        }
    }

    public static int j(Object obj) {
        if (obj instanceof InterfaceC2637o) {
            return ((InterfaceC2637o) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Q6.k) {
            return 1;
        }
        if (obj instanceof Q6.o) {
            return 2;
        }
        if (obj instanceof Q6.p) {
            return 3;
        }
        if (obj instanceof Q6.q) {
            return 4;
        }
        if (obj instanceof Q6.r) {
            return 5;
        }
        if (obj instanceof Q6.s) {
            return 6;
        }
        if (obj instanceof Q6.t) {
            return 7;
        }
        if (obj instanceof Q6.u) {
            return 8;
        }
        if (obj instanceof Q6.v) {
            return 9;
        }
        if (obj instanceof Q6.a) {
            return 10;
        }
        if (obj instanceof Q6.b) {
            return 11;
        }
        if (obj instanceof Q6.d) {
            return 13;
        }
        if (obj instanceof Q6.e) {
            return 14;
        }
        if (obj instanceof Q6.f) {
            return 15;
        }
        if (obj instanceof Q6.g) {
            return 16;
        }
        if (obj instanceof Q6.h) {
            return 17;
        }
        if (obj instanceof Q6.i) {
            return 18;
        }
        if (obj instanceof Q6.j) {
            return 19;
        }
        if (obj instanceof Q6.l) {
            return 20;
        }
        return obj instanceof Q6.m ? 21 : -1;
    }

    public static boolean k(Object obj, int i8) {
        return (obj instanceof InterfaceC0919h) && j(obj) == i8;
    }

    public static boolean l(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof R6.a) || (obj instanceof R6.d);
        }
        return false;
    }

    public static boolean m(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof R6.a) || (obj instanceof R6.e.a);
        }
        return false;
    }

    public static boolean n(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof R6.a) || (obj instanceof R6.f);
        }
        return false;
    }

    public static Throwable o(Throwable th) {
        return t.m(th, P.class.getName());
    }

    public static ClassCastException p(ClassCastException classCastException) {
        throw ((ClassCastException) o(classCastException));
    }

    public static void q(Object obj, String str) {
        r((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void r(String str) {
        throw p(new ClassCastException(str));
    }
}
