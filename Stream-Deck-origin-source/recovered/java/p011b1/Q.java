package p011b1;

import C6.G;
import Q6.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Q implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public J f15704a;

    public void b(boolean z8) {
        J j8 = this.f15704a;
        if (j8 == null) {
            return;
        }
        j8.r(z8);
    }

    public final void c(J j8) {
        this.f15704a = j8;
    }

    @Override // Q6.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Boolean) obj).booleanValue());
        return G.f1419a;
    }
}
