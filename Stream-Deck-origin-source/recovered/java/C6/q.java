package C6;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1441b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1442a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f1443a;

        public b(Throwable exception) {
            kotlin.jvm.internal.t.g(exception, "exception");
            this.f1443a = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && kotlin.jvm.internal.t.c(this.f1443a, ((b) obj).f1443a);
        }

        public int hashCode() {
            return this.f1443a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f1443a + ')';
        }
    }

    public /* synthetic */ q(Object obj) {
        this.f1442a = obj;
    }

    public static final /* synthetic */ q a(Object obj) {
        return new q(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof q) && kotlin.jvm.internal.t.c(obj, ((q) obj2).j());
    }

    public static final boolean d(Object obj, Object obj2) {
        return kotlin.jvm.internal.t.c(obj, obj2);
    }

    public static final Throwable e(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f1443a;
        }
        return null;
    }

    public static int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean g(Object obj) {
        return obj instanceof b;
    }

    public static final boolean h(Object obj) {
        return !(obj instanceof b);
    }

    public static String i(Object obj) {
        if (obj instanceof b) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f1442a, obj);
    }

    public int hashCode() {
        return f(this.f1442a);
    }

    public final /* synthetic */ Object j() {
        return this.f1442a;
    }

    public String toString() {
        return i(this.f1442a);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
