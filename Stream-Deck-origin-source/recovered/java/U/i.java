package U;

import H.InterfaceC0984i0;
import H.InterfaceC1017z0;
import H.T0;
import H.u1;
import L.r;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class i implements u1, InterfaceC1017z0, r {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final InterfaceC0984i0.a f9973Q = InterfaceC0984i0.a.a("camerax.core.streamSharing.captureTypes", List.class);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final T0 f9974P;

    public i(T0 t8) {
        this.f9974P = t8;
    }

    public List f0() {
        return (List) h(f9973Q);
    }

    @Override // H.a1
    public InterfaceC0984i0 q() {
        return this.f9974P;
    }
}
