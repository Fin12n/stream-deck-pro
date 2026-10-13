package p109m0;

import C6.G;
import H0.c;
import I0.d;
import Q6.k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.H;
import p215z0.I;
import p215z0.InterfaceC3163l;
import p215z0.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f29430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f29431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f29432c = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f29433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f29434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f29435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Q6.o f29436d;

        /* JADX INFO: renamed from: m0.o$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0641a extends u implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f29438a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f29439b;

            /* JADX INFO: renamed from: m0.o$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0642a extends u implements k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ a f29440a;

                /* JADX INFO: renamed from: m0.o$a$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0643a implements H {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ a f29441a;

                    public C0643a(a aVar) {
                        this.f29441a = aVar;
                    }

                    @Override // p215z0.H
                    public void d() {
                        this.f29441a.f29436d = null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0642a(a aVar) {
                    super(1);
                    this.f29440a = aVar;
                }

                @Override // Q6.k
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final H invoke(I i8) {
                    return new C0643a(this.f29440a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0641a(o oVar, a aVar) {
                super(2);
                this.f29438a = oVar;
                this.f29439b = aVar;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                InterfaceC3163l interfaceC3163l2;
                if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1403994769, i8, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:91)");
                }
                q qVar = (q) this.f29438a.d().invoke();
                int iF = this.f29439b.f();
                if ((iF >= qVar.d() || !t.c(qVar.a(iF), this.f29439b.g())) && (iF = qVar.c(this.f29439b.g())) != -1) {
                    this.f29439b.f29435c = iF;
                }
                int i9 = iF;
                boolean z8 = i9 != -1;
                o oVar = this.f29438a;
                a aVar = this.f29439b;
                interfaceC3163l.u(207, Boolean.valueOf(z8));
                boolean zC = interfaceC3163l.c(z8);
                if (z8) {
                    interfaceC3163l2 = interfaceC3163l;
                    p.a(qVar, M.a(oVar.f29430a), i9, M.a(aVar.g()), interfaceC3163l2, 0);
                } else {
                    interfaceC3163l2 = interfaceC3163l;
                    interfaceC3163l2.n(zC);
                }
                interfaceC3163l2.d();
                K.a(this.f29439b.g(), new C0642a(this.f29439b), interfaceC3163l2, 8);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((InterfaceC3163l) obj, ((Number) obj2).intValue());
                return G.f1419a;
            }
        }

        public a(int i8, Object obj, Object obj2) {
            this.f29433a = obj;
            this.f29434b = obj2;
            this.f29435c = i8;
        }

        public final Q6.o c() {
            return c.c(1403994769, true, new C0641a(o.this, this));
        }

        public final Q6.o d() {
            Q6.o oVar = this.f29436d;
            if (oVar != null) {
                return oVar;
            }
            Q6.o oVarC = c();
            this.f29436d = oVarC;
            return oVarC;
        }

        public final Object e() {
            return this.f29434b;
        }

        public final int f() {
            return this.f29435c;
        }

        public final Object g() {
            return this.f29433a;
        }
    }

    public o(d dVar, Function0 function0) {
        this.f29430a = dVar;
        this.f29431b = function0;
    }

    public final Q6.o b(int i8, Object obj, Object obj2) {
        a aVar = (a) this.f29432c.get(obj);
        if (aVar != null && aVar.f() == i8 && t.c(aVar.e(), obj2)) {
            return aVar.d();
        }
        a aVar2 = new a(i8, obj, obj2);
        this.f29432c.put(obj, aVar2);
        return aVar2.d();
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = (a) this.f29432c.get(obj);
        if (aVar != null) {
            return aVar.e();
        }
        q qVar = (q) this.f29431b.invoke();
        int iC = qVar.c(obj);
        if (iC != -1) {
            return qVar.e(iC);
        }
        return null;
    }

    public final Function0 d() {
        return this.f29431b;
    }
}
