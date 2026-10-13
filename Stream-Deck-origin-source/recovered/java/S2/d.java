package S2;

import kotlin.jvm.internal.t;
import p215z0.H;
import p215z0.L0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d implements L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f9693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q6.k f9694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public H f9695c;

    public d(a configurationChecker, Q6.k effect) {
        t.g(configurationChecker, "configurationChecker");
        t.g(effect, "effect");
        this.f9693a = configurationChecker;
        this.f9694b = effect;
    }

    @Override // p215z0.L0
    public void c() {
        H h8 = this.f9695c;
        if (h8 != null) {
            if (this.f9693a.a()) {
                h8 = null;
            }
            if (h8 != null) {
                h8.d();
            }
        }
        this.f9695c = null;
    }

    @Override // p215z0.L0
    public void d() {
        this.f9695c = (H) this.f9694b.invoke(e.f9696a);
    }

    @Override // p215z0.L0
    public void b() {
    }
}
