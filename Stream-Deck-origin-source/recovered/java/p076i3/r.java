package p076i3;

import p004a3.C1705k;
import p004a3.J;
import p022c3.c;
import p067h3.h;
import p085j3.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class r implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f24699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24700d;

    public r(String str, int i8, h hVar, boolean z8) {
        this.f24697a = str;
        this.f24698b = i8;
        this.f24699c = hVar;
        this.f24700d = z8;
    }

    @Override // p076i3.c
    public c a(J j8, C1705k c1705k, b bVar) {
        return new p022c3.r(j8, bVar, this);
    }

    public String b() {
        return this.f24697a;
    }

    public h c() {
        return this.f24699c;
    }

    public boolean d() {
        return this.f24700d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f24697a + ", index=" + this.f24698b + '}';
    }
}
