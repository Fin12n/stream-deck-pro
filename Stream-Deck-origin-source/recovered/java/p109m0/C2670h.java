package p109m0;

import A1.d;
import L0.i;
import p037e0.E;
import p056g1.k0;

/* JADX INFO: renamed from: m0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2670h extends i.c implements k0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public E f29412n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public E f29413o;

    public C2670h(E e8, E e9) {
        this.f29412n = e8;
        this.f29413o = e9;
    }

    public final E d2() {
        return this.f29412n;
    }

    public final E e2() {
        return this.f29413o;
    }

    public final void f2(E e8) {
        this.f29413o = e8;
    }

    @Override // p056g1.k0
    public Object f(d dVar, Object obj) {
        return this;
    }
}
