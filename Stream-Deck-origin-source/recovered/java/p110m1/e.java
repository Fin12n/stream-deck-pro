package p110m1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f29501b;

    public e(String str, Function0 function0) {
        this.f29500a = str;
        this.f29501b = function0;
    }

    public final Function0 a() {
        return this.f29501b;
    }

    public final String b() {
        return this.f29500a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return t.c(this.f29500a, eVar.f29500a) && t.c(this.f29501b, eVar.f29501b);
    }

    public int hashCode() {
        return (this.f29500a.hashCode() * 31) + this.f29501b.hashCode();
    }

    public String toString() {
        return "CustomAccessibilityAction(label=" + this.f29500a + ", action=" + this.f29501b + ')';
    }
}
