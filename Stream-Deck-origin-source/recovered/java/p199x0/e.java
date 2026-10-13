package p199x0;

import J2.b;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f37187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f37188b;

    public e(b bVar, d dVar) {
        this.f37187a = bVar;
        this.f37188b = dVar;
    }

    public final b a() {
        return this.f37187a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return t.c(this.f37187a, eVar.f37187a) && t.c(this.f37188b, eVar.f37188b);
    }

    public int hashCode() {
        return (this.f37187a.hashCode() * 31) + this.f37188b.hashCode();
    }

    public String toString() {
        return "WindowAdaptiveInfo(windowSizeClass=" + this.f37187a + ", windowPosture=" + this.f37188b + ')';
    }
}
