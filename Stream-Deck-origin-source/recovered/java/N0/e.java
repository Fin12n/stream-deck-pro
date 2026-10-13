package N0;

import C6.G;
import Q6.k;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p056g1.AbstractC2347k;
import p056g1.t0;
import p056g1.u0;
import p056g1.v0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e extends L0.i.c implements u0, N0.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f5802r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f5803s = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f5804n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f5805o = a.C0214a.f5808a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public N0.d f5806p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g f5807q;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: N0.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0214a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0214a f5808a = new C0214a();
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ F f5809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N0.b f5810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f5811c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(F f8, N0.b bVar, e eVar) {
            super(1);
            this.f5809a = f8;
            this.f5810b = bVar;
            this.f5811c = eVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(e eVar) {
            F f8 = this.f5809a;
            boolean z8 = f8.f28775a;
            boolean zD2 = eVar.d2(this.f5810b);
            e eVar2 = this.f5811c;
            if (zD2) {
                AbstractC2347k.l(eVar2).getDragAndDropManager().a(eVar);
            }
            G g8 = G.f1419a;
            f8.f28775a = z8 | zD2;
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ N0.b f5812a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(N0.b bVar) {
            super(1);
            this.f5812a = bVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(e eVar) {
            eVar.J0(this.f5812a);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J f5813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f5814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ N0.b f5815c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(J j8, e eVar, N0.b bVar) {
            super(1);
            this.f5813a = j8;
            this.f5814b = eVar;
            this.f5815c = bVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t0 invoke(u0 u0Var) {
            if (u0Var instanceof N0.d) {
                N0.d dVar = (N0.d) u0Var;
                if (AbstractC2347k.l(this.f5814b).getDragAndDropManager().b(dVar) && f.c(dVar, i.a(this.f5815c))) {
                    this.f5813a.f28779a = u0Var;
                    return t0.CancelTraversal;
                }
            }
            return t0.ContinueTraversal;
        }
    }

    public e(k kVar) {
        this.f5804n = kVar;
    }

    @Override // p056g1.u0
    public Object C() {
        return this.f5805o;
    }

    @Override // N0.g
    public boolean F(N0.b bVar) {
        N0.d dVar = this.f5806p;
        if (dVar != null) {
            return dVar.F(bVar);
        }
        g gVar = this.f5807q;
        if (gVar != null) {
            return gVar.F(bVar);
        }
        return false;
    }

    @Override // N0.g
    public void J0(N0.b bVar) {
        if (I0().K1()) {
            v0.b(this, new c(bVar));
            g gVar = this.f5807q;
            if (gVar != null) {
                gVar.J0(bVar);
            }
            this.f5807q = null;
            this.f5806p = null;
        }
    }

    @Override // N0.g
    public void N(N0.b bVar) {
        N0.d dVar;
        N0.d dVar2 = this.f5806p;
        if (dVar2 != null && f.c(dVar2, i.a(bVar))) {
            dVar = dVar2;
        } else if (I0().K1()) {
            J j8 = new J();
            v0.c(this, a.C0214a.f5808a, new d(j8, this, bVar));
            dVar = (N0.d) j8.f28779a;
        } else {
            dVar = null;
        }
        if (dVar != null && dVar2 == null) {
            g gVar = this.f5807q;
            if (gVar != null) {
                gVar.T0(bVar);
            }
            f.d(dVar, bVar);
        } else if (dVar == null && dVar2 != null) {
            dVar2.T0(bVar);
            g gVar2 = this.f5807q;
            if (gVar2 != null) {
                f.d(gVar2, bVar);
            }
        } else if (!t.c(dVar, dVar2)) {
            if (dVar2 != null) {
                dVar2.T0(bVar);
            }
            if (dVar != null) {
                f.d(dVar, bVar);
            }
        } else if (dVar != null) {
            dVar.N(bVar);
        } else {
            g gVar3 = this.f5807q;
            if (gVar3 != null) {
                gVar3.N(bVar);
            }
        }
        this.f5806p = dVar;
    }

    @Override // L0.i.c
    public void O1() {
        this.f5807q = null;
        this.f5806p = null;
    }

    @Override // N0.g
    public void P(N0.b bVar) {
        g gVar = this.f5807q;
        if (gVar != null) {
            gVar.P(bVar);
            return;
        }
        N0.d dVar = this.f5806p;
        if (dVar != null) {
            dVar.P(bVar);
        }
    }

    @Override // N0.g
    public void T0(N0.b bVar) {
        g gVar = this.f5807q;
        if (gVar != null) {
            gVar.T0(bVar);
        }
        N0.d dVar = this.f5806p;
        if (dVar != null) {
            dVar.T0(bVar);
        }
        this.f5806p = null;
    }

    public boolean d2(N0.b bVar) {
        if (!K1()) {
            return false;
        }
        if (this.f5807q != null) {
            throw new IllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session");
        }
        this.f5807q = (g) this.f5804n.invoke(bVar);
        F f8 = new F();
        v0.b(this, new b(f8, bVar, this));
        return f8.f28775a || this.f5807q != null;
    }

    @Override // N0.g
    public void z0(N0.b bVar) {
        g gVar = this.f5807q;
        if (gVar != null) {
            gVar.z0(bVar);
            return;
        }
        N0.d dVar = this.f5806p;
        if (dVar != null) {
            dVar.z0(bVar);
        }
    }
}
