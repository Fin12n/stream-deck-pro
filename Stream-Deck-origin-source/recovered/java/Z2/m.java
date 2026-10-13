package Z2;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface m {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static String a(m mVar, p pVar, String str, String message) {
            t.g(message, "message");
            if (pVar == null && str == null) {
                return message;
            }
            StringBuilder sb = new StringBuilder();
            if (pVar != null) {
                sb.append(mVar.a(pVar));
                sb.append(" ");
            }
            if (str != null && str.length() > 0) {
                sb.append(mVar.b(str));
                sb.append(" ");
            }
            sb.append(message);
            String string = sb.toString();
            t.f(string, "toString(...)");
            return string;
        }

        public static String b(m mVar, p severity) {
            t.g(severity, "severity");
            StringBuilder sb = new StringBuilder();
            sb.append(severity);
            sb.append(':');
            return sb.toString();
        }

        public static String c(m mVar, String tag) {
            t.g(tag, "tag");
            return '(' + tag + ')';
        }
    }

    String a(p pVar);

    String b(String str);

    String c(p pVar, String str, String str2);
}
