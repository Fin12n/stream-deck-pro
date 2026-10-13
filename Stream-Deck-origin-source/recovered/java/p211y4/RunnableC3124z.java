package p211y4;

/* JADX INFO: renamed from: y4.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3124z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f38430a;

    public RunnableC3124z(A a8) {
        this.f38430a = a8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B b8 = this.f38430a.f38277a;
        b8.f38279b.f(b8.f38279b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
