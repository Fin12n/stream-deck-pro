package p111m2;

import H1.g;
import H1.n;
import H1.o;
import H1.q;
import M6.eLZq.eGwOBWCdOTaKus;
import U1.InterfaceC1654p;
import U1.InterfaceC1656s;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.InterfaceC1733p;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.startup.TrZh.ZWZaxQrCHfNe;
import com.revenuecat.purchases.common.Constants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p009b.B;
import p009b.C;
import p009b.F;
import p027d.LrLN.vHKCAgr;
import p063h.s;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static boolean f29959S;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public p036e.c f29963D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public p036e.c f29964E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public p036e.c f29965F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f29967H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f29968I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f29969J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f29970K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f29971L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ArrayList f29972M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ArrayList f29973N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ArrayList f29974O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public B f29975P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public p120n2.c.C0656c f29976Q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29979b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f29981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f29982e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C f29984g;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f29990m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public q f29999v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AbstractC2688m f30000w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ComponentCallbacksC2681f f30001x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ComponentCallbacksC2681f f30002y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f29978a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F f29980c = new F();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f29983f = new r(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final B f29985h = new b(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f29986i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f29987j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f29988k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f29989l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s f29991n = new s(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f29992o = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final T1.a f29993p = new T1.a() { // from class: m2.t
        @Override // T1.a
        public final void accept(Object obj) {
            y.e(this.f29954a, (Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final T1.a f29994q = new T1.a() { // from class: m2.u
        @Override // T1.a
        public final void accept(Object obj) {
            y.a(this.f29955a, (Integer) obj);
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final T1.a f29995r = new T1.a() { // from class: m2.v
        @Override // T1.a
        public final void accept(Object obj) {
            y.d(this.f29956a, (g) obj);
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final T1.a f29996s = new T1.a() { // from class: m2.w
        @Override // T1.a
        public final void accept(Object obj) {
            y.c(this.f29957a, (q) obj);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InterfaceC1656s f29997t = new c();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f29998u = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p f30003z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public p f29960A = new d();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public N f29961B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public N f29962C = new e();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ArrayDeque f29966G = new ArrayDeque();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Runnable f29977R = new f();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements p036e.b {
        public a() {
        }

        @Override // p036e.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                iArr[i8] = ((Boolean) arrayList.get(i8)).booleanValue() ? 0 : -1;
            }
            k kVar = (k) y.this.f29966G.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = kVar.f30014a;
            int i9 = kVar.f30015b;
            ComponentCallbacksC2681f componentCallbacksC2681fI = y.this.f29980c.i(str);
            if (componentCallbacksC2681fI != null) {
                componentCallbacksC2681fI.H0(i9, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b extends B {
        public b(boolean z8) {
            super(z8);
        }

        @Override // p009b.B
        public void d() {
            y.this.A0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c implements InterfaceC1656s {
        public c() {
        }

        @Override // U1.InterfaceC1656s
        public boolean a(MenuItem menuItem) {
            return y.this.H(menuItem);
        }

        @Override // U1.InterfaceC1656s
        public void b(Menu menu) {
            y.this.I(menu);
        }

        @Override // U1.InterfaceC1656s
        public void c(Menu menu, MenuInflater menuInflater) {
            y.this.A(menu, menuInflater);
        }

        @Override // U1.InterfaceC1656s
        public void d(Menu menu) {
            y.this.M(menu);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d extends p {
        public d() {
        }

        @Override // p111m2.p
        public ComponentCallbacksC2681f a(ClassLoader classLoader, String str) {
            return y.this.r0().e(y.this.r0().o(), str, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class e implements N {
        public e() {
        }

        @Override // p111m2.N
        public M a(ViewGroup viewGroup) {
            return new C2679d(viewGroup);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.Y(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class g implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacksC2681f f30010a;

        public g(ComponentCallbacksC2681f componentCallbacksC2681f) {
            this.f30010a = componentCallbacksC2681f;
        }

        @Override // p111m2.C
        public void a(y yVar, ComponentCallbacksC2681f componentCallbacksC2681f) {
            this.f30010a.l0(componentCallbacksC2681f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class h implements p036e.b {
        public h() {
        }

        @Override // p036e.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p036e.a aVar) {
            k kVar = (k) y.this.f29966G.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = kVar.f30014a;
            int i8 = kVar.f30015b;
            ComponentCallbacksC2681f componentCallbacksC2681fI = y.this.f29980c.i(str);
            if (componentCallbacksC2681fI != null) {
                componentCallbacksC2681fI.i0(i8, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class i implements p036e.b {
        public i() {
        }

        @Override // p036e.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p036e.a aVar) {
            k kVar = (k) y.this.f29966G.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", vHKCAgr.xYufz + this);
                return;
            }
            String str = kVar.f30014a;
            int i8 = kVar.f30015b;
            ComponentCallbacksC2681f componentCallbacksC2681fI = y.this.f29980c.i(str);
            if (componentCallbacksC2681fI != null) {
                componentCallbacksC2681fI.i0(i8, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class j extends p045f.a {
        @Override // p045f.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, p036e.g gVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentA = gVar.a();
            if (intentA != null && (bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentA.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    gVar = new e.g.a(gVar.d()).b(null).c(gVar.c(), gVar.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gVar);
            if (y.E0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // p045f.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public p036e.a c(int i8, Intent intent) {
            return new p036e.a(i8, intent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface l {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class m implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f30016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f30017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f30018c;

        public m(String str, int i8, int i9) {
            this.f30016a = str;
            this.f30017b = i8;
            this.f30018c = i9;
        }

        @Override // m2.y.l
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            ComponentCallbacksC2681f componentCallbacksC2681f = y.this.f30002y;
            if (componentCallbacksC2681f == null || this.f30017b >= 0 || this.f30016a != null || !componentCallbacksC2681f.s().S0()) {
                return y.this.V0(arrayList, arrayList2, this.f30016a, this.f30017b, this.f30018c);
            }
            return false;
        }
    }

    public static boolean E0(int i8) {
        return f29959S || Log.isLoggable("FragmentManager", i8);
    }

    public static /* synthetic */ void a(y yVar, Integer num) {
        if (yVar.G0() && num.intValue() == 80) {
            yVar.D(false);
        }
    }

    public static void a0(ArrayList arrayList, ArrayList arrayList2, int i8, int i9) {
        while (i8 < i9) {
            C2676a c2676a = (C2676a) arrayList.get(i8);
            if (((Boolean) arrayList2.get(i8)).booleanValue()) {
                c2676a.n(-1);
                c2676a.s();
            } else {
                c2676a.n(1);
                c2676a.r();
            }
            i8++;
        }
    }

    public static int a1(int i8) {
        if (i8 == 4097) {
            return 8194;
        }
        if (i8 == 8194) {
            return 4097;
        }
        if (i8 == 8197) {
            return 4100;
        }
        if (i8 != 4099) {
            return i8 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    public static /* synthetic */ void c(y yVar, q qVar) {
        if (yVar.G0()) {
            yVar.L(qVar.a(), false);
        }
    }

    public static /* synthetic */ void d(y yVar, H1.g gVar) {
        if (yVar.G0()) {
            yVar.E(gVar.a(), false);
        }
    }

    public static /* synthetic */ void e(y yVar, Configuration configuration) {
        if (yVar.G0()) {
            yVar.x(configuration, false);
        }
    }

    public static ComponentCallbacksC2681f i0(View view) {
        while (view != null) {
            ComponentCallbacksC2681f componentCallbacksC2681fY0 = y0(view);
            if (componentCallbacksC2681fY0 != null) {
                return componentCallbacksC2681fY0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static ComponentCallbacksC2681f y0(View view) {
        Object tag = view.getTag(p102l2.b.f29136a);
        if (tag instanceof ComponentCallbacksC2681f) {
            return (ComponentCallbacksC2681f) tag;
        }
        return null;
    }

    public boolean A(Menu menu, MenuInflater menuInflater) {
        if (this.f29998u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z8 = false;
        for (ComponentCallbacksC2681f componentCallbacksC2681f : this.f29980c.o()) {
            if (componentCallbacksC2681f != null && I0(componentCallbacksC2681f) && componentCallbacksC2681f.T0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(componentCallbacksC2681f);
                z8 = true;
            }
        }
        if (this.f29982e != null) {
            for (int i8 = 0; i8 < this.f29982e.size(); i8++) {
                ComponentCallbacksC2681f componentCallbacksC2681f2 = (ComponentCallbacksC2681f) this.f29982e.get(i8);
                if (arrayList == null || !arrayList.contains(componentCallbacksC2681f2)) {
                    componentCallbacksC2681f2.t0();
                }
            }
        }
        this.f29982e = arrayList;
        return z8;
    }

    public void A0() {
        Y(true);
        if (this.f29985h.g()) {
            S0();
        } else {
            this.f29984g.l();
        }
    }

    public void B() {
        this.f29970K = true;
        Y(true);
        V();
        q();
        Q(-1);
        Object obj = this.f29999v;
        if (obj instanceof I1.d) {
            ((I1.d) obj).c(this.f29994q);
        }
        Object obj2 = this.f29999v;
        if (obj2 instanceof I1.c) {
            ((I1.c) obj2).t(this.f29993p);
        }
        Object obj3 = this.f29999v;
        if (obj3 instanceof n) {
            ((n) obj3).n(this.f29995r);
        }
        Object obj4 = this.f29999v;
        if (obj4 instanceof o) {
            ((o) obj4).u(this.f29996s);
        }
        Object obj5 = this.f29999v;
        if (obj5 instanceof InterfaceC1654p) {
            ((InterfaceC1654p) obj5).s(this.f29997t);
        }
        this.f29999v = null;
        this.f30000w = null;
        this.f30001x = null;
        if (this.f29984g != null) {
            this.f29985h.h();
            this.f29984g = null;
        }
        p036e.c cVar = this.f29963D;
        if (cVar != null) {
            cVar.c();
            this.f29964E.c();
            this.f29965F.c();
        }
    }

    public void B0(ComponentCallbacksC2681f componentCallbacksC2681f) {
        if (E0(2)) {
            Log.v("FragmentManager", "hide: " + componentCallbacksC2681f);
        }
        if (componentCallbacksC2681f.f29838A) {
            return;
        }
        componentCallbacksC2681f.f29838A = true;
        componentCallbacksC2681f.f29851Z = true ^ componentCallbacksC2681f.f29851Z;
        g1(componentCallbacksC2681f);
    }

    public void C() {
        Q(1);
    }

    public void C0(ComponentCallbacksC2681f componentCallbacksC2681f) {
        if (componentCallbacksC2681f.f29874l && F0(componentCallbacksC2681f)) {
            this.f29967H = true;
        }
    }

    public void D(boolean z8) {
        if (z8 && (this.f29999v instanceof I1.d)) {
            j1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (ComponentCallbacksC2681f componentCallbacksC2681f : this.f29980c.o()) {
            if (componentCallbacksC2681f != null) {
                componentCallbacksC2681f.Z0();
                if (z8) {
                    componentCallbacksC2681f.f29886v.D(true);
                }
            }
        }
    }

    public boolean D0() {
        return this.f29970K;
    }

    public void E(boolean z8, boolean z9) {
        if (z9 && (this.f29999v instanceof n)) {
            j1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (ComponentCallbacksC2681f componentCallbacksC2681f : this.f29980c.o()) {
            if (componentCallbacksC2681f != null) {
                componentCallbacksC2681f.a1(z8);
                if (z9) {
                    componentCallbacksC2681f.f29886v.E(z8, true);
                }
            }
        }
    }

    public void F(ComponentCallbacksC2681f componentCallbacksC2681f) {
        Iterator it = this.f29992o.iterator();
        while (it.hasNext()) {
            ((C) it.next()).a(this, componentCallbacksC2681f);
        }
    }

    public final boolean F0(ComponentCallbacksC2681f componentCallbacksC2681f) {
        return (componentCallbacksC2681f.f29842E && componentCallbacksC2681f.f29843F) || componentCallbacksC2681f.f29886v.n();
    }

    public void G() {
        for (ComponentCallbacksC2681f componentCallbacksC2681f : this.f29980c.l()) {
            if (componentCallbacksC2681f != null) {
                componentCallbacksC2681f.x0(componentCallbacksC2681f.a0());
                componentCallbacksC2681f.f29886v.G();
            }
        }
    }

    public final boolean G0() {
        ComponentCallbacksC2681f componentCallbacksC2681f = this.f30001x;
        if (componentCallbacksC2681f == null) {
            return true;
        }
        return componentCallbacksC2681f.Z() && this.f30001x.H().G0();
    }

    public boolean H(MenuItem menuItem) {
        if (this.f29998u < 1) {
            return false;
        }
        for (ComponentCallbacksC2681f componentCallbacksC2681f : this.f29980c.o()) {
            if (componentCallbacksC2681f != null && componentCallbacksC2681f.b1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean H0(ComponentCallbacksC2681f componentCallbacksC2681f) {
        if (componentCallbacksC2681f == null) {
            return false;
        }
        return componentCallbacksC2681f.a0();
    }

    public void I(Menu menu) {
        if (this.f29998u < 1) {
            return;
        }
        for (ComponentCallbacksC2681f componentCallbacksC2681f : this.f29980c.o()) {
            if (componentCallbacksC2681f != null) {
                componentCallbacksC2681f.c1(menu);
            }
        }
    }

    public boolean I0(ComponentCallbacksC2681f componentCallbacksC2681f) {
        if (componentCallbacksC2681f == null) {
            return true;
        }
        return componentCallbacksC2681f.c0();
    }

    public final void J(ComponentCallbacksC2681f componentCallbacksC2681f) {
        if (componentCallbacksC2681f == null || !componentCallbacksC2681f.equals(c0(componentCallbacksC2681f.f29862f))) {
            return;
        }
        componentCallbacksC2681f.g1();
    }

    public boolean J0(ComponentCallbacksC2681f componentCallbacksC2681f) {
        if (componentCallbacksC2681f == null) {
            return true;
        }
        y yVar = componentCallbacksC2681f.f29884t;
        return componentCallbacksC2681f.equals(yVar.v0()) && J0(yVar.f30001x);
    }

    public void K() {
        Q(5);
    }

    public boolean K0(int i8) {
        return this.f29998u >= i8;
    }

    public void L(boolean z8, boolean z9) {
        if (z9 && (this.f29999v instanceof o)) {
            j1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (ComponentCallbacksC2681f componentCallbacksC2681f : this.f29980c.o()) {
            if (componentCallbacksC2681f != null) {
                componentCallbacksC2681f.e1(z8);
                if (z9) {
                    componentCallbacksC2681f.f29886v.L(z8, true);
                }
            }
        }
    }

    public boolean L0() {
        return this.f29968I || this.f29969J;
    }

    public boolean M(Menu menu) {
        boolean z8 = false;
        if (this.f29998u < 1) {
            return false;
        }
        for (ComponentCallbacksC2681f componentCallbacksC2681f : this.f29980c.o()) {
            if (componentCallbacksC2681f != null && I0(componentCallbacksC2681f) && componentCallbacksC2681f.f1(menu)) {
                z8 = true;
            }
        }
        return z8;
    }

    public void M0(ComponentCallbacksC2681f componentCallbacksC2681f, Intent intent, int i8, Bundle bundle) {
        if (this.f29963D == null) {
            this.f29999v.z(componentCallbacksC2681f, intent, i8, bundle);
            return;
        }
        this.f29966G.addLast(new k(componentCallbacksC2681f.f29862f, i8));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f29963D.a(intent);
    }

    public void N() {
        k1();
        J(this.f30002y);
    }

    public void N0(int i8, boolean z8) {
        q qVar;
        if (this.f29999v == null && i8 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z8 || i8 != this.f29998u) {
            this.f29998u = i8;
            this.f29980c.t();
            i1();
            if (this.f29967H && (qVar = this.f29999v) != null && this.f29998u == 7) {
                qVar.A();
                this.f29967H = false;
            }
        }
    }

    public void O() {
        this.f29968I = false;
        this.f29969J = false;
        this.f29975P.p(false);
        Q(7);
    }

    public void O0() {
        if (this.f29999v == null) {
            return;
        }
        this.f29968I = false;
        this.f29969J = false;
        this.f29975P.p(false);
        for (ComponentCallbacksC2681f componentCallbacksC2681f : this.f29980c.o()) {
            if (componentCallbacksC2681f != null) {
                componentCallbacksC2681f.g0();
            }
        }
    }

    public void P() {
        this.f29968I = false;
        this.f29969J = false;
        this.f29975P.p(false);
        Q(5);
    }

    public void P0(C2689n c2689n) {
        View view;
        for (E e8 : this.f29980c.k()) {
            ComponentCallbacksC2681f componentCallbacksC2681fK = e8.k();
            if (componentCallbacksC2681fK.f29889y == c2689n.getId() && (view = componentCallbacksC2681fK.f29846I) != null && view.getParent() == null) {
                componentCallbacksC2681fK.f29845H = c2689n;
                e8.b();
            }
        }
    }

    public final void Q(int i8) {
        try {
            this.f29979b = true;
            this.f29980c.d(i8);
            N0(i8, false);
            Iterator it = r().iterator();
            while (it.hasNext()) {
                ((M) it.next()).j();
            }
            this.f29979b = false;
            Y(true);
        } catch (Throwable th) {
            this.f29979b = false;
            throw th;
        }
    }

    public void Q0(E e8) {
        ComponentCallbacksC2681f componentCallbacksC2681fK = e8.k();
        if (componentCallbacksC2681fK.f29847V) {
            if (this.f29979b) {
                this.f29971L = true;
            } else {
                componentCallbacksC2681fK.f29847V = false;
                e8.m();
            }
        }
    }

    public void R() {
        this.f29969J = true;
        this.f29975P.p(true);
        Q(4);
    }

    public void R0(int i8, int i9, boolean z8) {
        if (i8 >= 0) {
            W(new m(null, i8, i9), z8);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i8);
    }

    public void S() {
        Q(2);
    }

    public boolean S0() {
        return U0(null, -1, 0);
    }

    public final void T() {
        if (this.f29971L) {
            this.f29971L = false;
            i1();
        }
    }

    public boolean T0(int i8, int i9) {
        if (i8 >= 0) {
            return U0(null, i8, i9);
        }
        throw new IllegalArgumentException("Bad id: " + i8);
    }

    public final boolean U0(String str, int i8, int i9) {
        Y(false);
        X(true);
        ComponentCallbacksC2681f componentCallbacksC2681f = this.f30002y;
        if (componentCallbacksC2681f != null && i8 < 0 && str == null && componentCallbacksC2681f.s().S0()) {
            return true;
        }
        boolean zV0 = V0(this.f29972M, this.f29973N, str, i8, i9);
        if (zV0) {
            this.f29979b = true;
            try {
                X0(this.f29972M, this.f29973N);
                p();
            } catch (Throwable th) {
                p();
                throw th;
            }
        }
        k1();
        T();
        this.f29980c.b();
        return zV0;
    }

    public final void V() {
        Iterator it = r().iterator();
        while (it.hasNext()) {
            ((M) it.next()).j();
        }
    }

    public boolean V0(ArrayList arrayList, ArrayList arrayList2, String str, int i8, int i9) {
        int iD0 = d0(str, i8, (i9 & 1) != 0);
        if (iD0 < 0) {
            return false;
        }
        for (int size = this.f29981d.size() - 1; size >= iD0; size--) {
            arrayList.add((C2676a) this.f29981d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public void W(l lVar, boolean z8) {
        if (!z8) {
            if (this.f29999v == null) {
                if (!this.f29970K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            o();
        }
        synchronized (this.f29978a) {
            try {
                if (this.f29999v == null) {
                    if (!z8) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f29978a.add(lVar);
                    c1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void W0(ComponentCallbacksC2681f componentCallbacksC2681f) {
        if (E0(2)) {
            Log.v("FragmentManager", "remove: " + componentCallbacksC2681f + " nesting=" + componentCallbacksC2681f.f29883s);
        }
        boolean zB0 = componentCallbacksC2681f.b0();
        if (componentCallbacksC2681f.f29839B && zB0) {
            return;
        }
        this.f29980c.u(componentCallbacksC2681f);
        if (F0(componentCallbacksC2681f)) {
            this.f29967H = true;
        }
        componentCallbacksC2681f.f29876m = true;
        g1(componentCallbacksC2681f);
    }

    public final void X(boolean z8) {
        if (this.f29979b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f29999v == null) {
            if (!this.f29970K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f29999v.r().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z8) {
            o();
        }
        if (this.f29972M == null) {
            this.f29972M = new ArrayList();
            this.f29973N = new ArrayList();
        }
    }

    public final void X0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        while (i8 < size) {
            if (!((C2676a) arrayList.get(i8)).f29678r) {
                if (i9 != i8) {
                    b0(arrayList, arrayList2, i9, i8);
                }
                i9 = i8 + 1;
                if (((Boolean) arrayList2.get(i8)).booleanValue()) {
                    while (i9 < size && ((Boolean) arrayList2.get(i9)).booleanValue() && !((C2676a) arrayList.get(i9)).f29678r) {
                        i9++;
                    }
                }
                b0(arrayList, arrayList2, i8, i9);
                i8 = i9 - 1;
            }
            i8++;
        }
        if (i9 != size) {
            b0(arrayList, arrayList2, i9, size);
        }
    }

    public boolean Y(boolean z8) {
        X(z8);
        boolean z9 = false;
        while (k0(this.f29972M, this.f29973N)) {
            z9 = true;
            this.f29979b = true;
            try {
                X0(this.f29972M, this.f29973N);
                p();
            } catch (Throwable th) {
                p();
                throw th;
            }
        }
        k1();
        T();
        this.f29980c.b();
        return z9;
    }

    public final void Y0() {
        ArrayList arrayList = this.f29990m;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        s.a(this.f29990m.get(0));
        throw null;
    }

    public void Z(l lVar, boolean z8) {
        if (z8 && (this.f29999v == null || this.f29970K)) {
            return;
        }
        X(z8);
        if (lVar.a(this.f29972M, this.f29973N)) {
            this.f29979b = true;
            try {
                X0(this.f29972M, this.f29973N);
                p();
            } catch (Throwable th) {
                p();
                throw th;
            }
        }
        k1();
        T();
        this.f29980c.b();
    }

    public void Z0(Parcelable parcelable) {
        E e8;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f29999v.o().getClassLoader());
                this.f29988k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f29999v.o().getClassLoader());
                arrayList.add((D) bundle.getParcelable("state"));
            }
        }
        this.f29980c.x(arrayList);
        A a8 = (A) bundle3.getParcelable("state");
        if (a8 == null) {
            return;
        }
        this.f29980c.v();
        Iterator it = a8.f29620a.iterator();
        while (it.hasNext()) {
            D dB = this.f29980c.B((String) it.next(), null);
            if (dB != null) {
                ComponentCallbacksC2681f componentCallbacksC2681fI = this.f29975P.i(dB.f29637b);
                if (componentCallbacksC2681fI != null) {
                    if (E0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + componentCallbacksC2681fI);
                    }
                    e8 = new E(this.f29991n, this.f29980c, componentCallbacksC2681fI, dB);
                } else {
                    e8 = new E(this.f29991n, this.f29980c, this.f29999v.o().getClassLoader(), p0(), dB);
                }
                ComponentCallbacksC2681f componentCallbacksC2681fK = e8.k();
                componentCallbacksC2681fK.f29884t = this;
                if (E0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + componentCallbacksC2681fK.f29862f + "): " + componentCallbacksC2681fK);
                }
                e8.o(this.f29999v.o().getClassLoader());
                this.f29980c.r(e8);
                e8.t(this.f29998u);
            }
        }
        for (ComponentCallbacksC2681f componentCallbacksC2681f : this.f29975P.l()) {
            if (!this.f29980c.c(componentCallbacksC2681f.f29862f)) {
                if (E0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + componentCallbacksC2681f + " that was not found in the set of active Fragments " + a8.f29620a);
                }
                this.f29975P.o(componentCallbacksC2681f);
                componentCallbacksC2681f.f29884t = this;
                E e9 = new E(this.f29991n, this.f29980c, componentCallbacksC2681f);
                e9.t(1);
                e9.m();
                componentCallbacksC2681f.f29876m = true;
                e9.m();
            }
        }
        this.f29980c.w(a8.f29621b);
        if (a8.f29622c != null) {
            this.f29981d = new ArrayList(a8.f29622c.length);
            int i8 = 0;
            while (true) {
                C2677b[] c2677bArr = a8.f29622c;
                if (i8 >= c2677bArr.length) {
                    break;
                }
                C2676a c2676aB = c2677bArr[i8].b(this);
                if (E0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i8 + " (index " + c2676aB.f29751v + "): " + c2676aB);
                    PrintWriter printWriter = new PrintWriter(new L("FragmentManager"));
                    c2676aB.q("  ", printWriter, false);
                    printWriter.close();
                }
                this.f29981d.add(c2676aB);
                i8++;
            }
        } else {
            this.f29981d = null;
        }
        this.f29986i.set(a8.f29623d);
        String str3 = a8.f29624e;
        if (str3 != null) {
            ComponentCallbacksC2681f componentCallbacksC2681fC0 = c0(str3);
            this.f30002y = componentCallbacksC2681fC0;
            J(componentCallbacksC2681fC0);
        }
        ArrayList arrayList2 = a8.f29625f;
        if (arrayList2 != null) {
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                this.f29987j.put((String) arrayList2.get(i9), (C2678c) a8.f29626g.get(i9));
            }
        }
        this.f29966G = new ArrayDeque(a8.f29627h);
    }

    public final void b0(ArrayList arrayList, ArrayList arrayList2, int i8, int i9) {
        boolean z8 = ((C2676a) arrayList.get(i8)).f29678r;
        ArrayList arrayList3 = this.f29974O;
        if (arrayList3 == null) {
            this.f29974O = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f29974O.addAll(this.f29980c.o());
        ComponentCallbacksC2681f componentCallbacksC2681fV0 = v0();
        boolean z9 = false;
        for (int i10 = i8; i10 < i9; i10++) {
            C2676a c2676a = (C2676a) arrayList.get(i10);
            componentCallbacksC2681fV0 = !((Boolean) arrayList2.get(i10)).booleanValue() ? c2676a.t(this.f29974O, componentCallbacksC2681fV0) : c2676a.w(this.f29974O, componentCallbacksC2681fV0);
            z9 = z9 || c2676a.f29669i;
        }
        this.f29974O.clear();
        if (!z8 && this.f29998u >= 1) {
            for (int i11 = i8; i11 < i9; i11++) {
                Iterator it = ((C2676a) arrayList.get(i11)).f29663c.iterator();
                while (it.hasNext()) {
                    ComponentCallbacksC2681f componentCallbacksC2681f = ((G.a) it.next()).f29681b;
                    if (componentCallbacksC2681f != null && componentCallbacksC2681f.f29884t != null) {
                        this.f29980c.r(t(componentCallbacksC2681f));
                    }
                }
            }
        }
        a0(arrayList, arrayList2, i8, i9);
        boolean zBooleanValue = ((Boolean) arrayList2.get(i9 - 1)).booleanValue();
        for (int i12 = i8; i12 < i9; i12++) {
            C2676a c2676a2 = (C2676a) arrayList.get(i12);
            if (zBooleanValue) {
                for (int size = c2676a2.f29663c.size() - 1; size >= 0; size--) {
                    ComponentCallbacksC2681f componentCallbacksC2681f2 = ((G.a) c2676a2.f29663c.get(size)).f29681b;
                    if (componentCallbacksC2681f2 != null) {
                        t(componentCallbacksC2681f2).m();
                    }
                }
            } else {
                Iterator it2 = c2676a2.f29663c.iterator();
                while (it2.hasNext()) {
                    ComponentCallbacksC2681f componentCallbacksC2681f3 = ((G.a) it2.next()).f29681b;
                    if (componentCallbacksC2681f3 != null) {
                        t(componentCallbacksC2681f3).m();
                    }
                }
            }
        }
        N0(this.f29998u, true);
        for (M m8 : s(arrayList, i8, i9)) {
            m8.r(zBooleanValue);
            m8.p();
            m8.g();
        }
        while (i8 < i9) {
            C2676a c2676a3 = (C2676a) arrayList.get(i8);
            if (((Boolean) arrayList2.get(i8)).booleanValue() && c2676a3.f29751v >= 0) {
                c2676a3.f29751v = -1;
            }
            c2676a3.v();
            i8++;
        }
        if (z9) {
            Y0();
        }
    }

    public Bundle b1() {
        C2677b[] c2677bArr;
        int size;
        Bundle bundle = new Bundle();
        j0();
        V();
        Y(true);
        this.f29968I = true;
        this.f29975P.p(true);
        ArrayList arrayListY = this.f29980c.y();
        ArrayList<D> arrayListM = this.f29980c.m();
        if (!arrayListM.isEmpty()) {
            ArrayList arrayListZ = this.f29980c.z();
            ArrayList arrayList = this.f29981d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                c2677bArr = null;
            } else {
                c2677bArr = new C2677b[size];
                for (int i8 = 0; i8 < size; i8++) {
                    c2677bArr[i8] = new C2677b((C2676a) this.f29981d.get(i8));
                    if (E0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i8 + ": " + this.f29981d.get(i8));
                    }
                }
            }
            A a8 = new A();
            a8.f29620a = arrayListY;
            a8.f29621b = arrayListZ;
            a8.f29622c = c2677bArr;
            a8.f29623d = this.f29986i.get();
            ComponentCallbacksC2681f componentCallbacksC2681f = this.f30002y;
            if (componentCallbacksC2681f != null) {
                a8.f29624e = componentCallbacksC2681f.f29862f;
            }
            a8.f29625f.addAll(this.f29987j.keySet());
            a8.f29626g.addAll(this.f29987j.values());
            a8.f29627h = new ArrayList(this.f29966G);
            bundle.putParcelable("state", a8);
            for (String str : this.f29988k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f29988k.get(str));
            }
            for (D d8 : arrayListM) {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", d8);
                bundle.putBundle("fragment_" + d8.f29637b, bundle2);
            }
        } else if (E0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public ComponentCallbacksC2681f c0(String str) {
        return this.f29980c.f(str);
    }

    public void c1() {
        synchronized (this.f29978a) {
            try {
                if (this.f29978a.size() == 1) {
                    this.f29999v.r().removeCallbacks(this.f29977R);
                    this.f29999v.r().post(this.f29977R);
                    k1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int d0(String str, int i8, boolean z8) {
        ArrayList arrayList = this.f29981d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i8 < 0) {
            if (z8) {
                return 0;
            }
            return this.f29981d.size() - 1;
        }
        int size = this.f29981d.size() - 1;
        while (size >= 0) {
            C2676a c2676a = (C2676a) this.f29981d.get(size);
            if ((str != null && str.equals(c2676a.u())) || (i8 >= 0 && i8 == c2676a.f29751v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z8) {
            if (size == this.f29981d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C2676a c2676a2 = (C2676a) this.f29981d.get(size - 1);
            if ((str == null || !str.equals(c2676a2.u())) && (i8 < 0 || i8 != c2676a2.f29751v)) {
                break;
            }
            size--;
        }
        return size;
    }

    public void d1(ComponentCallbacksC2681f componentCallbacksC2681f, boolean z8) {
        ViewGroup viewGroupO0 = o0(componentCallbacksC2681f);
        if (viewGroupO0 == null || !(viewGroupO0 instanceof C2689n)) {
            return;
        }
        ((C2689n) viewGroupO0).setDrawDisappearingViewsLast(!z8);
    }

    public ComponentCallbacksC2681f e0(int i8) {
        return this.f29980c.g(i8);
    }

    public void e1(ComponentCallbacksC2681f componentCallbacksC2681f, AbstractC1726i.b bVar) {
        if (componentCallbacksC2681f.equals(c0(componentCallbacksC2681f.f29862f)) && (componentCallbacksC2681f.f29885u == null || componentCallbacksC2681f.f29884t == this)) {
            componentCallbacksC2681f.f29859d0 = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC2681f + " is not an active fragment of FragmentManager " + this);
    }

    public ComponentCallbacksC2681f f0(String str) {
        return this.f29980c.h(str);
    }

    public void f1(ComponentCallbacksC2681f componentCallbacksC2681f) {
        if (componentCallbacksC2681f == null || (componentCallbacksC2681f.equals(c0(componentCallbacksC2681f.f29862f)) && (componentCallbacksC2681f.f29885u == null || componentCallbacksC2681f.f29884t == this))) {
            ComponentCallbacksC2681f componentCallbacksC2681f2 = this.f30002y;
            this.f30002y = componentCallbacksC2681f;
            J(componentCallbacksC2681f2);
            J(this.f30002y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC2681f + " is not an active fragment of FragmentManager " + this);
    }

    public void g(C2676a c2676a) {
        if (this.f29981d == null) {
            this.f29981d = new ArrayList();
        }
        this.f29981d.add(c2676a);
    }

    public ComponentCallbacksC2681f g0(String str) {
        return this.f29980c.i(str);
    }

    public final void g1(ComponentCallbacksC2681f componentCallbacksC2681f) {
        ViewGroup viewGroupO0 = o0(componentCallbacksC2681f);
        if (viewGroupO0 == null || componentCallbacksC2681f.u() + componentCallbacksC2681f.y() + componentCallbacksC2681f.J() + componentCallbacksC2681f.K() <= 0) {
            return;
        }
        if (viewGroupO0.getTag(p102l2.b.f29138c) == null) {
            viewGroupO0.setTag(p102l2.b.f29138c, componentCallbacksC2681f);
        }
        ((ComponentCallbacksC2681f) viewGroupO0.getTag(p102l2.b.f29138c)).x1(componentCallbacksC2681f.I());
    }

    public E h(ComponentCallbacksC2681f componentCallbacksC2681f) {
        String str = componentCallbacksC2681f.f29857c0;
        if (str != null) {
            p120n2.c.f(componentCallbacksC2681f, str);
        }
        if (E0(2)) {
            Log.v("FragmentManager", "add: " + componentCallbacksC2681f);
        }
        E eT = t(componentCallbacksC2681f);
        componentCallbacksC2681f.f29884t = this;
        this.f29980c.r(eT);
        if (!componentCallbacksC2681f.f29839B) {
            this.f29980c.a(componentCallbacksC2681f);
            componentCallbacksC2681f.f29876m = false;
            if (componentCallbacksC2681f.f29846I == null) {
                componentCallbacksC2681f.f29851Z = false;
            }
            if (F0(componentCallbacksC2681f)) {
                this.f29967H = true;
            }
        }
        return eT;
    }

    public void h1(ComponentCallbacksC2681f componentCallbacksC2681f) {
        if (E0(2)) {
            Log.v("FragmentManager", "show: " + componentCallbacksC2681f);
        }
        if (componentCallbacksC2681f.f29838A) {
            componentCallbacksC2681f.f29838A = false;
            componentCallbacksC2681f.f29851Z = !componentCallbacksC2681f.f29851Z;
        }
    }

    public void i(C c8) {
        this.f29992o.add(c8);
    }

    public final void i1() {
        Iterator it = this.f29980c.k().iterator();
        while (it.hasNext()) {
            Q0((E) it.next());
        }
    }

    public int j() {
        return this.f29986i.getAndIncrement();
    }

    public final void j0() {
        Iterator it = r().iterator();
        while (it.hasNext()) {
            ((M) it.next()).k();
        }
    }

    public final void j1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new L("FragmentManager"));
        q qVar = this.f29999v;
        if (qVar != null) {
            try {
                qVar.v("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e8) {
                Log.e("FragmentManager", "Failed dumping state", e8);
                throw runtimeException;
            }
        }
        try {
            U("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e9) {
            Log.e("FragmentManager", "Failed dumping state", e9);
            throw runtimeException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void k(q qVar, AbstractC2688m abstractC2688m, ComponentCallbacksC2681f componentCallbacksC2681f) {
        String str;
        InterfaceC1733p interfaceC1733p;
        if (this.f29999v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f29999v = qVar;
        this.f30000w = abstractC2688m;
        this.f30001x = componentCallbacksC2681f;
        if (componentCallbacksC2681f != null) {
            i(new g(componentCallbacksC2681f));
        } else if (qVar instanceof C) {
            i((C) qVar);
        }
        if (this.f30001x != null) {
            k1();
        }
        if (qVar instanceof F) {
            F f8 = (F) qVar;
            C cB = f8.b();
            this.f29984g = cB;
            if (componentCallbacksC2681f != null) {
                interfaceC1733p = f8;
                interfaceC1733p = componentCallbacksC2681f;
            }
            interfaceC1733p = f8;
            cB.h(interfaceC1733p, this.f29985h);
        }
        if (componentCallbacksC2681f != null) {
            this.f29975P = componentCallbacksC2681f.f29884t.m0(componentCallbacksC2681f);
        } else if (qVar instanceof S) {
            this.f29975P = B.k(((S) qVar).k());
        } else {
            this.f29975P = new B(false);
        }
        this.f29975P.p(L0());
        this.f29980c.A(this.f29975P);
        Object obj = this.f29999v;
        if ((obj instanceof p217z2.f) && componentCallbacksC2681f == null) {
            p217z2.d dVarL = ((p217z2.f) obj).l();
            dVarL.h("android:support:fragments", new z2.d.c() { // from class: m2.x
                @Override // z2.d.c
                public final Bundle a() {
                    return this.f29958a.b1();
                }
            });
            Bundle bundleB = dVarL.b("android:support:fragments");
            if (bundleB != null) {
                Z0(bundleB);
            }
        }
        Object obj2 = this.f29999v;
        if (obj2 instanceof p036e.f) {
            p036e.e eVarI = ((p036e.f) obj2).i();
            if (componentCallbacksC2681f != null) {
                str = componentCallbacksC2681f.f29862f + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR;
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f29963D = eVarI.m(str2 + "StartActivityForResult", new p045f.f(), new h());
            this.f29964E = eVarI.m(str2 + "StartIntentSenderForResult", new j(), new i());
            this.f29965F = eVarI.m(str2 + "RequestPermissions", new p045f.d(), new a());
        }
        Object obj3 = this.f29999v;
        if (obj3 instanceof I1.c) {
            ((I1.c) obj3).h(this.f29993p);
        }
        Object obj4 = this.f29999v;
        if (obj4 instanceof I1.d) {
            ((I1.d) obj4).m(this.f29994q);
        }
        Object obj5 = this.f29999v;
        if (obj5 instanceof n) {
            ((n) obj5).q(this.f29995r);
        }
        Object obj6 = this.f29999v;
        if (obj6 instanceof o) {
            ((o) obj6).p(this.f29996s);
        }
        Object obj7 = this.f29999v;
        if ((obj7 instanceof InterfaceC1654p) && componentCallbacksC2681f == null) {
            ((InterfaceC1654p) obj7).d(this.f29997t);
        }
    }

    public final boolean k0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f29978a) {
            if (this.f29978a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f29978a.size();
                boolean zA = false;
                for (int i8 = 0; i8 < size; i8++) {
                    zA |= ((l) this.f29978a.get(i8)).a(arrayList, arrayList2);
                }
                this.f29978a.clear();
                this.f29999v.r().removeCallbacks(this.f29977R);
                return zA;
            } catch (Throwable th) {
                this.f29978a.clear();
                this.f29999v.r().removeCallbacks(this.f29977R);
                throw th;
            }
        }
    }

    public final void k1() {
        synchronized (this.f29978a) {
            try {
                if (this.f29978a.isEmpty()) {
                    this.f29985h.j(l0() > 0 && J0(this.f30001x));
                } else {
                    this.f29985h.j(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(ComponentCallbacksC2681f componentCallbacksC2681f) {
        if (E0(2)) {
            Log.v("FragmentManager", "attach: " + componentCallbacksC2681f);
        }
        if (componentCallbacksC2681f.f29839B) {
            componentCallbacksC2681f.f29839B = false;
            if (componentCallbacksC2681f.f29874l) {
                return;
            }
            this.f29980c.a(componentCallbacksC2681f);
            if (E0(2)) {
                Log.v("FragmentManager", "add from attach: " + componentCallbacksC2681f);
            }
            if (F0(componentCallbacksC2681f)) {
                this.f29967H = true;
            }
        }
    }

    public int l0() {
        ArrayList arrayList = this.f29981d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public G m() {
        return new C2676a(this);
    }

    public final B m0(ComponentCallbacksC2681f componentCallbacksC2681f) {
        return this.f29975P.j(componentCallbacksC2681f);
    }

    public boolean n() {
        boolean zF0 = false;
        for (ComponentCallbacksC2681f componentCallbacksC2681f : this.f29980c.l()) {
            if (componentCallbacksC2681f != null) {
                zF0 = F0(componentCallbacksC2681f);
            }
            if (zF0) {
                return true;
            }
        }
        return false;
    }

    public AbstractC2688m n0() {
        return this.f30000w;
    }

    public final void o() {
        if (L0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final ViewGroup o0(ComponentCallbacksC2681f componentCallbacksC2681f) {
        ViewGroup viewGroup = componentCallbacksC2681f.f29845H;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (componentCallbacksC2681f.f29889y > 0 && this.f30000w.g()) {
            View viewF = this.f30000w.f(componentCallbacksC2681f.f29889y);
            if (viewF instanceof ViewGroup) {
                return (ViewGroup) viewF;
            }
        }
        return null;
    }

    public final void p() {
        this.f29979b = false;
        this.f29973N.clear();
        this.f29972M.clear();
    }

    public p p0() {
        p pVar = this.f30003z;
        if (pVar != null) {
            return pVar;
        }
        ComponentCallbacksC2681f componentCallbacksC2681f = this.f30001x;
        return componentCallbacksC2681f != null ? componentCallbacksC2681f.f29884t.p0() : this.f29960A;
    }

    public final void q() {
        boolean zN;
        q qVar = this.f29999v;
        if (qVar instanceof S) {
            zN = this.f29980c.p().n();
        } else {
            zN = qVar.o() instanceof Activity ? !((Activity) this.f29999v.o()).isChangingConfigurations() : true;
        }
        if (zN) {
            Iterator it = this.f29987j.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C2678c) it.next()).f29767a.iterator();
                while (it2.hasNext()) {
                    this.f29980c.p().f((String) it2.next());
                }
            }
        }
    }

    public List q0() {
        return this.f29980c.o();
    }

    public final Set r() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f29980c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((E) it.next()).k().f29845H;
            if (viewGroup != null) {
                hashSet.add(M.o(viewGroup, w0()));
            }
        }
        return hashSet;
    }

    public q r0() {
        return this.f29999v;
    }

    public final Set s(ArrayList arrayList, int i8, int i9) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i8 < i9) {
            Iterator it = ((C2676a) arrayList.get(i8)).f29663c.iterator();
            while (it.hasNext()) {
                ComponentCallbacksC2681f componentCallbacksC2681f = ((G.a) it.next()).f29681b;
                if (componentCallbacksC2681f != null && (viewGroup = componentCallbacksC2681f.f29845H) != null) {
                    hashSet.add(M.n(viewGroup, this));
                }
            }
            i8++;
        }
        return hashSet;
    }

    public LayoutInflater.Factory2 s0() {
        return this.f29983f;
    }

    public E t(ComponentCallbacksC2681f componentCallbacksC2681f) {
        E eN = this.f29980c.n(componentCallbacksC2681f.f29862f);
        if (eN != null) {
            return eN;
        }
        E e8 = new E(this.f29991n, this.f29980c, componentCallbacksC2681f);
        e8.o(this.f29999v.o().getClassLoader());
        e8.t(this.f29998u);
        return e8;
    }

    public s t0() {
        return this.f29991n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ComponentCallbacksC2681f componentCallbacksC2681f = this.f30001x;
        if (componentCallbacksC2681f != null) {
            sb.append(componentCallbacksC2681f.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f30001x)));
            sb.append("}");
        } else {
            q qVar = this.f29999v;
            if (qVar != null) {
                sb.append(qVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f29999v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public void u(ComponentCallbacksC2681f componentCallbacksC2681f) {
        if (E0(2)) {
            Log.v("FragmentManager", "detach: " + componentCallbacksC2681f);
        }
        if (componentCallbacksC2681f.f29839B) {
            return;
        }
        componentCallbacksC2681f.f29839B = true;
        if (componentCallbacksC2681f.f29874l) {
            if (E0(2)) {
                Log.v("FragmentManager", "remove from detach: " + componentCallbacksC2681f);
            }
            this.f29980c.u(componentCallbacksC2681f);
            if (F0(componentCallbacksC2681f)) {
                this.f29967H = true;
            }
            g1(componentCallbacksC2681f);
        }
    }

    public ComponentCallbacksC2681f u0() {
        return this.f30001x;
    }

    public void v() {
        this.f29968I = false;
        this.f29969J = false;
        this.f29975P.p(false);
        Q(4);
    }

    public ComponentCallbacksC2681f v0() {
        return this.f30002y;
    }

    public void w() {
        this.f29968I = false;
        this.f29969J = false;
        this.f29975P.p(false);
        Q(0);
    }

    public N w0() {
        N n8 = this.f29961B;
        if (n8 != null) {
            return n8;
        }
        ComponentCallbacksC2681f componentCallbacksC2681f = this.f30001x;
        return componentCallbacksC2681f != null ? componentCallbacksC2681f.f29884t.w0() : this.f29962C;
    }

    public void x(Configuration configuration, boolean z8) {
        if (z8 && (this.f29999v instanceof I1.c)) {
            j1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (ComponentCallbacksC2681f componentCallbacksC2681f : this.f29980c.o()) {
            if (componentCallbacksC2681f != null) {
                componentCallbacksC2681f.Q0(configuration);
                if (z8) {
                    componentCallbacksC2681f.f29886v.x(configuration, true);
                }
            }
        }
    }

    public p120n2.c.C0656c x0() {
        return this.f29976Q;
    }

    public boolean y(MenuItem menuItem) {
        if (this.f29998u < 1) {
            return false;
        }
        for (ComponentCallbacksC2681f componentCallbacksC2681f : this.f29980c.o()) {
            if (componentCallbacksC2681f != null && componentCallbacksC2681f.R0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void z() {
        this.f29968I = false;
        this.f29969J = false;
        this.f29975P.p(false);
        Q(1);
    }

    public Q z0(ComponentCallbacksC2681f componentCallbacksC2681f) {
        return this.f29975P.m(componentCallbacksC2681f);
    }

    public void U(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f29980c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f29982e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i8 = 0; i8 < size2; i8++) {
                ComponentCallbacksC2681f componentCallbacksC2681f = (ComponentCallbacksC2681f) this.f29982e.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC2681f.toString());
            }
        }
        ArrayList arrayList2 = this.f29981d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i9 = 0; i9 < size; i9++) {
                C2676a c2676a = (C2676a) this.f29981d.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(c2676a.toString());
                c2676a.p(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f29986i.get());
        synchronized (this.f29978a) {
            try {
                int size3 = this.f29978a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i10 = 0; i10 < size3; i10++) {
                        l lVar = (l) this.f29978a.get(i10);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i10);
                        printWriter.print(": ");
                        printWriter.println(lVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print(eGwOBWCdOTaKus.xyuvxHV);
        printWriter.println(this.f29999v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f30000w);
        if (this.f30001x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f30001x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f29998u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f29968I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f29969J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f29970K);
        if (this.f29967H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f29967H);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f30015b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i8) {
                return new k[i8];
            }
        }

        public k(String str, int i8) {
            this.f30014a = str;
            this.f30015b = i8;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeString(this.f30014a);
            parcel.writeInt(this.f30015b);
        }

        public k(Parcel parcel) {
            this.f30014a = parcel.readString();
            this.f30015b = parcel.readInt();
        }
    }

    public static y h0(View view) {
        ActivityC2686k activityC2686k;
        ComponentCallbacksC2681f componentCallbacksC2681fI0 = i0(view);
        if (componentCallbacksC2681fI0 != null) {
            if (componentCallbacksC2681fI0.Z()) {
                return componentCallbacksC2681fI0.s();
            }
            throw new IllegalStateException("The Fragment " + componentCallbacksC2681fI0 + " that owns View " + view + ZWZaxQrCHfNe.seNjhvUTyPvoDB);
        }
        Context context = view.getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof ActivityC2686k) {
                    activityC2686k = (ActivityC2686k) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                activityC2686k = null;
                break;
            }
        }
        if (activityC2686k != null) {
            return activityC2686k.f0();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }
}
