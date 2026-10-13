package kotlin.jvm.internal;

import java.util.Iterator;

/* JADX INFO: renamed from: kotlin.jvm.internal.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2625c {
    public static final Iterator a(Object[] array) {
        t.g(array, "array");
        return new C2624b(array);
    }
}
