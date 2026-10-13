package A;

/* JADX INFO: renamed from: A.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0902w {

    /* JADX INFO: renamed from: A.w$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class a {
        public static a a(int i8) {
            return b(i8, null);
        }

        public static a b(int i8, Throwable th) {
            return new C0869f(i8, th);
        }

        public abstract Throwable c();

        public abstract int d();
    }

    /* JADX INFO: renamed from: A.w$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public static AbstractC0902w a(b bVar) {
        return b(bVar, null);
    }

    public static AbstractC0902w b(b bVar, a aVar) {
        return new C0867e(bVar, aVar);
    }

    public abstract a c();

    public abstract b d();
}
