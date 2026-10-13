package androidx.compose.ui.platform;

import C6.G;
import C6.r;
import I6.l;
import Q6.k;
import Q6.o;
import android.view.View;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.InterfaceC1730m;
import androidx.lifecycle.InterfaceC1733p;
import java.util.Set;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.u;
import p017b7.J;
import p065h1.V;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3182v;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3171p;
import p215z0.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class j implements InterfaceC3171p, InterfaceC1730m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f15021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3171p f15022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC1726i f15024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f15025e = V.f24165a.a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f15027b;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0366a extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f15028a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f15029b;

            /* JADX INFO: renamed from: androidx.compose.ui.platform.j$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0367a extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f15030a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j f15031b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0367a(j jVar, G6.d dVar) {
                    super(2, dVar);
                    this.f15031b = jVar;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new C0367a(this.f15031b, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((C0367a) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = H6.c.f();
                    int i8 = this.f15030a;
                    if (i8 == 0) {
                        r.b(obj);
                        AndroidComposeView androidComposeViewA = this.f15031b.A();
                        this.f15030a = 1;
                        if (androidComposeViewA.R(this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    return G.f1419a;
                }
            }

            /* JADX INFO: renamed from: androidx.compose.ui.platform.j$a$a$b */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class b extends u implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f15032a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o f15033b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(j jVar, o oVar) {
                    super(2);
                    this.f15032a = jVar;
                    this.f15033b = oVar;
                }

                public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                    if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                        interfaceC3163l.z();
                        return;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-1193460702, i8, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:138)");
                    }
                    AndroidCompositionLocals_androidKt.a(this.f15032a.A(), this.f15033b, interfaceC3163l, 8);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0366a(j jVar, o oVar) {
                super(2);
                this.f15028a = jVar;
                this.f15029b = oVar;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2000640158, i8, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:124)");
                }
                Object tag = this.f15028a.A().getTag(L0.l.f4863K);
                Set set = P.n(tag) ? (Set) tag : null;
                if (set == null) {
                    Object parent = this.f15028a.A().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(L0.l.f4863K) : null;
                    set = P.n(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(interfaceC3163l.k());
                    interfaceC3163l.a();
                }
                K.d(this.f15028a.A(), new C0367a(this.f15028a, null), interfaceC3163l, 72);
                AbstractC3182v.a(K0.d.a().c(set), H0.c.b(interfaceC3163l, -1193460702, true, new b(this.f15028a, this.f15029b)), interfaceC3163l, 56);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar) {
            super(1);
            this.f15027b = oVar;
        }

        public final void b(AndroidComposeView.c cVar) {
            if (j.this.f15023c) {
                return;
            }
            AbstractC1726i abstractC1726iW = cVar.a().w();
            j.this.f15025e = this.f15027b;
            if (j.this.f15024d == null) {
                j.this.f15024d = abstractC1726iW;
                abstractC1726iW.a(j.this);
            } else if (abstractC1726iW.b().b(AbstractC1726i.b.CREATED)) {
                j.this.z().o(H0.c.c(-2000640158, true, new C0366a(j.this, this.f15027b)));
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((AndroidComposeView.c) obj);
            return G.f1419a;
        }
    }

    public j(AndroidComposeView androidComposeView, InterfaceC3171p interfaceC3171p) {
        this.f15021a = androidComposeView;
        this.f15022b = interfaceC3171p;
    }

    public final AndroidComposeView A() {
        return this.f15021a;
    }

    @Override // p215z0.InterfaceC3171p
    public void d() {
        if (!this.f15023c) {
            this.f15023c = true;
            this.f15021a.getView().setTag(L0.l.f4864L, null);
            AbstractC1726i abstractC1726i = this.f15024d;
            if (abstractC1726i != null) {
                abstractC1726i.d(this);
            }
        }
        this.f15022b.d();
    }

    @Override // androidx.lifecycle.InterfaceC1730m
    public void j(InterfaceC1733p interfaceC1733p, AbstractC1726i.a aVar) {
        if (aVar == AbstractC1726i.a.ON_DESTROY) {
            d();
        } else {
            if (aVar != AbstractC1726i.a.ON_CREATE || this.f15023c) {
                return;
            }
            o(this.f15025e);
        }
    }

    @Override // p215z0.InterfaceC3171p
    public void o(o oVar) {
        this.f15021a.setOnViewTreeOwnersAvailable(new a(oVar));
    }

    public final InterfaceC3171p z() {
        return this.f15022b;
    }
}
