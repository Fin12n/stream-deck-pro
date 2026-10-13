package io.ktor.utils.io.internal;

import io.ktor.utils.io.p;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25455b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f25456c = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f25457a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final c a() {
            return c.f25456c;
        }

        public a() {
        }
    }

    public c(Throwable th) {
        this.f25457a = th;
    }

    public final Throwable b() {
        return this.f25457a;
    }

    public final Throwable c() {
        Throwable th = this.f25457a;
        return th == null ? new p("The channel was closed") : th;
    }

    public String toString() {
        return "Closed[" + c() + ']';
    }
}
