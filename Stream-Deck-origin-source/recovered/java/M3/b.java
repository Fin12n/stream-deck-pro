package M3;

import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f5133b;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // M3.a
    public d a() {
        return this.f5133b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.t.c(this.f5132a, bVar.f5132a) && kotlin.jvm.internal.t.c(this.f5133b, bVar.f5133b);
    }

    @Override // M3.a
    public String getDescription() {
        return this.f5132a;
    }

    public int hashCode() {
        String str = this.f5132a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        d dVar = this.f5133b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public b(String str, d dVar) {
        this.f5132a = str;
        this.f5133b = dVar;
    }

    public String toString() {
        return cFAYKUlMj.WUoj + this.f5132a + ", error=" + this.f5133b + ")";
    }

    public /* synthetic */ b(String str, d dVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : dVar);
    }
}
