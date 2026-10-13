package p076i3;

import p004a3.C1705k;
import p004a3.J;
import p022c3.c;
import p022c3.o;
import p067h3.b;
import p067h3.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class l implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f24674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f24675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f24676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f24677e;

    public l(String str, m mVar, m mVar2, b bVar, boolean z8) {
        this.f24673a = str;
        this.f24674b = mVar;
        this.f24675c = mVar2;
        this.f24676d = bVar;
        this.f24677e = z8;
    }

    @Override // p076i3.c
    public c a(J j8, C1705k c1705k, p085j3.b bVar) {
        return new o(j8, bVar, this);
    }

    public b b() {
        return this.f24676d;
    }

    public String c() {
        return this.f24673a;
    }

    public m d() {
        return this.f24674b;
    }

    public m e() {
        return this.f24675c;
    }

    public boolean f() {
        return this.f24677e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f24674b + ", size=" + this.f24675c + '}';
    }
}
