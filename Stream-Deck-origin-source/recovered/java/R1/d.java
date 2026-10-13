package R1;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9462b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f9463a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final d a(Activity activity) {
            t.g(activity, "<this>");
            d dVar = new d(activity, null);
            dVar.b();
            return dVar;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f9464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f9466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f9467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Drawable f9468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f9469f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public InterfaceC0261d f9470g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public i f9471h;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f9473b;

            public a(View view) {
                this.f9473b = view;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (b.this.e().b()) {
                    return false;
                }
                this.f9473b.getViewTreeObserver().removeOnPreDrawListener(this);
                i iVar = b.this.f9471h;
                if (iVar == null) {
                    return true;
                }
                b.this.c(iVar);
                return true;
            }
        }

        public b(Activity activity) {
            t.g(activity, "activity");
            this.f9464a = activity;
            this.f9470g = new InterfaceC0261d() { // from class: R1.e
                @Override // R1.d.InterfaceC0261d
                public final boolean b() {
                    return d.b.j();
                }
            };
        }

        public static final boolean j() {
            return false;
        }

        public final void c(i splashScreenViewProvider) {
            t.g(splashScreenViewProvider, "splashScreenViewProvider");
        }

        public final Activity d() {
            return this.f9464a;
        }

        public final InterfaceC0261d e() {
            return this.f9470g;
        }

        public void f() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme currentTheme = this.f9464a.getTheme();
            if (currentTheme.resolveAttribute(R1.a.f9459d, typedValue, true)) {
                this.f9466c = Integer.valueOf(typedValue.resourceId);
                this.f9467d = Integer.valueOf(typedValue.data);
            }
            if (currentTheme.resolveAttribute(R1.a.f9458c, typedValue, true)) {
                this.f9468e = currentTheme.getDrawable(typedValue.resourceId);
            }
            if (currentTheme.resolveAttribute(R1.a.f9457b, typedValue, true)) {
                this.f9469f = typedValue.resourceId == R1.b.f9460a;
            }
            t.f(currentTheme, "currentTheme");
            h(currentTheme, typedValue);
        }

        public void g(InterfaceC0261d keepOnScreenCondition) {
            t.g(keepOnScreenCondition, "keepOnScreenCondition");
            this.f9470g = keepOnScreenCondition;
            View viewFindViewById = this.f9464a.findViewById(R.id.content);
            viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new a(viewFindViewById));
        }

        public final void h(Resources.Theme currentTheme, TypedValue typedValue) {
            t.g(currentTheme, "currentTheme");
            t.g(typedValue, "typedValue");
            if (currentTheme.resolveAttribute(R1.a.f9456a, typedValue, true)) {
                int i8 = typedValue.resourceId;
                this.f9465b = i8;
                if (i8 != 0) {
                    this.f9464a.setTheme(i8);
                }
            }
        }

        public final void i(InterfaceC0261d interfaceC0261d) {
            t.g(interfaceC0261d, "<set-?>");
            this.f9470g = interfaceC0261d;
        }
    }

    /* JADX INFO: renamed from: R1.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface InterfaceC0261d {
        boolean b();
    }

    public /* synthetic */ d(Activity activity, AbstractC2633k abstractC2633k) {
        this(activity);
    }

    public final void b() {
        this.f9463a.f();
    }

    public final void c(InterfaceC0261d condition) {
        t.g(condition, "condition");
        this.f9463a.g(condition);
    }

    public d(Activity activity) {
        this.f9463a = Build.VERSION.SDK_INT >= 31 ? new c(activity) : new b(activity);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ViewTreeObserver.OnPreDrawListener f9474i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f9475j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final ViewGroup.OnHierarchyChangeListener f9476k;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f9480b;

            public b(View view) {
                this.f9480b = view;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (c.this.e().b()) {
                    return false;
                }
                this.f9480b.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity) {
            super(activity);
            t.g(activity, "activity");
            this.f9475j = true;
            this.f9476k = new a(activity);
        }

        @Override // R1.d.b
        public void f() {
            Resources.Theme theme = d().getTheme();
            t.f(theme, "activity.theme");
            h(theme, new TypedValue());
            ((ViewGroup) d().getWindow().getDecorView()).setOnHierarchyChangeListener(this.f9476k);
        }

        @Override // R1.d.b
        public void g(InterfaceC0261d keepOnScreenCondition) {
            t.g(keepOnScreenCondition, "keepOnScreenCondition");
            i(keepOnScreenCondition);
            View viewFindViewById = d().findViewById(R.id.content);
            ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            if (this.f9474i != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f9474i);
            }
            b bVar = new b(viewFindViewById);
            this.f9474i = bVar;
            viewTreeObserver.addOnPreDrawListener(bVar);
        }

        public final boolean k(SplashScreenView child) {
            t.g(child, "child");
            WindowInsets windowInsetsBuild = f.a().build();
            t.f(windowInsetsBuild, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            return (windowInsetsBuild == child.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
        }

        public final void l(boolean z8) {
            this.f9475j = z8;
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements ViewGroup.OnHierarchyChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Activity f9478b;

            public a(Activity activity) {
                this.f9478b = activity;
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                if (g.a(view2)) {
                    c cVar = c.this;
                    cVar.l(cVar.k(h.a(view2)));
                    ((ViewGroup) this.f9478b.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
            }
        }
    }
}
