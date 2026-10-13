package p040e3;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface m {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20706a;

        public /* synthetic */ a(int i8) {
            this.f20706a = i8;
        }

        public static final /* synthetic */ a a(int i8) {
            return new a(i8);
        }

        public static boolean c(int i8, Object obj) {
            return (obj instanceof a) && i8 == ((a) obj).f();
        }

        public static int d(int i8) {
            return Integer.hashCode(i8);
        }

        public static String e(int i8) {
            return "RawRes(resId=" + i8 + ")";
        }

        public boolean equals(Object obj) {
            return c(this.f20706a, obj);
        }

        public final /* synthetic */ int f() {
            return this.f20706a;
        }

        public int hashCode() {
            return d(this.f20706a);
        }

        public String toString() {
            return e(this.f20706a);
        }

        public static int b(int i8) {
            return i8;
        }
    }
}
