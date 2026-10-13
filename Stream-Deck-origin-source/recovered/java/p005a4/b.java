package p005a4;

import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f13334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13337f;

    public b(String dsn, String environment, double d8, boolean z8, boolean z9, boolean z10) {
        t.g(dsn, "dsn");
        t.g(environment, "environment");
        this.f13332a = dsn;
        this.f13333b = environment;
        this.f13334c = d8;
        this.f13335d = z8;
        this.f13336e = z9;
        this.f13337f = z10;
    }

    public final boolean a() {
        return this.f13337f;
    }

    public final String b() {
        return this.f13332a;
    }

    public final boolean c() {
        return this.f13335d;
    }

    public final String d() {
        return this.f13333b;
    }

    public final double e() {
        return this.f13334c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return t.c(this.f13332a, bVar.f13332a) && t.c(this.f13333b, bVar.f13333b) && Double.compare(this.f13334c, bVar.f13334c) == 0 && this.f13335d == bVar.f13335d && this.f13336e == bVar.f13336e && this.f13337f == bVar.f13337f;
    }

    public int hashCode() {
        return (((((((((this.f13332a.hashCode() * 31) + this.f13333b.hashCode()) * 31) + Double.hashCode(this.f13334c)) * 31) + Boolean.hashCode(this.f13335d)) * 31) + Boolean.hashCode(this.f13336e)) * 31) + Boolean.hashCode(this.f13337f);
    }

    public String toString() {
        return "SentryConfiguration(dsn=" + this.f13332a + ", environment=" + this.f13333b + ajyWhveMDgQ.dEHszYaEekB + this.f13334c + ", enableDebugLogging=" + this.f13335d + ", enableAppHangTracking=" + this.f13336e + ", attachStacktrace=" + this.f13337f + ")";
    }

    public /* synthetic */ b(String str, String str2, double d8, boolean z8, boolean z9, boolean z10, int i8, AbstractC2633k abstractC2633k) {
        this(str, (i8 & 2) != 0 ? "production" : str2, (i8 & 4) != 0 ? 1.0d : d8, (i8 & 8) != 0 ? false : z8, (i8 & 16) != 0 ? true : z9, (i8 & 32) != 0 ? true : z10);
    }
}
