package U1;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.C2639q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a extends C2639q implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10041a = new a();

        public a() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    public static final Y6.g a(View view) {
        return Y6.l.f(view.getParent(), a.f10041a);
    }
}
