package p024c5;

import p087j5.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f16243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f16244b;

    public k(A a8, b bVar) {
        this.f16243a = a8;
        this.f16244b = bVar;
    }

    public static Runnable a(A a8, b bVar) {
        return new k(a8, bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f16243a.d(this.f16244b);
    }
}
