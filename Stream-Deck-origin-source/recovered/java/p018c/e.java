package p018c;

import Q6.o;
import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import p009b.ActivityC1747j;
import p065h1.W;
import p215z0.AbstractC3173q;
import p217z2.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f16016a = new ViewGroup.LayoutParams(-2, -2);

    public static final void a(ActivityC1747j activityC1747j, AbstractC3173q abstractC3173q, o oVar) {
        View childAt = ((ViewGroup) activityC1747j.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        W w8 = childAt instanceof W ? (W) childAt : null;
        if (w8 != null) {
            w8.setParentCompositionContext(abstractC3173q);
            w8.setContent(oVar);
            return;
        }
        W w9 = new W(activityC1747j, null, 0, 6, null);
        w9.setParentCompositionContext(abstractC3173q);
        w9.setContent(oVar);
        c(activityC1747j);
        activityC1747j.setContentView(w9, f16016a);
    }

    public static /* synthetic */ void b(ActivityC1747j activityC1747j, AbstractC3173q abstractC3173q, o oVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            abstractC3173q = null;
        }
        a(activityC1747j, abstractC3173q, oVar);
    }

    public static final void c(ActivityC1747j activityC1747j) {
        View decorView = activityC1747j.getWindow().getDecorView();
        if (T.a(decorView) == null) {
            T.b(decorView, activityC1747j);
        }
        if (U.a(decorView) == null) {
            U.b(decorView, activityC1747j);
        }
        if (g.a(decorView) == null) {
            g.b(decorView, activityC1747j);
        }
    }
}
