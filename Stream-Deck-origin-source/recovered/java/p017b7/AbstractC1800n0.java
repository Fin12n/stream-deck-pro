package p017b7;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: b7.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1800n0 {
    public static final F a(Executor executor) {
        F f8;
        Y y8 = executor instanceof Y ? (Y) executor : null;
        return (y8 == null || (f8 = y8.f15930a) == null) ? new C1798m0(executor) : f8;
    }
}
