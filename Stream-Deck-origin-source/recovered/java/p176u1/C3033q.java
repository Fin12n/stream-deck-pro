package p176u1;

import D6.C0933m;

/* JADX INFO: renamed from: u1.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3033q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public char[] f34460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34462d;

    public C3033q(char[] cArr, int i8, int i9) {
        this.f34459a = cArr.length;
        this.f34460b = cArr;
        this.f34461c = i8;
        this.f34462d = i9;
    }

    public final void a(StringBuilder sb) {
        sb.append(this.f34460b, 0, this.f34461c);
        char[] cArr = this.f34460b;
        int i8 = this.f34462d;
        sb.append(cArr, i8, this.f34459a - i8);
    }

    public final void b(int i8, int i9) {
        int i10 = this.f34461c;
        if (i8 < i10 && i9 <= i10) {
            int i11 = i10 - i9;
            char[] cArr = this.f34460b;
            C0933m.e(cArr, cArr, this.f34462d - i11, i9, i10);
            this.f34461c = i8;
            this.f34462d -= i11;
            return;
        }
        if (i8 < i10 && i9 >= i10) {
            this.f34462d = i9 + c();
            this.f34461c = i8;
            return;
        }
        int iC = i8 + c();
        int iC2 = i9 + c();
        int i12 = this.f34462d;
        char[] cArr2 = this.f34460b;
        C0933m.e(cArr2, cArr2, this.f34461c, i12, iC);
        this.f34461c += iC - i12;
        this.f34462d = iC2;
    }

    public final int c() {
        return this.f34462d - this.f34461c;
    }

    public final char d(int i8) {
        int i9 = this.f34461c;
        return i8 < i9 ? this.f34460b[i8] : this.f34460b[(i8 - i9) + this.f34462d];
    }

    public final int e() {
        return this.f34459a - c();
    }

    public final void f(int i8) {
        if (i8 <= c()) {
            return;
        }
        int iC = i8 - c();
        int i9 = this.f34459a;
        do {
            i9 *= 2;
        } while (i9 - this.f34459a < iC);
        char[] cArr = new char[i9];
        C0933m.e(this.f34460b, cArr, 0, 0, this.f34461c);
        int i10 = this.f34459a;
        int i11 = this.f34462d;
        int i12 = i10 - i11;
        int i13 = i9 - i12;
        C0933m.e(this.f34460b, cArr, i13, i11, i12 + i11);
        this.f34460b = cArr;
        this.f34459a = i9;
        this.f34462d = i13;
    }

    public final void g(int i8, int i9, String str) {
        f(str.length() - (i9 - i8));
        b(i8, i9);
        r.b(str, this.f34460b, this.f34461c);
        this.f34461c += str.length();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) sb);
        return sb.toString();
    }
}
