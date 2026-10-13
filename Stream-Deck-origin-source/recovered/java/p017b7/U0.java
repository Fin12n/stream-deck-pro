package p017b7;

import p062g7.G;
import p062g7.L;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U0 f15919a = new U0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f15920b = L.a(new G("ThreadLocalEventLoop"));

    public final AbstractC1784f0 a() {
        return (AbstractC1784f0) f15920b.get();
    }

    public final AbstractC1784f0 b() {
        ThreadLocal threadLocal = f15920b;
        AbstractC1784f0 abstractC1784f0 = (AbstractC1784f0) threadLocal.get();
        if (abstractC1784f0 != null) {
            return abstractC1784f0;
        }
        AbstractC1784f0 abstractC1784f0A = AbstractC1790i0.a();
        threadLocal.set(abstractC1784f0A);
        return abstractC1784f0A;
    }

    public final void c() {
        f15920b.set(null);
    }

    public final void d(AbstractC1784f0 abstractC1784f0) {
        f15920b.set(abstractC1784f0);
    }
}
