package Y3;

import C6.G;
import D6.L;
import D6.M;
import E4.JFpq.XRlnZWSrAFn;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f12301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12303d;

    public e(String eventName, Map<String, ? extends X3.i> properties, long j8, String insertId) {
        t.g(eventName, "eventName");
        t.g(properties, "properties");
        t.g(insertId, "insertId");
        this.f12300a = eventName;
        this.f12301b = properties;
        this.f12302c = j8;
        this.f12303d = insertId;
    }

    public final k a() {
        String str = this.f12300a;
        Map mapY = M.y(this.f12301b);
        X3.i.b bVar = X3.i.Companion;
        mapY.put("$time", bVar.f(this.f12302c));
        mapY.put("$insert_id", bVar.g(this.f12303d));
        return new k(str, mapY, this.f12302c, this.f12303d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ e(String str, Map map, long j8, String str2, int i8, AbstractC2633k abstractC2633k) {
        if ((i8 & 8) != 0) {
            str2 = UUID.randomUUID().toString();
            t.f(str2, "toString(...)");
        }
        this(str, map, j8, str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(X3.k event, Map<String, ? extends X3.i> contextProperties, Map<String, ? extends X3.i> superProperties, String str, String deviceId, String str2) {
        t.g(event, "event");
        t.g(contextProperties, "contextProperties");
        t.g(superProperties, "superProperties");
        t.g(str, XRlnZWSrAFn.epj);
        t.g(deviceId, "deviceId");
        String strC = event.c();
        Map mapC = L.c();
        mapC.putAll(contextProperties);
        mapC.putAll(superProperties);
        mapC.putAll(event.b());
        X3.i.b bVar = X3.i.Companion;
        mapC.put("distinct_id", bVar.g(str));
        mapC.put("$device_id", bVar.g(deviceId));
        if (str2 != null) {
            mapC.put("$user_id", bVar.g(str2));
        }
        G g8 = G.f1419a;
        Map mapB = L.b(mapC);
        Date dateA = event.a();
        this(strC, mapB, dateA != null ? dateA.getTime() : System.currentTimeMillis(), (String) null, 8, (AbstractC2633k) null);
    }
}
