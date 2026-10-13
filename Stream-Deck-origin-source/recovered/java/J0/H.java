package J0;

import p215z0.C3151f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class H implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3151f f3929a = new C3151f(0);

    public final boolean e(int i8) {
        return (i8 & AbstractC1024g.a(this.f3929a.get())) != 0;
    }

    public final void q(int i8) {
        int iA;
        do {
            iA = AbstractC1024g.a(this.f3929a.get());
            if ((iA & i8) != 0) {
                return;
            }
        } while (!this.f3929a.compareAndSet(iA, AbstractC1024g.a(iA | i8)));
    }
}
