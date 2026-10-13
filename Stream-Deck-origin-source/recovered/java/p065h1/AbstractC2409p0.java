package p065h1;

import java.util.Arrays;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: h1.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2409p0 {
    public static final String a(Object obj, String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        O o8 = O.f28784a;
        String str2 = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        t.f(str2, "format(format, *args)");
        sb.append(str2);
        return sb.toString();
    }
}
