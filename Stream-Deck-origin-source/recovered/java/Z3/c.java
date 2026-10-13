package Z3;

import kotlin.jvm.internal.t;
import p180u5.FCkZ.BpgIURjN;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12880b;

    public c(String key, String value) {
        t.g(key, "key");
        t.g(value, "value");
        this.f12879a = key;
        this.f12880b = value;
    }

    public final String a() {
        return this.f12879a;
    }

    public final String b() {
        return this.f12880b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return t.c(this.f12879a, cVar.f12879a) && t.c(this.f12880b, cVar.f12880b);
    }

    public int hashCode() {
        return (this.f12879a.hashCode() * 31) + this.f12880b.hashCode();
    }

    public String toString() {
        return "SessionStateEntity(key=" + this.f12879a + ", value=" + this.f12880b + BpgIURjN.RRK;
    }
}
