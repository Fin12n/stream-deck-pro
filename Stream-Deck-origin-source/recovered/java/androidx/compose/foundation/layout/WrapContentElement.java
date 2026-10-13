package androidx.compose.foundation.layout;

import A1.n;
import A1.r;
import A1.t;
import Q6.o;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p056g1.U;
import p082j0.EnumC2612p;
import p082j0.k0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class WrapContentElement extends U {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f14474g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC2612p f14475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f14477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f14478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14479f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.WrapContentElement$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0359a extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ L0.c.InterfaceC0174c f14480a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0359a(L0.c.InterfaceC0174c interfaceC0174c) {
                super(2);
                this.f14480a = interfaceC0174c;
            }

            public final long b(long j8, t tVar) {
                return A1.o.a(0, this.f14480a.a(0, r.f(j8)));
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return n.b(b(((r) obj).j(), (t) obj2));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ L0.c f14481a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(L0.c cVar) {
                super(2);
                this.f14481a = cVar;
            }

            public final long b(long j8, t tVar) {
                return this.f14481a.a(r.f455b.a(), j8, tVar);
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return n.b(b(((r) obj).j(), (t) obj2));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ L0.c.b f14482a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(L0.c.b bVar) {
                super(2);
                this.f14482a = bVar;
            }

            public final long b(long j8, t tVar) {
                return A1.o.a(this.f14482a.a(0, r.g(j8), tVar), 0);
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return n.b(b(((r) obj).j(), (t) obj2));
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final WrapContentElement a(L0.c.InterfaceC0174c interfaceC0174c, boolean z8) {
            return new WrapContentElement(EnumC2612p.Vertical, z8, new C0359a(interfaceC0174c), interfaceC0174c, "wrapContentHeight");
        }

        public final WrapContentElement b(L0.c cVar, boolean z8) {
            return new WrapContentElement(EnumC2612p.Both, z8, new b(cVar), cVar, "wrapContentSize");
        }

        public final WrapContentElement c(L0.c.b bVar, boolean z8) {
            return new WrapContentElement(EnumC2612p.Horizontal, z8, new c(bVar), bVar, "wrapContentWidth");
        }

        public a() {
        }
    }

    public WrapContentElement(EnumC2612p enumC2612p, boolean z8, o oVar, Object obj, String str) {
        this.f14475b = enumC2612p;
        this.f14476c = z8;
        this.f14477d = oVar;
        this.f14478e = obj;
        this.f14479f = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f14475b == wrapContentElement.f14475b && this.f14476c == wrapContentElement.f14476c && kotlin.jvm.internal.t.c(this.f14478e, wrapContentElement.f14478e);
    }

    @Override // p056g1.U
    public int hashCode() {
        return (((this.f14475b.hashCode() * 31) + Boolean.hashCode(this.f14476c)) * 31) + this.f14478e.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public k0 k() {
        return new k0(this.f14475b, this.f14476c, this.f14477d);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(k0 k0Var) {
        k0Var.f2(this.f14475b);
        k0Var.g2(this.f14476c);
        k0Var.e2(this.f14477d);
    }
}
