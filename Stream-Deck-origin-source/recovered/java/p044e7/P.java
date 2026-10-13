package p044e7;

import C6.G;
import C6.q;
import H6.b;
import H6.c;
import I6.h;
import X.i;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.t;
import p017b7.C1797m;
import p053f7.d;
import p062g7.AbstractC2367f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class P extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f20961a = new AtomicReference(null);

    @Override // p053f7.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(N n8) {
        if (AbstractC2367f.a(this.f20961a) != null) {
            return false;
        }
        AbstractC2367f.b(this.f20961a, O.f20959a);
        return true;
    }

    public final Object e(G6.d dVar) {
        C1797m c1797m = new C1797m(b.c(dVar), 1);
        c1797m.z();
        if (!i.a(this.f20961a, O.f20959a, c1797m)) {
            q.a aVar = q.f1441b;
            c1797m.resumeWith(q.b(G.f1419a));
        }
        Object objS = c1797m.s();
        if (objS == c.f()) {
            h.c(dVar);
        }
        return objS == c.f() ? objS : G.f1419a;
    }

    @Override // p053f7.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public G6.d[] b(N n8) {
        AbstractC2367f.b(this.f20961a, null);
        return p053f7.c.f22272a;
    }

    public final void g() {
        AtomicReference atomicReference = this.f20961a;
        while (true) {
            Object objA = AbstractC2367f.a(atomicReference);
            if (objA == null || objA == O.f20960b) {
                return;
            }
            if (objA == O.f20959a) {
                if (i.a(this.f20961a, objA, O.f20960b)) {
                    return;
                }
            } else if (i.a(this.f20961a, objA, O.f20959a)) {
                q.a aVar = q.f1441b;
                ((C1797m) objA).resumeWith(q.b(G.f1419a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this.f20961a.getAndSet(O.f20959a);
        t.d(andSet);
        return andSet == O.f20960b;
    }
}
