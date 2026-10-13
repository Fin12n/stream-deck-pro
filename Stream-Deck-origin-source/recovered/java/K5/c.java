package K5;

import C6.G;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import u7.F;
import u7.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends J5.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f4645e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public F.a f4647g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Q6.k f4644d = a.f4648a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4646f = 10;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4648a = new a();

        public a() {
            super(1);
        }

        public final void b(x.a aVar) {
            t.g(aVar, "$this$null");
            aVar.e(false);
            aVar.f(false);
            aVar.N(true);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x.a) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.k f4649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q6.k f4650b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Q6.k kVar, Q6.k kVar2) {
            super(1);
            this.f4649a = kVar;
            this.f4650b = kVar2;
        }

        public final void b(x.a aVar) {
            t.g(aVar, "$this$null");
            this.f4649a.invoke(aVar);
            this.f4650b.invoke(aVar);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x.a) obj);
            return G.f1419a;
        }
    }

    public final void c(Q6.k block) {
        t.g(block, "block");
        this.f4644d = new b(this.f4644d, block);
    }

    public final int d() {
        return this.f4646f;
    }

    public final Q6.k e() {
        return this.f4644d;
    }

    public final x f() {
        return this.f4645e;
    }

    public final F.a g() {
        return this.f4647g;
    }
}
