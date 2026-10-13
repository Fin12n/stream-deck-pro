package p168t1;

import kotlin.jvm.internal.AbstractC2633k;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface U extends q1 {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements U, q1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C3002g f34025a;

        public a(C3002g c3002g) {
            this.f34025a = c3002g;
        }

        @Override // p215z0.q1
        public Object getValue() {
            return this.f34025a.getValue();
        }

        @Override // p168t1.U
        public boolean h() {
            return this.f34025a.e();
        }
    }

    boolean h();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements U {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f34026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f34027b;

        public b(Object obj, boolean z8) {
            this.f34026a = obj;
            this.f34027b = z8;
        }

        @Override // p215z0.q1
        public Object getValue() {
            return this.f34026a;
        }

        @Override // p168t1.U
        public boolean h() {
            return this.f34027b;
        }

        public /* synthetic */ b(Object obj, boolean z8, int i8, AbstractC2633k abstractC2633k) {
            this(obj, (i8 & 2) != 0 ? true : z8);
        }
    }
}
