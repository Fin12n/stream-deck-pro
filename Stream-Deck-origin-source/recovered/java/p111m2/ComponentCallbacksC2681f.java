package p111m2;

import H1.s;
import U1.AbstractC1653o;
import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.AbstractC1737u;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC1724g;
import androidx.lifecycle.InterfaceC1730m;
import androidx.lifecycle.InterfaceC1733p;
import androidx.lifecycle.L;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.r;
import androidx.lifecycle.x;
import androidx.startup.TrZh.ZWZaxQrCHfNe;
import com.revenuecat.purchases.common.Constants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p116m7.kKPq.toqHM;
import p217z2.f;

/* JADX INFO: renamed from: m2.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ComponentCallbacksC2681f implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1733p, S, InterfaceC1724g, f {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final Object f29837n0 = new Object();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f29838A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f29839B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f29840C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f29841D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f29842E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f29843F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f29844G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ViewGroup f29845H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public View f29846I;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f29847V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f29848W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public g f29849X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Runnable f29850Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f29851Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29852a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public LayoutInflater f29853a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bundle f29854b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f29855b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SparseArray f29856c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public String f29857c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f29858d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public AbstractC1726i.b f29859d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f29860e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public r f29861e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f29862f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public K f29863f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bundle f29864g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public x f29865g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ComponentCallbacksC2681f f29866h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public P.c f29867h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f29868i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public p217z2.e f29869i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f29870j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f29871j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f29872k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final AtomicInteger f29873k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f29874l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final ArrayList f29875l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f29876m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final j f29877m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f29878n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f29879o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f29880p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f29881q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f29882r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f29883s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public y f29884t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public q f29885u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public y f29886v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ComponentCallbacksC2681f f29887w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f29888x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f29889y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f29890z;

    /* JADX INFO: renamed from: m2.f$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacksC2681f.this.B1();
        }
    }

    /* JADX INFO: renamed from: m2.f$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b extends j {
        public b() {
            super(null);
        }

        @Override // p111m2.ComponentCallbacksC2681f.j
        public void a() {
            ComponentCallbacksC2681f.this.f29869i0.c();
            I.c(ComponentCallbacksC2681f.this);
        }
    }

    /* JADX INFO: renamed from: m2.f$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacksC2681f.this.e(false);
        }
    }

    /* JADX INFO: renamed from: m2.f$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ M f29894a;

        public d(M m8) {
            this.f29894a = m8;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29894a.g();
        }
    }

    /* JADX INFO: renamed from: m2.f$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class e extends AbstractC2688m {
        public e() {
        }

        @Override // p111m2.AbstractC2688m
        public View f(int i8) {
            View view = ComponentCallbacksC2681f.this.f29846I;
            if (view != null) {
                return view.findViewById(i8);
            }
            throw new IllegalStateException("Fragment " + ComponentCallbacksC2681f.this + " does not have a view");
        }

        @Override // p111m2.AbstractC2688m
        public boolean g() {
            return ComponentCallbacksC2681f.this.f29846I != null;
        }
    }

    /* JADX INFO: renamed from: m2.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class C0648f implements InterfaceC1730m {
        public C0648f() {
        }

        @Override // androidx.lifecycle.InterfaceC1730m
        public void j(InterfaceC1733p interfaceC1733p, AbstractC1726i.a aVar) {
            View view;
            if (aVar != AbstractC1726i.a.ON_STOP || (view = ComponentCallbacksC2681f.this.f29846I) == null) {
                return;
            }
            h.a(view);
        }
    }

    /* JADX INFO: renamed from: m2.f$g */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f29898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f29899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f29900c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f29901d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f29902e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f29903f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f29904g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ArrayList f29905h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ArrayList f29906i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f29907j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f29908k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f29909l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f29910m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f29911n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f29912o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f29913p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Boolean f29914q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public s f29915r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public s f29916s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f29917t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public View f29918u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f29919v;

        public g() {
            Object obj = ComponentCallbacksC2681f.f29837n0;
            this.f29908k = obj;
            this.f29909l = null;
            this.f29910m = obj;
            this.f29911n = null;
            this.f29912o = obj;
            this.f29915r = null;
            this.f29916s = null;
            this.f29917t = 1.0f;
            this.f29918u = null;
        }
    }

    /* JADX INFO: renamed from: m2.f$h */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class h {
        public static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: renamed from: m2.f$i */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class i extends RuntimeException {
        public i(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: renamed from: m2.f$j */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class j {
        public j() {
        }

        public abstract void a();

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    public ComponentCallbacksC2681f() {
        this.f29852a = -1;
        this.f29862f = UUID.randomUUID().toString();
        this.f29868i = null;
        this.f29872k = null;
        this.f29886v = new z();
        this.f29843F = true;
        this.f29848W = true;
        this.f29850Y = new a();
        this.f29859d0 = AbstractC1726i.b.RESUMED;
        this.f29865g0 = new x();
        this.f29873k0 = new AtomicInteger();
        this.f29875l0 = new ArrayList();
        this.f29877m0 = new b();
        W();
    }

    public static ComponentCallbacksC2681f Y(Context context, String str, Bundle bundle) {
        try {
            ComponentCallbacksC2681f componentCallbacksC2681f = (ComponentCallbacksC2681f) p.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return componentCallbacksC2681f;
            }
            bundle.setClassLoader(componentCallbacksC2681f.getClass().getClassLoader());
            componentCallbacksC2681f.u1(bundle);
            return componentCallbacksC2681f;
        } catch (IllegalAccessException e8) {
            throw new i("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e8);
        } catch (InstantiationException e9) {
            throw new i("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e9);
        } catch (NoSuchMethodException e10) {
            throw new i("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e10);
        } catch (InvocationTargetException e11) {
            throw new i("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e11);
        }
    }

    public s A() {
        g gVar = this.f29849X;
        if (gVar == null) {
            return null;
        }
        return gVar.f29916s;
    }

    public void A0(boolean z8) {
    }

    public void A1(Intent intent, int i8, Bundle bundle) {
        if (this.f29885u != null) {
            H().M0(this, intent, i8, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public View B() {
        g gVar = this.f29849X;
        if (gVar == null) {
            return null;
        }
        return gVar.f29918u;
    }

    public boolean B0(MenuItem menuItem) {
        return false;
    }

    public void B1() {
        if (this.f29849X == null || !j().f29919v) {
            return;
        }
        if (this.f29885u == null) {
            j().f29919v = false;
        } else if (Looper.myLooper() != this.f29885u.r().getLooper()) {
            this.f29885u.r().postAtFrontOfQueue(new c());
        } else {
            e(true);
        }
    }

    public final Object C() {
        q qVar = this.f29885u;
        if (qVar == null) {
            return null;
        }
        return qVar.x();
    }

    public void C0(Menu menu) {
    }

    public LayoutInflater D(Bundle bundle) {
        q qVar = this.f29885u;
        if (qVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterY = qVar.y();
        AbstractC1653o.a(layoutInflaterY, this.f29886v.s0());
        return layoutInflaterY;
    }

    public void D0() {
        this.f29844G = true;
    }

    public final int E() {
        AbstractC1726i.b bVar = this.f29859d0;
        return (bVar == AbstractC1726i.b.INITIALIZED || this.f29887w == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f29887w.E());
    }

    public void E0(boolean z8) {
    }

    public int F() {
        g gVar = this.f29849X;
        if (gVar == null) {
            return 0;
        }
        return gVar.f29904g;
    }

    public void F0(Menu menu) {
    }

    public final ComponentCallbacksC2681f G() {
        return this.f29887w;
    }

    public void G0(boolean z8) {
    }

    public final y H() {
        y yVar = this.f29884t;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void H0(int i8, String[] strArr, int[] iArr) {
    }

    public boolean I() {
        g gVar = this.f29849X;
        if (gVar == null) {
            return false;
        }
        return gVar.f29899b;
    }

    public void I0() {
        this.f29844G = true;
    }

    public int J() {
        g gVar = this.f29849X;
        if (gVar == null) {
            return 0;
        }
        return gVar.f29902e;
    }

    public void J0(Bundle bundle) {
    }

    public int K() {
        g gVar = this.f29849X;
        if (gVar == null) {
            return 0;
        }
        return gVar.f29903f;
    }

    public void K0() {
        this.f29844G = true;
    }

    public float L() {
        g gVar = this.f29849X;
        if (gVar == null) {
            return 1.0f;
        }
        return gVar.f29917t;
    }

    public void L0() {
        this.f29844G = true;
    }

    public Object M() {
        g gVar = this.f29849X;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f29910m;
        return obj == f29837n0 ? z() : obj;
    }

    public void M0(View view, Bundle bundle) {
    }

    public final Resources N() {
        return o1().getResources();
    }

    public void N0(Bundle bundle) {
        this.f29844G = true;
    }

    public Object O() {
        g gVar = this.f29849X;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f29908k;
        return obj == f29837n0 ? v() : obj;
    }

    public void O0(Bundle bundle) {
        this.f29886v.O0();
        this.f29852a = 3;
        this.f29844G = false;
        h0(bundle);
        if (this.f29844G) {
            r1();
            this.f29886v.v();
        } else {
            throw new O("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public Object P() {
        g gVar = this.f29849X;
        if (gVar == null) {
            return null;
        }
        return gVar.f29911n;
    }

    public void P0() {
        Iterator it = this.f29875l0.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
        }
        this.f29875l0.clear();
        this.f29886v.k(this.f29885u, h(), this);
        this.f29852a = 0;
        this.f29844G = false;
        k0(this.f29885u.o());
        if (this.f29844G) {
            this.f29884t.F(this);
            this.f29886v.w();
        } else {
            throw new O("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public Object Q() {
        g gVar = this.f29849X;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f29912o;
        return obj == f29837n0 ? P() : obj;
    }

    public void Q0(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public ArrayList R() {
        ArrayList arrayList;
        g gVar = this.f29849X;
        return (gVar == null || (arrayList = gVar.f29905h) == null) ? new ArrayList() : arrayList;
    }

    public boolean R0(MenuItem menuItem) {
        if (this.f29838A) {
            return false;
        }
        if (m0(menuItem)) {
            return true;
        }
        return this.f29886v.y(menuItem);
    }

    public ArrayList S() {
        ArrayList arrayList;
        g gVar = this.f29849X;
        return (gVar == null || (arrayList = gVar.f29906i) == null) ? new ArrayList() : arrayList;
    }

    public void S0(Bundle bundle) {
        this.f29886v.O0();
        this.f29852a = 1;
        this.f29844G = false;
        this.f29861e0.a(new C0648f());
        this.f29869i0.d(bundle);
        n0(bundle);
        this.f29855b0 = true;
        if (this.f29844G) {
            this.f29861e0.i(AbstractC1726i.a.ON_CREATE);
            return;
        }
        throw new O("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final ComponentCallbacksC2681f T(boolean z8) {
        String str;
        if (z8) {
            p120n2.c.h(this);
        }
        ComponentCallbacksC2681f componentCallbacksC2681f = this.f29866h;
        if (componentCallbacksC2681f != null) {
            return componentCallbacksC2681f;
        }
        y yVar = this.f29884t;
        if (yVar == null || (str = this.f29868i) == null) {
            return null;
        }
        return yVar.c0(str);
    }

    public boolean T0(Menu menu, MenuInflater menuInflater) {
        boolean z8 = false;
        if (this.f29838A) {
            return false;
        }
        if (this.f29842E && this.f29843F) {
            q0(menu, menuInflater);
            z8 = true;
        }
        return this.f29886v.A(menu, menuInflater) | z8;
    }

    public View U() {
        return this.f29846I;
    }

    public void U0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f29886v.O0();
        this.f29882r = true;
        this.f29863f0 = new K(this, k());
        View viewR0 = r0(layoutInflater, viewGroup, bundle);
        this.f29846I = viewR0;
        if (viewR0 == null) {
            if (this.f29863f0.d()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f29863f0 = null;
        } else {
            this.f29863f0.c();
            T.b(this.f29846I, this.f29863f0);
            U.b(this.f29846I, this.f29863f0);
            p217z2.g.b(this.f29846I, this.f29863f0);
            this.f29865g0.m(this.f29863f0);
        }
    }

    public AbstractC1737u V() {
        return this.f29865g0;
    }

    public void V0() {
        this.f29886v.B();
        this.f29861e0.i(AbstractC1726i.a.ON_DESTROY);
        this.f29852a = 0;
        this.f29844G = false;
        this.f29855b0 = false;
        s0();
        if (this.f29844G) {
            return;
        }
        throw new O("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public final void W() {
        this.f29861e0 = new r(this);
        this.f29869i0 = p217z2.e.a(this);
        this.f29867h0 = null;
        if (this.f29875l0.contains(this.f29877m0)) {
            return;
        }
        m1(this.f29877m0);
    }

    public void W0() {
        this.f29886v.C();
        if (this.f29846I != null && this.f29863f0.w().b().b(AbstractC1726i.b.CREATED)) {
            this.f29863f0.a(AbstractC1726i.a.ON_DESTROY);
        }
        this.f29852a = 1;
        this.f29844G = false;
        u0();
        if (this.f29844G) {
            p177u2.a.b(this).c();
            this.f29882r = false;
        } else {
            throw new O("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public void X() {
        W();
        this.f29857c0 = this.f29862f;
        this.f29862f = UUID.randomUUID().toString();
        this.f29874l = false;
        this.f29876m = false;
        this.f29879o = false;
        this.f29880p = false;
        this.f29881q = false;
        this.f29883s = 0;
        this.f29884t = null;
        this.f29886v = new z();
        this.f29885u = null;
        this.f29888x = 0;
        this.f29889y = 0;
        this.f29890z = null;
        this.f29838A = false;
        this.f29839B = false;
    }

    public void X0() {
        this.f29852a = -1;
        this.f29844G = false;
        v0();
        this.f29853a0 = null;
        if (this.f29844G) {
            if (this.f29886v.D0()) {
                return;
            }
            this.f29886v.B();
            this.f29886v = new z();
            return;
        }
        throw new O("Fragment " + this + " did not call through to super.onDetach()");
    }

    public LayoutInflater Y0(Bundle bundle) {
        LayoutInflater layoutInflaterW0 = w0(bundle);
        this.f29853a0 = layoutInflaterW0;
        return layoutInflaterW0;
    }

    public final boolean Z() {
        return this.f29885u != null && this.f29874l;
    }

    public void Z0() {
        onLowMemory();
    }

    public final boolean a0() {
        if (this.f29838A) {
            return true;
        }
        y yVar = this.f29884t;
        return yVar != null && yVar.H0(this.f29887w);
    }

    public void a1(boolean z8) {
        A0(z8);
    }

    public final boolean b0() {
        return this.f29883s > 0;
    }

    public boolean b1(MenuItem menuItem) {
        if (this.f29838A) {
            return false;
        }
        if (this.f29842E && this.f29843F && B0(menuItem)) {
            return true;
        }
        return this.f29886v.H(menuItem);
    }

    public final boolean c0() {
        if (!this.f29843F) {
            return false;
        }
        y yVar = this.f29884t;
        return yVar == null || yVar.I0(this.f29887w);
    }

    public void c1(Menu menu) {
        if (this.f29838A) {
            return;
        }
        if (this.f29842E && this.f29843F) {
            C0(menu);
        }
        this.f29886v.I(menu);
    }

    public boolean d0() {
        g gVar = this.f29849X;
        if (gVar == null) {
            return false;
        }
        return gVar.f29919v;
    }

    public void d1() {
        this.f29886v.K();
        if (this.f29846I != null) {
            this.f29863f0.a(AbstractC1726i.a.ON_PAUSE);
        }
        this.f29861e0.i(AbstractC1726i.a.ON_PAUSE);
        this.f29852a = 6;
        this.f29844G = false;
        D0();
        if (this.f29844G) {
            return;
        }
        throw new O("Fragment " + this + " did not call through to super.onPause()");
    }

    public void e(boolean z8) {
        ViewGroup viewGroup;
        y yVar;
        g gVar = this.f29849X;
        if (gVar != null) {
            gVar.f29919v = false;
        }
        if (this.f29846I == null || (viewGroup = this.f29845H) == null || (yVar = this.f29884t) == null) {
            return;
        }
        M mN = M.n(viewGroup, yVar);
        mN.p();
        if (z8) {
            this.f29885u.r().post(new d(mN));
        } else {
            mN.g();
        }
    }

    public final boolean e0() {
        return this.f29876m;
    }

    public void e1(boolean z8) {
        E0(z8);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.lifecycle.InterfaceC1724g
    public P.c f() {
        Application application;
        if (this.f29884t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f29867h0 == null) {
            Context applicationContext = o1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && y.E0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + o1().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f29867h0 = new L(application, this, r());
        }
        return this.f29867h0;
    }

    public final boolean f0() {
        y yVar = this.f29884t;
        if (yVar == null) {
            return false;
        }
        return yVar.L0();
    }

    public boolean f1(Menu menu) {
        boolean z8 = false;
        if (this.f29838A) {
            return false;
        }
        if (this.f29842E && this.f29843F) {
            F0(menu);
            z8 = true;
        }
        return this.f29886v.M(menu) | z8;
    }

    @Override // androidx.lifecycle.InterfaceC1724g
    public p153r2.a g() {
        Application application;
        Context applicationContext = o1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && y.E0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + o1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        p153r2.b bVar = new p153r2.b();
        if (application != null) {
            bVar.c(P.a.f15249h, application);
        }
        bVar.c(I.f15227a, this);
        bVar.c(I.f15228b, this);
        if (r() != null) {
            bVar.c(I.f15229c, r());
        }
        return bVar;
    }

    public void g0() {
        this.f29886v.O0();
    }

    public void g1() {
        boolean zJ0 = this.f29884t.J0(this);
        Boolean bool = this.f29872k;
        if (bool == null || bool.booleanValue() != zJ0) {
            this.f29872k = Boolean.valueOf(zJ0);
            G0(zJ0);
            this.f29886v.N();
        }
    }

    public AbstractC2688m h() {
        return new e();
    }

    public void h0(Bundle bundle) {
        this.f29844G = true;
    }

    public void h1() {
        this.f29886v.O0();
        this.f29886v.Y(true);
        this.f29852a = 7;
        this.f29844G = false;
        I0();
        if (!this.f29844G) {
            throw new O("Fragment " + this + " did not call through to super.onResume()");
        }
        r rVar = this.f29861e0;
        AbstractC1726i.a aVar = AbstractC1726i.a.ON_RESUME;
        rVar.i(aVar);
        if (this.f29846I != null) {
            this.f29863f0.a(aVar);
        }
        this.f29886v.O();
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void i0(int i8, int i9, Intent intent) {
        if (y.E0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i8 + " resultCode: " + i9 + " data: " + intent);
        }
    }

    public void i1(Bundle bundle) {
        J0(bundle);
        this.f29869i0.e(bundle);
        Bundle bundleB1 = this.f29886v.b1();
        if (bundleB1 != null) {
            bundle.putParcelable("android:support:fragments", bundleB1);
        }
    }

    public final g j() {
        if (this.f29849X == null) {
            this.f29849X = new g();
        }
        return this.f29849X;
    }

    public void j0(Activity activity) {
        this.f29844G = true;
    }

    public void j1() {
        this.f29886v.O0();
        this.f29886v.Y(true);
        this.f29852a = 5;
        this.f29844G = false;
        K0();
        if (!this.f29844G) {
            throw new O("Fragment " + this + " did not call through to super.onStart()");
        }
        r rVar = this.f29861e0;
        AbstractC1726i.a aVar = AbstractC1726i.a.ON_START;
        rVar.i(aVar);
        if (this.f29846I != null) {
            this.f29863f0.a(aVar);
        }
        this.f29886v.P();
    }

    @Override // androidx.lifecycle.S
    public Q k() {
        if (this.f29884t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (E() != AbstractC1726i.b.INITIALIZED.ordinal()) {
            return this.f29884t.z0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public void k0(Context context) {
        this.f29844G = true;
        q qVar = this.f29885u;
        Activity activityJ = qVar == null ? null : qVar.j();
        if (activityJ != null) {
            this.f29844G = false;
            j0(activityJ);
        }
    }

    public void k1() {
        this.f29886v.R();
        if (this.f29846I != null) {
            this.f29863f0.a(AbstractC1726i.a.ON_STOP);
        }
        this.f29861e0.i(AbstractC1726i.a.ON_STOP);
        this.f29852a = 4;
        this.f29844G = false;
        L0();
        if (this.f29844G) {
            return;
        }
        throw new O("Fragment " + this + " did not call through to super.onStop()");
    }

    @Override // p217z2.f
    public final p217z2.d l() {
        return this.f29869i0.b();
    }

    public void l0(ComponentCallbacksC2681f componentCallbacksC2681f) {
    }

    public void l1() {
        M0(this.f29846I, this.f29854b);
        this.f29886v.S();
    }

    public ComponentCallbacksC2681f m(String str) {
        return str.equals(this.f29862f) ? this : this.f29886v.g0(str);
    }

    public boolean m0(MenuItem menuItem) {
        return false;
    }

    public final void m1(j jVar) {
        if (this.f29852a >= 0) {
            jVar.a();
        } else {
            this.f29875l0.add(jVar);
        }
    }

    public final ActivityC2686k n() {
        q qVar = this.f29885u;
        if (qVar == null) {
            return null;
        }
        return (ActivityC2686k) qVar.j();
    }

    public void n0(Bundle bundle) {
        this.f29844G = true;
        q1(bundle);
        if (this.f29886v.K0(1)) {
            return;
        }
        this.f29886v.z();
    }

    public final ActivityC2686k n1() {
        ActivityC2686k activityC2686kN = n();
        if (activityC2686kN != null) {
            return activityC2686kN;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public boolean o() {
        Boolean bool;
        g gVar = this.f29849X;
        if (gVar == null || (bool = gVar.f29914q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public Animation o0(int i8, boolean z8, int i9) {
        return null;
    }

    public final Context o1() {
        Context contextT = t();
        if (contextT != null) {
            return contextT;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f29844G = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        n1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f29844G = true;
    }

    public boolean p() {
        Boolean bool;
        g gVar = this.f29849X;
        if (gVar == null || (bool = gVar.f29913p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public Animator p0(int i8, boolean z8, int i9) {
        return null;
    }

    public final View p1() {
        View viewU = U();
        if (viewU != null) {
            return viewU;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public View q() {
        g gVar = this.f29849X;
        if (gVar == null) {
            return null;
        }
        return gVar.f29898a;
    }

    public void q0(Menu menu, MenuInflater menuInflater) {
    }

    public void q1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f29886v.Z0(parcelable);
        this.f29886v.z();
    }

    public final Bundle r() {
        return this.f29864g;
    }

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i8 = this.f29871j0;
        if (i8 != 0) {
            return layoutInflater.inflate(i8, viewGroup, false);
        }
        return null;
    }

    public final void r1() {
        if (y.E0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f29846I != null) {
            s1(this.f29854b);
        }
        this.f29854b = null;
    }

    public final y s() {
        if (this.f29885u != null) {
            return this.f29886v;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void s0() {
        this.f29844G = true;
    }

    public final void s1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f29856c;
        if (sparseArray != null) {
            this.f29846I.restoreHierarchyState(sparseArray);
            this.f29856c = null;
        }
        if (this.f29846I != null) {
            this.f29863f0.e(this.f29858d);
            this.f29858d = null;
        }
        this.f29844G = false;
        N0(bundle);
        if (this.f29844G) {
            if (this.f29846I != null) {
                this.f29863f0.a(AbstractC1726i.a.ON_CREATE);
            }
        } else {
            throw new O("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void startActivityForResult(Intent intent, int i8) {
        A1(intent, i8, null);
    }

    public Context t() {
        q qVar = this.f29885u;
        if (qVar == null) {
            return null;
        }
        return qVar.o();
    }

    public void t0() {
    }

    public void t1(int i8, int i9, int i10, int i11) {
        if (this.f29849X == null && i8 == 0 && i9 == 0 && i10 == 0 && i11 == 0) {
            return;
        }
        j().f29900c = i8;
        j().f29901d = i9;
        j().f29902e = i10;
        j().f29903f = i11;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f29862f);
        if (this.f29888x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f29888x));
        }
        if (this.f29890z != null) {
            sb.append(" tag=");
            sb.append(this.f29890z);
        }
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        g gVar = this.f29849X;
        if (gVar == null) {
            return 0;
        }
        return gVar.f29900c;
    }

    public void u0() {
        this.f29844G = true;
    }

    public void u1(Bundle bundle) {
        if (this.f29884t != null && f0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f29864g = bundle;
    }

    public Object v() {
        g gVar = this.f29849X;
        if (gVar == null) {
            return null;
        }
        return gVar.f29907j;
    }

    public void v0() {
        this.f29844G = true;
    }

    public void v1(View view) {
        j().f29918u = view;
    }

    @Override // androidx.lifecycle.InterfaceC1733p
    public AbstractC1726i w() {
        return this.f29861e0;
    }

    public LayoutInflater w0(Bundle bundle) {
        return D(bundle);
    }

    public void w1(int i8) {
        if (this.f29849X == null && i8 == 0) {
            return;
        }
        j();
        this.f29849X.f29904g = i8;
    }

    public s x() {
        g gVar = this.f29849X;
        if (gVar == null) {
            return null;
        }
        return gVar.f29915r;
    }

    public void x0(boolean z8) {
    }

    public void x1(boolean z8) {
        if (this.f29849X == null) {
            return;
        }
        j().f29899b = z8;
    }

    public int y() {
        g gVar = this.f29849X;
        if (gVar == null) {
            return 0;
        }
        return gVar.f29901d;
    }

    public void y0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f29844G = true;
    }

    public void y1(float f8) {
        j().f29917t = f8;
    }

    public Object z() {
        g gVar = this.f29849X;
        if (gVar == null) {
            return null;
        }
        return gVar.f29909l;
    }

    public void z0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f29844G = true;
        q qVar = this.f29885u;
        Activity activityJ = qVar == null ? null : qVar.j();
        if (activityJ != null) {
            this.f29844G = false;
            y0(activityJ, attributeSet, bundle);
        }
    }

    public void z1(ArrayList arrayList, ArrayList arrayList2) {
        j();
        g gVar = this.f29849X;
        gVar.f29905h = arrayList;
        gVar.f29906i = arrayList2;
    }

    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f29888x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f29889y));
        printWriter.print(" mTag=");
        printWriter.println(this.f29890z);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f29852a);
        printWriter.print(" mWho=");
        printWriter.print(this.f29862f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f29883s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f29874l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f29876m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f29879o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f29880p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f29838A);
        printWriter.print(toqHM.BATXISSGbumwaM);
        printWriter.print(this.f29839B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f29843F);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f29842E);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f29840C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f29848W);
        if (this.f29884t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f29884t);
        }
        if (this.f29885u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f29885u);
        }
        if (this.f29887w != null) {
            printWriter.print(str);
            printWriter.print(ZWZaxQrCHfNe.CYorpax);
            printWriter.println(this.f29887w);
        }
        if (this.f29864g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f29864g);
        }
        if (this.f29854b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f29854b);
        }
        if (this.f29856c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f29856c);
        }
        if (this.f29858d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f29858d);
        }
        ComponentCallbacksC2681f componentCallbacksC2681fT = T(false);
        if (componentCallbacksC2681fT != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(componentCallbacksC2681fT);
            printWriter.print(ZWZaxQrCHfNe.NbgyeIHRxIvNOuQ);
            printWriter.println(this.f29870j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(I());
        if (u() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(u());
        }
        if (y() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(y());
        }
        if (J() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(J());
        }
        if (K() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(K());
        }
        if (this.f29845H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f29845H);
        }
        if (this.f29846I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f29846I);
        }
        if (q() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(q());
        }
        if (t() != null) {
            p177u2.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f29886v + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        this.f29886v.U(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public ComponentCallbacksC2681f(int i8) {
        this();
        this.f29871j0 = i8;
    }
}
