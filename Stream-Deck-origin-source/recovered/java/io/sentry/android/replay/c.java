package io.sentry.android.replay;

import io.sentry.K2;
import java.util.Date;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f26646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f26647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f26648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f26650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final K2.b f26651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f26652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f26653h;

    public c(u recorderConfig, h cache, Date timestamp, int i8, long j8, K2.b replayType, String str, List<? extends io.sentry.rrweb.b> events) {
        kotlin.jvm.internal.t.g(recorderConfig, "recorderConfig");
        kotlin.jvm.internal.t.g(cache, "cache");
        kotlin.jvm.internal.t.g(timestamp, "timestamp");
        kotlin.jvm.internal.t.g(replayType, "replayType");
        kotlin.jvm.internal.t.g(events, "events");
        this.f26646a = recorderConfig;
        this.f26647b = cache;
        this.f26648c = timestamp;
        this.f26649d = i8;
        this.f26650e = j8;
        this.f26651f = replayType;
        this.f26652g = str;
        this.f26653h = events;
    }

    public final h a() {
        return this.f26647b;
    }

    public final long b() {
        return this.f26650e;
    }

    public final List c() {
        return this.f26653h;
    }

    public final int d() {
        return this.f26649d;
    }

    public final u e() {
        return this.f26646a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.t.c(this.f26646a, cVar.f26646a) && kotlin.jvm.internal.t.c(this.f26647b, cVar.f26647b) && kotlin.jvm.internal.t.c(this.f26648c, cVar.f26648c) && this.f26649d == cVar.f26649d && this.f26650e == cVar.f26650e && this.f26651f == cVar.f26651f && kotlin.jvm.internal.t.c(this.f26652g, cVar.f26652g) && kotlin.jvm.internal.t.c(this.f26653h, cVar.f26653h);
    }

    public final K2.b f() {
        return this.f26651f;
    }

    public final String g() {
        return this.f26652g;
    }

    public final Date h() {
        return this.f26648c;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.f26646a.hashCode() * 31) + this.f26647b.hashCode()) * 31) + this.f26648c.hashCode()) * 31) + Integer.hashCode(this.f26649d)) * 31) + Long.hashCode(this.f26650e)) * 31) + this.f26651f.hashCode()) * 31;
        String str = this.f26652g;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f26653h.hashCode();
    }

    public String toString() {
        return "LastSegmentData(recorderConfig=" + this.f26646a + ", cache=" + this.f26647b + ", timestamp=" + this.f26648c + ", id=" + this.f26649d + ", duration=" + this.f26650e + ", replayType=" + this.f26651f + ", screenAtStart=" + this.f26652g + ", events=" + this.f26653h + ')';
    }
}
