package com.amazon.a.a.o;

import T0.Vl.PCRzgdeK;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class f {
    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException(str + PCRzgdeK.rNFgJPK);
    }

    public static void a(String str, String str2) {
        if (a(str)) {
            throw new IllegalArgumentException(str2 + " must not be null or empty");
        }
    }

    public static void a(Collection<? extends Object> collection, String str) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException(str + " must not be empty");
        }
    }

    public static boolean a(String str) {
        return str == null || str.trim().length() == 0;
    }
}
