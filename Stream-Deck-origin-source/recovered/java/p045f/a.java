package p045f;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: f.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0498a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f21229a;

        public C0498a(Object obj) {
            this.f21229a = obj;
        }

        public final Object a() {
            return this.f21229a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C0498a b(Context context, Object obj) {
        t.g(context, "context");
        return null;
    }

    public abstract Object c(int i8, Intent intent);
}
