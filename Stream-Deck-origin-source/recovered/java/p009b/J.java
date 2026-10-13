package p009b;

import Q6.k;
import Y6.l;
import Y6.n;
import android.view.View;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15489a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final View invoke(View it) {
            t.g(it, "it");
            Object parent = it.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f15490a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final F invoke(View it) {
            t.g(it, "it");
            Object tag = it.getTag(G.f15482b);
            if (tag instanceof F) {
                return (F) tag;
            }
            return null;
        }
    }

    public static final F a(View view) {
        t.g(view, "<this>");
        return (F) n.n(n.t(l.f(view, a.f15489a), b.f15490a));
    }

    public static final void b(View view, F onBackPressedDispatcherOwner) {
        t.g(view, "<this>");
        t.g(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(G.f15482b, onBackPressedDispatcherOwner);
    }
}
