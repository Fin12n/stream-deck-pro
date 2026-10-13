package p076i3;

import android.graphics.Path;
import p004a3.C1705k;
import p004a3.J;
import p022c3.c;
import p022c3.g;
import p067h3.a;
import p067h3.d;
import p085j3.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class p implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f24689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f24691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f24692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f24693f;

    public p(String str, boolean z8, Path.FillType fillType, a aVar, d dVar, boolean z9) {
        this.f24690c = str;
        this.f24688a = z8;
        this.f24689b = fillType;
        this.f24691d = aVar;
        this.f24692e = dVar;
        this.f24693f = z9;
    }

    @Override // p076i3.c
    public c a(J j8, C1705k c1705k, b bVar) {
        return new g(j8, bVar, this);
    }

    public a b() {
        return this.f24691d;
    }

    public Path.FillType c() {
        return this.f24689b;
    }

    public String d() {
        return this.f24690c;
    }

    public d e() {
        return this.f24692e;
    }

    public boolean f() {
        return this.f24693f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f24688a + '}';
    }
}
