package D1;

import A1.y;
import A1.z;
import C6.G;
import C6.r;
import R0.InterfaceC1586f0;
import U1.C1661x;
import U1.InterfaceC1660w;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.InterfaceC1733p;
import androidx.lifecycle.T;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p011b1.K;
import p017b7.AbstractC1789i;
import p017b7.J;
import p038e1.H;
import p038e1.I;
import p038e1.InterfaceC2244o;
import p038e1.InterfaceC2247s;
import p038e1.a0;
import p056g1.F;
import p056g1.h0;
import p056g1.i0;
import p056g1.j0;
import p065h1.AbstractC2418u0;
import p065h1.c1;
import p110m1.x;
import p215z0.AbstractC3173q;
import p215z0.InterfaceC3159j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c extends ViewGroup implements InterfaceC1660w, InterfaceC3159j, i0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f1718x = new b(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f1719y = 8;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Q6.k f1720z = a.f1744a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p002a1.b f1722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f1723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0 f1724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Function0 f1725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Function0 f1727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Function0 f1728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public L0.i f1729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Q6.k f1730j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public A1.d f1731k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Q6.k f1732l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InterfaceC1733p f1733m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p217z2.f f1734n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Function0 f1735o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Function0 f1736p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Q6.k f1737q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int[] f1738r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1739s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1740t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C1661x f1741u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1742v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final F f1743w;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1744a = new a();

        public a() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(Function0 function0) {
            function0.invoke();
        }

        public final void c(c cVar) {
            Handler handler = cVar.getHandler();
            final Function0 function0 = cVar.f1735o;
            handler.post(new Runnable() { // from class: D1.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.a.d(function0);
                }
            });
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            c((c) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: D1.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0067c extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ F f1745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L0.i f1746b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0067c(F f8, L0.i iVar) {
            super(1);
            this.f1745a = f8;
            this.f1746b = iVar;
        }

        public final void b(L0.i iVar) {
            this.f1745a.j(iVar.j(this.f1746b));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((L0.i) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ F f1747a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(F f8) {
            super(1);
            this.f1747a = f8;
        }

        public final void b(A1.d dVar) {
            this.f1747a.l(dVar);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((A1.d) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Q6.k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ F f1749b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(F f8) {
            super(1);
            this.f1749b = f8;
        }

        public final void b(h0 h0Var) {
            AndroidComposeView androidComposeView = h0Var instanceof AndroidComposeView ? (AndroidComposeView) h0Var : null;
            if (androidComposeView != null) {
                androidComposeView.O(c.this, this.f1749b);
            }
            ViewParent parent = c.this.getView().getParent();
            c cVar = c.this;
            if (parent != cVar) {
                cVar.addView(cVar.getView());
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((h0) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements Q6.k {
        public f() {
            super(1);
        }

        public final void b(h0 h0Var) {
            AndroidComposeView androidComposeView = h0Var instanceof AndroidComposeView ? (AndroidComposeView) h0Var : null;
            if (androidComposeView != null) {
                androidComposeView.q0(c.this);
            }
            c.this.removeAllViewsInLayout();
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((h0) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends u implements Q6.k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ F f1758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f1759c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(F f8, c cVar) {
            super(1);
            this.f1758b = f8;
            this.f1759c = cVar;
        }

        public final void b(T0.f fVar) {
            c cVar = c.this;
            F f8 = this.f1758b;
            c cVar2 = this.f1759c;
            InterfaceC1586f0 interfaceC1586f0C = fVar.K0().c();
            if (cVar.getView().getVisibility() != 8) {
                cVar.f1742v = true;
                h0 h0VarL0 = f8.l0();
                AndroidComposeView androidComposeView = h0VarL0 instanceof AndroidComposeView ? (AndroidComposeView) h0VarL0 : null;
                if (androidComposeView != null) {
                    androidComposeView.V(cVar2, R0.F.d(interfaceC1586f0C));
                }
                cVar.f1742v = false;
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((T0.f) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends u implements Q6.k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ F f1761b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(F f8) {
            super(1);
            this.f1761b = f8;
        }

        public final void b(InterfaceC2247s interfaceC2247s) {
            D1.d.f(c.this, this.f1761b);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((InterfaceC2247s) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f1763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f1764c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f1765d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(boolean z8, c cVar, long j8, G6.d dVar) {
            super(2, dVar);
            this.f1763b = z8;
            this.f1764c = cVar;
            this.f1765d = j8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new k(this.f1763b, this.f1764c, this.f1765d, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((k) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r4.a(r5, r7, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (r1.a(r2, r4, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        
            return r0;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f1762a;
            if (i8 == 0) {
                r.b(obj);
                if (this.f1763b) {
                    p002a1.b bVar = this.f1764c.f1722b;
                    long j8 = this.f1765d;
                    long jA = y.f471b.a();
                    this.f1762a = 2;
                } else {
                    p002a1.b bVar2 = this.f1764c.f1722b;
                    long jA2 = y.f471b.a();
                    long j9 = this.f1765d;
                    this.f1762a = 1;
                }
            } else {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1766a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f1768c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(long j8, G6.d dVar) {
            super(2, dVar);
            this.f1768c = j8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return c.this.new l(this.f1768c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((l) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f1766a;
            if (i8 == 0) {
                r.b(obj);
                p002a1.b bVar = c.this.f1722b;
                long j8 = this.f1768c;
                this.f1766a = 1;
                if (bVar.c(j8, this) == objF) {
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class m extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f1769a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m41invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m41invoke() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class n extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f1770a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m42invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m42invoke() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class o extends u implements Function0 {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m43invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m43invoke() {
            c.this.getLayoutNode().C0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class p extends u implements Function0 {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m44invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m44invoke() {
            if (c.this.f1726f && c.this.isAttachedToWindow()) {
                c.this.getSnapshotObserver().i(c.this, c.f1720z, c.this.getUpdate());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class q extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f1773a = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m45invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m45invoke() {
        }
    }

    public c(Context context, AbstractC3173q abstractC3173q, int i8, p002a1.b bVar, View view, h0 h0Var) {
        super(context);
        this.f1721a = i8;
        this.f1722b = bVar;
        this.f1723c = view;
        this.f1724d = h0Var;
        if (abstractC3173q != null) {
            c1.i(this, abstractC3173q);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.f1725e = q.f1773a;
        this.f1727g = n.f1770a;
        this.f1728h = m.f1769a;
        L0.i.a aVar = L0.i.f4836a;
        this.f1729i = aVar;
        this.f1731k = A1.f.b(1.0f, 0.0f, 2, null);
        this.f1735o = new p();
        this.f1736p = new o();
        this.f1738r = new int[2];
        this.f1739s = Integer.MIN_VALUE;
        this.f1740t = Integer.MIN_VALUE;
        this.f1741u = new C1661x(this);
        F f8 = new F(false, 0, 3, null);
        f8.s1(this);
        L0.i iVarA = androidx.compose.ui.layout.c.a(androidx.compose.ui.draw.a.b(K.a(p110m1.n.c(androidx.compose.ui.input.nestedscroll.a.a(aVar, D1.d.f1774a, bVar), true, h.f1756a), this), new i(f8, this)), new j(f8));
        f8.c(i8);
        f8.j(this.f1729i.j(iVarA));
        this.f1730j = new C0067c(f8, iVarA);
        f8.l(this.f1731k);
        this.f1732l = new d(f8);
        f8.w1(new e(f8));
        f8.x1(new f());
        f8.m(new g(f8));
        this.f1743w = f8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j0 getSnapshotObserver() {
        if (isAttachedToWindow()) {
            return this.f1724d.getSnapshotObserver();
        }
        throw new IllegalStateException("Expected AndroidViewHolder to be attached when observing reads.");
    }

    public static final void s(Function0 function0) {
        function0.invoke();
    }

    @Override // p056g1.i0
    public boolean L() {
        return isAttachedToWindow();
    }

    @Override // p215z0.InterfaceC3159j
    public void d() {
        this.f1728h.invoke();
    }

    @Override // p215z0.InterfaceC3159j
    public void e() {
        this.f1727g.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f1738r);
        int[] iArr = this.f1738r;
        int i8 = iArr[0];
        region.op(i8, iArr[1], i8 + getWidth(), this.f1738r[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final A1.d getDensity() {
        return this.f1731k;
    }

    public final View getInteropView() {
        return this.f1723c;
    }

    public final F getLayoutNode() {
        return this.f1743w;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f1723c.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC1733p getLifecycleOwner() {
        return this.f1733m;
    }

    public final L0.i getModifier() {
        return this.f1729i;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1741u.a();
    }

    public final Q6.k getOnDensityChanged$ui_release() {
        return this.f1732l;
    }

    public final Q6.k getOnModifierChanged$ui_release() {
        return this.f1730j;
    }

    public final Q6.k getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f1737q;
    }

    public final Function0 getRelease() {
        return this.f1728h;
    }

    public final Function0 getReset() {
        return this.f1727g;
    }

    public final p217z2.f getSavedStateRegistryOwner() {
        return this.f1734n;
    }

    public final Function0 getUpdate() {
        return this.f1725e;
    }

    public final View getView() {
        return this.f1723c;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        r();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f1723c.isNestedScrollingEnabled();
    }

    @Override // U1.InterfaceC1660w
    public void j(View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            long jB = this.f1722b.b(Q0.g.a(D1.d.g(i8), D1.d.g(i9)), Q0.g.a(D1.d.g(i10), D1.d.g(i11)), D1.d.i(i12));
            iArr[0] = AbstractC2418u0.b(Q0.f.o(jB));
            iArr[1] = AbstractC2418u0.b(Q0.f.p(jB));
        }
    }

    @Override // U1.InterfaceC1659v
    public void k(View view, int i8, int i9, int i10, int i11, int i12) {
        if (isNestedScrollingEnabled()) {
            this.f1722b.b(Q0.g.a(D1.d.g(i8), D1.d.g(i9)), Q0.g.a(D1.d.g(i10), D1.d.g(i11)), D1.d.i(i12));
        }
    }

    @Override // U1.InterfaceC1659v
    public boolean l(View view, View view2, int i8, int i9) {
        return ((i8 & 2) == 0 && (i8 & 1) == 0) ? false : true;
    }

    @Override // U1.InterfaceC1659v
    public void m(View view, View view2, int i8, int i9) {
        this.f1741u.c(view, view2, i8, i9);
    }

    @Override // U1.InterfaceC1659v
    public void n(View view, int i8) {
        this.f1741u.d(view, i8);
    }

    @Override // U1.InterfaceC1659v
    public void o(View view, int i8, int i9, int[] iArr, int i10) {
        if (isNestedScrollingEnabled()) {
            long jD = this.f1722b.d(Q0.g.a(D1.d.g(i8), D1.d.g(i9)), D1.d.i(i10));
            iArr[0] = AbstractC2418u0.b(Q0.f.o(jD));
            iArr[1] = AbstractC2418u0.b(Q0.f.p(jD));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1735o.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        r();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        this.f1723c.layout(0, 0, i10 - i8, i11 - i9);
    }

    @Override // android.view.View
    public void onMeasure(int i8, int i9) {
        if (this.f1723c.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i8), View.MeasureSpec.getSize(i9));
            return;
        }
        if (this.f1723c.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.f1723c.measure(i8, i9);
        setMeasuredDimension(this.f1723c.getMeasuredWidth(), this.f1723c.getMeasuredHeight());
        this.f1739s = i8;
        this.f1740t = i9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f8, float f9, boolean z8) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC1789i.d(this.f1722b.e(), null, null, new k(z8, this, z.a(D1.d.h(f8), D1.d.h(f9)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f8, float f9) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC1789i.d(this.f1722b.e(), null, null, new l(z.a(D1.d.h(f8), D1.d.h(f9)), null), 3, null);
        return false;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i8) {
        super.onWindowVisibilityChanged(i8);
    }

    @Override // p215z0.InterfaceC3159j
    public void p() {
        if (this.f1723c.getParent() != this) {
            addView(this.f1723c);
        } else {
            this.f1727g.invoke();
        }
    }

    public final void r() {
        if (!this.f1742v) {
            this.f1743w.C0();
            return;
        }
        View view = this.f1723c;
        final Function0 function0 = this.f1736p;
        view.postOnAnimation(new Runnable() { // from class: D1.a
            @Override // java.lang.Runnable
            public final void run() {
                c.s(function0);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z8) {
        Q6.k kVar = this.f1737q;
        if (kVar != null) {
            kVar.invoke(Boolean.valueOf(z8));
        }
        super.requestDisallowInterceptTouchEvent(z8);
    }

    public final void setDensity(A1.d dVar) {
        if (dVar != this.f1731k) {
            this.f1731k = dVar;
            Q6.k kVar = this.f1732l;
            if (kVar != null) {
                kVar.invoke(dVar);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC1733p interfaceC1733p) {
        if (interfaceC1733p != this.f1733m) {
            this.f1733m = interfaceC1733p;
            T.b(this, interfaceC1733p);
        }
    }

    public final void setModifier(L0.i iVar) {
        if (iVar != this.f1729i) {
            this.f1729i = iVar;
            Q6.k kVar = this.f1730j;
            if (kVar != null) {
                kVar.invoke(iVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Q6.k kVar) {
        this.f1732l = kVar;
    }

    public final void setOnModifierChanged$ui_release(Q6.k kVar) {
        this.f1730j = kVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Q6.k kVar) {
        this.f1737q = kVar;
    }

    public final void setRelease(Function0 function0) {
        this.f1728h = function0;
    }

    public final void setReset(Function0 function0) {
        this.f1727g = function0;
    }

    public final void setSavedStateRegistryOwner(p217z2.f fVar) {
        if (fVar != this.f1734n) {
            this.f1734n = fVar;
            p217z2.g.b(this, fVar);
        }
    }

    public final void setUpdate(Function0 function0) {
        this.f1725e = function0;
        this.f1726f = true;
        this.f1735o.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public final int t(int i8, int i9, int i10) {
        if (i10 >= 0 || i8 == i9) {
            return View.MeasureSpec.makeMeasureSpec(W6.n.k(i10, i8, i9), 1073741824);
        }
        if (i10 != -2 || i9 == Integer.MAX_VALUE) {
            return (i10 != -1 || i9 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
    }

    public final void u() {
        int i8;
        int i9 = this.f1739s;
        if (i9 == Integer.MIN_VALUE || (i8 = this.f1740t) == Integer.MIN_VALUE) {
            return;
        }
        measure(i9, i8);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g implements H {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ F f1752b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f1754a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ F f1755b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c cVar, F f8) {
                super(1);
                this.f1754a = cVar;
                this.f1755b = f8;
            }

            public final void b(a0.a aVar) {
                D1.d.f(this.f1754a, this.f1755b);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((a0.a) obj);
                return G.f1419a;
            }
        }

        public g(F f8) {
            this.f1752b = f8;
        }

        @Override // p038e1.H
        public int a(InterfaceC2244o interfaceC2244o, List list, int i8) {
            return g(i8);
        }

        @Override // p038e1.H
        public int b(InterfaceC2244o interfaceC2244o, List list, int i8) {
            return g(i8);
        }

        @Override // p038e1.H
        public int c(InterfaceC2244o interfaceC2244o, List list, int i8) {
            return f(i8);
        }

        @Override // p038e1.H
        public I d(p038e1.J j8, List list, long j9) {
            if (c.this.getChildCount() == 0) {
                return p038e1.J.X0(j8, A1.b.p(j9), A1.b.o(j9), null, a.f1753a, 4, null);
            }
            if (A1.b.p(j9) != 0) {
                c.this.getChildAt(0).setMinimumWidth(A1.b.p(j9));
            }
            if (A1.b.o(j9) != 0) {
                c.this.getChildAt(0).setMinimumHeight(A1.b.o(j9));
            }
            c cVar = c.this;
            int iP = A1.b.p(j9);
            int iN = A1.b.n(j9);
            ViewGroup.LayoutParams layoutParams = c.this.getLayoutParams();
            t.d(layoutParams);
            int iT = cVar.t(iP, iN, layoutParams.width);
            c cVar2 = c.this;
            int iO = A1.b.o(j9);
            int iM = A1.b.m(j9);
            ViewGroup.LayoutParams layoutParams2 = c.this.getLayoutParams();
            t.d(layoutParams2);
            cVar.measure(iT, cVar2.t(iO, iM, layoutParams2.height));
            return p038e1.J.X0(j8, c.this.getMeasuredWidth(), c.this.getMeasuredHeight(), null, new b(c.this, this.f1752b), 4, null);
        }

        @Override // p038e1.H
        public int e(InterfaceC2244o interfaceC2244o, List list, int i8) {
            return f(i8);
        }

        public final int f(int i8) {
            c cVar = c.this;
            ViewGroup.LayoutParams layoutParams = cVar.getLayoutParams();
            t.d(layoutParams);
            cVar.measure(cVar.t(0, i8, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return c.this.getMeasuredHeight();
        }

        public final int g(int i8) {
            c cVar = c.this;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            c cVar2 = c.this;
            ViewGroup.LayoutParams layoutParams = cVar2.getLayoutParams();
            t.d(layoutParams);
            cVar.measure(iMakeMeasureSpec, cVar2.t(0, i8, layoutParams.height));
            return c.this.getMeasuredWidth();
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f1753a = new a();

            public a() {
                super(1);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((a0.a) obj);
                return G.f1419a;
            }

            public final void b(a0.a aVar) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f1756a = new h();

        public h() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }

        public final void b(x xVar) {
        }
    }
}
