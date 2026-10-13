package p159s0;

import R0.AbstractC1602n0;
import R0.C1598l0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3182v;
import p215z0.B0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B0 f32718a = AbstractC3182v.d(null, a.f32721a, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f32719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M f32720c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32721a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final M invoke() {
            return N.f32720c;
        }
    }

    static {
        long jD = AbstractC1602n0.d(4282550004L);
        f32719b = jD;
        f32720c = new M(jD, C1598l0.o(jD, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    public static final B0 b() {
        return f32718a;
    }
}
