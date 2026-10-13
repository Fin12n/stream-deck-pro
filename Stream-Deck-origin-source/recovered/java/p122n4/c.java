package p122n4;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f30573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f30574c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends f.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f30575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f30576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set f30577c;

        @Override // n4.f.b.a
        public f.b a() {
            String str = "";
            if (this.f30575a == null) {
                str = " delta";
            }
            if (this.f30576b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f30577c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f30575a.longValue(), this.f30576b.longValue(), this.f30577c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // n4.f.b.a
        public f.b.a b(long j8) {
            this.f30575a = Long.valueOf(j8);
            return this;
        }

        @Override // n4.f.b.a
        public f.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f30577c = set;
            return this;
        }

        @Override // n4.f.b.a
        public f.b.a d(long j8) {
            this.f30576b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // n4.f.b
    public long b() {
        return this.f30572a;
    }

    @Override // n4.f.b
    public Set c() {
        return this.f30574c;
    }

    @Override // n4.f.b
    public long d() {
        return this.f30573b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f.b) {
            f.b bVar = (f.b) obj;
            if (this.f30572a == bVar.b() && this.f30573b == bVar.d() && this.f30574c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j8 = this.f30572a;
        int i8 = (((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003;
        long j9 = this.f30573b;
        return ((i8 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f30574c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f30572a + ", maxAllowedDelay=" + this.f30573b + ", flags=" + this.f30574c + "}";
    }

    public c(long j8, long j9, Set set) {
        this.f30572a = j8;
        this.f30573b = j9;
        this.f30574c = set;
    }
}
