package p111m2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p102l2.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class r implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f29949a;

    public r(y yVar) {
        this.f29949a = yVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        E eT;
        if (C2689n.class.getName().equals(str)) {
            return new C2689n(context, attributeSet, this.f29949a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f29139a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(c.f29140b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(c.f29141c, -1);
        String string = typedArrayObtainStyledAttributes.getString(c.f29142d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !p.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        ComponentCallbacksC2681f componentCallbacksC2681fE0 = resourceId != -1 ? this.f29949a.e0(resourceId) : null;
        if (componentCallbacksC2681fE0 == null && string != null) {
            componentCallbacksC2681fE0 = this.f29949a.f0(string);
        }
        if (componentCallbacksC2681fE0 == null && id != -1) {
            componentCallbacksC2681fE0 = this.f29949a.e0(id);
        }
        if (componentCallbacksC2681fE0 == null) {
            componentCallbacksC2681fE0 = this.f29949a.p0().a(context.getClassLoader(), attributeValue);
            componentCallbacksC2681fE0.f29879o = true;
            componentCallbacksC2681fE0.f29888x = resourceId != 0 ? resourceId : id;
            componentCallbacksC2681fE0.f29889y = id;
            componentCallbacksC2681fE0.f29890z = string;
            componentCallbacksC2681fE0.f29880p = true;
            y yVar = this.f29949a;
            componentCallbacksC2681fE0.f29884t = yVar;
            componentCallbacksC2681fE0.f29885u = yVar.r0();
            componentCallbacksC2681fE0.z0(this.f29949a.r0().o(), attributeSet, componentCallbacksC2681fE0.f29854b);
            eT = this.f29949a.h(componentCallbacksC2681fE0);
            if (y.E0(2)) {
                Log.v("FragmentManager", "Fragment " + componentCallbacksC2681fE0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (componentCallbacksC2681fE0.f29880p) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            componentCallbacksC2681fE0.f29880p = true;
            y yVar2 = this.f29949a;
            componentCallbacksC2681fE0.f29884t = yVar2;
            componentCallbacksC2681fE0.f29885u = yVar2.r0();
            componentCallbacksC2681fE0.z0(this.f29949a.r0().o(), attributeSet, componentCallbacksC2681fE0.f29854b);
            eT = this.f29949a.t(componentCallbacksC2681fE0);
            if (y.E0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + componentCallbacksC2681fE0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        p120n2.c.g(componentCallbacksC2681fE0, viewGroup);
        componentCallbacksC2681fE0.f29845H = viewGroup;
        eT.m();
        eT.j();
        View view2 = componentCallbacksC2681fE0.f29846I;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (componentCallbacksC2681fE0.f29846I.getTag() == null) {
            componentCallbacksC2681fE0.f29846I.setTag(string);
        }
        componentCallbacksC2681fE0.f29846I.addOnAttachStateChangeListener(new a(eT));
        return componentCallbacksC2681fE0.f29846I;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ E f29950a;

        public a(E e8) {
            this.f29950a = e8;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ComponentCallbacksC2681f componentCallbacksC2681fK = this.f29950a.k();
            this.f29950a.m();
            M.n((ViewGroup) componentCallbacksC2681fK.f29846I.getParent(), r.this.f29949a).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
