package E1;

import C6.G;
import android.content.Context;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.u;
import p065h1.AbstractC2378a;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3173q;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.P0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC2378a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Window f2095i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC3164l0 f2096j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2097k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2098l;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2100b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8) {
            super(2);
            this.f2100b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            f.this.a(interfaceC3163l, F0.a(this.f2100b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public f(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.f2095i = window;
        this.f2096j = l1.e(d.f2089a.a(), null, 2, null);
    }

    private final Q6.o getContent() {
        return (Q6.o) this.f2096j.getValue();
    }

    private final int getDisplayWidth() {
        return S6.c.d(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final void setContent(Q6.o oVar) {
        this.f2096j.setValue(oVar);
    }

    @Override // p065h1.AbstractC2378a
    public void a(InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1735448596);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1735448596, i8, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:268)");
        }
        getContent().invoke(interfaceC3163lP, 0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new a(i8));
        }
    }

    @Override // p065h1.AbstractC2378a
    public void g(boolean z8, int i8, int i9, int i10, int i11) {
        View childAt;
        super.g(z8, i8, i9, i10, i11);
        if (this.f2097k || (childAt = getChildAt(0)) == null) {
            return;
        }
        l().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    public final int getDisplayHeight() {
        return S6.c.d(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    @Override // p065h1.AbstractC2378a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f2098l;
    }

    @Override // p065h1.AbstractC2378a
    public void h(int i8, int i9) {
        if (this.f2097k) {
            super.h(i8, i9);
        } else {
            super.h(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final boolean k() {
        return this.f2097k;
    }

    public Window l() {
        return this.f2095i;
    }

    public final void m(AbstractC3173q abstractC3173q, Q6.o oVar) {
        setParentCompositionContext(abstractC3173q);
        setContent(oVar);
        this.f2098l = true;
        d();
    }

    public final void n(boolean z8) {
        this.f2097k = z8;
    }
}
