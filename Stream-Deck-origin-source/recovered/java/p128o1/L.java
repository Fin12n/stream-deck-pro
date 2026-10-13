package p128o1;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30767a;

    public L(String str) {
        this.f30767a = str;
    }

    public final String a() {
        return this.f30767a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L) && t.c(this.f30767a, ((L) obj).f30767a);
    }

    public int hashCode() {
        return this.f30767a.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.f30767a + ')';
    }
}
