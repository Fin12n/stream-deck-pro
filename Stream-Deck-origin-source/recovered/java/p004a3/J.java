package p004a3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p058g3.h;
import p085j3.c;
import p103l3.v;
import p121n3.d;
import p121n3.e;
import p121n3.g;
import p121n3.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class J extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final boolean f13073f0 = false;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final List f13074g0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Executor f13075h0 = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new e());

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Bitmap f13076A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Canvas f13077B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Rect f13078C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public RectF f13079D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Paint f13080E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Rect f13081F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Rect f13082G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public RectF f13083H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public RectF f13084I;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Matrix f13085V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Matrix f13086W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f13087X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public EnumC1695a f13088Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f13089Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1705k f13090a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Semaphore f13091a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f13092b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Handler f13093b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13094c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Runnable f13095c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13096d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Runnable f13097d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13098e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f13099e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f13100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f13101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p049f3.b f13102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f13103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p049f3.a f13104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map f13105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f13106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C1696b f13107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public X f13108n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13109o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13110p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13111q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f13112r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13113s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13114t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13115u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13116v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f13117w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public V f13118x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f13119y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Matrix f13120z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void a(C1705k c1705k);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum b {
        NONE,
        PLAY,
        RESUME
    }

    public J() {
        g gVar = new g();
        this.f13092b = gVar;
        this.f13094c = true;
        this.f13096d = false;
        this.f13098e = false;
        this.f13100f = b.NONE;
        this.f13101g = new ArrayList();
        this.f13110p = false;
        this.f13111q = true;
        this.f13113s = 255;
        this.f13117w = false;
        this.f13118x = V.AUTOMATIC;
        this.f13119y = false;
        this.f13120z = new Matrix();
        this.f13087X = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: a3.D
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                J.g(this.f13064a, valueAnimator);
            }
        };
        this.f13089Z = animatorUpdateListener;
        this.f13091a0 = new Semaphore(1);
        this.f13097d0 = new Runnable() { // from class: a3.E
            @Override // java.lang.Runnable
            public final void run() {
                J.k(this.f13065a);
            }
        };
        this.f13099e0 = -3.4028235E38f;
        gVar.addUpdateListener(animatorUpdateListener);
    }

    public static /* synthetic */ void g(J j8, ValueAnimator valueAnimator) {
        if (j8.F()) {
            j8.invalidateSelf();
            return;
        }
        c cVar = j8.f13112r;
        if (cVar != null) {
            cVar.M(j8.f13092b.l());
        }
    }

    public static /* synthetic */ void k(final J j8) {
        c cVar = j8.f13112r;
        if (cVar == null) {
            return;
        }
        try {
            j8.f13091a0.acquire();
            cVar.M(j8.f13092b.l());
            if (f13073f0 && j8.f13087X) {
                if (j8.f13093b0 == null) {
                    j8.f13093b0 = new Handler(Looper.getMainLooper());
                    j8.f13095c0 = new Runnable() { // from class: a3.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            J.n(this.f13321a);
                        }
                    };
                }
                j8.f13093b0.post(j8.f13095c0);
            }
        } catch (InterruptedException unused) {
        } finally {
            j8.f13091a0.release();
        }
    }

    public static /* synthetic */ void n(J j8) {
        Drawable.Callback callback = j8.getCallback();
        if (callback != null) {
            callback.invalidateDrawable(j8);
        }
    }

    public boolean A() {
        return this.f13109o;
    }

    public void A0(final String str) {
        C1705k c1705k = this.f13090a;
        if (c1705k == null) {
            this.f13101g.add(new a() { // from class: a3.B
                @Override // a3.J.a
                public final void a(C1705k c1705k2) {
                    this.f13060a.A0(str);
                }
            });
            return;
        }
        h hVarL = c1705k.l(str);
        if (hVarL != null) {
            z0((int) (hVarL.f23718b + hVarL.f23719c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void B() {
        this.f13101g.clear();
        this.f13092b.k();
        if (isVisible()) {
            return;
        }
        this.f13100f = b.NONE;
    }

    public void B0(final float f8) {
        C1705k c1705k = this.f13090a;
        if (c1705k == null) {
            this.f13101g.add(new a() { // from class: a3.x
                @Override // a3.J.a
                public final void a(C1705k c1705k2) {
                    this.f13316a.B0(f8);
                }
            });
        } else {
            this.f13092b.F(i.i(c1705k.p(), this.f13090a.f(), f8));
        }
    }

    public final void C(int i8, int i9) {
        Bitmap bitmap = this.f13076A;
        if (bitmap == null || bitmap.getWidth() < i8 || this.f13076A.getHeight() < i9) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
            this.f13076A = bitmapCreateBitmap;
            this.f13077B.setBitmap(bitmapCreateBitmap);
            this.f13087X = true;
            return;
        }
        if (this.f13076A.getWidth() > i8 || this.f13076A.getHeight() > i9) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f13076A, 0, 0, i8, i9);
            this.f13076A = bitmapCreateBitmap2;
            this.f13077B.setBitmap(bitmapCreateBitmap2);
            this.f13087X = true;
        }
    }

    public void C0(final int i8, final int i9) {
        if (this.f13090a == null) {
            this.f13101g.add(new a() { // from class: a3.y
                @Override // a3.J.a
                public final void a(C1705k c1705k) {
                    this.f13318a.C0(i8, i9);
                }
            });
        } else {
            this.f13092b.G(i8, i9 + 0.99f);
        }
    }

    public final void D() {
        if (this.f13077B != null) {
            return;
        }
        this.f13077B = new Canvas();
        this.f13084I = new RectF();
        this.f13085V = new Matrix();
        this.f13086W = new Matrix();
        this.f13078C = new Rect();
        this.f13079D = new RectF();
        this.f13080E = new p013b3.a();
        this.f13081F = new Rect();
        this.f13082G = new Rect();
        this.f13083H = new RectF();
    }

    public void D0(final String str) {
        C1705k c1705k = this.f13090a;
        if (c1705k == null) {
            this.f13101g.add(new a() { // from class: a3.t
                @Override // a3.J.a
                public final void a(C1705k c1705k2) {
                    this.f13306a.D0(str);
                }
            });
            return;
        }
        h hVarL = c1705k.l(str);
        if (hVarL != null) {
            int i8 = (int) hVarL.f23718b;
            C0(i8, ((int) hVarL.f23719c) + i8);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public EnumC1695a E() {
        EnumC1695a enumC1695a = this.f13088Y;
        return enumC1695a != null ? enumC1695a : AbstractC1699e.d();
    }

    public void E0(final int i8) {
        if (this.f13090a == null) {
            this.f13101g.add(new a() { // from class: a3.v
                @Override // a3.J.a
                public final void a(C1705k c1705k) {
                    this.f13310a.E0(i8);
                }
            });
        } else {
            this.f13092b.H(i8);
        }
    }

    public boolean F() {
        return E() == EnumC1695a.ENABLED;
    }

    public void F0(final String str) {
        C1705k c1705k = this.f13090a;
        if (c1705k == null) {
            this.f13101g.add(new a() { // from class: a3.C
                @Override // a3.J.a
                public final void a(C1705k c1705k2) {
                    this.f13062a.F0(str);
                }
            });
            return;
        }
        h hVarL = c1705k.l(str);
        if (hVarL != null) {
            E0((int) hVarL.f23718b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public Bitmap G(String str) {
        p049f3.b bVarN = N();
        if (bVarN != null) {
            return bVarN.a(str);
        }
        return null;
    }

    public void G0(final float f8) {
        C1705k c1705k = this.f13090a;
        if (c1705k == null) {
            this.f13101g.add(new a() { // from class: a3.G
                @Override // a3.J.a
                public final void a(C1705k c1705k2) {
                    this.f13067a.G0(f8);
                }
            });
        } else {
            E0((int) i.i(c1705k.p(), this.f13090a.f(), f8));
        }
    }

    public boolean H() {
        return this.f13117w;
    }

    public void H0(boolean z8) {
        if (this.f13115u == z8) {
            return;
        }
        this.f13115u = z8;
        c cVar = this.f13112r;
        if (cVar != null) {
            cVar.K(z8);
        }
    }

    public boolean I() {
        return this.f13111q;
    }

    public void I0(boolean z8) {
        this.f13114t = z8;
        C1705k c1705k = this.f13090a;
        if (c1705k != null) {
            c1705k.w(z8);
        }
    }

    public C1705k J() {
        return this.f13090a;
    }

    public void J0(final float f8) {
        if (this.f13090a == null) {
            this.f13101g.add(new a() { // from class: a3.H
                @Override // a3.J.a
                public final void a(C1705k c1705k) {
                    this.f13069a.J0(f8);
                }
            });
            return;
        }
        AbstractC1699e.b("Drawable#setProgress");
        this.f13092b.E(this.f13090a.h(f8));
        AbstractC1699e.c("Drawable#setProgress");
    }

    public final Context K() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public void K0(V v8) {
        this.f13118x = v8;
        u();
    }

    public final p049f3.a L() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f13104j == null) {
            p049f3.a aVar = new p049f3.a(getCallback(), this.f13107m);
            this.f13104j = aVar;
            String str = this.f13106l;
            if (str != null) {
                aVar.c(str);
            }
        }
        return this.f13104j;
    }

    public void L0(int i8) {
        this.f13092b.setRepeatCount(i8);
    }

    public int M() {
        return (int) this.f13092b.m();
    }

    public void M0(int i8) {
        this.f13092b.setRepeatMode(i8);
    }

    public final p049f3.b N() {
        p049f3.b bVar = this.f13102h;
        if (bVar != null && !bVar.b(K())) {
            this.f13102h = null;
        }
        if (this.f13102h == null) {
            this.f13102h = new p049f3.b(getCallback(), this.f13103i, null, this.f13090a.j());
        }
        return this.f13102h;
    }

    public void N0(boolean z8) {
        this.f13098e = z8;
    }

    public String O() {
        return this.f13103i;
    }

    public void O0(float f8) {
        this.f13092b.I(f8);
    }

    public K P(String str) {
        C1705k c1705k = this.f13090a;
        if (c1705k == null) {
            return null;
        }
        return (K) c1705k.j().get(str);
    }

    public void P0(Boolean bool) {
        this.f13094c = bool.booleanValue();
    }

    public boolean Q() {
        return this.f13110p;
    }

    public void Q0(X x8) {
        this.f13108n = x8;
    }

    public final h R() {
        Iterator it = f13074g0.iterator();
        h hVarL = null;
        while (it.hasNext()) {
            hVarL = this.f13090a.l((String) it.next());
            if (hVarL != null) {
                break;
            }
        }
        return hVarL;
    }

    public void R0(boolean z8) {
        this.f13092b.J(z8);
    }

    public float S() {
        return this.f13092b.p();
    }

    public final boolean S0() {
        C1705k c1705k = this.f13090a;
        if (c1705k == null) {
            return false;
        }
        float f8 = this.f13099e0;
        float fL = this.f13092b.l();
        this.f13099e0 = fL;
        return Math.abs(fL - f8) * c1705k.d() >= 50.0f;
    }

    public float T() {
        return this.f13092b.q();
    }

    public boolean T0() {
        return this.f13105k == null && this.f13108n == null && this.f13090a.c().k() > 0;
    }

    public S U() {
        C1705k c1705k = this.f13090a;
        if (c1705k != null) {
            return c1705k.n();
        }
        return null;
    }

    public float V() {
        return this.f13092b.l();
    }

    public V W() {
        return this.f13119y ? V.SOFTWARE : V.HARDWARE;
    }

    public int X() {
        return this.f13092b.getRepeatCount();
    }

    public int Y() {
        return this.f13092b.getRepeatMode();
    }

    public float Z() {
        return this.f13092b.r();
    }

    public X a0() {
        return this.f13108n;
    }

    public Typeface b0(p058g3.c cVar) {
        Map map = this.f13105k;
        if (map != null) {
            String strA = cVar.a();
            if (map.containsKey(strA)) {
                return (Typeface) map.get(strA);
            }
            String strB = cVar.b();
            if (map.containsKey(strB)) {
                return (Typeface) map.get(strB);
            }
            String str = cVar.a() + "-" + cVar.c();
            if (map.containsKey(str)) {
                return (Typeface) map.get(str);
            }
        }
        p049f3.a aVarL = L();
        if (aVarL != null) {
            return aVarL.b(cVar);
        }
        return null;
    }

    public final boolean c0() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (parent instanceof ViewGroup) {
            return !((ViewGroup) parent).getClipChildren();
        }
        return false;
    }

    public boolean d0() {
        g gVar = this.f13092b;
        if (gVar == null) {
            return false;
        }
        return gVar.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        c cVar = this.f13112r;
        if (cVar == null) {
            return;
        }
        boolean zF = F();
        if (zF) {
            try {
                this.f13091a0.acquire();
            } catch (InterruptedException unused) {
                AbstractC1699e.c("Drawable#draw");
                if (!zF) {
                    return;
                }
                this.f13091a0.release();
                if (cVar.P() == this.f13092b.l()) {
                    return;
                }
            } catch (Throwable th) {
                AbstractC1699e.c("Drawable#draw");
                if (zF) {
                    this.f13091a0.release();
                    if (cVar.P() != this.f13092b.l()) {
                        f13075h0.execute(this.f13097d0);
                    }
                }
                throw th;
            }
        }
        AbstractC1699e.b("Drawable#draw");
        if (zF && S0()) {
            J0(this.f13092b.l());
        }
        if (this.f13098e) {
            try {
                if (this.f13119y) {
                    i0(canvas, cVar);
                } else {
                    y(canvas);
                }
            } catch (Throwable th2) {
                d.b("Lottie crashed in draw!", th2);
            }
        } else if (this.f13119y) {
            i0(canvas, cVar);
        } else {
            y(canvas);
        }
        this.f13087X = false;
        AbstractC1699e.c("Drawable#draw");
        if (zF) {
            this.f13091a0.release();
            if (cVar.P() == this.f13092b.l()) {
                return;
            }
            f13075h0.execute(this.f13097d0);
        }
    }

    public boolean e0() {
        if (isVisible()) {
            return this.f13092b.isRunning();
        }
        b bVar = this.f13100f;
        return bVar == b.PLAY || bVar == b.RESUME;
    }

    public boolean f0() {
        return this.f13116v;
    }

    public void g0() {
        this.f13101g.clear();
        this.f13092b.u();
        if (isVisible()) {
            return;
        }
        this.f13100f = b.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f13113s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        C1705k c1705k = this.f13090a;
        if (c1705k == null) {
            return -1;
        }
        return c1705k.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        C1705k c1705k = this.f13090a;
        if (c1705k == null) {
            return -1;
        }
        return c1705k.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h0() {
        if (this.f13112r == null) {
            this.f13101g.add(new a() { // from class: a3.F
                @Override // a3.J.a
                public final void a(C1705k c1705k) {
                    this.f13066a.h0();
                }
            });
            return;
        }
        u();
        if (r() || X() == 0) {
            if (isVisible()) {
                this.f13092b.v();
                this.f13100f = b.NONE;
            } else {
                this.f13100f = b.PLAY;
            }
        }
        if (r()) {
            return;
        }
        h hVarR = R();
        if (hVarR != null) {
            u0((int) hVarR.f23718b);
        } else {
            u0((int) (Z() < 0.0f ? T() : S()));
        }
        this.f13092b.k();
        if (isVisible()) {
            return;
        }
        this.f13100f = b.NONE;
    }

    public final void i0(Canvas canvas, c cVar) {
        if (this.f13090a == null || cVar == null) {
            return;
        }
        D();
        canvas.getMatrix(this.f13085V);
        canvas.getClipBounds(this.f13078C);
        v(this.f13078C, this.f13079D);
        this.f13085V.mapRect(this.f13079D);
        w(this.f13079D, this.f13078C);
        if (this.f13111q) {
            this.f13084I.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cVar.d(this.f13084I, null, false);
        }
        this.f13085V.mapRect(this.f13084I);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        l0(this.f13084I, fWidth, fHeight);
        if (!c0()) {
            RectF rectF = this.f13084I;
            Rect rect = this.f13078C;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.f13084I.width());
        int iCeil2 = (int) Math.ceil(this.f13084I.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            return;
        }
        C(iCeil, iCeil2);
        if (this.f13087X) {
            this.f13120z.set(this.f13085V);
            this.f13120z.preScale(fWidth, fHeight);
            Matrix matrix = this.f13120z;
            RectF rectF2 = this.f13084I;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f13076A.eraseColor(0);
            cVar.f(this.f13077B, this.f13120z, this.f13113s);
            this.f13085V.invert(this.f13086W);
            this.f13086W.mapRect(this.f13083H, this.f13084I);
            w(this.f13083H, this.f13082G);
        }
        this.f13081F.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f13076A, this.f13081F, this.f13082G, this.f13080E);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f13087X) {
            return;
        }
        this.f13087X = true;
        if ((!f13073f0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return d0();
    }

    public List j0(p058g3.e eVar) {
        if (this.f13112r == null) {
            d.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.f13112r.g(eVar, 0, arrayList, new p058g3.e(new String[0]));
        return arrayList;
    }

    public void k0() {
        if (this.f13112r == null) {
            this.f13101g.add(new a() { // from class: a3.A
                @Override // a3.J.a
                public final void a(C1705k c1705k) {
                    this.f13059a.k0();
                }
            });
            return;
        }
        u();
        if (r() || X() == 0) {
            if (isVisible()) {
                this.f13092b.B();
                this.f13100f = b.NONE;
            } else {
                this.f13100f = b.RESUME;
            }
        }
        if (r()) {
            return;
        }
        u0((int) (Z() < 0.0f ? T() : S()));
        this.f13092b.k();
        if (isVisible()) {
            return;
        }
        this.f13100f = b.NONE;
    }

    public final void l0(RectF rectF, float f8, float f9) {
        rectF.set(rectF.left * f8, rectF.top * f9, rectF.right * f8, rectF.bottom * f9);
    }

    public void m0(boolean z8) {
        this.f13116v = z8;
    }

    public void n0(EnumC1695a enumC1695a) {
        this.f13088Y = enumC1695a;
    }

    public void o0(boolean z8) {
        if (z8 != this.f13117w) {
            this.f13117w = z8;
            invalidateSelf();
        }
    }

    public void p0(boolean z8) {
        if (z8 != this.f13111q) {
            this.f13111q = z8;
            c cVar = this.f13112r;
            if (cVar != null) {
                cVar.Q(z8);
            }
            invalidateSelf();
        }
    }

    public void q(final p058g3.e eVar, final Object obj, final p130o3.c cVar) {
        c cVar2 = this.f13112r;
        if (cVar2 == null) {
            this.f13101g.add(new a() { // from class: a3.w
                @Override // a3.J.a
                public final void a(C1705k c1705k) {
                    this.f13312a.q(eVar, obj, cVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (eVar == p058g3.e.f23712c) {
            cVar2.c(obj, cVar);
        } else if (eVar.d() != null) {
            eVar.d().c(obj, cVar);
        } else {
            List listJ0 = j0(eVar);
            for (int i8 = 0; i8 < listJ0.size(); i8++) {
                ((p058g3.e) listJ0.get(i8)).d().c(obj, cVar);
            }
            zIsEmpty = true ^ listJ0.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == N.f13135E) {
                J0(V());
            }
        }
    }

    public boolean q0(C1705k c1705k) {
        if (this.f13090a == c1705k) {
            return false;
        }
        this.f13087X = true;
        t();
        this.f13090a = c1705k;
        s();
        this.f13092b.D(c1705k);
        J0(this.f13092b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f13101g).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.a(c1705k);
            }
            it.remove();
        }
        this.f13101g.clear();
        c1705k.w(this.f13114t);
        u();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final boolean r() {
        return this.f13094c || this.f13096d;
    }

    public void r0(String str) {
        this.f13106l = str;
        p049f3.a aVarL = L();
        if (aVarL != null) {
            aVarL.c(str);
        }
    }

    public final void s() {
        C1705k c1705k = this.f13090a;
        if (c1705k == null) {
            return;
        }
        c cVar = new c(this, v.a(c1705k), c1705k.k(), c1705k);
        this.f13112r = cVar;
        if (this.f13115u) {
            cVar.K(true);
        }
        this.f13112r.Q(this.f13111q);
    }

    public void s0(C1696b c1696b) {
        this.f13107m = c1696b;
        p049f3.a aVar = this.f13104j;
        if (aVar != null) {
            aVar.d(c1696b);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.f13113s = i8;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z8, boolean z9) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z8, z9);
        if (z8) {
            b bVar = this.f13100f;
            if (bVar == b.PLAY) {
                h0();
                return visible;
            }
            if (bVar == b.RESUME) {
                k0();
                return visible;
            }
        } else {
            if (this.f13092b.isRunning()) {
                g0();
                this.f13100f = b.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.f13100f = b.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        h0();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        B();
    }

    public void t() {
        if (this.f13092b.isRunning()) {
            this.f13092b.cancel();
            if (!isVisible()) {
                this.f13100f = b.NONE;
            }
        }
        this.f13090a = null;
        this.f13112r = null;
        this.f13102h = null;
        this.f13099e0 = -3.4028235E38f;
        this.f13092b.i();
        invalidateSelf();
    }

    public void t0(Map map) {
        if (map == this.f13105k) {
            return;
        }
        this.f13105k = map;
        invalidateSelf();
    }

    public final void u() {
        C1705k c1705k = this.f13090a;
        if (c1705k == null) {
            return;
        }
        this.f13119y = this.f13118x.b(Build.VERSION.SDK_INT, c1705k.q(), c1705k.m());
    }

    public void u0(final int i8) {
        if (this.f13090a == null) {
            this.f13101g.add(new a() { // from class: a3.I
                @Override // a3.J.a
                public final void a(C1705k c1705k) {
                    this.f13071a.u0(i8);
                }
            });
        } else {
            this.f13092b.E(i8);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void v0(boolean z8) {
        this.f13096d = z8;
    }

    public final void w(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public void w0(InterfaceC1697c interfaceC1697c) {
        p049f3.b bVar = this.f13102h;
        if (bVar != null) {
            bVar.d(interfaceC1697c);
        }
    }

    public void x(Canvas canvas, Matrix matrix) {
        float fP;
        float fL;
        c cVar = this.f13112r;
        C1705k c1705k = this.f13090a;
        if (cVar == null || c1705k == null) {
            return;
        }
        boolean zF = F();
        if (zF) {
            try {
                this.f13091a0.acquire();
                if (S0()) {
                    J0(this.f13092b.l());
                }
            } catch (InterruptedException unused) {
                if (zF) {
                    if (fP != fL) {
                        return;
                    } else {
                        return;
                    }
                }
                return;
            } finally {
                if (zF) {
                    this.f13091a0.release();
                    if (cVar.P() != this.f13092b.l()) {
                        f13075h0.execute(this.f13097d0);
                    }
                }
            }
        }
        if (this.f13119y) {
            canvas.save();
            canvas.concat(matrix);
            i0(canvas, cVar);
            canvas.restore();
        } else {
            cVar.f(canvas, matrix, this.f13113s);
        }
        this.f13087X = false;
    }

    public void x0(String str) {
        this.f13103i = str;
    }

    public final void y(Canvas canvas) {
        c cVar = this.f13112r;
        C1705k c1705k = this.f13090a;
        if (cVar == null || c1705k == null) {
            return;
        }
        this.f13120z.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            this.f13120z.preScale(bounds.width() / c1705k.b().width(), bounds.height() / c1705k.b().height());
            this.f13120z.preTranslate(bounds.left, bounds.top);
        }
        cVar.f(canvas, this.f13120z, this.f13113s);
    }

    public void y0(boolean z8) {
        this.f13110p = z8;
    }

    public void z(boolean z8) {
        if (this.f13109o == z8) {
            return;
        }
        this.f13109o = z8;
        if (this.f13090a != null) {
            s();
        }
    }

    public void z0(final int i8) {
        if (this.f13090a == null) {
            this.f13101g.add(new a() { // from class: a3.u
                @Override // a3.J.a
                public final void a(C1705k c1705k) {
                    this.f13308a.z0(i8);
                }
            });
        } else {
            this.f13092b.F(i8 + 0.99f);
        }
    }
}
