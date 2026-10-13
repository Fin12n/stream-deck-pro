package U1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f10048a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Interpolator f10053e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Interpolator f10054f = new p129o2.a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Interpolator f10055g = new DecelerateInterpolator();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f10056a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public c0 f10057b;

            /* JADX INFO: renamed from: U1.X$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public class C0280a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ X f10058a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c0 f10059b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ c0 f10060c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f10061d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ View f10062e;

                public C0280a(X x8, c0 c0Var, c0 c0Var2, int i8, View view) {
                    this.f10058a = x8;
                    this.f10059b = c0Var;
                    this.f10060c = c0Var2;
                    this.f10061d = i8;
                    this.f10062e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f10058a.d(valueAnimator.getAnimatedFraction());
                    c.j(this.f10062e, c.n(this.f10059b, this.f10060c, this.f10058a.b(), this.f10061d), Collections.singletonList(this.f10058a));
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ X f10064a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ View f10065b;

                public b(X x8, View view) {
                    this.f10064a = x8;
                    this.f10065b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f10064a.d(1.0f);
                    c.h(this.f10065b, this.f10064a);
                }
            }

            /* JADX INFO: renamed from: U1.X$c$a$c, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public class RunnableC0281c implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ View f10067a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ X f10068b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f10069c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f10070d;

                public RunnableC0281c(View view, X x8, a aVar, ValueAnimator valueAnimator) {
                    this.f10067a = view;
                    this.f10068b = x8;
                    this.f10069c = aVar;
                    this.f10070d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.k(this.f10067a, this.f10068b, this.f10069c);
                    this.f10070d.start();
                }
            }

            public a(View view, b bVar) {
                this.f10056a = bVar;
                c0 c0VarR = I.r(view);
                this.f10057b = c0VarR != null ? new c0.b(c0VarR).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f10057b = c0.x(windowInsets, view);
                    return c.l(view, windowInsets);
                }
                c0 c0VarX = c0.x(windowInsets, view);
                if (this.f10057b == null) {
                    this.f10057b = I.r(view);
                }
                if (this.f10057b == null) {
                    this.f10057b = c0VarX;
                    return c.l(view, windowInsets);
                }
                b bVarM = c.m(view);
                if (bVarM != null && Objects.equals(bVarM.f10051a, windowInsets)) {
                    return c.l(view, windowInsets);
                }
                int iD = c.d(c0VarX, this.f10057b);
                if (iD == 0) {
                    return c.l(view, windowInsets);
                }
                c0 c0Var = this.f10057b;
                X x8 = new X(iD, c.f(iD, c0VarX, c0Var), 160L);
                x8.d(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(x8.a());
                a aVarE = c.e(c0VarX, c0Var, iD);
                c.i(view, x8, windowInsets, false);
                duration.addUpdateListener(new C0280a(x8, c0VarX, c0Var, iD, view));
                duration.addListener(new b(x8, view));
                B.a(view, new RunnableC0281c(view, x8, aVarE, duration));
                this.f10057b = c0VarX;
                return c.l(view, windowInsets);
            }
        }

        public c(int i8, Interpolator interpolator, long j8) {
            super(i8, interpolator, j8);
        }

        public static int d(c0 c0Var, c0 c0Var2) {
            int i8 = 0;
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if (!c0Var.f(i9).equals(c0Var2.f(i9))) {
                    i8 |= i9;
                }
            }
            return i8;
        }

        public static a e(c0 c0Var, c0 c0Var2, int i8) {
            L1.h hVarF = c0Var.f(i8);
            L1.h hVarF2 = c0Var2.f(i8);
            return new a(L1.h.b(Math.min(hVarF.f4939a, hVarF2.f4939a), Math.min(hVarF.f4940b, hVarF2.f4940b), Math.min(hVarF.f4941c, hVarF2.f4941c), Math.min(hVarF.f4942d, hVarF2.f4942d)), L1.h.b(Math.max(hVarF.f4939a, hVarF2.f4939a), Math.max(hVarF.f4940b, hVarF2.f4940b), Math.max(hVarF.f4941c, hVarF2.f4941c), Math.max(hVarF.f4942d, hVarF2.f4942d)));
        }

        public static Interpolator f(int i8, c0 c0Var, c0 c0Var2) {
            if ((i8 & 8) != 0) {
                return c0Var.f(c0.m.c()).f4942d > c0Var2.f(c0.m.c()).f4942d ? f10053e : f10054f;
            }
            return f10055g;
        }

        public static View.OnApplyWindowInsetsListener g(View view, b bVar) {
            return new a(view, bVar);
        }

        public static void h(View view, X x8) {
            b bVarM = m(view);
            if (bVarM != null) {
                bVarM.c(x8);
                if (bVarM.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    h(viewGroup.getChildAt(i8), x8);
                }
            }
        }

        public static void i(View view, X x8, WindowInsets windowInsets, boolean z8) {
            b bVarM = m(view);
            if (bVarM != null) {
                bVarM.f10051a = windowInsets;
                if (!z8) {
                    bVarM.d(x8);
                    z8 = bVarM.b() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    i(viewGroup.getChildAt(i8), x8, windowInsets, z8);
                }
            }
        }

        public static void j(View view, c0 c0Var, List list) {
            b bVarM = m(view);
            if (bVarM != null) {
                c0Var = bVarM.e(c0Var, list);
                if (bVarM.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    j(viewGroup.getChildAt(i8), c0Var, list);
                }
            }
        }

        public static void k(View view, X x8, a aVar) {
            b bVarM = m(view);
            if (bVarM != null) {
                bVarM.f(x8, aVar);
                if (bVarM.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    k(viewGroup.getChildAt(i8), x8, aVar);
                }
            }
        }

        public static WindowInsets l(View view, WindowInsets windowInsets) {
            return view.getTag(G1.d.f2623L) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static b m(View view) {
            Object tag = view.getTag(G1.d.f2629R);
            if (tag instanceof a) {
                return ((a) tag).f10056a;
            }
            return null;
        }

        public static c0 n(c0 c0Var, c0 c0Var2, float f8, int i8) {
            c0.b bVar = new c0.b(c0Var);
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) == 0) {
                    bVar.b(i9, c0Var.f(i9));
                } else {
                    L1.h hVarF = c0Var.f(i9);
                    L1.h hVarF2 = c0Var2.f(i9);
                    float f9 = 1.0f - f8;
                    bVar.b(i9, c0.n(hVarF, (int) (((double) ((hVarF.f4939a - hVarF2.f4939a) * f9)) + 0.5d), (int) (((double) ((hVarF.f4940b - hVarF2.f4940b) * f9)) + 0.5d), (int) (((double) ((hVarF.f4941c - hVarF2.f4941c) * f9)) + 0.5d), (int) (((double) ((hVarF.f4942d - hVarF2.f4942d) * f9)) + 0.5d)));
                }
            }
            return bVar.a();
        }

        public static void o(View view, b bVar) {
            Object tag = view.getTag(G1.d.f2623L);
            if (bVar == null) {
                view.setTag(G1.d.f2629R, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerG = g(view, bVar);
            view.setTag(G1.d.f2629R, onApplyWindowInsetsListenerG);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerG);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f10078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Interpolator f10079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f10080d;

        public e(int i8, Interpolator interpolator, long j8) {
            this.f10077a = i8;
            this.f10079c = interpolator;
            this.f10080d = j8;
        }

        public long a() {
            return this.f10080d;
        }

        public float b() {
            Interpolator interpolator = this.f10079c;
            return interpolator != null ? interpolator.getInterpolation(this.f10078b) : this.f10078b;
        }

        public void c(float f8) {
            this.f10078b = f8;
        }
    }

    public X(int i8, Interpolator interpolator, long j8) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f10048a = new d(i8, interpolator, j8);
        } else {
            this.f10048a = new c(i8, interpolator, j8);
        }
    }

    public static void c(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.g(view, bVar);
        } else {
            c.o(view, bVar);
        }
    }

    public static X e(WindowInsetsAnimation windowInsetsAnimation) {
        return new X(windowInsetsAnimation);
    }

    public long a() {
        return this.f10048a.a();
    }

    public float b() {
        return this.f10048a.b();
    }

    public void d(float f8) {
        this.f10048a.c(f8);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final WindowInsetsAnimation f10072e;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class a extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f10073a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public List f10074b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public ArrayList f10075c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final HashMap f10076d;

            public a(b bVar) {
                super(bVar.b());
                this.f10076d = new HashMap();
                this.f10073a = bVar;
            }

            public final X a(WindowInsetsAnimation windowInsetsAnimation) {
                X x8 = (X) this.f10076d.get(windowInsetsAnimation);
                if (x8 != null) {
                    return x8;
                }
                X xE = X.e(windowInsetsAnimation);
                this.f10076d.put(windowInsetsAnimation, xE);
                return xE;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f10073a.c(a(windowInsetsAnimation));
                this.f10076d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f10073a.d(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f10075c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f10075c = arrayList2;
                    this.f10074b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = b0.a(list.get(size));
                    X xA = a(windowInsetsAnimationA);
                    xA.d(windowInsetsAnimationA.getFraction());
                    this.f10075c.add(xA);
                }
                return this.f10073a.e(c0.w(windowInsets), this.f10074b).v();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f10073a.f(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f10072e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds d(a aVar) {
            a0.a();
            return Z.a(aVar.a().e(), aVar.b().e());
        }

        public static L1.h e(WindowInsetsAnimation.Bounds bounds) {
            return L1.h.d(bounds.getUpperBound());
        }

        public static L1.h f(WindowInsetsAnimation.Bounds bounds) {
            return L1.h.d(bounds.getLowerBound());
        }

        public static void g(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // U1.X.e
        public long a() {
            return this.f10072e.getDurationMillis();
        }

        @Override // U1.X.e
        public float b() {
            return this.f10072e.getInterpolatedFraction();
        }

        @Override // U1.X.e
        public void c(float f8) {
            this.f10072e.setFraction(f8);
        }

        public d(int i8, Interpolator interpolator, long j8) {
            this(Y.a(i8, interpolator, j8));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final L1.h f10049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final L1.h f10050b;

        public a(L1.h hVar, L1.h hVar2) {
            this.f10049a = hVar;
            this.f10050b = hVar2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public L1.h a() {
            return this.f10049a;
        }

        public L1.h b() {
            return this.f10050b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.d(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f10049a + " upper=" + this.f10050b + "}";
        }

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.f10049a = d.f(bounds);
            this.f10050b = d.e(bounds);
        }
    }

    public X(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f10048a = new d(windowInsetsAnimation);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WindowInsets f10051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10052b;

        public b(int i8) {
            this.f10052b = i8;
        }

        public final int b() {
            return this.f10052b;
        }

        public abstract c0 e(c0 c0Var, List list);

        public void c(X x8) {
        }

        public void d(X x8) {
        }

        public a f(X x8, a aVar) {
            return aVar;
        }
    }
}
