package p140p5;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends PhantomReference implements C2791a.InterfaceC0670a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f31301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f31302b;

    public /* synthetic */ r(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, q qVar) {
        super(obj, referenceQueue);
        this.f31301a = set;
        this.f31302b = runnable;
    }

    @Override // p140p5.C2791a.InterfaceC0670a
    public final void a() {
        if (this.f31301a.remove(this)) {
            clear();
            this.f31302b.run();
        }
    }
}
