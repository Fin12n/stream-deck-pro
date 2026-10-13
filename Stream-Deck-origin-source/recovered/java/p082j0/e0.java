package p082j0;

import J0.AbstractC1028k;
import L0.l;
import L1.h;
import Q6.k;
import U1.C1650l;
import U1.c0;
import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.H;
import p215z0.I;
import p215z0.InterfaceC3163l;
import p215z0.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static boolean f27949A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f27950x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f27951y = 8;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final WeakHashMap f27952z = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2597a f27953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2597a f27954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2597a f27955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2597a f27956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2597a f27957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2597a f27958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2597a f27959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2597a f27960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C2597a f27961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b0 f27962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d0 f27963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d0 f27964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f27965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b0 f27966n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b0 f27967o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f27968p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b0 f27969q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b0 f27970r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b0 f27971s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b0 f27972t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f27973u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f27974v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RunnableC2616u f27975w;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: j0.e0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0608a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e0 f27976a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f27977b;

            /* JADX INFO: renamed from: j0.e0$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0609a implements H {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ e0 f27978a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ View f27979b;

                public C0609a(e0 e0Var, View view) {
                    this.f27978a = e0Var;
                    this.f27979b = view;
                }

                @Override // p215z0.H
                public void d() {
                    this.f27978a.b(this.f27979b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0608a(e0 e0Var, View view) {
                super(1);
                this.f27976a = e0Var;
                this.f27977b = view;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final H invoke(I i8) {
                this.f27976a.g(this.f27977b);
                return new C0609a(this.f27976a, this.f27977b);
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final e0 c(InterfaceC3163l interfaceC3163l, int i8) {
            interfaceC3163l.f(-1366542614);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1366542614, i8, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
            }
            View view = (View) interfaceC3163l.e(AndroidCompositionLocals_androidKt.j());
            e0 e0VarD = d(view);
            K.a(e0VarD, new C0608a(e0VarD, view), interfaceC3163l, 8);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return e0VarD;
        }

        public final e0 d(View view) {
            e0 e0Var;
            synchronized (e0.f27952z) {
                try {
                    WeakHashMap weakHashMap = e0.f27952z;
                    Object obj = weakHashMap.get(view);
                    Object obj2 = obj;
                    if (obj == null) {
                        e0 e0Var2 = new e0(null, view, false ? 1 : 0);
                        weakHashMap.put(view, e0Var2);
                        obj2 = e0Var2;
                    }
                    e0Var = (e0) obj2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return e0Var;
        }

        public final C2597a e(c0 c0Var, int i8, String str) {
            C2597a c2597a = new C2597a(i8, str);
            if (c0Var != null) {
                c2597a.h(c0Var, i8);
            }
            return c2597a;
        }

        public final b0 f(c0 c0Var, int i8, String str) {
            h hVarG;
            if (c0Var == null || (hVarG = c0Var.g(i8)) == null) {
                hVarG = h.f4938e;
            }
            return j0.a(hVarG, str);
        }

        public a() {
        }
    }

    public /* synthetic */ e0(c0 c0Var, View view, AbstractC2633k abstractC2633k) {
        this(c0Var, view);
    }

    public static /* synthetic */ void i(e0 e0Var, c0 c0Var, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        e0Var.h(c0Var, i8);
    }

    public final void b(View view) {
        int i8 = this.f27974v - 1;
        this.f27974v = i8;
        if (i8 == 0) {
            U1.I.R(view, null);
            U1.I.V(view, null);
            view.removeOnAttachStateChangeListener(this.f27975w);
        }
    }

    public final boolean c() {
        return this.f27973u;
    }

    public final C2597a d() {
        return this.f27955c;
    }

    public final d0 e() {
        return this.f27963k;
    }

    public final C2597a f() {
        return this.f27959g;
    }

    public final void g(View view) {
        if (this.f27974v == 0) {
            U1.I.R(view, this.f27975w);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.f27975w);
            U1.I.V(view, this.f27975w);
        }
        this.f27974v++;
    }

    public final void h(c0 c0Var, int i8) {
        if (f27949A) {
            WindowInsets windowInsetsV = c0Var.v();
            t.d(windowInsetsV);
            c0Var = c0.w(windowInsetsV);
        }
        this.f27953a.h(c0Var, i8);
        this.f27955c.h(c0Var, i8);
        this.f27954b.h(c0Var, i8);
        this.f27957e.h(c0Var, i8);
        this.f27958f.h(c0Var, i8);
        this.f27959g.h(c0Var, i8);
        this.f27960h.h(c0Var, i8);
        this.f27961i.h(c0Var, i8);
        this.f27956d.h(c0Var, i8);
        if (i8 == 0) {
            this.f27966n.f(j0.d(c0Var.g(c0.m.a())));
            this.f27967o.f(j0.d(c0Var.g(c0.m.f())));
            this.f27968p.f(j0.d(c0Var.g(c0.m.g())));
            this.f27969q.f(j0.d(c0Var.g(c0.m.h())));
            this.f27970r.f(j0.d(c0Var.g(c0.m.j())));
            C1650l c1650lE = c0Var.e();
            if (c1650lE != null) {
                this.f27962j.f(j0.d(c1650lE.f()));
            }
        }
        AbstractC1028k.f3974e.k();
    }

    public final void j(c0 c0Var) {
        this.f27972t.f(j0.d(c0Var.f(c0.m.c())));
    }

    public final void k(c0 c0Var) {
        this.f27971s.f(j0.d(c0Var.f(c0.m.c())));
    }

    public e0(c0 c0Var, View view) {
        C1650l c1650lE;
        h hVarF;
        a aVar = f27950x;
        this.f27953a = aVar.e(c0Var, c0.m.a(), "captionBar");
        C2597a c2597aE = aVar.e(c0Var, c0.m.b(), "displayCutout");
        this.f27954b = c2597aE;
        C2597a c2597aE2 = aVar.e(c0Var, c0.m.c(), "ime");
        this.f27955c = c2597aE2;
        C2597a c2597aE3 = aVar.e(c0Var, c0.m.e(), "mandatorySystemGestures");
        this.f27956d = c2597aE3;
        this.f27957e = aVar.e(c0Var, c0.m.f(), "navigationBars");
        this.f27958f = aVar.e(c0Var, c0.m.g(), "statusBars");
        C2597a c2597aE4 = aVar.e(c0Var, c0.m.h(), "systemBars");
        this.f27959g = c2597aE4;
        C2597a c2597aE5 = aVar.e(c0Var, c0.m.i(), "systemGestures");
        this.f27960h = c2597aE5;
        C2597a c2597aE6 = aVar.e(c0Var, c0.m.j(), "tappableElement");
        this.f27961i = c2597aE6;
        b0 b0VarA = j0.a((c0Var == null || (c1650lE = c0Var.e()) == null || (hVarF = c1650lE.f()) == null) ? h.f4938e : hVarF, "waterfall");
        this.f27962j = b0VarA;
        d0 d0VarE = f0.e(f0.e(c2597aE4, c2597aE2), c2597aE);
        this.f27963k = d0VarE;
        d0 d0VarE2 = f0.e(f0.e(f0.e(c2597aE6, c2597aE3), c2597aE5), b0VarA);
        this.f27964l = d0VarE2;
        this.f27965m = f0.e(d0VarE, d0VarE2);
        this.f27966n = aVar.f(c0Var, c0.m.a(), "captionBarIgnoringVisibility");
        this.f27967o = aVar.f(c0Var, c0.m.f(), "navigationBarsIgnoringVisibility");
        this.f27968p = aVar.f(c0Var, c0.m.g(), "statusBarsIgnoringVisibility");
        this.f27969q = aVar.f(c0Var, c0.m.h(), "systemBarsIgnoringVisibility");
        this.f27970r = aVar.f(c0Var, c0.m.j(), "tappableElementIgnoringVisibility");
        this.f27971s = aVar.f(c0Var, c0.m.c(), "imeAnimationTarget");
        this.f27972t = aVar.f(c0Var, c0.m.c(), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(l.f4861I) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f27973u = bool != null ? bool.booleanValue() : true;
        this.f27975w = new RunnableC2616u(this);
    }
}
