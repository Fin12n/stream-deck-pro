package p111m2;

import H1.s;
import P1.d;
import U1.B;
import U1.I;
import U1.N;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p010b0.C1748a;

/* JADX INFO: renamed from: m2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2679d extends M {

    /* JADX INFO: renamed from: m2.d$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29769a;

        static {
            int[] iArr = new int[M.e.c.values().length];
            f29769a = iArr;
            try {
                iArr[M.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29769a[M.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29769a[M.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29769a[M.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: m2.d$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f29770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ M.e f29771b;

        public b(List list, M.e eVar) {
            this.f29770a = list;
            this.f29771b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f29770a.contains(this.f29771b)) {
                this.f29770a.remove(this.f29771b);
                C2679d.this.s(this.f29771b);
            }
        }
    }

    /* JADX INFO: renamed from: m2.d$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f29773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f29774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f29775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ M.e f29776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ k f29777e;

        public c(ViewGroup viewGroup, View view, boolean z8, M.e eVar, k kVar) {
            this.f29773a = viewGroup;
            this.f29774b = view;
            this.f29775c = z8;
            this.f29776d = eVar;
            this.f29777e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f29773a.endViewTransition(this.f29774b);
            if (this.f29775c) {
                this.f29776d.e().a(this.f29774b);
            }
            this.f29777e.a();
            if (y.E0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f29776d + " has ended.");
            }
        }
    }

    /* JADX INFO: renamed from: m2.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class C0646d implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Animator f29779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ M.e f29780b;

        public C0646d(Animator animator, M.e eVar) {
            this.f29779a = animator;
            this.f29780b = eVar;
        }

        @Override // P1.d.a
        public void onCancel() {
            this.f29779a.end();
            if (y.E0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f29780b + " has been canceled.");
            }
        }
    }

    /* JADX INFO: renamed from: m2.d$f */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class f implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f29788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f29789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f29790c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ M.e f29791d;

        public f(View view, ViewGroup viewGroup, k kVar, M.e eVar) {
            this.f29788a = view;
            this.f29789b = viewGroup;
            this.f29790c = kVar;
            this.f29791d = eVar;
        }

        @Override // P1.d.a
        public void onCancel() {
            this.f29788a.clearAnimation();
            this.f29789b.endViewTransition(this.f29788a);
            this.f29790c.a();
            if (y.E0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f29791d + " has been cancelled.");
            }
        }
    }

    /* JADX INFO: renamed from: m2.d$g */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ M.e f29793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ M.e f29794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f29795c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C1748a f29796d;

        public g(M.e eVar, M.e eVar2, boolean z8, C1748a c1748a) {
            this.f29793a = eVar;
            this.f29794b = eVar2;
            this.f29795c = z8;
            this.f29796d = c1748a;
        }

        @Override // java.lang.Runnable
        public void run() {
            H.a(this.f29793a.f(), this.f29794b.f(), this.f29795c, this.f29796d, false);
        }
    }

    /* JADX INFO: renamed from: m2.d$h */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J f29798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f29799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Rect f29800c;

        public h(J j8, View view, Rect rect) {
            this.f29798a = j8;
            this.f29799b = view;
            this.f29800c = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29798a.h(this.f29799b, this.f29800c);
        }
    }

    /* JADX INFO: renamed from: m2.d$i */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f29802a;

        public i(ArrayList arrayList) {
            this.f29802a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            H.e(this.f29802a, 4);
        }
    }

    /* JADX INFO: renamed from: m2.d$j */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f29804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ M.e f29805b;

        public j(m mVar, M.e eVar) {
            this.f29804a = mVar;
            this.f29805b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29804a.a();
            if (y.E0(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.f29805b + "has completed");
            }
        }
    }

    /* JADX INFO: renamed from: m2.d$k */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class k extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f29807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f29808d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public AbstractC2687l.a f29809e;

        public k(M.e eVar, d dVar, boolean z8) {
            super(eVar, dVar);
            this.f29808d = false;
            this.f29807c = z8;
        }

        public AbstractC2687l.a e(Context context) {
            if (this.f29808d) {
                return this.f29809e;
            }
            AbstractC2687l.a aVarB = AbstractC2687l.b(context, b().f(), b().e() == M.e.c.VISIBLE, this.f29807c);
            this.f29809e = aVarB;
            this.f29808d = true;
            return aVarB;
        }
    }

    /* JADX INFO: renamed from: m2.d$l */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final M.e f29810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f29811b;

        public l(M.e eVar, d dVar) {
            this.f29810a = eVar;
            this.f29811b = dVar;
        }

        public void a() {
            this.f29810a.d(this.f29811b);
        }

        public M.e b() {
            return this.f29810a;
        }

        public d c() {
            return this.f29811b;
        }

        public boolean d() {
            M.e.c cVarC = M.e.c.c(this.f29810a.f().f29846I);
            M.e.c cVarE = this.f29810a.e();
            if (cVarC == cVarE) {
                return true;
            }
            M.e.c cVar = M.e.c.VISIBLE;
            return (cVarC == cVar || cVarE == cVar) ? false : true;
        }
    }

    /* JADX INFO: renamed from: m2.d$m */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class m extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f29812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f29813d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f29814e;

        public m(M.e eVar, d dVar, boolean z8, boolean z9) {
            super(eVar, dVar);
            if (eVar.e() == M.e.c.VISIBLE) {
                this.f29812c = z8 ? eVar.f().M() : eVar.f().v();
                this.f29813d = z8 ? eVar.f().p() : eVar.f().o();
            } else {
                this.f29812c = z8 ? eVar.f().O() : eVar.f().z();
                this.f29813d = true;
            }
            if (!z9) {
                this.f29814e = null;
            } else if (z8) {
                this.f29814e = eVar.f().Q();
            } else {
                this.f29814e = eVar.f().P();
            }
        }

        public J e() {
            J jF = f(this.f29812c);
            J jF2 = f(this.f29814e);
            if (jF == null || jF2 == null || jF == jF2) {
                return jF != null ? jF : jF2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f29812c + " which uses a different Transition  type than its shared element transition " + this.f29814e);
        }

        public final J f(Object obj) {
            if (obj == null) {
                return null;
            }
            J j8 = H.f29689a;
            if (j8 != null && j8.e(obj)) {
                return j8;
            }
            J j9 = H.f29690b;
            if (j9 != null && j9.e(obj)) {
                return j9;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        public Object g() {
            return this.f29814e;
        }

        public Object h() {
            return this.f29812c;
        }

        public boolean i() {
            return this.f29814e != null;
        }

        public boolean j() {
            return this.f29813d;
        }
    }

    public C2679d(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    @Override // p111m2.M
    public void f(List list, boolean z8) {
        Iterator it = list.iterator();
        M.e eVar = null;
        M.e eVar2 = null;
        while (it.hasNext()) {
            M.e eVar3 = (M.e) it.next();
            M.e.c cVarC = M.e.c.c(eVar3.f().f29846I);
            int i8 = a.f29769a[eVar3.e().ordinal()];
            if (i8 == 1 || i8 == 2 || i8 == 3) {
                if (cVarC == M.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i8 == 4 && cVarC != M.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        if (y.E0(2)) {
            Log.v("FragmentManager", "Executing operations from " + eVar + " to " + eVar2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        y(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            M.e eVar4 = (M.e) it2.next();
            d dVar = new d();
            eVar4.j(dVar);
            arrayList.add(new k(eVar4, dVar, z8));
            d dVar2 = new d();
            eVar4.j(dVar2);
            boolean z9 = false;
            if (z8) {
                if (eVar4 == eVar) {
                    z9 = true;
                }
            } else if (eVar4 == eVar2) {
                z9 = true;
            }
            arrayList2.add(new m(eVar4, dVar2, z8, z9));
            eVar4.a(new b(arrayList3, eVar4));
        }
        Map mapX = x(arrayList2, arrayList3, z8, eVar, eVar2);
        w(arrayList, arrayList3, mapX.containsValue(Boolean.TRUE), mapX);
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            s((M.e) it3.next());
        }
        arrayList3.clear();
        if (y.E0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + eVar + " to " + eVar2);
        }
    }

    public void s(M.e eVar) {
        eVar.e().a(eVar.f().f29846I);
    }

    public void t(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (N.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    public void u(Map map, View view) {
        String strT = I.t(view);
        if (strT != null) {
            map.put(strT, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = viewGroup.getChildAt(i8);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    public void v(C1748a c1748a, Collection collection) {
        Iterator it = c1748a.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(I.t((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }

    public final void w(List list, List list2, boolean z8, Map map) {
        M.e eVar;
        k kVar;
        View view;
        ViewGroup viewGroupM = m();
        Context context = viewGroupM.getContext();
        ArrayList<k> arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            if (kVar2.d()) {
                kVar2.a();
            } else {
                AbstractC2687l.a aVarE = kVar2.e(context);
                if (aVarE == null) {
                    kVar2.a();
                } else {
                    Animator animator = aVarE.f29931b;
                    if (animator == null) {
                        arrayList.add(kVar2);
                    } else {
                        M.e eVarB = kVar2.b();
                        ComponentCallbacksC2681f componentCallbacksC2681fF = eVarB.f();
                        if (Boolean.TRUE.equals(map.get(eVarB))) {
                            if (y.E0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + componentCallbacksC2681fF + " as this Fragment was involved in a Transition.");
                            }
                            kVar2.a();
                        } else {
                            boolean z10 = eVarB.e() == M.e.c.GONE;
                            if (z10) {
                                list2.remove(eVarB);
                            }
                            View view2 = componentCallbacksC2681fF.f29846I;
                            viewGroupM.startViewTransition(view2);
                            ViewGroup viewGroup = viewGroupM;
                            viewGroupM = viewGroup;
                            animator.addListener(new c(viewGroup, view2, z10, eVarB, kVar2));
                            animator.setTarget(view2);
                            animator.start();
                            if (y.E0(2)) {
                                Log.v("FragmentManager", "Animator from operation " + eVarB + " has started.");
                            }
                            kVar2.c().b(new C0646d(animator, eVarB));
                            z9 = true;
                        }
                    }
                }
            }
        }
        for (k kVar3 : arrayList) {
            M.e eVarB2 = kVar3.b();
            ComponentCallbacksC2681f componentCallbacksC2681fF2 = eVarB2.f();
            if (z8) {
                if (y.E0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + componentCallbacksC2681fF2 + " as Animations cannot run alongside Transitions.");
                }
                kVar3.a();
            } else if (z9) {
                if (y.E0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + componentCallbacksC2681fF2 + " as Animations cannot run alongside Animators.");
                }
                kVar3.a();
            } else {
                View view3 = componentCallbacksC2681fF2.f29846I;
                Animation animation = (Animation) T1.f.g(((AbstractC2687l.a) T1.f.g(kVar3.e(context))).f29930a);
                if (eVarB2.e() != M.e.c.REMOVED) {
                    view3.startAnimation(animation);
                    kVar3.a();
                    eVar = eVarB2;
                    kVar = kVar3;
                    view = view3;
                } else {
                    viewGroupM.startViewTransition(view3);
                    AbstractC2687l.b bVar = new AbstractC2687l.b(animation, viewGroupM, view3);
                    eVar = eVarB2;
                    kVar = kVar3;
                    view = view3;
                    bVar.setAnimationListener(new e(eVar, viewGroupM, view, kVar));
                    view.startAnimation(bVar);
                    if (y.E0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + eVar + " has started.");
                    }
                }
                kVar.c().b(new f(view, viewGroupM, kVar, eVar));
            }
        }
    }

    public final Map x(List list, List list2, boolean z8, M.e eVar, M.e eVar2) {
        View view;
        String str;
        String str2;
        ArrayList arrayList;
        View view2;
        ArrayList arrayList2;
        Object objK;
        Object objK2;
        String str3;
        Object obj;
        View view3;
        HashMap map;
        boolean z9;
        ArrayList arrayList3;
        M.e eVar3;
        HashMap map2;
        ArrayList arrayList4;
        View view4;
        Rect rect;
        C1748a c1748a;
        s sVarX;
        s sVarA;
        Rect rect2;
        int i8;
        View view5;
        String strB;
        int i9;
        M.e eVar4 = eVar;
        M.e eVar5 = eVar2;
        HashMap map3 = new HashMap();
        Iterator it = list.iterator();
        J j8 = null;
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (!mVar.d()) {
                J jE = mVar.e();
                if (j8 == null) {
                    j8 = jE;
                } else if (jE != null && j8 != jE) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (j8 == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                m mVar2 = (m) it2.next();
                map3.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return map3;
        }
        View view6 = new View(m().getContext());
        Rect rect3 = new Rect();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C1748a c1748a2 = new C1748a();
        Iterator it3 = list.iterator();
        Object obj2 = null;
        View view7 = null;
        boolean z10 = false;
        while (true) {
            view = view7;
            str = "FragmentManager";
            if (!it3.hasNext()) {
                break;
            }
            m mVar3 = (m) it3.next();
            if (!mVar3.i() || eVar4 == null || eVar5 == null) {
                ArrayList arrayList7 = arrayList5;
                map2 = map3;
                arrayList4 = arrayList7;
                view4 = view6;
                rect = rect3;
                c1748a = c1748a2;
            } else {
                Object objU = j8.u(j8.f(mVar3.g()));
                ArrayList arrayListR = eVar5.f().R();
                ArrayList arrayListR2 = eVar4.f().R();
                ArrayList arrayListS = eVar4.f().S();
                HashMap map4 = map3;
                int i10 = 0;
                while (i10 < arrayListS.size()) {
                    int iIndexOf = arrayListR.indexOf(arrayListS.get(i10));
                    ArrayList arrayList8 = arrayListS;
                    if (iIndexOf != -1) {
                        arrayListR.set(iIndexOf, (String) arrayListR2.get(i10));
                    }
                    i10++;
                    arrayListS = arrayList8;
                }
                ArrayList arrayListS2 = eVar5.f().S();
                if (z8 == 0) {
                    sVarX = eVar4.f().A();
                    sVarA = eVar5.f().x();
                } else {
                    sVarX = eVar4.f().x();
                    sVarA = eVar5.f().A();
                }
                View view8 = view6;
                int i11 = 0;
                for (int size = arrayListR.size(); i11 < size; size = size) {
                    c1748a2.put((String) arrayListR.get(i11), (String) arrayListS2.get(i11));
                    i11++;
                }
                if (y.E0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    Iterator it4 = arrayListS2.iterator();
                    while (true) {
                        Iterator it5 = it4;
                        if (!it4.hasNext()) {
                            break;
                        }
                        Log.v("FragmentManager", "Name: " + ((String) it5.next()));
                        it4 = it5;
                        rect3 = rect3;
                    }
                    rect2 = rect3;
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator it6 = arrayListR.iterator(); it6.hasNext(); it6 = it6) {
                        Log.v("FragmentManager", "Name: " + ((String) it6.next()));
                    }
                } else {
                    rect2 = rect3;
                }
                C1748a c1748a3 = new C1748a();
                u(c1748a3, eVar4.f().f29846I);
                c1748a3.n(arrayListR);
                if (sVarX != null) {
                    if (y.E0(2)) {
                        Log.v("FragmentManager", "Executing exit callback for operation " + eVar4);
                    }
                    sVarX.a(arrayListR, c1748a3);
                    int size2 = arrayListR.size() - 1;
                    while (size2 >= 0) {
                        String str4 = (String) arrayListR.get(size2);
                        View view9 = (View) c1748a3.get(str4);
                        if (view9 == null) {
                            c1748a2.remove(str4);
                            i9 = size2;
                        } else {
                            i9 = size2;
                            if (!str4.equals(I.t(view9))) {
                                c1748a2.put(I.t(view9), (String) c1748a2.remove(str4));
                            }
                        }
                        size2 = i9 - 1;
                    }
                } else {
                    c1748a2.n(c1748a3.keySet());
                }
                C1748a c1748a4 = new C1748a();
                u(c1748a4, eVar5.f().f29846I);
                c1748a4.n(arrayListS2);
                c1748a4.n(c1748a2.values());
                if (sVarA != null) {
                    if (y.E0(2)) {
                        Log.v("FragmentManager", "Executing enter callback for operation " + eVar5);
                    }
                    sVarA.a(arrayListS2, c1748a4);
                    for (int size3 = arrayListS2.size() - 1; size3 >= 0; size3--) {
                        String str5 = (String) arrayListS2.get(size3);
                        View view10 = (View) c1748a4.get(str5);
                        if (view10 == null) {
                            String strB2 = H.b(c1748a2, str5);
                            if (strB2 != null) {
                                c1748a2.remove(strB2);
                            }
                        } else if (!str5.equals(I.t(view10)) && (strB = H.b(c1748a2, str5)) != null) {
                            c1748a2.put(strB, I.t(view10));
                        }
                    }
                } else {
                    H.d(c1748a2, c1748a4);
                }
                v(c1748a3, c1748a2.keySet());
                v(c1748a4, c1748a2.values());
                if (c1748a2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    arrayList4 = arrayList5;
                    c1748a = c1748a2;
                    arrayList6 = arrayList6;
                    view7 = view;
                    map2 = map4;
                    view4 = view8;
                    rect = rect2;
                    obj2 = null;
                } else {
                    H.a(eVar5.f(), eVar4.f(), z8, c1748a3, true);
                    B.a(m(), new g(eVar5, eVar4, z8, c1748a4));
                    arrayList5.addAll(c1748a3.values());
                    if (arrayListR.isEmpty()) {
                        i8 = 0;
                    } else {
                        i8 = 0;
                        View view11 = (View) c1748a3.get((String) arrayListR.get(0));
                        j8.p(objU, view11);
                        view = view11;
                    }
                    arrayList6.addAll(c1748a4.values());
                    if (arrayListS2.isEmpty() || (view5 = (View) c1748a4.get((String) arrayListS2.get(i8))) == null) {
                        rect = rect2;
                    } else {
                        rect = rect2;
                        B.a(m(), new h(j8, view5, rect));
                        z10 = true;
                    }
                    j8.s(objU, view8, arrayList5);
                    arrayList4 = arrayList5;
                    c1748a = c1748a2;
                    view4 = view8;
                    j8.n(objU, null, null, null, null, objU, arrayList6);
                    Boolean bool = Boolean.TRUE;
                    map2 = map4;
                    map2.put(eVar4, bool);
                    map2.put(eVar5, bool);
                    obj2 = objU;
                }
                HashMap map5 = map2;
                arrayList5 = arrayList4;
                map3 = map5;
                rect3 = rect;
                arrayList6 = arrayList6;
                c1748a2 = c1748a;
                view6 = view4;
            }
            view7 = view;
            HashMap map6 = map2;
            arrayList5 = arrayList4;
            map3 = map6;
            rect3 = rect;
            arrayList6 = arrayList6;
            c1748a2 = c1748a;
            view6 = view4;
        }
        ArrayList arrayList9 = arrayList5;
        HashMap map7 = map3;
        ArrayList arrayList10 = arrayList9;
        View view12 = view6;
        Rect rect4 = rect3;
        C1748a c1748a5 = c1748a2;
        ArrayList arrayList11 = arrayList6;
        boolean z11 = true;
        ArrayList arrayList12 = new ArrayList();
        Iterator it7 = list.iterator();
        Object obj3 = null;
        Object obj4 = null;
        while (it7.hasNext()) {
            m mVar4 = (m) it7.next();
            if (mVar4.d()) {
                map7.put(mVar4.b(), Boolean.FALSE);
                mVar4.a();
                z11 = true;
            } else {
                Object objF = j8.f(mVar4.h());
                M.e eVarB = mVar4.b();
                boolean z12 = obj2 != null && (eVarB == eVar4 || eVarB == eVar5);
                if (objF == null) {
                    if (!z12) {
                        map7.put(eVarB, Boolean.FALSE);
                        mVar4.a();
                    }
                    View view13 = view;
                    arrayList = arrayList10;
                    view2 = view13;
                    view3 = view12;
                    arrayList2 = arrayList11;
                    arrayList3 = arrayList12;
                    map = map7;
                    str3 = str;
                    z9 = true;
                } else {
                    HashMap map8 = map7;
                    ArrayList arrayList13 = new ArrayList();
                    ArrayList arrayList14 = arrayList12;
                    t(arrayList13, eVarB.f().f29846I);
                    if (z12) {
                        if (eVarB == eVar4) {
                            arrayList13.removeAll(arrayList10);
                        } else {
                            arrayList13.removeAll(arrayList11);
                        }
                    }
                    if (arrayList13.isEmpty()) {
                        j8.a(objF, view12);
                        View view14 = view;
                        arrayList = arrayList10;
                        view2 = view14;
                        view3 = view12;
                        arrayList2 = arrayList11;
                        objK2 = obj3;
                        eVar3 = eVarB;
                        str3 = str;
                        objK = obj4;
                        arrayList3 = arrayList14;
                        obj = objF;
                        map = map8;
                        z9 = true;
                    } else {
                        j8.b(objF, arrayList13);
                        View view15 = view;
                        arrayList = arrayList10;
                        view2 = view15;
                        arrayList2 = arrayList11;
                        objK = obj4;
                        objK2 = obj3;
                        str3 = str;
                        obj = objF;
                        view3 = view12;
                        map = map8;
                        z9 = true;
                        arrayList3 = arrayList14;
                        j8.n(obj, objF, arrayList13, null, null, null, null);
                        if (eVarB.e() == M.e.c.GONE) {
                            eVar3 = eVarB;
                            list2.remove(eVar3);
                            ArrayList arrayList15 = new ArrayList(arrayList13);
                            arrayList15.remove(eVar3.f().f29846I);
                            j8.m(obj, eVar3.f().f29846I, arrayList15);
                            B.a(m(), new i(arrayList13));
                        } else {
                            eVar3 = eVarB;
                        }
                    }
                    if (eVar3.e() == M.e.c.VISIBLE) {
                        arrayList3.addAll(arrayList13);
                        if (z10) {
                            j8.o(obj, rect4);
                        }
                    } else {
                        j8.p(obj, view2);
                    }
                    map.put(eVar3, Boolean.TRUE);
                    if (mVar4.j()) {
                        objK2 = j8.k(objK2, obj, null);
                    } else {
                        objK = j8.k(objK, obj, null);
                    }
                    obj3 = objK2;
                    obj4 = objK;
                }
                ArrayList arrayList16 = arrayList;
                view = view2;
                arrayList10 = arrayList16;
                eVar4 = eVar;
                eVar5 = eVar2;
                map7 = map;
                arrayList12 = arrayList3;
                arrayList11 = arrayList2;
                view12 = view3;
                z11 = z9;
                str = str3;
            }
        }
        ArrayList<View> arrayList17 = arrayList10;
        ArrayList<View> arrayList18 = arrayList11;
        ArrayList arrayList19 = arrayList12;
        HashMap map9 = map7;
        boolean z13 = z11;
        String str6 = str;
        Object objJ = j8.j(obj3, obj4, obj2);
        if (objJ == null) {
            return map9;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            m mVar5 = (m) it8.next();
            if (!mVar5.d()) {
                Object objH = mVar5.h();
                M.e eVarB2 = mVar5.b();
                boolean z14 = (obj2 == null || !(eVarB2 == eVar || eVarB2 == eVar2)) ? false : z13;
                if (objH == null && !z14) {
                    str2 = str6;
                } else if (I.x(m())) {
                    str2 = str6;
                    j8.q(mVar5.b().f(), objJ, mVar5.c(), new j(mVar5, eVarB2));
                } else {
                    if (y.E0(2)) {
                        str2 = str6;
                        Log.v(str2, "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + eVarB2);
                    } else {
                        str2 = str6;
                    }
                    mVar5.a();
                }
                str6 = str2;
            }
        }
        String str7 = str6;
        if (!I.x(m())) {
            return map9;
        }
        H.e(arrayList19, 4);
        ArrayList arrayListL = j8.l(arrayList18);
        if (y.E0(2)) {
            Log.v(str7, ">>>>> Beginning transition <<<<<");
            Log.v(str7, ">>>>> SharedElementFirstOutViews <<<<<");
            for (View view16 : arrayList17) {
                Log.v(str7, "View: " + view16 + " Name: " + I.t(view16));
            }
            Log.v(str7, ">>>>> SharedElementLastInViews <<<<<");
            for (View view17 : arrayList18) {
                Log.v(str7, "View: " + view17 + " Name: " + I.t(view17));
            }
        }
        j8.c(m(), objJ);
        j8.r(m(), arrayList17, arrayList18, arrayListL, c1748a5);
        H.e(arrayList19, 0);
        j8.t(obj2, arrayList17, arrayList18);
        return map9;
    }

    public final void y(List list) {
        ComponentCallbacksC2681f componentCallbacksC2681fF = ((M.e) list.get(list.size() - 1)).f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            M.e eVar = (M.e) it.next();
            eVar.f().f29849X.f29900c = componentCallbacksC2681fF.f29849X.f29900c;
            eVar.f().f29849X.f29901d = componentCallbacksC2681fF.f29849X.f29901d;
            eVar.f().f29849X.f29902e = componentCallbacksC2681fF.f29849X.f29902e;
            eVar.f().f29849X.f29903f = componentCallbacksC2681fF.f29849X.f29903f;
        }
    }

    /* JADX INFO: renamed from: m2.d$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class e implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ M.e f29782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f29783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f29784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f29785d;

        /* JADX INFO: renamed from: m2.d$e$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f29783b.endViewTransition(eVar.f29784c);
                e.this.f29785d.a();
            }
        }

        public e(M.e eVar, ViewGroup viewGroup, View view, k kVar) {
            this.f29782a = eVar;
            this.f29783b = viewGroup;
            this.f29784c = view;
            this.f29785d = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f29783b.post(new a());
            if (y.E0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f29782a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (y.E0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f29782a + " has reached onAnimationStart.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }
}
