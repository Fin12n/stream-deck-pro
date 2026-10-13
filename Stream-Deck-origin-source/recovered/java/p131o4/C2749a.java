package p131o4;

import I0.mIk.efuWFSeiT;
import R0.pkXL.Oitvkwcwn;

/* JADX INFO: renamed from: o4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2749a extends AbstractC2753e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f30909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f30912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f30913f;

    /* JADX INFO: renamed from: o4.a$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends AbstractC2753e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f30914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f30915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f30916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f30917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f30918e;

        @Override // p131o4.AbstractC2753e.a
        public AbstractC2753e.a b(int i8) {
            this.f30916c = Integer.valueOf(i8);
            return this;
        }

        @Override // p131o4.AbstractC2753e.a
        public AbstractC2753e.a c(long j8) {
            this.f30917d = Long.valueOf(j8);
            return this;
        }

        @Override // p131o4.AbstractC2753e.a
        public AbstractC2753e.a d(int i8) {
            this.f30915b = Integer.valueOf(i8);
            return this;
        }

        @Override // p131o4.AbstractC2753e.a
        public AbstractC2753e.a e(int i8) {
            this.f30918e = Integer.valueOf(i8);
            return this;
        }

        @Override // p131o4.AbstractC2753e.a
        public AbstractC2753e.a f(long j8) {
            this.f30914a = Long.valueOf(j8);
            return this;
        }

        @Override // p131o4.AbstractC2753e.a
        public AbstractC2753e a() {
            String str = "";
            if (this.f30914a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f30915b == null) {
                str = str + Oitvkwcwn.lIOkrOoPKJbwU;
            }
            if (this.f30916c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f30917d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f30918e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C2749a(this.f30914a.longValue(), this.f30915b.intValue(), this.f30916c.intValue(), this.f30917d.longValue(), this.f30918e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    @Override // p131o4.AbstractC2753e
    public int b() {
        return this.f30911d;
    }

    @Override // p131o4.AbstractC2753e
    public long c() {
        return this.f30912e;
    }

    @Override // p131o4.AbstractC2753e
    public int d() {
        return this.f30910c;
    }

    @Override // p131o4.AbstractC2753e
    public int e() {
        return this.f30913f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2753e) {
            AbstractC2753e abstractC2753e = (AbstractC2753e) obj;
            if (this.f30909b == abstractC2753e.f() && this.f30910c == abstractC2753e.d() && this.f30911d == abstractC2753e.b() && this.f30912e == abstractC2753e.c() && this.f30913f == abstractC2753e.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // p131o4.AbstractC2753e
    public long f() {
        return this.f30909b;
    }

    public int hashCode() {
        long j8 = this.f30909b;
        int i8 = (((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f30910c) * 1000003) ^ this.f30911d) * 1000003;
        long j9 = this.f30912e;
        return ((i8 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f30913f;
    }

    public C2749a(long j8, int i8, int i9, long j9, int i10) {
        this.f30909b = j8;
        this.f30910c = i8;
        this.f30911d = i9;
        this.f30912e = j9;
        this.f30913f = i10;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f30909b + efuWFSeiT.pigQh + this.f30910c + ", criticalSectionEnterTimeoutMs=" + this.f30911d + ", eventCleanUpAge=" + this.f30912e + ", maxBlobByteSizePerRow=" + this.f30913f + "}";
    }
}
