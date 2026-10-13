package p215z0;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class s1 implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38927a;

    public s1(Object obj) {
        this.f38927a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1) && t.c(this.f38927a, ((s1) obj).f38927a);
    }

    @Override // p215z0.q1
    public Object getValue() {
        return this.f38927a;
    }

    public int hashCode() {
        Object obj = this.f38927a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.f38927a + ')';
    }
}
