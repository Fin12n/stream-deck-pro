package V6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends U6.a {
    @Override // U6.c
    public int g(int i8, int i9) {
        return ThreadLocalRandom.current().nextInt(i8, i9);
    }

    @Override // U6.c
    public long i(long j8, long j9) {
        return ThreadLocalRandom.current().nextLong(j8, j9);
    }

    @Override // U6.a
    public Random j() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        t.f(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
