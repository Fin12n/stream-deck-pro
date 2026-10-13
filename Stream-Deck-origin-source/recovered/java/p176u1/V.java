package p176u1;

import Q0.h;
import Q6.k;
import kotlin.jvm.internal.t;
import p128o1.E;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f34413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f34414b;

    public V(O o8, H h8) {
        this.f34413a = o8;
        this.f34414b = h8;
    }

    public final void a() {
        this.f34413a.e(this);
    }

    public final boolean b() {
        return t.c(this.f34413a.a(), this);
    }

    public final boolean c(h hVar) {
        boolean zB = b();
        if (zB) {
            this.f34414b.b(hVar);
        }
        return zB;
    }

    public final boolean d(M m8, M m9) {
        boolean zB = b();
        if (zB) {
            this.f34414b.e(m8, m9);
        }
        return zB;
    }

    public final boolean e(M m8, D d8, E e8, k kVar, h hVar, h hVar2) {
        boolean zB = b();
        if (zB) {
            this.f34414b.f(m8, d8, e8, kVar, hVar, hVar2);
        }
        return zB;
    }
}
