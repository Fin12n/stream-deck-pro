package p082j0;

/* JADX INFO: renamed from: j0.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2619x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28077d;

    public C2619x(int i8, int i9, int i10, int i11) {
        this.f28074a = i8;
        this.f28075b = i9;
        this.f28076c = i10;
        this.f28077d = i11;
    }

    public final int a() {
        return this.f28077d;
    }

    public final int b() {
        return this.f28074a;
    }

    public final int c() {
        return this.f28076c;
    }

    public final int d() {
        return this.f28075b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2619x)) {
            return false;
        }
        C2619x c2619x = (C2619x) obj;
        return this.f28074a == c2619x.f28074a && this.f28075b == c2619x.f28075b && this.f28076c == c2619x.f28076c && this.f28077d == c2619x.f28077d;
    }

    public int hashCode() {
        return (((((this.f28074a * 31) + this.f28075b) * 31) + this.f28076c) * 31) + this.f28077d;
    }

    public String toString() {
        return "InsetsValues(left=" + this.f28074a + ", top=" + this.f28075b + ", right=" + this.f28076c + ", bottom=" + this.f28077d + ')';
    }
}
