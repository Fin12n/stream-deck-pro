package u7;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f34637b;

    public h(String scheme, Map<String, String> authParams) {
        String lowerCase;
        kotlin.jvm.internal.t.g(scheme, "scheme");
        kotlin.jvm.internal.t.g(authParams, "authParams");
        this.f34636a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale US = Locale.US;
                kotlin.jvm.internal.t.f(US, "US");
                lowerCase = key.toLowerCase(US);
                kotlin.jvm.internal.t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.t.f(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f34637b = mapUnmodifiableMap;
    }

    public final Charset a() {
        String str = (String) this.f34637b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                kotlin.jvm.internal.t.f(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        kotlin.jvm.internal.t.f(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public final String b() {
        return (String) this.f34637b.get("realm");
    }

    public final String c() {
        return this.f34636a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.t.c(hVar.f34636a, this.f34636a) && kotlin.jvm.internal.t.c(hVar.f34637b, this.f34637b);
    }

    public int hashCode() {
        return ((899 + this.f34636a.hashCode()) * 31) + this.f34637b.hashCode();
    }

    public String toString() {
        return this.f34636a + " authParams=" + this.f34637b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(String scheme, String realm) {
        kotlin.jvm.internal.t.g(scheme, "scheme");
        kotlin.jvm.internal.t.g(realm, "realm");
        Map mapSingletonMap = Collections.singletonMap("realm", realm);
        kotlin.jvm.internal.t.f(mapSingletonMap, "singletonMap(\"realm\", realm)");
        this(scheme, (Map<String, String>) mapSingletonMap);
    }
}
