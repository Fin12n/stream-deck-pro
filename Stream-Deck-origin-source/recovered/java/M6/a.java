package M6;

import U6.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a extends L6.a {

    /* JADX INFO: renamed from: M6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0213a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0213a f5776a = new C0213a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f5777b;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f5777b = num2;
        }
    }

    @Override // K6.a
    public c b() {
        return c(34) ? new V6.a() : super.b();
    }

    public final boolean c(int i8) {
        Integer num = C0213a.f5777b;
        return num == null || num.intValue() >= i8;
    }
}
