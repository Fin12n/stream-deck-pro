package R0;

import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: R0.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1582d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9393b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9394a;

    /* JADX INFO: renamed from: R0.d0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public static /* synthetic */ AbstractC1582d0 c(a aVar, List list, float f8, float f9, int i8, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                f8 = 0.0f;
            }
            if ((i9 & 4) != 0) {
                f9 = Float.POSITIVE_INFINITY;
            }
            if ((i9 & 8) != 0) {
                i8 = X0.f9380a.a();
            }
            return aVar.b(list, f8, f9, i8);
        }

        public final AbstractC1582d0 a(List list, long j8, long j9, int i8) {
            return new A0(list, null, j8, j9, i8, null);
        }

        public final AbstractC1582d0 b(List list, float f8, float f9, int i8) {
            return a(list, Q0.g.a(0.0f, f8), Q0.g.a(0.0f, f9), i8);
        }

        public a() {
        }
    }

    public /* synthetic */ AbstractC1582d0(AbstractC2633k abstractC2633k) {
        this();
    }

    public abstract void a(long j8, F0 f8, float f9);

    public AbstractC1582d0() {
        this.f9394a = Q0.l.f9103b.a();
    }
}
