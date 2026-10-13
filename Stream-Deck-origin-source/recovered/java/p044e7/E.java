package p044e7;

import p053f7.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class E extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f20918a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public G6.d f20919b;

    @Override // p053f7.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(C c8) {
        if (this.f20918a >= 0) {
            return false;
        }
        this.f20918a = c8.X();
        return true;
    }

    @Override // p053f7.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public G6.d[] b(C c8) {
        long j8 = this.f20918a;
        this.f20918a = -1L;
        this.f20919b = null;
        return c8.W(j8);
    }
}
