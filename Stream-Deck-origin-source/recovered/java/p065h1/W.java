package p065h1;

import C6.G;
import Q6.o;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.P0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class W extends AbstractC2378a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC3164l0 f24168i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f24169j;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f24171b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8) {
            super(2);
            this.f24171b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            W.this.a(interfaceC3163l, F0.a(this.f24171b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public W(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // p065h1.AbstractC2378a
    public void a(InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(420213850);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(420213850, i8, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:426)");
        }
        o oVar = (o) this.f24168i.getValue();
        if (oVar != null) {
            oVar.invoke(interfaceC3163lP, 0);
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new a(i8));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return W.class.getName();
    }

    @Override // p065h1.AbstractC2378a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f24169j;
    }

    public final void setContent(o oVar) {
        this.f24169j = true;
        this.f24168i.setValue(oVar);
        if (isAttachedToWindow()) {
            d();
        }
    }

    public W(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ W(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC2633k abstractC2633k) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    public W(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f24168i = l1.e(null, null, 2, null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
