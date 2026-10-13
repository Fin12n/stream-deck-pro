package p046f0;

import A1.d;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21341a = a.f21342a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f21342a = new a();

        public final V a() {
            if (J.c(0, 1, null)) {
                return Build.VERSION.SDK_INT == 28 ? W.f21343b : X.f21346b;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    boolean a();

    U b(View view, boolean z8, long j8, float f8, float f9, boolean z9, d dVar, float f10);
}
