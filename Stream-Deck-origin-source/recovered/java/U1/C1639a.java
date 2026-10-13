package U1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: U1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C1639a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f10081c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f10082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View.AccessibilityDelegate f10083b;

    /* JADX INFO: renamed from: U1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0282a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1639a f10084a;

        public C0282a(C1639a c1639a) {
            this.f10084a = c1639a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f10084a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            V1.m mVarB = this.f10084a.b(view);
            if (mVarB != null) {
                return (AccessibilityNodeProvider) mVarB.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f10084a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            V1.l lVarH0 = V1.l.H0(accessibilityNodeInfo);
            lVarH0.t0(I.y(view));
            lVarH0.i0(I.v(view));
            lVarH0.n0(I.k(view));
            lVarH0.x0(I.s(view));
            this.f10084a.g(view, lVarH0);
            lVarH0.e(accessibilityNodeInfo.getText(), view);
            List listC = C1639a.c(view);
            for (int i8 = 0; i8 < listC.size(); i8++) {
                lVarH0.b((V1.l.a) listC.get(i8));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f10084a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f10084a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i8, Bundle bundle) {
            return this.f10084a.k(view, i8, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i8) {
            this.f10084a.m(view, i8);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f10084a.n(view, accessibilityEvent);
        }
    }

    public C1639a() {
        this(f10081c);
    }

    public static List c(View view) {
        List list = (List) view.getTag(G1.d.f2619H);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f10082a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public V1.m b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f10082a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new V1.m(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate d() {
        return this.f10083b;
    }

    public final boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrN = V1.l.n(view.createAccessibilityNodeInfo().getText());
            for (int i8 = 0; clickableSpanArrN != null && i8 < clickableSpanArrN.length; i8++) {
                if (clickableSpan.equals(clickableSpanArrN[i8])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f10082a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, V1.l lVar) {
        this.f10082a.onInitializeAccessibilityNodeInfo(view, lVar.G0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f10082a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f10082a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean k(View view, int i8, Bundle bundle) {
        List listC = c(view);
        boolean zPerformAccessibilityAction = false;
        for (int i9 = 0; i9 < listC.size(); i9++) {
            V1.l.a aVar = (V1.l.a) listC.get(i9);
            if (aVar.a() == i8) {
                zPerformAccessibilityAction = aVar.c(view, bundle);
                break;
            }
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f10082a.performAccessibilityAction(view, i8, bundle);
        }
        return (zPerformAccessibilityAction || i8 != G1.d.f2630a || bundle == null) ? zPerformAccessibilityAction : l(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public final boolean l(int i8, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(G1.d.f2620I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i8)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public void m(View view, int i8) {
        this.f10082a.sendAccessibilityEvent(view, i8);
    }

    public void n(View view, AccessibilityEvent accessibilityEvent) {
        this.f10082a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C1639a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f10082a = accessibilityDelegate;
        this.f10083b = new C0282a(this);
    }
}
