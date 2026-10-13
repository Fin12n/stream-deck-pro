package p128o1;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class M extends K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30768a;

    public M(String str) {
        super(null);
        this.f30768a = str;
    }

    public final String a() {
        return this.f30768a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof M) && t.c(this.f30768a, ((M) obj).f30768a);
    }

    public int hashCode() {
        return this.f30768a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f30768a + ')';
    }
}
