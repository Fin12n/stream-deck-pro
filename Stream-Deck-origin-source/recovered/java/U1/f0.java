package U1;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f10135a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Window f10136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final D f10137b;

        public a(Window window, D d8) {
            this.f10136a = window;
            this.f10137b = d8;
        }

        public void d(int i8) {
            View decorView = this.f10136a.getDecorView();
            decorView.setSystemUiVisibility(i8 | decorView.getSystemUiVisibility());
        }

        public void e(int i8) {
            this.f10136a.addFlags(i8);
        }

        public void f(int i8) {
            View decorView = this.f10136a.getDecorView();
            decorView.setSystemUiVisibility((~i8) & decorView.getSystemUiVisibility());
        }

        public void g(int i8) {
            this.f10136a.clearFlags(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b extends a {
        public b(Window window, D d8) {
            super(window, d8);
        }

        @Override // U1.f0.e
        public boolean a() {
            return (this.f10136a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // U1.f0.e
        public void c(boolean z8) {
            if (!z8) {
                f(8192);
                return;
            }
            g(67108864);
            e(Integer.MIN_VALUE);
            d(8192);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c extends b {
        public c(Window window, D d8) {
            super(window, d8);
        }

        @Override // U1.f0.e
        public void b(boolean z8) {
            if (!z8) {
                f(16);
                return;
            }
            g(134217728);
            e(Integer.MIN_VALUE);
            d(16);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class e {
        public abstract boolean a();

        public abstract void b(boolean z8);

        public abstract void c(boolean z8);
    }

    public f0(Window window, View view) {
        D d8 = new D(view);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f10135a = new d(window, this, d8);
        } else {
            this.f10135a = new c(window, d8);
        }
    }

    public boolean a() {
        return this.f10135a.a();
    }

    public void b(boolean z8) {
        this.f10135a.b(z8);
    }

    public void c(boolean z8) {
        this.f10135a.c(z8);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f10138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WindowInsetsController f10139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final D f10140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p010b0.C f10141d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Window f10142e;

        public d(Window window, f0 f0Var, D d8) {
            this(window.getInsetsController(), f0Var, d8);
            this.f10142e = window;
        }

        @Override // U1.f0.e
        public boolean a() {
            this.f10139b.setSystemBarsAppearance(0, 0);
            return (this.f10139b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // U1.f0.e
        public void b(boolean z8) {
            if (z8) {
                if (this.f10142e != null) {
                    d(16);
                }
                this.f10139b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f10142e != null) {
                    e(16);
                }
                this.f10139b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // U1.f0.e
        public void c(boolean z8) {
            if (z8) {
                if (this.f10142e != null) {
                    d(8192);
                }
                this.f10139b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f10142e != null) {
                    e(8192);
                }
                this.f10139b.setSystemBarsAppearance(0, 8);
            }
        }

        public void d(int i8) {
            View decorView = this.f10142e.getDecorView();
            decorView.setSystemUiVisibility(i8 | decorView.getSystemUiVisibility());
        }

        public void e(int i8) {
            View decorView = this.f10142e.getDecorView();
            decorView.setSystemUiVisibility((~i8) & decorView.getSystemUiVisibility());
        }

        public d(WindowInsetsController windowInsetsController, f0 f0Var, D d8) {
            this.f10141d = new p010b0.C();
            this.f10139b = windowInsetsController;
            this.f10138a = f0Var;
            this.f10140c = d8;
        }
    }
}
