package L;

import H.InterfaceC0984i0;
import H.a1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface q extends a1 {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final InterfaceC0984i0.a f4794M = InterfaceC0984i0.a.a("camerax.core.target.name", String.class);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final InterfaceC0984i0.a f4795N = InterfaceC0984i0.a.a("camerax.core.target.class", Class.class);

    default String F(String str) {
        return (String) f(f4794M, str);
    }

    default String S() {
        return (String) h(f4794M);
    }
}
