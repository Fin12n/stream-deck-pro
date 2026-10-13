package com.google.protobuf;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class u0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19409a;

    public u0(T t8) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f19409a = null;
    }

    public static String b(List list) {
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        Iterator it = list.iterator();
        boolean z8 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z8) {
                z8 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public B a() {
        return new B(getMessage());
    }

    public u0(List<String> list) {
        super(b(list));
        this.f19409a = list;
    }
}
