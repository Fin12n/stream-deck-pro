package p176u1;

import kotlin.jvm.internal.t;
import p128o1.C2739d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2739d f34415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f34416b;

    public W(C2739d c2739d, D d8) {
        this.f34415a = c2739d;
        this.f34416b = d8;
    }

    public final D a() {
        return this.f34416b;
    }

    public final C2739d b() {
        return this.f34415a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w8 = (W) obj;
        return t.c(this.f34415a, w8.f34415a) && t.c(this.f34416b, w8.f34416b);
    }

    public int hashCode() {
        return (this.f34415a.hashCode() * 31) + this.f34416b.hashCode();
    }

    public String toString() {
        return "TransformedText(text=" + ((Object) this.f34415a) + ", offsetMapping=" + this.f34416b + ')';
    }
}
