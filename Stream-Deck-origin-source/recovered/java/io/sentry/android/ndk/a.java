package io.sentry.android.ndk;

import io.sentry.J2;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.h0;
import io.sentry.ndk.NativeModuleListLoader;
import io.sentry.util.C2569a;
import io.sentry.util.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2569a f26592c = new C2569a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2 f26593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NativeModuleListLoader f26594b;

    public a(SentryAndroidOptions sentryAndroidOptions, NativeModuleListLoader nativeModuleListLoader) {
        this.f26593a = (J2) u.c(sentryAndroidOptions, "The SentryAndroidOptions is required.");
        this.f26594b = (NativeModuleListLoader) u.c(nativeModuleListLoader, "The NativeModuleListLoader is required.");
    }
}
