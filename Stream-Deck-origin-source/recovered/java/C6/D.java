package C6;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class D implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1414b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f1415a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ D(short s8) {
        this.f1415a = s8;
    }

    public static final /* synthetic */ D a(short s8) {
        return new D(s8);
    }

    public static boolean c(short s8, Object obj) {
        return (obj instanceof D) && s8 == ((D) obj).j();
    }

    public static int d(short s8) {
        return Short.hashCode(s8);
    }

    public static String e(short s8) {
        return String.valueOf(s8 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.t.h(j() & 65535, ((D) obj).j() & 65535);
    }

    public boolean equals(Object obj) {
        return c(this.f1415a, obj);
    }

    public int hashCode() {
        return d(this.f1415a);
    }

    public final /* synthetic */ short j() {
        return this.f1415a;
    }

    public String toString() {
        return e(this.f1415a);
    }

    public static short b(short s8) {
        return s8;
    }
}
