package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import io.sentry.C2588x2;
import io.sentry.EnumC2596z2;
import io.sentry.M1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryInitProvider extends e0 {
    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        C2472u c2472u = new C2472u();
        Context context = getContext();
        if (context == null) {
            c2472u.c(EnumC2596z2.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return false;
        }
        if (!m0.c(context, c2472u)) {
            return true;
        }
        v0.e(context, c2472u);
        C2588x2.c().a("AutoInit");
        return true;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        M1.k();
    }
}
