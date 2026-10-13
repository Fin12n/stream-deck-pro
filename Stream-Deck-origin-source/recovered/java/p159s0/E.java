package p159s0;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3182v;
import p215z0.B0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B0 f32650a = AbstractC3182v.d(null, a.f32651a, 1, null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32651a = new a();

        public a() {
            super(0);
        }

        public final D b() {
            return null;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            b();
            return null;
        }
    }

    public static final B0 a() {
        return f32650a;
    }

    public static final boolean b(D d8, long j8) {
        Map mapA;
        if (d8 == null || (mapA = d8.a()) == null) {
            return false;
        }
        return mapA.containsKey(Long.valueOf(j8));
    }
}
