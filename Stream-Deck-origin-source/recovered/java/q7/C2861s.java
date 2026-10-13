package q7;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: q7.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2861s implements J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q6.k f32147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2865u f32148b;

    /* JADX INFO: renamed from: q7.s$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ X6.d f32150b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(X6.d dVar) {
            super(0);
            this.f32150b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new C2850m((p116m7.b) C2861s.this.b().invoke(this.f32150b));
        }
    }

    public C2861s(Q6.k compute) {
        kotlin.jvm.internal.t.g(compute, "compute");
        this.f32147a = compute;
        this.f32148b = new C2865u();
    }

    @Override // q7.J0
    public p116m7.b a(X6.d key) {
        kotlin.jvm.internal.t.g(key, "key");
        Object obj = this.f32148b.get(P6.a.a(key));
        kotlin.jvm.internal.t.f(obj, "get(...)");
        C2845j0 c2845j0 = (C2845j0) obj;
        Object objA = c2845j0.f32121a.get();
        if (objA == null) {
            objA = c2845j0.a(new a(key));
        }
        return ((C2850m) objA).f32125a;
    }

    public final Q6.k b() {
        return this.f32147a;
    }
}
