package io.ktor.client.engine.cio;

import V.ocy.SVzBK;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p141p6.c f24879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f24880b;

    public g(p141p6.c requestTime, o task) {
        t.g(requestTime, "requestTime");
        t.g(task, "task");
        this.f24879a = requestTime;
        this.f24880b = task;
    }

    public final p141p6.c a() {
        return this.f24879a;
    }

    public final o b() {
        return this.f24880b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return t.c(this.f24879a, gVar.f24879a) && t.c(this.f24880b, gVar.f24880b);
    }

    public int hashCode() {
        return (this.f24879a.hashCode() * 31) + this.f24880b.hashCode();
    }

    public String toString() {
        return "ConnectionResponseTask(requestTime=" + this.f24879a + SVzBK.GgyXsEoksDOdjK + this.f24880b + ')';
    }
}
