package io.sentry.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface f {
    Map a(String str);

    default Boolean b(String str) {
        String property = getProperty(str);
        if (property != null) {
            return Boolean.valueOf(property);
        }
        return null;
    }

    default List c(String str) {
        String property = getProperty(str);
        if (property != null) {
            return Arrays.asList(property.split(com.amazon.a.a.o.b.f.f16777a));
        }
        return null;
    }

    default Long d(String str) {
        String property = getProperty(str);
        if (property == null) {
            return null;
        }
        try {
            return Long.valueOf(property);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    default Double e(String str) {
        String property = getProperty(str);
        if (property == null) {
            return null;
        }
        try {
            return Double.valueOf(property);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    default String f(String str, String str2) {
        String property = getProperty(str);
        return property != null ? property : str2;
    }

    default List g(String str) {
        String property = getProperty(str);
        return property != null ? Arrays.asList(property.split(com.amazon.a.a.o.b.f.f16777a)) : Collections.EMPTY_LIST;
    }

    String getProperty(String str);
}
