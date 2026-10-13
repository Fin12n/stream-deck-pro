package p076i3;

import p004a3.C1705k;
import p004a3.J;
import p022c3.c;
import p067h3.f;
import p067h3.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f24588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f24589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f24591e;

    public b(String str, m mVar, f fVar, boolean z8, boolean z9) {
        this.f24587a = str;
        this.f24588b = mVar;
        this.f24589c = fVar;
        this.f24590d = z8;
        this.f24591e = z9;
    }

    @Override // p076i3.c
    public c a(J j8, C1705k c1705k, p085j3.b bVar) {
        return new p022c3.f(j8, bVar, this);
    }

    public String b() {
        return this.f24587a;
    }

    public m c() {
        return this.f24588b;
    }

    public f d() {
        return this.f24589c;
    }

    public boolean e() {
        return this.f24591e;
    }

    public boolean f() {
        return this.f24590d;
    }
}
