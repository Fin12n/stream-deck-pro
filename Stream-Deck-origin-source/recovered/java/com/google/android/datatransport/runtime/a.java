package com.google.android.datatransport.runtime;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f17791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p059g4.e f17792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f17795f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f17796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f17797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p059g4.e f17798c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f17799d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f17800e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Map f17801f;

        @Override // com.google.android.datatransport.runtime.d.a
        public d d() {
            String str = "";
            if (this.f17796a == null) {
                str = " transportName";
            }
            if (this.f17798c == null) {
                str = str + " encodedPayload";
            }
            if (this.f17799d == null) {
                str = str + " eventMillis";
            }
            if (this.f17800e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f17801f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new a(this.f17796a, this.f17797b, this.f17798c, this.f17799d.longValue(), this.f17800e.longValue(), this.f17801f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.d.a
        public Map e() {
            Map map = this.f17801f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.google.android.datatransport.runtime.d.a
        public d.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f17801f = map;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.d.a
        public d.a g(Integer num) {
            this.f17797b = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.d.a
        public d.a h(p059g4.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f17798c = eVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.d.a
        public d.a i(long j8) {
            this.f17799d = Long.valueOf(j8);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.d.a
        public d.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f17796a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.d.a
        public d.a k(long j8) {
            this.f17800e = Long.valueOf(j8);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.d
    public Map c() {
        return this.f17795f;
    }

    @Override // com.google.android.datatransport.runtime.d
    public Integer d() {
        return this.f17791b;
    }

    @Override // com.google.android.datatransport.runtime.d
    public p059g4.e e() {
        return this.f17792c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f17790a.equals(dVar.j()) && ((num = this.f17791b) != null ? num.equals(dVar.d()) : dVar.d() == null) && this.f17792c.equals(dVar.e()) && this.f17793d == dVar.f() && this.f17794e == dVar.k() && this.f17795f.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.d
    public long f() {
        return this.f17793d;
    }

    public int hashCode() {
        int iHashCode = (this.f17790a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f17791b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f17792c.hashCode()) * 1000003;
        long j8 = this.f17793d;
        int i8 = (iHashCode2 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f17794e;
        return ((i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f17795f.hashCode();
    }

    @Override // com.google.android.datatransport.runtime.d
    public String j() {
        return this.f17790a;
    }

    @Override // com.google.android.datatransport.runtime.d
    public long k() {
        return this.f17794e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f17790a + ", code=" + this.f17791b + ", encodedPayload=" + this.f17792c + ", eventMillis=" + this.f17793d + ", uptimeMillis=" + this.f17794e + ", autoMetadata=" + this.f17795f + "}";
    }

    public a(String str, Integer num, p059g4.e eVar, long j8, long j9, Map map) {
        this.f17790a = str;
        this.f17791b = num;
        this.f17792c = eVar;
        this.f17793d = j8;
        this.f17794e = j9;
        this.f17795f = map;
    }
}
