package p217z2;

import Q6.k;
import Y6.l;
import Y6.n;
import android.view.View;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39074a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final View invoke(View view) {
            t.g(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f39075a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f invoke(View view) {
            t.g(view, "view");
            Object tag = view.getTag(p217z2.a.f39058a);
            if (tag instanceof f) {
                return (f) tag;
            }
            return null;
        }
    }

    public static final f a(View view) {
        t.g(view, "<this>");
        return (f) n.n(n.t(l.f(view, a.f39074a), b.f39075a));
    }

    public static final void b(View view, f fVar) {
        t.g(view, "<this>");
        view.setTag(p217z2.a.f39058a, fVar);
    }
}
