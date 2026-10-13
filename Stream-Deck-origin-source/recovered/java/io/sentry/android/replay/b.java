package io.sentry.android.replay;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f26643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26645c;

    public b(File video, int i8, long j8) {
        kotlin.jvm.internal.t.g(video, "video");
        this.f26643a = video;
        this.f26644b = i8;
        this.f26645c = j8;
    }

    public final File a() {
        return this.f26643a;
    }

    public final int b() {
        return this.f26644b;
    }

    public final long c() {
        return this.f26645c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.t.c(this.f26643a, bVar.f26643a) && this.f26644b == bVar.f26644b && this.f26645c == bVar.f26645c;
    }

    public int hashCode() {
        return (((this.f26643a.hashCode() * 31) + Integer.hashCode(this.f26644b)) * 31) + Long.hashCode(this.f26645c);
    }

    public String toString() {
        return "GeneratedVideo(video=" + this.f26643a + ", frameCount=" + this.f26644b + ", duration=" + this.f26645c + ')';
    }
}
