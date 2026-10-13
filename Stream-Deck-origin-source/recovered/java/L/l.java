package L;

import A.T0;
import D6.M;
import H.g1;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f4778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4779b;

    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public final int a() {
        return this.f4779b;
    }

    public final Map b() {
        return this.f4778a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return t.c(this.f4778a, lVar.f4778a) && this.f4779b == lVar.f4779b;
    }

    public int hashCode() {
        return (this.f4778a.hashCode() * 31) + Integer.hashCode(this.f4779b);
    }

    public String toString() {
        return "StreamSpecQueryResult(streamSpecs=" + this.f4778a + ", maxSupportedFrameRate=" + this.f4779b + ')';
    }

    public l(Map<T0, ? extends g1> streamSpecs, int i8) {
        t.g(streamSpecs, "streamSpecs");
        this.f4778a = streamSpecs;
        this.f4779b = i8;
    }

    public /* synthetic */ l(Map map, int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? M.g() : map, (i9 & 2) != 0 ? Integer.MAX_VALUE : i8);
    }
}
