package X3;

import D6.M;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f11706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f11707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f11708c;

    public e() {
        this(null, null, null, 7, null);
    }

    public final Map a() {
        return this.f11707b;
    }

    public final f b() {
        return this.f11708c;
    }

    public final Map c() {
        return this.f11706a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return t.c(this.f11706a, eVar.f11706a) && t.c(this.f11707b, eVar.f11707b) && this.f11708c == eVar.f11708c;
    }

    public int hashCode() {
        return (((this.f11706a.hashCode() * 31) + this.f11707b.hashCode()) * 31) + this.f11708c.hashCode();
    }

    public String toString() {
        return "ErrorContext(tags=" + this.f11706a + ", extra=" + this.f11707b + ", level=" + this.f11708c + ")";
    }

    public e(Map<String, String> tags, Map<String, ? extends Object> extra, f level) {
        t.g(tags, "tags");
        t.g(extra, "extra");
        t.g(level, "level");
        this.f11706a = tags;
        this.f11707b = extra;
        this.f11708c = level;
    }

    public /* synthetic */ e(Map map, Map map2, f fVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? M.g() : map, (i8 & 2) != 0 ? M.g() : map2, (i8 & 4) != 0 ? f.Error : fVar);
    }
}
