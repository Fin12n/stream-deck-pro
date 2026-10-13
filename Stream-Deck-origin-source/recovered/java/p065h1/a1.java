package p065h1;

import android.view.View;
import p215z0.H0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f24228a = a.f24229a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f24229a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a1 f24230b = new a1() { // from class: h1.Z0
            @Override // p065h1.a1
            public final H0 a(View view) {
                return a1.a.b(view);
            }
        };

        public static final H0 b(View view) {
            return c1.c(view, null, null, 3, null);
        }

        public final a1 c() {
            return f24230b;
        }
    }

    H0 a(View view);
}
