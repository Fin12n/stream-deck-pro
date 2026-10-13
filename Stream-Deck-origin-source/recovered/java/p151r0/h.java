package p151r0;

import L0.i;
import T0.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p038e1.InterfaceC2247s;
import p128o1.E;
import p143q0.AbstractC2805e;
import p159s0.C2888j;
import p159s0.D;
import p159s0.InterfaceC2890l;
import p215z0.L0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h implements L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f32232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f32233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC2890l f32234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f32235e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2247s invoke() {
            return h.this.f32233c.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2247s invoke() {
            return h.this.f32233c.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final E invoke() {
            return h.this.f32233c.e();
        }
    }

    public /* synthetic */ h(long j8, D d8, long j9, j jVar, AbstractC2633k abstractC2633k) {
        this(j8, d8, j9, jVar);
    }

    @Override // p215z0.L0
    public void b() {
        if (this.f32234d != null) {
            throw null;
        }
    }

    @Override // p215z0.L0
    public void c() {
        if (this.f32234d != null) {
            throw null;
        }
    }

    @Override // p215z0.L0
    public void d() {
        new C2888j(this.f32231a, new b(), new c());
        throw null;
    }

    public final void e(f fVar) {
        throw null;
    }

    public final i f() {
        return this.f32235e;
    }

    public final void g(InterfaceC2247s interfaceC2247s) {
        this.f32233c = j.c(this.f32233c, interfaceC2247s, null, 2, null);
        throw null;
    }

    public final void h(E e8) {
        this.f32233c = j.c(this.f32233c, null, e8, 1, null);
    }

    public h(long j8, D d8, long j9, j jVar) {
        this.f32231a = j8;
        this.f32232b = j9;
        this.f32233c = jVar;
        this.f32235e = AbstractC2805e.a(i.b(null, j8, new a()), null);
    }

    public /* synthetic */ h(long j8, D d8, long j9, j jVar, int i8, AbstractC2633k abstractC2633k) {
        this(j8, d8, j9, (i8 & 8) != 0 ? j.f32246c.a() : jVar, null);
    }
}
