package H1;

import android.content.res.Configuration;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Configuration f3486b;

    public q(boolean z8) {
        this.f3485a = z8;
    }

    public final boolean a() {
        return this.f3485a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(boolean z8, Configuration newConfig) {
        this(z8);
        kotlin.jvm.internal.t.g(newConfig, "newConfig");
        this.f3486b = newConfig;
    }
}
