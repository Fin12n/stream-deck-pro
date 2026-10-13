package io.sentry.android.core.util;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f26563a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0587a f26564b;

    /* JADX INFO: renamed from: io.sentry.android.core.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface InterfaceC0587a {
        Object a(Context context);
    }

    public a(InterfaceC0587a interfaceC0587a) {
        this.f26564b = interfaceC0587a;
    }

    public Object a(Context context) {
        if (this.f26563a == null) {
            synchronized (this) {
                try {
                    if (this.f26563a == null) {
                        this.f26563a = this.f26564b.a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f26563a;
    }
}
