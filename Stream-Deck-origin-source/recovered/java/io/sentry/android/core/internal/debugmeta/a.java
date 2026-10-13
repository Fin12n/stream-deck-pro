package io.sentry.android.core.internal.debugmeta;

import android.content.Context;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.android.core.Z;
import io.sentry.util.C2572d;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements io.sentry.internal.debugmeta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ILogger f26356b;

    public a(Context context, ILogger iLogger) {
        this.f26355a = Z.h(context);
        this.f26356b = iLogger;
    }

    @Override // io.sentry.internal.debugmeta.a
    public List a() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f26355a.getAssets().open(C2572d.f27725a));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List listSingletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return listSingletonList;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e8) {
            this.f26356b.a(EnumC2596z2.INFO, e8, "%s file was not found.", C2572d.f27725a);
            return null;
        } catch (IOException e9) {
            this.f26356b.b(EnumC2596z2.ERROR, "Error getting Proguard UUIDs.", e9);
            return null;
        } catch (RuntimeException e10) {
            this.f26356b.a(EnumC2596z2.ERROR, e10, "%s file is malformed.", C2572d.f27725a);
            return null;
        }
    }
}
