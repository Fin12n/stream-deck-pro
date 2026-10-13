package p183v0;

import Q0.f;
import S6.c;
import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p073i0.p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class l extends View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f35019f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f35020g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f35021h = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f35022i = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f35023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f35024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f35025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f35026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Function0 f35027e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public l(Context context) {
        super(context);
    }

    private final void setRippleState(boolean z8) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f35026d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l8 = this.f35025c;
        long jLongValue = jCurrentAnimationTimeMillis - (l8 != null ? l8.longValue() : 0L);
        if (z8 || jLongValue >= 5) {
            int[] iArr = z8 ? f35021h : f35022i;
            r rVar = this.f35023a;
            if (rVar != null) {
                rVar.setState(iArr);
            }
        } else {
            Runnable runnable2 = new Runnable() { // from class: v0.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.setRippleState$lambda$2(this.f35018a);
                }
            };
            this.f35026d = runnable2;
            postDelayed(runnable2, 50L);
        }
        this.f35025c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(l lVar) {
        r rVar = lVar.f35023a;
        if (rVar != null) {
            rVar.setState(f35022i);
        }
        lVar.f35026d = null;
    }

    public final void b(p pVar, boolean z8, long j8, int i8, long j9, float f8, Function0 function0) {
        if (this.f35023a == null || !t.c(Boolean.valueOf(z8), this.f35024b)) {
            c(z8);
            this.f35024b = Boolean.valueOf(z8);
        }
        r rVar = this.f35023a;
        t.d(rVar);
        this.f35027e = function0;
        f(j8, i8, j9, f8);
        if (z8) {
            rVar.setHotspot(f.o(pVar.a()), f.p(pVar.a()));
        } else {
            rVar.setHotspot(rVar.getBounds().centerX(), rVar.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c(boolean z8) {
        r rVar = new r(z8);
        setBackground(rVar);
        this.f35023a = rVar;
    }

    public final void d() {
        this.f35027e = null;
        Runnable runnable = this.f35026d;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f35026d;
            t.d(runnable2);
            runnable2.run();
        } else {
            r rVar = this.f35023a;
            if (rVar != null) {
                rVar.setState(f35022i);
            }
        }
        r rVar2 = this.f35023a;
        if (rVar2 == null) {
            return;
        }
        rVar2.setVisible(false, false);
        unscheduleDrawable(rVar2);
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long j8, int i8, long j9, float f8) {
        r rVar = this.f35023a;
        if (rVar == null) {
            return;
        }
        rVar.c(i8);
        rVar.b(j9, f8);
        Rect rect = new Rect(0, 0, c.d(Q0.l.i(j8)), c.d(Q0.l.g(j8)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        rVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Function0 function0 = this.f35027e;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i8, int i9) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    @Override // android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
    }
}
