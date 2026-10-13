package A1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f449e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f450f = new p(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f454d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public p(int i8, int i9, int i10, int i11) {
        this.f451a = i8;
        this.f452b = i9;
        this.f453c = i10;
        this.f454d = i11;
    }

    public final int a() {
        return this.f454d;
    }

    public final long b() {
        return o.a(this.f451a + (g() / 2), this.f452b + (c() / 2));
    }

    public final int c() {
        return this.f454d - this.f452b;
    }

    public final int d() {
        return this.f451a;
    }

    public final int e() {
        return this.f453c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f451a == pVar.f451a && this.f452b == pVar.f452b && this.f453c == pVar.f453c && this.f454d == pVar.f454d;
    }

    public final int f() {
        return this.f452b;
    }

    public final int g() {
        return this.f453c - this.f451a;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f451a) * 31) + Integer.hashCode(this.f452b)) * 31) + Integer.hashCode(this.f453c)) * 31) + Integer.hashCode(this.f454d);
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.f451a + ", " + this.f452b + ", " + this.f453c + ", " + this.f454d + ')';
    }
}
