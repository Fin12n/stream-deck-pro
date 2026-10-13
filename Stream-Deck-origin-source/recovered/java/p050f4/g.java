package p050f4;

import java.util.List;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f21886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f21887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f21889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f21890g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f21891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f21892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public k f21893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f21894d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f21895e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List f21896f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p f21897g;

        @Override // f4.m.a
        public m a() {
            String str = "";
            if (this.f21891a == null) {
                str = " requestTimeMs";
            }
            if (this.f21892b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f21891a.longValue(), this.f21892b.longValue(), this.f21893c, this.f21894d, this.f21895e, this.f21896f, this.f21897g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f4.m.a
        public m.a b(k kVar) {
            this.f21893c = kVar;
            return this;
        }

        @Override // f4.m.a
        public m.a c(List list) {
            this.f21896f = list;
            return this;
        }

        @Override // f4.m.a
        public m.a d(Integer num) {
            this.f21894d = num;
            return this;
        }

        @Override // f4.m.a
        public m.a e(String str) {
            this.f21895e = str;
            return this;
        }

        @Override // f4.m.a
        public m.a f(p pVar) {
            this.f21897g = pVar;
            return this;
        }

        @Override // f4.m.a
        public m.a g(long j8) {
            this.f21891a = Long.valueOf(j8);
            return this;
        }

        @Override // f4.m.a
        public m.a h(long j8) {
            this.f21892b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // p050f4.m
    public k b() {
        return this.f21886c;
    }

    @Override // p050f4.m
    public List c() {
        return this.f21889f;
    }

    @Override // p050f4.m
    public Integer d() {
        return this.f21887d;
    }

    @Override // p050f4.m
    public String e() {
        return this.f21888e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List list;
        p pVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f21884a == mVar.g() && this.f21885b == mVar.h() && ((kVar = this.f21886c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f21887d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f21888e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f21889f) != null ? list.equals(mVar.c()) : mVar.c() == null) && ((pVar = this.f21890g) != null ? pVar.equals(mVar.f()) : mVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // p050f4.m
    public p f() {
        return this.f21890g;
    }

    @Override // p050f4.m
    public long g() {
        return this.f21884a;
    }

    @Override // p050f4.m
    public long h() {
        return this.f21885b;
    }

    public int hashCode() {
        long j8 = this.f21884a;
        long j9 = this.f21885b;
        int i8 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003;
        k kVar = this.f21886c;
        int iHashCode = (i8 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f21887d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f21888e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f21889f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f21890g;
        return iHashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public g(long j8, long j9, k kVar, Integer num, String str, List list, p pVar) {
        this.f21884a = j8;
        this.f21885b = j9;
        this.f21886c = kVar;
        this.f21887d = num;
        this.f21888e = str;
        this.f21889f = list;
        this.f21890g = pVar;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f21884a + ", requestUptimeMs=" + this.f21885b + ", clientInfo=" + this.f21886c + ", logSource=" + this.f21887d + ", logSourceName=" + this.f21888e + ", logEvents=" + this.f21889f + RaiWHuj.KpkCfoRiS + this.f21890g + "}";
    }
}
