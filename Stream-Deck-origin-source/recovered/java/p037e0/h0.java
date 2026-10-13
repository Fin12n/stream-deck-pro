package p037e0;

import kotlin.jvm.internal.AbstractC2633k;
import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3164l0 f20265a;

    public /* synthetic */ h0(AbstractC2633k abstractC2633k) {
        this();
    }

    public abstract Object a();

    public abstract Object b();

    public final void c(boolean z8) {
        this.f20265a.setValue(Boolean.valueOf(z8));
    }

    public abstract void d(f0 f0Var);

    public h0() {
        this.f20265a = l1.e(Boolean.FALSE, null, 2, null);
    }
}
