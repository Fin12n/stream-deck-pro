package Y3;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f12291i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q6.k f12294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f12295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f12298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f12299h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public d(String appIdentifier, String str, Q6.k kVar, m mVar, int i8, long j8, boolean z8, boolean z9) {
        t.g(appIdentifier, "appIdentifier");
        this.f12292a = appIdentifier;
        this.f12293b = str;
        this.f12294c = kVar;
        this.f12295d = mVar;
        this.f12296e = i8;
        this.f12297f = j8;
        this.f12298g = z8;
        this.f12299h = z9;
    }

    public final String a() {
        return this.f12292a;
    }

    public final String b() {
        return this.f12293b;
    }

    public final int c() {
        return this.f12296e;
    }

    public final Q6.k d() {
        return this.f12294c;
    }

    public final long e() {
        return this.f12297f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return t.c(this.f12292a, dVar.f12292a) && t.c(this.f12293b, dVar.f12293b) && t.c(this.f12294c, dVar.f12294c) && t.c(this.f12295d, dVar.f12295d) && this.f12296e == dVar.f12296e && this.f12297f == dVar.f12297f && this.f12298g == dVar.f12298g && this.f12299h == dVar.f12299h;
    }

    public final boolean f() {
        return this.f12299h;
    }

    public final m g() {
        return this.f12295d;
    }

    public int hashCode() {
        int iHashCode = this.f12292a.hashCode() * 31;
        String str = this.f12293b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Q6.k kVar = this.f12294c;
        int iHashCode3 = (iHashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        m mVar = this.f12295d;
        return ((((((((iHashCode3 + (mVar != null ? mVar.hashCode() : 0)) * 31) + Integer.hashCode(this.f12296e)) * 31) + Long.hashCode(this.f12297f)) * 31) + Boolean.hashCode(this.f12298g)) * 31) + Boolean.hashCode(this.f12299h);
    }

    public String toString() {
        return "DataMasterConfiguration(appIdentifier=" + this.f12292a + ", applicationName=" + this.f12293b + ", countryCodeProvider=" + this.f12294c + ", transport=" + this.f12295d + ", batchSize=" + this.f12296e + ", flushIntervalMs=" + this.f12297f + ", enableDebugLogging=" + this.f12298g + ", sendImmediately=" + this.f12299h + ")";
    }

    public /* synthetic */ d(String str, String str2, Q6.k kVar, m mVar, int i8, long j8, boolean z8, boolean z9, int i9, AbstractC2633k abstractC2633k) {
        this(str, (i9 & 2) != 0 ? null : str2, (i9 & 4) != 0 ? null : kVar, (i9 & 8) != 0 ? null : mVar, (i9 & 16) != 0 ? 50 : i8, (i9 & 32) != 0 ? 30000L : j8, (i9 & 64) != 0 ? false : z8, (i9 & 128) != 0 ? false : z9);
    }
}
