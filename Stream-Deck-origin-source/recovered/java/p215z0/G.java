package p215z0;

import Q6.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class G implements L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f38542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public H f38543b;

    public G(k kVar) {
        this.f38542a = kVar;
    }

    @Override // p215z0.L0
    public void c() {
        H h8 = this.f38543b;
        if (h8 != null) {
            h8.d();
        }
        this.f38543b = null;
    }

    @Override // p215z0.L0
    public void d() {
        this.f38543b = (H) this.f38542a.invoke(K.f38626a);
    }

    @Override // p215z0.L0
    public void b() {
    }
}
