package p065h1;

import L0.l;
import Q6.o;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.j;
import java.util.Collections;
import java.util.WeakHashMap;
import p056g1.F;
import p056g1.x0;
import p215z0.AbstractC3173q;
import p215z0.AbstractC3178t;
import p215z0.InterfaceC3171p;
import p215z0.N0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f24281a = new ViewGroup.LayoutParams(-2, -2);

    public static final N0 a(F f8, AbstractC3173q abstractC3173q) {
        return AbstractC3178t.b(new x0(f8), abstractC3173q);
    }

    public static final InterfaceC3171p b(AndroidComposeView androidComposeView, AbstractC3173q abstractC3173q, o oVar) {
        if (AbstractC2401l0.c() && androidComposeView.getTag(l.f4863K) == null) {
            androidComposeView.setTag(l.f4863K, Collections.newSetFromMap(new WeakHashMap()));
        }
        InterfaceC3171p interfaceC3171pA = AbstractC3178t.a(new x0(androidComposeView.getRoot()), abstractC3173q);
        Object tag = androidComposeView.getView().getTag(l.f4864L);
        j jVar = tag instanceof j ? (j) tag : null;
        if (jVar == null) {
            jVar = new j(androidComposeView, interfaceC3171pA);
            androidComposeView.getView().setTag(l.f4864L, jVar);
        }
        jVar.o(oVar);
        return jVar;
    }

    public static final InterfaceC3171p c(AbstractC2378a abstractC2378a, AbstractC3173q abstractC3173q, o oVar) {
        C2391g0.f24284a.b();
        AndroidComposeView androidComposeView = null;
        if (abstractC2378a.getChildCount() > 0) {
            View childAt = abstractC2378a.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            abstractC2378a.removeAllViews();
        }
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(abstractC2378a.getContext(), abstractC3173q.h());
            abstractC2378a.addView(androidComposeView.getView(), f24281a);
        }
        return b(androidComposeView, abstractC3173q, oVar);
    }
}
