package p176u1;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34360a;

    /* JADX WARN: Multi-variable type inference failed */
    public G() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.f34360a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof G) && t.c(this.f34360a, ((G) obj).f34360a);
    }

    public int hashCode() {
        String str = this.f34360a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "PlatformImeOptions(privateImeOptions=" + this.f34360a + ')';
    }

    public G(String str) {
        this.f34360a = str;
    }

    public /* synthetic */ G(String str, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? null : str);
    }
}
