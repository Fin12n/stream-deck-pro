package F7;

import D6.M;
import Z6.w;
import Z6.y;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.t;
import u7.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f2430a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CopyOnWriteArraySet f2431b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f2432c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r8 = x.class.getPackage();
        String name = r8 != null ? r8.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = x.class.getName();
        t.f(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = C7.e.class.getName();
        t.f(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = y7.e.class.getName();
        t.f(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f2432c = M.v(linkedHashMap);
    }

    public final void a(String loggerName, int i8, String message, Throwable th) {
        int iMin;
        t.g(loggerName, "loggerName");
        t.g(message, "message");
        String strD = d(loggerName);
        if (Log.isLoggable(strD, i8)) {
            if (th != null) {
                message = message + '\n' + Log.getStackTraceString(th);
            }
            String str = message;
            int length = str.length();
            int i9 = 0;
            while (i9 < length) {
                int iX = w.X(str, '\n', i9, false, 4, null);
                if (iX == -1) {
                    iX = length;
                }
                while (true) {
                    iMin = Math.min(iX, i9 + 4000);
                    String strSubstring = str.substring(i9, iMin);
                    t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i8, strD, strSubstring);
                    if (iMin >= iX) {
                        break;
                    } else {
                        i9 = iMin;
                    }
                }
                i9 = iMin + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry entry : f2432c.entrySet()) {
            c((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final void c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f2431b.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(d.f2433a);
        }
    }

    public final String d(String str) {
        String str2 = (String) f2432c.get(str);
        return str2 == null ? y.d1(str, 23) : str2;
    }
}
