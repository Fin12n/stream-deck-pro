package C6;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class y implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1460b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1461a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ y(int i8) {
        this.f1461a = i8;
    }

    public static final /* synthetic */ y a(int i8) {
        return new y(i8);
    }

    public static boolean c(int i8, Object obj) {
        return (obj instanceof y) && i8 == ((y) obj).j();
    }

    public static int d(int i8) {
        return Integer.hashCode(i8);
    }

    public static String e(int i8) {
        return String.valueOf(((long) i8) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return I.a(j(), ((y) obj).j());
    }

    public boolean equals(Object obj) {
        return c(this.f1461a, obj);
    }

    public int hashCode() {
        return d(this.f1461a);
    }

    public final /* synthetic */ int j() {
        return this.f1461a;
    }

    public String toString() {
        return e(this.f1461a);
    }

    public static int b(int i8) {
        return i8;
    }
}
