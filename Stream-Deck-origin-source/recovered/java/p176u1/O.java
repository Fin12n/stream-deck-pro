package p176u1;

import Q6.k;
import X.i;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f34382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f34383b = new AtomicReference(null);

    public O(H h8) {
        this.f34382a = h8;
    }

    public final V a() {
        return (V) this.f34383b.get();
    }

    public final void b() {
        this.f34382a.g();
    }

    public final void c() {
        if (a() != null) {
            this.f34382a.c();
        }
    }

    public V d(M m8, C3036u c3036u, k kVar, k kVar2) {
        this.f34382a.a(m8, c3036u, kVar, kVar2);
        V v8 = new V(this, this.f34382a);
        this.f34383b.set(v8);
        return v8;
    }

    public void e(V v8) {
        if (i.a(this.f34383b, v8, null)) {
            this.f34382a.d();
        }
    }
}
