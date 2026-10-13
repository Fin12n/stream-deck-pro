package io.sentry.android.replay;

import java.io.File;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f26829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26831c;

    public i(File screenshot, long j8, String str) {
        kotlin.jvm.internal.t.g(screenshot, "screenshot");
        this.f26829a = screenshot;
        this.f26830b = j8;
        this.f26831c = str;
    }

    public final String a() {
        return this.f26831c;
    }

    public final File b() {
        return this.f26829a;
    }

    public final long c() {
        return this.f26830b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.t.c(this.f26829a, iVar.f26829a) && this.f26830b == iVar.f26830b && kotlin.jvm.internal.t.c(this.f26831c, iVar.f26831c);
    }

    public int hashCode() {
        int iHashCode = ((this.f26829a.hashCode() * 31) + Long.hashCode(this.f26830b)) * 31;
        String str = this.f26831c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ReplayFrame(screenshot=" + this.f26829a + ", timestamp=" + this.f26830b + ", screen=" + this.f26831c + ')';
    }

    public /* synthetic */ i(File file, long j8, String str, int i8, AbstractC2633k abstractC2633k) {
        this(file, j8, (i8 & 4) != 0 ? null : str);
    }
}
