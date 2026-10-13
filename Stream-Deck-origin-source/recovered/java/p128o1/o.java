package p128o1;

import Q0.f;
import Q0.g;
import Q0.h;
import R0.H0;
import W6.n;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f30829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f30834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f30835g;

    public o(n nVar, int i8, int i9, int i10, int i11, float f8, float f9) {
        this.f30829a = nVar;
        this.f30830b = i8;
        this.f30831c = i9;
        this.f30832d = i10;
        this.f30833e = i11;
        this.f30834f = f8;
        this.f30835g = f9;
    }

    public final float a() {
        return this.f30835g;
    }

    public final int b() {
        return this.f30831c;
    }

    public final int c() {
        return this.f30833e;
    }

    public final int d() {
        return this.f30831c - this.f30830b;
    }

    public final n e() {
        return this.f30829a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return t.c(this.f30829a, oVar.f30829a) && this.f30830b == oVar.f30830b && this.f30831c == oVar.f30831c && this.f30832d == oVar.f30832d && this.f30833e == oVar.f30833e && Float.compare(this.f30834f, oVar.f30834f) == 0 && Float.compare(this.f30835g, oVar.f30835g) == 0;
    }

    public final int f() {
        return this.f30830b;
    }

    public final int g() {
        return this.f30832d;
    }

    public final float h() {
        return this.f30834f;
    }

    public int hashCode() {
        return (((((((((((this.f30829a.hashCode() * 31) + Integer.hashCode(this.f30830b)) * 31) + Integer.hashCode(this.f30831c)) * 31) + Integer.hashCode(this.f30832d)) * 31) + Integer.hashCode(this.f30833e)) * 31) + Float.hashCode(this.f30834f)) * 31) + Float.hashCode(this.f30835g);
    }

    public final h i(h hVar) {
        return hVar.t(g.a(0.0f, this.f30834f));
    }

    public final H0 j(H0 h8) {
        h8.m(g.a(0.0f, this.f30834f));
        return h8;
    }

    public final long k(long j8) {
        return H.b(l(G.n(j8)), l(G.i(j8)));
    }

    public final int l(int i8) {
        return i8 + this.f30830b;
    }

    public final int m(int i8) {
        return i8 + this.f30832d;
    }

    public final float n(float f8) {
        return f8 + this.f30834f;
    }

    public final long o(long j8) {
        return g.a(f.o(j8), f.p(j8) - this.f30834f);
    }

    public final int p(int i8) {
        return n.k(i8, this.f30830b, this.f30831c) - this.f30830b;
    }

    public final int q(int i8) {
        return i8 - this.f30832d;
    }

    public final float r(float f8) {
        return f8 - this.f30834f;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.f30829a + ", startIndex=" + this.f30830b + ", endIndex=" + this.f30831c + ", startLineIndex=" + this.f30832d + ", endLineIndex=" + this.f30833e + ", top=" + this.f30834f + ", bottom=" + this.f30835g + ')';
    }

    public /* synthetic */ o(n nVar, int i8, int i9, int i10, int i11, float f8, float f9, int i12, AbstractC2633k abstractC2633k) {
        this(nVar, i8, i9, (i12 & 8) != 0 ? -1 : i10, (i12 & 16) != 0 ? -1 : i11, (i12 & 32) != 0 ? -1.0f : f8, (i12 & 64) != 0 ? -1.0f : f9);
    }
}
