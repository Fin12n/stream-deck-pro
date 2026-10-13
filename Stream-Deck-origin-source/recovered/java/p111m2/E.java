package p111m2;

import E4.JFpq.XRlnZWSrAFn;
import U1.I;
import Z.JTT.ryTuoS;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.S;
import com.revenuecat.purchases.common.HTTPClient;
import p120n2.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f29649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f29650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComponentCallbacksC2681f f29651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29652d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29653e = -1;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29656a;

        static {
            int[] iArr = new int[AbstractC1726i.b.values().length];
            f29656a = iArr;
            try {
                iArr[AbstractC1726i.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29656a[AbstractC1726i.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29656a[AbstractC1726i.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29656a[AbstractC1726i.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public E(s sVar, F f8, ComponentCallbacksC2681f componentCallbacksC2681f) {
        this.f29649a = sVar;
        this.f29650b = f8;
        this.f29651c = componentCallbacksC2681f;
    }

    public void a() {
        if (y.E0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f29651c);
        }
        ComponentCallbacksC2681f componentCallbacksC2681f = this.f29651c;
        componentCallbacksC2681f.O0(componentCallbacksC2681f.f29854b);
        s sVar = this.f29649a;
        ComponentCallbacksC2681f componentCallbacksC2681f2 = this.f29651c;
        sVar.a(componentCallbacksC2681f2, componentCallbacksC2681f2.f29854b, false);
    }

    public void b() {
        int iJ = this.f29650b.j(this.f29651c);
        ComponentCallbacksC2681f componentCallbacksC2681f = this.f29651c;
        componentCallbacksC2681f.f29845H.addView(componentCallbacksC2681f.f29846I, iJ);
    }

    public void c() {
        if (y.E0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f29651c);
        }
        ComponentCallbacksC2681f componentCallbacksC2681f = this.f29651c;
        ComponentCallbacksC2681f componentCallbacksC2681f2 = componentCallbacksC2681f.f29866h;
        E eN = null;
        if (componentCallbacksC2681f2 != null) {
            E eN2 = this.f29650b.n(componentCallbacksC2681f2.f29862f);
            if (eN2 == null) {
                throw new IllegalStateException("Fragment " + this.f29651c + " declared target fragment " + this.f29651c.f29866h + " that does not belong to this FragmentManager!");
            }
            ComponentCallbacksC2681f componentCallbacksC2681f3 = this.f29651c;
            componentCallbacksC2681f3.f29868i = componentCallbacksC2681f3.f29866h.f29862f;
            componentCallbacksC2681f3.f29866h = null;
            eN = eN2;
        } else {
            String str = componentCallbacksC2681f.f29868i;
            if (str != null && (eN = this.f29650b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f29651c + " declared target fragment " + this.f29651c.f29868i + " that does not belong to this FragmentManager!");
            }
        }
        if (eN != null) {
            eN.m();
        }
        ComponentCallbacksC2681f componentCallbacksC2681f4 = this.f29651c;
        componentCallbacksC2681f4.f29885u = componentCallbacksC2681f4.f29884t.r0();
        ComponentCallbacksC2681f componentCallbacksC2681f5 = this.f29651c;
        componentCallbacksC2681f5.f29887w = componentCallbacksC2681f5.f29884t.u0();
        this.f29649a.g(this.f29651c, false);
        this.f29651c.P0();
        this.f29649a.b(this.f29651c, false);
    }

    public int d() {
        ComponentCallbacksC2681f componentCallbacksC2681f = this.f29651c;
        if (componentCallbacksC2681f.f29884t == null) {
            return componentCallbacksC2681f.f29852a;
        }
        int iMin = this.f29653e;
        int i8 = b.f29656a[componentCallbacksC2681f.f29859d0.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i8 != 3) {
                iMin = i8 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        ComponentCallbacksC2681f componentCallbacksC2681f2 = this.f29651c;
        if (componentCallbacksC2681f2.f29879o) {
            if (componentCallbacksC2681f2.f29880p) {
                iMin = Math.max(this.f29653e, 2);
                View view = this.f29651c.f29846I;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f29653e < 4 ? Math.min(iMin, componentCallbacksC2681f2.f29852a) : Math.min(iMin, 1);
            }
        }
        if (!this.f29651c.f29874l) {
            iMin = Math.min(iMin, 1);
        }
        ComponentCallbacksC2681f componentCallbacksC2681f3 = this.f29651c;
        ViewGroup viewGroup = componentCallbacksC2681f3.f29845H;
        M.e.b bVarL = viewGroup != null ? M.n(viewGroup, componentCallbacksC2681f3.H()).l(this) : null;
        if (bVarL == M.e.b.f29741b) {
            iMin = Math.min(iMin, 6);
        } else if (bVarL == M.e.b.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            ComponentCallbacksC2681f componentCallbacksC2681f4 = this.f29651c;
            if (componentCallbacksC2681f4.f29876m) {
                iMin = componentCallbacksC2681f4.b0() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        ComponentCallbacksC2681f componentCallbacksC2681f5 = this.f29651c;
        if (componentCallbacksC2681f5.f29847V && componentCallbacksC2681f5.f29852a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (y.E0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f29651c);
        }
        return iMin;
    }

    public void e() {
        if (y.E0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f29651c);
        }
        ComponentCallbacksC2681f componentCallbacksC2681f = this.f29651c;
        if (componentCallbacksC2681f.f29855b0) {
            componentCallbacksC2681f.q1(componentCallbacksC2681f.f29854b);
            this.f29651c.f29852a = 1;
            return;
        }
        this.f29649a.h(componentCallbacksC2681f, componentCallbacksC2681f.f29854b, false);
        ComponentCallbacksC2681f componentCallbacksC2681f2 = this.f29651c;
        componentCallbacksC2681f2.S0(componentCallbacksC2681f2.f29854b);
        s sVar = this.f29649a;
        ComponentCallbacksC2681f componentCallbacksC2681f3 = this.f29651c;
        sVar.c(componentCallbacksC2681f3, componentCallbacksC2681f3.f29854b, false);
    }

    public void f() {
        String resourceName;
        if (this.f29651c.f29879o) {
            return;
        }
        if (y.E0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f29651c);
        }
        ComponentCallbacksC2681f componentCallbacksC2681f = this.f29651c;
        LayoutInflater layoutInflaterY0 = componentCallbacksC2681f.Y0(componentCallbacksC2681f.f29854b);
        ComponentCallbacksC2681f componentCallbacksC2681f2 = this.f29651c;
        ViewGroup viewGroup = componentCallbacksC2681f2.f29845H;
        if (viewGroup == null) {
            int i8 = componentCallbacksC2681f2.f29889y;
            if (i8 == 0) {
                viewGroup = null;
            } else {
                if (i8 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f29651c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) componentCallbacksC2681f2.f29884t.n0().f(this.f29651c.f29889y);
                if (viewGroup == null) {
                    ComponentCallbacksC2681f componentCallbacksC2681f3 = this.f29651c;
                    if (!componentCallbacksC2681f3.f29881q) {
                        try {
                            resourceName = componentCallbacksC2681f3.N().getResourceName(this.f29651c.f29889y);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f29651c.f29889y) + " (" + resourceName + ") for fragment " + this.f29651c);
                    }
                } else if (!(viewGroup instanceof C2689n)) {
                    c.i(this.f29651c, viewGroup);
                }
            }
        }
        ComponentCallbacksC2681f componentCallbacksC2681f4 = this.f29651c;
        componentCallbacksC2681f4.f29845H = viewGroup;
        componentCallbacksC2681f4.U0(layoutInflaterY0, viewGroup, componentCallbacksC2681f4.f29854b);
        View view = this.f29651c.f29846I;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            ComponentCallbacksC2681f componentCallbacksC2681f5 = this.f29651c;
            componentCallbacksC2681f5.f29846I.setTag(p102l2.b.f29136a, componentCallbacksC2681f5);
            if (viewGroup != null) {
                b();
            }
            ComponentCallbacksC2681f componentCallbacksC2681f6 = this.f29651c;
            if (componentCallbacksC2681f6.f29838A) {
                componentCallbacksC2681f6.f29846I.setVisibility(8);
            }
            if (I.w(this.f29651c.f29846I)) {
                I.F(this.f29651c.f29846I);
            } else {
                View view2 = this.f29651c.f29846I;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f29651c.l1();
            s sVar = this.f29649a;
            ComponentCallbacksC2681f componentCallbacksC2681f7 = this.f29651c;
            sVar.m(componentCallbacksC2681f7, componentCallbacksC2681f7.f29846I, componentCallbacksC2681f7.f29854b, false);
            int visibility = this.f29651c.f29846I.getVisibility();
            this.f29651c.y1(this.f29651c.f29846I.getAlpha());
            ComponentCallbacksC2681f componentCallbacksC2681f8 = this.f29651c;
            if (componentCallbacksC2681f8.f29845H != null && visibility == 0) {
                View viewFindFocus = componentCallbacksC2681f8.f29846I.findFocus();
                if (viewFindFocus != null) {
                    this.f29651c.v1(viewFindFocus);
                    if (y.E0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f29651c);
                    }
                }
                this.f29651c.f29846I.setAlpha(0.0f);
            }
        }
        this.f29651c.f29852a = 2;
    }

    public void g() {
        ComponentCallbacksC2681f componentCallbacksC2681fF;
        if (y.E0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f29651c);
        }
        ComponentCallbacksC2681f componentCallbacksC2681f = this.f29651c;
        boolean zIsChangingConfigurations = true;
        boolean z8 = componentCallbacksC2681f.f29876m && !componentCallbacksC2681f.b0();
        if (z8) {
            ComponentCallbacksC2681f componentCallbacksC2681f2 = this.f29651c;
            if (!componentCallbacksC2681f2.f29878n) {
                this.f29650b.B(componentCallbacksC2681f2.f29862f, null);
            }
        }
        if (!z8 && !this.f29650b.p().q(this.f29651c)) {
            String str = this.f29651c.f29868i;
            if (str != null && (componentCallbacksC2681fF = this.f29650b.f(str)) != null && componentCallbacksC2681fF.f29840C) {
                this.f29651c.f29866h = componentCallbacksC2681fF;
            }
            this.f29651c.f29852a = 0;
            return;
        }
        q qVar = this.f29651c.f29885u;
        if (qVar instanceof S) {
            zIsChangingConfigurations = this.f29650b.p().n();
        } else if (qVar.o() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) qVar.o()).isChangingConfigurations();
        }
        if ((z8 && !this.f29651c.f29878n) || zIsChangingConfigurations) {
            this.f29650b.p().g(this.f29651c);
        }
        this.f29651c.V0();
        this.f29649a.d(this.f29651c, false);
        for (E e8 : this.f29650b.k()) {
            if (e8 != null) {
                ComponentCallbacksC2681f componentCallbacksC2681fK = e8.k();
                if (this.f29651c.f29862f.equals(componentCallbacksC2681fK.f29868i)) {
                    componentCallbacksC2681fK.f29866h = this.f29651c;
                    componentCallbacksC2681fK.f29868i = null;
                }
            }
        }
        ComponentCallbacksC2681f componentCallbacksC2681f3 = this.f29651c;
        String str2 = componentCallbacksC2681f3.f29868i;
        if (str2 != null) {
            componentCallbacksC2681f3.f29866h = this.f29650b.f(str2);
        }
        this.f29650b.s(this);
    }

    public void h() {
        View view;
        if (y.E0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f29651c);
        }
        ComponentCallbacksC2681f componentCallbacksC2681f = this.f29651c;
        ViewGroup viewGroup = componentCallbacksC2681f.f29845H;
        if (viewGroup != null && (view = componentCallbacksC2681f.f29846I) != null) {
            viewGroup.removeView(view);
        }
        this.f29651c.W0();
        this.f29649a.n(this.f29651c, false);
        ComponentCallbacksC2681f componentCallbacksC2681f2 = this.f29651c;
        componentCallbacksC2681f2.f29845H = null;
        componentCallbacksC2681f2.f29846I = null;
        componentCallbacksC2681f2.f29863f0 = null;
        componentCallbacksC2681f2.f29865g0.m(null);
        this.f29651c.f29880p = false;
    }

    public void i() {
        if (y.E0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f29651c);
        }
        this.f29651c.X0();
        this.f29649a.e(this.f29651c, false);
        ComponentCallbacksC2681f componentCallbacksC2681f = this.f29651c;
        componentCallbacksC2681f.f29852a = -1;
        componentCallbacksC2681f.f29885u = null;
        componentCallbacksC2681f.f29887w = null;
        componentCallbacksC2681f.f29884t = null;
        if ((!componentCallbacksC2681f.f29876m || componentCallbacksC2681f.b0()) && !this.f29650b.p().q(this.f29651c)) {
            return;
        }
        if (y.E0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f29651c);
        }
        this.f29651c.X();
    }

    public void j() {
        ComponentCallbacksC2681f componentCallbacksC2681f = this.f29651c;
        if (componentCallbacksC2681f.f29879o && componentCallbacksC2681f.f29880p && !componentCallbacksC2681f.f29882r) {
            if (y.E0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f29651c);
            }
            ComponentCallbacksC2681f componentCallbacksC2681f2 = this.f29651c;
            componentCallbacksC2681f2.U0(componentCallbacksC2681f2.Y0(componentCallbacksC2681f2.f29854b), null, this.f29651c.f29854b);
            View view = this.f29651c.f29846I;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                ComponentCallbacksC2681f componentCallbacksC2681f3 = this.f29651c;
                componentCallbacksC2681f3.f29846I.setTag(p102l2.b.f29136a, componentCallbacksC2681f3);
                ComponentCallbacksC2681f componentCallbacksC2681f4 = this.f29651c;
                if (componentCallbacksC2681f4.f29838A) {
                    componentCallbacksC2681f4.f29846I.setVisibility(8);
                }
                this.f29651c.l1();
                s sVar = this.f29649a;
                ComponentCallbacksC2681f componentCallbacksC2681f5 = this.f29651c;
                sVar.m(componentCallbacksC2681f5, componentCallbacksC2681f5.f29846I, componentCallbacksC2681f5.f29854b, false);
                this.f29651c.f29852a = 2;
            }
        }
    }

    public ComponentCallbacksC2681f k() {
        return this.f29651c;
    }

    public final boolean l(View view) {
        if (view == this.f29651c.f29846I) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f29651c.f29846I) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f29652d) {
            if (y.E0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f29652d = true;
            boolean z8 = false;
            while (true) {
                int iD = d();
                ComponentCallbacksC2681f componentCallbacksC2681f = this.f29651c;
                int i8 = componentCallbacksC2681f.f29852a;
                if (iD == i8) {
                    if (!z8 && i8 == -1 && componentCallbacksC2681f.f29876m && !componentCallbacksC2681f.b0() && !this.f29651c.f29878n) {
                        if (y.E0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f29651c);
                        }
                        this.f29650b.p().g(this.f29651c);
                        this.f29650b.s(this);
                        if (y.E0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f29651c);
                        }
                        this.f29651c.X();
                    }
                    ComponentCallbacksC2681f componentCallbacksC2681f2 = this.f29651c;
                    if (componentCallbacksC2681f2.f29851Z) {
                        if (componentCallbacksC2681f2.f29846I != null && (viewGroup = componentCallbacksC2681f2.f29845H) != null) {
                            M mN = M.n(viewGroup, componentCallbacksC2681f2.H());
                            if (this.f29651c.f29838A) {
                                mN.c(this);
                            } else {
                                mN.e(this);
                            }
                        }
                        ComponentCallbacksC2681f componentCallbacksC2681f3 = this.f29651c;
                        y yVar = componentCallbacksC2681f3.f29884t;
                        if (yVar != null) {
                            yVar.C0(componentCallbacksC2681f3);
                        }
                        ComponentCallbacksC2681f componentCallbacksC2681f4 = this.f29651c;
                        componentCallbacksC2681f4.f29851Z = false;
                        componentCallbacksC2681f4.x0(componentCallbacksC2681f4.f29838A);
                        this.f29651c.f29886v.G();
                    }
                    return;
                }
                if (iD <= i8) {
                    switch (i8 - 1) {
                        case HTTPClient.NO_STATUS_CODE /* -1 */:
                            i();
                            break;
                        case 0:
                            if (componentCallbacksC2681f.f29878n && this.f29650b.q(componentCallbacksC2681f.f29862f) == null) {
                                r();
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f29651c.f29852a = 1;
                            break;
                        case 2:
                            componentCallbacksC2681f.f29880p = false;
                            componentCallbacksC2681f.f29852a = 2;
                            break;
                        case 3:
                            if (y.E0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f29651c);
                            }
                            ComponentCallbacksC2681f componentCallbacksC2681f5 = this.f29651c;
                            if (componentCallbacksC2681f5.f29878n) {
                                r();
                            } else if (componentCallbacksC2681f5.f29846I != null && componentCallbacksC2681f5.f29856c == null) {
                                s();
                            }
                            ComponentCallbacksC2681f componentCallbacksC2681f6 = this.f29651c;
                            if (componentCallbacksC2681f6.f29846I != null && (viewGroup2 = componentCallbacksC2681f6.f29845H) != null) {
                                M.n(viewGroup2, componentCallbacksC2681f6.H()).d(this);
                            }
                            this.f29651c.f29852a = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            componentCallbacksC2681f.f29852a = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i8 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (componentCallbacksC2681f.f29846I != null && (viewGroup3 = componentCallbacksC2681f.f29845H) != null) {
                                M.n(viewGroup3, componentCallbacksC2681f.H()).b(M.e.c.b(this.f29651c.f29846I.getVisibility()), this);
                            }
                            this.f29651c.f29852a = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            componentCallbacksC2681f.f29852a = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z8 = true;
            }
        } finally {
            this.f29652d = false;
        }
    }

    public void n() {
        if (y.E0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f29651c);
        }
        this.f29651c.d1();
        this.f29649a.f(this.f29651c, false);
    }

    public void p() {
        if (y.E0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f29651c);
        }
        View viewB = this.f29651c.B();
        if (viewB != null && l(viewB)) {
            boolean zRequestFocus = viewB.requestFocus();
            if (y.E0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(viewB);
                sb.append(" ");
                sb.append(zRequestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f29651c);
                sb.append(" resulting in focused view ");
                sb.append(this.f29651c.f29846I.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f29651c.v1(null);
        this.f29651c.h1();
        this.f29649a.i(this.f29651c, false);
        ComponentCallbacksC2681f componentCallbacksC2681f = this.f29651c;
        componentCallbacksC2681f.f29854b = null;
        componentCallbacksC2681f.f29856c = null;
        componentCallbacksC2681f.f29858d = null;
    }

    public final Bundle q() {
        Bundle bundle = new Bundle();
        this.f29651c.i1(bundle);
        this.f29649a.j(this.f29651c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f29651c.f29846I != null) {
            s();
        }
        if (this.f29651c.f29856c != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f29651c.f29856c);
        }
        if (this.f29651c.f29858d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f29651c.f29858d);
        }
        if (!this.f29651c.f29848W) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f29651c.f29848W);
        }
        return bundle;
    }

    public void r() {
        D d8 = new D(this.f29651c);
        ComponentCallbacksC2681f componentCallbacksC2681f = this.f29651c;
        if (componentCallbacksC2681f.f29852a <= -1 || d8.f29648m != null) {
            d8.f29648m = componentCallbacksC2681f.f29854b;
        } else {
            Bundle bundleQ = q();
            d8.f29648m = bundleQ;
            if (this.f29651c.f29868i != null) {
                if (bundleQ == null) {
                    d8.f29648m = new Bundle();
                }
                d8.f29648m.putString("android:target_state", this.f29651c.f29868i);
                int i8 = this.f29651c.f29870j;
                if (i8 != 0) {
                    d8.f29648m.putInt("android:target_req_state", i8);
                }
            }
        }
        this.f29650b.B(this.f29651c.f29862f, d8);
    }

    public void t(int i8) {
        this.f29653e = i8;
    }

    public void u() {
        if (y.E0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f29651c);
        }
        this.f29651c.j1();
        this.f29649a.k(this.f29651c, false);
    }

    public void v() {
        if (y.E0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f29651c);
        }
        this.f29651c.k1();
        this.f29649a.l(this.f29651c, false);
    }

    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f29651c.f29854b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        ComponentCallbacksC2681f componentCallbacksC2681f = this.f29651c;
        componentCallbacksC2681f.f29856c = componentCallbacksC2681f.f29854b.getSparseParcelableArray("android:view_state");
        ComponentCallbacksC2681f componentCallbacksC2681f2 = this.f29651c;
        componentCallbacksC2681f2.f29858d = componentCallbacksC2681f2.f29854b.getBundle("android:view_registry_state");
        ComponentCallbacksC2681f componentCallbacksC2681f3 = this.f29651c;
        componentCallbacksC2681f3.f29868i = componentCallbacksC2681f3.f29854b.getString("android:target_state");
        ComponentCallbacksC2681f componentCallbacksC2681f4 = this.f29651c;
        if (componentCallbacksC2681f4.f29868i != null) {
            componentCallbacksC2681f4.f29870j = componentCallbacksC2681f4.f29854b.getInt("android:target_req_state", 0);
        }
        ComponentCallbacksC2681f componentCallbacksC2681f5 = this.f29651c;
        Boolean bool = componentCallbacksC2681f5.f29860e;
        if (bool != null) {
            componentCallbacksC2681f5.f29848W = bool.booleanValue();
            this.f29651c.f29860e = null;
        } else {
            componentCallbacksC2681f5.f29848W = componentCallbacksC2681f5.f29854b.getBoolean(ryTuoS.sIsrMKxPPSEh, true);
        }
        ComponentCallbacksC2681f componentCallbacksC2681f6 = this.f29651c;
        if (componentCallbacksC2681f6.f29848W) {
            return;
        }
        componentCallbacksC2681f6.f29847V = true;
    }

    public void s() {
        if (this.f29651c.f29846I == null) {
            return;
        }
        if (y.E0(2)) {
            Log.v("FragmentManager", XRlnZWSrAFn.DlvRai + this.f29651c + " with view " + this.f29651c.f29846I);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f29651c.f29846I.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f29651c.f29856c = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f29651c.f29863f0.h(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f29651c.f29858d = bundle;
    }

    public E(s sVar, F f8, ClassLoader classLoader, p pVar, D d8) {
        this.f29649a = sVar;
        this.f29650b = f8;
        ComponentCallbacksC2681f componentCallbacksC2681fA = d8.a(pVar, classLoader);
        this.f29651c = componentCallbacksC2681fA;
        if (y.E0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + componentCallbacksC2681fA);
        }
    }

    public E(s sVar, F f8, ComponentCallbacksC2681f componentCallbacksC2681f, D d8) {
        this.f29649a = sVar;
        this.f29650b = f8;
        this.f29651c = componentCallbacksC2681f;
        componentCallbacksC2681f.f29856c = null;
        componentCallbacksC2681f.f29858d = null;
        componentCallbacksC2681f.f29883s = 0;
        componentCallbacksC2681f.f29880p = false;
        componentCallbacksC2681f.f29874l = false;
        ComponentCallbacksC2681f componentCallbacksC2681f2 = componentCallbacksC2681f.f29866h;
        componentCallbacksC2681f.f29868i = componentCallbacksC2681f2 != null ? componentCallbacksC2681f2.f29862f : null;
        componentCallbacksC2681f.f29866h = null;
        Bundle bundle = d8.f29648m;
        if (bundle != null) {
            componentCallbacksC2681f.f29854b = bundle;
        } else {
            componentCallbacksC2681f.f29854b = new Bundle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f29654a;

        public a(View view) {
            this.f29654a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f29654a.removeOnAttachStateChangeListener(this);
            I.F(this.f29654a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
