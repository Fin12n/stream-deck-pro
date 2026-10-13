package io.sentry.android.core.internal.modules;

import android.content.Context;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.android.core.Z;
import io.sentry.internal.modules.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f26385d;

    public a(Context context, ILogger iLogger) {
        super(iLogger);
        this.f26385d = Z.h(context);
    }

    @Override // io.sentry.internal.modules.d
    public Map b() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream inputStreamOpen = this.f26385d.getAssets().open("sentry-external-modules.txt");
            try {
                Map mapC = c(inputStreamOpen);
                if (inputStreamOpen == null) {
                    return mapC;
                }
                inputStreamOpen.close();
                return mapC;
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            this.f27196a.c(EnumC2596z2.INFO, "%s file was not found.", "sentry-external-modules.txt");
            return treeMap;
        } catch (IOException e8) {
            this.f27196a.b(EnumC2596z2.ERROR, "Error extracting modules.", e8);
            return treeMap;
        }
    }
}
