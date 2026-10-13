package io.sentry.config;

import io.sentry.util.B;
import io.sentry.util.u;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Properties f27059b;

    public a(String str, Properties properties) {
        this.f27058a = (String) u.c(str, "prefix is required");
        this.f27059b = (Properties) u.c(properties, "properties are required");
    }

    @Override // io.sentry.config.f
    public Map a(String str) {
        String str2 = this.f27058a + str + ".";
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f27059b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str3 = (String) entry.getKey();
                if (str3.startsWith(str2)) {
                    map.put(str3.substring(str2.length()), B.f((String) entry.getValue(), "\""));
                }
            }
        }
        return map;
    }

    @Override // io.sentry.config.f
    public String getProperty(String str) {
        return B.f(this.f27059b.getProperty(this.f27058a + str), "\"");
    }

    public a(Properties properties) {
        this("", properties);
    }
}
