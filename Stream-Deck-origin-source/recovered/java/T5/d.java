package T5;

import X5.C1685n;
import X5.C1692v;
import X5.I;
import X5.InterfaceC1684m;
import X5.InterfaceC1690t;
import X5.Q;
import X5.T;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.InterfaceC1815v0;
import p017b7.S0;
import p115m6.AbstractC2694d;
import p115m6.AbstractC2695e;
import p115m6.F;
import p115m6.InterfaceC2692b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements InterfaceC1690t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f9895g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f9896a = new I(null, null, 0, null, null, null, null, null, false, 511, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1692v f9897b = C1692v.f11962b.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1685n f9898c = new C1685n(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9899d = V5.d.f10741a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC1815v0 f9900e = S0.b(null, 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC2692b f9901f = AbstractC2694d.a(true);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9902a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            return new LinkedHashMap();
        }
    }

    @Override // X5.InterfaceC1690t
    public C1685n a() {
        return this.f9898c;
    }

    public final e b() {
        T tB = this.f9896a.b();
        C1692v c1692v = this.f9897b;
        InterfaceC1684m interfaceC1684mO = a().o();
        Object obj = this.f9899d;
        p007a6.c cVar = obj instanceof p007a6.c ? (p007a6.c) obj : null;
        if (cVar != null) {
            return new e(tB, c1692v, interfaceC1684mO, cVar, this.f9900e, this.f9901f);
        }
        throw new IllegalStateException(("No request transformation found: " + this.f9899d).toString());
    }

    public final InterfaceC2692b c() {
        return this.f9901f;
    }

    public final Object d() {
        return this.f9899d;
    }

    public final p181u6.a e() {
        return (p181u6.a) this.f9901f.e(j.a());
    }

    public final Object f(J5.e key) {
        t.g(key, "key");
        Map map = (Map) this.f9901f.e(J5.f.a());
        if (map != null) {
            return map.get(key);
        }
        return null;
    }

    public final InterfaceC1815v0 g() {
        return this.f9900e;
    }

    public final C1692v h() {
        return this.f9897b;
    }

    public final I i() {
        return this.f9896a;
    }

    public final void j(Object obj) {
        t.g(obj, "<set-?>");
        this.f9899d = obj;
    }

    public final void k(p181u6.a aVar) {
        if (aVar != null) {
            this.f9901f.d(j.a(), aVar);
        } else {
            this.f9901f.a(j.a());
        }
    }

    public final void l(J5.e key, Object capability) {
        t.g(key, "key");
        t.g(capability, "capability");
        ((Map) this.f9901f.c(J5.f.a(), b.f9902a)).put(key, capability);
    }

    public final void m(InterfaceC1815v0 interfaceC1815v0) {
        t.g(interfaceC1815v0, "<set-?>");
        this.f9900e = interfaceC1815v0;
    }

    public final void n(C1692v c1692v) {
        t.g(c1692v, "<set-?>");
        this.f9897b = c1692v;
    }

    public final d o(d builder) {
        t.g(builder, "builder");
        this.f9897b = builder.f9897b;
        this.f9899d = builder.f9899d;
        k(builder.e());
        Q.j(this.f9896a, builder.f9896a);
        I i8 = this.f9896a;
        i8.u(i8.g());
        F.c(a(), builder.a());
        AbstractC2695e.a(this.f9901f, builder.f9901f);
        return this;
    }

    public final d p(d builder) {
        t.g(builder, "builder");
        this.f9900e = builder.f9900e;
        return o(builder);
    }
}
