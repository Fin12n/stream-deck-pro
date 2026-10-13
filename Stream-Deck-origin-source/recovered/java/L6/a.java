package L6;

import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a extends K6.a {

    /* JADX INFO: renamed from: L6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0181a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0181a f5054a = new C0181a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f5055b;

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
            f5055b = num2;
        }
    }

    private final boolean c(int i8) {
        Integer num = C0181a.f5055b;
        return num == null || num.intValue() >= i8;
    }

    @Override // K6.a
    public void a(Throwable cause, Throwable th) throws IllegalAccessException, InvocationTargetException {
        t.g(cause, "cause");
        t.g(th, uYOhHhTXuF.hEPrUcmL);
        if (c(19)) {
            cause.addSuppressed(th);
        } else {
            super.a(cause, th);
        }
    }
}
