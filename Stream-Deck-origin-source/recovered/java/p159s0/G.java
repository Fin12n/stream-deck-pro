package p159s0;

import Q6.k;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class G implements z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f32658f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2892n f32662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2891m f32663e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public G(boolean z8, int i8, int i9, C2892n c2892n, C2891m c2891m) {
        this.f32659a = z8;
        this.f32660b = i8;
        this.f32661c = i9;
        this.f32662d = c2892n;
        this.f32663e = c2891m;
    }

    @Override // p159s0.z
    public boolean a() {
        return this.f32659a;
    }

    @Override // p159s0.z
    public C2891m b() {
        return this.f32663e;
    }

    @Override // p159s0.z
    public C2892n c() {
        return this.f32662d;
    }

    @Override // p159s0.z
    public C2891m d() {
        return this.f32663e;
    }

    @Override // p159s0.z
    public boolean e(z zVar) {
        if (c() == null || zVar == null || !(zVar instanceof G)) {
            return true;
        }
        G g8 = (G) zVar;
        return a() != g8.a() || this.f32663e.m(g8.f32663e);
    }

    @Override // p159s0.z
    public int f() {
        return this.f32661c;
    }

    @Override // p159s0.z
    public C2891m g() {
        return this.f32663e;
    }

    @Override // p159s0.z
    public EnumC2883e h() {
        return this.f32663e.d();
    }

    @Override // p159s0.z
    public C2891m i() {
        return this.f32663e;
    }

    @Override // p159s0.z
    public int j() {
        return this.f32660b;
    }

    @Override // p159s0.z
    public int k() {
        return 1;
    }

    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + a() + ", crossed=" + h() + ", info=\n\t" + this.f32663e + ')';
    }

    @Override // p159s0.z
    public void l(k kVar) {
    }
}
