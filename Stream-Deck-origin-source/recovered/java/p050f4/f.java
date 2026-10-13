package p050f4;

import java.util.Arrays;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f21871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f21873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f21875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f21876g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f21877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f21878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f21879c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f21880d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f21881e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f21882f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o f21883g;

        @Override // f4.l.a
        public l a() {
            String str = "";
            if (this.f21877a == null) {
                str = " eventTimeMs";
            }
            if (this.f21879c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f21882f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f21877a.longValue(), this.f21878b, this.f21879c.longValue(), this.f21880d, this.f21881e, this.f21882f.longValue(), this.f21883g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f4.l.a
        public l.a b(Integer num) {
            this.f21878b = num;
            return this;
        }

        @Override // f4.l.a
        public l.a c(long j8) {
            this.f21877a = Long.valueOf(j8);
            return this;
        }

        @Override // f4.l.a
        public l.a d(long j8) {
            this.f21879c = Long.valueOf(j8);
            return this;
        }

        @Override // f4.l.a
        public l.a e(o oVar) {
            this.f21883g = oVar;
            return this;
        }

        @Override // f4.l.a
        public l.a f(byte[] bArr) {
            this.f21880d = bArr;
            return this;
        }

        @Override // f4.l.a
        public l.a g(String str) {
            this.f21881e = str;
            return this;
        }

        @Override // f4.l.a
        public l.a h(long j8) {
            this.f21882f = Long.valueOf(j8);
            return this;
        }
    }

    @Override // p050f4.l
    public Integer b() {
        return this.f21871b;
    }

    @Override // p050f4.l
    public long c() {
        return this.f21870a;
    }

    @Override // p050f4.l
    public long d() {
        return this.f21872c;
    }

    @Override // p050f4.l
    public o e() {
        return this.f21876g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        o oVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f21870a == lVar.c() && ((num = this.f21871b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f21872c == lVar.d()) {
                if (Arrays.equals(this.f21873d, lVar instanceof f ? ((f) lVar).f21873d : lVar.f()) && ((str = this.f21874e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f21875f == lVar.h() && ((oVar = this.f21876g) != null ? oVar.equals(lVar.e()) : lVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p050f4.l
    public byte[] f() {
        return this.f21873d;
    }

    @Override // p050f4.l
    public String g() {
        return this.f21874e;
    }

    @Override // p050f4.l
    public long h() {
        return this.f21875f;
    }

    public int hashCode() {
        long j8 = this.f21870a;
        int i8 = (((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f21871b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j9 = this.f21872c;
        int iHashCode2 = (((((i8 ^ iHashCode) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f21873d)) * 1000003;
        String str = this.f21874e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j10 = this.f21875f;
        int i9 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        o oVar = this.f21876g;
        return i9 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public f(long j8, Integer num, long j9, byte[] bArr, String str, long j10, o oVar) {
        this.f21870a = j8;
        this.f21871b = num;
        this.f21872c = j9;
        this.f21873d = bArr;
        this.f21874e = str;
        this.f21875f = j10;
        this.f21876g = oVar;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f21870a + ", eventCode=" + this.f21871b + OjEsfyJYzbPn.oqSDccn + this.f21872c + ", sourceExtension=" + Arrays.toString(this.f21873d) + ", sourceExtensionJsonProto3=" + this.f21874e + ", timezoneOffsetSeconds=" + this.f21875f + ", networkConnectionInfo=" + this.f21876g + "}";
    }
}
