package p211y4;

import R4.l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class S implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f38323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f38324b;

    public S(U u8, l lVar) {
        this.f38324b = u8;
        this.f38323a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U.R(this.f38324b, this.f38323a);
    }
}
