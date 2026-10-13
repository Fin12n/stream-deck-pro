package s7;

/* JADX INFO: renamed from: s7.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2898e implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char[] f33271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33272b;

    public C2898e(char[] buffer) {
        kotlin.jvm.internal.t.g(buffer, "buffer");
        this.f33271a = buffer;
        this.f33272b = buffer.length;
    }

    public char a(int i8) {
        return this.f33271a[i8];
    }

    public final char[] b() {
        return this.f33271a;
    }

    public int c() {
        return this.f33272b;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i8) {
        return a(i8);
    }

    public void d(int i8) {
        this.f33272b = i8;
    }

    public final String e(int i8, int i9) {
        return Z6.v.r(this.f33271a, i8, Math.min(i9, length()));
    }

    public final void f(int i8) {
        d(Math.min(this.f33271a.length, i8));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i8, int i9) {
        return Z6.v.r(this.f33271a, i8, Math.min(i9, length()));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return e(0, length());
    }
}
