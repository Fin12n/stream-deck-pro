package p065h1;

import C6.G;
import H0.c;
import Q6.o;
import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p056g1.h0;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3173q;
import p215z0.H0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3171p;

/* JADX INFO: renamed from: h1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2378a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f24219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IBinder f24220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC3171p f24221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC3173q f24222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Function0 f24223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24226h;

    /* JADX INFO: renamed from: h1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0558a extends u implements o {
        public C0558a() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-656146368, i8, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:251)");
            }
            AbstractC2378a.this.a(interfaceC3163l, 8);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public AbstractC2378a(Context context) {
        this(context, null, 0, 6, null);
    }

    private final void setParentContext(AbstractC3173q abstractC3173q) {
        if (this.f24222d != abstractC3173q) {
            this.f24222d = abstractC3173q;
            if (abstractC3173q != null) {
                this.f24219a = null;
            }
            InterfaceC3171p interfaceC3171p = this.f24221c;
            if (interfaceC3171p != null) {
                interfaceC3171p.d();
                this.f24221c = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f24220b != iBinder) {
            this.f24220b = iBinder;
            this.f24219a = null;
        }
    }

    public abstract void a(InterfaceC3163l interfaceC3163l, int i8);

    @Override // android.view.ViewGroup
    public void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i8, layoutParams);
    }

    public final AbstractC3173q b(AbstractC3173q abstractC3173q) {
        AbstractC3173q abstractC3173q2 = i(abstractC3173q) ? abstractC3173q : null;
        if (abstractC3173q2 != null) {
            this.f24219a = new WeakReference(abstractC3173q2);
        }
        return abstractC3173q;
    }

    public final void c() {
        if (this.f24225g) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void d() {
        if (this.f24222d == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        f();
    }

    public final void e() {
        InterfaceC3171p interfaceC3171p = this.f24221c;
        if (interfaceC3171p != null) {
            interfaceC3171p.d();
        }
        this.f24221c = null;
        requestLayout();
    }

    public final void f() {
        if (this.f24221c == null) {
            try {
                this.f24225g = true;
                this.f24221c = e1.c(this, j(), c.c(-656146368, true, new C0558a()));
            } finally {
                this.f24225g = false;
            }
        }
    }

    public void g(boolean z8, int i8, int i9, int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i10 - i8) - getPaddingRight(), (i11 - i9) - getPaddingBottom());
        }
    }

    public final boolean getHasComposition() {
        return this.f24221c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f24224f;
    }

    public void h(int i8, int i9) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i8, i9);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i8) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i8)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i9) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i9)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    public final boolean i(AbstractC3173q abstractC3173q) {
        return !(abstractC3173q instanceof H0) || ((H0.d) ((H0) abstractC3173q).d0().getValue()).compareTo(H0.d.ShuttingDown) > 0;
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.f24226h || super.isTransitionGroup();
    }

    public final AbstractC3173q j() {
        AbstractC3173q abstractC3173q;
        AbstractC3173q abstractC3173qB = this.f24222d;
        if (abstractC3173qB == null) {
            AbstractC3173q abstractC3173qD = c1.d(this);
            AbstractC3173q abstractC3173q2 = null;
            abstractC3173qB = abstractC3173qD != null ? b(abstractC3173qD) : null;
            if (abstractC3173qB == null) {
                WeakReference weakReference = this.f24219a;
                if (weakReference != null && (abstractC3173q = (AbstractC3173q) weakReference.get()) != null && i(abstractC3173q)) {
                    abstractC3173q2 = abstractC3173q;
                }
                return abstractC3173q2 == null ? b(c1.h(this)) : abstractC3173q2;
            }
        }
        return abstractC3173qB;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        g(z8, i8, i9, i10, i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i8, int i9) {
        f();
        h(i8, i9);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i8) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i8);
    }

    public final void setParentCompositionContext(AbstractC3173q abstractC3173q) {
        setParentContext(abstractC3173q);
    }

    public final void setShowLayoutBounds(boolean z8) {
        this.f24224f = z8;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((h0) childAt).setShowLayoutBounds(z8);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z8) {
        super.setTransitionGroup(z8);
        this.f24226h = true;
    }

    public final void setViewCompositionStrategy(P0 p8) {
        Function0 function0 = this.f24223e;
        if (function0 != null) {
            function0.invoke();
        }
        this.f24223e = p8.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractC2378a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AbstractC2378a(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC2633k abstractC2633k) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8) {
        c();
        super.addView(view, i8);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i8, ViewGroup.LayoutParams layoutParams, boolean z8) {
        c();
        return super.addViewInLayout(view, i8, layoutParams, z8);
    }

    public AbstractC2378a(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        setClipChildren(false);
        setClipToPadding(false);
        this.f24223e = P0.f24151a.a().a(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, int i9) {
        c();
        super.addView(view, i8, i9);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i8, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
