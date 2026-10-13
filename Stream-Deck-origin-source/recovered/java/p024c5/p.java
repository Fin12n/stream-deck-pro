package p024c5;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f16263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16265c;

    public p(Class cls, int i8, int i9) {
        this.f16263a = (Class) B.c(cls, "Null dependency anInterface.");
        this.f16264b = i8;
        this.f16265c = i9;
    }

    public static String a(int i8) {
        if (i8 == 0) {
            return "direct";
        }
        if (i8 == 1) {
            return "provider";
        }
        if (i8 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i8);
    }

    public static p g(Class cls) {
        return new p(cls, 1, 0);
    }

    public static p h(Class cls) {
        return new p(cls, 1, 1);
    }

    public static p i(Class cls) {
        return new p(cls, 2, 0);
    }

    public Class b() {
        return this.f16263a;
    }

    public boolean c() {
        return this.f16265c == 2;
    }

    public boolean d() {
        return this.f16265c == 0;
    }

    public boolean e() {
        return this.f16264b == 1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f16263a == pVar.f16263a && this.f16264b == pVar.f16264b && this.f16265c == pVar.f16265c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f16264b == 2;
    }

    public int hashCode() {
        return ((((this.f16263a.hashCode() ^ 1000003) * 1000003) ^ this.f16264b) * 1000003) ^ this.f16265c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f16263a);
        sb.append(", type=");
        int i8 = this.f16264b;
        if (i8 == 1) {
            str = "required";
        } else {
            str = i8 == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(a(this.f16265c));
        sb.append("}");
        return sb.toString();
    }
}
