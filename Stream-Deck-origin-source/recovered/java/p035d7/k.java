package p035d7;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f19942b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f19943c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19944a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f19945a;

        public a(Throwable th) {
            this.f19945a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && t.c(this.f19945a, ((a) obj).f19945a);
        }

        public int hashCode() {
            Throwable th = this.f19945a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // d7.k.c
        public String toString() {
            return "Closed(" + this.f19945a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final Object a(Throwable th) {
            return k.c(new a(th));
        }

        public final Object b() {
            return k.c(k.f19943c);
        }

        public final Object c(Object obj) {
            return k.c(obj);
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ k(Object obj) {
        this.f19944a = obj;
    }

    public static final /* synthetic */ k b(Object obj) {
        return new k(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof k) && t.c(obj, ((k) obj2).k());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f19945a;
        }
        return null;
    }

    public static final Object f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f19944a, obj);
    }

    public int hashCode() {
        return g(this.f19944a);
    }

    public final /* synthetic */ Object k() {
        return this.f19944a;
    }

    public String toString() {
        return j(this.f19944a);
    }

    public static Object c(Object obj) {
        return obj;
    }
}
