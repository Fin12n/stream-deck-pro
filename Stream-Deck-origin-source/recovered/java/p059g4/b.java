package p059g4;

import com.google.android.datatransport.runtime.e;
import p032d4.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f23744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f23746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p032d4.e f23747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p032d4.b f23748e;

    /* JADX INFO: renamed from: g4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0550b extends j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f23749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f23750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f23751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p032d4.e f23752d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public p032d4.b f23753e;

        @Override // g4.j.a
        public j a() {
            String str = "";
            if (this.f23749a == null) {
                str = " transportContext";
            }
            if (this.f23750b == null) {
                str = str + " transportName";
            }
            if (this.f23751c == null) {
                str = str + " event";
            }
            if (this.f23752d == null) {
                str = str + " transformer";
            }
            if (this.f23753e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new b(this.f23749a, this.f23750b, this.f23751c, this.f23752d, this.f23753e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // g4.j.a
        public j.a b(p032d4.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f23753e = bVar;
            return this;
        }

        @Override // g4.j.a
        public j.a c(c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f23751c = cVar;
            return this;
        }

        @Override // g4.j.a
        public j.a d(p032d4.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f23752d = eVar;
            return this;
        }

        @Override // g4.j.a
        public j.a e(e eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f23749a = eVar;
            return this;
        }

        @Override // g4.j.a
        public j.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f23750b = str;
            return this;
        }
    }

    @Override // p059g4.j
    public p032d4.b b() {
        return this.f23748e;
    }

    @Override // p059g4.j
    public c c() {
        return this.f23746c;
    }

    @Override // p059g4.j
    public p032d4.e e() {
        return this.f23747d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f23744a.equals(jVar.f()) && this.f23745b.equals(jVar.g()) && this.f23746c.equals(jVar.c()) && this.f23747d.equals(jVar.e()) && this.f23748e.equals(jVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // p059g4.j
    public e f() {
        return this.f23744a;
    }

    @Override // p059g4.j
    public String g() {
        return this.f23745b;
    }

    public int hashCode() {
        return ((((((((this.f23744a.hashCode() ^ 1000003) * 1000003) ^ this.f23745b.hashCode()) * 1000003) ^ this.f23746c.hashCode()) * 1000003) ^ this.f23747d.hashCode()) * 1000003) ^ this.f23748e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f23744a + ", transportName=" + this.f23745b + ", event=" + this.f23746c + ", transformer=" + this.f23747d + ", encoding=" + this.f23748e + "}";
    }

    public b(e eVar, String str, c cVar, p032d4.e eVar2, p032d4.b bVar) {
        this.f23744a = eVar;
        this.f23745b = str;
        this.f23746c = cVar;
        this.f23747d = eVar2;
        this.f23748e = bVar;
    }
}
