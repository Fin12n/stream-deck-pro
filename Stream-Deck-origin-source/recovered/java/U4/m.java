package U4;

import V4.t;
import V4.w;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final V4.i f10195c = new V4.i("ReviewService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f10196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10197b;

    public m(Context context) {
        this.f10197b = context.getPackageName();
        if (w.a(context)) {
            this.f10196a = new t(context, f10195c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), i.f10188a, null, null);
        }
    }

    public final S4.k a() {
        V4.i iVar = f10195c;
        iVar.d("requestInAppReview (%s)", this.f10197b);
        if (this.f10196a == null) {
            iVar.b("Play Store app is either not installed or not the official version", new Object[0]);
            return S4.n.c(new a(-1));
        }
        S4.l lVar = new S4.l();
        this.f10196a.p(new j(this, lVar, lVar), lVar);
        return lVar.a();
    }
}
