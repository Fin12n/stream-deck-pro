package io.sentry.android.core;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class B0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SystemEventsBreadcrumbsIntegration.a f26159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Intent f26161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f26162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f26163e;

    public /* synthetic */ B0(SystemEventsBreadcrumbsIntegration.a aVar, long j8, Intent intent, String str, boolean z8) {
        this.f26159a = aVar;
        this.f26160b = j8;
        this.f26161c = intent;
        this.f26162d = str;
        this.f26163e = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SystemEventsBreadcrumbsIntegration.a.a(this.f26159a, this.f26160b, this.f26161c, this.f26162d, this.f26163e);
    }
}
