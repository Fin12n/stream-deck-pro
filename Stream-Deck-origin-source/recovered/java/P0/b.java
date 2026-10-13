package P0;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b extends L0.i.c implements c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Q6.k f8843n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f8844o;

    public b(Q6.k kVar) {
        this.f8843n = kVar;
    }

    @Override // P0.c
    public void J(l lVar) {
        if (t.c(this.f8844o, lVar)) {
            return;
        }
        this.f8844o = lVar;
        this.f8843n.invoke(lVar);
    }

    public final void d2(Q6.k kVar) {
        this.f8843n = kVar;
    }
}
