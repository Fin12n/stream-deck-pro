package p082j0;

import A1.d;
import A1.t;

/* JADX INFO: renamed from: j0.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2614s implements d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28060e;

    public C2614s(int i8, int i9, int i10, int i11) {
        this.f28057b = i8;
        this.f28058c = i9;
        this.f28059d = i10;
        this.f28060e = i11;
    }

    @Override // p082j0.d0
    public int a(d dVar) {
        return this.f28058c;
    }

    @Override // p082j0.d0
    public int b(d dVar, t tVar) {
        return this.f28059d;
    }

    @Override // p082j0.d0
    public int c(d dVar, t tVar) {
        return this.f28057b;
    }

    @Override // p082j0.d0
    public int d(d dVar) {
        return this.f28060e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2614s)) {
            return false;
        }
        C2614s c2614s = (C2614s) obj;
        return this.f28057b == c2614s.f28057b && this.f28058c == c2614s.f28058c && this.f28059d == c2614s.f28059d && this.f28060e == c2614s.f28060e;
    }

    public int hashCode() {
        return (((((this.f28057b * 31) + this.f28058c) * 31) + this.f28059d) * 31) + this.f28060e;
    }

    public String toString() {
        return "Insets(left=" + this.f28057b + ", top=" + this.f28058c + ", right=" + this.f28059d + ", bottom=" + this.f28060e + ')';
    }
}
