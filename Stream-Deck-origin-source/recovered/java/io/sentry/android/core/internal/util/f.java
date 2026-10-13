package io.sentry.android.core.internal.util;

import android.content.ContentProvider;
import io.sentry.E0;
import io.sentry.android.core.Q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f26418a;

    public f() {
        this(new Q(E0.e()));
    }

    public void a(ContentProvider contentProvider) {
        int iD = this.f26418a.d();
        if (iD < 26 || iD > 28) {
            return;
        }
        String callingPackage = contentProvider.getCallingPackage();
        String packageName = contentProvider.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }

    public f(Q q8) {
        this.f26418a = q8;
    }
}
