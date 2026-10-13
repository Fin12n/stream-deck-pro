package p076i3;

import p004a3.C1705k;
import p004a3.J;
import p022c3.c;
import p022c3.p;
import p067h3.b;
import p067h3.l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class m implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f24679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f24680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f24681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f24682e;

    public m(String str, b bVar, b bVar2, l lVar, boolean z8) {
        this.f24678a = str;
        this.f24679b = bVar;
        this.f24680c = bVar2;
        this.f24681d = lVar;
        this.f24682e = z8;
    }

    @Override // p076i3.c
    public c a(J j8, C1705k c1705k, p085j3.b bVar) {
        return new p(j8, bVar, this);
    }

    public b b() {
        return this.f24679b;
    }

    public String c() {
        return this.f24678a;
    }

    public b d() {
        return this.f24680c;
    }

    public l e() {
        return this.f24681d;
    }

    public boolean f() {
        return this.f24682e;
    }
}
