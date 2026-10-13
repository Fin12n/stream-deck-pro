package p065h1;

import java.util.List;
import p056g1.i0;
import p110m1.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class E0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f24093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Float f24094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f24095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f24096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f24097f;

    public E0(int i8, List<E0> list, Float f8, Float f9, i iVar, i iVar2) {
        this.f24092a = i8;
        this.f24093b = list;
        this.f24094c = f8;
        this.f24095d = f9;
        this.f24096e = iVar;
        this.f24097f = iVar2;
    }

    @Override // p056g1.i0
    public boolean L() {
        return this.f24093b.contains(this);
    }

    public final i a() {
        return this.f24096e;
    }

    public final Float b() {
        return this.f24094c;
    }

    public final Float c() {
        return this.f24095d;
    }

    public final int d() {
        return this.f24092a;
    }

    public final i e() {
        return this.f24097f;
    }

    public final void f(i iVar) {
        this.f24096e = iVar;
    }

    public final void g(Float f8) {
        this.f24094c = f8;
    }

    public final void h(Float f8) {
        this.f24095d = f8;
    }

    public final void i(i iVar) {
        this.f24097f = iVar;
    }
}
