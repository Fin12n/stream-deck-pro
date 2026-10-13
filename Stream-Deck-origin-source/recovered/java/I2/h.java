package I2;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3751a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public static /* synthetic */ h b(a aVar, Object obj, String str, j jVar, g gVar, int i8, Object obj2) {
            if ((i8 & 2) != 0) {
                jVar = c.f3734a.a();
            }
            if ((i8 & 4) != 0) {
                gVar = I2.a.f3729a;
            }
            return aVar.a(obj, str, jVar, gVar);
        }

        public final h a(Object obj, String tag, j verificationMode, g logger) {
            t.g(obj, "<this>");
            t.g(tag, "tag");
            t.g(verificationMode, "verificationMode");
            t.g(logger, "logger");
            return new i(obj, tag, verificationMode, logger);
        }

        public a() {
        }
    }

    public abstract Object a();

    public final String b(Object value, String message) {
        t.g(value, "value");
        t.g(message, "message");
        return message + " value: " + value;
    }

    public abstract h c(String str, Q6.k kVar);
}
