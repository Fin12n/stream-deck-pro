package S;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9534d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f9535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f9536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f9537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f9538d;

        @Override // S.e.a
        public e a() {
            String str = "";
            if (this.f9535a == null) {
                str = " glVersion";
            }
            if (this.f9536b == null) {
                str = str + " eglVersion";
            }
            if (this.f9537c == null) {
                str = str + " glExtensions";
            }
            if (this.f9538d == null) {
                str = str + " eglExtensions";
            }
            if (str.isEmpty()) {
                return new a(this.f9535a, this.f9536b, this.f9537c, this.f9538d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // S.e.a
        public e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglExtensions");
            }
            this.f9538d = str;
            return this;
        }

        @Override // S.e.a
        public e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            this.f9536b = str;
            return this;
        }

        @Override // S.e.a
        public e.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null glExtensions");
            }
            this.f9537c = str;
            return this;
        }

        @Override // S.e.a
        public e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null glVersion");
            }
            this.f9535a = str;
            return this;
        }
    }

    @Override // S.e
    public String b() {
        return this.f9534d;
    }

    @Override // S.e
    public String c() {
        return this.f9532b;
    }

    @Override // S.e
    public String d() {
        return this.f9533c;
    }

    @Override // S.e
    public String e() {
        return this.f9531a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f9531a.equals(eVar.e()) && this.f9532b.equals(eVar.c()) && this.f9533c.equals(eVar.d()) && this.f9534d.equals(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f9531a.hashCode() ^ 1000003) * 1000003) ^ this.f9532b.hashCode()) * 1000003) ^ this.f9533c.hashCode()) * 1000003) ^ this.f9534d.hashCode();
    }

    public String toString() {
        return "GraphicDeviceInfo{glVersion=" + this.f9531a + ", eglVersion=" + this.f9532b + ", glExtensions=" + this.f9533c + ", eglExtensions=" + this.f9534d + "}";
    }

    public a(String str, String str2, String str3, String str4) {
        this.f9531a = str;
        this.f9532b = str2;
        this.f9533c = str3;
        this.f9534d = str4;
    }
}
