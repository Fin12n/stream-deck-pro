package p056g1;

import C6.G;
import Q6.k;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f23586b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f23587c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f23588d = a.f23590a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f23589a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23590a = new a();

        public a() {
            super(1);
        }

        public final void b(e0 e0Var) {
            if (e0Var.L()) {
                e0Var.b().O0();
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((e0) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final k a() {
            return e0.f23588d;
        }

        public b() {
        }
    }

    public e0(c0 c0Var) {
        this.f23589a = c0Var;
    }

    @Override // p056g1.i0
    public boolean L() {
        return this.f23589a.I0().K1();
    }

    public final c0 b() {
        return this.f23589a;
    }
}
