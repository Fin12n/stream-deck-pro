package p186v3;

import Q6.k;
import Y6.g;
import Y6.l;
import Y6.n;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: v3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0793a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0793a f35105a = new C0793a();

        public C0793a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Activity);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f35106a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context it) {
            t.g(it, "it");
            ContextWrapper contextWrapper = it instanceof ContextWrapper ? (ContextWrapper) it : null;
            if (contextWrapper != null) {
                return contextWrapper.getBaseContext();
            }
            return null;
        }
    }

    public static final Activity a(Context context) {
        t.g(context, "<this>");
        g gVarK = n.k(c(context), C0793a.f35105a);
        t.e(gVarK, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return (Activity) n.n(gVarK);
    }

    public static final Activity b(Context context) {
        t.g(context, "<this>");
        Activity activityA = a(context);
        if (activityA != null) {
            return activityA;
        }
        throw new IllegalStateException("Context is not associated with an activity");
    }

    public static final g c(Context context) {
        t.g(context, "<this>");
        return l.f(context, b.f35106a);
    }
}
