package com.revenuecat.purchases.common;

import D6.C0938s;
import D6.L;
import Z6.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Anonymizer {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String EMAIL_REGEX = "[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.]+@[a-zA-Z0-9]+\\.[a-zA-Z]+";

    @Deprecated
    public static final String IP_REGEX = "((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}";

    @Deprecated
    public static final String REDACTED = "*****";

    @Deprecated
    public static final String UUID_REGEX = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}";
    private final j anonymizeRegex = new j("[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.]+@[a-zA-Z0-9]+\\.[a-zA-Z]+|[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}|((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}");

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        private Companion() {
        }
    }

    private final Object anonymizedAny(Object obj) {
        if (obj instanceof String) {
            return anonymizedString((String) obj);
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(C0938s.y(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                arrayList.add(next == null ? null : anonymizedAny(next));
            }
            return arrayList;
        }
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(L.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            linkedHashMap.put(key, value == null ? null : anonymizedAny(value));
        }
        return linkedHashMap;
    }

    public final Map<String, Object> anonymizedMap(Map<String, ? extends Object> mapToAnonymize) {
        t.g(mapToAnonymize, "mapToAnonymize");
        LinkedHashMap linkedHashMap = new LinkedHashMap(L.d(mapToAnonymize.size()));
        Iterator<T> it = mapToAnonymize.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), anonymizedAny(entry.getValue()));
        }
        return linkedHashMap;
    }

    public final String anonymizedString(String textToAnonymize) {
        t.g(textToAnonymize, "textToAnonymize");
        return this.anonymizeRegex.f(textToAnonymize, REDACTED);
    }

    public final Map<String, String> anonymizedStringMap(Map<String, String> mapToAnonymize) {
        t.g(mapToAnonymize, "mapToAnonymize");
        LinkedHashMap linkedHashMap = new LinkedHashMap(L.d(mapToAnonymize.size()));
        Iterator<T> it = mapToAnonymize.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), anonymizedString((String) entry.getValue()));
        }
        return linkedHashMap;
    }
}
