package p076i3;

import p004a3.C1705k;
import p004a3.J;
import p022c3.c;
import p022c3.q;
import p067h3.m;
import p085j3.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f24684b;

    public n(String str, m mVar) {
        this.f24683a = str;
        this.f24684b = mVar;
    }

    @Override // p076i3.c
    public c a(J j8, C1705k c1705k, b bVar) {
        return new q(j8, bVar, this);
    }

    public m b() {
        return this.f24684b;
    }

    public String c() {
        return this.f24683a;
    }
}
