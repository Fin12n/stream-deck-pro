package p082j0;

import A1.d;
import A1.t;
import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3164l0 f27933c;

    public b0(C2619x c2619x, String str) {
        this.f27932b = str;
        this.f27933c = l1.e(c2619x, null, 2, null);
    }

    @Override // p082j0.d0
    public int a(d dVar) {
        return e().d();
    }

    @Override // p082j0.d0
    public int b(d dVar, t tVar) {
        return e().c();
    }

    @Override // p082j0.d0
    public int c(d dVar, t tVar) {
        return e().b();
    }

    @Override // p082j0.d0
    public int d(d dVar) {
        return e().a();
    }

    public final C2619x e() {
        return (C2619x) this.f27933c.getValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            return kotlin.jvm.internal.t.c(e(), ((b0) obj).e());
        }
        return false;
    }

    public final void f(C2619x c2619x) {
        this.f27933c.setValue(c2619x);
    }

    public int hashCode() {
        return this.f27932b.hashCode();
    }

    public String toString() {
        return this.f27932b + "(left=" + e().b() + ", top=" + e().d() + ", right=" + e().c() + ", bottom=" + e().a() + ')';
    }
}
