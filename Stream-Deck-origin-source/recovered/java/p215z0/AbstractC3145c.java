package p215z0;

import Q6.o;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: z0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3145c {
    public static final long a() {
        return Thread.currentThread().getId();
    }

    public static final String b() {
        return Thread.currentThread().getName();
    }

    public static final int c(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void d(InterfaceC3163l interfaceC3163l, o oVar) {
        t.e(oVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        ((o) P.e(oVar, 2)).invoke(interfaceC3163l, 1);
    }
}
