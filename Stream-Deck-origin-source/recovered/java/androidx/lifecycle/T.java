package androidx.lifecycle;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15269a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final View invoke(View currentView) {
            kotlin.jvm.internal.t.g(currentView, "currentView");
            Object parent = currentView.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f15270a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1733p invoke(View viewParent) {
            kotlin.jvm.internal.t.g(viewParent, "viewParent");
            Object tag = viewParent.getTag(p145q2.a.f31989a);
            if (tag instanceof InterfaceC1733p) {
                return (InterfaceC1733p) tag;
            }
            return null;
        }
    }

    public static final InterfaceC1733p a(View view) {
        kotlin.jvm.internal.t.g(view, "<this>");
        return (InterfaceC1733p) Y6.n.n(Y6.n.t(Y6.l.f(view, a.f15269a), b.f15270a));
    }

    public static final void b(View view, InterfaceC1733p interfaceC1733p) {
        kotlin.jvm.internal.t.g(view, "<this>");
        view.setTag(p145q2.a.f31989a, interfaceC1733p);
    }
}
