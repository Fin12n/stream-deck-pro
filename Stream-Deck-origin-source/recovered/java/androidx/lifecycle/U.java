package androidx.lifecycle;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15271a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final View invoke(View view) {
            kotlin.jvm.internal.t.g(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f15272a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final S invoke(View view) {
            kotlin.jvm.internal.t.g(view, "view");
            Object tag = view.getTag(p153r2.c.f32335a);
            if (tag instanceof S) {
                return (S) tag;
            }
            return null;
        }
    }

    public static final S a(View view) {
        kotlin.jvm.internal.t.g(view, "<this>");
        return (S) Y6.n.n(Y6.n.t(Y6.l.f(view, a.f15271a), b.f15272a));
    }

    public static final void b(View view, S s8) {
        kotlin.jvm.internal.t.g(view, "<this>");
        view.setTag(p153r2.c.f32335a, s8);
    }
}
