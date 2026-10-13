package p215z0;

import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: z0.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3170o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38888a;

    public C3170o0(String str) {
        this.f38888a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3170o0) && t.c(this.f38888a, ((C3170o0) obj).f38888a);
    }

    public int hashCode() {
        return this.f38888a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f38888a + ')';
    }
}
