package E1;

import A1.t;
import C6.G;
import U1.W;
import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p009b.B;
import p009b.E;
import p065h1.V0;
import p215z0.AbstractC3173q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h extends p009b.q implements V0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function0 f2106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f2107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f2108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f2109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f2110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2111i;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {
        public b() {
            super(1);
        }

        public final void b(B b8) {
            if (h.this.f2107e.b()) {
                h.this.f2106d.invoke();
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((B) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2113a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f2113a = iArr;
        }
    }

    public h(Function0 function0, g gVar, View view, t tVar, A1.d dVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), (Build.VERSION.SDK_INT >= 31 || gVar.a()) ? L0.n.f4902a : L0.n.f4903b), 0, 2, null);
        this.f2106d = function0;
        this.f2107e = gVar;
        this.f2108f = view;
        float fM = A1.h.m(8);
        this.f2110h = fM;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        this.f2111i = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        W.b(window, this.f2107e.a());
        f fVar = new f(getContext(), window);
        fVar.setTag(L0.l.f4860H, "Dialog:" + uuid);
        fVar.setClipChildren(false);
        fVar.setElevation(dVar.E0(fM));
        fVar.setOutlineProvider(new a());
        this.f2109g = fVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            g(viewGroup);
        }
        setContentView(fVar);
        T.b(fVar, T.a(view));
        U.b(fVar, U.a(view));
        p217z2.g.b(fVar, p217z2.g.a(view));
        o(this.f2106d, this.f2107e, tVar);
        E.b(b(), this, false, new b(), 2, null);
    }

    public static final void g(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof f) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                g(viewGroup2);
            }
        }
    }

    private final void m(t tVar) {
        f fVar = this.f2109g;
        int i8 = c.f2113a[tVar.ordinal()];
        int i9 = 1;
        if (i8 == 1) {
            i9 = 0;
        } else if (i8 != 2) {
            throw new C6.m();
        }
        fVar.setLayoutDirection(i9);
    }

    public final void j() {
        this.f2109g.e();
    }

    public final void k(AbstractC3173q abstractC3173q, Q6.o oVar) {
        this.f2109g.m(abstractC3173q, oVar);
    }

    public final void n(p pVar) {
        boolean zA = q.a(pVar, E1.b.e(this.f2108f));
        Window window = getWindow();
        kotlin.jvm.internal.t.d(window);
        window.setFlags(zA ? 8192 : -8193, 8192);
    }

    public final void o(Function0 function0, g gVar, t tVar) {
        Window window;
        this.f2106d = function0;
        this.f2107e = gVar;
        n(gVar.d());
        m(tVar);
        if (gVar.e() && !this.f2109g.k() && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        this.f2109g.n(gVar.e());
        if (Build.VERSION.SDK_INT < 31) {
            if (gVar.a()) {
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setSoftInputMode(this.f2111i);
                    return;
                }
                return;
            }
            Window window3 = getWindow();
            if (window3 != null) {
                window3.setSoftInputMode(16);
            }
        }
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent && this.f2107e.c()) {
            this.f2106d.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }
}
