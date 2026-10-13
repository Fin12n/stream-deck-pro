package p003a2;

import U1.I;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f13027r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f13030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f13031d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13035h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13041n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13042o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13043p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13044q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0329a f13028a = new C0329a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Interpolator f13029b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f13032e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f13033f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f13036i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f13037j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f13038k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: a2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class C0329a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f13047c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f13048d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f13054j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f13055k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f13049e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f13053i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f13050f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13051g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f13052h = 0;

        public void a() {
            if (this.f13050f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j8 = jCurrentAnimationTimeMillis - this.f13050f;
            this.f13050f = jCurrentAnimationTimeMillis;
            float f8 = j8 * fG;
            this.f13051g = (int) (this.f13047c * f8);
            this.f13052h = (int) (f8 * this.f13048d);
        }

        public int b() {
            return this.f13051g;
        }

        public int c() {
            return this.f13052h;
        }

        public int d() {
            float f8 = this.f13047c;
            return (int) (f8 / Math.abs(f8));
        }

        public final float e(long j8) {
            long j9 = this.f13049e;
            if (j8 < j9) {
                return 0.0f;
            }
            long j10 = this.f13053i;
            if (j10 < 0 || j8 < j10) {
                return a.e((j8 - j9) / this.f13045a, 0.0f, 1.0f) * 0.5f;
            }
            float f8 = this.f13054j;
            return (1.0f - f8) + (f8 * a.e((j8 - j10) / this.f13055k, 0.0f, 1.0f));
        }

        public int f() {
            float f8 = this.f13048d;
            return (int) (f8 / Math.abs(f8));
        }

        public final float g(float f8) {
            return ((-4.0f) * f8 * f8) + (f8 * 4.0f);
        }

        public boolean h() {
            return this.f13053i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f13053i + ((long) this.f13055k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f13055k = a.f((int) (jCurrentAnimationTimeMillis - this.f13049e), 0, this.f13046b);
            this.f13054j = e(jCurrentAnimationTimeMillis);
            this.f13053i = jCurrentAnimationTimeMillis;
        }

        public void j(int i8) {
            this.f13046b = i8;
        }

        public void k(int i8) {
            this.f13045a = i8;
        }

        public void l(float f8, float f9) {
            this.f13047c = f8;
            this.f13048d = f9;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f13049e = jCurrentAnimationTimeMillis;
            this.f13053i = -1L;
            this.f13050f = jCurrentAnimationTimeMillis;
            this.f13054j = 0.5f;
            this.f13051g = 0;
            this.f13052h = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f13042o) {
                if (aVar.f13040m) {
                    aVar.f13040m = false;
                    aVar.f13028a.m();
                }
                C0329a c0329a = a.this.f13028a;
                if (c0329a.h() || !a.this.u()) {
                    a.this.f13042o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f13041n) {
                    aVar2.f13041n = false;
                    aVar2.c();
                }
                c0329a.a();
                a.this.j(c0329a.b(), c0329a.c());
                I.D(a.this.f13030c, this);
            }
        }
    }

    public a(View view) {
        this.f13030c = view;
        float f8 = Resources.getSystem().getDisplayMetrics().density;
        float f9 = (int) ((1575.0f * f8) + 0.5f);
        o(f9, f9);
        float f10 = (int) ((f8 * 315.0f) + 0.5f);
        p(f10, f10);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f13027r);
        r(500);
        q(500);
    }

    public static float e(float f8, float f9, float f10) {
        if (f8 > f10) {
            return f10;
        }
        return f8 < f9 ? f9 : f8;
    }

    public static int f(int i8, int i9, int i10) {
        if (i8 > i10) {
            return i10;
        }
        return i8 < i9 ? i9 : i8;
    }

    public abstract boolean a(int i8);

    public abstract boolean b(int i8);

    public void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f13030c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final float d(int i8, float f8, float f9, float f10) {
        float fH = h(this.f13032e[i8], f9, this.f13033f[i8], f8);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f11 = this.f13036i[i8];
        float f12 = this.f13037j[i8];
        float f13 = this.f13038k[i8];
        float f14 = f11 * f10;
        return fH > 0.0f ? e(fH * f14, f12, f13) : -e((-fH) * f14, f12, f13);
    }

    public final float g(float f8, float f9) {
        if (f9 == 0.0f) {
            return 0.0f;
        }
        int i8 = this.f13034g;
        if (i8 == 0 || i8 == 1) {
            if (f8 < f9) {
                if (f8 >= 0.0f) {
                    return 1.0f - (f8 / f9);
                }
                if (this.f13042o && i8 == 1) {
                    return 1.0f;
                }
            }
        } else if (i8 == 2 && f8 < 0.0f) {
            return f8 / (-f9);
        }
        return 0.0f;
    }

    public final float h(float f8, float f9, float f10, float f11) {
        float interpolation;
        float fE = e(f8 * f9, 0.0f, f10);
        float fG = g(f9 - f11, fE) - g(f11, fE);
        if (fG < 0.0f) {
            interpolation = -this.f13029b.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f13029b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public final void i() {
        if (this.f13040m) {
            this.f13042o = false;
        } else {
            this.f13028a.i();
        }
    }

    public abstract void j(int i8, int i9);

    public a k(int i8) {
        this.f13035h = i8;
        return this;
    }

    public a l(int i8) {
        this.f13034g = i8;
        return this;
    }

    public a m(boolean z8) {
        if (this.f13043p && !z8) {
            i();
        }
        this.f13043p = z8;
        return this;
    }

    public a n(float f8, float f9) {
        float[] fArr = this.f13033f;
        fArr[0] = f8;
        fArr[1] = f9;
        return this;
    }

    public a o(float f8, float f9) {
        float[] fArr = this.f13038k;
        fArr[0] = f8 / 1000.0f;
        fArr[1] = f9 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f13043p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    i();
                }
            }
            return !this.f13044q && this.f13042o;
        }
        this.f13041n = true;
        this.f13039l = false;
        this.f13028a.l(d(0, motionEvent.getX(), view.getWidth(), this.f13030c.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f13030c.getHeight()));
        if (!this.f13042o && u()) {
            v();
        }
        if (this.f13044q) {
        }
    }

    public a p(float f8, float f9) {
        float[] fArr = this.f13037j;
        fArr[0] = f8 / 1000.0f;
        fArr[1] = f9 / 1000.0f;
        return this;
    }

    public a q(int i8) {
        this.f13028a.j(i8);
        return this;
    }

    public a r(int i8) {
        this.f13028a.k(i8);
        return this;
    }

    public a s(float f8, float f9) {
        float[] fArr = this.f13032e;
        fArr[0] = f8;
        fArr[1] = f9;
        return this;
    }

    public a t(float f8, float f9) {
        float[] fArr = this.f13036i;
        fArr[0] = f8 / 1000.0f;
        fArr[1] = f9 / 1000.0f;
        return this;
    }

    public boolean u() {
        C0329a c0329a = this.f13028a;
        int iF = c0329a.f();
        int iD = c0329a.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }

    public final void v() {
        int i8;
        if (this.f13031d == null) {
            this.f13031d = new b();
        }
        this.f13042o = true;
        this.f13040m = true;
        if (this.f13039l || (i8 = this.f13035h) <= 0) {
            this.f13031d.run();
        } else {
            I.E(this.f13030c, this.f13031d, i8);
        }
        this.f13039l = true;
    }
}
