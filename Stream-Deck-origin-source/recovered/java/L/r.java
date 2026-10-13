package L;

import H.InterfaceC0984i0;
import H.a1;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface r extends a1 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final InterfaceC0984i0.a f4796O = InterfaceC0984i0.a.a("camerax.core.thread.backgroundExecutor", Executor.class);

    default Executor b0(Executor executor) {
        return (Executor) f(f4796O, executor);
    }
}
