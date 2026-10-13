package Z3;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12901d;

    public f(String insertId, String eventName, String propertiesJson, long j8) {
        t.g(insertId, "insertId");
        t.g(eventName, "eventName");
        t.g(propertiesJson, "propertiesJson");
        this.f12898a = insertId;
        this.f12899b = eventName;
        this.f12900c = propertiesJson;
        this.f12901d = j8;
    }

    public final String a() {
        return this.f12899b;
    }

    public final String b() {
        return this.f12898a;
    }

    public final String c() {
        return this.f12900c;
    }

    public final long d() {
        return this.f12901d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return t.c(this.f12898a, fVar.f12898a) && t.c(this.f12899b, fVar.f12899b) && t.c(this.f12900c, fVar.f12900c) && this.f12901d == fVar.f12901d;
    }

    public int hashCode() {
        return (((((this.f12898a.hashCode() * 31) + this.f12899b.hashCode()) * 31) + this.f12900c.hashCode()) * 31) + Long.hashCode(this.f12901d);
    }

    public String toString() {
        return "StoredEventEntity(insertId=" + this.f12898a + ", eventName=" + this.f12899b + ", propertiesJson=" + this.f12900c + ", timestampMs=" + this.f12901d + ")";
    }
}
