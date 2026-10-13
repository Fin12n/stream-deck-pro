package V0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Q6.k f10409a;

    public /* synthetic */ l(AbstractC2633k abstractC2633k) {
        this();
    }

    public abstract void a(T0.f fVar);

    public Q6.k b() {
        return this.f10409a;
    }

    public final void c() {
        Q6.k kVarB = b();
        if (kVarB != null) {
            kVarB.invoke(this);
        }
    }

    public void d(Q6.k kVar) {
        this.f10409a = kVar;
    }

    public l() {
    }
}
